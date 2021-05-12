package com.koreait.board4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.koreait.board4.user.UserVO;

public class MyUtils {
	
	public static int getLoginUserPk(HttpServletRequest req) {
		if(req == null) { return 0; }		
		return getLoginUser(req).getIuser();
	}
	
	public static UserVO getLoginUser(HttpServletRequest req) {
		if(req == null) { return null; } 
		HttpSession hs = req.getSession();
		return (UserVO) hs.getAttribute("loginUser");
	}
	
	public static int getParamInt(String key, HttpServletRequest req) {
		String val = req.getParameter(key);
		int intVal = parseStringToInt(val);
		return intVal;
	}
	
	public static int parseStringToInt(String val) {
		try {
			int result = Integer.parseInt(val);
			return result;
		} catch(Exception e) {
			return 0;
		}
	}
	
	public static void openJSP(String fileNm, HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String jsp = "/WEB-INF/view/" + fileNm + ".jsp";
		req.getRequestDispatcher(jsp).forward(req, res);
	}
	
	
}
