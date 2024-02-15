import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void listChoix(){
        PoupeeRusse poupee1=new PoupeeRusse("oussama" ,30, false);
        PoupeeRusse poupee2=new PoupeeRusse("salma",15 ,false);
        PoupeeRusse poupee3=new PoupeeRusse("yassine",20 ,false);
        int Choix;

        do{
            System.out.println("1--Ouvrir une Poupee");
            System.out.println("2--Fermer une Poupee");
            System.out.println("6--Quitter ");
            System.out.println("Entrez votre Choix : ");
            Choix=new Scanner(System.in).nextInt();
            switch (Choix){
                case 1:
                    System.out.println(" 1 - Doll Name -->  "+poupee1.getNomP()+"|  Doll Taille -->  "+poupee1.getTaille());
                    System.out.println(" 2 - Doll Name -->  "+poupee2.getNomP()+"|  Doll Taille -->  "+poupee2.getTaille());
                    System.out.println(" 3 - Doll Name -->  "+poupee3.getNomP()+"|  Doll Taille -->  "+poupee3.getTaille());
                    int choice = new Scanner(System.in).nextInt();
                    switch (choice){
                        case 1 :
                            poupee1.ouvrir();
                            System.out.println(" 2 - Doll Name -->  "+poupee2.getNomP()+"|  Doll Taille -->  "+poupee2.getTaille());
                            System.out.println(" 3 - Doll Name -->  "+poupee3.getNomP()+"|  Doll Taille -->  "+poupee3.getTaille());
                            choice = new Scanner(System.in).nextInt();
                            switch (choice){
                                case 1 :
                                    poupee2.placerDans(poupee1);
                                    break;
                                case 2 :
                                    poupee3.placerDans(poupee1);
                            }
                            break;
                        case 2 :
                            poupee2.ouvrir();
                            System.out.println(" 1 - Doll Name -->  "+poupee1.getNomP()+"|  Doll Taille -->  "+poupee1.getTaille());
                            System.out.println(" 3 - Doll Name -->  "+poupee3.getNomP()+"|  Doll Taille -->  "+poupee3.getTaille());
                            choice = new Scanner(System.in).nextInt();
                            switch (choice){
                                case 1 :
                                    poupee1.placerDans(poupee2);
                                    break;
                                case 2 :
                                    poupee3.placerDans(poupee2);
                            }
                            break;
                        case 3 :
                            poupee3.ouvrir();
                            System.out.println(" 1 - Doll Name -->  "+poupee1.getNomP()+"|  Doll Taille -->  "+poupee1.getTaille());
                            System.out.println(" 2 - Doll Name -->  "+poupee2.getNomP()+"|  Doll Taille -->  "+poupee2.getTaille());
                            choice = new Scanner(System.in).nextInt();
                            switch (choice){
                                case 1 :
                                    poupee1.placerDans(poupee3);
                                    break;
                                case 2 :
                                    poupee2.placerDans(poupee3);
                            }
                            break;
                    }


                    break;
                case 3:
                    poupee1.fermer();
                    System.out.println("---->"+poupee1.getOuverte());
                    break;
                case 4 :
                    Afficher();
                    break;
                case 5:
                    break;
                default:
            }
        }while (Choix!=5);
    }

    public void Afficher(){


    }



}
