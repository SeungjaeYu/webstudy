class Count extends React.Component {
// props 에서 count의 값을 가져와서 컴포넌트의 state에 설정
    constructor(props) {
        super(props);
        console.log(this);
        // props 에서 count의 값을 가져와서 컴포넌트의 state에 설정
        this.state = {
            count: props.count
        }
    }

    changeCount() {
        console.log(this);
        this.setState({
            count: this.state.count + 1
        });
      
    }

    render() {
        console.log("ㅎㅇ");
        return (
            <div>
                <p>클릭된 횟수 : {this.state.count} 번</p>
                <button 
                    /*
                    onClick={function() {
                        console.log(this);
                        //alert("ㅂㅇ");
                        //  this.state.count = this.state.count + 1; (X);
                        this.setState({
                            count: this.state.count + 1
                        });

                    }}
                    */
                   /*
                    onClick={() => {
                        console.log(this);
                        //alert("ㅂㅇ");
                        //  this.state.count = this.state.count + 1; (X);
                        this.setState({
                            count: this.state.count + 1
                        });

                    }}
                    */
                   /*
                    // this 해결 - bind 함수를 이용한 this 지정하기
                    onClick={
                        function() {
                            console.log(this);
                            this.setState({
                                count: this.state.count + 1
                            });
                        
                        }.bind(this)
                    }
                */
                // 클릭시 처리할 이벤트 함수 외부 함수 호출..
                //  onClick={this.changeCount}
                // 호출시 this 설정
               // onClick={this.changeCount.bind(this)}
                >클릭</button>
            </div>
        );
    }
}