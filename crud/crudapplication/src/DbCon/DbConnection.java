package DbCon;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Employee;

public class DbConnection {
	Connection con;

	public DbConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://192.168.110.48/postgres", "plf_training_admin",
					"pff123");
			System.out.println("Connection Established");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Employee> getFirstEmp() throws Exception {
		ArrayList<Employee> are = new ArrayList<>();
		CallableStatement cs = con.prepareCall("{call getFirstEmp()}");
		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			Employee e = new Employee();
			e.setEmpid(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setDepartment(rs.getString(3));
			e.setPhno(rs.getString(4));
			e.setHdate(rs.getDate(5));
			e.setDesignation(rs.getString(6));
			are.add(e);
		}
		return are;

	}

	public ArrayList<Employee> getLastEmp() throws Exception {
		ArrayList<Employee> are = new ArrayList<>();
		CallableStatement cs = con.prepareCall("{call getLastEmp()}");
		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			Employee e = new Employee();
			e.setEmpid(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setDepartment(rs.getString(3));
			e.setPhno(rs.getString(4));
			e.setHdate(rs.getDate(5));
			e.setDesignation(rs.getString(6));
			are.add(e);
		}
		return are;

	}

	public ArrayList<Employee> getAllEmp() throws Exception {
		ArrayList<Employee> are = new ArrayList<>();
		CallableStatement cs = con.prepareCall("{call getAllEmp()}");
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {
			Employee e = new Employee();
			e.setEmpid(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setDepartment(rs.getString(3));
			e.setPhno(rs.getString(4));
			e.setHdate(rs.getDate(5));
			e.setDesignation(rs.getString(6));
			are.add(e);
		}
		return are;
	}
}