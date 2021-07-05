package com.inventario.cinventory;

import com.inventario.cinventory.model.Business;
import com.inventario.cinventory.service.Implementation.IServiceBus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
public class TestBusiness {

    @Autowired
    private IServiceBus repo;

    @Test
    @Rollback(value = false)
    public void testCreateBusiness() {
        Business bus = new Business(9999,"Nicanor");
        Business savedMember = repo.save(bus);

        assertNotNull(savedMember);
    }



    @Test
    @Rollback(value = false)
    public void testUpdateBusiness(){
        String nombreEmpresa = "NarniaWoman";
        Business bus = new Business(9999,nombreEmpresa);
        Business savedMember = repo.save(bus);

        assertNotNull(savedMember);
    }

    @Test
    @Rollback(value = false)
    public void testListBusiness()
    {
        List<Business> bus =(List<Business>) repo.findAll();
        for (Business business : bus){
            System.out.println(business);
        };
    }
    @Test
    @Rollback(value = false)
    public void testDeleteBusiness(){
        Integer idEmpresa = 9999;
        boolean isExistBeforeDelete = repo.findById(idEmpresa).isPresent();
        repo.deleteById(idEmpresa);
        boolean notExistAfterDelete = repo.findById(idEmpresa).isPresent();

        assertTrue(isExistBeforeDelete);
        assertFalse(notExistAfterDelete);

    }

}
