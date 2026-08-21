import javax.swing.JOptionPane;

public class LT01_EstSeq05 {
    static void main (String args[]){

        float a, b, c, delta, x1, x2;

        a = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digite o coeficiente C: "));

        delta = (float) (Math.pow(b, 2.0) - (4 * a * c));

        x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
        x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

        System.out.println("A raiz x1 é igual a: " + x1 + " e a raiz x2 é igual a: " + x2);

    }
}
