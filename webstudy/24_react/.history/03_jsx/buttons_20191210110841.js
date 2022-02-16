class Buttons extends React.Component {
    render() {
           return (
               <div id="buttons" className="test">
                   <React.Fragment>
                       <LikeBtn />
                       <HateBtn />
                   </React.Fragment>
               </div>
                "div", {
                       id: "buttons",
                       className: "test"
                },
                React.createElement (LikeBtn),
                React.createElement (HateBtn)
            )
    }
}