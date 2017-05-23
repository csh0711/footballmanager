package com.ka.entwicklertag.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    private String lastName;

    private String firstName;

    private String position;

    @ManyToOne
    private Club club;
}