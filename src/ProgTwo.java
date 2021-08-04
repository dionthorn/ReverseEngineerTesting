import java.io.DataInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgTwo
{
    String c;
    byte h;
    byte e;
    byte f;
    byte d;
    byte j;
    byte g;
    String a;
    static int i;
    static ProgTwo[] b;

    ProgTwo() {
    }

    static int d(final int n) {
        return n - 1;
    }

    static ProgTwo c(final int n) {
        return ProgTwo.b[d(n)];
    }

    static boolean a(final int n) {
        return n >= 1 && n <= ProgTwo.i;
    }

    static boolean b(final int n) {
        return ProgTwo.b[d(n)].d == 2;
    }

    static void a() {
        try {
            final DataInputStream a = ProgSix.a("/spellsin.dat");
            ProgTwo.i = a.readShort();
            ProgTwo.b = new ProgTwo[ProgTwo.i];
            for (int i = 0; i < ProgTwo.i; ++i) {
                ProgTwo.b[i] = new ProgTwo();
            }
            System.out.println("Number of spells is " + ProgTwo.i);
            for (int j = 0; j < ProgTwo.i; ++j) {
                ProgTwo.b[j].c = a.readUTF();
            }
            for (int k = 0; k < ProgTwo.i; ++k) {
                ProgTwo.b[k].h = a.readByte();
            }
            for (int l = 0; l < ProgTwo.i; ++l) {
                ProgTwo.b[l].e = a.readByte();
            }
            for (int n = 0; n < ProgTwo.i; ++n) {
                ProgTwo.b[n].f = a.readByte();
            }
            for (int n2 = 0; n2 < ProgTwo.i; ++n2) {
                ProgTwo.b[n2].d = a.readByte();
            }
            for (int n3 = 0; n3 < ProgTwo.i; ++n3) {
                ProgTwo.b[n3].j = a.readByte();
            }
            for (int n4 = 0; n4 < ProgTwo.i; ++n4) {
                ProgTwo.b[n4].g = a.readByte();
            }
            for (int n5 = 0; n5 < ProgTwo.i; ++n5) {
                ProgTwo.b[n5].a = a.readUTF();
            }
            a.close();
        }
        catch (Exception x) {
            System.out.println("ERROR: cannot load spells!");
            System.out.println(x.getMessage());
        }
    }
}