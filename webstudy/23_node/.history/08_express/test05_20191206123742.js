const express = require("express");
const pug = require("pug");
const bodyParser = require("body-parser");
const app = express();

// 미들웨어 설정
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));
