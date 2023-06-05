<template>

    <v-card outlined>
        <v-card-title>
            DeleteMatchProfile
        </v-card-title>

        <v-card-text>
            <Number label="MatchId" v-model="value.matchId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteMatchProfile"
            >
                DeleteMatchProfile
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
        name: 'DeleteMatchProfileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.matchId = 0;
        },
        watch: {
        },
        methods: {
            deleteMatchProfile() {
                this.$emit('deleteMatchProfile', this.value);
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

