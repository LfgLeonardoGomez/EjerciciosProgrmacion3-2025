package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.DniRepository;

@Service
public class DniServiceImp extends DniService{
@Autowired
DniRepository dniRepository;

}
