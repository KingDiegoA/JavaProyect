package com.inventario.cinventory.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Members")
@JsonPropertyOrder({"id", "rutificador", "nombreEmpleado","nacionalidad","correoElectronico","fechaIngreso","fechaTermino", "nombreEmpresa"})

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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name= "fechaIngreso")
    @JsonProperty("fechaIngreso")
    private LocalDate fechaIngreso;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyy")
    @Column(name= "fechaTermino")
    @JsonProperty("fechaTermino")
    private LocalDate  fechaTermino;

    @Column(name= "nombreEmpresa")
    @JsonProperty("nombreEmpresa")
    private String nombreEmpresa;

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

    public String getNombreEmpresa() {return nombreEmpresa; }

    public void setNombreEmpresa(String idEmpresa) {this.nombreEmpresa = idEmpresa; }

    public LocalDate getFechaIngreso() {return fechaIngreso; }

    public void setFechaIngreso(LocalDate fechaIngreso) {this.fechaIngreso = fechaIngreso; }

    public LocalDate getFechaTermino() {return fechaTermino; }

    public void setFechaTermino(LocalDate fechaTermino) {this.fechaTermino = fechaTermino; }

    public Acl(String rutificador, String nombreEmpleado, String nacionalidad, String correoElectronico, LocalDate fechaIngreso, LocalDate fechaTermino, String nombreEmpresa) {
        this.id = id;
        this.rutificador = rutificador;
        this.nombreEmpleado = nombreEmpleado;
        this.nacionalidad = nacionalidad;
        this.correoElectronico = correoElectronico;
        this.fechaIngreso = fechaIngreso;
        this.fechaTermino = fechaTermino;
        this.nombreEmpresa = nombreEmpresa;
    }

    public Acl(){ }

    public void roll(int i) {

    }

    public int resultado() {
        return id;
    }

    public String resultado2() {
        return "ACL";
    }
}


