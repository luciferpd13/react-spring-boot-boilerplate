package com.assignment.notes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.notes.model.Notes;

public interface NotesRepository extends JpaRepository<Notes, Long> {

}