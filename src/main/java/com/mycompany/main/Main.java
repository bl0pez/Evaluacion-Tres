/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author blope
 */
public class Main {

    public static void main(String[] args) {

        Trabajadores tm10 = new Trabajadores("12345356-2", "Juan Jose", 'M', 46, 300000, 0);
        Trabajadores tf10 = new Trabajadores("123252356-3", "Maria", 'F', 41, 300000, 0);

        Trabajadores tM18 = new Trabajadores("123453236-2", "Pedro", 'M', 46, 300000, 2);

        Trabajadores tf20 = new Trabajadores("123452336-0", "loreto", 'F', 42, 300000, 2);

        Trabajadores tf25 = new Trabajadores("123453236-2", "julia", 'F', 46, 300000, 5);

        tm10.mostrarIncentivo();
        tf10.mostrarIncentivo();
        tM18.mostrarIncentivo();
        tf20.mostrarIncentivo();
        tf25.mostrarIncentivo();
        
        
    }
}
