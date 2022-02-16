const mysql = require("mysql");
// host, port 생략가능(localhost, 3306)
const con = mysql.createConnection({
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});
con.connect();

createTable();
function createTable() {
    let sql = `
        create table tb_board(
            no int(10) auto_increment primary key,
            writer varchar(30) not null,
            title varchar(300) not null,
            content varchar(300) not null,
        )
    `;
    con.query();

}
function insertData() {

}
con.query();



