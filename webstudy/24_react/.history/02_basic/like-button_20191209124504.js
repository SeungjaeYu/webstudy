class LikeBtn extends React.Component {
    render() {
       return  e(
             "button", {
                 onClick: () => ("좋아용ㅎㅎ"),
                 id: "likeBtn"
             },
             "Like"
         )
    }