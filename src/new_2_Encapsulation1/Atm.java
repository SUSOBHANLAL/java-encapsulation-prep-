package new_2_Encapsulation1;

class Atm {
	
	private String name;
	public double phno;
	public double acno ;
	public double accbalance;
	
	

	
	public Atm(String name, double phno, double acno,double accbalance) {
		super();
		this.name = name;
		this.phno = phno;
		this.acno = acno;
		this.accbalance = accbalance;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPhno() {
		return phno;
	}



	public void setPhno(double phno) {
		this.phno = phno;
	}



	public double getAcno() {
		return acno;
	}



	public void setAcno(double acno) {
		this.acno = acno;
	}
	
	
	
	
	public double getAccbalance() {
		return accbalance;
	}



	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}



	public void withdrow(int amount) {
		
		
		accbalance= accbalance- amount;
	}




}
