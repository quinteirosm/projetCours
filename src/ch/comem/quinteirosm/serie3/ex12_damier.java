package ch.comem.quinteirosm.serie3;

public class ex12_damier {
    public static void main(String[] args) {
        for (int i=0; i<8; i++){
            for (int x=0; x<8; x++){
                if((i%2!=0 && x%2==0) || (i%2==0 && x%2!=0)){
                    System.out.print(" o");
                }else if((i%2==0 && x%2==0) || (i%2!=0 && x%2!=0)){
                    System.out.print(" #");
                }
            }
            System.out.println("");
        }
    }
}