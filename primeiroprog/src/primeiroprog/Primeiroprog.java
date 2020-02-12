package primeiroprog;
import javax.swing.JOptionPane;
public class Primeiroprog {
    public static void main(String[] args) {
        String primeironumero = JOptionPane.showInputDialog("coloque o primeiro numero");
        String segundonumero = JOptionPane.showInputDialog("coloque o segundo numero");
    
        int numum = Integer.parseInt(primeironumero);
        int numdois = Integer.parseInt(segundonumero);
        
        int soma = numum + numdois;
        
        JOptionPane.showMessageDialog(null,"a soma é "+soma, "soma dos dois numeros anteriores", JOptionPane.PLAIN_MESSAGE);
    }
    
}
