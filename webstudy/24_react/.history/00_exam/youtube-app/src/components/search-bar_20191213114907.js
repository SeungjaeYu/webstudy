import React, { Component } from 'react';

class SearchBar extends Component {
  constructor(props) {
    super(props);
  }
  render() {
    return (
      <div className="search-bar">
        <input placeholder="검색어를 입력하세요"
               onChange={event => {
          event.target.value;
        }}/>
      </div>
    );
  }
}

export default SearchBar;
