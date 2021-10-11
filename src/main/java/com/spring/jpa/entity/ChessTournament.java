package com.spring.jpa.entity;

import com.spring.jpa.Event;
import com.spring.jpa.generator.EventCodeGenerator;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ChessTournament implements Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tournament_seq")
    @SequenceGenerator(name = "tournament_seq", sequenceName = "tournament_seq", initialValue = 100)
    private Long id;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    @GeneratorType(type = EventCodeGenerator.class, when = GenerationTime.INSERT)
    private String tournamentCode;

    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getTournamentCode() {
        return tournamentCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setTournamentCode(String tournamentCode) {
        this.tournamentCode = tournamentCode;
    }
}
