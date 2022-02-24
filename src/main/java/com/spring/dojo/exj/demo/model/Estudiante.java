package com.spring.dojo.exj.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity()
@Table(name="estudiantes")
@Data
public class Estudiante {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String nombre;

    @Column
    String carrera;

}
