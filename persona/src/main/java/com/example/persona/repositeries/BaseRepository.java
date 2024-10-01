package com.example.persona.repositeries;

import com.example.persona.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean//va a ser que de esta interface no se puedan crear instancias

public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository <E,ID>{



}
