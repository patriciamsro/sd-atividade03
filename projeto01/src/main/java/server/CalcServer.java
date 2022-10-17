package server;

import client.Calc;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class CalcServer extends UnicastRemoteObject implements Calc{

    public CalcServer() throws RemoteException{}

    public int getSoma(Integer a, Integer b) throws RemoteException{
        System.out.println("Calculando a soma de " + a + " + "+ b);
        return a + b;
    }

    public int getSubtracao(Integer a, Integer b) throws RemoteException{
        System.out.println(" Calculando a subtração de " + a + " - "+ b);
        return a - b;
    }

    public int getMultiplicacao(Integer a, Integer b) throws RemoteException{
        System.out.println("Calculando a multiplicação de " + a + " * "+ b);
        return a * b;
    }

    public double getDivisao(Integer a, Integer b) throws RemoteException{
        System.out.println("Calculando a divisão de " + a + " / "+ b);
        return (double) a / b;
    }
}
