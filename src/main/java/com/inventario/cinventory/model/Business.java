package com.inventario.cinventory.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Empresa")
@JsonPropertyOrder({"idEmpresa", "nombreEmpresa", "fechaIngreso","fechaTermino"})
public class Business {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEmpresa")
    @JsonProperty("idEmpresa")
    private int idEmpresa;

    @Column(name = "nombreEmpresa")
    @JsonProperty("nombreEmpresa")
    private String nombreEmpresa;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name= "fechaIngreso")
    @JsonProperty("fechaIngreso")
    private LocalDate fechaIngreso;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyy")
    @Column(name= "fechaTermino")
    @JsonProperty("fechaTermino")
    private LocalDate  fechaTermino;

    public int getIdEmpresa() {return idEmpresa; }

    public void setIdEmpresa(int idEmpresa) {this.idEmpresa = idEmpresa; }

    public String getNombreEmpresa() {return nombreEmpresa; }

    public void setNombreEmpresa(String nombreEmpresa) {this.nombreEmpresa = nombreEmpresa; }

    public LocalDate getFechaIngreso() {return fechaIngreso; }

    public void setFechaIngreso(LocalDate fechaIngreso) {this.fechaIngreso = fechaIngreso; }

    public LocalDate getFechaTermino() {return fechaTermino; }

    public void setFechaTermino(LocalDate fechaTermino) {this.fechaTermino = fechaTermino; }

    public Business(int idEmpresa, String nombreEmpresa, LocalDate fechaIngreso, LocalDate fechaTermino) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaIngreso = fechaIngreso;
        this.fechaTermino = fechaTermino;
    }
    public Business(){ }
}
