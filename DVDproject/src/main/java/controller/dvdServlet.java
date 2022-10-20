package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DVDDao;

/**
 * Servlet implementation class dvdServlet
 */
@WebServlet("/dvdServlet")
public class dvdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String DVDName = request.getParameter("DVD_Name");
		DVDDao.addDVD(DVDName);
		
		String msg = "成功新增DVD《" + DVDName + "》";
		request.setAttribute("msg", msg);

		RequestDispatcher rd = request.getRequestDispatcher("/view/insertDVD.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String DVDName = request.getParameter("DVD_Name");

		DVDDao.addDVD(DVDName);
		String msg = "成功新增DVD《" + DVDName + "》";
		request.setAttribute("msg", msg);

		RequestDispatcher rd = request.getRequestDispatcher("/view/insertDVD.jsp");
		rd.forward(request, response);
	}
}
