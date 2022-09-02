
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MeetingRoomManager from "./components/listers/MeetingRoomCards"
import MeetingRoomDetail from "./components/listers/MeetingRoomDetail"

import MeetingRoomListView from "./components/MeetingRoomListView"
import MeetingRoomListViewDetail from "./components/MeetingRoomListViewDetail"
import UserListManager from "./components/listers/UserListCards"
import UserListDetail from "./components/listers/UserListDetail"

import UserListView from "./components/UserListView"
import UserListViewDetail from "./components/UserListViewDetail"
import ConferenceManager from "./components/listers/ConferenceCards"
import ConferenceDetail from "./components/listers/ConferenceDetail"

import ReservationListView from "./components/ReservationListView"
import ReservationListViewDetail from "./components/ReservationListViewDetail"
import ReservationInfoView from "./components/ReservationInfoView"
import ReservationInfoViewDetail from "./components/ReservationInfoViewDetail"


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
                path: '/meetingRoomLists',
                name: 'MeetingRoomListView',
                component: MeetingRoomListView
            },
            {
                path: '/meetingRoomLists/:id',
                name: 'MeetingRoomListViewDetail',
                component: MeetingRoomListViewDetail
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
                path: '/reservationLists',
                name: 'ReservationListView',
                component: ReservationListView
            },
            {
                path: '/reservationLists/:id',
                name: 'ReservationListViewDetail',
                component: ReservationListViewDetail
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



    ]
})
