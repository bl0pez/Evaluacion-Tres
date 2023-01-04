/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author blope
 */
public class Trabajadores {
    private String rut;
    private String nombre;
    private char sexo;
    private int edad;
    private int sueldoBase;
    private int cantidadHijos;

    /**
     *
     */
    public Trabajadores() {
    }

    /**
     *
     * @param rut
     * @param nombre
     * @param sexo
     * @param edad
     * @param sueldoBase
     * @param cantidadHijos
     */
    public Trabajadores(String rut, String nombre, char sexo, int edad, int sueldoBase, int cantidadHijos) {
        setCantidadHijos(cantidadHijos);
        setEdad(edad);
        setNombre(nombre);
        setRut(rut);
        setSexo(sexo);
        setSueldoBase(sueldoBase);
    }

    /**
     *
     * @return
     */
    public String getRut() {
        return rut;
    }

    /**
     *
     * @param rut
     */
    public void setRut(String rut) {
        // Validamos que el rut no este vacio
        if (rut.isEmpty()) {
            System.out.println("El rut no puede estar vacio");
            return;
        }

        this.rut = rut;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        // Validamos que tenga al menos 5 caracteres
        if (nombre.length() < 5) {
            System.out.println("El nombre debe tener al menos 5 caracteres");
            return;
        }

        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public char getSexo() {
        return sexo;
    }

    /**
     *
     * @param sexo
     */
    public void setSexo(char sexo) {
        // Validamos que M = Masculino y F = Femenino
        if (sexo != 'M' && sexo != 'F') {
            System.out.println("El sexo debe ser M = Masculino o F = Femenino");
            return;
        }

        this.sexo = sexo;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {

        // Validamos que la edad sea mayor a 18
        if (edad < 18) {
            System.out.println("La edad debe ser mayor a 18");
            return;
        }

        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public int getSueldoBase() {
        return sueldoBase;
    }

    /**
     *
     * @param sueldoBase
     */
    public void setSueldoBase(int sueldoBase) {

        // Validamos que el sueldo base sea mayor a 300.000
        if (sueldoBase < 300000) {
            System.out.println("El sueldo base debe ser mayor a 300.000");
            return;
        }

        this.sueldoBase = sueldoBase;
    }

    /**
     *
     * @return
     */
    public int getCantidadHijos() {
        return cantidadHijos;
    }

    /**
     *
     * @param cantidadHijos
     */
    public void setCantidadHijos(int cantidadHijos) {
        // Validamos que sea un numero positivo
        if (cantidadHijos < 0) {
            System.out.println("La cantidad de hijos debe ser un numero positivo");
            return;
        }

        this.cantidadHijos = cantidadHijos;
    }

    /**
     * Calacula el incentivo dependiendo del sexo edad y cantidad de hijos
     * @return
     */
    public int calcularIncentivo(){
        int edad = getEdad();
        char sexo = getSexo();
        int cantidadHijos = getCantidadHijos();

        if(sexo == 'M' && edad > 45 && cantidadHijos == 0 ||
           sexo == 'F' && edad > 40 && cantidadHijos == 0){
            return 10;
        }

        if(sexo == 'M' && edad > 45 && cantidadHijos > 0){
            return 18;
        }

        if(sexo == 'F' && edad > 40 && cantidadHijos > 0 && cantidadHijos <= 3){
            return 20;
        }

        if(sexo == 'F' && cantidadHijos > 3){
            return 25;
        }

        return 0;

    }

    /**
     * Muestra con un mensaje - nombre,suledo y incentivo
     */
    public void mostrarIncentivo(){
        int incentivo = calcularIncentivo();
        String nombre = getNombre();
        int sueldoBase = getSueldoBase();
        System.out.println("Nombre: " + nombre + "," + " Sueldo: " + "$" + sueldoBase + "," + " Sueldo: " + " $" + (sueldoBase * incentivo / 100) + "," + " incentivos: " + (incentivo) +"%");
    }
}
