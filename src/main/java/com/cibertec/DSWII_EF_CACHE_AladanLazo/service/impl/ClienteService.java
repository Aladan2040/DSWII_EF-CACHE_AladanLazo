package com.cibertec.DSWII_EF_CACHE_AladanLazo.service.impl;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Cliente;
import com.cibertec.DSWII_EF_CACHE_AladanLazo.repository.ClienteRepository;
import com.cibertec.DSWII_EF_CACHE_AladanLazo.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Cacheable(value="clienteNombre" ,key= "#nombre")
    @Override
    public List<Cliente> obtenerCLientesPorNombre(String nombre) {
        return clienteRepository.obtenerClientesPorNombre(nombre);
    }
}
