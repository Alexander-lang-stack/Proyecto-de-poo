/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uees.proyecytocalcu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Comprobacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreacionVAl calcu = new CreacionVAl();
        System.out.println("La suma es: " + calcu.suma(524,563));
        System.out.println("La resta es: " + calcu.resta(256,15));
        System.out.println("La multiplicación es: " + calcu.multiplicacion(2356,56));
        System.out.println("La division es: " + calcu.division(53265,235));
     // Los números deseados para poder operarse entre si deben ponerse desde la programación   
    }
    }
