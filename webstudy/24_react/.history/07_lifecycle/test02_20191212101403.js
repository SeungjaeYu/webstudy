
    constructor(props) {
        super(props);
        this.state = {
            cnt: props.cnt
        };
    }
    /*
        사용 빈도 낮음
        return으로 Object 를 사용함
        Object의 결과가 state에 추가된다.
        만약, 추가하고 싶지 않다면 null을 반환한다. -> undefined는 오류남

        대체 : componentDidMound에서 작업 진행이 가능

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
    /*
        DOM 정보를 활용할 수 있음
        외부 api의 호출 결과 처리, event 처리, setState처리.. -> 가장 마지막에 호출되기 때문에 다양한 처리가 가능하다.
    */

    componentDidMount() {
        console.log('componentDidMount');
    }
}
