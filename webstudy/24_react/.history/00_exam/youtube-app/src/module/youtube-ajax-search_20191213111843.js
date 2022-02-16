import axios from "axios";

export default function(searchWord, callback) {
    let params = {
        part: "snippet",
        q: searchWord,
        type: video,
key: 
    };
    axios.get("https://www.googleapis.com/youtube/v3/search", params);
}