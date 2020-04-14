<template>
  <div>
    <v-card-widget enableActions :title="'Página Inicial'">
      <div slot="widget-header-action">

      </div>
      <div slot="widget-content">
        <v-row>
          <v-col cols="12">
            <v-data-table
                    :headers="headers"
                    :items="usuarios"
                    :items-per-page="5"
                    class="elevation-1"
            >
              <template v-slot:item.habilitado="{ item } ">
                <v-icon v-if = "item.habilitado" color="#1B5E20">check_circle_outline</v-icon>
                <v-icon v-else = "item.habilitado" color="#B71C1C">highlight_off</v-icon>

              </template>
            </v-data-table>
          </v-col>
        </v-row>
      </div>
    </v-card-widget>
  </div>
</template>

<script>
// @ is an alias to /src
import VCardWidget from "@/components/VWidget";
import {RepositoryFactory} from "@/repositories/RepositoryFactory";
const usuarioRepo = RepositoryFactory.get("usuario");

export default {
  name: 'home',
  components: {
    VCardWidget
  },

  data: () => ({
    headers: [
      {
        text: 'Nome',
        align: 'left',
        value: 'nome',
      },
      { text: 'Email', value: 'email' }
      ,
      { text: 'Habilitado', value: 'habilitado' }
    ],
    usuarios :[]
  }),

  created() {
    console.log('home');
    usuarioRepo.getAll().then(res => {
      this.usuarios = res.data;
    }).catch(console.error);
  },

  computed: {

  },

  methods: {

  }

}
</script>
