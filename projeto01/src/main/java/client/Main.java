package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {
    public static void main(String args[]) {

        Calc calculator;

        try {
            calculator = (Calc) Naming.lookup("rmi://localhost:2335/calc");

            Integer a = 3;
            Integer b = 4;
            Integer c = calculator.getSoma(a, b);

            System.out.println("A soma é: " + c);
        } catch (MalformedURLException e) {
            System.out.println("Não é um URL RMI válido");
        } catch (RemoteException re) {
            System.err.println("Objeto Remoto tratou a execução " + re);
        } catch (NotBoundException e) {
            System.out.println("Não foi possível encontrar o objeto remoto no servidor");
        }
    }
}