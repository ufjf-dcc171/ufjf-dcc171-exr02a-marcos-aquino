
package aula;

import javax.swing.JFrame;

public class Aula {

    public static void main(String[] args) {
        
        JanelaSoma janela = new JanelaSoma();
        
        janela.setSize(300, 200);
        
        janela.setLocationRelativeTo(null);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setVisible(true);
        
        
    }
}
