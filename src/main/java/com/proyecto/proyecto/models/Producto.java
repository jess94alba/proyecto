package com.proyecto.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Producto {

    private Integer idPro;
    private Integer cantidad;
    private String nombre;
    private Double valor;

}
