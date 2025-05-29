import java.util.Scanner;

public class Project_Isabella_Denning
{
    public static void main(String[] args)
    {
        // the scanner so we can get input from user
        Scanner input = new Scanner(System.in);



        // asking the user for all the info for the policy
        System.out.print("Please enter the Policy Number: ");
        String policyNumber = input.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = input.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = input.nextInt();
        input.nextLine(); // this clears extra line

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = input.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = input.nextDouble();



        // creating the policy object with the data they entered
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                  age, smokingStatus, height, weight);



        // now printing everything out using the methods
        System.out.println();
        System.out.println( "Policy Number: " + policy.getPolicyNumber() );
        System.out.println( "Provider Name: " + policy.getProviderName() );
        System.out.println( "Policyholder’s First Name: " + policy.getPolicyHolderFirstName() );
        System.out.println( "Policyholder’s Last Name: " + policy.getPolicyHolderLastName() );
        System.out.println( "Policyholder’s Age: " + policy.getPolicyHolderAge() );
        System.out.println( "Policyholder’s Smoking Status: " + policy.getPolicyHolderSmokingStatus() );
        System.out.printf( "Policyholder’s Height: %.1f inches\n", policy.getPolicyHolderHeight() );
        System.out.printf( "Policyholder’s Weight: %.1f pounds\n", policy.getPolicyHolderWeight() );



        // using the method to find bmi
        System.out.printf( "Policyholder’s BMI: %.2f\n", policy.calculateBMI() );

        // using method to figure out price with all the fees
        System.out.printf( "Policy Price: $%.2f\n", policy.calculatePolicyPrice() );
    }
}
