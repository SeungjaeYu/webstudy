import './style/style.css';
import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import YoutubeAjax from './module/youtube-ajax-search';
import SearchBar from './components/search-bar';
import VideoList from './components/video-list';
import VideoDetail from './components/video-detail';
import produce from 'immer';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            videos: [],
            selectedVideo: null,
        };
        this.videoSearch = this.videoSearch.bind(this);
        this.videoSearch('자바');
    }

    videoSearch(searchWord) {
        // 유튜브 검색 API 호출하기
        YoutubeAjax(searchWord, videos => {
            this.setState({
                videos: videos,
                selectedVideo: videos[0]
            });
        });
    }
    render() {
        return (
            <div>
                <SearchBar onSearchChange={this.videoSearch} />
                <VideoDetail video={this.state.selectedVideo} />
                <VideoList videos={this.state.videos} onVideoSelect={() => {}} />
            </div>
        );
    }
}

ReactDOM.render(<App />, document.querySelector('#root'));
