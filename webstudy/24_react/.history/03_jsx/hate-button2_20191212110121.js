function HateBtn(props) {
  return (
    <button onClick={() => alert('싫어용ㅎㅎ')} id="hateBtn">Hate</button>
  );
}

class HateBtn extends React.Component {
    render() {
      return (
          <button onClick={() => alert('싫어용ㅎㅎ')} id="hateBtn">Hate</button>
        );
   }
}