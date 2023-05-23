package demoDesafio.demo.service;

import demoDesafio.demo.model.Automovil;

import java.util.ArrayList;
import java.util.List;

public interface AutomovilService {

    //metodo para generar N cantidad de automoviles
    List<Automovil> generarAutomoviles(int cantidad);
    List<Automovil> buscarColor(String color);

    List<Automovil> buscarTipo(String tipo);

    List<Automovil> buscarPrecio(double maxPrice);


}

