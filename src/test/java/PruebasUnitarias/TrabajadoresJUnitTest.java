/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PruebasUnitarias;

import com.mycompany.main.Trabajadores;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author blope
 */
public class TrabajadoresJUnitTest {

    @Test
    public void testCalcularM10() {

        Trabajadores tm10 = new Trabajadores("12345356-2", "Juan Jose", 'M', 46, 300000, 0);
        int resultadoEsperado = 10;
        int resuladoOptenido = tm10.calcularIncentivo();
        assertEquals(resultadoEsperado, resultadoEsperado);
    }

    @Test
    public void testCalcularF10() {
        Trabajadores tf10 = new Trabajadores("123252356-3", "Maria", 'F', 41, 300000, 0);
        int resultadoEsperado = 10;
        int resuladoOptenido = tf10.calcularIncentivo();
        assertEquals(resultadoEsperado, resultadoEsperado);

    }

    @Test
    public void testCalcularM18() {
        Trabajadores tM18 = new Trabajadores("123453236-2", "Pedro", 'M', 46, 300000, 2);
        int resultadoEsperado = 18;
        int resuladoOptenido = tM18.calcularIncentivo();
        assertEquals(resultadoEsperado, resultadoEsperado);
    }
    
    @Test
    public void testCalcularF20() {
        Trabajadores tf20 = new Trabajadores("123452336-0", "loreto", 'F', 42, 300000, 2);
        int resultadoEsperado = 20;
        int resuladoOptenido = tf20.calcularIncentivo();
        assertEquals(resultadoEsperado, resultadoEsperado);
    }
    
    @Test
    public void testCalcularF25() {
        Trabajadores tf25 = new Trabajadores("123453236-2", "julia", 'F', 46, 300000, 5);
        int resultadoEsperado = 20;
        int resuladoOptenido = tf25.calcularIncentivo();
        assertEquals(resultadoEsperado, resultadoEsperado);
    }
    
}
