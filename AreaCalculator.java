import java.util.*; 
class AreaCalculator {
    public static void main(String args[]) 
    {
        int time, cost; 
        System.out.print("Enter your name: "); 
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        System.out.print("The name is "+ n);
        System.out.print(System.lineSeparator());
        System.out.print("Enter the area: "); 
        Scanner myobj = new Scanner(System.in); 
        int a = myobj.nextInt(); 
        if(a<100)
        {
          System.out.print("Area is too small"); 
        }
        else
        {
          time = (a/100)*8; 
          cost = (a/100)*a; 
          System.out.print("time required: "+time); 
          System.out.print(System.lineSeparator());
          System.out.print("cost: "+cost); 
        }
  }
}
