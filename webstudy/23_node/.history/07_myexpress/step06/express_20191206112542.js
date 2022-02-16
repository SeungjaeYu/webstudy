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
        req.query = urlInfo.query;
        cb(req, res);
        return;
    } else if (req.method === "POST") {
        let param = "";
        req.on("data", (data) => {
            param += data;
        });
        req.on("end", () => {
            req.body] = qs.parse(param);    // "name=홍길동&age=11 => 객체로 변환"
            cb(req, res);
        });
        return;
    }

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
