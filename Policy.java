/**
 * the Policy class stores information about an insurance policy,
 * including the provider name and a reference to the PolicyHolder.
 */
public class Policy
{
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; // the person
    private static int policyCount = 0; // tracks # of policy objects

    /**
     * no-arg constructor
     */
    public Policy()
    {
        policyNumber = "";
        providerName = "";
        policyHolder = null;
        policyCount++;

     }
     
     /**
     * constructor with arguments, sets values based on user input
     * @param number the policy number
     * @param provider the provider name
     * @param holder the policyholder object
     */
   
        public Policy(String number, String provider, PolicyHolder holder)
    {
        policyNumber = number;
        providerName = provider;
        policyHolder = holder;
        policyCount++;
    }
 
   /**
    * gets the policy number
    * @return the policy number
    */

        public String getPolicyNumber() 
        {
        
        return policyNumber;
        
        }
        
      /**
       * gets the provider name
       * @return the provider name
       */

        public String getProviderName() 
        {
        
        return providerName;
        
        }
   /**
    * gets the policyholder object
    * @return the policyholder
    */
    public PolicyHolder getPolicyHolder()
    {
        return policyHolder;
    }

    /**
    * calculates the price of the policy
    * adds fees based on age, smoking status, and BMI
    * @return the total price
    */
  
    public double calculatePolicyPrice() 
    {
        final double BASE_FEE = 600.0;
        double price = BASE_FEE;

        if (policyHolder.getAge() > 50) 
        {
            price += 75;
        }

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))

        {
            price += 100;
        }

        double bmi = policyHolder.calculateBMI();
        if (bmi > 35) 
        {
            price += (bmi - 35) * 20;
        }

        return price;
    }
     * returns the full policy info using toString
    
    public String toString()
    {
        return "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               policyHolder.toString() + "\n" +
               "Policy Price: $" + String.format("%.2f", calculatePolicyPrice());
    }

    /**
     * gets the number of Policy objects created
     * @return the policy count
     */
    public static int getPolicyCount()
    {
        return policyCount;
    }
}
