package com.opstic.learnsb.service;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opstic.learnsb.model.JournalEntry;
import com.opstic.learnsb.repository.JournalRepository;

@Service
public class JournalService {
	
	@Autowired
	JournalRepository journalRepo;
	
	public List<JournalEntry> getAllEntry(){
		return journalRepo.findAll();
	}
	
	public Boolean addEntry(JournalEntry entry) {
		entry.setDate(LocalDateTime.now());
		journalRepo.save(entry);
		return true;
	}
	
	public JournalEntry getById(ObjectId id) {
		return journalRepo.findById(id).orElse(null);
	}
	
	public Boolean updateEntry(ObjectId id ,JournalEntry newEntry) {
		JournalEntry oldEntry = getById(id);
		if (oldEntry != null) {
			oldEntry.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : oldEntry.getTitle());
			oldEntry.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : oldEntry.getContent());
			return true;
		}
		return false;
	}
	
	public Boolean delEntry(ObjectId id) {
		journalRepo.deleteById(id);
		return true;
	}

}
