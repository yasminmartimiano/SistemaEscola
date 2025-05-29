package com.example.escola.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.escola.model.AlunoModel;
import com.example.escola.repository.AlunoRepository;


@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    //PUT /alunos/{id} → atualizar os dados de um aluno.
    //delete/ alunos deletar um aluno.
    
    public List<AlunoModel> listarTodos() {
        return repository.findAll();
    }

    /**
     * @param id
     * @return
     */
    public Optional<AlunoModel> buscarPorId(Long id){
        return repository.findById(id);
    }

    /**
     * @param alunoModel
     * @return
     */
        public AlunoModel salvar(AlunoModel alunoModel){
    return repository.save(alunoModel);
    }

    /**
     * @param id
     */
    public void deletar(Long id){
        repository.deleteById(id);
    }
}
