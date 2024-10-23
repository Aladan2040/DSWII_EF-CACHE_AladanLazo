package com.cibertec.DSWII_EF_CACHE_AladanLazo.repository;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

    // Método para obtener clientes por nombre
    @Query(value = "SELECT * FROM clientes WHERE nombre LIKE %:nombre%", nativeQuery = true)
    List<Cliente> obtenerClientesPorNombre(@Param("nombre") String nombre);
}
