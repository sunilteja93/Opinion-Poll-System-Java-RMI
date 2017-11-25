import java.rmi.*;
import java.util.*;
import java.io.*;

public class ProjectClient{
  public static void main(String args[]) throws java.rmi.RemoteException{
    try{
      ProjectServerInterface oo = (ProjectServerInterface)Naming.lookup("rmi:///ProjectServer");
      int res,b,c;
      
      DataInputStream din = new DataInputStream(System.in);
      System.out.println("Enter n:");
      long n = Integer.parseInt(din.readLine());
      long r = oo.calculateSum(n);
      System.out.println("The sum of "+n+" is"+ r);
   }
 catch(Exception e)
 {
   System.out.println("Error in input!!!");
 }
 
}
  
}

