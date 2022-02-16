import './style/style.css';
import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import YoutubeAjax from "./module/youtube-ajax-search";
import SearchBar from './components/search-bar';
import VideoList from './components/video-list';
import VideoDetail from './components/video-detail';

class App extends Component {
  videoSearch(searchWord) {
    // 유튜브 검색 API 호출하기
    YoutubeAjax(searchWord, videos => {
      console.log("------------------------------------------------");
      console.dir(videos);
      console.log("------------------------------------------------");
    });
  }
  render() {
    this.videoSearch("자바");
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
