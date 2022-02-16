class Buttons extends React.Component {
    render() {
           return React.createElement (
                "div", {
                       id: "buttons",
                       className: "test"
                },
                React.createElement (LikeBtn),
                React.createElement (HateBtn)
            )
    }
}