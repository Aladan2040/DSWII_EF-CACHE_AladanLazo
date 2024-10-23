package com.cibertec.DSWII_EF_CACHE_AladanLazo.repository;

import com.cibertec.DSWII_EF_CACHE_AladanLazo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository extends JpaRepository <Producto, Long> {

    // Método para obtener productos por tipo
    @Query(value = "SELECT * FROM productos WHERE tipo = :tipo", nativeQuery = true)
    List<Producto> obtenerProductosPorTipo(@Param("tipo") String tipo);
}
