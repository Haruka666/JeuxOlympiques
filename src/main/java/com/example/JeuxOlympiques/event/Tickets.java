package com.example.JeuxOlympiques.event;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Tickets {
    private Integer id;
    private String name;
    private Date date;
}
