package br.com.fiap;
import javax.swing.JOptionPane;

public class UsaGeometria{
	

public static void main (String[] args) {
    Geometria geometria1 = new Geometria();
     int number = 0;
     String str;
     try {
    	str = JOptionPane.showInputDialog("Defina um lado:");
        geometria1.setLado(Integer.parseInt(str));
        
        str = JOptionPane.showInputDialog("Defina uma altura:");
        geometria1.setAltura(Integer.parseInt(str));
        
        str = JOptionPane.showInputDialog("Defina um raio:");
        geometria1.setRaio(Integer.parseInt(str));
        
        str = JOptionPane.showInputDialog("Escolha: \n(1)c�lculo da �rea do Quadrado \n(2)c�lculo da �rea do Retangulo \n(3)C�lculo da �rea do Tri�ngulo \n(4)C�lculo da �rea do c�rculo");
         if(number == 1) {
             str = JOptionPane.showInputDialog("Calculando �rea do Quadrado");
             geometria1.calcularAreaQuadrado();
         } if (number == 2) {
             str = JOptionPane.showInputDialog("Calculando �rea do Ret�ngulo");
             geometria1.calcularAreaRetangulo();
         } if (number == 3) {
             str = JOptionPane.showInputDialog("Calculando �rea do Tri�ngulo");
             geometria1.calcularAreaTriangulo();
         } else {
             str = JOptionPane.showInputDialog("Calculando �rea do c�rculo");
             geometria1.calcularAreaCirculo();
         }
        } catch(Exception e) {
    		System.out.println(e.getMessage());
          }
   }

}
