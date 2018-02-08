package boletin_19;

import com.pnoceda.Libreria;
import com.pnoceda.Libro;
import javax.swing.JOptionPane;

public class Boletin_19 {

    public static void main(String[] args) {
        Libro libro;
        Libreria libreria = new Libreria();
        boolean end = false;
        do {
            String opcion = JOptionPane.showInputDialog("Menu: \n"
                    + "1-Engadir libro.\n"
                    + "2-Vender libro.\n"
                    + "3-Amosar libros.\n"
                    + "4-Dar de baixa.\n"
                    + "5-Consultar libro.\n"
                    + "0-Salir.\n");
            switch (opcion) {
                case "1":
                    String titulo = JOptionPane.showInputDialog("Introduce titulo: ");
                    String autor = JOptionPane.showInputDialog("Introduce autor: ");
                    String isbn = JOptionPane.showInputDialog("Introduce ISBN: ");
                    float prezo = Float.parseFloat(JOptionPane.showInputDialog("Introduce prezo: "));
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº unidades: "));
                    libro = new Libro(titulo, autor, isbn, prezo, unidades);
                    libreria.engadir(libro);
                    break;
                case "2":
                    titulo = JOptionPane.showInputDialog("Introduce titulo: ");
                    libreria.vender(titulo);
                    break;
                case "3":
                    libreria.amosar();
                    break;
                case "4":
                    libreria.baixa();
                    break;
                case "5":
                    titulo = JOptionPane.showInputDialog("Introduce titulo: ");
                    libreria.consulta(titulo);
                    break;
                case "0":
                    end = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Has introducido una opcion incorrecta");
                    break;
            }
        } while (end == false);
    }
}
