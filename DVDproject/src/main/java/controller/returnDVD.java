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

@WebServlet("/returnDVD")
public class returnDVD extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dvdId = request.getParameter("returnDvd");
		int dvdIdInteger = 0;

		//		DVD dvd=null;
		if (dvdId != null) {

			dvdIdInteger = Integer.parseInt(dvdId);
		}
		if (dvdIdInteger != 0) {

			DVDDao.returnDVD(dvdIdInteger);
			List<DVD> dvds = DVDDao.viewDVD(0);
			request.setAttribute("dvds", dvds);
			
			DVD cost = DVDDao.selectCostById(dvdIdInteger);
			request.setAttribute("cost", cost.getCost()+"円");

		} else {
			List<DVD> dvds = DVDDao.viewDVD(0);
			request.setAttribute("dvds", dvds);
		}
		request.setAttribute("dvdIdInteger", dvdIdInteger);
		request.getRequestDispatcher("/view/returnDVD.jsp").forward(request, response);
	}

}
