<template>
  <div class="Index">
    <h1>{{ msg }}</h1>
    <h2>Page Link</h2>
    <ul>
      <li>
        <router-link to="/gridComponent">Grid Component</router-link>
      </li>
      <li>
        <router-link to="/helloWorld">hello world</router-link>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'Index',
  data () {
    return {
      msg: 'Index Page'
    }
  },
  methods: {
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
