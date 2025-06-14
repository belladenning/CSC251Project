public class Policy
{
    // fields to store info about the insurance policy
    private String policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

    // no-arg constructor, sets everything to default values
    public Policy()
    {
        policyNumber = "";
        providerName = "";
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge = 0;
        policyHolderSmokingStatus = "non-smoker";
        policyHolderHeight = 0.0;
        policyHolderWeight = 0.0;
    }
/**
 * the policy class stores information about an insurance policy
 * including the provider name and details about the policyholder.
 */
public class Policy {

    // constructor with arguments, sets values based on user input
    public Policy(String number, String provider, String firstName, String lastName, int age, String smoking, double height, double weight)
    {
        policyNumber = number;
        providerName = provider;
        policyHolderFirstName = firstName;
        policyHolderLastName = lastName;
        policyHolderAge = age;
        policyHolderSmokingStatus = smoking;
        policyHolderHeight = height;
        policyHolderWeight = weight;
    }

    // getter methods to return values
    public String getPolicyNumber() {
    
   /**
    * this constructor sets the values for a policy object
    * @param policyNumber the policy number
    * @param providerName the name of the insurance provider
    * @param policyholderFirstName the policyholder's first name
    * @param policyholderLastName the policyholder's last name
    * @param policyholderAge the policyholder's age
    * @param smokingStatus whether the policyholder is a smoker or not
    * @param height the policyholder's height in inches
    * @param weight the policyholder's weight in pounds
    */
    }
      
   /**
    * gets the policy number
    * @return the policy number
    */

        public int getPolicyNumber() {
        return policyNumber;
    }
      /**
    * gets the provider name
    * @return the provider name
    */

        public String getProviderName() {
        return providerName;
    }
   /**
    * gets the policyholder's first name
    * @return the first name
    */

        public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }
   /**
    * gets the policyholder's last name
    * @return the last name
    */

       public String getPolicyholderLastName() {
        return policyholderLastName;
    }
   /**
    * gets the policyholder's age
    * @return the age
    */

        public int getPolicyholderAge() {
        return policyholderAge;
    }
   /**
    * gets the smoking status of the policyholder
    * @return "smoker" or "non-smoker"
    */

        public String getSmokingStatus() {
        return smokingStatus;
    }
   /**
    * gets the height of the policyholder
    * @return the height in inches
    */

    public double getHeight() {
        return height;
    }

   /**
    * gets the weight of the policyholder
    * @return the weight in pounds
    */
    
    public double getWeight() {
        return weight;
    }

    public void setPolicyHolderLastName(String lastName) {
        policyHolderLastName = lastName;
    }

    public void setPolicyHolderAge(int age) {
        policyHolderAge = age;
    }

    public void setPolicyHolderSmokingStatus(String smoking) {
        policyHolderSmokingStatus = smoking;
    }

    public void setPolicyHolderHeight(double height) {
        policyHolderHeight = height;
    }

    public void setPolicyHolderWeight(double weight) {
        policyHolderWeight = weight;
    }

    // method to calculate bmi using the formula in the instructions
    public double calculateBMI()
    {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
   /**
    * calculates the bmi using height and weight
    * @return the bmi value
    */
    
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // method to calculate the policy price based on rules
    public double calculatePolicyPrice()
    {
        double price = 600;
   /**
    * calculates the price of the policy
    * adds fees based on smoking status and age
    * @return the total policy price
    */
  
    public double calculatePolicyPrice() {
        final double BASE_FEE = 600.0;
        double price = BASE_FEE;

        if (policyholderAge > 50) {
            price += 75;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}
