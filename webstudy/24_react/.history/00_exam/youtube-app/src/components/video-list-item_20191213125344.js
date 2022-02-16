import React from 'react';

const VideoListItem = ({video, onVideoSelect}) => {
  const imgUrl = video.snippet.thumbnails.default.url;
  return (
    <li className="list-group-item" onClick={() => {

    }}>
      <div className="video-list media">
        <div className="media-left">
          <img className="media-object" src={imgUrl} title="이미지" />
        </div>
        <div className="media-body">
        <div className="media-heading">{video.snippet.title}</div>
        </div>
      </div>
    </li>
  );
};
export default VideoListItem;
