import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements Verify {

    public Servidor() throws RemoteException{}

    @Override
    public String parOuImpar (Integer a) throws RemoteException {
        if(a % 2 ==0) {
            return "O número é par.";
        } else {
            return "O numero é ímpar.";
        }
    }

    @Override
    public String primoNaoPrimo (Integer a) throws RemoteException {
        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                return "O número não é primo";
            }
        }
        return "O número é primo.";
    }

    @Override
    public String divisivelPor (Integer a, Integer b) throws RemoteException {
        if(a % b == 0) {
            return "O número " + a + "é divisível por " + b;
        } else {
            return "O número " + a + "NÃO é divisível por " + b;
        }
    }
}
