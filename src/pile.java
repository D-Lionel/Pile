import java.util.Arrays;
import java.util.Scanner;

public class pile {
    public static int [] tab = new int[4];
    public static int tete = 0;
    public static int entries = 0;

    public static void afficherTableau(){
        System.out.println("Tableau : " + Arrays.toString(tab));
    }

    public static void afficherPile(){
        System.out.print("Pile : ");
        int i;
        for (i = 0; i < tete; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println("");
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    public static void push(int valeur) {
        if (tete < 4) {
            tab[tete] = valeur;
            tete++;
        }
    }

    public static int pop(){
            if (tete>0){
            int a = tab[tete-1];
            tete--;
            return a;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            int a = input();
            push(a);
            afficherTableau();
            afficherPile();
            System.out.println("position de la tete : " + tete);
        }

        for (int i = 0; i < 4; i++){
            System.out.println("Valeure retirée : " + pop());
            afficherTableau();
            afficherPile();
            System.out.println("position de la tete : " + tete);
        }

        for (int i = 0; i < 4; i++){
            int a = input();
            push(a);
            afficherTableau();
            afficherPile();
            System.out.println("position de la tete : " + tete);
        }
    }
}
