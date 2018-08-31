import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class simple_shapes extends JPanel {
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.add(new simple_shapes());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}