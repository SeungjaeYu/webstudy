/**
 *  함수 내애서의 호이스팅
 * 
 */
function func() {
    //var i;
    //var msg
    var i = 100;
    if (i % 2 === 0) {
        var msg = "짝수";
    }
    console.log("k : ", k);
    for (var k = 0; k < 5; k++) {
        console.log(`${i} : ${k} : ${msg}`);
    }
    console.log("k : ", k);

}
func();