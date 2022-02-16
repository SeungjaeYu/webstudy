const http = require("http");
const url = require("url");

const server = http.createServer((req, res) => {
    let urlInfo = url.parse(req.url, true);
    if (req.method === "GET") {

    } else if (req.method === "POST") {
        진짜 개졸림 어제 2시간잠 5시에 자서 7시에일어남
    }

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
