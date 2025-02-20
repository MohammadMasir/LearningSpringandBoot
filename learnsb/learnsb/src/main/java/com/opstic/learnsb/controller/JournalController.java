package com.opstic.learnsb.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opstic.learnsb.model.JournalEntry;
import com.opstic.learnsb.service.JournalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/journal")
public class JournalController {
	
	@Autowired
	JournalService journalService;
//	public JournalController(JournalService journalservice) {
//		journalservice = this.journalService;
//	}

	@GetMapping("/entries")
	public List<JournalEntry> getAllEntry() {
		return journalService.getAllEntry();
	}
	
	@PostMapping("/new_entry")
	public Boolean newEntry(@RequestBody JournalEntry entry) {
		return journalService.addEntry(entry);
	}
	
	@GetMapping("/entry/{id}")
	public JournalEntry entryById(@PathVariable ObjectId id) {
		return journalService.getById(id);
	}
	
	@PutMapping("/entry/{id}")
	public Boolean updateEntry(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry) {
		return journalService.updateEntry(id,newEntry);
	}
	
	@DeleteMapping("/entry/{id}")
	public Boolean deleteEntry(@PathVariable ObjectId id) {
		return journalService.delEntry(id);
	}	
	
	
}
