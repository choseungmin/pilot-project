import Vue from 'vue'
import VueRouter from 'vue-router'
import HelloWorld from '@/components/helloWorld/HelloWorld'
import Index from '@/components/Index'
import GridComponent from '@/components/analysis/GridComponent'

Vue.use(VueRouter)

export default new VueRouter({
  // mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Index',
      component: Index
    },
    {
      path: '/gridComponent',
      name: 'GridComponent',
      component: GridComponent
    },
    {
      path: '/helloWorld',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ]
})
