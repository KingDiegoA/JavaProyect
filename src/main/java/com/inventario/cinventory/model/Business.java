package com.inventario.cinventory.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@Entity
@Table(name = "Business")
@JsonPropertyOrder({"idEmpresa", "nombreEmpresa"})
public class Business {

    @Id
    @Column(name = "idEmpresa")
    @JsonProperty("idEmpresa")
    private int idEmpresa;

    @Column(name = "nombreEmpresa")
    @JsonProperty("nombreEmpresa")
    private String nombreEmpresa;



    public int getIdEmpresa() {return idEmpresa; }

    public void setIdEmpresa(int idEmpresa) {this.idEmpresa = idEmpresa; }

    public String getNombreEmpresa() {return nombreEmpresa; }

    public void setNombreEmpresa(String nombreEmpresa) {this.nombreEmpresa = nombreEmpresa; }



    public Business(int idEmpresa, String nombreEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;

    }
    public Business(){ }
}
