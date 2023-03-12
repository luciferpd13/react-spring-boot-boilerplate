package com.assignment.notes.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.assignment.notes.model.Notes;
import com.assignment.notes.repository.NotesRepository;

@Service
@Transactional
public class NotesService {

    @Autowired
    NotesRepository notesRepository;

    public List<Notes> get() {
        List<Notes> notes = new ArrayList<Notes>();
        notesRepository.findAll().forEach(notes::add);
        return notes;
    }

}