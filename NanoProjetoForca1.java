/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nanoprojetoforca1;
import java.util.*;
public class NanoProjetoForca1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        char letra;
        String letraS;
        String palavraSorteada, palavraJogador = "", palavraTemporaria;
        int quantidadeErros = 0;
        palavraSorteada = bancoDePalavras.SelecaoPalavra();
        Personagens personagem = new Personagens();
        for(int l = 0; l < palavraSorteada.length(); l++){
          palavraJogador += "_";
        }
        do{
            System.out.println(personagem.getForca(quantidadeErros));
            System.out.println("");
        for(int l = 0; l < palavraJogador.length(); l++){
          System.out.print(palavraJogador.charAt(l) + " ");
        }

        System.out.println();
        System.out.print("Informe uma letra: ");
        letra = teclado.next().toLowerCase().charAt(0);
        letraS = "";
        letraS += letra;

        System.out.println();

        palavraTemporaria = ""; // usada para montar as letras jogadas corretamente
        if(palavraSorteada.contains(letraS)){
          for(int l = 0; l < palavraSorteada.length(); l++){
            if(letra == palavraSorteada.charAt(l)){
              palavraTemporaria += letra;
            }
            else{
              palavraTemporaria += palavraJogador.charAt(l);
            }
          }
          palavraJogador = palavraTemporaria;
        }
        else{
          //verificar usando o contains(letraS)
          //contabilizar erro, registrar a letra errada e exibir mensagem
          //fazer o teste para verificar se a letra já foi jogada.
          //se não foi
          quantidadeErros++;
          //se foi ?????
        }

        }while(quantidadeErros < 6 && !palavraJogador.equals(palavraSorteada));

        if(quantidadeErros < 6){
          System.out.println(personagem.getVitoria());
          System.out.println("PARAÉNS VOCÊ ESCAPOU DESSA VEZ!!!");
          System.out.println("APROVEITE O TEMPO QUE AINDA TE RESTA!");
        }
        else{
          System.out.println(personagem.getAnjo());
          System.out.println(personagem.getForca(quantidadeErros));
          System.out.println(palavraSorteada);
          System.out.println("VOCÊ PERDEU, TENHA MAIS SORTE NA PROXIMA TENTATIVA");
        }

        /*
        letra == s
        palavraSorteada   == teste
        palavraJogador    == _____
        palavraTemporaria == __s__
        */ 






        for(int l = 0; l < palavraJogador.length(); l++){
          System.out.print(palavraJogador.charAt(l) + " ");
        }
    }
}    
