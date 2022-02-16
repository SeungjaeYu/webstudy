/**
 *  특정 시간 뒤에 함수를 실행
 *  id = setTimeout(함수, 밀리세컨드)
 *  clearTimeout(id)
 */

 function func() {
     let d = new Date();
     let time = d.toLocaleTimeString();
     console.log(time);

     let id = setTimeout(func, 1000);
     //clearTimeout(id);
 }
 func();

