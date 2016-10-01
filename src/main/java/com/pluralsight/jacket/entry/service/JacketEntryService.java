package com.pluralsight.jacket.entry.service;

import java.util.List;

import com.pluralsight.jacket.entry.service.models.JacketEntry;

public interface JacketEntryService {

    List<JacketEntry> getAllEntries();
    void updateEntry(JacketEntry entry);
}
