class Employee
{
	static long empId;
	static String empName;
	static String empAdd;
	static long empPno;
	static double basicSalary;
	static double specailAllownces = 250.80;
	static double HRA = 1000.10;
	
    public long getEmpId()
    {
    	return empId;
    }
    public void setEmpId(long id)
    {
    	Employee.empId=id;
    }
    public String getEmpName()
    {
    	return empName;
    }
    public void setEmpName(String Name)
    {
    	Employee.empName=Name;
    }
    public String getEmpAdd()
    {
    	return empAdd;
    }
    public void setEmpAdd(String address)
    {
    	Employee.empAdd=address;
    }
    public long getEmpph()
    {
    	return empPno;
    }
    public void setEmpPhone(long phone)
    {
    	Employee.empPno=phone;
    }
    public void calculateSalary()
    {
    	double salary = basicSalary + (basicSalary + specailAllownces/100 +(specailAllownces * HRA/100));
    	System.out.println(salary);
    }
}

class Boss extends Employee
{
	public double getbasicSalary()                   
	{
		return basicSalary;
	}
	public void setBasicSalary(double basicsalary)
	{
		Boss.basicSalary=basicsalary;
	}
}

class Trainee extends Employee
{
	public double getbasicSalary()                   
	{
		return basicSalary;
	}
	public void setBasicSalary(double basicsalary)
	{
		
		Trainee.basicSalary=basicsalary;
	}
}	

public class Inheritance_Activity extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Boss obj_boss = new Boss();
    Trainee obj_trainee = new Trainee();
    
    obj_boss.setEmpId(900032);
    obj_boss.setEmpName("Divesh Verma");
    obj_boss.setEmpAdd("123 street,Boston");
    obj_boss.setEmpPhone(9897889);
    obj_boss.setBasicSalary(34000);
    obj_boss.calculateSalary();
	}
}
