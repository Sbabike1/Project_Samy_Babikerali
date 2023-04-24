import java.util.ArrayList;
import java.util.Scanner;

public class Project_Samy_Babikerali 
{
    public static void main(String[] args) 
    {
    
    ArrayList<Policy> policy = new ArrayList<Policy>();
    Scanner input = new Scanner(System.in);
    
    int PolicyNumber = 0;
    String ProviderName = "";
    String FirstName = "";
    String LastName = "";
    int Age = 0;
    String Smoker = "";
    double Height = 0.0;
    double Weight = 0.0;
    String repeat = "";
    double calcBmi = 0.0;
    double calcFee = 0.0;
    int noSmoker = 0;
    int nononSmoker = 0;
    
    do
    {
      System.out.print("\nPlease enter the Policy Number: ");
       PolicyNumber = input.nextInt();
       input.nextLine();
      
       System.out.print("\nPlease enter the Provider Name: ");
       ProviderName = input.nextLine();
    
       System.out.print("\nPlease enter the Policyholders First Name: ");
       FirstName = input.nextLine();
    
       System.out.print("\nPlease enter the Policyholders Last Name: ");
       LastName = input.nextLine();
    
       System.out.print("\nPlease enter the Policyholders Age: ");
       Age = input.nextInt();
       input.nextLine();
    
       System.out.print("\nPlease enter the Policyholders Smoking Status (smoker/non-smoker): ");
       Smoker = input.nextLine();
       
       while (!Smoker.equalsIgnoreCase("smoker") && !Smoker.equalsIgnoreCase("non-smoker"))
       {
         System.out.print("\nERROR MESSAGE\n\nPlease enter the Policyholders Smoking Status (smoker/non-smoker): ");
         Smoker = input.nextLine();
       }
       
       if (Smoker.equals("smoker"))
       {
         noSmoker++;
       }
       else if (Smoker.equals("non-smoker"))
       {
         nononSmoker++;
       }


       System.out.print("\nPlease enter the Policyholders Height (in inches): ");
       Height = input.nextDouble();
    
       System.out.print("\nPlease enter the Policyholders Weight (in pounds): ");
       Weight = input.nextDouble();
    
       policy.add(new Policy(PolicyNumber, ProviderName, FirstName, LastName, Age, Smoker, Height, Weight));
       input.nextLine();
    
       System.out.print("\nDo you wish to enter information for another Policy (Y/N)? ");
       repeat = input.nextLine();
       while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n"))
       {
         System.out.print("\nIncorrect answer, please try again! \nDo you wish to enter information for another Policy (Y/N)? ");
         repeat = input.nextLine();
       }
       
    } while(repeat.equalsIgnoreCase("y"));
    
    for (int i = 0; i < policy.size(); ++i)
    {
    System.out.print("\n\nPolicy Number: " + policy.get(i).getPolicyNumber());
    System.out.print("\n\nProvider Name: " + policy.get(i).getProviderName());
    System.out.print("\n\nPolicyholders First Name: " + policy.get(i).getFirstName());
    System.out.print("\n\nPolicyholders Last Name: " + policy.get(i).getLastName());
    System.out.print("\n\nPolicyholders Age: " + policy.get(i).getAge());
    System.out.print("\n\nPolicyholders Smoking Status: " + policy.get(i).getSmoker());
    System.out.print("\n\nPolicyholders Height: " + policy.get(i).getHeight());
    System.out.print("\n\nPolicyholders Weight: " + policy.get(i).getWeight());
    System.out.printf("\n\nPolicyholders BMI: %.2f", policy.get(i).calcBmi());
    System.out.printf("\n\nPolicy price: $%.2f", policy.get(i).calcFee());
    }
    
    System.out.print("\n\nThe number of policies with a smoker is: " + noSmoker);
    System.out.print("\n\nThe number of policies with a non-smoker is: " + nononSmoker);
    
    }
}