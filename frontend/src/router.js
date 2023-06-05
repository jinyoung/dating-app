
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserManager from "./components/listers/UserCards"
import UserDetail from "./components/listers/UserDetail"

import InterestManager from "./components/listers/InterestCards"
import InterestDetail from "./components/listers/InterestDetail"
import MatchManager from "./components/listers/MatchCards"
import MatchDetail from "./components/listers/MatchDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/users',
                name: 'UserManager',
                component: UserManager
            },
            {
                path: '/users/:id',
                name: 'UserDetail',
                component: UserDetail
            },

            {
                path: '/interests',
                name: 'InterestManager',
                component: InterestManager
            },
            {
                path: '/interests/:id',
                name: 'InterestDetail',
                component: InterestDetail
            },
            {
                path: '/matches',
                name: 'MatchManager',
                component: MatchManager
            },
            {
                path: '/matches/:id',
                name: 'MatchDetail',
                component: MatchDetail
            },



    ]
})
