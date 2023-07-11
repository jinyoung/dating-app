

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                        
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="users"
                        to="/userProfiles/users"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="recommendations"
                        to="/matchingRecommendations/recommendations"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="chats"
                        to="/chatFunctionalities/chats"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="locations"
                        to="/locationServices/locations"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="payments"
                        to="/paymentServices/payments"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="feedbacks"
                        to="/feedbackServices/feedbacks"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container v-else class="py-8 px-6 mt-10" fluid>
                <div style="width:86%; margin-left:7%; margin-top:-40px;">
                    <div style="font-size: 24px; font-weight:700; margin:20px 0px 25px 0px;"></div>
                </div>
                <v-row>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">person_outline</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="users"
                                            to="/userProfiles/users"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            
                                        </v-btn>
                                    </template>
                                    <span></span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;"></div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">star</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="recommendations"
                                            to="/matchingRecommendations/recommendations"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            
                                        </v-btn>
                                    </template>
                                    <span></span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;"></div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">chat</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="chats"
                                            to="/chatFunctionalities/chats"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            
                                        </v-btn>
                                    </template>
                                    <span></span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;"></div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">location_on</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="locations"
                                            to="/locationServices/locations"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            
                                        </v-btn>
                                    </template>
                                    <span></span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;"></div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">payment</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="payments"
                                            to="/paymentServices/payments"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            
                                        </v-btn>
                                    </template>
                                    <span></span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;"></div>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px; text-align: center;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto border-color"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">feedback</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="feedbacks"
                                            to="/feedbackServices/feedbacks"
                                            @click="changeUrl()"
                                            color="primary"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            
                                        </v-btn>
                                    </template>
                                    <span></span>
                                </v-tooltip>
                            </v-card-actions>
                            <div style="margin-top:10px;"></div>
                        </v-card>

                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
        },
        goHome() {
            this.urlPath = null;
        },
    }
};
</script>
<style>
</style>
