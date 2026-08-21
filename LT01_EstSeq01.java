import javax.swing.JOptionPane;

public class LT01_EstSeq01 {
    static void main (String args[]){

        int valor1, valor2, area;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do primeiro lado: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do segundo lado"));

        area = valor1 * valor2;

        System.out.println("A área é igual a: " + area);

    }
}
