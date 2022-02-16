class ClickButton extends React.Component {
            

    // 없어도 상관이 없음
    /*
    constructor(props) {
        super(props);
        //  this.props = props;
        console.log(props);
        //  props.msg = "aaaa"; // 변경 불가
    }
    */
    render() {
        return (
            <button {} id={this.props.id}>
                {this.props.msg}
            </button>
        );
    }
}