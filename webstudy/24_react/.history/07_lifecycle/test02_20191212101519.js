class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            cnt: props.cnt
        };
    }
 

    render() {
        console.log('render');
        return (
            <div>
                <div>
                    <button onClick={}>증가</button>
                    <button onClick={}>증가</button>
                </div>
                <h1>호출되는 라이프사이클 확인하자..</h1>
            </div>
        );
    }
    /*
        DOM 정보를 활용할 수 있음
        외부 api의 호출 결과 처리, event 처리, setState처리.. -> 가장 마지막에 호출되기 때문에 다양한 처리가 가능하다.
    */

    componentDidMount() {
        console.log('componentDidMount');
    }
}
