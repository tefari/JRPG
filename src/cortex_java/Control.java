package cortex_java;

import java.awt.event.*;
import javax.swing.JComponent;

public class Control implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        World.WorldChanged();
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

}
