package jhhTaste;

import java.util.ArrayList;

public class Customer extends User{
	private long creditCard;
	private ArrayList<String> interest;
	private String postalAddress;
	private ArrayList<Order> orders;

	public Customer(String name, String email, String userName,
			String password, String loginStatus, long creditCard,
			ArrayList<String> interest, String postalAddress,
			ArrayList<Order> orders) {
		super(name, email, userName, password, loginStatus);
		this.creditCard = creditCard;
		this.interest = interest;
		this.postalAddress = postalAddress;
		this.orders = orders;
	}

	public boolean AddInterest(String interest){
		return this.interest.add(interest);
	}

	private boolean removeInterest(String interest){
		return this.interest.remove(interest);
	}

        public long getCreditCard()
        {
                return creditCard;
        }
        public ArrayList<String> getInterest()
        {
                return interest;
        }
        public String getPostalAddress()
        {
                return postalAddress;
        }
        public ArrayList<Order> getOrders()
        {
                return orders;
        }

        public void setCreditCard(long creditCard)
        {
                this.creditCard = creditCard;
        }
        public void setInterest(ArrayList<String> interest)
        {
                this.interest = interest;
        }
        public void setPostalAddress(String postalAddress)
        {
                this.postalAddress = postalAddress;
        }
        public void setOrders(ArrayList<Order> orders)
        {
                this.orders = orders;
        }
}
