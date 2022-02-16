let $ = mlec;

function mlec(val) {
    let elements = [];
    // val 이 "<" 로 시작하는 경우는 태그 생성
    switch(val.charAt(0)) {
        case "<" :
            // <h2>
            elements[0] = document.createElement(val.substring(1, val.length - 1));
            break;
        default :
            
    } 

    
    return elements;
}


