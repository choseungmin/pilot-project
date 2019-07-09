import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/helloWorld/HelloWorld'
import Index from '@/components/Index'
import GridComponent from '@/components/analysis/GridComponent'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Index',
      component: Index
    },
    {
      path: '/GridComponent',
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
