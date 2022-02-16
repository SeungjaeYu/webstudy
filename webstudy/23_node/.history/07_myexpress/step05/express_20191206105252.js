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
    if (cb == null) {
        error404(req, res);
        return;
    }
    cb(req, res);

});
function error404(req, res) {
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.end("<h2>404 - Not Found</h2>");
}

module.exports = function () {
    return {
        use(cb) {
            
        },
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
