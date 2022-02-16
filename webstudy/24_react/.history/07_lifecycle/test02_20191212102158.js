class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            cnt: props.cnt
        };
        this.plus = this.plus.bind(this);
        this.minus = this.minus.bind(this);
        this.zero = this.zero.bind(this);

    }
    plus() {
        this.setState({
            cnt: this.state.cnt + 1
        })
    }
    minus() {
        this.setState({
            cnt: this.state.cnt - 1
        })
    }
    zero() {
        this.setState({
            cnt: 0
        })
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
                <div>
                    <button onClick={this.plus}>증가</button>
                    <button onClick={this.minus}>감소</button>
                    <button onClick={this.zero.bind(this)}>0</button>
                </div>
                <h1>{this.state.cnt}</h1>
            </div>
        );
    }
    /*
        DOM 정보를 활용할 수 있음
        외부 api의 호출 결과 처리, event 처리, setState처리.. -> 가장 마지막에 호출되기 때문에 다양한 처리가 가능하다.
    */

    componentDidUpdate() {
        console.log('componentDidMount');
    }
}
