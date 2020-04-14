<template>
    <v-app>
        <template v-if="!$route.meta.public">
            <app-toolbar></app-toolbar>
            <v-content class="content">
                <v-container fluid class="page-wrapper">
                    <router-view></router-view>
                </v-container>
            </v-content>

            <!-- App Footer -->
            <v-footer height="auto" class="white pa-3 app--footer" app>
                <span class="caption">Núcleo de Práticas em Informática &copy; {{ new Date().getFullYear() }}</span>
            </v-footer>
        </template>

        <template v-else>
          <transition>
            <keep-alive>
              <router-view :key="$route.fullpath"></router-view>
            </keep-alive>
          </transition>
        </template>
    </v-app>
</template>

<script>

import axios from 'axios';
import store from "./store";
import { mapGetters, mapState } from 'vuex';
import AppToolbar from "./components/core/app-toolbar";


export default {
  name: 'App',
    components: {AppToolbar},
    data: () => ({

  }),

    methods: {
        logout() {
            this.$router.push('/logout')
        }

    }
};
</script>

<style lang="stylus" scoped>
    .page-wrapper
        min-height: calc(100vh - 64px - 50px - 81px );

    .content
        background-color: #cbcedd;;

</style>
