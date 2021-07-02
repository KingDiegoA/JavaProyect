package com.inventario.cinventory;

import com.inventario.cinventory.model.Business;
import com.inventario.cinventory.service.Implementation.IServiceBus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class CInventoryApplicationTests {

    @Autowired
    private IServiceBus repo;

    @Test
    void contextLoads() {
    }

    @Test
    @Rollback(value = false)
    public void testCreateMember() {
        Business bus = new Business(999,"Naruto");
        Business savedMember = repo.save(bus);

        assertNotNull(savedMember);
    }

//    @Test
//    public void testFindBusinessNameExist() {
//        String nombreEmpresa = "NarniaMan";
//        Business business = repo.findByName(nombreEmpresa);
//
//        assertThat(business.getNombreEmpresa()).isEqualTo(nombreEmpresa);
//
//    }

//    @Test
//    public void testFindBusinessNameNotExist() {
//        String nombreEmpresa = "Naruto";
//        Business business = repo.findByName(nombreEmpresa);
//
//        assertNull(business);
//
//    }

//    @Test
//    @Rollback(value = false)
//    public void testUpdateBusiness() {
//        String nombreEmpresa = "NarniaWoman";
//        Business business = new Business(2025, nombreEmpresa);
//        business.setIdEmpresa(1);
//        repo.save(business);
//
//        Business updateBusiness = repo.findByName(nombreEmpresa);
//        assertThat(updateBusiness.getNombreEmpresa()).isEqualTo(nombreEmpresa);
//
//    }

    @Test
    @Rollback(value = false)
    public void testDeleteBusiness(){
        Integer idEmpresa = 999;
        boolean isExistBeforeDelete = repo.findById(idEmpresa).isPresent();
        repo.deleteById(idEmpresa);
        boolean notExistAfterDelete = repo.findById(idEmpresa).isPresent();

        assertTrue(isExistBeforeDelete);
        assertFalse(notExistAfterDelete);

    }

}
