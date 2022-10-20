package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DVD;
import model.DVDDao;

/**
 * Servlet implementation class selectDVD
 */
@WebServlet("/selectDVD")
public class selectDVD extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<DVD> dvds = DVDDao.viewDVD(-1);
		request.setAttribute("dvds", dvds);

		request.getRequestDispatcher("/view/selectDVD.jsp").forward(request, response);

	}

}