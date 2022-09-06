public class Employee {
	private String empId;
	private int empCode;
	private String name;
	private String nic;
	private String address;

	public Employee(String empId, int empCode, String name, String nic, String address) {
		super();
		this.empId = empId;
		this.empCode = empCode;
		this.name = name;
		this.nic = nic;
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public boolean equals(Object obj)
	{
		Employee obj1=(Employee)obj;
		if (obj1.getEmpId()==this.empId)
			{
				return true;
			}
		else
		{
			if (obj1.getEmpCode()==this.empCode) 
				{
					return true;
				}
		else
		{	
			return false;
		}
		}
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ","
				+ "" + " empCode=" + empCode + ","
				+ "" + " name=" + name + ","
				+ "" + " nic=" + nic
				+ "," + " address=" + address + "]";
	}
}
		
