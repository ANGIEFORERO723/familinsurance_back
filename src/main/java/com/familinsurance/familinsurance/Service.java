package com.familinsurance.familinsurance;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "tb_services")
public class Service implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    public Integer id;
    @Column(name = "Nombre")
    public String Nombre;
    @Column(name = "Descripcion")
    public String Descripcion;
    @Column(name = "Imagen")
    public String Imagen;
    @Column(name = "Categoria")
    public String Categoria;

}
