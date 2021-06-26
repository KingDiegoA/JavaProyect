package com.inventario.cinventory.controller;

import com.inventario.cinventory.exception.ApiRequestException;
import com.inventario.cinventory.model.Acl;
import com.inventario.cinventory.service.Implementation.IService;
import com.inventario.cinventory.service.Implementation.ImpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/acl")
@RestController
public class Control {
    private final ImpService impService;

    public Control(ImpService impService) {
        this.impService = impService;

    }

    @PostMapping("/challenger")

    public Acl challenger(@RequestBody Acl model){ //

        return impService.findDates(model);

    }

    @GetMapping("/2")
    public List<Acl> getAllMembers(){
        throw new ApiRequestException("No se encontraron miembros con Exception");

    }


}