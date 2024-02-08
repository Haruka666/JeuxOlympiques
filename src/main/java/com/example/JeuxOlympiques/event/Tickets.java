package com.example.JeuxOlympiques.event;

import com.example.JeuxOlympiques.users.Users;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "events_id")
    private Events events;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;
}
