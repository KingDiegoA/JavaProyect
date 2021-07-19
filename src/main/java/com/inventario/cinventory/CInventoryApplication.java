package com.inventario.cinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class CInventoryApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Procedimiento Miembros ACL");
        System.out.println("(1) Iniciar Procedimiento");
        System.out.println("(2) Cancelar Procedimiento");
        try {
            x=scanner.nextInt();
            if (x==1){
                SpringApplication.run(CInventoryApplication.class, args);
            }else {
                System.out.println();
            }
        }
        catch (InputMismatchException e){
            System.out.println("Valor erroneo");
        }finally {
            System.out.println("Proceso Completado");
        }

    }

}
