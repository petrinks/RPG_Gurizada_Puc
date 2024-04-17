package ClassesPlayer;

import java.util.Scanner;

public class Guerreiro {
    private String nome;
    protected String especialidade;
    protected int forca = 200;
    protected int inteligencia = 50;
    protected int vida = 200;
    protected int destreza = 100;

        //Construtor para poder criar uma nova instancia do Guerreiro
    public Guerreiro(String nomePlayer) {
            Scanner sc = new Scanner(System.in);
            this.nome = nomePlayer;

            System.out.println(String.format("\nSelecione o especialidade do guerreiro %s:\n", nomePlayer));
            System.out.println("1. Tanque de batalha");
            System.out.println("2. Duelista");
            System.out.println("3. Espadachin");

            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    this.especialidade = "Tanque de batalha";
                    break;
                case 2:
                    this.especialidade = "Duelista";
                    break;
                case 3:
                    this.especialidade = "Espadachin";
                    break;
            
                default:
                    System.out.println("Escolha uma classe valida!\n");
                    break;
            }

            System.out.println("\nSeus atributos atuais:");
            System.out.println("\nNome: " + nome);
            System.out.println("especialidade: " + especialidade);
            System.out.println("Força: " + forca);
            System.out.println("Inteligencia: " + inteligencia);
            System.out.println("Vidas: " + vida);
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
        System.out.println("Vida: " + vida);
        System.out.println("Destreza: " + destreza);
    }
    
}
