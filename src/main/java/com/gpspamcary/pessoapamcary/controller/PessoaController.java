package com.gpspamcary.pessoapamcary.controller;

import com.gpspamcary.pessoapamcary.model.Pessoa;
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
    public ResponseEntity<List<Pessoa>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<Pessoa> create(@RequestBody Pessoa pessoa){
        return new ResponseEntity(service.save(pessoa), HttpStatus.CREATED);
    }

}
