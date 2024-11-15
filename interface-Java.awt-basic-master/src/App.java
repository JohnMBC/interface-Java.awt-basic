import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {

    public static void main(String[] args) {
        JFrame formulario = new JFrame() ;
        JLabel rotulo = new JLabel("Exemplo de Label");
        
        formulario.setSize(300,100);
        formulario.setTitle("Titulo da label");
        formulario.setLocation(50, 30);

        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario.add(rotulo);
        formulario.setVisible(true);

}

}