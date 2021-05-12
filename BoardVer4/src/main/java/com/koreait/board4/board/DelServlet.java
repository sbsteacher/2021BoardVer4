package com.koreait.board4.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board4.MyUtils;

@WebServlet("/board/del")
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	int iboard = MyUtils.getParamInt("iboard", request);
    	int iuser = MyUtils.getLoginUserPk(request);
    	    	
    	BoardVO param = new BoardVO();
    	param.setIboard(iboard);
    	param.setIuser(iuser);
    	
    	BoardDAO.delBoard(param);
    	
    	response.sendRedirect("list");
	}	
}
