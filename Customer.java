package car_dealership2;

public class Customer {
 
				private String  name;
			   
				private String   address;
			    private double    cashOnHand;
  
  
		  public Customer(String name, String address, double cashOnHand) {
				super();
				this.name = name;
				this.address = address;
				this.cashOnHand = cashOnHand;
			}
  
  /**
 	 * @return the name
 	 */
 	
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the cashOnHand
	 */
	public double getCashOnHand() {
		return cashOnHand;
	}


	/**
	 * @param cashOnHand the cashOnHand to set
	 */
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

    
    public void purchaseCarVehicle(Vehicle vehicle, Employee emp, boolean finance){
    		
    	}
    
	
}
