/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nanoprojetoforca1;
import java.util.*;
public class NanoProjetoForca1 {
    public static void main(String[] args) {
        String asciiArt = "         ==\n" +
                              "      <^\\()/^>\n" +
                              "       \\/  \\/\n" +
                              "        /  \\\n" +
                              "        `''`";
        Scanner teclado = new Scanner(System.in);
        BancoDePalavras bancodepalavras = new BancoDePalavras();
        char letra;
        String letraS;
        Random gerador = new Random();
        String palavraSorteada, palavraJogador = "", palavraTemporaria;
        int quantidadeErros = 0;
        String personagem = " o\n/|\\\n/ \\";
        String[] erros = {"\n\n", " o\n\n", " o\n/\n", " o\n/|", " o\n/|\\", " o\n/|\\\n/"};
        palavraSorteada = bancodepalavras.SelecaoPalavra();

        //bancoPalavras1.get(gerador.nextInt()); // limitar ao tamanho do array list

        //_ _ _ _ _
        //inicialização da palavra do jogador
        for(int l = 0; l < palavraSorteada.length(); l++){
          palavraJogador += "_";
        }

        do{
          System.out.println("------------------------");
          System.out.println("------------------------");
          System.out.println("  _____________________");
          System.out.println(" |\n |\n |\n |\n |\n |\n |\n_|_");
          System.out.println(erros[quantidadeErros]);
          System.out.println("_____________________");

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
          System.out.println(erros[quantidadeErros]);
          System.out.println("venceu");
        }
        else{
          System.out.println("------------------------");
          System.out.println("------------------------");
          System.out.println("  _____________________");
          System.out.println(" |\n |\n |\n |\n |\n |\n |\n_|_");
          System.out.println(personagem);
          System.out.println("_____________________");
          System.out.println("perdeu");
          System.out.println(palavraSorteada);
          System.out.println(asciiArt);
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
