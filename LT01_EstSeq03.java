
import javax.swing.JOptionPane;

public class LT01_EstSeq03 {
    static void main (String args[]){

        int altura, base, area;

        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a medidade da altura: "));
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da base: "));

        area = (base * altura)/2;

        System.out.println("A área do triângulo é igual a: " + area);

    }

}
