package com.inventario.cinventory.controller;

import com.inventario.cinventory.model.Acl;
import com.inventario.cinventory.service.Implementation.ImpService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}