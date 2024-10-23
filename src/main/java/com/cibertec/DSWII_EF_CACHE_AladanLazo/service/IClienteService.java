package com.cibertec.DSWII_EF_CACHE_AladanLazo.service;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> obtenerCLientesPorNombre(String nombre);
}
