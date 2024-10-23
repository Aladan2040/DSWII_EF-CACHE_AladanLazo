package com.cibertec.DSWII_EF_CACHE_AladanLazo.repository;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    // Método para obtener proveedores por contacto
    @Query(value = "SELECT * FROM proveedores WHERE contacto LIKE %:contacto%", nativeQuery = true)
    List<Proveedor> obtenerProveedoresPorContacto(@Param("contacto") String contacto);
}
