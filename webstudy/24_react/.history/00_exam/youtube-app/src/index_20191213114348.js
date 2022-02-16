import './style/style.css';
import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import YoutubeAjax from "./module/youtube-ajax-search";
import SearchBar from './components/search-bar';
import VideoList from './components/video-list';
import VideoDetail from './components/video-detail';

class App extends Component {
  videoSearch() {
    YoutubeAjax("자바", videos => {
      console.log("------------------------------------------------");
      console.dir(videos);
      console.log("------------------------------------------------");
    });
  }
  render() {
    // 유튜브 검색 API 호출하기
   
    return (
      <div>
        <SearchBar />
        <VideoDetail />
        <VideoList />
      </div>
    );
  }
}

ReactDOM.render(<App />, document.querySelector('#root'));
