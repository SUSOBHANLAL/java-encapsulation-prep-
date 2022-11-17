package new_2_Encapsulation1;

class Main {

	public static void main(String[] args) {
		
		
	Atm atm = new Atm("susobhan",82480384,30000,5005);


	System.out.println(atm.getName());
	
	
	System.out.println(atm.accbalance);
	
	// initiate the method withdrow
	
	
	atm.withdrow(900);  // last obj name .methodname
	
	System.out.println("after withrow balance is "+atm.getAccbalance());
	
	}

}
