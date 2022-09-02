<template>

    <v-card outlined>
        <v-card-title>
            RoomList # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'RoomListViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/roomLists/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

