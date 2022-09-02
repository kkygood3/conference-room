<template>

    <v-data-table
        :headers="headers"
        :items="userList"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'UserListView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            userList : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/userLists'))

            temp.data._embedded.userLists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.userList = temp.data._embedded.userLists;
        },
        methods: {
        }
    }
</script>

