package edu.sauloandrade.runewordsapi.domain.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Runeword {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private List<String> runes;
    private List<String> equipment;
    private Integer level;
    private List<String> attributes;

    // Getters
    public String getName() {return name;}
    public List<String> getRunes() {return runes;}
    public List<String> getEquipment() {return equipment;}
    public Integer getLevel() {return level;}
    public List<String> getAttributes() {return attributes;}

    // Setters
    public void setName(String name) {this.name = name;}
    public void setRunes(List<String> runes) {this.runes = runes;}
    public void setEquipment(List<String> equipment) {this.equipment = equipment;}
    public void setLevel(Integer level) {this.level = level;}
    public void setAttributes(List<String> attributes) {this.attributes = attributes;}
}
