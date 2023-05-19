package demoDesafio.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Automovil {

    //declaracion de  atributos del automovil
    private int id;
    private String marca;
    private int año;
    private String color;
    private double precio;
    private boolean turbo;
    private String tipo;
    private String motor;
    private int cabinas;
    private boolean sunroof;
    private int popularidad;


    //Constructor
    public Automovil(int id, String marca, int año, String color, double precio, boolean turbo, String tipo, String motor, int cabinas, boolean sunroof, int popularidad) {
        this.id = id;
        this.marca = marca;
        this.año = año;
        this.color = color;
        this.precio = precio;
        this.turbo = turbo;
        this.tipo = tipo;
        this.motor = motor;
        this.cabinas = cabinas;
        this.sunroof = sunroof;
        this.popularidad = popularidad;
    }

    // Getters y Setters}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCabinas() {
        return cabinas;
    }

    public void setCabinas(int cabinas) {
        this.cabinas = cabinas;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
}
