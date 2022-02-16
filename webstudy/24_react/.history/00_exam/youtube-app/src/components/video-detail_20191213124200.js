import React from 'react';

const VideoDetail = ({video}) => {
  const videoId = video.id.videoId;
  const url = `"https://www.youtube.com/embed/${videoId}"`;
  return (
    <div className="video-detail col-md-8">
      <div className="embed-responsive embed-responsive-16by9">
        <iframe
          className="embed-responsive-item"
          src= {url}
        />
      </div>
      <div className="details">
        <div>{video.snik}</div>
        <div>비디오 세부 내용</div>
      </div>
    </div>
  );
};

export default VideoDetail;
