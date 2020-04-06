package discountsystem;

public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountGold = 0.1;
    private static final double productDiscountSilver = 0.1;

    /**
     * Return the service discount constant depend on {@code memberType}
     * @return -discount constant in {@code double} data type
     */
    public static double getServiceDiscountRate(String type) {
        if (type.equals("Premium")) {
            return serviceDiscountPremium;
        } else if(type.equals("Gold")){
            return serviceDiscountGold;
        } else if(type.equals("Silver")){
            return serviceDiscountSilver;
        } else {
            return 0.0;
        }
    }

    /**
     * Return the product discount constant depend on {@code memberType}
     * @return -discount constant in {@code double} data type
     */
    public static double getProductDiscountRate(String type) {
        if (type.equals("Premium")) {
            return productDiscountPremium;
        } else if(type.equals("Gold")){
            return productDiscountGold;
        } else if(type.equals("Silver")){
            return productDiscountSilver;
        } else {
            return 0.0;
        }
    }
}