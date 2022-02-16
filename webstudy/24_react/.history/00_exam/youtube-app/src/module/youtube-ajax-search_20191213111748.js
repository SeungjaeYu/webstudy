import axios from "axios";

export default function(searchWord, callback) {
    let params = {
        part: "snippet",
        
    };
    axios.get("https://www.googleapis.com/youtube/v3/search", params);
}