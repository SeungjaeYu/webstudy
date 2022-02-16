class App extends React.Component {
    constructor(props) {
        super(props);
        console.log('constructor');
        this.state = {
            
        };
    }

    static getDerivedStateFromProps(props, state) {
        console.log('getDerivedStateFromProps');
        return null;
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
