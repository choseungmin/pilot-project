<template>
  <div>
    <h2>{{ msg }}</h2>
    <highcharts ref="lineChart" :options="optCpowerChartArr"></highcharts>
  </div>
</template>

<script>
export default {
  name: 'ChartComponent',
  props: ['chartData', 'optCpowerArr', 'ismartId'],
  computed: {
    optCpowerChartArr () {
      if (this.optCpowerArr.length < 1) return this.chartOptions

      let returnObj = {category: [], series: []}
      let tmpObj = {}
      let keysArr = []

      this.optCpowerArr.map((v, i) => {
        keysArr = Object.keys(v)

        keysArr.map((w, j) => {
          if (w === 'tgtMonth') {
            returnObj.category.push(v[w])
          } else if (tmpObj[w] === undefined) {
            tmpObj[w] = []
          } else {
            tmpObj[w].push(v[w])
          }
        })
      })

      returnObj.series = Object.keys(tmpObj).map((v, i) => {
        return { name: v, data: tmpObj[v] }
      })

      return {
        ...this.chartOptions,
        title: { text: '' },
        xAxis: { categories: returnObj.category },
        series: returnObj.series
      }
    }
  },
  mounted () {
  },
  methods: {
  },
  data: () => ({
    msg: 'Chart Component Page',
    chartOptions: {
      chart: { type: 'spline' },
      title: { text: '' },
      series: []
    }
  })
}
</script>

<style scoped>
  h1, h2 {
    font-weight: normal;
  }
</style>
