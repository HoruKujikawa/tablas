package com.bling3.APPbling3.controller;

import com.bling3.APPbling3.entities.Marca;
import com.bling3.APPbling3.services.imp.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController  {
    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public List<Marca> obtenerTodasLasMarcas() {
        return marcaService.obtenerTodasLasMarcas();
    }

    @GetMapping("/{id}")
    public Marca obtenerMarcaPorId(@PathVariable Long id) {
        return marcaService.obtenerMarcaPorId(id).orElse(null);
    }

    @PostMapping
    public Marca guardarMarca(@RequestBody Marca marca) {
        return marcaService.guardarMarca(marca);
    }
    @DeleteMapping("/{id}")
    public void eliminarMarca(@PathVariable Long id) {
        marcaService.eliminarMarca(id);
    }
}
