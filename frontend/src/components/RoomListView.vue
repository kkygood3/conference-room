<template>

    <v-data-table
        :headers="headers"
        :items="roomList"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'RoomListView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            roomList : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/roomLists'))

            temp.data._embedded.roomLists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.roomList = temp.data._embedded.roomLists;
        },
        methods: {
        }
    }
</script>

