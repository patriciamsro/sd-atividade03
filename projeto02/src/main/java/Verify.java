import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Verify extends Remote {

    public String parOuImpar (Integer a) throws RemoteException;
    public String primoNaoPrimo (Integer a) throws RemoteException;
    public String divisivelPor (Integer a, Integer b) throws RemoteException;
}
