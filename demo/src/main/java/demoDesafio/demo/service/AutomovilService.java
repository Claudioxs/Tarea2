package demoDesafio.demo.service;

import demoDesafio.demo.model.Automovil;

import java.util.List;

public interface AutomovilService {

    //metodo para generar N cantidad de automoviles
    List<Automovil> generarAutomoviles(int cantidad);

}

