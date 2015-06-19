package jhhTaste;

import java.util.ArrayList;

public class Product {
	private int productId;
	private String category;
	private String description;
	private ArrayList<Order> orders;

        public void setProductId(int productId)
        {
               this.productId = productId;
        }
        public void setCategory(String category)
        {
               this.category = category;
        }
        public void setDescription(String description)
        {
               this.description = description;
        }
        public void setOrders(ArrayList<Order> orders)
        {
               this.orders = orders;
        }

        public int getProductId()
        {
               return productId;
        }
        public String getCategory()
        {
               return category;
        }
        public String getDescription()
        {
               return description;
        }
        public ArrayList<Order> getOrders()
        {
               return orders;
        }
}
