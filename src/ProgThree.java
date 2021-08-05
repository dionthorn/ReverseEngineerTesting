//import javax.microedition.lcdui.CommandListener;
//import javax.microedition.lcdui.Command;
//import javax.microedition.lcdui.Graphics;
//import com.nokia.mid.ui.FullCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

import java.awt.*;

public class ProgThree //extends FullCanvas
{
    ProgEight progEightRef;

    public ProgThree() {
        this.progEightRef = null;
    }

    public void paint(final Graphics graphics) {
        if (this.progEightRef != null) {
            this.progEightRef.e(graphics);
        }
    }
    /*
    public void addCommand(final Command command) {
        if (this.ProgOne != null) {
            this.ProgOne.ProgOne(command);
        }
    }

    public void removeCommand(final Command command) {
        if (this.ProgOne != null) {
            this.ProgOne.ProgTwo(command);
        }
    }

    public void setCommandListener(final CommandListener commandListener) {
        if (this.ProgOne != null) {
            this.ProgOne.ProgOne(commandListener);
        }
    }
    */
    protected void keyPressed(final int n) {
        if (this.progEightRef != null) {
            this.progEightRef.b(n);
        }
    }
}