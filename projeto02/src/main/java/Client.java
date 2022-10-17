import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Verify verify;
        try {
            Scanner in = new Scanner(System.in);
            verify = (Verify) Naming.lookup("rmi://localhost:2335/area");

            System.out.println("Informe um número para saber se ele e par ou ímpar, primo ou não primo e divísivel:");
            Integer primeiro = in.nextInt();

            System.out.println("Informe o número divisor!");
            Integer divisor = in.nextInt();

            System.out.println(verify.parOuImpar(primeiro));

            System.out.println(verify.primoNaoPrimo(primeiro));

            System.out.println(verify.divisivelPor(primeiro, divisor));

        }
        catch(MalformedURLException e) {
            System.out.println( "Não é um URL RMI valido");
        }
        catch(RemoteException re) {
            System.err.println("Objeto Remoto tratou a execução " + re);
        }
        catch(NotBoundException e) {
            System.out.println( "Não foi possível encontrar o objeto remoto no servidor");
        }
    }
}
