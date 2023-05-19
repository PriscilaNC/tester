package com.Mezza.project.models;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminLoginDTO {
    private Long id;
    private String email;
    private String contrasena;
}
