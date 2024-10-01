package com.example.persona.services;

import com.example.persona.entities.Localidad;
import com.example.persona.repositeries.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository){
        super(baseRepository);
    }
}
