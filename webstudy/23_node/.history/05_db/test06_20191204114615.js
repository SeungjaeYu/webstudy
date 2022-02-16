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
       set  writer = ?,
             title = ?,
           content = ?
     where      no = ?     
`;

con.query(sql, ['쾌우석', '버거킹', '갑시다', 4], (err, {writer, title, content, no}) => {
    if (err) {
        console.log(err);
        throw err;
    }
});
