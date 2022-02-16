function Buttons(props) {
    return (
        <div id="buttons" className="test">
                <LikeBtn />
                <HateBtn />
        </div>
     );
}

class Buttons extends React.Component {
    render() {
           return (
               <div id="buttons" className="test">
                       <LikeBtn />
                       <HateBtn />
               </div>
            );
    }
}