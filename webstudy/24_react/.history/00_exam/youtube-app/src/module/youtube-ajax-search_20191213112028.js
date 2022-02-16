import axios from "axios";

export default function(searchWord, callback) {
    let params = {
        part: "snippet",
        q: searchWord,
        type: video,
        key: AIzaSyA7tl3r6Z7koSLNoRLd1KpOBUi1TKuzYM8
    };
    axios.get("https://www.googleapis.com/youtube/v3/search", params)
    .then(response) => {

    })
    .catch();
}