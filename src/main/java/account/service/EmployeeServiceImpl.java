package account.service;

import java.util.List;

import account.dao.EmployeeDao;
import account.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao empDao;
	public EmployeeServiceImpl(EmployeeDao empDao)
	{
		this.empDao=empDao;
	}
	public Employee getEmployeeById(int empId)
	{
		Employee emp=empDao.findEmployeeById(empId);
		return emp;
	}
	public List<Employee> getEmployees(){
		System.out.println("Service -In getEmployees");
		List<Employee> empList=empDao.getEmployees();
		return empList;
	}
	public List<Employee> getEmployeeByDept(){
		return null;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Employee> getEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertEmployeeWithValues() {
		// TODO Auto-generated method stub
		
	}
}
