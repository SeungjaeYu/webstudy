const http = require("http");

module.exports = function () {
    const server = http.createServer((req, res) => {
        res.end();
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
