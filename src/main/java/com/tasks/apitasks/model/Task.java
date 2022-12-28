package com.tasks.apitasks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    private Date creation_date;
    private Date completion_date;
    private boolean completed;
    @Column(nullable = false)
    private String status;

}
