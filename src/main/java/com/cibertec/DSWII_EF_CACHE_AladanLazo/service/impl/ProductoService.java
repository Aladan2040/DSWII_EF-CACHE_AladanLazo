package com.cibertec.DSWII_EF_CACHE_AladanLazo.service.impl;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Producto;
import com.cibertec.DSWII_EF_CACHE_AladanLazo.repository.ClienteRepository;
import com.cibertec.DSWII_EF_CACHE_AladanLazo.repository.ProductoRepository;
import com.cibertec.DSWII_EF_CACHE_AladanLazo.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductoService implements IProductoService {

    private final ProductoRepository productoRepository;

    @Cacheable(value="productoTipo" ,key= "#nombre")
    @Override
    public List<Producto> obtenerProductosporTipo(String tipo) {
        return List.of();
    }
}
