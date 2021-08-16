package com.ejercicio.prueba.repo;

import com.ejercicio.prueba.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepo  extends JpaRepository<Producto, String> {

}
