import javax.swing.JOptionPane;

public class LT01_EstSeq02 {
    static void main (String args[]){

        int salario;
        float reajuste, salario_reajustado;

        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salário: "));
        reajuste = Float.parseFloat(JOptionPane.showInputDialog("Digite o percentual de reajuste: "));

        salario_reajustado = salario * (1 + reajuste/100);

        System.out.println("O salário reajustado é igual a: " + salario_reajustado);

    }
}
