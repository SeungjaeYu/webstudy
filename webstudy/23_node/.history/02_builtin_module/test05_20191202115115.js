// 해쉬 암호화 모듈 : crypto
const crypto = require("crypto");
// md5, sha1, sha256, sha512
let sha1 = crypto.createHash("sha1");

let msg = "쾌우석 개변태";

sha1.update(msg);

// hex, binary, base64
sha1.digest("hex");


