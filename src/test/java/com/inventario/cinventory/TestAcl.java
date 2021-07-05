package com.inventario.cinventory;

import com.inventario.cinventory.model.Acl;
import com.inventario.cinventory.model.Business;
import com.inventario.cinventory.service.Implementation.IService;
import com.inventario.cinventory.service.Implementation.IServiceBus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
public class TestAcl {

    @Autowired
    private IService repo;

    @Test
    @Rollback(value = false)
    public void testCreateMember() {
        String fechaIngreso = "10/03/2020";
        LocalDate localDate1 = LocalDate.parse(fechaIngreso, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        String fechaTermino = "10/03/2022";
        LocalDate localDate2 = LocalDate.parse(fechaTermino, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Acl _acl = new Acl(27,"99.999.999-9","Test ACL","Gringo","TestAcl@acl.cl",localDate1,localDate2,"AclTest");
        Acl savedMember = repo.save(_acl);

        assertNotNull(savedMember);
    }

    @Test
    @Rollback(value = false)
    public void testUpdateMembers(){
        String fechaIngreso = "10/03/2021";
        LocalDate localDate1 = LocalDate.parse(fechaIngreso, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String fechaTermino = "10/03/2026";
        LocalDate localDate2 = LocalDate.parse(fechaTermino, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String rutificador = "20.000.000-0";
        String nombreEmpleado = "Test ACL Update";
        String nacionalidad = "Aleman";
        String nombreEmpresa = "AclTestV2";
        Acl _acl = new Acl(27,rutificador,nombreEmpleado,nacionalidad,"TestAcl@acl.cl",localDate1,localDate2,nombreEmpresa);
        Acl savedMember = repo.save(_acl);

        assertNotNull(savedMember);
    }

    @Test
    @Rollback(value = false)
    public void testListMembers()
    {
        List<Acl> _acl =(List<Acl>) repo.findAll();
        for (Acl acl : _acl){
            System.out.println(acl);
        };
    }

    @Test
    @Rollback(value = false)
    public void testDeleteBusiness(){
        Integer id = 27;
        boolean isExistBeforeDelete = repo.findById(id).isPresent();
        repo.deleteById(id);
        boolean notExistAfterDelete = repo.findById(id).isPresent();

        assertTrue(isExistBeforeDelete);
        assertFalse(notExistAfterDelete);

    }




}

