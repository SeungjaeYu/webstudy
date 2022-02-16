const mysql = require("mysql");
const con = mysql.createConnection({
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});
con.connect();
const sql = `
    insert into tb_board(writer, title, content)
    values (?, ?, ?)
`;
con.query(sql, ['test4', '연습4', '성공'], (err, result) => {
    if(err) {
        con.end();
        throw err;
    }
    console.log("게시글 등록 성공이 성공...");
    console.log(result.insertId);
    console.log(result.affactedRows);

});
