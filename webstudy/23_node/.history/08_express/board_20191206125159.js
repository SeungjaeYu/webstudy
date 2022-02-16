const express = require("express");
const router = express.Router();

router.get("/", (req, res) => res.send("게시판 루트 경로"));
router.get("/list", (req, res) => res.send("게시판 목록 경로"));
router.get("/write-form", (req, res) => res.send("게시판 등록폼 경로"));
router.get("/write", (req, res) => res.send("게시판 등록폼 경로"));

