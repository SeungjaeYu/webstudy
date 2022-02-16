class LikeBtn extends React.Component {
    render() {
       return (
        <button onclick="alert('싫어용');" id="hateBtn">Hate</button>
       ) React.createElement (
             "button",
             {
                 onClick: () => ("좋아용ㅎㅎ"),
                 id: "likeBtn"
             },
             "Like"
         )
    }
}