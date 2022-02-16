function Count(props) {
    let [count, setCount] = React.useState(props.count);   // 16.8버전 이후부터 사용 가능

    return (
        <div>
            <p>클릭된 횟수 : {count} 번 </p>
            <button onClick={() => setCount(count + 1)}>클릭</button>
        </div>
    )
}
