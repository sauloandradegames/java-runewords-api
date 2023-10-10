package edu.sauloandrade.runewordsapi.service;

import java.util.List;

import edu.sauloandrade.runewordsapi.domain.model.Runeword;

public interface RunewordService {
    List<Runeword> findAll();
    Runeword findById(Long id);
    Runeword create(Runeword runewordToCreate);
    Runeword update(Long id, Runeword runewordToUpdate);
    void delete(Long id);
}
