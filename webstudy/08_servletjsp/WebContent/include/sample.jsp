<%-- 
	지시자 include
	XML 기반 include
	jstl 기반 include

 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<% 
request.setCharacterEncoding("utf-8");
String msg = "include"; 
%>    
	<h2>Sample 페이지</h2>
	<h3>msg1 : ${param.msg1}</h3>
	<h3>msg2 : ${param.msg2}</h3>