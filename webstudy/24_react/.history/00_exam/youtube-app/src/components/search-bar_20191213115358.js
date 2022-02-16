import React, { Component } from 'react';

class SearchBar extends Component {
  constructor(props) {
    super(props);
    this.state = {
      searchWord: ""
    };
  }
  onInputChange() {
    this.setState({s});
    this.props.onSearchChange(searchWord);
  }
  render() {
    return (
      <div className="search-bar">
        <input placeholder="검색어를 입력하세요"
               value={this.state.searchWord}
               onChange={event => {
                    this.onInputChange(event.target.value);
               }}/>
      </div>
    );
  }
}


export default SearchBar;
