class HateBtn extends React.Component {
    render() {
      return (
          <button onclick="() => ('싫어용')" id="hateBtn"></button>
            "button", 
            {
                onClick: () => ("싫어용ㅎㅎ"),
                id: "hateBtn"
            },
            "Hate"
        )
   }
}