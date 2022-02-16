const http = require("http");
const url = require("url");
const qs = require("querystring");

const getMap = [];
const postMap = [];
const middleware = [];

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
    // 미들웨어 실행하기
    for (let i of middleware) {
        i(req, res);
    }

    if (req.method == "GET") {
        cb(req[que], res);
        return;
    } else if (req.method === "POST") {

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
            middleware.push(cb);
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
