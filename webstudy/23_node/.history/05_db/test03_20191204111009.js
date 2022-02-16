const mysql = require("mysql");
const con = mysql.createConnection({
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});
con.connect();
const sql = `
    select no, title, writer
      from tb_board
     order by no desc 
`;
con.query(sql, (err, result, fields) => {
    if (err) {
        con.end();
        throw err;
    }
    console.log("결과 확인");
    /*
    for (let i = 0; i < result.length; i++) {
        let row = result[i];
        console.log(i, row.no, row.writer, row.title);
    }
    */
   /*
    result.forEach(function (row) {
        console.log(row.no, row.writer, row.title);
    })
    */
   
    result.forEach(row => console.log(row.no, row.writer, row.title));
    
    for (let i = 0; i < result.length; i++) {
        let {no, wrtier, title} = result[i];
        console.log(no, writer, title);
    }


    con.end();
});
