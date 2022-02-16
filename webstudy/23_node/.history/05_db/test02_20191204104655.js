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
            content varchar(1000) not null,
            reg_date datetime default now()
        )
    `;
    con.query(sql, (err, result) => {
        if (err) {
            con.end();
            throw err;
        }
        console.log("tb_board 테이블 생성 완료");
        insertData();
    });

}
function insertData() {
    let sql = `
        insert into tb_board(writer, title, content)
        values ('tester1', '연습1', 'mysql node1'),
               ('tester2', '연습2', 'mysql node2'),
               ('tester3', '연습3', 'mysql node3')
    `;
    con.query(sql, (err, result) => {
        if (err) {
            con.end();
            throw err;
        }
        console.log("tb_board 데이터 생성 완료");
        con.end();
    });
}
con.query();



