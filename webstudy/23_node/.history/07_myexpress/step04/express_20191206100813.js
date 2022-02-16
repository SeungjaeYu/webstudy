const http = require("http");

const server;

module.exports = function () {
    const server;
    return {
        listen(port, fn) {
            server.listen(port, fn);
        },

        get(urlPath, cb) {
            server = http.createServer(cb());
        },

        post() {

        }
    }
}
