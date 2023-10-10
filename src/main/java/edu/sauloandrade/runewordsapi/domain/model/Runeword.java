package edu.sauloandrade.runewordsapi.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_runeword")
public class Runeword {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Rune> runes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Equipment> equipments;

    private Integer level;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Attribute> attributes;

    // Getters
    public Long getId() {return id;}
    public String getName() {return name;}
    public List<Rune> getRunes() {return runes;}
    public List<Equipment> getEquipments() {return equipments;}
    public Integer getLevel() {return level;}
    public List<Attribute> getAttributes() {return attributes;}

    // Setters
    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setRunes(List<Rune> runes) {this.runes = runes;}
    public void setEquipments(List<Equipment> equipments) {this.equipments = equipments;}
    public void setLevel(Integer level) {this.level = level;}
    public void setAttributes(List<Attribute> attributes) {this.attributes = attributes;}
}
