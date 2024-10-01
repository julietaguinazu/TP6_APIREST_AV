package com.example.persona.services;

import com.example.persona.entities.Autor;
import com.example.persona.repositeries.AutorRepositery;
import com.example.persona.repositeries.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{

    @Autowired
    private AutorRepositery autorRepositery;
 public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository){
     super(baseRepository);
 }
}
