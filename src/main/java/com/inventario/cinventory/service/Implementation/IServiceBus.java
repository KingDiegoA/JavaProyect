package com.inventario.cinventory.service.Implementation;

import com.inventario.cinventory.model.Acl;
import com.inventario.cinventory.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IServiceBus extends JpaRepository<Business, Integer> {

    List<Business> findByIdEmpresaContaining(String empresa);


}
