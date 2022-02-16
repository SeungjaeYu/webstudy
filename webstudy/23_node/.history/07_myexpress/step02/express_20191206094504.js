module.exports = app();

function app() {
    return {
        function get() {
            console.log("get() 호출");
        }
    }
}