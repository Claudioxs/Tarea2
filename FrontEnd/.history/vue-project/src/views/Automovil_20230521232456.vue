<template>
   
    

<h1 >Automoviles Tarea 2</h1>

<div class="form-control ">
  <label class="label">
    <span class="label-text">Indique la cantidad de Automoviles </span> <br>
    <br><br>

  </label>
  <input type="number" placeholder="Ingrese N°" class="input input-bordered input-success w-full max-w-xs" />
  
</div>
<br><br>
<select class="form-select" aria-label="Default select example">
  <option selected>Open this select menu</option>
  <option value="1">One</option>
  <option value="2">Two</option>
  <option value="3">Three</option>
</select>

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