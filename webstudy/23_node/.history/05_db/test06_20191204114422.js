const mysql = require("mysql");
const con = mysql.createConnection({
    host: "localhost",
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});

con.connect();

const sql = `
    update tb_board
       set writer = ?,
            title = ?,
           content
`;