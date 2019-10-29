package com.bbs.a;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.c.User;

public class RegS extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String s1 = req.getParameter("u");
		String s2 = req.getParameter("p1");
		String s3 = req.getParameter("p2");
		String s4 = req.getParameter("w");
		String s5 = req.getParameter("d");
		User user = new User();
		if (user.reg(s1, s2, s3, s4, s5)) {
			resp.sendRedirect("login.jsp");
		} else {
			resp.sendRedirect("reg.jsp");
		}
	}

}
