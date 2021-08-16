package com.ejercicio.prueba.service;

import com.ejercicio.prueba.model.Producto;
import com.ejercicio.prueba.model.mapear.Entrada;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface IProductoService {

    List<Producto> mostrarProducto();
    void cargaProducto(List<Producto> producto);
    void eliminarTodo();

    Entrada busquedaApi(String buscar) throws JsonProcessingException;
    List<Producto> creacionObjetoServicio(Entrada entrada );
}
