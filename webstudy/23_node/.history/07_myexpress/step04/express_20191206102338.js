const http = require("http");
const url = require("url");
const getMap = [];
const postMap = [];

const server = http.createServer((req, res) => {
    let urlInfo = url.parse(req.url, true);
    if (req.method === "GET") {
        let cb = getMap[urlInfo.pathname];
        cb(req, res);
    } else if (req.method === "POST") {
        let cb = postMap[urlInfo.pathname];
    }
    cb(req, res);

});

module.exports = function () {
    return {
        get(urlPath, cb) {
            getMap[urlPath] = cb;
        },
        post(urlPath, cb) {
            postMap[urlPath] = cb;
            
        },
        listen(port, fn) {
            server.listen(port, fn);
        }
    }
}
