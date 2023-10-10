package edu.sauloandrade.runewordsapi.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_rune")
public class Rune {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String name;

    // Getters
    public Long getId() {return id;}
    public String getIcon() {return icon;}
    public String getName() {return name;}

    // Setters
    public void setId(Long id) {this.id = id;}
    public void setIcon(String icon) {this.icon = icon;}
    public void setName(String name) {this.name = name;}
}