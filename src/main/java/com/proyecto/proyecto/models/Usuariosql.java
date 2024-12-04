package com.proyecto.proyecto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "usuarios")
public class Usuariosql {
    @Id
    private Integer id_cli;
    @Column(name = "name")
    private String nombres;

    private String apellido;

    private byte id_ciudad;
}
