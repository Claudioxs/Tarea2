package demoDesafio.demo.controller;
import demoDesafio.demo.model.Automovil;
import demoDesafio.demo.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // devuelve directamente datos
@RequestMapping("/automovil") // mapeo a esta ruta
public class AutomovilController {

    private final AutomovilService automovilService;

    //inyección de dependencias del servicio AutomovilService
    @Autowired
    public AutomovilController(AutomovilService automovilService) {
        this.automovilService = automovilService;
    }


    // para  responder a solicitudes http get en la ruta /automovil/generate
    // @RequestParam int se declara la cantidad que se pase como parametro en la consulta  URL de la solicitud GET
    // return devuelve la lista de automóviles generados como respuesta a la solicitud HTTP GET.
    @GetMapping("/generate")
    public List<Automovil> generarAutomoviles(@RequestParam int cantidad) {
        return automovilService.generarAutomoviles(cantidad);
    }

}








