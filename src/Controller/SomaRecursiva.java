package Controller;

public class SomaRecursiva {

    public SomaRecursiva(){
        super();
    }

    public int Soma(int n){
        if (n < 0){ //Condição de parada
            return 0;
        } else if (n == 0) { //Condição de parada
            return 0;
        } else {
            return n + Soma(n - 1); //Chamada recursiva
        }
    }

}
