package edu.sauloandrade.runewordsapi.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.sauloandrade.runewordsapi.domain.model.Runeword;
import edu.sauloandrade.runewordsapi.service.RunewordService;

@RestController
@RequestMapping("/rw")
public class RunewordController {
    private final RunewordService runewordService;

    public RunewordController(RunewordService runewordService) {
        this.runewordService = runewordService;
    }

    @GetMapping
    public ResponseEntity<List<Runeword>> findAll() {
        var runewords = runewordService.findAll();
        return ResponseEntity.ok(runewords);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Runeword> findById(@PathVariable Long id) {
        var runeword = runewordService.findById(id);
        return ResponseEntity.ok(runeword);
    }

    @PostMapping
    public ResponseEntity<Runeword> create(@RequestBody Runeword runewordToCreate) {
        var runewordCreated = runewordService.create(runewordToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(runewordCreated.getId()).toUri();
        return ResponseEntity.created(location).body(runewordCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Runeword> update(@PathVariable Long id, @RequestBody Runeword runewordToUpdate) {
        var runeword = runewordService.update(id, runewordToUpdate);
        return ResponseEntity.ok(runeword);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        runewordService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
