/**
 *  디폴트 파라미터
 * 
 */
function func(num1, num2) {
    /*
    if (!num1) num1 = 0;
    if (!num2) num2 = 0;
    */
    num1 = num1 || 0;
    console.log(num1 + num2);
}
func();
func(100);
func(100, 200);