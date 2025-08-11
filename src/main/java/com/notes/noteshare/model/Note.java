package com.notes.noteshare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Note {
    
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;
}
