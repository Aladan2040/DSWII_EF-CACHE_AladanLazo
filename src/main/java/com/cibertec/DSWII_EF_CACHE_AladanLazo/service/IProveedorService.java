package com.cibertec.DSWII_EF_CACHE_AladanLazo.service;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Producto;
import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Proveedor;

import java.util.List;

public interface IProveedorService {

    List<Proveedor> obtenerProveedoresPorContacto(String contacto);
}
