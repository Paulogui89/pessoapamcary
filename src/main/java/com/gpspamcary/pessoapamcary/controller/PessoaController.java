package com.gpspamcary.pessoapamcary.controller;

import com.gpspamcary.pessoapamcary.dto.PessoaDTO;
import com.gpspamcary.pessoapamcary.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService service;

    @GetMapping
    public ResponseEntity<List<PessoaDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<PessoaDTO> create(@RequestBody PessoaDTO pessoa){
        return new ResponseEntity(service.save(pessoa), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaDTO> read(@PathVariable Long id){
        return new ResponseEntity(service.findByID(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<PessoaDTO> update(@RequestBody PessoaDTO pessoa){
        return ResponseEntity.ok(service.save(pessoa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<PessoaDTO> findByCPF(@PathVariable String cpf){
        return new ResponseEntity(service.findByCPF(cpf), HttpStatus.OK);
    }
}
