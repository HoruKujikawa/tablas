package com.bling3.APPbling3.services.imp;

import com.bling3.APPbling3.entities.Marca;
import com.bling3.APPbling3.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> obtenerTodasLasMarcas() {
        return marcaRepository.findAll();
    }

    public Optional<Marca> obtenerMarcaPorId(Long id) {
        return marcaRepository.findById(id);
    }

    public Marca guardarMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public void eliminarMarca(Long id) {
        marcaRepository.deleteById(id);
    }
}
