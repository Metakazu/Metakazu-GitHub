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


@WebServlet("/lend")
public class lend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dvdId = request.getParameter("lendDvd");
		int dvdIdInteger = 0;
		
		if(dvdId!= null) {
			
			dvdIdInteger = Integer.parseInt(dvdId);
		}
		if(dvdIdInteger!=0) {
			
			DVDDao.lendDVD(dvdIdInteger); 
			List<DVD> dvds = DVDDao.viewDVD(1);
			request.setAttribute("dvds", dvds);
		}else {
			List<DVD> dvds = DVDDao.viewDVD(1);
			request.setAttribute("dvds", dvds);
		}
		request.setAttribute("dvdIdInteger", dvdIdInteger);
		request.getRequestDispatcher("/view/lendDVD.jsp").forward(request, response);
	}
		
		
		
		
	}



