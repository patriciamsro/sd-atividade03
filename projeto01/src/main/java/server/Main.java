package server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {

        try {
            System.setSecurityManager (new RMISecurityManager() );
            LocateRegistry.createRegistry(2335);
            CalcServer f = new CalcServer();
            Naming.rebind("//localhost:2335/calc", f);
            System.out.println("Servidor calculadora pronto.");
        }
        catch (RemoteException re) {
            System.out.println("Exception in " + re);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}