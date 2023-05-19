package com.Mezza.project.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Administrador {

    @Id
    private Long id;

    @Column (name="email", nullable = false)
    private String email;

    @Column (name = "nombre", nullable = false)
    private String contrasena;


    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

}
