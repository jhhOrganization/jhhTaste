package jhhTaste;

import java.util.Date;

public class Order {

	private int orderId;
	private Date creationDate;
	private String dateShipped;
	private String status;
	private Bill bill;

	public Order(int orderId, Date creationDate, String dateShipped,
			String status, Bill bill) {
		super();
		this.orderId = orderId;
		this.creationDate = creationDate;
		this.dateShipped = dateShipped;
		this.status = status;
		this.bill = bill;
	}
}
