import React, { Component } from 'react';

class SearchBar extends Component {
  constructor(props) {
    super(props);
    this.state = {
      searchWord: ""
    };
    this.onInputChange = this.onInputChange.bind(this);
  }
  onInputChange(searchWord) {
    this.setState({searchWord});
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
