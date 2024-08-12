/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nanoprojetoforca1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Matheus
 */
public class BancoDePalavras {
   public static ArrayList<String> bancoPalavras = new ArrayList<String>();
   public static String palavraSelecionada;
   private static String codigo = "";
  // colocar todo o código dos bancos de palavras
  
  private static void inicializarBancoPalavrasPadrao(){
    bancoPalavras.add("casa");
    bancoPalavras.add("abacaxi");
    bancoPalavras.add("bola");
    bancoPalavras.add("cachorro");
    bancoPalavras.add("dado");
    bancoPalavras.add("elefante");
    bancoPalavras.add("faca");
    bancoPalavras.add("gato");
    bancoPalavras.add("hipopotamo");
    bancoPalavras.add("iguana");
    bancoPalavras.add("jacare");
    bancoPalavras.add("kiwi");
    bancoPalavras.add("leao");
    bancoPalavras.add("macaco");
    bancoPalavras.add("navio");
    bancoPalavras.add("ocelote");
    bancoPalavras.add("pato");
    bancoPalavras.add("quadro");
    bancoPalavras.add("rato");
    bancoPalavras.add("sapo");
    bancoPalavras.add("tigre");
    bancoPalavras.add("uva");
    bancoPalavras.add("vaca");
    bancoPalavras.add("xaxim");
    bancoPalavras.add("yeti");
    bancoPalavras.add("zebra");
    bancoPalavras.add("abobora");
    bancoPalavras.add("barriga");
    bancoPalavras.add("cabelo");
    bancoPalavras.add("dente");
    bancoPalavras.add("fogo");
    bancoPalavras.add("gelo");
    bancoPalavras.add("hifen");
    bancoPalavras.add("ilha");
    bancoPalavras.add("jacinto");
    bancoPalavras.add("livro");
    bancoPalavras.add("moto");
    bancoPalavras.add("nuvem");
    bancoPalavras.add("ocaso");
    bancoPalavras.add("pipa");
    bancoPalavras.add("quente");
    bancoPalavras.add("rosa");
    bancoPalavras.add("sol");
    bancoPalavras.add("trem");
    bancoPalavras.add("urso");
    bancoPalavras.add("vento");
    bancoPalavras.add("yoga");
    bancoPalavras.add("zangado");
    bancoPalavras.add("amigo");
    bancoPalavras.add("coracao");
    bancoPalavras.add("diamante");
    bancoPalavras.add("escada");
    bancoPalavras.add("feijao");
    bancoPalavras.add("guitarra");
    bancoPalavras.add("hotel");
    bancoPalavras.add("imagem");
    bancoPalavras.add("joia");
    bancoPalavras.add("lago");
    bancoPalavras.add("musica");
    bancoPalavras.add("oceano");
    bancoPalavras.add("piano");
    bancoPalavras.add("sombra");
    bancoPalavras.add("tapioca");
    bancoPalavras.add("vassoura");
    bancoPalavras.add("amarelo");
    bancoPalavras.add("casaco");
    bancoPalavras.add("desenho");
    bancoPalavras.add("estrela");
    bancoPalavras.add("festa");
    bancoPalavras.add("galinha");
    bancoPalavras.add("hamburguer");
    bancoPalavras.add("internet");
    bancoPalavras.add("janela");
    bancoPalavras.add("ketchup");
    bancoPalavras.add("lampada");
    bancoPalavras.add("moeda");
    bancoPalavras.add("navalha");
    bancoPalavras.add("pincel");
    bancoPalavras.add("quarto");
    bancoPalavras.add("relogio");
    bancoPalavras.add("sino");
    bancoPalavras.add("vulcao");
    bancoPalavras.add("abacate");
    bancoPalavras.add("bico");
    bancoPalavras.add("cesta");
    bancoPalavras.add("diva");
    bancoPalavras.add("esmalte");
    bancoPalavras.add("fruta");
    bancoPalavras.add("globo");
    bancoPalavras.add("horizonte");
    bancoPalavras.add("iluminacao");
    bancoPalavras.add("jardim");
    bancoPalavras.add("letra");
    bancoPalavras.add("mochila");
    bancoPalavras.add("oleo");
    bancoPalavras.add("prato");
    bancoPalavras.add("quadrado");
    bancoPalavras.add("rabo");
    bancoPalavras.add("selo");
    bancoPalavras.add("tenda");
  }
  private static void inicializarBancoPalavrasCodigoDificil(){
      Random gerador = new Random();
      char[] alfabeto = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      for(int x = 0; x < 10; x++){
          codigo += alfabeto[gerador.nextInt(26)];        
  }
  }
  public static String SelecaoPalavra(String modo){
      Random gerador = new Random();
      switch(modo){
          case "1":
              inicializarBancoPalavrasPadrao();
              palavraSelecionada = bancoPalavras.get(gerador.nextInt(bancoPalavras.size()));
              break;
          case "2":
              inicializarBancoPalavrasCodigoDificil();
              palavraSelecionada = codigo;
              break;
          default:
              palavraSelecionada = "0";
      }
      return palavraSelecionada;
  }
}
