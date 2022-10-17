package client;

import java.rmi.*;

public interface Calc extends Remote{

    public int getSoma (Integer a, Integer b) throws RemoteException;
    public int getSubtracao (Integer a, Integer b) throws RemoteException;
    public int getMultiplicacao (Integer a, Integer b) throws RemoteException;
    public double getDivisao (Integer a, Integer b) throws RemoteException;
}
