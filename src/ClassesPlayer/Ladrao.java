package ClassesPlayer;

import java.util.Scanner;

public class Ladrao {
    private String nome;
    protected String especialidade;
    protected int forca = 80;
    protected int inteligencia = 120;
    protected int vida = 120;
    protected int destreza = 200;

        //Construtor para poder criar uma nova instancia do Mago
    public Ladrao(String nomePlayer) {
            Scanner sc = new Scanner(System.in);
            this.nome = nomePlayer;

            System.out.println(String.format("\nSelecione o especialidade do ladrao %s:\n", nomePlayer));
            System.out.println("1. Ladrão das Sombras");
            System.out.println("2. Ladrão das Máscaras"); // se passa por pessoas ou monstros
            System.out.println("3. Mestre das cartas marcadas"); // Negocia com vendedores

            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    this.especialidade = "Ladrão das Sombras";
                    break;
                case 2:
                    this.especialidade = "Ladrão das Máscaras";
                    break;
                case 3:
                    this.especialidade = "Mestre das cartas marcadas";
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
