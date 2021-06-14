package com.inventario.cinventory.service;

import com.inventario.cinventory.model.Acl;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
public class ServiceAcl {

//terminar metodo para generar folder de un request y response con los parametros.
    private void FolderJson(Acl request, Acl response) {
        try {
            Path file = Paths.get("FolderJson").toAbsolutePath().normalize();
            Files.createDirectories(file);


            Path targetRequest = file.resolve("request.json");
            FileOutputStream streamRequest = new FileOutputStream(targetRequest.toString());
            streamRequest.close();

            Path targetResponse = file.resolve("response.json");
            FileOutputStream streamResponse = new FileOutputStream(targetResponse.toString());
            streamResponse.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
