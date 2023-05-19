package demoDesafio.demo.controller;

import demoDesafio.demo.model.Automovil;
import demoDesafio.demo.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// arreglar el controlador
@RestController
@RequestMapping("/automovil")
public class AutomovilController {

    @Autowired
    private AutomovilService automovilService;


}




