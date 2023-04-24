public class Policy
{

// Declaring Fields
private int PolicyNumber;
private String ProviderName;
private String FirstName;
private String LastName;
private int Age;
private String Smoker;
private double Height;
private double Weight;
   
// no arg constructor
   public Policy()
   {
     PolicyNumber = 0;
     ProviderName = "";
     FirstName = "";
     LastName = "";
     Age = 0;
     Smoker = "";
     Height = 0.0;
     Weight = 0.0; 
   }
   
// constructor
   public Policy(int n, String na, String f, String l, int a, String s, double h, double w)
   {
     PolicyNumber = n;
     ProviderName = na;
     FirstName = f;
     LastName = l;
     Age = a;
     Smoker = s;
     Height = h;
     Weight = w; 
   }
   
// setters
   public void setPolicyNumber(int n)
   {
     PolicyNumber = n;
   }
   
    public void setProviderName(String na)
    {
      ProviderName = na;
    }
    
    public void setFirstName(String f)
    {
      FirstName = f;
    }
    
    public void setLastName(String l)
    {
      LastName = l;
    }
    
    public void setAge(int a)
    {
      Age = a;
    }
    
    public void setSmoker(String s)
    {
      Smoker = s;
    }
    
    public void setHeight(double h)
    {
      Height = h;
    }
    
    public void setWeight(double w)
    {
      Weight = w;
    }
    
// getters
   public int getPolicyNumber()
   {
     return PolicyNumber;
   }
   
    public String getProviderName()
    {
      return ProviderName;
    }
    
    public String getFirstName()
    {
      return FirstName;
    }
    
    public String getLastName()
    {
      return LastName;
    }
    
    public int getAge()
    {
      return Age;
    }
    
    public String getSmoker()
    {
      return Smoker;
    }
    
    public double getHeight()
    {
      return Height;
    }
    
    public double getWeight()
    {
      return Weight;  
    }  
    
// calc methods
   public double calcBmi()
   {
   return (Weight * 703)/(Height*Height);
   }
   
   public double calcFee()
   {
   double Fee = 600;
   
   if (Age > 50)
   {
   Fee += 75;
   }
   
   if (Smoker.equals("smoker"))
   {
   Fee += 100;
   }
   
   if (calcBmi() > 35)
   {
   Fee += 20*(calcBmi() - 35);
   }
   
   return Fee;
   }

}