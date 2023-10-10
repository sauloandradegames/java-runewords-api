package edu.sauloandrade.runewordsapi.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_equipment")
public class Equipment {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Getters
    public Long getId() {return id;}
    public String getName() {return name;}

    // Setters
    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
}
