/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nanoprojetoforca1;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void Modo1(){
        Random gerador = new Random();
        Scanner teclado = new Scanner(System.in);
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        String dica  = "", dicaTemp = "";
        char letra;
        String letraS;
        String palavraSorteada, palavraJogador = "", palavraTemporaria, listaDeUsados = "";
        int quantidadeErros = 0;
        int determinanteDica = 0;
        palavraSorteada = bancoDePalavras.SelecaoPalavra("1");
        Personagens personagem = new Personagens();
        for(int l = 0; l < palavraSorteada.length(); l++){
          palavraJogador += "_";
        }
        do{
            determinanteDica += 1;
            System.out.println(personagem.getForca(quantidadeErros));
            System.out.println("");
            System.out.println(listaDeUsados);
        for(int l = 0; l < palavraJogador.length(); l++){
          System.out.print(palavraJogador.charAt(l) + " ");
        }
        System.out.println();
        if(determinanteDica == 3 || determinanteDica == 5){            
            for(int y = 0; y < palavraSorteada.length(); y++){
                dicaTemp = Character.toString(palavraSorteada.charAt(y));
                if (!listaDeUsados.contains(dicaTemp)){
                    dica = dicaTemp;
                    break;
                    }
                }
            dicaTemp = "";
            System.out.println("Dica: Letra " + dica);
            dica = "";
        }
        System.out.println();
        System.out.print("Informe uma letra: ");
        letra = teclado.next().toLowerCase().charAt(0);
        letraS = "";
        letraS += letra;

        System.out.println();

        palavraTemporaria = ""; // usada para montar as letras jogadas corretamente
        if(listaDeUsados.contains(letraS)){
            System.out.println("ESSA LETRA JÁ FOI USADA");
        }
        else if(palavraSorteada.contains(letraS)){
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
          quantidadeErros++;
        }
        if(!listaDeUsados.contains(Character.toString(letra)))
        listaDeUsados += letra;
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
        for(int l = 0; l < palavraJogador.length(); l++){
          System.out.print(palavraJogador.charAt(l) + " ");
        }
    }
    public static void Modo2(){
        Scanner teclado = new Scanner(System.in);
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        char letra;
        String letraS;
        String palavraSorteada, palavraJogador = "", palavraTemporaria, listaDeUsados = "";
        int quantidadeErros = 0;
        palavraSorteada = bancoDePalavras.SelecaoPalavra("1");
        Personagens personagem = new Personagens();
        for(int l = 0; l < palavraSorteada.length(); l++){
          palavraJogador += "_";
        }
        do{
            System.out.println(personagem.getForca(quantidadeErros));
            System.out.println("");
            System.out.println(listaDeUsados);
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
        if(listaDeUsados.contains(letraS)){
            System.out.println("ESSA LETRA JÁ FOI USADA");
        }
        else if(palavraSorteada.contains(letraS)){
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
          quantidadeErros++;
        }
        if(!listaDeUsados.contains(Character.toString(letra)))
        listaDeUsados += letra;
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
        for(int l = 0; l < palavraJogador.length(); l++){
          System.out.print(palavraJogador.charAt(l) + " ");
        }
    }
    public static void Modo3(){
        Scanner teclado = new Scanner(System.in);
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        char letra;
        String letraS;
        String palavraSorteada, palavraJogador = "", palavraTemporaria, listaDeUsados = "";
        int quantidadeErros = 0;
        palavraSorteada = bancoDePalavras.SelecaoPalavra("1");
        Personagens personagem = new Personagens();
        for(int l = 0; l < palavraSorteada.length(); l++){
          palavraJogador += "_";
        }
        do{
            System.out.println(personagem.getForca(quantidadeErros));
            System.out.println("");
            System.out.println(listaDeUsados);
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
        if(listaDeUsados.contains(letraS)){
            quantidadeErros++;
        }
        else if(palavraSorteada.contains(letraS)){
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
          quantidadeErros++;
        }
        if(!listaDeUsados.contains(Character.toString(letra)))
        listaDeUsados += letra;
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
        for(int l = 0; l < palavraJogador.length(); l++){
          System.out.print(palavraJogador.charAt(l) + " ");
        }
    }
    public static void Modo4(){
        Scanner teclado = new Scanner(System.in);
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        char letra;
        String letraS;
        String palavraSorteada, palavraJogador = "", palavraTemporaria, listaDeUsados = "";
        int quantidadeErros = 0;
        palavraSorteada = bancoDePalavras.SelecaoPalavra("2");
        Personagens personagem = new Personagens();
        for(int l = 0; l < palavraSorteada.length(); l++){
          palavraJogador += "_";
        }
        do{
            System.out.println(personagem.getForca(quantidadeErros));
            System.out.println("");
            System.out.println(listaDeUsados);
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
        if(listaDeUsados.contains(letraS)){
            quantidadeErros++;
        }
        else if(palavraSorteada.contains(letraS)){
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
          quantidadeErros++;
        }
        if(!listaDeUsados.contains(Character.toString(letra)))
        listaDeUsados += letra;
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
        for(int l = 0; l < palavraJogador.length(); l++){
          System.out.print(palavraJogador.charAt(l) + " ");
        }
    }
}
