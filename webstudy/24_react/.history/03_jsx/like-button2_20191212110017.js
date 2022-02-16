function LikeBtn(props) {
    <button onClick={() => alert('좋아용ㅎㅎ')} id="hateBtn">Like</button>
}

class LikeBtn extends React.Component {
    render() {
       return (
            <button onClick={() => alert('좋아용ㅎㅎ')} id="hateBtn">Like</button>
       );
    }
}
