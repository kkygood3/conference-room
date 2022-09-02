<template>

    <v-data-table
        :headers="headers"
        :items="meetingRoomList"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MeetingRoomListView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            meetingRoomList : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/meetingRoomLists'))

            temp.data._embedded.meetingRoomLists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.meetingRoomList = temp.data._embedded.meetingRoomLists;
        },
        methods: {
        }
    }
</script>

