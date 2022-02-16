class LikeBtn extends React.Component {
    render() {
       return (
        <button onclick="alert('좋아용ㅎㅎ');" id="hateBtn">Like</button>
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