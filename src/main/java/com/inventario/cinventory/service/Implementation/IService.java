package com.inventario.cinventory.service.Implementation;

import com.inventario.cinventory.model.Acl;
import com.inventario.cinventory.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IService extends JpaRepository<Acl, Integer> {

    List <Acl> findByNombreEmpleadoContaining(String empleado);



}
