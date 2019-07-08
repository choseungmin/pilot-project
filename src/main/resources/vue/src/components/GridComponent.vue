<template>
  <div class="GridComponent">
    <h1>{{ msg }}</h1>
    <h2>Essential Links</h2>
    <ul>
      <li><a @click="getUserBas()">get user_bas</a></li>
    </ul>
    <div>
      <table>
        <colgroup>
          <col width="10%"/>
          <col width="35%"/>
          <col width="35%"/>
          <col width="20%"/>
        </colgroup>
        <thead>
          <tr>
            <th>no</th>
            <th>ismart id</th>
            <th>사용자 명</th>
            <th>타입</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(item, key) in this.userBasArr" v-bind:key="key">
            <td>{{ key }}</td>
            <td>{{ item.ismartId }}</td>
            <td>{{ item.userNm }}</td>
            <td>{{ setUserTypeNm(item.userType) }}</td>
          </tr>
        </tbody>
      </table>
    </div>
<!--    <test v-bind:my-message="msg" @click="testClick('sssss')"/>-->
  </div>
</template>

<script>
import test from './test'
import axios from 'axios'

export default {
  name: 'GridComponent',
  data: () => ({
    msg: 'Grid Component Page',
    userBasArr: []
  }),
  computed: {

  },
  methods: {
    getUserBas: function () {
      //
      axios.post('/api/selectUserBas', {param: 'this is test String'}).then(response => {
        this.userBasArr = response.data
      })
    },
    setUserTypeNm: function (userType) {
      switch (userType) {
        case '2001':
          return '관리자'
        case '3001':
          return '일반'
        default :
          return ''
      }
    }
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
