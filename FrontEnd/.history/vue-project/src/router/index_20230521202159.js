import { createRouter, createWebHistory } from 'vue-router'

import Automovil from '../views/Automovil.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
  
    {
      path: '/automovil',
      name: 'automovil',
      component: Automovil
    }
  ]
})

export default router
