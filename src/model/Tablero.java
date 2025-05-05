
package model;

public class Tablero {
    private char mTablero[][];
    private static int iTamanio = 9;
    
    public Tablero(){
        mTablero = new char[iTamanio][iTamanio];
    }
    public void generarTabla1(){
        for(int i=0; i<9; i++){
            for(int j = 0; j<9;j++){
                if((i<6 && i>2)){
                    mTablero[i][j] = '*';
                }
            }
        }
        mTablero[4][4] = ' ';
    }
    public void generarTriangulo(){
        
    }
}
