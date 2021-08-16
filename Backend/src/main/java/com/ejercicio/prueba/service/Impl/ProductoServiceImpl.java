package com.ejercicio.prueba.service.Impl;

import com.ejercicio.prueba.model.Producto;
import com.ejercicio.prueba.model.mapear.Entrada;
import com.ejercicio.prueba.model.mapear.Results;
import com.ejercicio.prueba.repo.IProductoRepo;
import com.ejercicio.prueba.service.IProductoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    IProductoRepo repo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Producto> mostrarProducto() {
        return repo.findAll();
    }

    @Override
    public void cargaProducto(List<Producto> listProducto) {
        repo.saveAll(listProducto);
    }

    @Override
    public void eliminarTodo() {
        System.out.println("Eliminando La Base de Datos Anterior");
        repo.deleteAll();
    }

    @Override
    public Entrada busquedaApi(String buscar) throws JsonProcessingException {
        String URL = "https://api.mercadolibre.com/sites/MLA/search?q=" + buscar;

        System.out.println("La URL es: " + URL);
        ResponseEntity<Object> response = restTemplate.getForEntity(URL, Object.class);

        //Mapear el Objeto
        ObjectMapper mapper = new ObjectMapper();
        String entrada = mapper.writeValueAsString(response.getBody());

        Entrada entrada2  = mapper.readValue(entrada, new TypeReference<Entrada>() {});

        System.out.println("objeto  Mapeado" );
        return entrada2;
    }

    @Override
    public List<Producto> creacionObjetoServicio(Entrada entrada ) {
        List<Results> resultados = new ArrayList<Results>();
        resultados = (List<Results>) entrada.getResults();
        System.out.println("Resultados Encontrados " );

        List<Producto> listaProducto =  new ArrayList<Producto>();

        for (int i=0;i<resultados.size();i++) {
            Results results = resultados.get(i);
            //System.out.println(resultados.get(i).toString());
            Producto p = new Producto();
            p.setId(results.getId());
            p.setCondicion(results.getCondition());
            p.setTitulo(results.getTitle());
            p.setPrecio(results.getPrice() + "  ("+ results.getCurrency_id()+")" );
            p.setCantidadDisponible(results.getAvailable_quantity());
            p.setMiniatura(results.getThumbnail());
            listaProducto.add(p);
        }
        return listaProducto;
    }

}
