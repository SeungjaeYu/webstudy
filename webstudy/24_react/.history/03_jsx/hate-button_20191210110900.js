class HateBtn extends React.Component {
    render() {
      return (
          <Buttons
            "button", 
            {
                onClick: () => ("싫어용ㅎㅎ"),
                id: "hateBtn"
            },
            "Hate"
        )
   }
}