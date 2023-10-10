package edu.sauloandrade.runewordsapi.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_attribute")
public class Attribute {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    // Getters
    public Long getId() {return id;}
    public String getDescription() {return description;}

    // Setters
    public void setId(Long id) {this.id = id;}
    public void setDescription(String description) {this.description = description;}
}
