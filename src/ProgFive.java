//import javax.microedition.lcdui.Canvas;
import java.awt.*;
import java.util.Enumeration;
import java.util.Hashtable;
//import com.nokia.mid.ui.DirectUtils;
//import javax.microedition.lcdui.Graphics;
//import javax.microedition.lcdui.Image;
//import javax.microedition.lcdui.Font;
//import com.nokia.mid.ui.FullCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgFive extends Canvas implements Runnable // extends FullCanvas
{
    private static final Font aj;
    private static final Font M;
    private static final Font w;
    private static final Font K;
    static final int[][][] n;
    private static final byte[][] ae;
    private static final byte[][] a;
    private static final boolean[][] J;
    private static final char[] e;
    private static final char[] O;
    private static final int[][] o;
    private ESGame H;
    private int ac;
    private int T;
    private Thread au;
    private boolean ak;
    private boolean z;
    private boolean aB;
    ProgTen ax;
    byte aD;
    boolean v;
    byte c;
    long aC;
    long s;
    long B;
    long V;
    boolean aw;
    int p;
    static boolean aa;
    static boolean m;
    static boolean R;
    static boolean W;
    static Image h;
    static Image Y;
    static ProgSeven[] q;
    static Image[] aE;
    static ProgSeven[] ab;
    static ProgSeven[] ar;
    static ProgSeven[] u;
    static Image[] y;
    private static byte[][] l;
    private static byte[][] F;
    private static int f;
    static boolean S;
    static boolean ao;
    static boolean am;
    static int aq;
    static boolean av;
    static boolean ay;
    static boolean I;
    static boolean Z;
    static boolean ap;
    static boolean U;
    static boolean ad;
    static long as;
    static String[] d;
    private static int X;
    static boolean af;
    private static boolean al;
    private static boolean at;
    static boolean E;
    static boolean A;
    static final String[] r;
    static final String[] ag;
    static final String[] C;
    static final String[] Q;
    static final String[] t;
    static final String[] g;
    static final String[] N;
    static final String[] b;
    static final String[] P;
    static final String[] ah;
    static final String[] x;
    static final String[] D;
    static final String[] aA;
    static final String[] L;
    static final String[] an;
    static final String[][] i;
    static ProgFour k;
    static ProgFour j;
    private static long ai;
    private static boolean az;
    private static String G;

    public ProgFive(final ESGame h) {
        this.au = new Thread(this);
        this.H = h;
        this.T = 0;
        this.ac = 0;
        this.z = false;
        this.ak = false;
        this.aB = false;
        this.ax = null;
        this.aD = 1;
        this.v = false;
        this.c = 0;
        this.s = 0L;
        this.aC = 0L;
        this.p = 0;
        this.aw = false;
        ProgFive.aa = false;
        ProgFive.m = false;
        ProgFive.R = false;
        ProgFive.W = false;
        ProgFive.l = new byte[7][7];
        ProgFive.F = new byte[17][17];
        ProgFive.aq = 0;
        this.B = 0L;
        this.V = 0L;
    }

    public void paint(final Graphics graphics) {
        if (this.aD == 3) {
            this.drawYourDead(graphics);
        }
        else if (this.c == 1 || this.c == 2) {
            this.drawCamping(graphics);
        }
        else {
            this.drawMonstersMaybe(graphics);
        }
    }

    private void drawYourDead(final Graphics graphics) {
        graphics.setColor(Color.black);//0
        graphics.fillRect(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
        graphics.setColor(new Color(16, 77, 215));//1677215
        graphics.setFont(ProgFive.w);
        graphics.drawString("You're Dead!", ((Canvas)this).getWidth() / 2, ((Canvas)this).getHeight() / 2);// ,33
    }

    private void drawCamping(final Graphics graphics) {
        graphics.setColor(Color.black); // 0
        graphics.fillRect(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
        graphics.setColor(new Color(16, 77, 215));//1677215
        graphics.setFont(ProgFive.w);
        graphics.drawString("CAMPING", ((Canvas)this).getWidth() / 2, ((Canvas)this).getHeight() / 2);// ,33
    }

    private void drawMonstersMaybe(final Graphics graphics) {
        graphics.setColor(Color.black); //0
        graphics.fillRect(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
        this.j(graphics);
        this.b(graphics);
        if (ProgFive.W) {
            this.b(graphics, this.ax.r());
        }
        try {
            this.g(graphics);
        }
        catch (Throwable obj) {
            System.out.println("Error in paintMonsters: " + obj);
        }
        this.a(graphics);
        this.d(graphics);
        this.l(graphics);
        this.drawProgFiveImages(graphics);
        if (ProgFive.az) {
            this.drawProgFiveString(graphics);
        }
        if (ProgFive.f == 1 && !this.ax.k(3)) {
            this.k(graphics);
        }
        if (ProgFive.f == 2 && !this.ax.k(3)) {
            this.h(graphics);
        }
    }

    private void drawProgFiveString(final Graphics graphics) {
        graphics.setColor(new Color(16, 77, 215));//1677215
        graphics.drawString(ProgFive.G, 60, 10);// ,17
    }

    private void drawProgFiveImages(final Graphics graphics) {
        if (ProgFive.S) {
            graphics.drawImage(ProgFive.aE[0], 40 + ProgSix.getIntFromESG(30), 50 + ProgSix.getIntFromESG(20), 20);
            ProgFive.S = false;
        }
        if (ProgFive.ao) {
            graphics.drawImage(ProgFive.aE[1], 40 + ProgSix.getIntFromESG(30), 50 + ProgSix.getIntFromESG(22), 20);
            ProgFive.ao = false;
        }
        if (ProgFive.am) {
            graphics.drawImage(ProgFive.aE[2], 50 + ProgSix.getIntFromESG(2), 80 + ProgSix.getIntFromESG(2), 20);
            ProgFive.am = false;
        }
    }

    private void j(final Graphics graphics) {
        final ProgNine b = this.ax.b();
        final byte[][] ae = this.ax.ae;
        if (!this.ax.k(3)) {
            if (this.ax.k(4)) {
                graphics.setColor(new Color(104,85,760));//10485760
                graphics.fillRect(0, 0, ((Canvas)this).getWidth(), ProgFive.h.getHeight());
            }
            else {
                for (int i = 0; i < 5; ++i) {
                    // graphics.drawImage(ProgFive.byteMatrix, ProgNine * 36, 0, 20); // ,20
                }
            }
        }
        for (int j = 0; j < 5; ++j) {
            final int n = j * 18;
            for (int k = 0; k < 6; ++k) {
                final int n2 = ProgFive.n[j][k][0];
                final int n3 = ProgFive.n[j][k][1];
                if (ProgSix.isAndNotZero((byte)1, b.a(ProgFive.n[j][k][2], ProgFive.n[j][k][3], ae))) {
                    this.a(graphics, this.a(n2, n3, -1), n);
                    break;
                }
            }
        }
        for (int l = 5; l < 10; ++l) {
            final int n4 = l * 18;
            for (int n5 = 0; n5 < 6; ++n5) {
                final int n6 = ProgFive.n[9 - l][n5][0];
                final int n7 = ProgFive.n[9 - l][n5][1];
                if (ProgSix.isAndNotZero((byte)1, b.a(-ProgFive.n[9 - l][n5][2], ProgFive.n[9 - l][n5][3], ae))) {
                    this.a(graphics, this.a(n6, n7, 1), n4);
                    break;
                }
            }
        }
    }

    private void b(final Graphics graphics) {
        for (int i = 8; i <= 12; ++i) {
            final Object element = ProgTen.ad.elementAt(i);
            if (element instanceof byte[]) {
                final byte[] array = (byte[])element;
                if (array.length == 8 || array.length == 7) {
                    this.a(graphics, array, i);
                }
            }
        }
        for (int j = 4; j <= 6; ++j) {
            final Object element2 = ProgTen.ad.elementAt(j);
            if (element2 instanceof byte[]) {
                final byte[] array2 = (byte[])element2;
                if (array2.length == 8 || array2.length == 7) {
                    this.a(graphics, array2, j);
                }
            }
        }
        final byte[] element3 = ProgTen.ad.elementAt(1);
        if (element3 instanceof byte[]) {
            final byte[] array3 = element3;
            if (array3.length == 8 || array3.length == 7) {
                this.a(graphics, array3, 1);
            }
        }
    }

    private void a(final Graphics graphics, final int n, final int n2) {
        graphics.setClip(n2, 0, 18, ((Canvas)this).getHeight());
        if (n > 7) {
            //DirectUtils.getDirectGraphics(graphics).drawImage(nMinus2.Y, n2 - (staticInt - 8) * 18, 0, 20, 8192);
        }
        else {
            graphics.drawImage(ProgFive.Y, n2 - n * 18, 0, 20);
        }
        graphics.setClip(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
    }

    private boolean a(final String[] d, final int x) {
        if (x > ProgFive.X || x < 0) {
            ProgFive.d = d;
            if (x < 0) {
                ProgFive.X = 10;
            }
            else {
                ProgFive.X = x;
            }
            return true;
        }
        return false;
    }

    private void c() {
        if (ProgSix.isAndNotZero((byte)32, this.ax.b().a(0, 1, this.ax.ae))) {
            final int r = this.ax.r();
            ProgFive.W = true;
            if (this.a(ProgFive.i[r], 1)) {
                ProgFive.as = System.currentTimeMillis();
                ProgFive.ad = true;
            }
        }
        else {
            ProgFive.W = false;
            if (!this.d() && ProgEleven.d && this.ax.m == k.byteG) {
                k.getStringForByteA();
            }
        }
    }

    private int a(final int n, final int n2, final int n3) {
        if (n == 12) {
            return n2;
        }
        if (n3 == -1) {
            return 8 + n2;
        }
        return 7 - n2;
    }

    private void b(final Graphics graphics, final int n) {
        switch (n) {
            case 0: {
                this.e(graphics, 1, 1);
                break;
            }
            case 1: {
                this.e(graphics, 6, 1);
                break;
            }
            case 2: {
                this.e(graphics, 7, 1);
                break;
            }
            case 3: {
                this.e(graphics, 2, 1);
                break;
            }
            case 5: {
                this.e(graphics, 8, 0);
                break;
            }
            case 4: {
                this.e(graphics, 3, 2);
                break;
            }
            case 6: {
                this.a(graphics, Math.min(k.byteG, 3) - 1);
                break;
            }
        }
        graphics.setClip(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
    }

    private void a(final Graphics graphics, final int n) {
        final int n2 = 15;
        final int n3 = 32;
        this.a(graphics, ProgFive.q[28], ProgFive.o[n][0], 1, n2, n3);
        this.a(graphics, ProgFive.q[28], ProgFive.o[n][0], 1, n2 + ProgFive.q[28].getIntA(), n3, 8192);
        this.a(graphics, ProgFive.q[29], ProgFive.o[n][1], 3, n2 + 45, n3 - 22);
    }

    private void g(final Graphics graphics) {
        ProgFive.A = false;
        for (int i = 8; i <= 12; ++i) {
            final Object element = ProgTen.ad.elementAt(i);
            if (element instanceof byte[]) {
                final byte[] array = (byte[])element;
                if (array.length == 28 && array[6] != 0) {
                    ProgFive.A = true;
                    this.c(graphics, array[2], i);
                }
            }
            else if (element instanceof String && ((String)element).equals("W")) {
                this.b(graphics, 32, i);
            }
        }
        for (int j = 4; j <= 6; ++j) {
            final Object element2 = ProgTen.ad.elementAt(j);
            if (element2 instanceof byte[]) {
                final byte[] array2 = (byte[])element2;
                if (array2.length == 28 && array2[6] != 0) {
                    ProgFive.A = true;
                    this.c(graphics, array2[2], j);
                }
            }
            else if (element2 instanceof String && ((String)element2).equals("W")) {
                this.d(graphics, 31, j);
            }
        }
        final byte[] element3 = ProgTen.ad.elementAt(1);
        if (element3 instanceof byte[]) {
            final byte[] array3 = element3;
            if (array3.length == 28 && array3[6] != 0) {
                ProgFive.A = true;
                this.c(graphics, array3[2], 1);
            }
        }
        else if (element3 instanceof String) {}
    }

    private void a(final Graphics graphics, final byte[] array, final int n) {
        if (n == 1) {
            this.a(graphics, array, false);
        }
        else if (n >= 4 && n <= 6) {
            this.b(graphics, array, false, n);
        }
        else if (n >= 8 && n <= 12) {
            this.a(graphics, array, false, n);
        }
    }

    private static boolean a(final byte[] array) {
        return array.length == 7 && (array[6] & 0x4) != 0x0;
    }

    private void a(final Graphics graphics, final byte[] array, final boolean b) {
        if (a(array)) {
            this.a(graphics, ProgFive.u[0], 45, 65);
        }
        else {
            final int n = 60;
            int n2 = 94;
            final int n3 = 0;
            if (array.length == 8) {
                this.a(graphics, ProgFive.ab[n3], n, n2);
            }
            else if (array.length == 7) {
                n2 += 14;
                this.a(graphics, ProgFive.ar[n3], n, n2);
            }
        }
    }

    private void b(final Graphics graphics, final byte[] array, final boolean b, final int n) {
        final int n2 = 1;
        int n3 = 0;
        int n4 = 0;
        final boolean a = a(array);
        switch (n) {
            case 4: {
                n3 = 14;
                n4 = 80;
                if (a) {
                    n3 = 14;
                    n4 = 55;
                    break;
                }
                break;
            }
            case 5: {
                n3 = 68;
                n4 = 80;
                if (a) {
                    n3 = 73;
                    n4 = 55;
                    break;
                }
                if (array.length == 7) {
                    n3 = 73;
                    n4 = 80;
                    break;
                }
                break;
            }
            case 6: {
                n3 = 122;
                n4 = 80;
                if (a) {
                    n3 = 125;
                    n4 = 55;
                    break;
                }
                if (array.length == 7) {
                    n3 = 132;
                    n4 = 80;
                    break;
                }
                break;
            }
        }
        if (a) {
            n4 += 13;
            this.a(graphics, ProgFive.u[n2], n3, n4);
        }
        else if (array.length == 8) {
            n4 += 17;
            this.a(graphics, ProgFive.ab[n2], n3, n4);
        }
        else if (array.length == 7) {
            n4 += 20;
            this.a(graphics, ProgFive.ar[n2], n3, n4);
        }
    }

    private void a(final Graphics graphics, final byte[] array, final boolean b, final int n) {
        final int n2 = 2;
        int n3 = 0;
        int n4 = 0;
        final boolean a = a(array);
        switch (n) {
            case 8: {
                n3 = 10;
                n4 = 59;
                if (a) {
                    n3 = 10;
                    n4 = 52;
                    break;
                }
                break;
            }
            case 9: {
                n3 = 44;
                n4 = 59;
                if (a) {
                    n3 = 44;
                    n4 = 52;
                    break;
                }
                break;
            }
            case 10: {
                n3 = 79;
                n4 = 59;
                if (a) {
                    n3 = 79;
                    n4 = 52;
                    break;
                }
                break;
            }
            case 11: {
                n3 = 112;
                n4 = 59;
                if (a) {
                    n3 = 112;
                    n4 = 52;
                    break;
                }
                break;
            }
            case 12: {
                n3 = 146;
                n4 = 59;
                if (a) {
                    n3 = 146;
                    n4 = 52;
                    break;
                }
                break;
            }
        }
        if (a) {
            n4 += 20;
            this.a(graphics, ProgFive.u[n2], n3, n4);
        }
        else if (array.length == 8) {
            n4 += 28;
            this.a(graphics, ProgFive.ab[n2], n3, n4);
        }
        else if (array.length == 7) {
            n4 += 28;
            this.a(graphics, ProgFive.ar[n2], n3, n4);
        }
    }

    private int c(final int n) {
        if (n >= 1 && n <= 5) {
            return 5;
        }
        if (n >= 6 && n <= 10) {
            return 12;
        }
        if (n >= 11 && n <= 25) {
            return 19;
        }
        if (n >= 26 && n <= 40) {
            return 26;
        }
        if (n == 41) {
            return 31;
        }
        return -1;
    }

    private int a(final int n) {
        if (n >= 1 && n <= 5) {
            return 6;
        }
        if (n >= 6 && n <= 10) {
            return 13;
        }
        if (n >= 11 && n <= 25) {
            return 20;
        }
        if (n >= 26 && n <= 40) {
            return 27;
        }
        if (n == 41) {
            return 32;
        }
        return -1;
    }

    private void c(final Graphics graphics, final int n, final int n2) {
        if (n2 == 1) {
            this.c(graphics, n);
        }
        else if (n2 >= 4 && n2 <= 6) {
            this.d(graphics, this.c(n), n2);
        }
        else if (n2 >= 8 && n2 <= 12) {
            this.b(graphics, this.a(n), n2);
        }
        graphics.setClip(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
    }

    private int b(final int n) {
        if (n >= 1 && n <= 5) {
            return 0;
        }
        if (n >= 6 && n <= 10) {
            return 1;
        }
        if (n >= 11 && n <= 25) {
            return 2;
        }
        if (n >= 26 && n <= 40) {
            return 3;
        }
        return -1;
    }

    private void c(final Graphics graphics, final int n) {
        this.e(graphics, n, -1);
    }

    private void e(final Graphics graphics, final int n, final int n2) {
        if (n == 41) {
            this.a(graphics, 2);
            return;
        }
        final int b = this.b(n);
        if (b >= 0) {
            final byte b2 = ProgFive.ae[b][2];
            final byte b3 = ProgFive.ae[b][3];
            final byte b4 = ProgFive.ae[b][4];
            final byte b5 = ProgFive.ae[b][5];
            final int n3 = b2 + ProgFive.ae[b][6];
            final int n4 = b3 + ProgFive.ae[b][7];
            final byte b6 = ProgFive.ae[b][8];
            final byte b7 = ProgFive.ae[b][9];
            final boolean b8 = b6 >= 0;
            final byte b9 = ProgFive.a[n - 1][0];
            int n5 = ProgFive.a[n - 1][1];
            if (n2 >= 0) {
                n5 = n2;
            }
            final boolean b10 = ProgFive.J[n - 1][0];
            final boolean b11 = ProgFive.J[n - 1][1];
            final boolean b12 = ProgFive.J[n - 1][2];
            final boolean b13 = ProgFive.J[n - 1][3];
            this.a(graphics, ProgFive.q[b4], b9, b5, b2, b3);
            if (b8) {
                this.a(graphics, ProgFive.q[b6], n5, b7, n3, n4);
            }
            if (b10) {
                this.a(graphics, ProgFive.q[ProgFive.ae[b][12]], 0, 1, b2 + ProgFive.ae[b][10], b3 + ProgFive.ae[b][11]);
            }
            if (b11) {
                this.a(graphics, ProgFive.q[ProgFive.ae[b][15]], 0, 1, b2 + ProgFive.ae[b][13], b3 + ProgFive.ae[b][14]);
            }
            if (b12) {
                this.a(graphics, ProgFive.q[ProgFive.ae[b][18]], 0, 1, b2 + ProgFive.ae[b][16], b3 + ProgFive.ae[b][17]);
            }
            if (b13) {
                this.a(graphics, ProgFive.q[ProgFive.ae[b][21]], 0, 1, b2 + ProgFive.ae[b][19], b3 + ProgFive.ae[b][20]);
            }
        }
    }

    private void d(final Graphics graphics, final int n, final int n2) {
        this.a(graphics, n, n2, 0, 1);
    }

    private void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        int n6 = 0;
        switch (n2) {
            case 4: {
                n5 = 10;
                n6 = 38;
                break;
            }
            case 5: {
                n5 = 62;
                n6 = 38;
                break;
            }
            case 6: {
                n5 = 112;
                n6 = 38;
                break;
            }
        }
        this.a(graphics, ProgFive.q[n], n3, n4, n5, n6);
    }

    private void b(final Graphics graphics, final int n, final int n2) {
        int n3 = 0;
        int n4 = 0;
        switch (n2) {
            case 8: {
                n3 = 10;
                n4 = 44;
                break;
            }
            case 9: {
                n3 = 44;
                n4 = 44;
                break;
            }
            case 10: {
                n3 = 79;
                n4 = 44;
                break;
            }
            case 11: {
                n3 = 112;
                n4 = 44;
                break;
            }
            case 12: {
                n3 = 146;
                n4 = 44;
                break;
            }
        }
        //DirectUtils.getDirectGraphics(graphics).drawPixels(ProgFive.vectorA[staticInt].ProgSeven, true, 0, ProgFive.vectorA[staticInt].byteMatrix, n3, n4, ProgFive.vectorA[staticInt].nMinus2, ProgFive.vectorA[staticInt].incrementShortZ, 0, 4444);
    }

    private void a(final Graphics graphics) {
        graphics.setColor(new Color(167,76,96));//16776960
        graphics.fillRect(5, 130, 40, 7);
        graphics.fillRect(5, 138, 40, 7);
        graphics.fillRect(5, 146, 40, 7);
        graphics.setColor(new Color(167,11,68));//16711680
        graphics.fillRect(6, 131, this.ax.n(2) * 38 / this.ax.U[3], 5);
        graphics.setColor(new Color(6,52,80));//65280
        graphics.fillRect(6, 139, this.ax.n(4) * 38 / this.ax.U[5], 5);
        graphics.setColor(new Color(2,5,5));// 255
        int n = this.ax.n(6) * 38 / this.ax.U[7];
        if (n > 40) {
            n = 40;
        }
        graphics.fillRect(6, 147, n, 5);
    }

    private void l(final Graphics graphics) {
        if (!ProgFive.ad) {
            return;
        }
        graphics.setColor(new Color(130,80,93)); // 13080935
        graphics.fillRoundRect(96, 118, 75, 35, 5, 5);
        graphics.setFont(ProgFive.aj);
        graphics.setColor(Color.black); // 0
        graphics.drawString(ProgFive.d[0], 100, 122); // 20
        if (ProgFive.d.length > 1) {
            graphics.drawString(ProgFive.d[1], 100, 134); // 20
        }
    }

    private void d(final Graphics graphics) {
        graphics.setFont(ProgFive.aj);
        graphics.setClip(0, 0, ((Canvas)this).getWidth(), ((Canvas)this).getHeight());
        graphics.setColor(Color.black); // 0
        graphics.fillRect(0, 156, ((Canvas)this).getWidth(), 52);
        graphics.setColor(new Color(130, 80, 93)); // 13080935
        graphics.fillRoundRect(2, 158, ((Canvas)this).getWidth() - 4, 48, 5, 5);
        graphics.setColor(Color.black); // 0
        final int n = ProgFive.aq = this.j();
        if (n == 0) {
            graphics.drawImage(ProgFive.y[1], 14, 174, 20);
            graphics.drawImage(ProgFive.y[2], 62, 174, 20);
            graphics.drawImage(ProgFive.y[3], 104, 174, 20);
            graphics.drawImage(ProgFive.y[5], 144, 174, 20);
            //graphics.drawChar(ProgFive.nMinus2[1], 5, 180, 20);
            //graphics.drawChar(ProgFive.nMinus2[2], 53, 180, 20);
            //graphics.drawChar(ProgFive.nMinus2[3], 96, 180, 20);
            //graphics.drawChar(ProgFive.nMinus2[5], 135, 180, 20);
        }
        else if (n == 1) {
            graphics.drawImage(ProgFive.y[0], 14, 174, 20);
            graphics.drawImage(ProgFive.y[1], 62, 174, 20);
            graphics.drawImage(ProgFive.y[2], 104, 174, 20);
            graphics.drawImage(ProgFive.y[3], 144, 174, 20);
            //graphics.drawChar(nMinus2.nMinus2[0], 5, 180, 20);
            //graphics.drawChar(nMinus2.nMinus2[1], 53, 180, 20);
            //graphics.drawChar(nMinus2.nMinus2[2], 96, 180, 20);
            //graphics.drawChar(nMinus2.nMinus2[3], 135, 180, 20);
        }
        else if (n == 2) {
            graphics.drawImage(ProgFive.y[1], 14, 174, 20);
            graphics.drawImage(ProgFive.y[2], 62, 174, 20);
            graphics.drawImage(ProgFive.y[3], 104, 174, 20);
            graphics.drawImage(ProgFive.y[4], 144, 174, 20);
            //graphics.drawChar(nMinus2.nMinus2[1], 5, 180, 20);
            //graphics.drawChar(nMinus2.nMinus2[2], 53, 180, 20);
            //graphics.drawChar(nMinus2.nMinus2[3], 96, 180, 20);
            //graphics.drawChar(nMinus2.nMinus2[4], 135, 180, 20);
        }
    }

    private int j() {
        if (ProgFive.aa) {
            return 1;
        }
        if (ProgFive.m || ProgFive.R) {
            return 2;
        }
        if (ProgFive.W && !this.d()) {
            return 2;
        }
        return 0;
    }

    private void a(final Graphics graphics, final ProgSeven ProgSeven, final int n, final int n2, final int n3, final int n4) {
        this.a(graphics, ProgSeven, n, n2, n3, n4, 0);
    }

    private void a(final Graphics graphics, final ProgSeven ProgSeven, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = ProgSeven.getIntA() / n2;
        graphics.setClip(n3, n4, n6, ProgSeven.getIntB());
        //DirectUtils.getDirectGraphics(graphics).drawPixels(ProgSeven.ProgSeven, true, 0, ProgSeven.byteMatrix, n3 - staticInt * n6, n4, ProgSeven.nMinus2, ProgSeven.incrementShortZ, n5, 4444);
    }

    private void k(final Graphics graphics) {
        graphics.setFont(ProgFive.aj);
        graphics.setColor(new Color(167,72,15)); // 1677215
        //graphics.drawChar(ProgFive.fontA[this.ax.ak], 16, 10, 20);
        graphics.setColor(Color.black); // 0
        graphics.fillRect(10, 20, 23, 23);
        this.a(graphics, 10, 20, 7, 3, 1, ProgFive.l);
    }

    private void h(final Graphics graphics) {
        graphics.setFont(ProgFive.K);
        graphics.setColor(new Color(167,72,15)); // 16777215
        //graphics.drawChar(ProgFive.fontA[this.ax.ak], 58, 10, 20);
        final int n = 89;
        graphics.fillRect(15, 25, n, n);
        this.a(graphics, 15, 25, 17, 5, 2, ProgFive.F);
    }

    private void a(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final byte[][] array) {
        final int n6 = n3 / 2;
        for (int i = 0; i < n3; ++i) {
            final int n7 = n2 + n5 + i * n4;
            for (int j = 0; j < n3; ++j) {
                final int n8 = n + n5 + j * n4;
                if (array[j][i] == 1) {
                    graphics.setColor(Color.black); // 0
                    graphics.fillRect(n8, n7, n4, n4);
                }
                else if (array[j][i] == 0) {
                    graphics.setColor(new Color(167,72,15)); // 16777215
                    graphics.fillRect(n8, n7, n4, n4);
                }
                else if ((array[j][i] & 0x2) != 0x0) {
                    graphics.setColor(new Color(167,116,80)); // 16711680
                    graphics.fillRect(n8, n7, n4, n4);
                }
                else if ((array[j][i] & 0x4) != 0x0) {
                    graphics.setColor(new Color(2, 5, 5)); // 255
                    graphics.fillRect(n8, n7, n4, n4);
                }
                else if ((array[j][i] & 0x8) != 0x0) {
                    graphics.setColor(new Color(133,69,59)); // 13369599
                    graphics.fillRect(n8, n7, n4, n4);
                }
                if (i == n6 && j == n6) {
                    graphics.setColor(new Color(65,28,0)); // 65280
                    graphics.fillRect(n8, n7, n4, n4);
                }
            }
        }
    }

    void q() {
        this.ax.b().c((int)this.ax.l, (int)this.ax.k, (int)this.ax.ak, ProgFive.l);
    }

    void p() {
        this.ax.b().a((int)this.ax.l, (int)this.ax.k, (int)this.ax.ak, ProgFive.F);
    }

    public void keyPressed(final int n) {
        this.T = this.ac;
        if (n == 49) {
            if (ProgFive.aq == 1) {
                ProgFive.av = true;
            }
            return;
        }
        if (n == 50) {
            this.p = 1;
            return;
        }
        if (n == 51) {
            ProgFive.ap = true;
            return;
        }
        if (n == 52) {
            this.aw = true;
            this.p = 4;
            return;
        }
        if (n == 53) {
            ProgFive.U = true;
            return;
        }
        if (n == 54) {
            this.aw = true;
            this.p = 3;
            return;
        }
        if (n == 55) {
            ProgFive.Z = true;
            return;
        }
        if (n == 56) {
            this.p = 2;
            return;
        }
        if (n == 57) {
            if (ProgFive.aq == 2) {
                ProgFive.ay = true;
            }
            return;
        }
        if (n == 48) {
            if (ProgFive.aq == 0) {
                ProgFive.I = true;
            }
            return;
        }
        if (n == 42) {
            ++ProgFive.f;
            if (ProgFive.f > 2) {
                ProgFive.f = 1;
            }
            return;
        }
        this.aw = false;
        /*
        switch (this.ac = ((Canvas)this).getGameAction(staticInt)) {
            case 1: {
                this.pFourStaticRef = 1;
                break;
            }
            case 6: {
                this.pFourStaticRef = 2;
                break;
            }
            case 2: {
                this.pFourStaticRef = 4;
                break;
            }
            case 5: {
                this.pFourStaticRef = 3;
                break;
            }
        }
         */
    }

    public void keyReleased(final int n) {
        /*
        ((Canvas)this).getGameAction(staticInt);
         */
        this.T = this.ac;
        this.ac = 0;
    }

    void g() {
        if (this.au == null) {
            return;
        }
        this.z = true;
        if (this.au.isAlive()) {
            System.out.println("Killing game thread");
            this.aB = true;
            try {
                this.au.join();
            }
            catch (Exception ex) {}
            System.out.println("Done killing game thread");
        }
        this.au = null;
        System.gc();
    }

    void i() {
        try {
            this.g();
            (this.au = new Thread(this)).start();
            ESGame.c("after starting game thread");
        }
        catch (Throwable t) {
            System.out.println(" start error:");
            t.printStackTrace();
            ((Canvas)this).repaint();
            //((Canvas)this).serviceRepaints();
        }
    }

    public void run() {
        long n = System.currentTimeMillis();
        long n2 = 0L;
        long n3 = 0L;
        try {
            while (this.z) {
                boolean b = false;
                if (this.ak) {
                    System.currentTimeMillis();
                    try {
                        Thread.sleep(250L);
                    }
                    catch (Exception ex) {}
                    if (this.aB) {
                        this.aB = false;
                        return;
                    }
                    continue;
                }
                else {
                    boolean b2 = true;
                    ProgFive.at = false;
                    System.gc();
                    if (this.c == 1) {
                        b2 = false;
                        if (n - this.aC > 2500L) {
                            if (this.o()) {
                                this.c = 0;
                                this.ax.b().a(this.ax);
                                this.aC = 0L;
                                this.v = true;
                                this.ax.e(false);
                                b2 = true;
                                if (this.a(ProgFive.N, 1)) {
                                    ProgFive.as = n;
                                    ProgFive.ad = true;
                                }
                            }
                            else {
                                this.c = 2;
                            }
                        }
                    }
                    else if (this.c == 2) {
                        b2 = false;
                        if (n - this.aC > 5000L) {
                            this.c = 0;
                            this.aC = 0L;
                            this.v = true;
                            this.ax.e(true);
                            if (this.a(ProgFive.b, 1)) {
                                ProgFive.as = n;
                                ProgFive.ad = true;
                            }
                            b2 = true;
                        }
                    }
                    else if (this.aD != 1) {
                        if (this.aD == 2) {
                            this.aD = 3;
                            ProgFive.ad = false;
                            ProgFive.X = 0;
                        }
                        b2 = false;
                        if (n - this.s > 5000L) {
                            System.out.println("Restart after dead");
                            this.ax.a(this.ax.U);
                            for (int i = this.ax.p - 1; i >= 0; --i) {
                                if (!this.ax.C(i)) {
                                    this.ax.y(i);
                                }
                            }
                            this.ax.c((int)this.ax.ar, true);
                            this.s = 0L;
                            this.aD = 1;
                            //ProgEleven.stringMatrix = true;
                            this.v = true;
                            ProgFive.E = true;
                            b2 = true;
                            if (ProgFive.E) {
                                String[] array;
                                if (this.ax.u) {
                                    array = ProgFive.r;
                                }
                                else if (this.ax.O) {
                                    array = ProgFive.ag;
                                }
                                else {
                                    array = this.ax.b().a();
                                }
                                if (this.a(array, 1)) {
                                    ProgFive.as = System.currentTimeMillis();
                                    ProgFive.ad = true;
                                }
                                ProgFive.E = false;
                            }
                        }
                    }
                    if (b2) {
                        if (k.byteCheckCD((int)this.ax.W)) {
                            k.non();
                        }
                        if (this.d() && k.byteG > this.ax.m) {
                            //this.H.aV = this.H.nMinus2(ProgEleven.incrementShortZ(this.ax, 6, -1, -1));
                            b = true;
                        }
                        this.b(n);
                        this.e(n);
                        this.a(n, n2);
                        if (this.ax.o()) {
                            this.e();
                            this.H.ag = this.H.j(1);
                            this.H.a((Object)this.H.ag);
                            ProgFive.al = false;
                        }
                        this.v = false;
                    }
                    this.a(false);
                    if (ProgFive.al) {
                        ((Canvas)this).repaint();
                        //((Canvas)this).serviceRepaints();
                    }
                    final long n4 = ProgFive.ai = System.currentTimeMillis() - n;
                    try {
                        if (n4 < 250L) {
                            Thread.sleep(250L - n4);
                        }
                    }
                    catch (Exception ex2) {}
                    if (this.aB) {
                        this.aB = false;
                        return;
                    }
                    final long n5 = n;
                    n = System.currentTimeMillis();
                    n2 = n - n5;
                    this.c(n2);
                    n3 += n2;
                    if (n3 > 1000L) {
                        n3 -= 1000L;
                        this.l();
                    }
                    if (n - ProgFive.as > 3000L) {
                        ProgFive.ad = false;
                        ProgFive.X = 0;
                    }
                    if (!b) {
                        continue;
                    }
                    this.e();
                    this.H.a((Object)this.H.aV);
                }
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.H.B();
        }
        catch (Throwable t) {
            System.out.println("ERROR: An error was thrown in GameCanvas run method!");
            System.out.println(t);
            t.printStackTrace();
            ProgFive.az = true;
            ProgFive.G = String.valueOf(t);
            ((Canvas)this).repaint();
            //((Canvas)this).serviceRepaints();
            try {
                Thread.sleep(10000L);
            }
            catch (Throwable t2) {}
            //((ngame.midlet.incrementShortZ)this.H).getLines();
        }
    }

    private void a(final boolean b) {
        this.ax.d(b);
        this.q();
        if (ProgFive.f == 2) {
            this.p();
        }
    }

    private void b(final long n) {
        final Hashtable hashtable = ESGame.G[this.ax.j - 1];
        if (hashtable == null) {
            return;
        }
        final Enumeration<byte[]> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            final ProgFour a = ProgFour.makeStaticProgFourFromByteArray(elements.nextElement());
            if (a.isProgTenOneThenByteGZero(this.ax)) {
                if (a.byteG == 0) {
                    a.longA = n;
                    a.byteG = 1;
                }
                else if (a.byteG == 1 && n - a.longA > 800L) {
                    a.updateProgTen(this.ax, n);
                    if (this.a(ProgFive.ah, 2)) {
                        ProgFive.as = n;
                        ProgFive.ad = true;
                    }
                }
                else if (n - a.longA > 800L) {
                    a.updateProgTen(this.ax, n);
                }
                a.updateHashTable();
            }
            else {
                a.updateProgTenWithByteF(this.ax);
                a.updateHashTable();
            }
        }
    }

    private void e(final long as) {
        if (ProgFive.I) {
            if (ProgFive.A) {
                if (this.a(ProgFive.C, 1)) {
                    ProgFive.as = as;
                    ProgFive.ad = true;
                }
                ProgFive.I = false;
            }
            else {
                this.a(as);
            }
        }
        else if (ProgFive.ay) {
            this.f(as);
        }
        else if (ProgFive.ap) {
            this.h(as);
        }
        else if (ProgFive.U) {
            this.g(as);
        }
        else if (ProgFive.av) {
            this.d(as);
        }
        else if (ProgFive.Z) {
            this.f();
        }
        else if ((this.p != 0 || this.v) && !this.v) {
            this.n();
        }
        this.h();
        this.c();
        this.a();
        this.m();
    }

    private void d(final long b) {
        if (b - this.B >= 500L && ProgFive.j != null) {
            ProgFive.at = true;
            this.ax.a(ProgFive.j);
            System.out.println("monster health is " + ProgFive.j.byteB);
            this.B = b;
            ProgFive.S = true;
        }
        ProgFive.av = false;
    }

    private void m() {
        if (ProgFive.j != null && ProgFive.j.byteB <= 0) {
            if (ProgFive.j.byteA == 41) {
                ProgFive.j.updateProgNine(true);
            }
            else {
                ProgFive.j.updateProgNine(false);
            }
            ESGame.a((int)this.ax.j, (int)ProgFive.j.shortA);
            if (this.ax.k(4)) {
                final short[] u = this.ax.U;
                final int n = 2;
                u[n] += (short)(3 * this.ax.U[3] / 10);
                this.ax.U[2] = (short)Math.min(this.ax.U[2], this.ax.U[3]);
            }
            if (this.a(ProgFive.P, 1)) {
                ProgFive.as = System.currentTimeMillis();
                ProgFive.ad = true;
            }
            ProgFive.j = null;
            ProgFive.aa = false;
        }
    }

    private void a() {
        ProgFive.j = this.ax.n();
        if (ProgFive.j != null) {
            ProgFive.aa = true;
            ProgFive.j = ProgFour.makeProgFourFromProgFourAndByteArray(ProgFive.k, ProgFive.j.getByteArray());
        }
        else {
            ProgFive.aa = false;
        }
        if (ProgFive.aa) {
            final String a = ProgFive.j.getStringForByteA();
            final String[] array = new String[2];
            final int index = a.indexOf(32);
            if (index < 0) {
                array[0] = a;
                array[1] = "";
            }
            else {
                array[0] = a.substring(0, index);
                array[1] = a.substring(index + 1);
            }
            if (this.a(array, 1)) {
                ProgFive.as = System.currentTimeMillis();
                ProgFive.ad = true;
            }
        }
    }

    private void h() {
        if (this.ax.h() != null) {
            ProgFive.m = true;
        }
        else {
            ProgFive.m = false;
        }
        if (ProgFive.m && this.a(ProgFive.x, 1)) {
            ProgFive.as = System.currentTimeMillis();
            ProgFive.ad = true;
        }
    }

    private void n() {
        if (this.p != 0) {
            final byte p = this.ax.p;
            ProgFive.at = true;
            this.ax.a(this.p, this.aw);
            if (ProgTen.g) {
                this.H.aP = this.H.F();
                this.H.a((Object)this.H.aP);
                ProgFive.al = false;
            }
            else {
                if (this.ax.i || this.ax.u || this.ax.O) {
                    ProgFive.E = true;
                    if (ProgFive.E) {
                        String[] array;
                        if (this.ax.u) {
                            array = ProgFive.r;
                        }
                        else if (this.ax.O) {
                            array = ProgFive.ag;
                        }
                        else {
                            array = this.ax.b().a();
                        }
                        if (this.a(array, 1)) {
                            ProgFive.as = System.currentTimeMillis();
                            ProgFive.ad = true;
                        }
                        ProgFive.E = false;
                    }
                }
                if (this.aw) {
                    this.aw = false;
                }
            }
            this.p = 0;
            final int n = this.ax.p - p;
            if (n == 1) {
                if (this.a(this.k(), -1)) {
                    ProgFive.as = System.currentTimeMillis();
                    ProgFive.ad = true;
                }
            }
            else if (n > 1 && this.a(ProgFive.an, -1)) {
                ProgFive.as = System.currentTimeMillis();
                ProgFive.ad = true;
            }
        }
    }

    private void h(final long v) {
        if (ProgFive.ap) {
            final byte b = this.ax.b;
            if (!ProgTwo.isNbiggerThan1LessThani(b)) {
                System.out.println("Invalid spell id,= " + b);
                ProgFive.ap = false;
                return;
            }
            if (ProgTwo.getProgTwoFromArray(b).byteB > this.ax.n(4)) {
                if (this.a(ProgFive.t, 3)) {
                    ProgFive.as = v;
                    ProgFive.ad = true;
                }
            }
            else if (v - this.V >= 500L && ProgTwo.isNbiggerThan1LessThani(b)) {
                ProgFive.at = true;
                if (ProgTwo.progTwoFromArrayByteDCheck(b)) {
                    if (!ProgFive.aa) {
                        if (this.a(ProgFive.g, 1)) {
                            ProgFive.as = v;
                            ProgFive.ad = true;
                        }
                    }
                    else {
                        this.ax.b((int)b, ProgFive.j);
                        System.out.println("monster health is " + ProgFive.j.byteB);
                        ProgFive.ao = true;
                    }
                }
                else {
                    this.ax.p((int)b);
                    ProgFive.am = true;
                }
                this.V = v;
            }
            ProgFive.ap = false;
        }
    }

    private void g(final long n) {
        if (ProgFive.U) {
            final int l = this.ax.l();
            if (l == 0) {
                if (this.a(ProgFive.Q, -1)) {
                    ProgFive.as = n;
                    ProgFive.ad = true;
                }
            }
            else {
                this.ax.b = (byte)l;
                final String c = ProgTwo.getProgTwoFromArray(l).stringA;
                final String[] c2 = ProgSix.getStringArrayTrim(c);
                String[] array;
                if (c2.length == 1) {
                    array = new String[] { c, "" };
                }
                else if (c2.length >= 3) {
                    array = new String[] { c2[0] + " " + c2[1], c2[2] };
                }
                else {
                    array = c2;
                }
                if (this.a(array, -1)) {
                    ProgFive.as = n;
                    ProgFive.ad = true;
                }
            }
            ProgFive.U = false;
        }
    }

    private void f(final long as) {
        final int r = this.ax.r();
        System.out.println("NPC In front is " + r);
        if (r >= 0) {
            this.d(r);
            System.out.println("done interacting with NPC, must paint as well");
        }
        else if (ProgFive.m) {
            final int b = this.ax.b(this.ax.h());
            if (b == -1) {
                if (this.a(ProgFive.D, 4)) {
                    ProgFive.as = as;
                    ProgFive.ad = true;
                }
            }
            else if (b == 0) {
                if (this.a(ProgFive.aA, -1)) {
                    ProgFive.as = as;
                    ProgFive.ad = true;
                }
            }
            else if (this.a(this.k(), -1)) {
                ProgFive.as = as;
                ProgFive.ad = true;
            }
        }
        ProgFive.ay = false;
    }

    private String[] k() {
        final String[] c = ProgSix.getStringArrayTrim(ProgOne.getLinesBString(Math.abs(this.ax.H[this.ax.p - 1])));
        final String[] array = { "", "" };
        if (c.length >= 3) {
            array[0] = c[0] + " " + c[1];
            array[1] = c[2];
        }
        else {
            for (int i = 0; i < c.length; ++i) {
                array[i] = c[i];
            }
        }
        return array;
    }

    private void f() {
        this.H.a((Object)this.H.t);
        ProgFive.al = false;
        ProgFive.Z = false;
    }

    private void a(final long ac) {
        this.c = 1;
        if (this.ax.I) {
            this.c = 2;
        }
        if (this.ax.j == 1) {
            this.c = 2;
        }
        this.aC = ac;
        ProgFive.I = false;
    }

    void d(final int n) {
        final String a = ProgEleven.a(this.ax, n, 1, 0);
        System.out.println("Just after NPC interaction in game canvas!");
        if (a != null) {
            this.H.aq.a(ProgEleven.s[n]);
            this.H.aq.e(a);
            this.H.aq.objectB = this.H.R[n];
            this.H.aq.intC = n;
            final ProgEight ProgEight = (ProgEight)this.H.aq.objectB;
            final String m = ProgEight.stringA;
            ProgEight.t();
            int n2 = 0;
            if (ProgEleven.b(n)) {
                n2 = ProgEleven.p[n];
            }
            else if (n == 4) {
                n2 = ProgEleven.a;
            }
            else if (n == 5) {
                n2 = ProgEleven.g;
            }
            ProgEight.e(ProgSix.getStringWithInt(m, "<TAG>", n2));
            this.H.a((Object)this.H.aq);
            ProgFive.al = false;
        }
        else if (n == 4) {
            System.out.println("BENECA has nothing more to say!");
            final ProgEight progEight2 = this.H.R[4];
            final String i = progEight2.stringA;
            progEight2.t();
            progEight2.e(ProgSix.getStringWithInt(i, "<TAG>", (int)ProgEleven.a));
            this.H.a((Object) progEight2);
            ProgFive.al = false;
        }
        else if (n == 5) {
            System.out.println("HELGA has nothing more to say!");
            final ProgEight progEight3 = this.H.R[5];
            final String j = progEight3.stringA;
            progEight3.t();
            progEight3.e(ProgSix.getStringWithInt(j, "<TAG>", (int)k.byteB));
            this.H.a((Object) progEight3);
            ProgFive.al = false;
        }
    }

    private void a(final long s, final long n) {
        if (this.ax.n(2) <= 0) {
            ProgFive.aa = false;
            this.aD = 2;
            this.s = s;
        }
        if (!ProgFive.at) {
            this.ax.a(n);
        }
    }

    public void e() {
        this.ak = true;
    }

    public void b() {
        this.ak = false;
    }

    protected void showNotify() {
        this.ax.w();
        this.q();
        if (ProgFive.f == 2) {
            this.p();
        }
        this.c();
        this.a();
        ProgFive.al = true;
        this.b();
        if (ProgFive.E) {
            String[] array;
            if (this.ax.u) {
                array = ProgFive.r;
            }
            else if (this.ax.O) {
                array = ProgFive.ag;
            }
            else {
                array = this.ax.b().a();
            }
            if (this.a(array, 1)) {
                ProgFive.as = System.currentTimeMillis();
                ProgFive.ad = true;
            }
            ProgFive.E = false;
        }
    }

    private boolean o() {
        return ProgSix.getIntFromESG(10) == 1;
    }

    private void c(final long n) {
        if (this.ax.k(4)) {
            final ProgTen ax = this.ax;
            ax.ah -= (short)n;
            if (this.ax.ah < 0) {
                this.ax.ah = 0;
                this.ax.A = (byte)ProgSix.getAndEqualBitShift(3, (int)this.ax.A);
            }
        }
        if (this.ax.k(5)) {
            final ProgTen ax2 = this.ax;
            ax2.F -= (short)n;
            if (this.ax.F < 0) {
                this.ax.F = 0;
                this.ax.A = (byte)ProgSix.getAndEqualBitShift(4, (int)this.ax.A);
            }
        }
        if (this.ax.k(7) && ProgFive.A) {
            final ProgTen ax3 = this.ax;
            ax3.ap -= (short)n;
            if (this.ax.ap < 0) {
                this.ax.ap = 0;
                this.ax.A = (byte)ProgSix.getAndEqualBitShift(6, (int)this.ax.A);
            }
        }
    }

    private void l() {
        if (this.ax.k(4)) {
            final int max = Math.max(2 * this.ax.U[3] / 100, 0);
            final short[] u = this.ax.U;
            final int n = 2;
            u[n] -= (short)max;
        }
        if (this.ax.k(5)) {
            final int n2 = this.ax.U[5] / 10;
            final short[] u2 = this.ax.U;
            final int n3 = 4;
            u2[n3] += (short)n2;
            if (this.ax.U[4] >= this.ax.U[5]) {
                this.ax.U[4] = 0;
                final int n4 = this.ax.U[5] / 10;
                final short[] u3 = this.ax.U;
                final int n5 = 2;
                u3[n5] -= (short)n4;
            }
        }
        for (int i = 0; i < 25; ++i) {
            if (this.ax.G[i] > 0) {
                final byte[] g = this.ax.G;
                final int n6 = i;
                --g[n6];
                if (this.ax.G[i] <= 0) {
                    this.ax.G[i] = 0;
                    if (i == 5) {
                        System.out.println("Removing daedric weapon!");
                        final int o = this.ax.o(109);
                        System.out.println("Removing daedric weapon!: index is " + o);
                        this.ax.y(o);
                    }
                }
            }
        }
        final Hashtable hashtable = ESGame.G[this.ax.j - 1];
        if (hashtable == null) {
            return;
        }
        final Enumeration<byte[]> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            final ProgFour a = ProgFour.makeStaticProgFourFromByteArray(elements.nextElement());
            if (a.byteArray[6] != 0) {
                final byte[] c = a.byteArray;
                final int n7 = 7;
                --c[n7];
                if (a.byteArray[7] >= 0) {
                    continue;
                }
                a.byteArray[7] = 0;
                a.byteArray[6] = 0;
            }
        }
    }

    private boolean d() {
        //return ProgEleven.incrementShortZ(this.ax) || (ProgFive.ProgTen != null && (this.ax.ProgTen == 37 && ProgFive.ProgTen.stringMatrix == 41) && Math.abs(this.ax.stringMatrix - ProgFive.ProgTen.byteC) + Math.abs(this.ax.ProgEleven - ProgFive.ProgTen.bytesC) == 1);
        return true;
    }

    private void a(final Graphics graphics, final ProgSeven ProgSeven, final int n, final int n2) {
        //DirectUtils.getDirectGraphics(graphics).drawPixels(ProgSeven.ProgSeven, true, 0, ProgSeven.byteMatrix, staticInt, n2, ProgSeven.nMinus2, ProgSeven.incrementShortZ, 0, 4444);
    }

    static {
        Font test = Font.getFont("Arial");
        aj = test; // 64, 0, 8
        M = test; // 64, 2, 16
        w = test; // 64, 2, 16
        K = test; // 64, 1, 16
        n = new int[][][] { { { 12, 0, 0, 1 }, { 11, 0, -1, 1 }, { 12, 1, -1, 2 }, { 12, 2, -1, 3 }, { 11, 2, -2, 3 }, { 12, 3, -2, 4 } }, { { 12, 0, 0, 1 }, { 12, 1, 0, 2 }, { 11, 1, -1, 2 }, { 12, 2, -1, 3 }, { 12, 3, -1, 4 }, { 12, 3, -1, 4 } }, { { 12, 0, 0, 1 }, { 12, 1, 0, 2 }, { 12, 2, 0, 3 }, { 11, 2, -1, 3 }, { 12, 3, -1, 4 }, { 12, 3, -1, 4 } }, { { 12, 0, 0, 1 }, { 12, 1, 0, 2 }, { 12, 2, 0, 3 }, { 12, 3, 0, 4 }, { 11, 3, -1, 4 }, { 11, 3, -1, 4 } }, { { 12, 0, 0, 1 }, { 12, 1, 0, 2 }, { 12, 2, 0, 3 }, { 12, 3, 0, 4 }, { 12, 3, 0, 4 }, { 12, 3, 0, 4 } } };
        ae = new byte[][] { { 1, 5, 31, 53, 0, 1, 40, -39, 1, 4, 13, -2, 3, 6, 71, 4, 30, 64, 2, 0, 0, 0 }, { 6, 10, 31, 53, 7, 1, 27, -35, 8, 4, 1, 69, 11, 27, 66, 9, 33, 10, 10, 0, 0, 0 }, { 11, 25, 31, 20, 14, 1, 0, 0, -1, -1, 2, 25, 15, 81, 8, 16, 9, 0, 17, 60, 57, 18 }, { 26, 40, 31, 32, 21, 1, 0, 0, -1, -1, 43, 44, 22, 50, 25, 23, -36, 9, 24, -25, 44, 25 } };
        a = new byte[][] { { 0, 0 }, { 0, 0 }, { 0, 3 }, { 0, 3 }, { 0, 3 }, { 0, 2 }, { 0, 2 }, { 0, 3 }, { 0, 3 }, { 0, 3 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 } };
        J = new boolean[][] { { false, false, false, false }, { true, false, false, false }, { false, false, false, false }, { false, false, true, false }, { true, false, true, false }, { false, false, false, false }, { false, false, false, false }, { false, true, false, false }, { false, false, true, false }, { false, true, true, false }, { true, false, false, false }, { false, true, false, false }, { true, false, true, false }, { false, true, true, false }, { true, true, true, false }, { true, false, false, false }, { false, true, false, false }, { true, false, true, false }, { false, true, true, false }, { true, true, true, false }, { true, true, false, false }, { true, true, false, false }, { true, true, false, false }, { true, true, true, false }, { true, true, true, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, true, false, true }, { false, true, false, true }, { true, false, false, true }, { true, false, true, false }, { false, true, true, false }, { false, false, false, false } };
        e = new char[] { '1', '3', '5', '7', '9', '0' };
        O = new char[] { '0', 'N', 'E', 'S', 'W' };
        o = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 2, 1 } };
        ProgFive.f = 1;
        ProgFive.S = false;
        ProgFive.ao = false;
        ProgFive.am = false;
        ProgFive.av = false;
        ProgFive.ay = false;
        ProgFive.I = false;
        ProgFive.Z = false;
        ProgFive.ap = false;
        ProgFive.U = false;
        ProgFive.ad = false;
        ProgFive.as = 0L;
        ProgFive.d = null;
        ProgFive.X = 0;
        ProgFive.af = false;
        ProgFive.al = true;
        ProgFive.at = false;
        ProgFive.E = false;
        ProgFive.A = false;
        r = new String[] { "Warden'objectA", "Camp" };
        ag = new String[] { "Outer", "Camp" };
        C = new String[] { "Cannot", "Camp!" };
        Q = new String[] { "No spells!", "" };
        t = new String[] { "Not enough", "magic!" };
        g = new String[] { "No monster", "here!" };
        N = new String[] { "Rest", "disturbed!" };
        b = new String[] { "Rest", "complete!" };
        P = new String[] { "Creature", "is dead!" };
        ah = new String[] { "Creature", "attacks!" };
        x = new String[] { "Chest", "" };
        D = new String[] { "Chest", "locked!" };
        aA = new String[] { "Inventory", "full!" };
        L = new String[] { "Found", "item!" };
        an = new String[] { "Several", "items!" };
        i = new String[][] { { "Arantamo", "" }, { "Celegil", "" }, { "Favela Dralor", "" }, { "Vander", "" }, { "Beneca", "" }, { "Helga", "" }, { "Varus", "" } };
        ProgFive.k = new ProgFour();
        ProgFive.j = null;
        ProgFive.ai = 0L;
        ProgFive.az = false;
        ProgFive.G = null;
    }
}