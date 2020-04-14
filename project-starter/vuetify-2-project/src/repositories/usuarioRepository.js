import Repository from "./Repository";

const resource = "/usuarios";

export default {
    getByAutenticacao() {
        return Repository.get(`${resource}/usuario`);
    },

    getAll() {
      return Repository.get(`${resource}`)
    },

    getById(id) {
        return Repository.get(`${resource/id}`)
    }
}
