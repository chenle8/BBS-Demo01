package com.bbs.a;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.c.User;

public class loginS extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 接收用户名密码
		req.setCharacterEncoding("UTF-8");
		String s1 = req.getParameter("u");
		String s2 = req.getParameter("p");
		// 不处理数据、跳转
		User user = new User();
		if (user.login(s1, s2)) {
			resp.sendRedirect("main.jsp");
		} else {
			resp.sendRedirect("login.jsp");
		}
	}

}
