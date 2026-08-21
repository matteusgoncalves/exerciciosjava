import javax.swing.JOptionPane;

public class LT01_EstSeq04 {
    static void main (String args[]){

        float temp_celsius, temp_fa;

        temp_celsius = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura em ºCelsius: "));

        temp_fa = (9*temp_celsius)/5;

        System.out.println("A temperatura convertida é igual a: " + temp_fa);

    }

}
