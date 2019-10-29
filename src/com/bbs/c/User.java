package com.bbs.c;

import com.bbs.b.UserDAO;

public class User {
	public boolean login(String u, String p) {
		// 查询用户是否存在
		UserDAO ud = new UserDAO();
		if (ud.id(u)) {
			String pp = ud.getPasswordByUsername(u);
			if (p.equals(pp)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean reg(String u, String p1, String p2, String wen, String da) {
		UserDAO ud = new UserDAO();
		if (p1.equals(p2)) {
			if (ud.id(u)) {
				return false;
			} else {
				if (ud.insertReg(u, p1, wen, da)) {
					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}
}