import java.util.Scanner;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Progression [] f;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter count elements: ");
       int k = sc.nextInt();
       f = new Progression[k];
       for(int i = 0; i<k;i++){
           System.out.println("1 - Arif.Progression, 2 - Geom.Progression ");
           int p = sc.nextInt();
           if(p==1){
               System.out.println("Enter d: ");
               int d = sc.nextInt();
               System.out.println("Enter the number of the item of interest: ");
               int j = sc.nextInt();
               Arif arif = new Arif(d, j);
               f[i] = arif;
           }
           if(p==2){
               System.out.println("Enter d: ");
               int d = sc.nextInt();
               System.out.println("Enter the number of the item of interest: ");
               int j = sc.nextInt();
               Geom geom = new Geom(d, j);
               f[i] = geom;
           }
       }
        for(int i = 0;i<k;i++){
            f[i].print();
            System.out.println("j-elements = " + f[i].J()+" "+"sum= "+f[i].S());
        }
    }
}