import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void menu(){
        PoupeeRusse poupee1=new PoupeeRusse("Grand Poupée" ,30, false);
        PoupeeRusse poupee2=new PoupeeRusse("Moyenne Poupée",15 ,false);
        PoupeeRusse poupee3=new PoupeeRusse("Mini Poupée",5 ,false);
        int Choix;

        do{
            System.out.println("1--Ouvrir les  Poupees");
            System.out.println("2--Fermer une Poupee");
            System.out.println("6--Quitter ");
            System.out.println("Entrez votre Choix : ");
            Choix=new Scanner(System.in).nextInt();
            switch (Choix){
                case 1:
                    System.out.println("Débloquez la poupée ?");
                    poupee1.aficher();
                    poupee2.aficher();
                    poupee3.aficher();

                    int choice = new Scanner(System.in).nextInt();
                    switch (choice){
                        case 1 :
                            poupee1.ouvrir();
                            System.out.println("\nPour insérer une poupée Entrer 1 ou 2 !");
                            poupee2.aficher();
                            poupee3.aficher();
                            System.out.println("\n------------------ Pour sortir la poupée Entrer 3 ou 4 ! ");
                            poupee2.aficher();
                            poupee3.aficher();
                            System.out.println("\n------ Entre nomber 0 pour retourner !------\n");
                            System.out.println("\n-- -- -- Entre Votre choix !");

                            choice = new Scanner(System.in).nextInt();
                            switch (choice){
                                case 1 :
                                    poupee1.placerDans(poupee2);
                                    break;
                                case 2 :
                                    poupee1.placerDans(poupee3);
                                    break;
                                case 3 :
                                    poupee1.sortirDe(poupee2);
                                    break;
                                case 4 :
                                    poupee1.sortirDe(poupee3);
                                    break;
                                default:
                                    menu();
                                    break;
                            }
                            break;
                        case 2 :
                            poupee2.ouvrir();
                            System.out.println("\nPour insérer une poupée Entrer 1 ou 2 !");
                            poupee1.aficher();
                            poupee3.aficher();
                            System.out.println("------------------ Pour sortir la poupée Entrer 3 ou 4 ! ");
                            poupee1.aficher();
                            poupee3.aficher();
                            System.out.println("\n-----Entre nomber 0 pour retourner !-----");
                            System.out.println("\n-- -- -- Entre Votre choix !");
                            choice = new Scanner(System.in).nextInt();
                            switch (choice){
                                case 1 :
                                    poupee2.placerDans(poupee1);
                                    break;
                                case 2 :
                                    poupee2.placerDans(poupee3);
                                    break;
                                case 3 :
                                    poupee2.sortirDe(poupee1);
                                    break;
                                case 4 :
                                    poupee2.sortirDe(poupee3);
                                    break;
                                default:
                                    menu();
                                    break;
                            }
                            break;
                        case 3 :
                            poupee3.ouvrir();
                            System.out.println("\nPour insérer une poupée Entrer 1 ou 2 !");
                            poupee1.aficher();
                            poupee2.aficher();
                            System.out.println("------------------ Pour sortir la poupée Entrer 3 ou 4 ! ");
                            poupee1.aficher();
                            poupee2.aficher();
                            System.out.println("\n-----Entre nomber 0 pour retourner !-----");
                            System.out.println("\n-- -- -- Entre Votre choix !");
                            choice = new Scanner(System.in).nextInt();
                            switch (choice){
                                case 1 :
                                    poupee3.placerDans(poupee1);
                                    break;
                                case 2 :
                                    poupee3.placerDans(poupee2);
                                    break;
                                case 3 :
                                    poupee3.sortirDe(poupee1);
                                    break;
                                case 4 :
                                    poupee3.sortirDe(poupee2);
                                    break;
                                default:
                                    menu();
                                    break;
                            }
                            break;
                    }


                    break;
                case 2:
                    poupee1.aficher();
                    poupee2.aficher();
                    poupee3.aficher();
                    System.out.println("\n-----Entre nomber 0 pour retourner !-----");
                    System.out.println("Entrez le numéro de la poupée que vous souhaitez verrouiller ?");
                    int choix = new Scanner(System.in).nextInt();
                    switch (choix){
                        case 1 :
                            poupee1.fermer();
                            break;
                        case 2 :
                            poupee2.fermer();
                            break;
                        case 3 :
                            poupee3.fermer();
                            break;
                        default:
                            menu();
                            break;
                    }
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
