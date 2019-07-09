<template>
  <div>
    <h2>{{ msg }}</h2>
    <h3>{{ ismartId }}</h3>
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

      let categories = [] // highchart에 사용될 categories (여기서는 tgtMonth를 사용)
      let series = [] // highchart에 사용될 series
      let tmpObj = {} // series 값을 담을 임시 Object
      let keysArr = [] // series 이름을 담을 임시 array

      this.optCpowerArr.map((v, i) => {
        keysArr = Object.keys(v) // highchart에 사용 할 배열 이름 얻기 (series, categories)

        keysArr.map((w, j) => {
          if (w === 'tgtMonth') {
            categories.push(v[w]) // tgtMonth를 categories로 사용
          } else {
            if (tmpObj[w] === undefined) {
              tmpObj[w] = [] // 선언되지 않은 series를 담을 배열 생성
            }
            tmpObj[w].push(v[w]) // 선언된 series 배열에 값 담음
          }
        })
      })

      series = Object.keys(tmpObj).map((v, i) => {
        return { name: v, data: tmpObj[v] }
      })

      return {
        ...this.chartOptions,
        xAxis: { categories: categories },
        series: series
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
  h1, h2, h3 {
    font-weight: normal;
  }
</style>
