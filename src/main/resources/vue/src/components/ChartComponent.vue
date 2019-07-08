<template>
  <div>
    <highcharts ref="lineChart" :options="chartOptions"></highcharts>
    <a @click="load()">aa</a>
  </div>

<!--  <input type="button" @click="load()">-->
</template>

<script>
export default {
  name: 'ChartComponent',
  props: ['chartData'],
  mounted () {
    // setTimeout(() => {
    //   this.load()
    // }, 2000)
  },
  methods: {
    load () {
      let lineChart = this.$refs.lineChart
      setTimeout(() => {
        lineChart.options.series = [{
          data: [10, 0, 8, 2, 6, 4, 5, 5]
        }]
      })
    }
  },
  data: () => ({
    msg: 'Grid Component Page',
    chartOptions: {
      chart: {
        type: 'spline'
      },
      title: {
        text: 'Entire title'
      },
      series: [{
        data: []
      }]
    }
  })
}
</script>

<style scoped>

</style>
