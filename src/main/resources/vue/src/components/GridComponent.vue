<template>
  <div class="GridComponent">
    <h1>{{ msg }}</h1>
    <h2>Essential Links</h2>
    <ul>
      <li><a href="https://vuejs.org" target="_blank">Core Docs</a></li>
      <li><a href="https://forum.vuejs.org" target="_blank">Forum</a></li>
    </ul>
<!--    <test v-bind:my-message="msg" @click="testClick('sssss')"/>-->
    <a @click="testClick('sssss')">test call Api</a>
    <a @click="getUserBas('sssss')">get user_bas</a>
  </div>
</template>

<script>
import test from './test'
import axios from 'axios'

export default {
  name: 'GridComponent',
  data: () => ({
    msg: 'Grid Component Page'
  }),
  methods: {
    testClick: (msg) => {
      console.log('testClick' + msg)
      axios.post('/api/test', {param: 'this is test String'}).then(response => {
        console.log(response)
      })
    },
    getUserBas: (msg) => {
      console.log('testClick' + msg)
      axios.post('/api/selectUserBas', {param: 'this is test String'}).then(response => {
        console.log(response)
      })
    },
  },
  components: {
    test
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
