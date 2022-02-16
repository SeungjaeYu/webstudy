const http = require("http");
const url = require("url");

const server = http.createServer((req, res) => {
    req.url
});

module.exports = function () {
    const server;
    return {
        get(urlPath, cb) {
            server(cb);
        },
        
        post(urlPath, cb) {
            
        },
        listen(port, fn) {
            server.listen(port, fn);
        }
    }
}
