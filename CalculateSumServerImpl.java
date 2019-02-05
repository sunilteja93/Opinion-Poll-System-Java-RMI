import java.rmi.*;
import java.rmi.server.*;

public class CalculateSumServerImpl extends UnicastRemoteObject implements Project3ServerInterface {
  public CalculateSumServerImpl() throws java.rmi.RemoteException {}
  public int calculateSum(long n) throws java.rmi.RemoteException
  {  
     long res;
     res = (n*(n+1))/2;
     return res;
  }
}
