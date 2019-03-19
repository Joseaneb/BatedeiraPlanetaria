package poo;

import java.util.Scanner;

public class BatedeiraPlanetaria {

    //metodos
    public void aumentarVelocidade() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a opção 0 para ligar e 1 para aumentar a velocidade da batedeira: ");
        int velocidade = teclado.nextInt();

        switch (velocidade) {
            case 0:
                velocidade++;  //se estiver desligada passa para ligada
                break;
            case 1:
                velocidade++;  //se estiver na velocidade baixa passa para a velocidade alta
                break;
            default:
                System.out.println("Mantén velocidade!");

            // se estiver na velocidade alta, apenas mantém a velocidade

        }
    }

    public void diminuirVelocidade() {

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Digite a opção 1 para desligar e 2 para diminuir a velocidade da batedeira: ");
        int velocidade = teclado2.nextInt();

        switch (velocidade) {
            case 1:
                velocidade--;  //se estiver na velocidade baixa, passa para desligada
                break;
            case 2:
                velocidade--;  //se estiver na velocidade alta passa para velocidade baixa
                break;
            default:
                System.out.println("Desligado!");
            // se desligado não faz nada
        }
    }
    public void opcaoBatedores(){

        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Escolha o batedor:");
        System.out.println("Opção 1 - Batedor para clara em neve");
        System.out.println("Opçãi 2 - Batedor para massa leve");
        System.out.println("Opção 3 - Batedor para massa pesada");
        int batedor = teclado3.nextInt();

        switch (batedor){
            case 1:
                System.out.println("Batedor para clara em neve");
            break;
            case 2:
                System.out.println("Batedor para massa leve");
            break;
            case 3:
                System.out.println("Batedor para massa pesada");
            break;
            default:
                System.out.println("Informe opção para batedores");
        }
    }


}
