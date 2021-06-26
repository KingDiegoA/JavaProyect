package com.inventario.cinventory;

import com.inventario.cinventory.model.Acl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CInventoryApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void testEmpresa()throws Exception {
        Acl miembrosACLTest = new Acl();
        if (miembrosACLTest.getNombreEmpresa() == "Diego");
        {
            miembrosACLTest.getNombreEmpresa();
        }
        assertEquals("ACL",miembrosACLTest.resultado2());
    }

    @Test
    public void testMiembrosACL()throws Exception {
        Acl miembrosACLTest = new Acl();
        for (int i = miembrosACLTest.getId(); i< miembrosACLTest.getId(); i++){
            miembrosACLTest.roll(miembrosACLTest.getId());
        }
        assertEquals(0, miembrosACLTest.resultado());
    }

}
