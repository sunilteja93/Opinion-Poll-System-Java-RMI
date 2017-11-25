import java.rmi.*;
import java.rmi.server.*;

public class CalculateSumServerImpl extends UnicastRemoteObject implements Project3ServerInterface {
  public CalculateSumServerImpl() throws java.rmi.RemoteException
  {}
  public int calculateSum(long n) throws java.rmi.RemoteException
    {
     
       /*
        int res =0;        
        for(int i = 0;i <= n; i++)
        {
           res = res+i;
        }
	*/    
     long res;
     res = (n*(n+1))/2;
     return res;
  }
}
