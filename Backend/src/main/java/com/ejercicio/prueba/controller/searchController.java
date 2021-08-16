package com.ejercicio.prueba.controller;

import com.ejercicio.prueba.model.Producto;
import com.ejercicio.prueba.model.mapear.Entrada;
import com.ejercicio.prueba.service.IProductoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/search")
public class searchController {

    @Autowired
    private IProductoService service;

    @GetMapping(value ="/{busqueda}", headers = "Accept=application/json")
    public ResponseEntity<List<Producto>> getProductos(@PathVariable("busqueda") String busqueda) throws JsonProcessingException {

        System.out.println("*****************************");
        System.out.println("Comenzando el proceso");
        //Eliminar Base anterior
        service.eliminarTodo();

        //Realizar la busqueda a la Api
        System.out.println("busqueda es: " + busqueda);
        Entrada entrada = service.busquedaApi(busqueda);

        //Creación del Objeto Para Enviar por servicio
        List<Producto> listaProducto = service.creacionObjetoServicio(entrada);

        //carga de elementos a la Base de Datos
        service.cargaProducto(listaProducto);
        System.out.println("Base de Datos Cargada con la busqueda y conexón de la Api");

        //Envío Servicio desde la base de Datos
        List<Producto> LProductos = service.mostrarProducto();
        System.out.println("Envío valores desde la Base de Datos");

        return new ResponseEntity<List<Producto>> (LProductos, HttpStatus.OK);
        }

    }



