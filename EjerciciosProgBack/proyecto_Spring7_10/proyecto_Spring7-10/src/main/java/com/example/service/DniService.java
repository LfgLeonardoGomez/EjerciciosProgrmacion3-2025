package com.example.service;

import java.util.List;

import com.example.entity.dto.dni.DniCreate;
import com.example.entity.dto.dni.DniDto;

public interface DniService {
public DniDto save (DniCreate d);
public DniDto edit(Long id, DniCreate d);
public DniDto findById(Long id);
public List<DniDto> findAll();
public void delete(Long id);
}
