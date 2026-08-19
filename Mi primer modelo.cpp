import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Game extends JFrame {

    private int idGame;
    private String name;
    private String type;
    private int levels;
    private int amountGamers;

    public Game() {
        initComponents();
      
    }

    private void initComponents() {
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MY FIRST VIEW");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1117, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        pack();
        // </editor-fold>
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }
}
