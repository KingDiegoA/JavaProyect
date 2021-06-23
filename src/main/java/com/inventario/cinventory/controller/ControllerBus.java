package com.inventario.cinventory.controller;


import com.inventario.cinventory.model.Acl;
import com.inventario.cinventory.model.Business;
import com.inventario.cinventory.service.Implementation.IService;
import com.inventario.cinventory.service.Implementation.IServiceBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/acl")
public class ControllerBus {

    @Autowired
    IServiceBus crud;

    @GetMapping("/business")
    public ResponseEntity<List<Business>>obtainAllMembers(){
        try{
            List<Business> empresa = new ArrayList<Business>();
            crud.findAll().forEach(empresa::add);
            if (empresa.isEmpty()){
                return new ResponseEntity<>(empresa, HttpStatus.NO_CONTENT);
            } return new ResponseEntity<>(empresa, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }





}
