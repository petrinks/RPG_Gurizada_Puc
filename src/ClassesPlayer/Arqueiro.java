package ClassesPlayer;

import java.util.Scanner;

public class Arqueiro {
    private String nome;
    protected String especialidade;
    protected int forca = 100;
    protected int inteligencia = 50;
    protected int vida = 120;
    protected int destreza = 150;

        //Construtor para poder criar uma nova instancia do Mago
    public Arqueiro(String nomePlayer) {
            Scanner sc = new Scanner(System.in);
            this.nome = nomePlayer;

            System.out.println(String.format("\nSelecione a especialidade do arqueiro %s:\n", nomePlayer));
            System.out.println("1. Furtividade");
            System.out.println("2. Atirador de longo alcance");
            System.out.println("3. Arqueiro de precisao");

            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    this.especialidade = "Furtividade";
                    break;
                case 2:
                    this.especialidade = "Atirador de longo alcance";
                    break;
                case 3:
                    this.especialidade = "Arqueiro de precisaos";
                    break;
            
                default:
                System.out.println("Escolha uma classe valida!\n");
                    break;
            }

            System.out.println("\nSeus atributos atuais:");
            System.out.println("\nNome: " + nome);
            System.out.println("Elemento: " + especialidade);
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
        System.out.println("Elemento: " + especialidade);
        System.out.println("Força: " + forca);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Vidas: " + vida);
        System.out.println("Destreza: " + destreza);
    }
}
