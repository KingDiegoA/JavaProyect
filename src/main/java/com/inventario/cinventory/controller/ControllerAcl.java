package com.inventario.cinventory.controller;

import com.inventario.cinventory.model.Acl;
import com.inventario.cinventory.service.Implementation.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acl")
public class ControllerAcl {
    @Autowired
    IService crud;
    //METODO QUE PERMITE LISTAR LOS MIEMBROS MEDIANTE LA BUSQUEDA DE SU ID - SE PODRA CAMBIAR POR SU RUT
    @GetMapping("/members/{id}")
    public ResponseEntity<Acl> obtainMember(@PathVariable("id")Integer id){
        Optional<Acl> aclDate = crud.findById(id);
        if(aclDate.isPresent()){
            return new ResponseEntity<>(aclDate.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    //METODO QUE MUESTRA TODOS LOS MIEMBROS YA CREADOS
    @GetMapping("/members")
    public ResponseEntity<List<Acl>>obtainAllMembers(){
        try{
            List<Acl> members = new ArrayList<Acl>();
            crud.findAll().forEach(members::add);
            if (members.isEmpty()){
                return new ResponseEntity<>(members, HttpStatus.NO_CONTENT);
            } return new ResponseEntity<>(members, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //METODO QUE PERMITE BUSCAR MIEMBROS POR SU NOMBRE
    @GetMapping("/search")
    public ResponseEntity<List<Acl>> searchMembers (@RequestParam(required = false)String nombreEmpleado){
        try{
            List<Acl>members= new ArrayList<Acl>();
            crud.findByNombreEmpleadoContaining(nombreEmpleado).forEach(members::add);
            if (members.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }return new ResponseEntity<>(members, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/searchByProyect")
    public ResponseEntity<List<Acl>> searchByProyect (@RequestParam(required = false) String nombreEmpleado){
        try{
            List<Acl>proyect= new ArrayList<Acl>();
            crud.findByNombreEmpleadoContaining(nombreEmpleado).forEach(proyect::add);
            if (proyect.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }return new ResponseEntity<>(proyect, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //METODO QUE PERMITE CREAR UN MIEMBRO NUEVO EN ACL
    @PostMapping("/newMember")
    public ResponseEntity<Acl> createNewMember (@RequestBody Acl newMember){
        try{
            Acl _acl = crud.save(new Acl(newMember.getRutificador(), newMember.getNombreEmpleado(),newMember.getNacionalidad(),newMember.getCorreoElectronico(),newMember.getFechaIngreso(),newMember.getFechaTermino(), newMember.getIdEmpresa()));
            return new ResponseEntity<>(_acl, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //METODO QUE PERMITE MODIFICAR UN MIEMBRO MEDIANTE SU ID
    @PutMapping("/update/{id}")
    public ResponseEntity<Acl> updateMember (@PathVariable("id")Integer id, @RequestBody Acl updateMember){
        try {
            Optional<Acl> memberDate = crud.findById(id);
            if (memberDate.isPresent()){
                Acl _acl = memberDate.get();
                _acl.setRutificador(updateMember.getRutificador());
                _acl.setNombreEmpleado(updateMember.getNombreEmpleado());
                _acl.setNacionalidad(updateMember.getNacionalidad());
                _acl.setCorreoElectronico(updateMember.getCorreoElectronico());
                _acl.setFechaIngreso(updateMember.getFechaIngreso());
                _acl.setFechaTermino(updateMember.getFechaTermino());
                _acl.setIdEmpresa(updateMember.getIdEmpresa());
                return new ResponseEntity<>(crud.save(_acl),HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //METODO QUE PERMITE ELIMINAR MIEMBRO MEDIANTE SU ID
    @DeleteMapping("/deleteMember/{id}")
    public ResponseEntity<HttpStatus> deleteMember (@PathVariable("id")Integer id){
        try{
            crud.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //METODO QUE PERMITE ELIMINAR MIEMBROS EN GENERAL
    @DeleteMapping("/deleteMembers")
    public ResponseEntity<HttpStatus> deleteAllMembers (){
        try{
            crud.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
