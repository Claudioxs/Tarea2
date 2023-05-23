<template>
    <head>
        <title>Page Title</title>
    </head>



<div class="form-control w-full max-w-xs">
  <label class="label">
    <span class="label-text">Indique la cantidad de Automoviles </span> <br>
    
  </label>
  <input type="number" placeholder="Ingrese N°" class="input input-bordered input-success w-full max-w-xs" />
  
</div>
<br> <br>

<div class="dropdown">
  <label tabindex="0" class="btn m-1">Click</label>
  <ul tabindex="0" class="dropdown-content menu p-2 shadow bg-base-100 rounded-box w-52">
    <li><a>Item 1</a></li>
    <li><a>Item 2</a></li>
  </ul>
</div>


<!-- The button to open modal -->
<label for="my-modal-5" class="btn">open modal</label>

<!-- Put this part before </body> tag -->
<input type="checkbox" id="my-modal-5" class="modal-toggle" />
<div class="modal">
  <div class="modal-box w-11/12 max-w-5xl">
    <h3 class="font-bold text-lg">Congratulations random Internet user!</h3>
    <p class="py-4">You've been selected for a chance to get one year of subscription to use Wikipedia for free!</p>
    <div class="modal-action">
      <label for="my-modal-5" class="btn">Yay!</label>
    </div>
  </div>
</div>



</template>