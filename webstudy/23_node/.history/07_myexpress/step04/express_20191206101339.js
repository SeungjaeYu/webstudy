const http = require("http");
const url = require("url");

const server = http.createServer((req, res) => {
    url.parse(req.url, ture);
    
});

module.exports = function () {
    const server;
    return {
        get(urlPath, cb) {
            server = http.createServer(cb);
        },
        
        post(urlPath, cb) {
            
        },
        listen(port, fn) {
            server.listen(port, fn);
        }
    }
}
