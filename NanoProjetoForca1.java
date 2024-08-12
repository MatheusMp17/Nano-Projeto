/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nanoprojetoforca1;
import java.util.*;
public class NanoProjetoForca1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Jogo jogo = new Jogo();
        String modoDeJogo;
        String palavraSorteada = "";
        System.out.println(""
                          + "---------------------------------\n"
                          + " -------------------------------\n "
                          + "          BEM VINDO\n"
                          + "               AO\n"
                          + "          JOGO DA FORCA\n"
                          + " -------------------------------\n "
                          + "---------------------------------\n");
        do{
            System.out.println("MODO DE JOGO");
            System.out.println("(0) SAIR)");
            System.out.println("(1) Modo facil");
            System.out.println("(2) Modo Normal");
            System.out.println("(3) Modo Dificil");
            System.out.println("(4) Modo Impossivel)");
            modoDeJogo = teclado.next();
            switch (modoDeJogo){
                case "0":
                    System.out.println("ADEUS");
                    return;
                case "1":
                    jogo.Modo1();
                    break;
                case "2":
                    jogo.Modo2();
                    break;
                case "3":
                    jogo.Modo3();
                    break;
                case "4":
                    jogo.Modo4();
                    break;
                default:
                    System.out.println("INVÁLIDO");
                    palavraSorteada = "0";     
            }
            System.out.print("\nDESEJA JOGAR MAIS UMA VEZ S / N:");
            modoDeJogo = teclado.next().toUpperCase();
            if(modoDeJogo.equals("S")){
                palavraSorteada = "0";
            }
            else{
                break;
            }
        }while(palavraSorteada.equals("0"));
    }
}