class HateBtn extends React.Component {
    render() {
      return  e(
            "button", 
            {
                onClick: () => ("싫어용ㅎㅎ"),
                id: "hateBtn"
            },
            "Hate"
        )
   }
}