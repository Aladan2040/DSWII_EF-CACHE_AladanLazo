package com.cibertec.DSWII_EF_CACHE_AladanLazo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String contacto;
    private String direccion;
    private String telefono;
    private String email;

    // Getters y Setters
}