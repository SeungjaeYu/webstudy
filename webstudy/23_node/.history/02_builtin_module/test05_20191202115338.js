// 해쉬 암호화 모듈 : crypto
const crypto = require("crypto");
// md5, sha1, sha256, sha512
let sha1 = crypto.createHash("sha1");

let msg = "sdfnsdlkfnkl";

sha1.update(msg);

// hex, binary, base64
let output = sha1.digest("hex");
console.log("msg : %s", msg);
console.log("digest msg : %s", output);



