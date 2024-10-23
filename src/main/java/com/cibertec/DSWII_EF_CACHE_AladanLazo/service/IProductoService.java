package com.cibertec.DSWII_EF_CACHE_AladanLazo.service;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> obtenerProductosporTipo(String tipo);
}
