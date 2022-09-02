
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MeetingRoomManager from "./components/listers/MeetingRoomCards"
import MeetingRoomDetail from "./components/listers/MeetingRoomDetail"

import UserListManager from "./components/listers/UserListCards"
import UserListDetail from "./components/listers/UserListDetail"

import ConferenceManager from "./components/listers/ConferenceCards"
import ConferenceDetail from "./components/listers/ConferenceDetail"



import UserListView from "./components/UserListView"
import UserListViewDetail from "./components/UserListViewDetail"
import ReservationInfoView from "./components/ReservationInfoView"
import ReservationInfoViewDetail from "./components/ReservationInfoViewDetail"
import RoomListView from "./components/RoomListView"
import RoomListViewDetail from "./components/RoomListViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/meetingRooms',
                name: 'MeetingRoomManager',
                component: MeetingRoomManager
            },
            {
                path: '/meetingRooms/:id',
                name: 'MeetingRoomDetail',
                component: MeetingRoomDetail
            },

            {
                path: '/userLists',
                name: 'UserListManager',
                component: UserListManager
            },
            {
                path: '/userLists/:id',
                name: 'UserListDetail',
                component: UserListDetail
            },

            {
                path: '/conferences',
                name: 'ConferenceManager',
                component: ConferenceManager
            },
            {
                path: '/conferences/:id',
                name: 'ConferenceDetail',
                component: ConferenceDetail
            },



            {
                path: '/userLists',
                name: 'UserListView',
                component: UserListView
            },
            {
                path: '/userLists/:id',
                name: 'UserListViewDetail',
                component: UserListViewDetail
            },
            {
                path: '/reservationInfos',
                name: 'ReservationInfoView',
                component: ReservationInfoView
            },
            {
                path: '/reservationInfos/:id',
                name: 'ReservationInfoViewDetail',
                component: ReservationInfoViewDetail
            },
            {
                path: '/roomLists',
                name: 'RoomListView',
                component: RoomListView
            },
            {
                path: '/roomLists/:id',
                name: 'RoomListViewDetail',
                component: RoomListViewDetail
            },


    ]
})
