package com.opstic.learnsb.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.opstic.learnsb.model.JournalEntry;

public interface JournalRepository extends MongoRepository<JournalEntry, ObjectId> {

}
