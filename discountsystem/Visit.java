package discountsystem;
import java.util.Date;

public class Visit extends Customer {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    /**
     * Construct the name of the customer and date of the visit
     * 
     * @param name -name of the customer
     * @param date -date from {@code java.util.Date} object which must be instantiated with {@code Date date = new Date()}
     */
    Visit(String name, Date date){
        super(name);
        this.date = date;
    }

    /**
     * Override the getName() method from super class to
     * 
     * Return the name from the customer (super) class
     * @return -Name from customer class
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Return the service expense of the visit
     * @return -Service expense from visit
     */
    public double getServiceExpense() {
        return serviceExpense;
    }

    /**
     * Set the service expense and reduce it with the discount which only applicable if customer's {@code member == true}
     * 
     * @param ex -service expense from the customer visit
     */
    public void setServiceExpense(double ex) {
        if(super.isMember()){
           ex -= (ex*DiscountRate.getServiceDiscountRate(super.getMemberType())); 
        }
        this.serviceExpense = ex;
    }

    /**
     * Return the service expense of the visit
     * @return -Service expense from visit
     */
    public double getProductExpense() {
        return productExpense;
    }

    /**
     * Set the product expense and reduce it with the discount which only applicable if customer's {@code member == true}
     * 
     * @param ex -product expense from the customer visit
     */
    public void setProductExpense(double ex) {
        if(super.isMember()){
            ex -= (ex*DiscountRate.getProductDiscountRate(super.getMemberType())); 
         }
        this.productExpense = ex;
    }

    /**
     * Return the sum of product expressions and service expense
     * 
     * @return -value of {@code productExpense + serviceExpense} in {@code double} data type
     */
    public double getTotalExpense(){
        return getProductExpense() + getServiceExpense();
    }

    /**
     * Override the toString() method from the super class
     * 
     * To return the element from the visit which also return inherited element from customer
     * 
     * @return -Customer elements, Date, Service Expense, Product Expense, and Total Expense
     */
    @Override
    public String toString() {
        return "Customer" + "\n" +
                super.toString() +     "\n" +
                "Date               : " + date + "\n" +
                "Service Expense    : " + getServiceExpense() + "\n" +
                "Product Expense    : " + getProductExpense() + "\n" +
                "Total Expense      : " + getTotalExpense() + "\n";
    }

}
