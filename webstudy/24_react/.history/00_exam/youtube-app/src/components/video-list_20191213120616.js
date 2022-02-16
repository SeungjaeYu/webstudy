import React from 'react';
import VideoListItem from './video-list-item';

const VideoList = props => {
  
  const videoItems = [1, 2, 3, 4, 5].map(video => {
    return <VideoListItem key={video} />;
  });

  return <ul className="col-md-4 list-group">{videoItems}</ul>;
};

export default VideoList;
