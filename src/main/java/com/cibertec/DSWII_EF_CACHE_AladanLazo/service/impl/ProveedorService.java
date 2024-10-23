package com.cibertec.DSWII_EF_CACHE_AladanLazo.service.impl;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Proveedor;
import com.cibertec.DSWII_EF_CACHE_AladanLazo.repository.ProveedorRepository;
import com.cibertec.DSWII_EF_CACHE_AladanLazo.service.IProveedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ProveedorService implements IProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Cacheable(value="proveedorContacto" ,key= "#contacto")
    @Override
    public List<Proveedor> obtenerProveedoresPorContacto(String contacto) {
        return proveedorRepository.obtenerProveedoresPorContacto(contacto);
    }
}
