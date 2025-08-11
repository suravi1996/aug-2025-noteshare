package com.notes.noteshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notes.noteshare.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
