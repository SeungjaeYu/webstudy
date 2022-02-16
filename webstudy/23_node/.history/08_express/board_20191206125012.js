const express = require("express");
const router = express.Router();

router.get("/", (req, res) => console.log("게시판 뤁 경로"));

