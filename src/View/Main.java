package View;

import Controller.SomaRecursiva;

public class Main {
    public static void main(String[] args) {
        int n= 4;
        SomaRecursiva soma= new SomaRecursiva();
        System.out.println("Resultado: "+ soma.Soma(n));
    }
}
