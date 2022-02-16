const mysql = require("mysql");
const con = mysql.createConnection({
    host: "localhost",
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});

con.connect();
const sql = `
    delete from u
`;

con.query()