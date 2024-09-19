import java.util.Scanner;

import javax.swing.JOptionPane;

public class PerimetroCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		declaração de variáveis para JOptionPane
		String raio;
		double fRaio, PC;
		
//		entrada de dados
		raio = JOptionPane.showInputDialog("Digite o raio do círculo:");
				fRaio = Float.parseFloat(raio);
				PC = 2 * Math.PI * fRaio;
				JOptionPane.showMessageDialog(null, "O perímetro do círculo é: " + String.format("%.2f" , PC)); 

	}

}
