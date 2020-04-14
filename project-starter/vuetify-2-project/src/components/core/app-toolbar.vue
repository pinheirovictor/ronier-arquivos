<template>
    <v-app-bar color="primary" dark dense app>
        <app-logo>   </app-logo>
        <v-toolbar-items class="ml-3">
            <v-btn to="/" text>Início</v-btn>
        </v-toolbar-items>

        <v-spacer></v-spacer>

        <span>Olá, {{nome}}</span>
        <v-btn @click="logout" text>
            <v-icon>power_settings_new</v-icon>
        </v-btn>
    </v-app-bar>
</template>

<script>

    import AppLogo from "./logo";
    export default {
        name: 'app-toolbar',
        components: {AppLogo},
        data: () => ({
            nome: localStorage.getItem('nome')
        }),

        methods: {
            logout() {
                this.$router.push('/logout')
            }

        }
    };
</script>

<style scoped>

</style>