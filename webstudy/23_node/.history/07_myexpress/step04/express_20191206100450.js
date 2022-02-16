const http = require("http");

module.exports = function () {
    const server = http.createServer((req, res) => {
       
    });
    return {
        listen(port, fn) {
            server.listen(port, fn);
        },

        get(urlPath, ) {

        },

        post() {

        }
    }
}
