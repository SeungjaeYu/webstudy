const http = require("http");


module.exports = function () {
    const server;
    return {
        
        get(urlPath, cb) {
            server = http.createServer(cb());
        },
        
        post() {
            
        }
        listen(port, fn) {
            server.listen(port, fn);
        },
    }
}
