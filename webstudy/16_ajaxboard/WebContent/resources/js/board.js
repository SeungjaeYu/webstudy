/**
 * 댓글 목록 가져오는 Ajax
 * @returns
 */




function commentListAjax() {
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = () => {
		if (xhr.readyState === 4 && xhr.status === 200) {
			makeCommentList(JSON.parse(xhr.responseText));
		}
	};
	xhr.open("GET", "comment_list.do?no=" + no, true);
	xhr.send();
};

commentListAjax();


function commentDeleteAjax(commentNo) {
 
//		e.id.substr(2);
//	console.log(commentNo);
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = () => {
		if (xhr.readyState === 4 && xhr.status === 200) {
			makeCommentList(JSON.parse(xhr.responseText));
		}
	};
	xhr.open("GET", "comment_delete.do?no=" + no + "&commentNo=" + commentNo, true);
	xhr.send();
}






function makeCommentList(list) {
	
	let commentList = document.getElementById("commentList");
	let html = "<table>";
	for (let i = 0; i < list.length; i++) {
		let comment = list[i];
		html +=`
		<tr id=${comment.commentNo}>
			<td>${comment.writer}</td>
			<td>${comment.content}</td>
			<td>${comment.regDate}</td>
			<td>
				
				<a href="#" onclick="commentDeleteAjax(${comment.commentNo});">삭제</a>
				
				
				<a href="#" onclick="commentUpdateAjax(${comment.commentNo})">수정</a>
				
				
				
			</td>
		</tr>
		`;
	}
	
	//id="cd${comment.commentNo}"
	html += "</table>";
	
	commentList.innerHTML = html;
	
	
	// 삭제링크 이벤트 설정
//	let delList = document.querySelectorAll(".cd");
//	for (let i = 0 ; i < delList.length; i++) {
//		delList[i].addEventListener("click", (e) => {
//			commentUpdateAjax;
//		});
//	}
	
	
}





function commentRegistAjax() {
	
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = () => {
		if (xhr.readyState === 4 && xhr.status === 200) {
			makeCommentList(JSON.parse(xhr.responseText));
		}
	};
	xhr.open("POST", "comment_regist.do", true);
	xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	let f = document.crForm;
	xhr.send(`no=${no}&writer=${f.writer.value}&content=${f.content.value}`);
	f.writer.value = "";
	f.content.value = "";
	return false;
}


