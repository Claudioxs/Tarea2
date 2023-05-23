<template>
   
    

<h1 >Automoviles Tarea 2</h1>

<div class="form-control ">
  <label class="label">
    <span class="label-text">Indique la cantidad de Automoviles </span> 
    <br><br>

  </label>
 <div class="modal">
  <input type="number" placeholder="Ingrese N°" class="input input-bordered input-success w-full max-w-xs" />  
    <label for="ModalBorrar"  @click="crearAutomovil(label-text)" class="btn" style="background-color: #36D399">Confirmar</label>
  </div>
</div>
<br><br>
<div class="container">
<select class="form-select" aria-label="Default select example" aria-expanded="false">
  <option selected>Filtrar por Marca</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Año</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Color</option>
  <option value="1">Rojo</option>
  <option value="2">Blanco</option>
  <option value="3">Negro</option>
  <option value="4">Azul</option>
  <option value="5">Amarillo</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Precio</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Turbo</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Tipo</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Motor</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Cabina</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Sunroof</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Popularidad</option>
  <option value="1">Marca</option>
  <option value="2">Año</option>

</select>
</div>

<div class="form-check">
    <p class="text-start">Ingrese Filtros</p>

  <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
  <label class="form-check-label" for="flexCheckDefault">
  Precio
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>
  <label class="form-check-label" for="flexCheckChecked">
    Tipo
  </label>
</div>
  <div class="form-check">
  <input class="form-check-input" type="checkbox" value="" id="flexCheckColor" checked>
  <label class="form-check-label" for="flexCheckColor">
    Color
  </label>
</div>


</template>

<style>
.container{
   margin-left: 5px;
   padding-right: 900px;
   
}


</style>

<script>
import axios from 'axios'

export default {

  data: () => ({

    
  }),
 
  methods: {
    
    cearAutomovil(cant){
     axios({
       method: "GET",
       url: "http://localhost:8080/automovil/generate?cantidad="+cant,
        
       }).then((res) => {
        alert(
         "Automoviles creados"
        )
       }).catch((err) => console.log(err));
    },

    //filtramos por color
    filtrarColor(col){
      axios({
       method: "GET",
       url: "http://localhost:8080/automovil/buscarPorColor?color="+col,
        
       }).then((res) => {
        alert(
         "Periodo Añadido correctamente a asignatura"
        )
       }).catch((err) => console.log(err));
    }
   }
 
}

</script>