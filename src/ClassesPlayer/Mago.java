package ClassesPlayer;


import java.util.Scanner;

public class Mago {
    private String nome;
    protected String elemento;
    protected int forca = 70;
    protected int inteligencia = 200;
    protected int vida = 100;
    protected int destreza = 20;

        //Construtor para poder criar uma nova instancia do Mago
    public Mago() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o nome do mago: ");
            this.nome = sc.nextLine();

            System.out.println(String.format("\nSelecione o elemento do mago %s:\n", nome));
            System.out.println("1. Fogo");
            System.out.println("2. Água");
            System.out.println("3. Terra");
            System.out.println("4. Ar");

            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    this.elemento = "Fogo";
                    break;
                case 2:
                    this.elemento = "Água";
                    break;
                case 3:
                    this.elemento = "Terra";
                    break;
                case 4:
                    this.elemento = "Ar";
                    break;
            
                default:
                    break;
            }

            System.out.println("\nSeus atributos atuais:");
            System.out.println("\nNome: " + nome);
            System.out.println("Elemento: " + elemento);
            System.out.println("Força: " + forca);
            System.out.println("Inteligencia: " + inteligencia);
            System.out.println("Vidas: " + vida);
            System.out.println("Destreza: " + destreza);

            sc.close();
        }

        //criar habilidades (metodos)
    
        // Metodo que mostra os Status do
    public void imprimirInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Elemento: " + elemento);
        System.out.println("Força: " + forca);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Vidas: " + vida);
        System.out.println("Destreza: " + destreza);
    }
    
}
