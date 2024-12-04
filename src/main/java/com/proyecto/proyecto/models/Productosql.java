package com.proyecto.proyecto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table (name = "producto")
public class Productosql {
    @Id
    private Integer id_pro;
    private String nompro;
    private Integer valor;

}
