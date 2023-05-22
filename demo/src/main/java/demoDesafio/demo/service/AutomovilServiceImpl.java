package demoDesafio.demo.service;

import demoDesafio.demo.model.Automovil;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class AutomovilServiceImpl implements AutomovilService{

    List<Automovil> automoviles = new ArrayList<>();
    @Override
    public List<Automovil> generarAutomoviles(int cantidad) {


        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int id = i + 1;
            String marca = generarMarcaAleatoria();
            int año = generarAñoAleatorio();
            String color = generarColorAleatorio();
            double precio = generarPrecioAleatorio();
            boolean turbo = random.nextBoolean();
            String tipo = generarTipoAleatorio();
            String motor = generarMotorAleatorio(tipo);
            int cabinas = obtenerCabinasAleatoro(tipo);
            boolean sunroof = obtenerSunroofAleatorio(tipo);
            int popularidad = 0;

            Automovil automovil = new Automovil(id, marca, año, color, precio, turbo, tipo, motor, cabinas, sunroof, popularidad);
            automoviles.add(automovil);  // crear un nuevo automovil y añadir a la lista de automoviles exitentes
        }

        return automoviles;

    }


    // Metodos para generar las características del automovil de forma aleatoria
    // Ver si el nombre de los metodos son los correctos (entre generar o obtener)
    private String generarMarcaAleatoria(){
        String[] marcas = {"Ford","Mazda","Chevrolet","Toyota","Suzuki","Nissan"};
        Random random = new Random();
        int marcaAleatoria = random.nextInt(marcas.length);  // mejorar el nombre
        return marcas[marcaAleatoria];
    }

    //Se genera un número aleatorio entre 0 y 8(el tamaño del rango).
    // Luego se le suma limiteInferior para obtener un año aleatorio valido(dentro del rango).
    private int generarAñoAleatorio() {
        int limiteInferior = 2015;
        int limiteSuperior = 2023;
        return new Random().nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }


    private String generarColorAleatorio() {
        String[] colores = {"Rojo","Blanco","Negro","Azul","Amarillo"};
        Random random = new Random();
        int colorAleatorio = random.nextInt(colores.length);
        return colores[colorAleatorio];
    }

    //cambiar el tipo del formato. aparece en notación científica
    private double generarPrecioAleatorio() {
        double precioMinimo = 8000000;
        double precioMaximo = 30000000;
        Random random = new Random();
        double precio = precioMinimo + (precioMaximo - precioMinimo) * random.nextDouble();
        return precio;
    }

    private String generarTipoAleatorio(){
        String[] tipos = {"Sedan", "Camioneta", "SUV"};
        Random random = new Random();
        int tipoAleatorio = random.nextInt(tipos.length);
        return tipos[tipoAleatorio];
    }

    private String generarMotorAleatorio(String tipo){

        Random random = new Random();
        String motor = "";  // si no se le asigan ningun valor al motor se devuelve una cadena vacia

        switch (tipo) {
            case "Sedan":
                String[] motoresSedan = {"1.4cc", "1.6cc", "2.0cc"};
                motor = motoresSedan[random.nextInt(motoresSedan.length)];
                break;
            case "Camioneta":
                String[] motoresCamioneta = {"2.4cc", "3.0cc", "4.0cc"};
                motor = motoresCamioneta[random.nextInt(motoresCamioneta.length)];
                break;
            case "SUV":
                String[] motoresSUV = {"1.8cc", "2.2cc", "2.8cc"};
                motor = motoresSUV[random.nextInt(motoresSUV.length)];
                break;
            default:
                break;
        }

        return motor;
    }

    private int obtenerCabinasAleatoro(String tipo){
        if (tipo.equals("Camioneta")) {
            Random random = new Random();
            return random.nextInt(2) + 1; // Genera un número aleatorio entre 1 y 2
        }

        return 0; // para los otros tipos
    }

    private boolean obtenerSunroofAleatorio(String tipo){
        if(tipo.equals("SUV")) {
            Random random = new Random();
            return random.nextBoolean();
        }
        return false; // para los otros tipos
    }
    //Metodos para filtrar
    @Override
    public List<Automovil> buscarColor(String color) {

        return automoviles.stream().filter(x -> x.getColor()==color).collect(Collectors.toList());
    }

    @Override
    public List<Automovil> buscarTipo(String tipo) {
        return automoviles.stream().filter(x -> x.getTipo()==tipo).collect(Collectors.toList());
    }

    @Override
    public List<Automovil> buscarPrecio(double precio) {
        return automoviles.stream().filter(x -> x.getPrecio()==precio).collect(Collectors.toList());
    }




}
