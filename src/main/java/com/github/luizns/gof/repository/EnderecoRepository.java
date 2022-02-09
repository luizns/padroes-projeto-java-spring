package com.github.luizns.gof.repository;

import com.github.luizns.gof.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
