<template>

    <v-card outlined>
        <v-card-title>
            CreateMatchProfile
        </v-card-title>

        <v-card-text>
            <Number label="MatchId" v-model="value.matchId" :editMode="editMode"/>
            <String label="MatchName" v-model="value.matchName" :editMode="editMode"/>
            <Number label="MatchAge" v-model="value.matchAge" :editMode="editMode"/>
            <String label="MatchGender" v-model="value.matchGender" :editMode="editMode"/>
            <String label="MatchSexualOrientation" v-model="value.matchSexualOrientation" :editMode="editMode"/>
            <String label="Location" v-model="value.location" :editMode="editMode"/>
            <String label="Interests" v-model="value.interests" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createMatchProfile"
            >
                CreateMatchProfile
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateMatchProfileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.matchId = 0;
            this.value.matchName = '';
            this.value.matchAge = 0;
            this.value.matchGender = '';
            this.value.matchSexualOrientation = '';
            this.value.location = '';
            this.value.interests = [];
        },
        watch: {
        },
        methods: {
            createMatchProfile() {
                this.$emit('createMatchProfile', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

