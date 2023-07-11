
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserProfileUserManager from "./components/listers/UserProfileUserCards"
import UserProfileUserDetail from "./components/listers/UserProfileUserDetail"

import MatchingRecommendationRecommendationManager from "./components/listers/MatchingRecommendationRecommendationCards"
import MatchingRecommendationRecommendationDetail from "./components/listers/MatchingRecommendationRecommendationDetail"

import ChatFunctionalityChatManager from "./components/listers/ChatFunctionalityChatCards"
import ChatFunctionalityChatDetail from "./components/listers/ChatFunctionalityChatDetail"

import LocationServiceLocationManager from "./components/listers/LocationServiceLocationCards"
import LocationServiceLocationDetail from "./components/listers/LocationServiceLocationDetail"

import PaymentServicePaymentManager from "./components/listers/PaymentServicePaymentCards"
import PaymentServicePaymentDetail from "./components/listers/PaymentServicePaymentDetail"

import FeedbackServiceFeedbackManager from "./components/listers/FeedbackServiceFeedbackCards"
import FeedbackServiceFeedbackDetail from "./components/listers/FeedbackServiceFeedbackDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/userProfiles/users',
                name: 'UserProfileUserManager',
                component: UserProfileUserManager
            },
            {
                path: '/userProfiles/users/:id',
                name: 'UserProfileUserDetail',
                component: UserProfileUserDetail
            },

            {
                path: '/matchingRecommendations/recommendations',
                name: 'MatchingRecommendationRecommendationManager',
                component: MatchingRecommendationRecommendationManager
            },
            {
                path: '/matchingRecommendations/recommendations/:id',
                name: 'MatchingRecommendationRecommendationDetail',
                component: MatchingRecommendationRecommendationDetail
            },

            {
                path: '/chatFunctionalities/chats',
                name: 'ChatFunctionalityChatManager',
                component: ChatFunctionalityChatManager
            },
            {
                path: '/chatFunctionalities/chats/:id',
                name: 'ChatFunctionalityChatDetail',
                component: ChatFunctionalityChatDetail
            },

            {
                path: '/locationServices/locations',
                name: 'LocationServiceLocationManager',
                component: LocationServiceLocationManager
            },
            {
                path: '/locationServices/locations/:id',
                name: 'LocationServiceLocationDetail',
                component: LocationServiceLocationDetail
            },

            {
                path: '/paymentServices/payments',
                name: 'PaymentServicePaymentManager',
                component: PaymentServicePaymentManager
            },
            {
                path: '/paymentServices/payments/:id',
                name: 'PaymentServicePaymentDetail',
                component: PaymentServicePaymentDetail
            },

            {
                path: '/feedbackServices/feedbacks',
                name: 'FeedbackServiceFeedbackManager',
                component: FeedbackServiceFeedbackManager
            },
            {
                path: '/feedbackServices/feedbacks/:id',
                name: 'FeedbackServiceFeedbackDetail',
                component: FeedbackServiceFeedbackDetail
            },



    ]
})
