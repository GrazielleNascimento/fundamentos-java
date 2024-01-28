
package entradasaidadados;

import java.util.Scanner;

/**
 *
 * @author blossom
 */
public class ExibirMix {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        float nota = sc.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
    }
    
}
