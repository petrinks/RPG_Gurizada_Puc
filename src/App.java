import java.util.Scanner;

import ClassesPlayer.Arqueiro;
import ClassesPlayer.Barbaro;
import ClassesPlayer.Clerigo;
import ClassesPlayer.Guerreiro;
import ClassesPlayer.Ladrao;
import ClassesPlayer.Mago;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // NOME DO PLAYER
        System.out.print("Digite o seu nickname: ");
        String nomePlayer = sc.nextLine();

        // ESCOLHA DE CLASSE
        int escolhaClasse;

        do {
            System.out.println("Escolha sua classe:");
            System.out.println("1. Arqueiro");
            System.out.println("2. Barbaro");
            System.out.println("3. Clerigo");
            System.out.println("4. Guerreiro");
            System.out.println("5. Ladrao");
            System.out.println("6. Mago");
            System.out.println("0. Sair");
            System.out.print("\nQual sua classe: ");

            
            escolhaClasse = sc.nextInt();
    
    
            switch (escolhaClasse) {
                case 1:
                    Arqueiro arqueiro = new Arqueiro(nomePlayer);
                    break;
                case 2:
                    Barbaro barbaro = new Barbaro(nomePlayer);
                    break;
                case 3:
                    Clerigo clerigo = new Clerigo(nomePlayer);
                    break;
                case 4:
                    Guerreiro guerreiro = new Guerreiro(nomePlayer);
                    break;
                case 5:
                    Ladrao ladrao = new Ladrao(nomePlayer);
                    break;
                case 6:
                    Mago mago = new Mago(nomePlayer);
                    break;
                case 7:
                System.out.println("Saindo do Jogo, até mais aventureiro!");
                    break;
                default:
                    System.out.println("Escolha uma classe valida!\n");
                    break;
            }
        } while (escolhaClasse >= 7);




        sc.close();

    
    }
}
