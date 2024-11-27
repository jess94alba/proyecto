package com.proyecto.proyecto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto.models.Producto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/producto")

public class ProductoController {
    private List<Producto> productos = new ArrayList<>(
        Arrays.asList(new Producto(1234, 2, "lenovo", "24367", 1000000))
    );

    @GetMapping("productos")
    public List<Producto> getProductos() {
        return productos;
    }

    @GetMapping("producto/{marca}")
    public Producto getProducto(@PathVariable String marca) {
        for (Producto c : productos){
            if (c.getMarca().equalsIgnoreCase(marca)){
                return c;
            }
        }
        return null;
    }

    @PostMapping("producto")
    public Producto posProducto(@RequestBody Producto producto) {
        productos.add(producto);
        
        return producto;
    }

    @PutMapping("producto")
    public Producto putProducto(@RequestBody Producto producto) {
        for( Producto c : productos){
            if(c.getIdPro() == producto.getIdPro()){
                c.setCantidad(producto.getCantidad());
                c.setMarca(producto.getMarca());
                c.setSn(producto.getSn());
                c.setPrecio(producto.getPrecio());
                return c;
            }
        }        
        return null;
    }

    @DeleteMapping("producto/{idPro}")
    public Producto deleteProducto (@PathVariable int idPro){
        for(Producto c : productos){
            if (c.getIdPro() == idPro){
                productos.remove(c);
                return c;
            }
        }
        return null;
    }
}
