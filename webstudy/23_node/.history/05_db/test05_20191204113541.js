const mysql = require("mysql");
const con = mysql.createConnection({
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});
con.connect();
const sql = `
    insert into tb_board() no, title, writer
      from tb_board
     order by no desc 
     limit ?, ?
`;
