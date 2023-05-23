<template>
   
    

<h1 >Automoviles Tarea 2</h1>

<div class="form-control ">
  <label class="label">
    <span class="label-text">Indique la cantidad de Automoviles </span> 
    <br><br>

  </label>
 <div class="modal-action"  >
  <input type="number" placeholder="Ingrese N°" class="input input-bordered input-success w-full max-w-xs" />  
    <label for="ModalBorrar"  @click="crearAutomovil(label-text)" class="btn" style="background-color: #36D399">Confirmar</label>
  </div>
</div>
<br><br>


<select class="form-select" aria-label="Default select example" aria-expanded="false">
  <option selected>Filtrar por Tipo</option>
  <option value="1">Sedan</option>
  <option value="2">Camioneta</option>
  <option value="3">SUV</option>

</select> <br>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Color</option>
  <option value="1">Rojo</option>
  <option value="2">Blanco</option>
  <option value="3">Negro</option>
  <option value="4">Azul</option>
  <option value="5">Amarillo</option>

</select> <br>
<select class="form-select" aria-label="Default select example">
  <option selected>Filtrar por Precio</option>
  <option value="1">10000000</option>
  <option value="1">20000000</option>
  <option value="2">30000000</option>

</select> <br>

<div class="modal-box w-11/12 max-w-5xl">
    
    <h3 class="font-bold text-lg" align="center">Automoviles</h3>
      <div class="Pruebaa" >
        <thead>
      <tr>
        <th></th>
        <th>Periodo</th>
        <th>Hora Inicio</th>
        <th>hora Termino</th>
      </tr>
      </thead>
     
    <td> </td>
        <td> {{}}</td>
        <td>{{}}</td>
        <td>{{}}</td>
      
      </div>


</div>




</template>

<style>
.container{
   margin-left: 5px;
   padding-right: 900px;
   
}
.modal-action{
  display: block;
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