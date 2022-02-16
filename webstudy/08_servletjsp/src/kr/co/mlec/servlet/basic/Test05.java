/**
 * 
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/basic/test05.do")
public class Test05 extends HttpServlet {

	/*
	// service(ServletReqeust, ServletResponse) 재정의
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service - ServletReqeust, ServletResponse");
	}
	*/
	
	/*
	// service(HttpServletRequest, HttpServletResponse) 재정의
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service - HttpServletReqeust, HttpServletResponse");
	}
	*/
	
	// doGet(HttpServletRequest, HttpServletResponse) 재정의
	// doPost(HttpServletRequest, HttpServletResponse) 재정의
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doGet - HttpServletReqeust, HttpServletResponse");
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Post - HttpServletReqeust, HttpServletResponse");
	}
	
	
}
