import java.awt.*;
import java.util.Enumeration;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
//import javax.microedition.rms.RecordStore;
//import javax.microedition.lcdui.Alert;
//import javax.microedition.lcdui.AlertType;
//import javax.microedition.lcdui.TextField;
//import javax.microedition.lcdui.Item;
//import javax.microedition.lcdui.Displayable;
//import javax.microedition.midlet.MIDlet;
import java.util.Random;
import java.util.Vector;
import java.util.Hashtable;
//import javax.microedition.lcdui.Image;
//import javax.microedition.lcdui.Display;
//import javax.microedition.lcdui.Command;
//import javax.microedition.lcdui.StringItem;
//import javax.microedition.lcdui.Form;
//import javax.microedition.lcdui.CommandListener;
//import ngame.midlet.incrementShortZ;

//
// Decompiled by Procyon v0.5.36
//

public class ESGame extends ProgOne implements Runnable//, CommandListener
{
    private static int aT;
    static byte[] at;
    static String aN;
    Form w;
    StringItem ad;
    Form ao;
    StringItem ar;
    private static final Command aC;
    private static final Command aS;
    static int af;
    static int aO;
    static byte[][] i;
    static int J;
    static String c;
    private static Thread b;
    private static int E;
    private static byte[][] ai;
    private static int[][] x;
    private static String[][] T;
    private static final int[][] ah;
    static final String[] p;
    private static int[] l;
    private static final String[] aM;
    Display d;
    private Form W;
    static Image O;
    static Image aU;
    private ProgEight aR;
    private ProgEight aZ;
    private static ProgEight al;
    private static ProgEight aQ;
    private ProgEight ay;
    private ProgEight U;
    private ProgEight az;
    private ProgEight y;
    private ProgEight h;
    private ProgEight aE;
    private ProgEight M;
    private ProgEight ba;
    private ProgEight f;
    ProgEight ab;
    ProgEight aq;
    ProgEight m;
    ProgEight[] R;
    ProgEight Q;
    ProgEight ap;
    ProgEight z;
    ProgEight ae;
    ProgEight I;
    ProgEight X;
    ProgEight V;
    ProgEight aJ;
    ProgEight an;
    ProgEight aw;
    ProgEight aI;
    ProgEight aL;
    ProgEight H;
    ProgEight K;
    ProgEight s;
    ProgEight t;
    ProgEight B;
    ProgEight aY;
    ProgEight aB;
    ProgEight L;
    ProgEight N;
    ProgEight v;
    ProgEight q;
    ProgEight ag;
    ProgEight aV;
    ProgEight aP;
    ProgEight C;
    ProgEight D;
    private ProgEight F;
    ProgEight aj;
    ProgEight A;
    private ProgFive av;
    private Form aD;
    private static String[] o;
    private static String[] as;
    private static String n;
    public ProgTen k;
    public ProgTen e;
    static ProgNine[] u;
    Thread aH;
    boolean ak;
    boolean aW;
    byte a;
    boolean am;
    static Hashtable[] G;
    static Hashtable[] S;
    static Vector[] au;
    static ProgEight ax;
    int Y;
    int g;
    static boolean aG;
    static Image aa;
    static Image aA;
    boolean ac;
    static Random P;
    private static boolean j;

    public ESGame() {
        // super.aF = "The Elder Scrolls";
        this.d = null;
        // ESGame.aN = ((MIDlet)this).getAppProperty("Pluto-Server-URL");
        if (ESGame.aN != null) {
            System.out.println("FOUND Pluto-Server-URL in JAR! Adding prefix gives: " + ESGame.aN);
        }
        else {
            ESGame.aN = "http://localhost/essm";
            System.out.println("Did not find Pluto-Server-URL in JAR! Using default of http://localhost/essm");
        }
        //final String appProperty = ((MIDlet)this).getAppProperty("Mserver-User-Id");
        //if (appProperty != null) {
        //    bytesA.X = appProperty;
        //    System.out.println("User ID is " + bytesA.X);
        //}
        //else {
        //    System.out.println("User ID is NULL!");
        //}
        ESGame.aT = 1;
    }

    public void m() {
        if (this.d == null) {
            c("Very start of startapp");
            this.d = Display.getDisplay((MIDlet)this);
            this.Y = -1;
            this.g = -1;
            this.aH = new Thread(this);
            this.ak = false;
            this.aW = false;
            this.a = 0;
            this.am = false;
            c("Before error form");
            this.y();
            c("After error form");
            this.H();
            ESGame.aT = 2;
        }
    }

    private void H() {
        try {
            ESGame.aa = Image.createImage("/mformaLogo.png");
            ESGame.aA = Image.createImage("/vir2lLogo.png");
            final Thread thread = new Thread(this);
            ESGame.O = this.d("/splashtop.png");
            ESGame.aU = this.d("/splashbot.png");
            (this.ay = new ProgEight(this, 2, 1)).e();
            this.ay.objectB = this.w;
            ESGame.J = 2;
            this.ac = true;
            ESGame.aG = false;
            this.a((Object)this.ay);
            thread.start();
        }
        catch (Exception ex) {
            System.out.println("Barfed in initSplash");
            //this.loadDroppedItems.setCurrent((Displayable)this.intK);
        }
    }

    public void run() {
        if (ESGame.J == 1) {
            System.out.println("run() Initial download, no longer implemented");
        }
        else if (ESGame.J == 2) {
            this.e();
        }
        else if (ESGame.J == 4) {
            this.o();
        }
        else if (ESGame.J == 5) {
            if (this.l()) {
                this.a(this.av);
            }
            else {
                this.a((Object)this.A);
            }
        }
        else if (ESGame.J == 6) {
            if (this.w()) {
                this.J();
                this.a = this.k.j;
                this.ak = true;
                ESGame.j = true;
                ESGame.j = false;
                this.ak = false;
                ESGame.aQ.volatileInt = 100;
                ESGame.aQ.c();
                ESGame.aQ.f();
                this.k.w();
                this.av.ax = this.k;
                this.av.v = true;
                this.av.i();
                this.a(this.av);
            }
            else {
                this.a((Object)this.ba);
            }
        }
        else {
            this.s();
            this.a(this.av);
        }
    }

    private void e() {
        try {
            this.ac = true;
            ESGame.aG = false;
            try {
                Thread.sleep(1000L);
            }
            catch (Exception ex) {}
            this.ac = false;
            this.ay.volatileInt = 0;
            this.t();
            this.G();
            this.A();
            this.ay.volatileInt = 100;
        }
        catch (Throwable t) {
            System.out.println("ERROR: CANNOT LOAD APP!!");
            System.out.println(t);
            this.a("" + t, true);
            this.a(this.w);
            try {
                Thread.sleep(15000L);
            }
            catch (Exception ex2) {}
        }
    }

    private void t() throws Exception {
        this.a("Start of allocateESGame", true);
        this.a("Start of allocateESGame", true);
        I();
        ProgNine.g();
        this.a("Right before character load", true);
        ProgTen.u();
        this.a("ESPersonality load", true);
        ProgEleven.e();
        this.ay.volatileInt = 5;
        this.a("Item load", true);
        ProgOne.loadItems();
        this.a("Spell load", true);
        ProgTwo.loadSpells();
        this.a("Monster load", true);
        ProgFour.loadMonsters();
        this.ay.volatileInt = 10;
        this.a("End of allocESGame", true);
    }

    private void A() {
        ESGame.u = null;
        System.gc();
        System.out.println(" >>>> CREATING CAMP DUNGEON <<<<<<");
        c("    Before dungeon vector");
        ESGame.u = new ProgNine[37];
        c("    After dungeon vector");
        this.ay.volatileInt = 62;
        ESGame.u[0] = new ProgNine((byte)1, ESGame.ai[0], ESGame.af, ESGame.aO, ESGame.i);
        c("    After camp dungeon before GC");
        System.gc();
        c("    After camp dungeon after GC");
        for (int i = 1; i < 37; ++i) {
            ESGame.u[i] = new ProgNine((byte)(i + 1), ESGame.ai[i]);
            c("Before dungeon " + i);
            ESGame.u[i].b();
            c("    After dungeon " + i + " before GC");
            System.gc();
            c("    After dungeon " + i);
            final ProgEight ay = this.ay;
            ++ay.volatileInt;
        }
        System.out.println(" After creating dungeons");
        c(" After creating dungeons, before GC");
        System.gc();
        c(" After creating dungeons");
    }

    private void o() {
        System.out.println("Start of createNewGame");
        this.aZ.volatileInt = 0;
        for (int d = getLinesBString(0), i = 0; i <= d; ++i) {
            this.n(i);
        }
        this.a((Object)this.az);
    }

    private void J() {
        i(getLinesBString(this.k.W));
    }

    private void G() throws Exception {
        System.out.println("Starting allocateAllUIs");
        this.a("Start of allocateAllUIs", true);
        System.gc();
        c("Start of allocateAllUIs");
        this.h();
        this.ay.volatileInt = 20;
        this.j();
        this.av = new ProgFive(this);
        c("Before floors and walls");
        ProgFive.h = this.d("floor3.png");
        c("after floors");
        ProgFive.Y = this.d("newwallsnok.png");
        c("After walls");
        this.a("After floor and wall images", true);
        ProgFive.q = new ProgSeven[33];
        for (int i = 0; i < 33; ++i) {
            ProgFive.q[i] = null;
        }
        this.a("After alloc monster images", true);
        this.a = 1;
        this.a("before runImageLoader", this.ak = true);
        (this.ab = new ProgEight(this, 11, 304)).o();
        c("Before load camp monster images ");
        this.p();
        this.a("After monster images", true);
        c("After monster images ");
        this.j();
        (ProgFive.ar = new ProgSeven[3])[0] = ProgSeven.getProgSevenFromString("baglarge.cus");
        ProgFive.ar[1] = ProgSeven.getProgSevenFromString("bagmid.cus");
        ProgFive.ar[2] = ProgSeven.getProgSevenFromString("bagsmall.cus");
        c("After bag images ");
        System.gc();
        this.a("After bag images ", true);
        (ProgFive.u = new ProgSeven[3])[0] = ProgSeven.getProgSevenFromString("crystalnear.cus");
        ProgFive.u[1] = ProgSeven.getProgSevenFromString("crystalmid.cus");
        ProgFive.u[2] = ProgSeven.getProgSevenFromString("crystalfar.cus");
        c("After crystal images ");
        this.a("After crystal images ", true);
        this.j();
        c("After oracle images ");
        this.a("After oracle images ", true);
        ProgFive.aE = new Image[3];
        for (int j = 0; j < 3; ++j) {
            ProgFive.aE[j] = null;
        }
        ProgFive.aE[0] = this.d("blood1.png");
        ProgFive.aE[1] = this.d("monsterspell.png");
        ProgFive.aE[2] = this.d("selfspell.png");
        System.gc();
        c("After spell images ");
        this.a("After effects images ", true);
        (ProgFive.ab = new ProgSeven[3])[0] = ProgSeven.getProgSevenFromString("chestnearclosed.cus");
        ProgFive.ab[1] = ProgSeven.getProgSevenFromString("chestmidclosed.cus");
        ProgFive.ab[2] = ProgSeven.getProgSevenFromString("chestfarclosed.cus");
        this.a("After chest images ", true);
        this.j();
        (ProgFive.y = new Image[6])[0] = this.d("icon_attack.png");
        ProgFive.y[1] = this.d("icon_cast.png");
        ProgFive.y[2] = this.d("icon_change.png");
        ProgFive.y[3] = this.d("icon_option.png");
        ProgFive.y[4] = this.d("icon_action.png");
        ProgFive.y[5] = this.d("icon_camp.png");
        this.a("After monster and icon images", true);
        System.gc();
        this.j();
        this.a();
        this.a("After HELP STRINGS", true);
        this.u();
        this.a("After HELP TITLES", true);
        ESGame.n = this.q();
        this.a("After CREDITS", true);
        (this.U = new ProgEight(this, 3, 2)).a("Main Menu", new String[] { "New Game", "Continue Game", "Help", "Credits", "Exit" }, (Vector)null, false);
        (this.az = new ProgEight(this, 5, 3)).a("New Game", "Select incrementShortZ Class:", ProgTen.K, (Vector)null);
        this.ay.volatileInt = 35;
        this.a("After newGameUI", true);
        (this.y = new ProgEight(this, 6, 4)).a("Character", "You selected:", "", new String[] { "See Class Info", "Create Character" }, (Vector)null);
        (this.h = new ProgEight(this, 4, 5)).a("Info", "");
        (this.aE = new ProgEight(this, 4, 6)).a("New Character", "Character Created!\n \nPress 'select' to enter incrementShortZ name");
        this.aE.b(ProgEight.commandA);
        this.aE.a(ProgEight.commandB);
        this.aE.a(ProgEight.commandC);
        (this.M = new ProgEight(this, 4, 7)).a("Welcome", "Welcome to The Elder Scrolls Travels!");
        c("After all the welcome screens");
        this.a("After all the welcome screens", true);
        (this.A = new ProgEight(this, 4, 499)).a("Save Error", "There was an error in saving your character record. Your previous character record is still saved. Try turning your phone off then on again to clear the memory.");
        c("Before NPCHelloUI");
        (this.aq = new ProgEight(this, 4, 8)).a("NPC name here", "NPC text here", true);
        (this.m = new ProgEight(this, 4, 360)).a("Rumors", "Rumors text here", true);
        c("After NPCHelloUI");
        this.a("After helloUI", true);
        this.R = new ProgEight[6];
        for (int k = 0; k < 4; ++k) {
            (this.R[k] = new ProgEight(this, 5, 9 + k)).a("Name", "Aid: <TAG>", new String[] { "Train", "Give", "Befriend", "Threaten", "Kill" }, (Vector)null);
            this.R[k].objectA = this.av;
        }
        (this.R[4] = new ProgEight(this, 5, 13)).a("Beneca", "Aid: <TAG>", new String[] { "Give Item", "Take Crystal" }, (Vector)null);
        this.R[4].objectA = this.av;
        (this.R[5] = new ProgEight(this, 5, 14)).a("Helga", "Aid: <TAG>", new String[] { "Rumors", "Give Crystal", "Enchant", "Bless", "Cure", "Warp", "Recovery" }, (Vector)null);
        this.R[5].objectA = this.av;
        this.a("After choicesUI", true);
        (this.ap = new ProgEight(this, 4, 23)).a("Oracle", "NPC text here", true);
        (this.t = new ProgEight(this, 3, 31)).a("Options", new String[] { "Stats", "Inventory", "Skills", "Spells", "Save Game", "Load Game", "Help", "Quit Game" }, (Vector)null, false);
        this.t.a(ProgEight.commandD);
        this.a("After OptionsUI", true);
        this.ay.volatileInt = 42;
        (this.aD = new Form("Enter name")).append((Item)new StringItem((String)null, "Enter incrementShortZ name for your character"));
        this.aD.append((Item)new TextField((String)null, (String)null, 10, 0));
        ((Displayable)this.aD).addCommand(ProgEight.commandA);
        ((Displayable)this.aD).addCommand(ProgEight.commandC);
        ((Displayable)this.aD).setCommandListener((CommandListener)this);
        (this.ba = new ProgEight(this, 4, 305)).a("Unavailable", "No game is available for loading. Press OK to return to main menu.");
        this.ba.a(ProgEight.commandA);
        this.ba.a((CommandListener)this);
        this.ba.objectA = this.U;
        this.a("After NoSavedGameUI", true);
        this.ay.objectB = this.U;
        this.az.objectA = this.U;
        this.y.objectA = this.az;
        this.h.objectA = this.y;
        this.h.objectB = this.y;
        this.aE.objectA = this.y;
        (this.f = new ProgEight(this, 4, 399)).n();
        this.ay.volatileInt = 55;
        c("End of loading UI and images");
        this.a("End of allocateAllUIs", true);
    }

    private ProgEight a(final int n) {
        System.gc();
        final ProgEight h = new ProgEight(this, 5, 22);
        h.intC = n;
        final String[] array = new String[this.k.p];
        for (byte b = 0; b < this.k.p; ++b) {
            final int abs = Math.abs(this.k.H[b]);
            if (this.k.C((int)b)) {
                array[b] = "stringArray:" + ProgOne.getLinesBString(abs);
            }
            else {
                array[b] = ProgOne.getLinesBString(abs);
            }
        }
        h.a(ProgEleven.s[n], "Give What?", array, (Vector)null, true);
        h.objectA = this.av;
        return h;
    }

    private ProgEight b(final int n) {
        System.gc();
        c("Start of newTrainWhat");
        final ProgEight h = new ProgEight(this, 5, 20);
        h.intC = n;
        final String[] array = new String[3];
        int n2 = 0;
        for (int i = 0; i < 14; ++i) {
            final int b = this.k.b(i, false);
            final String string = ProgTen.E[i] + " (<TAG>)";
            if (k.c(n, i)) {
                array[n2++] = ProgSix.getStringWithInt(string, "<TAG>", b);
            }
        }
        h.a(ProgEleven.s[n], "Train What?", array, (Vector)null, true);
        h.objectA = this.av;
        return h;
    }

    private ProgEight p(final int n) {
        System.gc();
        c("Start of newTakeWhat");
        final ProgEight h = new ProgEight(this, 5, 27);
        h.intC = n;
        h.a(ProgEleven.s[n], "Take What?", ProgOne.getLines(), (Vector)null, true);
        h.objectA = null;
        return h;
    }

    private ProgEight c(final int n) {
        System.gc();
        c("Start of newEnchantWhat");
        final ProgEight h = new ProgEight(this, 5, 350);
        h.intC = n;
        final String[] array = new String[this.k.p];
        for (byte b = 0; b < this.k.p; ++b) {
            array[b] = ProgOne.getLinesBString(Math.abs(this.k.H[b]));
        }
        h.a(ProgEleven.s[n], "Enchant What?", array, (Vector)null, true);
        h.objectA = this.av;
        return h;
    }

    private ProgEight D() {
        final ProgEight h = new ProgEight(this, 4, 32);
        h.a("Stats", this.av.ax.j());
        return h;
    }

    private ProgEight c() {
        System.gc();
        final ProgEight h = new ProgEight(this, 5, 33);
        final String[] array = new String[this.k.p];
        for (byte b = 0; b < this.k.p; ++b) {
            final byte b2 = this.k.H[b];
            System.out.println("itemid is " + b2);
            if (b2 < 0) {
                array[b] = "stringArray: " + ProgOne.getLinesBString(Math.abs(b2));
                System.out.println("item is " + array[b]);
            }
            else {
                array[b] = ProgOne.getLinesBString(b2);
                System.out.println("item is " + array[b]);
            }
        }
        h.a("Inventory", "Items:", array, (Vector)null, true);
        h.objectA = this.t;
        return h;
    }

    private ProgEight c(final ProgEight s) {
        System.gc();
        final ProgEight h = new ProgEight(this, 5, 202);
        h.a("Quit?", "Are you sure?", new String[] { "Yes", "No" }, (Vector)null, true);
        h.objectA = s;
        return h;
    }

    private ProgEight b(final ProgEight s) {
        System.gc();
        final ProgEight h = new ProgEight(this, 3, 203);
        h.a("Help", ESGame.as, (Vector)null);
        h.objectA = s;
        return h;
    }

    private ProgEight g(final int n) {
        System.gc();
        final ProgEight h = new ProgEight(this, 4, 206);
        h.a(ESGame.as[n], ESGame.o[n], true);
        h.objectA = this.D;
        return h;
    }

    private ProgEight a(final ProgEight s) {
        System.gc();
        final ProgEight h = new ProgEight(this, 4, 204);
        h.a("Credits", ESGame.n, true);
        h.objectA = s;
        return h;
    }

    public void pauseApp() {
        this.av.e();
        ESGame.aT = 3;
    }

    public void destroyApp(final boolean b) {
        ESGame.aT = 4;
    }

    public void commandAction(final Command command, final Displayable displayable) {
        if (ESGame.ax != null) {
            if (command == ProgEight.commandC && ESGame.ax.objectA != null) {
                this.a(ESGame.ax.objectA);
                return;
            }
            if (ESGame.ax.intB == 2) {
                if (command == ProgEight.commandB) {
                    final int a = ESGame.ax.a();
                    ESGame.ax.r();
                    switch (a) {
                        case 0: {
                            System.gc();
                            (this.aZ = new ProgEight(this, 8, 301)).o();
                            final Thread thread = new Thread(this);
                            ESGame.J = 4;
                            thread.start();
                            this.a((Object)this.aZ);
                            break;
                        }
                        case 1: {
                            System.gc();
                            this.av.g();
                            (ESGame.aQ = new ProgEight(this, 9, 302)).o();
                            final Thread thread2 = new Thread(this);
                            ESGame.J = 6;
                            thread2.start();
                            this.a((Object)ESGame.aQ);
                            break;
                        }
                        case 2: {
                            this.a((Object)(this.D = this.b(ESGame.ax)));
                            break;
                        }
                        case 3: {
                            this.a((Object)(this.aj = this.a(ESGame.ax)));
                            break;
                        }
                        case 4: {
                            this.a((Object)(this.C = this.c(ESGame.ax)));
                            break;
                        }
                    }
                }
            }
            else if (ESGame.ax.intB == 3) {
                if (command == ProgEight.commandB) {
                    final int a2 = ESGame.ax.a();
                    final String[] r = ESGame.ax.r();
                    this.e = null;
                    System.gc();
                    (this.e = new j(this)).c(a2);
                    this.e.d(a2);
                    this.y.a(1, r[a2]);
                    this.a((Object)this.y);
                }
            }
            else if (ESGame.ax.intB == 4) {
                if (command == ProgEight.commandB) {
                    final int a3 = ESGame.ax.a();
                    ESGame.ax.r();
                    if (a3 == 0) {
                        this.h.a(0, this.e.m());
                        this.h.intK = 0;
                        this.a((Object)this.h);
                    }
                    else {
                        this.k = this.e;
                        this.a((Object)this.aE);
                    }
                }
            }
            else if (ESGame.ax.intB == 5) {
                if (command == ProgEight.commandA) {
                    this.a(ESGame.ax.objectB);
                }
            }
            else if (ESGame.ax.intB == 6) {
                if (command == ProgEight.commandB) {
                    this.a(this.aD);
                }
            }
            else if (ESGame.ax.intB == 7) {
                (this.aR = new ProgEight(this, 4, 101)).a("Introduction", ProgEleven.k[7][3], true);
                this.a((Object)this.aR);
            }
            else if (ESGame.ax.intB == 101) {
                if (command == ProgEight.commandA) {
                    this.av.ax = this.k;
                    this.av.i();
                    this.a(this.av);
                }
            }
            else if (ESGame.ax.intB == 8 || ESGame.ax.intB == 360) {
                if (command == ProgEight.commandA) {
                    if (ESGame.ax.objectB == null) {
                        System.out.println("ERROR: next is null!");
                    }
                    else if (ESGame.ax.objectB == null) {
                        System.out.println("uic.next is null!");
                    }
                    this.a(ESGame.ax.objectB);
                }
            }
            else if (ESGame.ax.intB >= 9 && ESGame.ax.intB <= 14) {
                if (command == ProgEight.commandC) {
                    this.a(ESGame.ax.objectA);
                }
                else {
                    this.d(ESGame.ax);
                }
            }
            else if (ESGame.ax.intB == 20) {
                if (command == ProgEight.commandB) {
                    final int n = ESGame.ax.intC;
                    this.a((Object)(this.ae = this.a(ESGame.ax, n, 21, 5, k.b(n, ESGame.ax.a()))));
                }
                else if (command == ProgEight.commandC) {
                    final int n2 = ESGame.ax.intC;
                    this.k(n2);
                    this.a((Object)this.R[n2]);
                }
            }
            else if (ESGame.ax.intB == 22) {
                if (command == ProgEight.commandB) {
                    System.out.println("Found give what select");
                    final int n3 = ESGame.ax.intC;
                    final int a4 = ESGame.ax.a();
                    if (a4 >= 0) {
                        this.a((Object)(this.ap = this.a(ESGame.ax, n3, 23, 4, a4)));
                    }
                }
                else if (command == ProgEight.commandC) {
                    final int n4 = ESGame.ax.intC;
                    this.k(n4);
                    this.a((Object)this.R[n4]);
                }
            }
            else if (ESGame.ax.intB == 27) {
                if (command == ProgEight.commandB) {
                    this.a((Object)(this.aJ = this.a(ESGame.ax, ESGame.ax.intC, 28, 7, ESGame.ax.a() + 87)));
                }
                else if (command == ProgEight.commandC) {
                    final int n5 = ESGame.ax.intC;
                    this.k(n5);
                    this.a((Object)this.R[n5]);
                }
            }
            else if (ESGame.ax.intB == 350) {
                if (command == ProgEight.commandB) {
                    final int n6 = ESGame.ax.intC;
                    final int a5 = ESGame.ax.a();
                    if (a5 >= 0) {
                        this.a((Object)(this.aI = this.a(ESGame.ax, n6, 351, 8, a5)));
                    }
                }
                else if (command == ProgEight.commandC) {
                    final int n7 = ESGame.ax.intC;
                    this.k(n7);
                    this.a((Object)this.R[n7]);
                }
            }
            else if (ESGame.ax.intB == 23 || ESGame.ax.intB == 21 || ESGame.ax.intB == 24 || ESGame.ax.intB == 25 || ESGame.ax.intB == 28) {
                if (command == ProgEight.commandA) {
                    final int n8 = ESGame.ax.intC;
                    this.k(n8);
                    this.a((Object)this.R[n8]);
                }
            }
            else if (ESGame.ax.intB == 26) {
                this.a(this.av);
            }
            else if (ESGame.ax.intB == 351 || ESGame.ax.intB == 352 || ESGame.ax.intB == 353 || ESGame.ax.intB == 355) {
                if (command == ProgEight.commandA) {
                    final int n9 = ESGame.ax.intC;
                    this.k(n9);
                    this.a((Object)this.R[n9]);
                }
            }
            else if (ESGame.ax.intB == 30) {
                if (command == ProgEight.commandA) {
                    this.a(this.av);
                }
            }
            else if (ESGame.ax.intB == 41) {
                if (command == ProgEight.commandA) {
                    this.k.Q = false;
                    this.a(this.av);
                }
            }
            else if (ESGame.ax.intB == 31) {
                if (command == ProgEight.commandB) {
                    final int a6 = ESGame.ax.a();
                    ESGame.ax.r();
                    switch (a6) {
                        case 0: {
                            this.a((Object)(this.B = this.D()));
                            break;
                        }
                        case 1: {
                            this.a((Object)(this.aY = this.c()));
                            break;
                        }
                        case 2: {
                            this.a((Object)(this.L = this.d()));
                            break;
                        }
                        case 3: {
                            this.a((Object)(this.v = this.r()));
                            break;
                        }
                        case 4: {
                            (ESGame.al = new ProgEight(this, 10, 303)).o();
                            final Thread thread3 = new Thread(this);
                            ESGame.J = 5;
                            thread3.start();
                            this.a((Object)ESGame.al);
                            break;
                        }
                        case 5: {
                            System.gc();
                            this.av.g();
                            (ESGame.aQ = new ProgEight(this, 9, 302)).o();
                            final Thread thread4 = new Thread(this);
                            ESGame.J = 6;
                            thread4.start();
                            this.a((Object)ESGame.aQ);
                            break;
                        }
                        case 6: {
                            c("Help");
                            this.a((Object)(this.D = this.b(ESGame.ax)));
                            break;
                        }
                        case 7: {
                            this.a((Object)(this.C = this.c(ESGame.ax)));
                            break;
                        }
                        case 8: {
                            this.g();
                            this.a(this.ao);
                            break;
                        }
                    }
                }
                else if (command == ProgEight.commandD) {
                    this.a(this.av);
                }
            }
            else if (ESGame.ax.intB == 32) {
                if (command == ProgEight.commandA) {
                    this.a((Object)this.t);
                }
            }
            else if (ESGame.ax.intB == 33) {
                if (command == ProgEight.commandB) {
                    final int a7 = ESGame.ax.a();
                    if (a7 >= 0) {
                        this.aB = this.l(a7);
                        this.Y = a7;
                        this.a((Object)this.aB);
                    }
                }
            }
            else if (ESGame.ax.intB == 34) {
                if (command == ProgEight.commandB) {
                    final int intValue = ESGame.ax.vectorB.elementAt(ESGame.ax.a());
                    if (intValue == 0) {
                        this.k.i(this.Y);
                        this.a((Object)(this.aY = this.c()));
                    }
                    else if (intValue == 1) {
                        if (!this.k.C(this.Y)) {
                            this.k.d(this.Y, true);
                        }
                        else {
                            this.k.A(this.Y);
                        }
                        this.a((Object)(this.aY = this.c()));
                    }
                    else if (intValue == 2) {
                        this.k.r(this.Y);
                        this.a((Object)(this.aY = this.c()));
                    }
                    else if (intValue == 3) {
                        this.k.a(this.Y);
                        if (this.k.Q) {
                            this.k.Q = false;
                            this.a(this.av);
                        }
                        else {
                            this.a((Object)(this.aY = this.c()));
                        }
                    }
                    this.Y = -1;
                }
            }
            else if (ESGame.ax.intB == 35) {
                if (command == ProgEight.commandB) {
                    this.a((Object)(this.N = this.o(ESGame.ax.a())));
                }
            }
            else if (ESGame.ax.intB == 36) {
                if (command == ProgEight.commandA) {
                    this.a((Object)this.L);
                }
            }
            else if (ESGame.ax.intB == 37) {
                if (command == ProgEight.commandB) {
                    final int a8 = ESGame.ax.a();
                    if (a8 >= 0) {
                        this.q = this.e(a8);
                        this.g = a8;
                        this.a((Object)this.q);
                    }
                }
            }
            else if (ESGame.ax.intB == 38) {
                if (command == ProgEight.commandB) {
                    this.k.b = (byte)(this.k.B(this.g) + 1);
                    this.a((Object)(this.v = this.r()));
                    this.g = -1;
                }
            }
            else if (ESGame.ax.intB == 39) {
                if (command == ProgEight.commandB) {
                    final String p2 = ESGame.ax.p();
                    ESGame.l[ESGame.ax.intC] = -1;
                    for (int i = 0; i < ProgTen.y.length; ++i) {
                        if (p2.equals(ProgTen.y[i])) {
                            ESGame.l[ESGame.ax.intC] = i;
                            break;
                        }
                    }
                    if (ESGame.ax.intC < 2) {
                        this.a((Object)(this.ag = this.j(ESGame.ax.intC + 1 + 1)));
                    }
                    else {
                        final short[] j = this.k.J;
                        final int n10 = ESGame.l[0];
                        j[n10] += 3;
                        final short[] k = this.k.J;
                        final int n11 = ESGame.l[1];
                        k[n11] += 2;
                        final short[] l = this.k.J;
                        final int n12 = ESGame.l[2];
                        ++l[n12];
                        this.k.g();
                        this.k.d();
                        this.a(this.av);
                        this.av.b();
                    }
                }
            }
            else if (ESGame.ax.intB == 202) {
                if (command == ProgEight.commandB) {
                    if (ESGame.ax.a() == 0) {
                        this.a((Object)this.f);
                    }
                    else {
                        this.a(ESGame.ax.objectA);
                    }
                }
            }
            else if (ESGame.ax.intB == 202) {
                this.getLines(); // weird
            }
            else if (ESGame.ax.intB == 40) {
                this.a(this.av);
                this.av.b();
            }
            else if (ESGame.ax.intB == 102) {
                this.a(this.av);
                this.av.b();
            }
            else if (ESGame.ax.intB == 203) {
                if (command == ProgEight.commandB) {
                    this.a((Object)(this.F = this.g(ESGame.ax.a())));
                }
                else {
                    this.a(ESGame.ax.objectA);
                }
            }
            else if (ESGame.ax.intB == 206) {
                this.a(ESGame.ax.objectA);
            }
            else if (ESGame.ax.intB == 204) {
                this.a(ESGame.ax.objectA);
            }
            else if (ESGame.ax.intB == 305) {
                this.a(ESGame.ax.objectA);
            }
            else if (ESGame.ax.intB == 205) {
                this.a(ESGame.ax.objectA);
            }
            else if (ESGame.ax.intB == 200 || ESGame.ax.intB == 201) {
                this.a(ESGame.ax.objectB);
            }
            else if (ESGame.ax.intB == 399) {
                this.getLines();
            }
            else if (ESGame.ax.intB == 499) {
                this.getLines();
            }
        }
        else if (displayable == this.w) {
            this.getLines();
        }
        else if (displayable == this.ao) {
            this.a(this.av);
        }
        else if (displayable == this.W) {
            if (command == ESGame.aS) {
                this.getLines();
            }
        }
        else if (displayable == this.aD) {
            if (command == ProgEight.commandA) {
                final String string = ((TextField)this.aD.get(1)).getString();
                if (string.length() < 3) {
                    final Alert alert = new Alert("Error", f.a("Your character name must be at least <TAG> letters", "<TAG>", 3), (Image)null, AlertType.ERROR);
                    alert.setTimeout(-2);
                    this.a(alert);
                }
                else {
                    this.k.v = string;
                    this.a((Object)this.M);
                }
            }
            else if (command == h.commandC) {
                this.a((Object)this.aE);
            }
        }
    }

    private void d(final ProgEight h) {
        final int a = h.a();
        final int n = h.intB - 9;
        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3: {
                if (a == 0) {
                    this.a((Object)(this.z = this.b(n)));
                    break;
                }
                if (a == 1) {
                    if (this.k.p <= 0) {
                        this.ap.a(ProgEleven.s[n]);
                        this.ap.e("You have nothing to give me!");
                        this.a((Object)this.ap);
                        break;
                    }
                    this.a((Object)(this.Q = this.a(n)));
                    break;
                }
                else {
                    if (a == 2) {
                        this.a((Object)(this.X = this.a(h, n, 24, 2, 0)));
                        break;
                    }
                    if (a == 3) {
                        this.a((Object)(this.V = this.a(h, n, 25, 3, 0)));
                        break;
                    }
                    if (a == 4) {
                        this.a((Object)(this.an = this.a(h, n, 26, 6, 0)));
                        break;
                    }
                    break;
                }
                //break;
            }
            case 4: {
                if (a == 0) {
                    if (this.k.p <= 0) {
                        this.ap.a(ProgEleven.s[n]);
                        this.ap.e("You have nothing to give me!");
                        this.a((Object)this.ap);
                        break;
                    }
                    this.a((Object)(this.Q = this.a(n)));
                    break;
                }
                else {
                    if (a == 1) {
                        this.a((Object)(this.I = this.p(n)));
                        break;
                    }
                    break;
                }
                //break;
            }
            case 5: {
                if (a == 0) {
                    this.x();
                    break;
                }
                if (a == 1) {
                    if (this.k.p <= 0) {
                        this.ap.a(ProgEleven.s[n]);
                        this.ap.e("You have nothing to give me!");
                        this.a((Object)this.ap);
                        break;
                    }
                    this.a((Object)(this.Q = this.a(n)));
                    break;
                }
                else {
                    if (a == 2) {
                        this.a((Object)(this.aw = this.c(n)));
                        break;
                    }
                    if (a == 3) {
                        this.a((Object)(this.aL = this.a(h, n, 352, 9, 0)));
                        break;
                    }
                    if (a == 4) {
                        this.a((Object)(this.H = this.a(h, n, 353, 10, 0)));
                        break;
                    }
                    if (a == 5) {
                        this.a((Object)(this.K = this.a(h, n, 41, 11, 0)));
                        break;
                    }
                    if (a == 6) {
                        this.a((Object)(this.s = this.a(h, n, 355, 12, 0)));
                        break;
                    }
                    break;
                }
                //break;
            }
        }
    }

    private ProgEight a(final ProgEight h, final int n, final int n2, final int n3, final int n4) {
        final ProgEight h2 = new ProgEight(this, 4, n2);
        h2.a("NPC name here", "NPC text here", true);
        final String a = k.a(this.k, n, n3, n4);
        h2.a(ProgEleven.s[n]);
        h2.e(a);
        h2.intC = n;
        return h2;
    }

    private Image d(final String str) throws Exception {
        if (!str.startsWith("/")) {
            return Image.createImage("/" + str);
        }
        return Image.createImage(str);
    }

    private boolean w() {
        boolean b = true;
        RecordStore openRecordStore = null;
        ESGame.aQ.volatileInt = 0;
        final String m = this.M();
        try {
            if (m == null) {
                throw new Exception("No valid record store!");
            }
            openRecordStore = RecordStore.openRecordStore(m, false);
            openRecordStore.getNumRecords();
            this.k = ProgTen.a(openRecordStore.getRecord(1), true);
            this.k.ai = this;
            ESGame.aQ.volatileInt = 20;
            ESGame.aQ.c();
            ESGame.aQ.f();
            final int a = a(openRecordStore, 2);
            System.out.println("Read the master lists from RecordStore");
            b(openRecordStore.getRecord(a));
        }
        catch (Exception x) {
            System.out.println("Exception in loadGameState");
            System.out.println(x);
            b = false;
        }
        finally {
            if (openRecordStore != null) {
                try {
                    openRecordStore.closeRecordStore();
                }
                catch (Exception ex) {}
            }
        }
        return b;
    }

    private boolean l() {
        boolean b = true;
        RecordStore openRecordStore = null;
        ESGame.al.volatileInt = 0;
        final String f = this.f();
        try {
            openRecordStore = RecordStore.openRecordStore(f, true);
            final byte[] g = this.k.g(true);
            ESGame.al.volatileInt = 20;
            ESGame.al.c();
            ESGame.al.f();
            openRecordStore.addRecord(g, 0, g.length);
            System.gc();
            a(openRecordStore);
            final byte[] k = k();
            openRecordStore.addRecord(k, 0, k.length);
            System.gc();
            openRecordStore.closeRecordStore();
            openRecordStore = null;
            this.L();
            ESGame.al.volatileInt = 100;
            ESGame.al.c();
            ESGame.al.f();
        }
        catch (Throwable x) {
            System.out.println("Exception in saveGameState");
            System.out.println(x);
            try {
                RecordStore.deleteRecordStore(f);
            }
            catch (Exception ex) {}
            b = false;
        }
        finally {
            if (openRecordStore != null) {
                try {
                    openRecordStore.closeRecordStore();
                }
                catch (Exception ex2) {}
            }
        }
        return b;
    }

    private void y() {
        this.w = new Form("Error");
        this.ad = new StringItem("Error: ", "Cannot load game");
        this.w.append((Item)this.ad);
        ((Displayable)this.w).addCommand(new Command("Ok", 4, 1));
        ((Displayable)this.w).setCommandListener((CommandListener)this);
    }

    private void a(final String s, final boolean b) {
        this.b(s);
        if (false) {
            this.ad.setText(this.ad.getText() + "\n" + f(s));
        }
        else {
            this.ad.setText(f(s));
        }
    }

    void B() {
        this.a("Out of memory", true);
        this.d.setCurrent((Displayable)this.w);
    }

    static int dES(final int i) {
        System.out.println("In getGameAdvancementLevel, giftPoints = " + i);
        if (i < 9) {
            return 0;
        }
        if (i < 13) {
            return 1;
        }
        if (i < 17) {
            return 2;
        }
        if (i < 23) {
            return 3;
        }
        if (i < 28) {
            return 4;
        }
        if (i < 34) {
            return 5;
        }
        if (i < 40) {
            return 6;
        }
        if (i < 48) {
            return 7;
        }
        return 8;
    }

    void n(final int i) {
        System.out.println("In checkOpenAndPopulateDungeons, gameAdvLevel = " + i);
        for (int length = ESGame.x[i].length, j = 0; j < length; ++j) {
            final int n = ESGame.x[i][j] - 1;
            if (!ESGame.u[n].k) {
                ESGame.u[n].k = true;
                ESGame.u[n].e();
            }
            if (this.aZ != null) {
                this.aZ.volatileInt = 100 * (j + 1) / length;
                if (this.aZ.volatileInt > 100) {
                    this.aZ.volatileInt = 100;
                }
                this.aZ.c();
                this.aZ.f();
            }
        }
    }

    static void i(final int n) {
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i <= n; ++i) {
            n3 += ESGame.x[i].length;
        }
        for (int j = 0; j <= n; ++j) {
            for (int length = ESGame.x[j].length, k = 0; k < length; ++k) {
                final int n4 = ESGame.x[j][k] - 1;
                ESGame.u[n4].k = true;
                ESGame.u[n4].h();
                ++n2;
                ESGame.aQ.volatileInt = 100 * n2 / n3;
                if (ESGame.aQ.volatileInt > 100) {
                    ESGame.aQ.volatileInt = 100;
                }
            }
        }
    }

    static void i() throws Exception {
        E();
    }

    private static void E() {
        ESGame.af = 19;
        ESGame.aO = 19;
        ESGame.i = new byte[ESGame.aO][ESGame.af];
        for (int i = 0; i < ESGame.aO; ++i) {
            for (int j = 0; j < ESGame.af; ++j) {
                ESGame.i[i][j] = 1;
            }
        }
        for (int k = 0; k < ESGame.af; ++k) {
            ESGame.i[k][9] = 0;
        }
        for (int l = 0; l < ESGame.aO; ++l) {
            ESGame.i[9][l] = 0;
        }
        for (int n = 0; n < 3; ++n) {
            for (int n2 = 0; n2 < 3; ++n2) {
                ESGame.i[8 + n][8 + n2] = 0;
            }
        }
        ESGame.i[4][8] = 0;
        ESGame.i[4][7] = 0;
        ESGame.i[3][7] = 0;
        ESGame.i[16][8] = 0;
        ESGame.i[16][7] = 0;
        ESGame.i[15][7] = 0;
        ESGame.i[8][3] = 0;
        ESGame.i[7][3] = 0;
        ESGame.i[7][2] = 0;
        ESGame.i[10][4] = 0;
        ESGame.i[11][4] = 0;
        ESGame.i[12][4] = 0;
        ESGame.i[12][3] = 0;
        ESGame.i[6][14] = 0;
        ESGame.i[7][14] = 0;
        ESGame.i[8][14] = 0;
        ESGame.i[9][14] = 0;
        ESGame.i[10][14] = 0;
        ESGame.i[11][14] = 0;
        ESGame.i[12][14] = 0;
        ESGame.i[6][13] = 0;
        ESGame.i[12][13] = 0;
    }

    private static void K() {
        ESGame.G = new Hashtable[37];
        for (int i = 1; i < 37; ++i) {
            ESGame.G[i] = new Hashtable();
        }
        ESGame.S = new Hashtable[37];
        for (int j = 1; j < 37; ++j) {
            ESGame.S[j] = new Hashtable();
        }
        ESGame.au = new Vector[37];
        for (int k = 0; k < 37; ++k) {
            ESGame.au[k] = new Vector();
        }
    }

    private static void b(final byte[] buf) throws Exception {
        final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(buf, 0, buf.length));
        ProgOne.shortZ = dataInputStream.readShort();
        ProgFour.shortStaticRef = dataInputStream.readShort();
        for (int i = 0; i < 7; ++i) {
            ProgEleven.b[i] = dataInputStream.readBoolean();
        }
        for (int j = 0; j < 7; ++j) {
            ProgEleven.q[j] = dataInputStream.readBoolean();
        }
        for (int k = 0; k < 4; ++k) {
            ProgEleven.r[k] = dataInputStream.readShort();
        }
        for (int l = 0; l < 4; ++l) {
            ProgEleven.p[l] = dataInputStream.readShort();
        }
        for (int n = 0; n < 4; ++n) {
            ProgEleven.h[n] = dataInputStream.readShort();
        }
        for (int n2 = 0; n2 < 4; ++n2) {
            ProgEleven.c[n2] = dataInputStream.readByte();
        }
        for (int n3 = 0; n3 < 4; ++n3) {
            ProgEleven.n[n3] = dataInputStream.readByte();
        }
        ProgEleven.f = dataInputStream.readByte();
        ProgEleven.d = dataInputStream.readBoolean();
        ProgEleven.a = dataInputStream.readShort();
        ProgEleven.g = dataInputStream.readShort();
        ProgEleven.l = dataInputStream.readBoolean();
        for (int n4 = 0; n4 < 7; ++n4) {
            if (!ProgEleven.b[n4]) {
                final ProgNine m = ESGame.u[0];
                m.w[ProgEleven.j[n4]][ProgEleven.i[n4]] = ProgSix.getAndByte((byte)32, m.w[ProgEleven.j[n4]][ProgEleven.i[n4]]);
            }
        }
    }

    private static byte[] k() throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream(60);
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeShort(ProgOne.shortZ);
        dataOutputStream.writeShort(ProgFour.shortStaticRef);
        for (int i = 0; i < 7; ++i) {
            dataOutputStream.writeBoolean(ProgEleven.b[i]);
        }
        for (int j = 0; j < 7; ++j) {
            dataOutputStream.writeBoolean(ProgEleven.q[j]);
        }
        for (int k = 0; k < 4; ++k) {
            dataOutputStream.writeShort(ProgEleven.r[k]);
        }
        for (int l = 0; l < 4; ++l) {
            dataOutputStream.writeShort(ProgEleven.p[l]);
        }
        for (int n = 0; n < 4; ++n) {
            dataOutputStream.writeShort(ProgEleven.h[n]);
        }
        for (int n2 = 0; n2 < 4; ++n2) {
            dataOutputStream.writeByte(ProgEleven.c[n2]);
        }
        for (int n3 = 0; n3 < 4; ++n3) {
            dataOutputStream.writeByte(ProgEleven.n[n3]);
        }
        dataOutputStream.writeByte(ProgEleven.f);
        dataOutputStream.writeBoolean(ProgEleven.d);
        dataOutputStream.writeShort(ProgEleven.a);
        dataOutputStream.writeShort(ProgEleven.g);
        dataOutputStream.writeBoolean(ProgEleven.l);
        return out.toByteArray();
    }

    private static void a(final RecordStore recordStore) throws Exception {
        for (int i = 1; i < 37; ++i) {
            final int size = ESGame.G[i].size();
            final ByteArrayOutputStream out = new ByteArrayOutputStream(4 + size * 28);
            final DataOutputStream dataOutputStream = new DataOutputStream(out);
            dataOutputStream.writeInt(size);
            final Enumeration elements = ESGame.G[i].elements();
            while (elements.hasMoreElements()) {
                ProgFour.getProgFour(elements.nextElement()).getProgFour(dataOutputStream);
            }
            final byte[] byteArray = out.toByteArray();
            recordStore.addRecord(byteArray, 0, byteArray.length);
            try {
                dataOutputStream.close();
            }
            catch (Exception ex) {}
            System.gc();
            ESGame.al.volatileInt = 20 + 30 * (i + 1) / 37;
            ESGame.al.c();
            ESGame.al.f();
        }
        for (int j = 1; j < 37; ++j) {
            final int size2 = ESGame.S[j].size();
            final ByteArrayOutputStream out2 = new ByteArrayOutputStream(4 + size2 * 8);
            final DataOutputStream dataOutputStream2 = new DataOutputStream(out2);
            dataOutputStream2.writeInt(size2);
            final Enumeration elements2 = ESGame.S[j].elements();
            while (elements2.hasMoreElements()) {
                a(dataOutputStream2, elements2.nextElement(), 8);
            }
            final byte[] byteArray2 = out2.toByteArray();
            recordStore.addRecord(byteArray2, 0, byteArray2.length);
            try {
                dataOutputStream2.close();
            }
            catch (Exception ex2) {}
            System.gc();
            ESGame.al.volatileInt = 50 + 30 * (j + 1) / 37;
            ESGame.al.c();
            ESGame.al.f();
        }
        for (int k = 0; k < 37; ++k) {
            final int size3 = ESGame.au[k].size();
            final ByteArrayOutputStream out3 = new ByteArrayOutputStream(4 + size3 * 7);
            final DataOutputStream dataOutputStream3 = new DataOutputStream(out3);
            dataOutputStream3.writeInt(size3);
            final Enumeration elements3 = ESGame.au[k].elements();
            while (elements3.hasMoreElements()) {
                a(dataOutputStream3, elements3.nextElement(), 7);
            }
            final byte[] byteArray3 = out3.toByteArray();
            recordStore.addRecord(byteArray3, 0, byteArray3.length);
            try {
                dataOutputStream3.close();
            }
            catch (Exception ex3) {}
            System.gc();
            ESGame.al.volatileInt = 80 + 19 * (k + 1) / 37;
            ESGame.al.c();
            ESGame.al.f();
        }
    }

    private static int a(final RecordStore recordStore, final int n) throws Exception {
        int n2 = n;
        for (int i = 1; i < 37; ++i) {
            final byte[] record = recordStore.getRecord(n2++);
            final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(record, 0, record.length));
            ESGame.G[i].clear();
            for (int int1 = dataInputStream.readInt(), j = 0; j < int1; ++j) {
                final ProgFour a = ProgFour.getProgFourFromDIS(dataInputStream);
                ESGame.G[i].put(String.valueOf(a.shortA), a.getByteArray());
            }
            try {
                dataInputStream.close();
            }
            catch (Exception ex) {}
            System.gc();
            ESGame.aQ.volatileInt = 20 + 30 * (i + 1) / 37;
            ESGame.aQ.c();
            ESGame.aQ.f();
        }
        for (int k = 1; k < 37; ++k) {
            final byte[] record2 = recordStore.getRecord(n2++);
            final DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(record2, 0, record2.length));
            ESGame.S[k].clear();
            for (int int2 = dataInputStream2.readInt(), l = 0; l < int2; ++l) {
                final byte[] a2 = a(dataInputStream2, 8);
                ESGame.S[k].put(ProgSix.getStringFromTwoIntAddAComma((int)a2[0], (int)a2[1]), a2);
            }
            try {
                dataInputStream2.close();
            }
            catch (Exception ex2) {}
            System.gc();
            ESGame.aQ.volatileInt = 50 + 30 * (k + 1) / 37;
            ESGame.aQ.c();
            ESGame.aQ.f();
        }
        for (int n3 = 0; n3 < 37; ++n3) {
            final byte[] record3 = recordStore.getRecord(n2++);
            final DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream(record3, 0, record3.length));
            ESGame.au[n3].removeAllElements();
            for (int int3 = dataInputStream3.readInt(), n4 = 0; n4 < int3; ++n4) {
                ESGame.au[n3].addElement(a(dataInputStream3, 7));
            }
            try {
                dataInputStream3.close();
            }
            catch (Exception ex3) {}
            System.gc();
            ESGame.aQ.volatileInt = 80 + 19 * (n3 + 1) / 37;
            ESGame.aQ.c();
            ESGame.aQ.f();
        }
        return n2;
    }

    private static byte[] a(final DataInputStream dataInputStream, final int n) throws Exception {
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            array[i] = dataInputStream.readByte();
        }
        return array;
    }

    private static void a(final DataOutputStream dataOutputStream, final byte[] array, final int n) throws Exception {
        for (int i = 0; i < n; ++i) {
            dataOutputStream.writeByte(array[i]);
        }
    }

    public static void c(final String s) {
    }

    static String f(String str) {
        if (str == null) {
            str = "";
        }
        final Runtime runtime = Runtime.getRuntime();
        return ">>> MEMORY: " + str + ": Free memory is " + runtime.freeMemory() + ", Total memory is " + runtime.totalMemory();
    }

    private void h() {
        (this.W = new Form("Done")).append((Item)new StringItem((String)null, "commandA am done"));
        ((Displayable)this.W).addCommand(ESGame.aS);
        ((Displayable)this.W).setCommandListener((CommandListener)this);
    }

    private void p() {
        final byte[] array = new byte[5];
        System.out.println("LOADING WARDEN IMAGES");
        array[0] = 1;
        array[2] = (array[1] = 1);
        array[4] = (array[3] = 1);
        this.a = 1;
        this.a(array);
    }

    void s() {
        System.out.println("Running image loader thread for new dungeon ID: " + this.a);
        this.am = false;
        if (ESGame.j) {
            ESGame.aQ.volatileInt = 80;
        }
        else {
            this.ab.volatileInt = 0;
        }
        final byte[] array = new byte[5];
        for (int i = 0; i < 5; ++i) {
            array[i] = 0;
        }
        if (this.a == 1) {
            this.z();
            this.p();
        }
        else {
            final Hashtable hashtable = ESGame.G[this.a - 1];
            if (hashtable == null) {
                return;
            }
            final Enumeration<byte[]> elements = hashtable.elements();
            while (elements.hasMoreElements()) {
                final ProgFour a = ProgFour.makeStaticProgFourFromByteArray(elements.nextElement());
                if (a.byteA >= 1 && a.byteA <= 5) {
                    final byte[] array2 = array;
                    final int n = 0;
                    ++array2[n];
                }
                else if (a.byteA >= 6 && a.byteA <= 10) {
                    final byte[] array3 = array;
                    final int n2 = 1;
                    ++array3[n2];
                }
                else if (a.byteA >= 11 && a.byteA <= 25) {
                    final byte[] array4 = array;
                    final int n3 = 2;
                    ++array4[n3];
                }
                else if (a.byteA >= 26 && a.byteA <= 40) {
                    final byte[] array5 = array;
                    final int n4 = 3;
                    ++array5[n4];
                }
                else {
                    final byte[] array6 = array;
                    final int n5 = 4;
                    ++array6[n5];
                }
            }
            this.z();
            this.a(array);
        }
        ProgFive.E = true;
    }

    private boolean m(final int n) {
        switch (n) {
            case 4:
            case 11:
            case 18:
            case 23:
            case 30: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    void a(final byte[] array) {
        this.am = false;
        this.a("Inside runImageLoader", true);
        try {
            for (int i = 0; i < 5; ++i) {
                if (array[i] > 0) {
                    this.a("Handling ichunk = " + i, true);
                    final int n = ESGame.ah[i][0];
                    for (int n2 = ESGame.ah[i][1], j = 0; j < n2; ++j) {
                        final int n3 = n + j;
                        if (!this.m(n3)) {
                            ProgFive.q[n3] = ProgSeven.getProgSevenFromString(ESGame.T[i][j]);
                        }
                        if (!this.ak) {
                            return;
                        }
                        if (this.aW) {
                            this.aW = false;
                            return;
                        }
                    }
                }
                if (ESGame.j) {
                    ESGame.aQ.volatileInt = 80 + (i + 1) * 20 / 5;
                    ESGame.aQ.c();
                    ESGame.aQ.f();
                }
                else {
                    this.ab.volatileInt = (i + 1) * 100 / 5;
                    this.ab.c();
                    this.ab.f();
                }
            }
            this.am = true;
            System.out.println("SUCCESSFULLY LOADED MONSTER IMAGES!!");
            this.ak = false;
        }
        catch (Throwable obj) {
            System.out.println("ERROR in image loader: " + obj);
            this.d.setCurrent((Displayable)this.w);
        }
    }

    void z() {
        for (int length = ProgFive.q.length, i = 0; i < length; ++i) {
            if (ProgFive.q[i] != null) {
                ProgFive.q[i].shortArray = null;
                ProgFive.q[i] = null;
            }
        }
        System.gc();
        c("After unloading all monster images");
    }

    static void a(final int i, final int j) {
        System.out.println("In killMonster! dungid is " + i);
        final byte[] array = ESGame.G[i - 1].remove(String.valueOf(j));
        final byte b = array[4];
        final byte b2 = array[5];
        final ProgNine k = ESGame.u[i - 1];
        if (array != null) {
            k.w[b][b2] = ProgSix.getAndByte((byte)2, k.w[b][b2]);
        }
        System.out.println("End of killMonster, size of HT is " + ESGame.G[i - 1].size());
    }

    private ProgEight l(final int i) {
        final ProgEight h = new ProgEight(this, 5, 34);
        System.out.println("In newInventoryItemUI: getting item " + i);
        final String b = this.k.b(i);
        final Vector vector = new Vector<String>();
        final Vector<Integer> vector2 = new Vector<Integer>();
        vector.addElement("Drop");
        vector2.addElement(new Integer(0));
        if (this.k.w(i)) {
            if (!this.k.C(i)) {
                vector.addElement("Equip");
            }
            else {
                vector.addElement("Unequip");
            }
            vector2.addElement(new Integer(1));
        }
        if (this.k.e(i)) {
            vector.addElement("Learn");
            vector2.addElement(new Integer(2));
        }
        if (this.k.v(i)) {
            vector.addElement("Use");
            vector2.addElement(new Integer(3));
        }
        final String[] array = new String[vector.size()];
        for (int j = 0; j < vector.size(); ++j) {
            array[j] = vector.elementAt(j);
        }
        h.a("Item", b, array, (Vector)vector2);
        h.booleanB = true;
        h.objectA = this.aY;
        return h;
    }

    private ProgEight d() {
        System.gc();
        c("Start of newSkillsListUI");
        final ProgEight h = new ProgEight(this, 5, 35);
        final Vector f = this.k.f();
        final int size = f.size();
        final String[] array = new String[size];
        for (int i = 0; i < size; ++i) {
            array[i] = f.elementAt(i);
        }
        h.a("Skills", "Your Skills:", array, (Vector)null, true);
        h.objectA = this.t;
        return h;
    }

    private ProgEight o(final int n) {
        System.gc();
        c("Start of newSkillInfoUI");
        final ProgEight h = new ProgEight(this, 4, 36);
        h.a("Skill Info", this.k.m(this.k.l(n)));
        h.objectA = this.L;
        return h;
    }

    private ProgEight r() {
        System.gc();
        c("Start of newSpellsListUI");
        final ProgEight h = new ProgEight(this, 5, 37);
        final Vector j = this.k.J();
        final int size = j.size();
        final String[] array = new String[size];
        for (int i = 0; i < size; ++i) {
            array[i] = j.elementAt(i);
        }
        h.a("Spells", "Your Spells:", array, (Vector)null, true);
        h.objectA = this.t;
        return h;
    }

    private ProgEight e(final int n) {
        System.gc();
        c("Start of newSpellInfoUI");
        final ProgEight h = new ProgEight(this, 5, 38);
        h.a("Spell Info", this.k.s(this.k.B(n)), new String[] { "Ready Spell" }, (Vector)null);
        h.booleanB = true;
        h.objectA = this.v;
        return h;
    }

    ProgEight j(final int i) {
        System.gc();
        c("Start of newLevelUpUI: index= " + i);
        final ProgEight s = new ProgEight(this, 5, 39);
        final String[] q = this.k.q();
        String s2 = null;
        if (i == 1) {
            s.intC = 0;
            s2 = "Select an attribute to \nincrease 3 points:";
        }
        else if (i == 2) {
            s2 = "Select an attribute to \nincrease 2 points:";
            s.intC = 1;
        }
        else if (i == 3) {
            s.intC = 2;
            s2 = "Select an attribute to \nincrease 1 point:";
        }
        s.a("Level Up", s2, q, (Vector)null);
        s.displayable.removeCommand(ProgEight.commandC);
        s.booleanB = true;
        return (ProgEight)(s.objectA = s);
    }

    ProgEight e(final String s) {
        System.gc();
        c("Start of newWardenSpeaksUI");
        final ProgEight h = new ProgEight(this, 4, 102);
        h.a("Varus", s);
        return h;
    }

    ProgEight F() {
        System.gc();
        c("Start of newEndOfGameUI");
        final String s = ProgEleven.k[7][4];
        final ProgEight h = new ProgEight(this, 4, 200);
        h.a("Victory!", s);
        h.objectB = this.v();
        return h;
    }

    private ProgEight v() {
        System.gc();
        c("Start of newGameOverUI");
        final String s = ProgEleven.k[7][5];
        final ProgEight h = new ProgEight(this, 4, 201);
        h.a("Game Over", s);
        h.objectB = this.U;
        return h;
    }

    static DataInputStream a(final String s) throws Exception {
        final InputStream resourceAsStream = ESGame.class.getResourceAsStream(ProgSix.formalizePath(s));
        if (resourceAsStream == null) {
            return null;
        }
        return new DataInputStream(new ByteArrayInputStream(ProgSix.getByteArrayFromINS(resourceAsStream.available(), resourceAsStream)));
    }

    static int h(final int n) {
        return Math.abs(ESGame.P.nextInt() % n);
    }

    static int f(final int n) {
        return 1 + Math.abs(ESGame.P.nextInt() % n);
    }

    static int a(final Random random, final int n) {
        return 1 + Math.abs(random.nextInt() % n);
    }

    void a(final Object o) {
        if (ESGame.ax != null) {
            if (o instanceof ProgEight) {
                if (ESGame.ax != o) {
                    ESGame.ax.q();
                }
            }
            else {
                ESGame.ax.q();
            }
        }
        if (this.av != null) {
            this.av.e();
        }
        if (this.d == null) {
            this.d = Display.getDisplay((MIDlet)this);
        }
        if (o instanceof ProgEight) {
            ESGame.ax = (ProgEight)o;
            final ProgThree j = ProgEight.j();
            j.progEightRef = ESGame.ax;
            ESGame.ax.displayable = (Displayable)j;
            this.d.setCurrent(ESGame.ax.displayable);
            ESGame.ax.h();
            ESGame.ax.c();
            ESGame.ax.f();
        }
        else if (o instanceof Displayable) {
            final Displayable current = (Displayable)o;
            ESGame.ax = null;
            this.d.setCurrent(current);
        }
    }

    private static void I() throws Exception {
        final DataInputStream a = ProgSix.getDISFromName("/geomin.dat");
        ESGame.ai = new byte[37][6];
        for (int i = 0; i < 37; ++i) {
            for (int j = 0; j < 6; ++j) {
                ESGame.ai[i][j] = a.readByte();
            }
        }
    }

    private static void C() throws Exception {
        final InputStream resourceAsStream = ESGame.class.getResourceAsStream("/monsterfilenamesin.dat");
        final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(ProgSix.getByteArrayFromINS(resourceAsStream.available(), resourceAsStream)));
        ESGame.T = new String[5][7];
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 7; ++j) {
                ESGame.T[i][j] = dataInputStream.readUTF();
            }
        }
    }

    private void g() {
        this.ao = new Form("Debug");
        this.ar = new StringItem("Debug: ", this.av.ax.K());
        this.ao.append((Item)this.ar);
        ((Displayable)this.ao).addCommand(new Command("Ok", 4, 1));
        ((Displayable)this.ao).setCommandListener((CommandListener)this);
    }

    synchronized void b(final String c) {
        ESGame.c = c;
    }

    private void u() {
        ESGame.as[0] = ProgEleven.k[7][6];
        ESGame.as[1] = ProgEleven.k[7][8];
        ESGame.as[2] = ProgEleven.k[7][11];
        ESGame.as[3] = ProgEleven.k[7][13];
        ESGame.as[4] = ProgEleven.k[7][19];
        ESGame.as[5] = ProgEleven.k[7][21];
        ESGame.as[6] = ProgEleven.k[7][24];
        ESGame.as[7] = ProgEleven.k[7][29];
        ESGame.as[8] = ProgEleven.k[7][31];
        ESGame.as[9] = ProgEleven.k[7][34];
        ESGame.as[10] = ProgEleven.k[7][37];
        ESGame.as[11] = ProgEleven.k[7][39];
    }

    private void a() {
        final StringBuffer sb = new StringBuffer(1200);
        sb.append(ProgEleven.k[7][7]);
        ESGame.o[0] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][9]);
        sb.append(ProgEleven.k[7][10]);
        ESGame.o[1] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][12]);
        ESGame.o[2] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][14]);
        sb.append(ProgEleven.k[7][15]);
        sb.append(ProgEleven.k[7][16]);
        sb.append(ProgEleven.k[7][17]);
        sb.append(ProgEleven.k[7][18]);
        ESGame.o[3] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][20]);
        ESGame.o[4] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][22]);
        sb.append(ProgEleven.k[7][23]);
        ESGame.o[5] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][25]);
        sb.append(ProgEleven.k[7][26]);
        sb.append(ProgEleven.k[7][27]);
        sb.append(ProgEleven.k[7][28]);
        ESGame.o[6] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][30]);
        ESGame.o[7] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][32]);
        sb.append(ProgEleven.k[7][33]);
        ESGame.o[8] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][35]);
        sb.append(ProgEleven.k[7][36]);
        ESGame.o[9] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][38]);
        ESGame.o[10] = sb.toString();
        sb.delete(0, 1200);
        sb.append(ProgEleven.k[7][40]);
        ESGame.o[11] = sb.toString();
        sb.delete(0, 1200);
    }

    private String q() {
        final StringBuffer sb = new StringBuffer(400);
        sb.append("Game Design: Anthony Gill and Greg Gorden");
        sb.append('\n');
        sb.append("Art: Mark Jones");
        sb.append('\n');
        sb.append("Programming: Marc Ilgen");
        sb.append('\n');
        sb.append("Technical Director: Andrew Friedman");
        sb.append('\n');
        sb.append("(longA) 2003 Vir2L Studos, incrementShortZ ZeniMax Media company. The Elder Scrolls and Vir2L are ");
        sb.append("registered trademarks of ZeniMax Media Inc. All rights reserved.");
        sb.append('\n');
        return sb.toString();
    }

    private void k(final int n) {
        final String m = this.R[n].stringA;
        this.R[n].t();
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
        this.R[n].e(ProgSix.getStringWithInt(m, "<TAG>", n2));
    }

    private String f() {
        final String[] listRecordStores = RecordStore.listRecordStores();
        int length;
        if (listRecordStores == null) {
            length = 0;
        }
        else {
            length = listRecordStores.length;
        }
        String s = "es_gamestate" + ProgSix.getIntFromESG(10000);
        while (true) {
            boolean b = false;
            for (int i = 0; i < length; ++i) {
                if (s.equals(listRecordStores[i])) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                break;
            }
            s = "es_gamestate" + ProgSix.getIntFromESG(10000);
        }
        return s;
    }

    private String M() {
        final String[] listRecordStores = RecordStore.listRecordStores();
        int length;
        if (listRecordStores == null) {
            length = 0;
        }
        else {
            length = listRecordStores.length;
        }
        String s = null;
        if (length == 0) {
            return null;
        }
        long n = 0L;
        RecordStore openRecordStore = null;
        for (int i = 0; i < length; ++i) {
            try {
                openRecordStore = RecordStore.openRecordStore(listRecordStores[i], false);
                openRecordStore.getNumRecords();
                final long lastModified = openRecordStore.getLastModified();
                if (lastModified > n) {
                    s = listRecordStores[i];
                    n = lastModified;
                }
            }
            catch (Throwable t) {}
            finally {
                try {
                    if (openRecordStore != null) {
                        openRecordStore.closeRecordStore();
                    }
                    openRecordStore = null;
                }
                catch (Exception ex) {}
            }
        }
        return s;
    }

    private void L() {
        final String m = this.M();
        final String[] listRecordStores = RecordStore.listRecordStores();
        int length;
        if (listRecordStores == null) {
            length = 0;
        }
        else {
            length = listRecordStores.length;
        }
        if (length == 0) {
            return;
        }
        for (int i = 0; i < length; ++i) {
            if (m != null) {
                if (m.equals(listRecordStores[i])) {
                    continue;
                }
            }
            try {
                RecordStore.deleteRecordStore(listRecordStores[i]);
            }
            catch (Exception ex) {}
        }
    }

    void x() {
        String a = ProgEleven.a(this.k, 5, 13, 0);
        if (a == null) {
            a = "No rumors!";
        }
        this.m.a(ProgEleven.s[5]);
        this.m.e(a);
        this.m.objectB = this.R[5];
        this.m.intC = 5;
        final ProgEight h = (ProgEight)this.m.objectB;
        final String m = h.stringA;
        h.t();
        h.e(ProgSix.getStringWithInt(m, "<TAG>", (int)ProgEleven.g));
        this.a((Object)this.m);
    }

    private void j() {
        if (ESGame.aT == 4) {
            this.getLines();
        }
    }

    static {
        ESGame.at = new byte[2000];
        ESGame.aN = null;
        aC = new Command("Menu", 7, 0);
        aS = new Command("Exit", 7, 0);
        ESGame.J = 1;
        ESGame.c = "";
        ESGame.b = null;
        ESGame.E = 0;
        ESGame.x = new int[][] { { 2, 3, 4, 11, 12, 13, 20, 21, 22, 29, 30, 31 }, { 5, 6, 7 }, { 23, 24, 25 }, { 14, 15, 16 }, { 8, 9, 10 }, { 32, 33, 34 }, { 26, 27, 28 }, { 17, 18, 19 }, { 35, 36, 37 } };
        ah = new int[][] { { 0, 7 }, { 7, 7 }, { 14, 7 }, { 21, 7 }, { 28, 5 } };
        p = new String[] { "/charin.dat", "/droppeditemsin.dat", "/itemsin.dat", "/monstersin.dat", "/npcstrings.dat", "/spellsin.dat", "/geomin.dat", "/dungnamesin.dat" };
        ESGame.l = new int[3];
        aM = new String[] { "Your fingers look gnarled to you.", "The scales on your arms and back itch.", "Your ears dissolve back into your skull.", "Your jaw hurts as it elongates, and your teeth seem to completely fill your mouth.", "Walking hurts, and the camp denizens are sure looking tasty. \n\nYour dreams are filled with the screams of overseers and others as you follow the delicious scent of blood throughout the camp. You awake cold, curled up, with Vander'objectA head tucked under your arm." };
        ESGame.O = null;
        ESGame.aU = null;
        ESGame.o = new String[12];
        ESGame.as = new String[12];
        ESGame.n = null;
        ESGame.ax = null;
        ESGame.j = false;
        try {
            ESGame.P = new Random(System.currentTimeMillis());
            i();
            C();
            K();
        }
        catch (Exception ex) {
            System.out.println("ERROR: problem with loading camp or image record HT");
        }
    }
}