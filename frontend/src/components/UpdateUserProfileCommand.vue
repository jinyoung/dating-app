<template>

    <v-card outlined>
        <v-card-title>
            UpdateUserProfile
        </v-card-title>

        <v-card-text>
            <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <Number label="Age" v-model="value.age" :editMode="editMode"/>
            <String label="Gender" v-model="value.gender" :editMode="editMode"/>
            <String label="SexualOrientation" v-model="value.sexualOrientation" :editMode="editMode"/>
            <String label="Interests" v-model="value.interests" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateUserProfile"
            >
                UpdateUserProfile
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
        name: 'UpdateUserProfileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.userId = 0;
            this.value.name = '';
            this.value.age = 0;
            this.value.gender = '';
            this.value.sexualOrientation = '';
            this.value.interests = [];
        },
        watch: {
        },
        methods: {
            updateUserProfile() {
                this.$emit('updateUserProfile', this.value);
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

