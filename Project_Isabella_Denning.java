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

        // read through file while there are lines left     
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

        // loop through the list and print out all of the policy information   
        for (Policy policy : policyList) {

    }
}
