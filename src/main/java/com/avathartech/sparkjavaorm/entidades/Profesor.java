package com.avathartech.sparkjavaorm.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by vacax on 03/06/16.
 */
@Entity
public class Profesor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    //Indicando las referencias bidireccional de la entidad Clase.
    @OneToMany(mappedBy = "profesor") // La clase Clase es la dueña de la relación.
    private Set<Clase> listaClases;


    public Profesor(){

    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
