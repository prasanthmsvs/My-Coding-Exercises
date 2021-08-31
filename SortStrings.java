// This program will sort two strings based on alphabetical order. This is a test code I wrote for my understanding of Java. 

class SortStrings
{
    public static void main(String args[])
    {
        String a, b; 
        a = "Ted Mosby"; 
        b = "Ross Geller"; 
        if(a.compareTo(b)>0)
        {
            String temp; 
            temp = b; 
            b = a; 
            a = temp; 
            System.out.print("The sorted order is "+a+" and "+b); 
        }
        else
        {
            System.out.print("No change is required"); 
        }
    }
}
