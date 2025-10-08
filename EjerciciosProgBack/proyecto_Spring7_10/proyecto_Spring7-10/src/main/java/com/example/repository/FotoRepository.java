package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Foto;

@Repository
public interface FotoRepository extends JpaRepository<Foto, Long> {





}
