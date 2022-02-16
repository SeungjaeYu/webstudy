const http = require("http");


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
