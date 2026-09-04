import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

    static double HorasTrabalhadas, ValorHora, PercentDesconto, NumDesc, SalarioLiquido;
     void main() {
        Math.sqrt(2);
        HorasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago por hora: "));
        PercentDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        NumDesc = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de dependentes: "));

        ProcedureCalcule();
        JOptionPane.showMessageDialog(null, "\n O salário líquido é: " + SalarioLiquido);
    }
    void ProcedureCalcule(){
        double SalarioBruto;
        SalarioBruto = HorasTrabalhadas * ValorHora;
        SalarioLiquido = SalarioBruto * (1-PercentDesconto/100) + 100*NumDesc;
    }


