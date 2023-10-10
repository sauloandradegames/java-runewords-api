package edu.sauloandrade.runewordsapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sauloandrade.runewordsapi.domain.model.Runeword;

public interface RunewordRepository extends JpaRepository<Runeword, Long>{
    boolean existsByName(String runewordName);
}
