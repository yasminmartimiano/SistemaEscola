package com.example.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.escola.model.AlunoModel;
import com.example.escola.service.AlunoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<AlunoModel> listarTodos() {
        return service.listarTodos();
    }
    

    /**
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<AlunoModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                     .map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public AlunoModel salvar(@RequestBody AlunoModel alunoModel) {
        return service.salvar(alunosModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoModel> atualizar(@PathVariable Long id, @RequestBody AlunoModel alunoModel) {
        if(!service.buscarPorId(id).isPresent()){
            return ResponseEntity.notFound().build();
        }
        alunoModel.setId(id);
        return ResponseEntity.ok(service.salvar(alunoModel));
    }
    
    //faltando put e delete
}
