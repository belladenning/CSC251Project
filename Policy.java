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
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    public String getPolicyHolderSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    public double getPolicyHolderHeight() {
        return policyHolderHeight;
    }

    public double getPolicyHolderWeight() {
        return policyHolderWeight;
    }

    // setter methods to update values
    public void setPolicyNumber(String number) {
        policyNumber = number;
    }
    

    public void setProviderName(String provider) {
        providerName = provider;
    }

    public void setPolicyHolderFirstName(String firstName) {
        policyHolderFirstName = firstName;
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
    }

    // method to calculate the policy price based on rules
    public double calculatePolicyPrice()
    {
        double price = 600;

        // if over 50 add extra
        if (policyHolderAge > 50)
        {
            price += 75;
        }

        // if smoker add extra
        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker"))
        {
            price += 100;
        }

        // check bmi and add extra if needed
        double bmi = calculateBMI();
        if (bmi > 35)
        {
            price += (bmi - 35) * 20;
        }

        return price;
    }
    
}

