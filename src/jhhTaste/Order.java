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

        public void setOrderId(int orderId)
        {
                this.orderId = orderId;
        }
        public void setCreationDate(Date creationDate)
        {
                this.creationDate = creationDate;
        }
        public void setdateShipped(String dateShipped)
        {
                this.dateShipped = dateShipped;
        }
        public void setStatus(String status)
        {
                this.status = status;
        }
        public void setBill(Bill bill)
        {
                this.bill = bill;
        }

        public int getOrderId()
        {
                return orderId;
        }
        public Date getCreationDate()
        {
                return creationDate;
        }
        public String getDateShipped()
        {
                return dateShiped;
        }
        public String getStatus()
        {
                return status;
        }
        public Bill getBill()
        {
                return bill;
        }
}
