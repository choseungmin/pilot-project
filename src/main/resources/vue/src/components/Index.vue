<template>
  <div class="Index">
    <h1>{{ msg }}</h1>
    <h2>Essential Links</h2>
    <ul>
      <li>
        <a href="/GridComponent" target="_blank">GridComponent</a>
      </li>
      <li>
        <router-link to="/GridComponent">Grid Component</router-link>
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
