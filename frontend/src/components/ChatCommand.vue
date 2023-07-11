<template>
    <v-card outlined>
        <v-card-title>
            Chat
        </v-card-title>

        <v-card-text>
            <String label="Recipient" v-model="value.recipient" :editMode="editMode"/>
            <String label="Message" v-model="value.message" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="chat"
            >
                Chat
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
        name: 'ChatCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.recipient = '';
            this.value.message = '';
        },
        watch: {
        },
        methods: {
            chat() {
                this.$emit('chat', this.value);
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

