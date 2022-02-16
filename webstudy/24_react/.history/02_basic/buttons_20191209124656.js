class Buttons extends React.Component {
    render() {
           return e(
                "div", {
                       id: "buttons",
                       className: "test"
                },
                e (LikeBtn),
                e (HateBtn)
            )
}