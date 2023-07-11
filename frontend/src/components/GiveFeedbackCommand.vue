<template>
    <v-card outlined>
        <v-card-title>
            GiveFeedback
        </v-card-title>

        <v-card-text>
            <Number label="Rating" v-model="value.rating" :editMode="editMode"/>
            <String label="Comment" v-model="value.comment" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="giveFeedback"
            >
                GiveFeedback
            </v-btn>
            
            <v-btn
                    color="primary"
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
        name: 'GiveFeedbackCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.rating = 0;
            this.value.comment = '';
        },
        watch: {
        },
        methods: {
            giveFeedback() {
                this.$emit('giveFeedback', this.value);
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

