import React from 'react';

const VideoListItem = ({video}) => {
  return (
    <li className="list-group-item">
      <div className="video-list media">
        <div className="media-left">
          <img className="media-object" src="" title="이미지" />
        </div>
        <div className="media-body">
          <div className="media-heading">비디오 제목</div>
        </div>
      </div>
    </li>
  );
};
export default VideoListItem;
