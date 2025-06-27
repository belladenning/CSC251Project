/**
   the PolicyHolder class stores information
   about a policy holder including personal
   health and lifestyle details
*/

public class PolicyHolder
{
   // fields that belong to the person
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
      constructor
   */
   public PolicyHolder(String first, String last, int age, String smoker, double height, double weight)
   {
      firstName = first;
      lastName = last;
      this.age = age;
      smokingStatus = smoker;
      this.height = height;
      this.weight = weight;
   }

   // accessor methods
   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getAge()
   {
      return age;
   }

   public String getSmokingStatus()
   {
      return smokingStatus;
   }

   public double getHeight()
   {
      return height;
   }

   public double getWeight()
   {
      return weight;
   }

   /**
      Returns the bmi for the policy holder
   */
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   }

   /**
      toString method
   */
   public String toString()
   {
      return "Policyholder's First Name: " + firstName + "\n" +
             "Policyholder's Last Name: " + lastName + "\n" +
             "Policyholder's Age: " + age + "\n" +
             "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n" +
             "Policyholder's Height: " + height + " inches\n" +
             "Policyholder's Weight: " + weight + " pounds\n" +
             "Policyholder's BMI: " + String.format("%.2f", calculateBMI());
   }
}
