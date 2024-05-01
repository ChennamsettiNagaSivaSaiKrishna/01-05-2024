package Controllers;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import DbCon.DbConnection;
import Model.Employee;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			DbConnection db = new DbConnection();
			JSONObject ob = new JSONObject();
			ArrayList<Employee> Emp = db.getAllEmp();
			ob.put("employees", Emp);
			res.getWriter().write(ob.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}