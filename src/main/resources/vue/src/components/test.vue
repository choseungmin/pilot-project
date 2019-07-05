<template>
    <div @click="testClick('sssss2')">test222 {{myMessage}}</div>
</template>

<script>
export default {
  props: ['myMessage', 'testClick'],
  name: 'test'
}
</script>

<style scoped>

</style>
