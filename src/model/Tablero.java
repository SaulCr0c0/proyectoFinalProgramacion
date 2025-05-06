
package model;

public class Tablero {
    private char mTablero[][];
    private static int iTamanio = 9;
    
    public char[][] getmTablero() {
        return mTablero;
    }

    public void setmTablero(char[][] mTablero) {
        this.mTablero = mTablero;
    }

    public static int getiTamanio() {
        return iTamanio;
    }

    public static void setiTamanio(int iTamanio) {
        Tablero.iTamanio = iTamanio;
    }
    
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
       for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mTablero[i][j] = ' ';
            }
        }
       int alturaTriangulo = 5;
       int base = 7; 
        
       for (int fila = 0; fila < alturaTriangulo; fila++) {
           int asteriscos = 2 * fila + 1;
           int espacios = (base - asteriscos) / 2;
            
           for (int col = 0; col < asteriscos; col++) {
               mTablero[fila][espacios + col] = '*';
           }
        } 
    }
}
