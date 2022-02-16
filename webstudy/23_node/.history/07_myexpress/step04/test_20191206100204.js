const http = require("http");
const server = http.createServer((req, res) => {
    res.end();
});

module.exports = function () {
    return {
        listen(port, fn) {
            server.listen(port, fn);
        }
    }
}