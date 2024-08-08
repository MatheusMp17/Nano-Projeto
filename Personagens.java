/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nanoprojetoforca1;

/**
 *
 * @author Matheus
 */
public class Personagens {
    private static String forcaPersonagem;
    
    public static String getForca(int erros){
        String[] forca = new String[7];
        forca[0] = (""
            +         "_______________________\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         "_|_                   |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "______________________|");
        forca[1] = (""
            +         "_______________________\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         "_|_                   |\n"
            +         " O                    |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "______________________|");
        forca[2] = (""
            +         "_______________________\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         "_|_                   |\n"
            +         " O                    |\n"
            +         " |                    |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "______________________|");
        forca[3] = (""
            +         "_______________________\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         "_|_                   |\n"
            +         " O                    |\n"
            +         "/|                    |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "______________________|");
        forca[4] = (""
            +         "_______________________\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         "_|_                   |\n"
            +         " O                    |\n"
            +         "/|\\                   |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "______________________|");
        forca[5] = (""
            +         "_______________________\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         "_|_                   |\n"
            +         " o                    |\n"
            +         "/|\\                   |\n"
            +         "/                     |\n"
            +         "                      |\n"
            +         "______________________|");
        forca[6] = (""
            +         "_______________________\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         "_|_                   |\n"
            +         " o                    |\n"
            +         "/|\\                   |\n"
            +         "/ \\                   |\n"
            +         "                      |\n"
            +         "______________________|");
        forcaPersonagem = forca[erros];
        return forcaPersonagem;        
    }
    public static String getVitoria(){
        forcaPersonagem = (""
            +         "_______________________\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         " |                    |\n"
            +         "_|_                   |\n"
            +         "                      |\n"
            +         "                      |\n"
            +         "                      | \\O/\n"
            +         "                      |  | \n"
            +         "______________________| / \\");
        return forcaPersonagem;
    }
    public static String getAnjo(){
        forcaPersonagem =     "         ==\n"     +
                              "      <^\\()/^>\n" +
                              "       \\/  \\/\n" +
                              "        /  \\\n" +
                              "        `''`";
        return forcaPersonagem;
    }
}
