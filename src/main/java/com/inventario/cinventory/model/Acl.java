package com.inventario.cinventory.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@Entity
@Table(name = "ACL")
@JsonPropertyOrder({"id", "rutificador", "nombreEmpleado","nacionalidad","correoElectronico"})

public class Acl {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    @JsonProperty("id")
    private int id;

    @Column(name = "rutificador")
    @JsonProperty("rutificador")
    private String rutificador;

    @Column(name= "nombreEmpleado")
    @JsonProperty("nombreEmpleado")
    private String nombreEmpleado;

    @Column(name= "nacionalidad")
    @JsonProperty("nacionalidad")
    private String nacionalidad;


    @Column(name= "correoElectronico")
    @JsonProperty("correoElectronico")
    private String correoElectronico;

    @Column(name= "idEmpresa")
    @JsonProperty("idEmpresa")
    private int idEmpresa;



    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getRutificador() { return rutificador; }

    public void setRutificador(String rutificador) { this.rutificador = rutificador; }

    public String getNombreEmpleado() { return nombreEmpleado; }

    public void setNombreEmpleado(String nombreEmpleado) { this.nombreEmpleado = nombreEmpleado; }

    public String getNacionalidad() {return nacionalidad; }

    public void setNacionalidad(String nacionalidad) {this.nacionalidad = nacionalidad; }

    public String getCorreoElectronico() { return correoElectronico; }

    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public int getIdEmpresa() {return idEmpresa; }

    public void setIdEmpresa(int idEmpresa) {this.idEmpresa = idEmpresa; }

    public Acl(String rutificador, String nombreEmpleado, String nacionalidad, String correoElectronico, int idEmpresa) {
        this.id = id;
        this.rutificador = rutificador;
        this.nombreEmpleado = nombreEmpleado;
        this.nacionalidad = nacionalidad;
        this.correoElectronico = correoElectronico;
        this.idEmpresa = idEmpresa;
    }

    public Acl(){ }
}


