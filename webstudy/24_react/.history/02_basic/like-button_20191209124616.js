class LikeBtn extends React.Component {
    render() {
       return  React.createElement (
             "button",
             {
                 onClick: () => ("좋아용ㅎㅎ"),
                 id: "likeBtn"
             },
             "Like"
         )
}