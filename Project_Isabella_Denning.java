import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Project_Isabella_Denning
{
    public static void main(String[] args) throws IOException
    {
    // open the file that contains policy info
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);
    // create a list that will hold policy objects    
        ArrayList<Policy> policyList = new ArrayList<>();
        
    // read through file where there are lines left     
while (inputFile.hasNextLine()) {
    String firstLine = inputFile.nextLine().trim();

    // skip if it is blank
    if (firstLine.equals("")) {
        continue;
    }

    // read all 8 lines of info for this policy
    int policyNumber = Integer.parseInt(firstLine);
    String providerName = inputFile.nextLine();
    String firstName = inputFile.nextLine();
    String lastName = inputFile.nextLine();
    int age = Integer.parseInt(inputFile.nextLine());
    String smokingStatus = inputFile.nextLine();
    double height = Double.parseDouble(inputFile.nextLine());
    double weight = Double.parseDouble(inputFile.nextLine());
    
    // create a new policy object with this information
    Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                age, smokingStatus, height, weight);
    policyList.add(policy);
}

     // close the file when done
        inputFile.close();
     // loop through the list and peint out all of the policy informatuin   
        for (Policy policy : policyList) {
       System.out.println();
       System.out.println("Policy Number: " + policy.getPolicyNumber());
       System.out.println("Provider Name: " + policy.getProviderName());
       System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
       System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
       System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
       System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getSmokingStatus());
       System.out.printf("Policyholder's Height: %.1f inches\n", policy.getHeight());
       System.out.printf("Policyholder's Weight: %.1f pounds\n", policy.getWeight());
       System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
       System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
}

    }
}