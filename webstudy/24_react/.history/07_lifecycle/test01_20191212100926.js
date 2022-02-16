class App extends React.Component {
    /*
        컴포넌트 생성시 호출
        : 안보이다가 보일때
        : 초기화 작업, state 생성

    */
    constructor(props) {
        super(props);
        console.log('constructor');
        this.state = {
            cnt: props.cnt
        };
    }
    /*
        사용 빈도 낮음
        return으로 Object 를 사용함
        Object.의 결과가 state에 추가된다.

    */

    static getDerivedStateFromProps(props, state) {
        console.log('getDerivedStateFromProps');
        //  return null;    // 컴포넌트가 가지고 있는 state에 별도 추가하지 않는다.
        return {msg: "lifecycle test"};
    }

    render() {
        console.log('render');
        return (
            <div>
                <h1>호출되는 라이프사이클 확인하자..</h1>
            </div>
        );
    }

    componentDidMount() {
        console.log('componentDidMount');
    }
}
