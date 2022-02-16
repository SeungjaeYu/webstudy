/**
 *  사용자 생성
 * 
 *  권한 부여
 * 
 *  MySQL 데이터 접속하기
 * 
 *  1. 외부 모듈 설치하기
 *     npm install mysql
 *  
 *  2. 모듈 사용하기
 *     const mysql = require("mysql");
 * 
 *  const a = [];
 *  a.push("aa") => 가능
 *  a = .. => 불가능
 */

 const mysql = require("mysql");
 let con = mysql.createConnection({
     host: "localhost",
     port: 3306,
     user: "bit2019",
     password: "bit2019"
 });

 con.connect((err) => {
    if (err) {
        console.log("연결시 에러가 발생했습니다.");
        console.log(err.stack);
    }
 });
