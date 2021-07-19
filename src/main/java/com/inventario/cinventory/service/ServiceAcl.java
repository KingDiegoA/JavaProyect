package com.inventario.cinventory.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.inventario.cinventory.model.Acl;
import com.inventario.cinventory.service.Implementation.ImpService;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



@Service
public class ServiceAcl implements ImpService {

    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

    public ServiceAcl() throws IOException {
        Path storage = Paths.get("JsonResponse").toAbsolutePath().normalize();
        Files.createDirectories(storage);
    }

    @Override
    public Acl findDates(Acl input) {
        Acl _acl  = new Acl();

        _acl.setRutificador(input.getRutificador());
        _acl.setNombreEmpleado(input.getNombreEmpleado());
        _acl.setNacionalidad(input.getNacionalidad());
        _acl.setCorreoElectronico(input.getCorreoElectronico());
        _acl.setFechaIngreso(input.getFechaIngreso());
        _acl.setFechaTermino(input.getFechaTermino());
        _acl.setNombreEmpresa(input.getNombreEmpresa());

        FolderJson(input,_acl);
        return _acl;
    }

    private void FolderJson(Acl request, Acl response) {
        try {
            Path file = Paths.get("JsonResponse").toAbsolutePath().normalize();
            Files.createDirectories(file);


            Path targetRequest = file.resolve("request.json");
            FileOutputStream streamRequest = new FileOutputStream(targetRequest.toString());
            streamRequest.write(gson.toJson(request).getBytes());
            streamRequest.close();

            Path targetResponse = file.resolve("response.json");
            FileOutputStream streamResponse = new FileOutputStream(targetResponse.toString());
            streamResponse.write(gson.toJson(response).getBytes());
            streamResponse.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}
