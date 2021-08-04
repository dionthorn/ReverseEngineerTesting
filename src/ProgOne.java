import java.util.Random;
import java.io.DataInputStream;

//
// Decompiled by Procyon v0.5.36
//

public class ProgOne
{
    static int n;
    static String[] g;
    static int k;
    static String[] b;
    static byte[] j;
    static byte[] c;
    static byte[] m;
    static short[] f;
    static short[] a;
    static byte[] e;
    static String[][] l;
    static byte[][] h;
    static byte d;
    static short i;

    ProgOne() {
    }

    static short a() {
        return (short)(++ProgOne.i);
    }

    static int e(final int n) {
        return n - 1;
    }

    static boolean c(final int n) {
        return ProgOne.e[e(n)] != -1;
    }

    static boolean b(final int n) {
        switch (ProgOne.j[e(n)]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    static int a(final int n) {
        return ProgOne.e[e(n)];
    }

    static String d(final int n) {
        return ProgOne.b[e(n)];
    }

    static int a(final int n, final int n2) {
        final int e = e(n2);
        int n3 = 0;
        switch (n) {
            case 1: {
                n3 = ProgOne.j[e];
                break;
            }
            case 2: {
                n3 = ProgOne.c[e];
                break;
            }
            case 3: {
                n3 = ProgOne.m[e];
                break;
            }
            case 4: {
                n3 = ProgOne.f[e];
                break;
            }
            case 5: {
                n3 = ProgOne.a[e];
                break;
            }
            case 6: {
                n3 = ProgOne.e[e];
                break;
            }
            default: {
                n3 = -1;
                break;
            }
        }
        return n3;
    }

    static void e() throws Exception {
        ProgOne.i = 0;
        c();
        d();
    }

    static void c() throws Exception {
        final DataInputStream a = ProgSix.a("/itemsin.dat");
        ProgOne.n = a.readShort();
        ProgOne.g = new String[ProgOne.n];
        for (int i = 0; i < ProgOne.n; ++i) {
            ProgOne.g[i] = a.readUTF();
        }
        ProgOne.k = a.readShort();
        ProgOne.b = new String[ProgOne.k];
        ProgOne.j = new byte[ProgOne.k];
        ProgOne.c = new byte[ProgOne.k];
        ProgOne.m = new byte[ProgOne.k];
        ProgOne.f = new short[ProgOne.k];
        ProgOne.a = new short[ProgOne.k];
        ProgOne.e = new byte[ProgOne.k];
        for (int j = 0; j < ProgOne.k; ++j) {
            ProgOne.b[j] = a.readUTF();
        }
        for (int k = 0; k < ProgOne.k; ++k) {
            ProgOne.j[k] = a.readByte();
        }
        for (int l = 0; l < ProgOne.k; ++l) {
            ProgOne.c[l] = a.readByte();
        }
        for (int n = 0; n < ProgOne.k; ++n) {
            ProgOne.m[n] = a.readByte();
        }
        for (int n2 = 0; n2 < ProgOne.k; ++n2) {
            ProgOne.f[n2] = a.readShort();
        }
        for (int n3 = 0; n3 < ProgOne.k; ++n3) {
            ProgOne.a[n3] = a.readShort();
        }
        for (int n4 = 0; n4 < ProgOne.k; ++n4) {
            ProgOne.e[n4] = a.readByte();
        }
        a.close();
    }

    static void d() throws Exception {
        final DataInputStream a = ProgSix.a("/droppeditemsin.dat");
        final short short1 = a.readShort();
        ProgOne.d = (byte)short1;
        System.out.println("numTableRows=" + ProgOne.d);
        final short short2 = a.readShort();
        ProgOne.h = new byte[short1][short2];
        for (short n = 0; n < short1; ++n) {
            for (short n2 = 0; n2 < short2; ++n2) {
                ProgOne.h[n][n2] = a.readByte();
            }
        }
        a.close();
    }

    static int a(final Random random, final int n) {
        int n2 = -1;
        int n3 = -1;
        for (int i = 0; i < ProgOne.k; ++i) {
            if (ProgOne.j[i] == 11 && ProgOne.c[i] == (byte)n) {
                if (n2 == -1) {
                    n2 = i;
                }
                n3 = i;
            }
        }
        return 1 + (n2 + Math.abs(random.nextInt() % (n3 - n2 + 1)));
    }

    static int a(final Random random, final int n, final int n2) {
        int a = ProgSix.a(random, 100);
        for (int i = 1; i < n2; ++i) {
            final int a2 = ProgSix.a(random, 100);
            if (a2 > a) {
                a = a2;
            }
        }
        final int n3 = a;
        int n4;
        if (n3 <= 64) {
            n4 = 0;
        }
        else if (n3 <= 75) {
            n4 = 1;
        }
        else if (n3 <= 90) {
            n4 = 3;
        }
        else {
            n4 = 4;
        }
        int n5 = ProgSix.a(random, 10) + (n - 2);
        if (n5 > ProgOne.d - 1) {
            n5 = ProgOne.d - 1;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        int j = ProgOne.h[n5][n4];
        if (n4 == 1) {
            j |= ProgOne.h[n5][2] << 8;
        }
        System.out.println("in getRandomItem, res = " + j);
        return j;
    }

    static String[] b() {
        final String[] array = new String[13];
        for (int i = 0; i < 13; ++i) {
            array[i] = ProgOne.b[86 + i];
        }
        return array;
    }

    static {
        ProgOne.l = new String[][] { { "Warp to camp", "" }, { "Cures ailment", "" }, { "Restores Health", "" }, { "Restores Magicka", "" }, { "", "" }, { "Grants level", "experience" }, { "Health & Magicka", "" }, { "Increase harm", "" }, { "Increase armor", "" }, { "Safe camping", "" }, { "Kill monster", "" }, { "Kill monster", "" }, { "Kill monster", "" } };
    }
}