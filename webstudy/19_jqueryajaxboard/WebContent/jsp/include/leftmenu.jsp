<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<nav class="main-menu">
 <div>
    <a class="logo" href="http://startific.com"></a> 
  </div> 
	<div class="settings"></div>
<div class="scrollbar" id="style-1">
<ul>
	<li>                                   
		<a href="<c:url value="/main.do" />">
		<i class="fa fa-home fa-lg"></i>
		<span class="nav-text">Home</span>
		</a>
	</li>   
	<li>                                 
		<c:choose>
		<c:when test="${empty member}">
			<a href="<c:url value="/login/loginform.do" />">
				<i class="fa fa-user fa-lg"></i>
				<span class="nav-text">Login</span>
			</a>
		</c:when>
		<c:otherwise>
			<a href="<c:url value="/login/logout.do" />">
				<i class="fa fa-user fa-lg"></i>
				<span class="nav-text">Logout</span>
			</a>
		</c:otherwise>
		</c:choose>
	</li>   
	<li>                                 
		<a href="http://startific.com">
		<i class="fa fa-envelope-o fa-lg"></i>
		<span class="nav-text">Contact</span>
		</a>
	</li>   

	<li class="darkerlishadow">
		<a href="<c:url value="/board/list.do" />">
		<i class="fa fa-clock-o fa-lg"></i>
		<span class="nav-text">Board</span>
		</a>
	</li>
  
	<li class="darkerli">
		<a href="http://startific.com">
		<i class="fa fa-desktop fa-lg"></i>
		<span class="nav-text">Technology</span>
		</a>
	</li>
	<li class="darkerli">
		<a href="http://startific.com">
		<i class="fa fa-plane fa-lg"></i>
		<span class="nav-text">Travel</span>
		</a>
	</li>
	<li class="darkerli">
		<a href="http://startific.com">
		<i class="fa fa-shopping-cart"></i>
		 <span class="nav-text">Shopping</span>
		</a>
	</li>
</ul>
<ul class="logout">
	<li>
		<a href="http://startific.com">
		<i class="fa fa-question-circle fa-lg"></i>
		<span class="nav-text">Help</span>
		</a>
	</li>   
	<li>
        <a href="http://startific.com">
              <i class="fa fa-lightbulb-o fa-lg"></i>
             <span class="nav-text">
                 BLOG 
             </span>
             
         </a>
	</li>  
</ul>
</div>
</nav>