const http = require("http");

module.exports = function () {
    return {
        listen(port, fn) {
            http.createServer().listen(port, fn);
        }
    }
}