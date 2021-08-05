//import javax.microedition.lcdui.Canvas;
//import javax.microedition.lcdui.Graphics;
//import javax.microedition.lcdui.ChoiceGroup;
//import javax.microedition.lcdui.Item;
//import javax.microedition.lcdui.StringItem;
//import javax.microedition.lcdui.Form;
//import javax.microedition.lcdui.List;
//import javax.microedition.lcdui.Displayable;
//import javax.microedition.lcdui.Screen;
//import javax.microedition.lcdui.Command;
//import javax.microedition.lcdui.Font;
//import javax.microedition.lcdui.CommandListener;
import java.awt.*;
import java.util.Vector;
//import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgEight implements Runnable
{
    static ProgThree[] progThreeArray;
    static int staticInt;
    static Image staticImage;
    Vector vectorA;
    CommandListener commandListener;
    static final Font fontA;
    private static final Font fontB;
    private static final Font fontC;
    static final Font fontD;
    static final Font fontE;
    static final Command commandA;
    static final Command commandB;
    static final Command commandC;
    static final Command commandD;
    static final Command commandE;
    static final String[] staticStringArray;
    int intA;
    int intB;
    int intC;
    private ESGame esGame;
    Screen screen;
    int intD;
    private int intE;
    Vector vectorB;
    String stringA;
    String[] stringArray;
    volatile int volatileInt;
    private boolean booleanA;
    private Thread thread;
    long longA;
    Displayable displayable;
    Object objectA;
    Object objectB;
    int intF;
    int intG;
    int intH;
    Font b;
    int intI;
    int intJ;
    int intK;
    int intL;
    int intM;
    boolean booleanB;

    public ProgEight(final ESGame l, final int q, final int b) {
        this.booleanB = false;
        this.esGame = l;
        this.intA = q;
        this.intB = b;
        this.intC = 0;
        this.screen = null;
        this.intD = 0;
        this.objectA = null;
        this.objectB = null;
        this.stringA = null;
        this.stringArray = null;
        this.thread = null;
        this.vectorA = new Vector(5);
    }

    void e() {
        this.displayable = (Displayable)ProgEight.progThreeArray[ProgEight.staticInt];
    }

    void o() {
        this.displayable = (Displayable)ProgEight.progThreeArray[ProgEight.staticInt];
    }

    void a(final String s, final String[] array, final Vector vector) {
        this.a(s, array, vector, true);
    }

    void a(final String s, final String[] array, final Vector n, final boolean b) {
        final List i = new List(s, 3);
        this.screen = (Screen)i;
        this.intD = 1;
        for (int length = array.length, j = 0; j < length; ++j) {
            i.append(array[j], (Image)null);
        }
        this.vectorB = n;
        this.intK = 0;
        this.intL = 0;
        this.intM = 0;
        this.displayable = (Displayable)ProgEight.progThreeArray[ProgEight.staticInt];
        this.a(ProgEight.commandB);
        if (b) {
            this.a(ProgEight.commandC);
        }
        this.a((CommandListener)this.esGame);
    }

    void n() {
        String string = "";
        for (int i = 0; i < ProgEight.staticStringArray.length; ++i) {
            string += ProgEight.staticStringArray[i];
        }
        this.a("Exiting", string);
        this.b(ProgEight.commandA);
        this.a(ProgEight.commandE);
    }

    void a(final String s, final String s2) {
        this.a(s, s2, false);
    }

    void a(final String s, final String s2, final boolean b) {
        final Form i = new Form(s);
        this.screen = (Screen)i;
        this.intD = 2;
        i.append((Item)new StringItem((String)null, s2));
        this.intI = 10;
        this.intJ = 10;
        this.intK = 0;
        this.intL = 0;
        this.intM = 0;
        this.displayable = (Displayable)ProgEight.progThreeArray[ProgEight.staticInt];
        this.a(ProgEight.commandA);
        this.a((CommandListener)this.esGame);
    }

    void a(final String s, final String s2, final String[] array, final Vector vector) {
        this.a(s, s2, array, vector, false);
    }

    void a(final String s, final String original, final String[] array, final Vector n, final boolean b) {
        final Form i = new Form(s);
        this.screen = (Screen)i;
        this.intD = 2;
        i.append((Item)new StringItem((String)null, original));
        this.intI = 15;
        this.intJ = 15;
        final ChoiceGroup choiceGroup = new ChoiceGroup((String)null, 1);
        for (int length = array.length, j = 0; j < length; ++j) {
            choiceGroup.append(array[j], (Image)null);
        }
        this.intE = 1;
        i.append((Item)choiceGroup);
        this.vectorB = n;
        this.intK = 0;
        this.intL = 0;
        this.intM = 0;
        this.displayable = (Displayable)ProgEight.progThreeArray[ProgEight.staticInt];
        this.a(ProgEight.commandB);
        this.a(ProgEight.commandC);
        this.a((CommandListener)this.esGame);
        if (original != null && original.indexOf("<TAG>") >= 0) {
            this.stringA = new String(original);
        }
    }

    void a(final String s, final String s2, final String s3, final String[] array, final Vector n) {
        final Form i = new Form(s);
        this.screen = (Screen)i;
        this.intD = 2;
        i.append((Item)new StringItem((String)null, s2));
        i.append((Item)new StringItem((String)null, s3));
        this.intI = 15;
        this.intJ = 15;
        final ChoiceGroup choiceGroup = new ChoiceGroup((String)null, 1);
        for (int length = array.length, j = 0; j < length; ++j) {
            choiceGroup.append(array[j], (Image)null);
        }
        this.intE = 2;
        i.append((Item)choiceGroup);
        this.vectorB = n;
        this.displayable = (Displayable)ProgEight.progThreeArray[ProgEight.staticInt];
        this.a(ProgEight.commandB);
        this.a(ProgEight.commandC);
        this.a((CommandListener)this.esGame);
    }

    public void e(final Graphics graphics) {
        final Graphics graphics2 = ProgEight.staticImage.getGraphics();
        switch (this.intA) {
            case 1 -> {
                System.out.println("        IN CANVAS DOWNLOAD PAINT!");
            }
            case 2 -> {
                this.f(graphics2);
            }
            case 3 -> {
                this.c(graphics2);
            }
            case 5 -> {
                this.a(graphics2, 1);
            }
            case 6 -> {
                this.a(graphics2, 2);
            }
            case 4 -> {
                this.d(graphics2);
            }
            case 8, 9, 10, 11 -> {
                this.b(graphics2);
            }
        }
        this.a(graphics2);
        graphics.drawImage(ProgEight.staticImage, 0, 0, 20);
    }

    private void f(final Graphics graphics) {
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.b(), 20 + this.k());
        if (ESGame.aG) {
            graphics.setColor(16777215);
            graphics.fillRect(0, 0, this.b(), 20 + this.k());
            graphics.drawImage(ESGame.aA, this.b() / 2, 10, 17);
            int n = 10 + ESGame.aA.getHeight() + 3;
            graphics.setColor(0);
            for (int i = 0; i < ProgEight.staticStringArray.length; ++i) {
                graphics.drawString(ProgEight.staticStringArray[i], this.b() / 2, n, 17);
                n += 14;
            }
            graphics.drawString("Distributed by:", this.b() / 2, 143, 17);
            graphics.drawImage(ESGame.aa, this.b() / 2, 158, 17);
        }
        else if (this.esGame.ac) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.b(), 20 + this.k());
            graphics.drawImage(ESGame.O, this.b() / 2, 20, 17);
            graphics.drawImage(ESGame.aU, this.b() / 2, 100, 17);
        }
        else {
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.b(), 20 + this.k());
            graphics.drawImage(ESGame.O, this.b() / 2, 20, 17);
            graphics.drawImage(ESGame.aU, this.b() / 2, 100, 17);
            graphics.setColor(16777215);
            graphics.fillRect(12, 165, 152, 22);
            graphics.setColor(10485760);
            graphics.fillRect(13, 166, 3 * this.volatileInt / 2, 20);
        }
    }

    private void b(final Graphics graphics) {
        graphics.setColor(11429934);
        graphics.fillRect(0, 0, this.b(), 20 + this.k());
        graphics.setFont(ProgEight.fontE);
        graphics.setColor(16777215);
        final int n = this.b() / 2;
        if (this.intA == 8) {
            graphics.drawString("Creating New Game", n, 30, 17);
        }
        else if (this.intA == 9) {
            graphics.drawString("Loading Game", n, 30, 17);
        }
        else if (this.intA == 10) {
            graphics.drawString("Saving Game", n, 30, 17);
        }
        else if (this.intA == 11) {
            graphics.drawString("Loading Dungeon", n, 30, 17);
        }
        graphics.drawString("Please Wait", n, 45, 17);
        graphics.setColor(16777215);
        graphics.fillRect((this.b() - 90) / 2, 60, 90, 20);
        final int n2 = this.volatileInt * 88 / 100;
        graphics.setColor(255);
        graphics.fillRect((this.b() - 88) / 2, 61, n2, 18);
    }

    private void a(final Graphics graphics, final String s) {
        final Font font = graphics.getFont();
        graphics.setFont(ProgEight.fontB);
        final int color = graphics.getColor();
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.b(), 14);
        graphics.setColor(16777215);
        graphics.drawString(s, this.b() / 2, 0, 17);
        graphics.setColor(color);
        graphics.setFont(font);
    }

    private void c(final Graphics graphics) {
        graphics.setColor(11429934);
        graphics.fillRect(0, 0, this.b(), 20 + this.k());
        this.a(graphics, this.screen.getTitle());
        graphics.setFont(this.b = ProgEight.fontD);
        this.intF = this.b.getHeight();
        this.intG = 20;
        this.intH = 15;
        final String[] r = this.r();
        final int length = r.length;
        this.intL = this.intK + Math.min(length, 10) - 1;
        for (int i = this.intK; i <= this.intL; ++i) {
            this.a(graphics, r[i], i == this.a());
        }
        if (this.intK > 0) {
            this.a(graphics, 155, 180, 1);
        }
        if (this.intL + 1 < length) {
            this.a(graphics, 165, 180, 2);
        }
    }

    private void a(final Graphics graphics, final int n) {
        final Form form = (Form)this.screen;
        graphics.setColor(11429934);
        graphics.fillRect(0, 0, this.b(), 20 + this.k());
        this.a(graphics, ((Screen)form).getTitle());
        graphics.setFont(this.b = ProgEight.fontD);
        this.intF = this.b.getHeight();
        this.intG = 20;
        this.intH = 15;
        for (int i = 0; i < n; ++i) {
            final String text = ((StringItem)form.get(i)).getText();
            if (this.booleanB) {
                final String[] c = this.c(text);
                for (int j = 0; j < c.length; ++j) {
                    graphics.setColor(16776960);
                    graphics.drawString(c[j], this.intH, this.intG, 20);
                    this.intG += this.intF;
                }
            }
            else {
                if (i == 0) {
                    graphics.setColor(16776960);
                }
                else {
                    graphics.setColor(16777215);
                }
                graphics.drawString(text, this.intH, this.intG, 20);
                this.intG += this.intF;
            }
        }
        this.intG += 5;
        final String[] r = this.r();
        final int length = r.length;
        this.intL = this.intK + Math.min(length, 9) - 1;
        for (int k = this.intK; k <= this.intL; ++k) {
            this.a(graphics, r[k], k == this.a());
        }
        if (this.intK > 0) {
            this.a(graphics, 155, 180, 1);
        }
        if (this.intL + 1 < length) {
            this.a(graphics, 165, 180, 2);
        }
    }

    private void a(final Graphics graphics, final String s, final boolean b) {
        if (b) {
            graphics.setColor(6710886);
            graphics.fillRect(this.intH - 10, this.intG - 1, this.b() - 2 * (this.intH - 10), this.intF + 2);
        }
        graphics.setColor(16776960);
        graphics.drawString(s, this.intH, this.intG, 20);
        this.intG += this.intF;
        ++this.intG;
    }

    private void d(final Graphics graphics) {
        final Form form = (Form)this.screen;
        graphics.setColor(11429934);
        graphics.fillRect(0, 0, this.b(), 20 + this.k());
        this.a(graphics, ((Screen)form).getTitle());
        graphics.setFont(this.b = ProgEight.fontD);
        this.intF = this.b.getHeight();
        this.intG = 20;
        this.intH = 5;
        final String[] c = this.c(((StringItem)form.get(0)).getText());
        this.intM = c.length;
        this.intL = this.intK + Math.min(this.intM, 11) - 1;
        graphics.setColor(16776960);
        for (int i = this.intK; i <= this.intL; ++i) {
            graphics.drawString(c[i], this.intH, this.intG, 20);
            this.intG += this.intF;
        }
        if (this.intK > 0) {
            this.a(graphics, 155, 180, 1);
        }
        if (this.intL + 1 < this.intM) {
            this.a(graphics, 165, 180, 2);
        }
    }

    private void a(final Graphics graphics, final int n, final int n2, final int n3) {
        graphics.getColor();
        graphics.setColor(0);
        final int n4 = 5;
        if (n3 == 1) {
            for (int i = 0; i < n4; ++i) {
                graphics.drawLine(n - i, n2 + i, n + i, n2 + i);
            }
        }
        else {
            for (int j = 0; j < n4; ++j) {
                graphics.drawLine(n - (n4 - j), n2 + j, n + (n4 - j), n2 + j);
            }
        }
    }

    String[] c(final String s) {
        final Vector vector = new Vector();
        final String[] b = this.b(s);
        for (int length = b.length, i = 0; i < length; ++i) {
            this.a(vector, b[i]);
        }
        return a(vector);
    }

    private String[] b(final String s) {
        final Vector<String> vector = new Vector<String>();
        int i = 0;
        do {
            final int index = s.indexOf(10, i);
            if (index < 0) {
                vector.addElement(s.substring(i, s.length()));
                break;
            }
            vector.addElement(s.substring(i, index));
            i = index + 1;
        } while (i < s.length());
        return a(vector);
    }

    private void a(final Vector vector, final String s) {
        final int n = this.b() - this.intI - this.intJ;
        final String[] c = ProgSix.getStringArrayTrim(s);
        final int length = c.length;
        String s2 = "";
        for (int i = 0; i < length; ++i) {
            final String str = c[i];
            String string = s2 + str;
            if (this.b.stringWidth(string) > n) {
                if (this.b.stringWidth(str) > n) {
                    if (s2.length() > 0) {
                        vector.addElement(new String(s2));
                    }
                    final String[] d = this.d(str);
                    for (int j = 0; j < d.length - 1; ++j) {
                        vector.addElement(new String(d[j]));
                    }
                    string = d[d.length - 1];
                }
                else {
                    vector.addElement(new String(s2));
                    string = str;
                }
            }
            s2 = string;
            if (i < length - 1) {
                final String string2 = s2 + " ";
                if (this.b.stringWidth(string2) > n) {
                    vector.addElement(new String(s2));
                    s2 = "";
                }
                else {
                    s2 = string2;
                }
            }
        }
        vector.addElement(new String(s2));
    }

    private String[] d(final String s) {
        final int n = this.b() - this.intI - this.intJ;
        final Vector<String> vector = new Vector<String>();
        final int length = s.length();
        String string = "";
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            final String string2 = string + char1;
            if (this.b.stringWidth(string2) > n) {
                vector.addElement(new String(string));
                string = char1 + "";
            }
            else {
                string = string2;
            }
        }
        vector.addElement(new String(string));
        return a(vector);
    }

    private static String[] a(final Vector vector) {
        final int size = vector.size();
        final String[] array = new String[size];
        for (int i = 0; i < size; ++i) {
            array[i] = vector.elementAt(i);
        }
        return array;
    }

    protected void b(final int n) {
        if (n == -6) {
            final Command s = this.s();
            if (s != null) {
                this.commandListener.commandAction(s, this.displayable);
                return;
            }
        }
        else if (n == -7) {
            final Command l = this.l();
            if (l != null) {
                this.commandListener.commandAction(l, this.displayable);
                return;
            }
        }
        switch (this.c(n)) {
            case 6: {
                if (this.intA == 3 || this.intA == 5 || this.intA == 6) {
                    int a = this.a();
                    if (a < this.d() - 1) {
                        this.a(++a);
                        if (this.intL < a) {
                            ++this.intK;
                            ++this.intL;
                        }
                        this.c();
                        this.f();
                        break;
                    }
                    break;
                }
                else {
                    if (this.intA == 4 && this.intL < this.intM - 1) {
                        ++this.intK;
                        ++this.intL;
                        this.c();
                        this.f();
                        break;
                    }
                    break;
                }
                break;
            }
            case 1: {
                if (this.intA == 3 || this.intA == 5 || this.intA == 6) {
                    int a2 = this.a();
                    if (a2 > 0) {
                        this.a(--a2);
                        if (this.intK > a2) {
                            --this.intK;
                            --this.intL;
                        }
                        this.c();
                        this.f();
                        break;
                    }
                    break;
                }
                else {
                    if (this.intA != 4) {
                        break;
                    }
                    this.a();
                    if (this.intK > 0) {
                        --this.intK;
                        --this.intL;
                        this.c();
                        this.f();
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }

    String[] r() {
        switch (this.intA) {
            case 3: {
                final List list = (List)this.screen;
                final int size = list.size();
                final String[] array = new String[size];
                for (int i = 0; i < size; ++i) {
                    array[i] = list.getString(i);
                }
                return array;
            }
            case 5:
            case 6: {
                final ChoiceGroup choiceGroup = (ChoiceGroup)((Form)this.screen).get(this.intE);
                final int size2 = choiceGroup.size();
                final String[] array2 = new String[size2];
                for (int j = 0; j < size2; ++j) {
                    array2[j] = choiceGroup.getString(j);
                }
                return array2;
            }
            default: {
                return null;
            }
        }
    }

    String p() {
        return this.r()[this.a()];
    }

    int a() {
        final int n = -1;
        switch (this.intA) {
            case 3: {
                return ((List)this.screen).getSelectedIndex();
            }
            case 5:
            case 6: {
                return ((ChoiceGroup)((Form)this.screen).get(this.intE)).getSelectedIndex();
            }
            default: {
                return n;
            }
        }
    }

    void a(final int n) {
        switch (this.intA) {
            case 3: {
                ((List)this.screen).setSelectedIndex(n, true);
                break;
            }
            case 5:
            case 6: {
                ((ChoiceGroup)((Form)this.screen).get(this.intE)).setSelectedIndex(n, true);
                break;
            }
        }
    }

    protected void h() {
        switch (this.intA) {
            case 2: {
                this.g();
                break;
            }
        }
    }

    protected void q() {
        switch (this.intA) {
            case 1:
            case 2: {
                this.i();
                break;
            }
        }
    }

    private void g() {
        System.out.println("IN START HELPER THREAD IN UICANVAS");
        this.thread = new Thread(this);
        System.out.println("Helper thread in UICanvas: " + this.thread);
        System.out.println("num active threads = " + Thread.activeCount());
        this.booleanA = true;
        this.thread.start();
    }

    private void i() {
        this.booleanA = false;
    }

    public void run() {
        if (this.intA == 2) {
            this.m();
        }
        else if (this.intA == 1) {
            System.out.println("Running incrementShortZ download helper thread to repaint");
        }
    }

    private void m() {
        try {
            this.longA = 0L;
            System.out.println("Just before helper thread loop in UICanvas");
            while (this.booleanA && (this.volatileInt < 100 || this.longA < 4000L)) {
                final long currentTimeMillis = System.currentTimeMillis();
                this.c();
                this.f();
                final long n = System.currentTimeMillis() - currentTimeMillis;
                try {
                    if (n < 500L) {
                        Thread.sleep(500L - n);
                    }
                }
                catch (Exception ex) {}
                this.longA += System.currentTimeMillis() - currentTimeMillis;
                System.out.println("Progress pct is " + this.volatileInt);
            }
            ESGame.aG = true;
            this.esGame.ac = false;
            this.a(2000L);
            this.esGame.ac = true;
            ESGame.aG = false;
            this.a(1000L);
            this.esGame.ac = false;
            ESGame.aa = null;
            ESGame.aA = null;
            ESGame.O = null;
            ESGame.aU = null;
            this.thread = null;
            ESGame.c("After nuking splash");
            System.out.println("End of splash, changing to next");
            this.esGame.a(this.objectB);
        }
        catch (Throwable t) {
            t.printStackTrace();
            this.esGame.a(this.esGame.w);
        }
    }

    private void a(final long n) {
        long n2 = 0L;
        do {
            this.c();
            this.f();
            try {
                Thread.sleep(500L);
            }
            catch (Exception ex) {}
            n2 += 500L;
        } while (n2 <= n);
    }

    int dPE() {
        if (this.intA == 3) {
            return ((List)this.screen).size();
        }
        if (this.intA == 5 || this.intA == 6) {
            return ((ChoiceGroup)((Form)this.screen).get(this.intE)).size();
        }
        return 0;
    }

    void a(final int n, final String text) {
        final Form form = (Form)this.screen;
        if (this.intA == 6) {
            System.out.println("type is form2, size is " + form.size());
        }
        if (this.intA == 5 || this.intA == 6 || this.intA == 4) {
            ((StringItem)form.get(n)).setText(text);
        }
    }

    void a(final String title) {
        if (this.screen != null) {
            this.screen.setTitle(title);
        }
    }

    void e(final String text) {
        final Form form = (Form)this.screen;
        try {
            if (form != null) {
                ((StringItem)form.get(0)).setText(text);
            }
        }
        catch (Throwable t) {}
    }

    String t() {
        final Form form = (Form)this.screen;
        try {
            if (form != null) {
                return ((StringItem)form.get(0)).getText();
            }
        }
        catch (Throwable t) {}
        return null;
    }

    public void a(final Command obj) {
        this.vectorA.addElement(obj);
    }

    public void b(final Command obj) {
        this.vectorA.removeElement(obj);
    }

    public void a(final CommandListener j) {
        this.commandListener = j;
    }

    private void a(final Graphics graphics) {
        if (this.vectorA.size() == 0) {
            return;
        }
        graphics.setColor(16777215);
        graphics.fillRect(0, 190, this.b(), 20);
        this.vectorA.size();
        graphics.setColor(0);
        graphics.setFont(ProgEight.fontA);
        final Command s = this.s();
        if (s != null) {
            graphics.drawString(s.getLabel(), 10, 192, 20);
        }
        final Command l = this.l();
        if (l != null) {
            graphics.drawString(l.getLabel(), this.b() - 10, 195, 24);
        }
    }

    private Command l() {
        final int size = this.vectorA.size();
        Command command = null;
        if (size == 1) {
            command = this.vectorA.elementAt(0);
        }
        else if (size == 2) {
            for (int i = 0; i < 2; ++i) {
                final Command command2 = this.vectorA.elementAt(i);
                if (command2 == ProgEight.commandA || command2 == ProgEight.commandB) {
                    command = command2;
                    break;
                }
            }
        }
        return command;
    }

    private Command s() {
        final int size = this.vectorA.size();
        Command command = null;
        if (size == 2) {
            for (int i = 0; i < 2; ++i) {
                final Command command2 = this.vectorA.elementAt(i);
                if (command2 == ProgEight.commandD || command2 == ProgEight.commandC) {
                    command = command2;
                    break;
                }
            }
        }
        return command;
    }

    static ProgThree j() {
        return ProgEight.progThreeArray[ProgEight.staticInt];
    }

    public void c() {
        if (ESGame.ax != null && this.intB != ESGame.ax.intB) {
            return;
        }
        ((Canvas)ProgEight.progThreeArray[ProgEight.staticInt]).repaint();
    }

    public void f() {
        ((Canvas)ProgEight.progThreeArray[ProgEight.staticInt]).serviceRepaints();
    }

    public int b() {
        return ((Canvas)ProgEight.progThreeArray[ProgEight.staticInt]).getWidth();
    }

    public int k() {
        return ((Canvas)ProgEight.progThreeArray[ProgEight.staticInt]).getHeight();
    }

    public int c(final int n) {
        return ((Canvas)ProgEight.progThreeArray[ProgEight.staticInt]).getGameAction(n);
    }

    static {
        (ProgEight.progThreeArray = new ProgThree[2])[0] = new ProgThree();
        ProgEight.progThreeArray[1] = new ProgThree();
        ProgEight.staticInt = 0;
        try {
            ProgEight.staticImage = Image.createImage(((Canvas)ProgEight.progThreeArray[0]).getWidth(), ((Canvas)ProgEight.progThreeArray[0]).getHeight());
        }
        catch (Throwable t) {
            System.out.println("Error allocating bufferImage");
        }
        fontA = Font.getFont(0, 1, 8);
        fontB = Font.getFont(0, 1, 0);
        fontC = Font.getFont(64, 0, 8);
        fontD = Font.getFont(0, 1, 8);
        fontE = Font.getFont(0, 1, 0);
        commandA = new Command("Ok", 3, 0);
        commandB = new Command("Select", 3, 0);
        commandC = new Command("Cancel", 4, 0);
        commandD = new Command("Back", 4, 0);
        commandE = new Command("Exit", 7, 0);
        staticStringArray = new String[] { "(ProgThree) 2003 Vir2L Studios, ", "ProgOne ZeniMax Media company. ", "The Elder Scrolls and Vir2L ", "are registered trademarks ", "of ZeniMax Media Inc. ", "All rights reserved." };
    }
}