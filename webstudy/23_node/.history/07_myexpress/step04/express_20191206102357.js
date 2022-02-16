const http = require("http");
const url = require("url");
const getMap = [];
const postMap = [];

const server = http.createServer((req, res) => {
    let urlInfo = url.parse(req.url, true);
    let cb = null;
    if (req.method === "GET") {
        cb = getMap[urlInfo.pathname];
    } else if (req.method === "POST") {
        cb = postMap[urlInfo.pathname];
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
