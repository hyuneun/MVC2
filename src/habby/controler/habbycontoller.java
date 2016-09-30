package habby.controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import habby.model.HabbyModel;

//@WebServlet("habby.do")
//@WebServlet({"habby.do"})
public class habbycontoller extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String habby = request.getParameter("habby");
		
		//모델호출
		HabbyModel model = HabbyModel.getInstance();
		ArrayList<String> list = model.getHobby(habby);
		request.setAttribute("data", list);
		String viewName = "/view/habby_view.jsp";
		
		//뷰호출
		request.getRequestDispatcher(viewName).forward(request, response);
	}

}
