package com.example.demo;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface Girlexe extends JpaRepository<Girl,Integer> {

    <S extends Girl> Optional<S> findOne(Integer id);
}
