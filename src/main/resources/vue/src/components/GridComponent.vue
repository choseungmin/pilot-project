<template>
  <div class="GridComponent">
    <h1>{{ msg }}</h1>
    <h2>API Test</h2>
    <ul>
      <li><a @click="getUserBas()">get user_bas</a></li>
      <li><a @click="clearUserBas()">clear user_bas</a></li>
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
    <chart v-bind:chart-data="chartData"/>
  </div>
</template>

<script>
import axios from 'axios'

import chart from './ChartComponent'
import test from './test'

export default {
  name: 'GridComponent',
  data: () => ({
    msg: 'Grid Component Page',
    userBasArr: [],
    chartData: [10, 0, 8, 2, 6, 4, 5, 5]
  }),
  computed: {

  },
  mounted () {
    this.getUserBas()
  },
  methods: {
    getUserBas () {
      //
      axios.post('/api/selectUserBas', {param: 'this is test String'}).then(response => {
        this.userBasArr = response.data
      })
    },
    clearUserBas () {
      //
      this.userBasArr = []
    },
    setUserTypeNm (userType) {
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
    test,
    chart
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

table {
  width: 100%;
  border: 2px solid #42b983;
  border-radius: 3px;
  background-color: #fff;
}

th {
  background-color: #42b983;
  color: rgba(255,255,255,0.66);
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

td {
  background-color: #f9f9f9;
}

/*th, td {
  min-width: 120px;
  padding: 10px 20px;
}*/
</style>
