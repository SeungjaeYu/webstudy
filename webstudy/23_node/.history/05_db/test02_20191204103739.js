const mysql = require("mysql");
// host, port 생략가능(localhost, 3306)
const con = mysql.createConnection({
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});
con.connect();
con.query



