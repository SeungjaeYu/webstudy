class App extends React.Component {
    constructor(props) {
        super(props);
        console.log('constructor');
        this.state = {
            cnt: props.cnt
        };
    }

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
