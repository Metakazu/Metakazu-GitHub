package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DVD;
import model.DVDDao;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<DVD> dvds = DVDDao.viewDVD(1);
		request.setAttribute("dvds", dvds);

		RequestDispatcher rd = request.getRequestDispatcher("/view/delete.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String[] dvdIds = request.getParameterValues("dvdId");

		for (String id : dvdIds) {
			DVDDao.deleteDVD(Integer.parseInt(id));
		}
		String msg = "成功删除" + dvdIds.length + "张DVD";
		request.setAttribute("msg", msg);

		List<DVD> dvds = DVDDao.viewDVD(1);
		request.setAttribute("dvds", dvds);

		RequestDispatcher rd = request.getRequestDispatcher("/view/delete.jsp");
		rd.forward(request, response);
	}
}
