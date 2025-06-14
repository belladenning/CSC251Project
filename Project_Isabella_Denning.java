import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Project_Isabella_Denning
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);
        
        ArrayList<Policy> policyList = new ArrayList<>();
        
        
        while (inputFile.hasNext()) {
        int policyNumber= Integer.parseInt(inputFile.nextLine());
        String providerName = inputFile.nextLine();
        String firstName = inputFile.nextLine();
        String lastName = inputFile.nextLine();
        int age = Integer.parseInt(inputFile.nextLine());
        String smokingStatus = inputFile.nextLine();
        double height = Double.parseDouble(inputFile.nextLine());
        double weight = Double.parseDouble(inputFile.nextLine());
        
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
        policyList.add(policy);
      }

        inputFile.close();
    }
}