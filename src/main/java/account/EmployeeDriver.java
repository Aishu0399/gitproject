package account;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import account.dao.EmployeeDao;
import account.dao.EmployeeDaoImpl;
import account.dto.Employee;
import account.service.EmployeeService;
import account.service.EmployeeServiceImpl;

public class EmployeeDriver{
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		EmployeeService employeeService =new EmployeeServiceImpl(employeeDao);
		
		public void insertEmployeeWithValues(Employee emp) {
			Connection conn= null;
			try {
				conn = DBUtil.getDBConnection();
				
				String sql = "Insert into emp values(?,?,?,?,?,?,?,?)";
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, emp.getEmpNo());
				pstmt.setString(2, emp.getEmpName());
				pstmt.setDouble(3, emp.getSalary());
				pstmt.setInt(4, emp.getDeptNo());
				pstmt.setString(5, emp.getJob());
				pstmt.setDate(6, Date.valueOf(emp.getHireDate()));
				pstmt.setDouble(7, 0.0);
				pstmt.setInt(8, emp.getMgr());
				
				int count = pstmt.executeUpdate();
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(conn!=null)
				{
					try {
						conn.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
	
			
		}
		
	}
}