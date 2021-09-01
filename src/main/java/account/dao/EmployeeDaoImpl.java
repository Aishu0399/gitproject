package account.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import account.dto.Employee;



public class EmployeeDaoImpl implements EmployeeDao {
	List<Employee> empList=new ArrayList<Employee>();
	public List<Employee> getEmployees()
	{
		System.out.println("Dao - in getEmployees");
		Employee employee=new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("hemant");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(80000);
		employee.setJob("Developer");
		empList.add(employee);
		employee=new Employee();
		employee.setEmpNo(2);
		employee.setEmpName("varsha");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(10000);
		employee.setJob("Developer");
		empList.add(employee);
		return empList;
		
		
	}
	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empList.remove(emp);
	}
	
}
