import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Da inicio a ferramenta de escanear oque o usuario vai digitar

        System.out.println("Ola,Bem vindo");
        System.out.println("Vamos guarda informações importantes para você");

        System.out.println("Qual e seu nome completo?");
        String NomeUsuario = scanner.nextLine();


        System.out.println("Qual a sua idade?");
        int IdadeUsuario = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual e o seu CPF?");
        String CpfUsuario = scanner.nextLine();

        System.out.println("Quanto você pesa?");
        float PesoUsuario = scanner.nextFloat();

        System.out.println("Qual e a sua altura?");
        float AlturaUsuario = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Qual e seu estado civil?");
        String ECUsuario = scanner.nextLine();

        System.out.println("Certo,obrigado pela confiança aqui estão seus dados que foram salvos:");
        System.out.println("Seu nome e: " + NomeUsuario);
        System.out.println("Sua idade e: " + IdadeUsuario + " Anos");
        System.out.println("Seu CPF e: " + CpfUsuario);
        System.out.println("Seu Peso e: " + PesoUsuario);
        System.out.println("Sua Altura e: " + AlturaUsuario);
        System.out.println("Seu Estado Civi e: " +ECUsuario);

        scanner.close();
    }


}
