// test.txt 파일의 내용을 읽어서 testcopy.txt에 저장(비동기 방식을 처리)

fs.readFile("test.txt", "utf-8", (err, data) => {
    if (err) {  // 에러가 존재 할 경우
        console.log("파읽 읽기 중 에러 발생");
        console.log(err);
        return;
    }
    // 정상적으로 파일을 읽은 경우
    console.log("비동기 읽은 데이터");
    console.log(data);
});