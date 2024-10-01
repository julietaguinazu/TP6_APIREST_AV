package com.example.persona.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name="libro")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Audited

public class Libro extends Base{
    @Column(name="titulo")
    private String titulo;
    @Column(name="fecha")
    private int fecha;
    @Column(name="genero")
    private String genero;
    @Column(name="paginas")
    private int paginas;

    //RELACION DE LIBRO CON AUTOR
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;

}
