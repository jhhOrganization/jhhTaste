package jhhTaste;

public class Bill {

	private long totalCost;
	private int[] discounts;

	public Bill(long totalCost, int[] discounts) {
		super();
		this.totalCost = totalCost;
		this.discounts = discounts;
	}

	public long calculateTotalCost(){
		return 0; //TODO
	}

        public void setTotalCost(long totalCost)
        {
                this.totalCost = totalCost;
        }

        public void setDiscounts(int[] discounts)
        {
                this.discounts = discounts;
        }

        public long getTotalCost()
        {
                return totalCost;
        }

        public int[] getDiscounts()
        {
                return discounts;
        }
}
