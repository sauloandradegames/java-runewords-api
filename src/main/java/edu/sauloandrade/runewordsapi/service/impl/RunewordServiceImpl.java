package edu.sauloandrade.runewordsapi.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import edu.sauloandrade.runewordsapi.domain.model.Runeword;
import edu.sauloandrade.runewordsapi.domain.repository.RunewordRepository;
import edu.sauloandrade.runewordsapi.service.RunewordService;

@Service
public class RunewordServiceImpl implements RunewordService{
    private final RunewordRepository runewordRepository;

    public RunewordServiceImpl(RunewordRepository runewordRepository) {
        this.runewordRepository = runewordRepository;
    }
    
    @Override
    public List<Runeword> findAll() {
        return runewordRepository.findAll();
    }

    @Override
    public Runeword findById(Long id) {
        return runewordRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Runeword create(Runeword runewordToCreate) {
        if (runewordRepository.existsByName(runewordToCreate.getName())) {
            throw new IllegalArgumentException("This Runeword name already exists.");
        }
        return runewordRepository.save(runewordToCreate);
    }

    @Override
    public Runeword update(Long id, Runeword runewordToUpdate) {
        Runeword dbRuneword = this.findById(id);
        if (dbRuneword == null) {
            throw new NoSuchElementException("Runeword ID not found");
        }

        dbRuneword.setName(runewordToUpdate.getName());
        dbRuneword.setRunes(runewordToUpdate.getRunes());
        dbRuneword.setEquipments(runewordToUpdate.getEquipments());
        dbRuneword.setLevel(runewordToUpdate.getLevel());
        dbRuneword.setAttributes(runewordToUpdate.getAttributes());

        return runewordRepository.save(dbRuneword);
    }

    @Override
    public void delete(Long id) {
        Runeword dbRuneword = this.findById(id);
        runewordRepository.delete(dbRuneword);
    }
}
