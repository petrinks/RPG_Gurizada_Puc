package ClassesPlayer;

import java.util.Scanner;

public class Clerigo {
    private String nome;
    protected String especialidade;
    protected int forca = 90;
    protected int inteligencia = 180;
    protected int vida = 180;
    protected int destreza = 100;

        //Construtor para poder criar uma nova instancia do Mago
    public Clerigo(String nomePlayer) {
            Scanner sc = new Scanner(System.in);
            this.nome = nomePlayer;

            System.out.println(String.format("\nSelecione o especialidade do clerigo %s:\n", nomePlayer));
            System.out.println("1. Curandeiro");
            System.out.println("2. Missionario Divino"); // vantagem em cidades com religiao
            System.out.println("3. Exorcista");

            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    this.especialidade = "Curandeiro";
                    break;
                case 2:
                    this.especialidade = "Missionario Divino";
                    break;
                case 3:
                    this.especialidade = "Exorcista";
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
