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
        
    }
});
