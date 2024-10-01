package com.example.persona.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@Table(name="domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Audited
public class Domicilio extends Base{
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;

    //RELACION CON LA CLASE LOCALIDAD
    @ManyToOne(optional = false)// no puede ser nula es decir siempre que se cree domicilio se va a crear localidad
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
