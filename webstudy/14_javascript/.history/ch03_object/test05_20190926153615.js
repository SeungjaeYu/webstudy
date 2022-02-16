/**
 *  객체는 연관된 데이터를 묶어서 관리한다.
 *  
 */
let member = {
    id: "hong",
    name: "홍길동",
    setId: function (id) {
        this.id = id;
    },
    getId: function() {
        return this.id;
    }
 };
 console.log