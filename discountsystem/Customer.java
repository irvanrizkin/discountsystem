package discountsystem;

public class Customer{
    private String name;
    private boolean member = false;
    private String memberType;

    /**
     * Construct the name of the customer
     * 
     * @param name -name of the customer
     */
    Customer(String name){
        this.name = name;
    }

    /**
     * Return the name of the customer
     * @return -Name from customer
     */
    public String getName(){
        return name;
    }

    /**
     * Return the membership status of the customer
     * @return -Membership status from customer (true/false)
     */
    public boolean isMember(){
        return member;
    }


    /**
     * Set the membership status of the customer.
     * Automatically set {@code memberType = "Not Member"} if the {@code member == false}
     * 
     * @param member -the true and false for customer membership
     */
    public void setMember(boolean member){
        if(!member){
            memberType = "Not Member";
        }
        this.member = member;
    }

    /**
     * Return the membership type of the customer
     * @return -membership type from customer (Premium/Gold/Silver)
     */
    public String getMemberType(){
        return memberType;
    }

    /**
     * Set the membership type of the customer.
     * 
     * Cannot be applicated if {@code member == false}
     * 
     * @param memberType -only applicable to {@code Premium, Gold,} and {@code Silver}
     */
    public void setMemberType(String memberType){
        if(member){
            this.memberType = memberType;
        }
    }

    /**
     * To return the elements from customer
     * 
     * @return -Name, Member, and Member type formatted in new line
     */
    @Override
    public String toString() {
        return  "Name           : " + getName() + "\n" +
                "Member         : " + isMember() + "\n" +
                "Member type    : " + getMemberType() + "\n";
    }
}