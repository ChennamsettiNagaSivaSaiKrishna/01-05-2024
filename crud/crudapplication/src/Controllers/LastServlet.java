package Controllers;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import DbCon.DbConnection;
import Model.Employee;

@WebServlet("/LastServlet")
public class LastServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			DbConnection dc = new DbConnection();
			ArrayList<Employee> are = dc.getLastEmp();
			JSONObject ob = new JSONObject();
			ob.put("employees", are);
			res.getWriter().write(ob.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
