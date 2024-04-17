package ClassesPlayer;

import java.util.Scanner;

public class Barbaro {
    private String nome;
    protected String especialidade;
    protected int forca = 220;
    protected int inteligencia = 30;
    protected int vida = 250;
    protected int destreza = 70;

        //Construtor para poder criar uma nova instancia do Mago
    public Barbaro(String nomePlayer) {
            Scanner sc = new Scanner(System.in);
            this.nome = nomePlayer;
            int escolha;

            do {
                System.out.println(String.format("\nSelecione o especialidade do barbaro %s:\n", nomePlayer));
                System.out.println("1. Berserker");
                System.out.println("2. Fúria Primordial");
                System.out.println("3. Fúria da trovao");
    
                escolha = sc.nextInt();
    
    
                switch (escolha) {
                    case 1:
                        this.especialidade = "Berserker";
                        break;
                    case 2:
                        this.especialidade = "Fúria Primordial";
                        break;
                    case 3:
                        this.especialidade = "Fúria da trovao";
                        break;
                
                    default:
                    System.out.println("Escolha uma classe valida!\n");
                        break;
                }
            } while (escolha >= 3);


            System.out.println("\nSeus atributos atuais:");
            System.out.println("\nNome: " + nome);
            System.out.println("especialidade: " + especialidade);
            System.out.println("Força: " + forca);
            System.out.println("Inteligencia: " + inteligencia);
            System.out.println("Vida: " + vida);
            System.out.println("Destreza: " + destreza);

            sc.close();
        }

        //criar habilidades (metodos)
    
        // Metodo que mostra os Status do
    public void imprimirStatus() {
        System.out.println("\nNome: " + nome);
        System.out.println("especialidade: " + especialidade);
        System.out.println("Força: " + forca);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Vidas: " + vida);
        System.out.println("Destreza: " + destreza);
    }
    
}
