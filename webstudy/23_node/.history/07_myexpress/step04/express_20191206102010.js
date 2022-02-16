const http = require("http");
const url = require("url");
const getMap = [];
const postMap = [];

const server = http.createServer((req, res) => {
    let urlInfo = url.parse(req.url, true);
    if (req.method === "GET") {

    } else if (req.method === "POST") {
        
    }

});

module.exports = function () {
    const server;
    return {
        get(urlPath, cb) {
            getMap[        get(urlPath, cb) {
            ] = cb;
        },
        
        post(urlPath, cb) {
            
        },
        listen(port, fn) {
            server.listen(port, fn);
        }
    }
}
