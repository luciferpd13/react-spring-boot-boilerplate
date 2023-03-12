package com.assignment.notes.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.notes.model.Notes;
import com.assignment.notes.service.NotesService;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/api")
public class NotesController {

    @Autowired
    NotesService notesService;

    @GetMapping("/notes")
    public ResponseEntity<List<Notes>> get() {
        try {
            List<Notes> notes = notesService.get();
            return new ResponseEntity<>(notes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}