package com.proyecto.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.proyecto.models.Productosql;
public interface ProductoRepository extends JpaRepository<Productosql, Integer> {

}
