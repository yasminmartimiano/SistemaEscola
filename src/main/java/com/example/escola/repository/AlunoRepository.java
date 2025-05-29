package com.example.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.escola.model.AlunoModel;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{

}
