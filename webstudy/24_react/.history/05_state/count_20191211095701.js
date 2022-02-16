class Count extends React.Component {
// props 에서 count의 값을 가져와서 컴포넌트의 state에 설정
    constructor(props) {
        super(props);
        // props 에서 count의 값을 가져와서 컴포넌트의 state에 설정
        this.state = {
            count: props.count 
        }
    }

    render() {
        console.log("ㅎㅇ");
        return (
            <div>
                <p>클릭된 횟수 : this 번</p>
                <button>클릭</button>
            </div>
        );
    }
}