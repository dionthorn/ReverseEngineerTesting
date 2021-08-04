import java.io.DataInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgEleven
{
    static String[] s;
    static byte[] e;
    static byte[] j;
    static byte[] i;
    static boolean[] b;
    static boolean[] q;
    static byte f;
    static boolean d;
    static byte[] c;
    static byte[] n;
    static short[] r;
    static short[] p;
    static short[] h;
    static short a;
    static short g;
    static boolean l;
    static String[][] k;
    static int[] o;
    static boolean m;

    static void e() {
        a("/npcstrings.dat");
    }

    static void a(final String s) {
        try {
            final DataInputStream a = ProgSix.a(s);
            final int n = 8;
            ProgEleven.k = new String[n][];
            for (int i = 0; i < n; ++i) {
                a(i, ProgEleven.o[i], a);
            }
            ProgEleven.m = true;
        }
        catch (Exception ex) {
            System.out.println("ERROR loading NPC and generic strings!");
            ProgEleven.m = false;
        }
    }

    static boolean a(final int n) {
        return (ProgEleven.f == 0 && !ProgEleven.d && n >= 13) || (ProgEleven.f == 1 && !ProgEleven.d && n >= 26) || (ProgEleven.f == 2 && !ProgEleven.d && n >= 39);
    }

    static void c() {
        System.out.println("WARDEN VISITS!!");
        ProgEleven.d = true;
        ++ProgEleven.f;
        final byte b = ProgEleven.j[6];
        final byte b2 = ProgEleven.i[6];
        final byte[] array = ESGame.u[0].w[b];
        final byte b3 = b2;
        array[b3] |= 0x20;
    }

    static void a() {
        System.out.println("WARDEN LEAVES!!");
        final byte b = ProgEleven.j[6];
        final byte b2 = ProgEleven.i[6];
        ProgEleven.d = false;
        ESGame.u[0].w[b][b2] = ProgSix.c((byte)32, ESGame.u[1].w[b][b2]);
    }

    static void a(final int n, final int n2, final DataInputStream dataInputStream) throws Exception {
        final int int1 = dataInputStream.readInt();
        if (int1 != n2) {
            System.out.println("Unexpected number of messages for whichNPC = " + n);
            throw new Exception("Error in readNPCMessages: npc is " + n);
        }
        ProgEleven.k[n] = new String[int1];
        for (int i = 0; i < int1; ++i) {
            ProgEleven.k[n][i] = dataInputStream.readUTF();
        }
    }

    static void b() {
        ProgEleven.b = new boolean[7];
        ProgEleven.q = new boolean[7];
        for (int i = 0; i < 7; ++i) {
            ProgEleven.b[i] = true;
            ProgEleven.q[i] = true;
        }
        ProgEleven.r = new short[4];
        ProgEleven.p = new short[4];
        ProgEleven.h = new short[4];
        ProgEleven.c = new byte[4];
        ProgEleven.n = new byte[4];
        for (int j = 0; j < 4; ++j) {
            ProgEleven.r[j] = 0;
            ProgEleven.p[j] = 0;
            ProgEleven.h[j] = 0;
            ProgEleven.c[j] = 0;
            ProgEleven.n[j] = 0;
        }
        ProgEleven.a = 0;
        ProgEleven.g = 0;
        ProgEleven.l = false;
    }

    static void d() {
        for (int i = 0; i < 4; ++i) {
            ProgEleven.c[i] = 0;
            ProgEleven.n[i] = 0;
        }
    }

    static boolean b(final int n) {
        return ProgEleven.e[n] == 1;
    }

    static int a(final int n, final int n2) {
        for (int i = 0; i < 7; ++i) {
            if (n == ProgEleven.j[i] && n2 == ProgEleven.i[i] && ProgEleven.b[i]) {
                return i;
            }
        }
        return -1;
    }

    static int d(final int n, final int n2) {
        final int a = ProgOne.a(3, n2);
        if (n == 0) {
            return a >>> 6 & 0x3;
        }
        if (n == 1) {
            return a >>> 4 & 0x3;
        }
        if (n == 2) {
            return a >>> 2 & 0x3;
        }
        if (n == 3) {
            return a & 0x3;
        }
        return 0;
    }

    static String a(final ProgTen ProgTen, final int n) {
        final short i = ProgTen.R[n][0];
        if (i == 0) {
            ProgTen.R[n][0] = 1;
            return ProgSix.a(ProgEleven.k[7][1], "<TAG>", ProgTen.E[n]);
        }
        ProgTen.R[n][0] = (short)(i + 1);
        return ProgSix.a(ProgEleven.k[7][2], "<TAG>", new String[] { ProgTen.E[n], String.valueOf(i), String.valueOf(i + 1) });
    }

    static String a(final ProgTen ProgTen, final int n, final int n2, final int n3) {
        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3: {
                if (n2 == 1) {
                    if (ProgEleven.q[n]) {
                        ProgEleven.q[n] = false;
                        return ProgEleven.k[n][0];
                    }
                    if (ProgEleven.h[n] > 50) {
                        return ProgEleven.k[n][1];
                    }
                    if (ProgTen.U[8] > 50) {
                        return ProgEleven.k[n][2];
                    }
                    return ProgEleven.k[n][3 + ESGame.h(3)];
                }
                else if (n2 == 2) {
                    if (ProgEleven.c[n] != 0) {
                        return ProgEleven.k[n][6];
                    }
                    final int b = ProgTen.b(n, n2);
                    if (b == 0) {
                        ProgEleven.c[n] = 1;
                    }
                    else if (b == 1) {
                        final short[] array = ProgTen.R[13];
                        final int n4 = 2;
                        array[n4] += 2;
                    }
                    else if (b == 2) {
                        final short[] array2 = ProgTen.R[13];
                        final int n5 = 2;
                        array2[n5] += 5;
                        final short[] p4 = ProgEleven.p;
                        ++p4[n];
                        ProgEleven.c[n] = 1;
                    }
                    else if (b == 3) {
                        final short[] array3 = ProgTen.R[13];
                        final int n6 = 2;
                        array3[n6] += 8;
                        final short[] p5 = ProgEleven.p;
                        ++p5[n];
                        ProgEleven.c[n] = 1;
                    }
                    final short[] r = ProgEleven.r;
                    ++r[n];
                    return ProgEleven.k[n][7 + b];
                }
                else if (n2 == 3) {
                    if (ProgEleven.n[n] != 0) {
                        return ProgEleven.k[n][6];
                    }
                    final int b2 = ProgTen.b(n, n2);
                    final int n7 = (n3 > 1) ? 1 : 0;
                    if (b2 == 0) {
                        ProgEleven.n[n] = 2;
                    }
                    else if (b2 == 1) {
                        final short[] array4 = ProgTen.R[13];
                        final int n8 = 2;
                        array4[n8] += 2;
                        ProgEleven.n[n] = 2;
                    }
                    else if (b2 == 2) {
                        final short[] array5 = ProgTen.R[13];
                        final int n9 = 2;
                        array5[n9] += 5;
                        final short[] p6 = ProgEleven.p;
                        ++p6[n];
                        ProgEleven.n[n] = 1;
                    }
                    else if (b2 == 3) {
                        final short[] array6 = ProgTen.R[13];
                        final int n10 = 2;
                        array6[n10] += 8;
                        final short[] p7 = ProgEleven.p;
                        ++p7[n];
                        ProgEleven.n[n] = 1;
                    }
                    final short[] r2 = ProgEleven.r;
                    ++r2[n];
                    return ProgEleven.k[n][11 + n7];
                }
                else if (n2 == 4) {
                    if (ProgEleven.c[n] == 2 || ProgEleven.n[n] == 2) {
                        return ProgEleven.k[n][13];
                    }
                    final int abs = Math.abs(ProgTen.H[n3]);
                    if (ProgOne.a(1, abs) == 15) {
                        ProgTen.y(n3);
                        final int a = ProgOne.a(3, abs);
                        final short[] h = ProgEleven.h;
                        h[n] -= (short)a;
                        ProgEleven.h[n] = (short)Math.max(ProgEleven.h[n], 0);
                        return ProgEleven.k[n][17];
                    }
                    if (ProgOne.a(1, abs) == 11) {
                        final int d = d(n, abs);
                        if (d > 0) {
                            ProgTen.y(n3);
                            final short[] p8 = ProgEleven.p;
                            p8[n] += (short)d;
                            ProgEleven.c[n] = 0;
                            ProgEleven.n[n] = 0;
                        }
                        return ProgEleven.k[n][13 + d];
                    }
                    return ProgEleven.k[n][13];
                }
                else if (n2 == 5) {
                    if (ProgEleven.p[n] == 0) {
                        return ProgEleven.k[n][18];
                    }
                    if (ProgEleven.h[n] > 50) {
                        return ProgEleven.k[n][1];
                    }
                    if (ProgTen.U[8] > 50) {
                        return ProgEleven.k[n][2];
                    }
                    final short[] p9 = ProgEleven.p;
                    --p9[n];
                    return a(ProgTen, n3);
                }
                else {
                    if (n2 == 6) {
                        ProgEleven.b[n] = false;
                        final ProgNine ProgNine = ESGame.u[0];
                        ProgNine.w[ProgEleven.j[n]][ProgEleven.i[n]] = ProgSix.c((byte)32, ProgNine.w[ProgEleven.j[n]][ProgEleven.i[n]]);
                        return ProgEleven.k[n][19];
                    }
                    return null;
                }
                //break;
            }
            case 4: {
                if (n2 == 1) {
                    if (ProgEleven.q[n]) {
                        ProgEleven.q[n] = false;
                        return ProgEleven.k[n][0];
                    }
                    return null;
                }
                else if (n2 == 4) {
                    final int a2 = ProgOne.a(1, Math.abs(ProgTen.H[n3]));
                    if (a2 == 13 || a2 == 15 || a2 == 17) {
                        return ProgEleven.k[n][1];
                    }
                    ++ProgEleven.a;
                    ProgTen.y(n3);
                    return ProgEleven.k[n][2];
                }
                else {
                    if (n2 != 7) {
                        return null;
                    }
                    if (ProgEleven.a / 3 <= 0) {
                        return ProgEleven.k[n][4];
                    }
                    if (!ProgTen.b(n3, ProgOne.a(), 0)) {
                        return ProgEleven.k[7][0];
                    }
                    ProgEleven.a -= 3;
                    return ProgEleven.k[n][3];
                }
                //break;
            }
            case 5: {
                if (n2 == 1) {
                    System.out.println("Greeting Helga");
                    if (ProgEleven.q[n]) {
                        System.out.println("first meeting");
                        ProgEleven.q[n] = false;
                        ProgTen.Y = 0;
                        System.out.println("message[iNPC] length is " + ProgEleven.k[n].length);
                        System.out.println(ProgEleven.k[n][0]);
                        System.out.println(ProgEleven.k[n][2]);
                        if (ProgEleven.l) {
                            ProgEleven.l = false;
                            return ProgEleven.k[5][21] + "\n" + ProgEleven.k[n][0] + "\n" + ProgEleven.k[n][2];
                        }
                        return ProgEleven.k[n][0] + "\n" + ProgEleven.k[n][2];
                    }
                    else if (ESGame.d(ProgTen.W) > ProgTen.Y) {
                        ++ProgTen.Y;
                        if (ProgEleven.l) {
                            ProgEleven.l = false;
                            return ProgEleven.k[5][21] + "\n" + ProgEleven.k[n][2 + ProgTen.Y];
                        }
                        return ProgEleven.k[n][2 + ProgTen.Y];
                    }
                    else {
                        if (ProgEleven.l) {
                            ProgEleven.l = false;
                            return ProgEleven.k[5][21];
                        }
                        return null;
                    }
                }
                else {
                    if (n2 == 13) {
                        return ProgEleven.k[n][2 + ProgTen.Y];
                    }
                    if (n2 == 4) {
                        if (ProgOne.a(1, Math.abs(ProgTen.H[n3])) == 13) {
                            if (ProgTen.D(n3) > 3) {
                                ProgEleven.g += 5;
                            }
                            else {
                                ProgEleven.g += 3;
                            }
                            ProgTen.y(n3);
                            return ProgEleven.k[n][11];
                        }
                        return ProgEleven.k[n][12];
                    }
                    else if (n2 == 8) {
                        if (ProgEleven.g < 7) {
                            return ProgEleven.k[n][1];
                        }
                        if (!ProgOne.b(Math.abs(ProgTen.H[n3])) || ProgTen.j(n3)) {
                            return ProgEleven.k[n][14];
                        }
                        ProgEleven.g -= 7;
                        ProgTen.h(n3);
                        return ProgEleven.k[n][13];
                    }
                    else if (n2 == 9) {
                        if (ProgEleven.g < 2) {
                            return ProgEleven.k[n][1];
                        }
                        if (ProgTen.f) {
                            return ProgEleven.k[n][15];
                        }
                        ProgTen.f = true;
                        ProgEleven.g -= 2;
                        return ProgEleven.k[n][16];
                    }
                    else if (n2 == 10) {
                        if (ProgEleven.g < 1) {
                            return ProgEleven.k[n][1];
                        }
                        ProgTen.A = 0;
                        --ProgEleven.g;
                        return ProgEleven.k[n][17];
                    }
                    else if (n2 == 11) {
                        if (ProgEleven.g < 1) {
                            return ProgEleven.k[n][1];
                        }
                        if (!ProgTen.x()) {
                            return ProgEleven.k[n][18];
                        }
                        --ProgEleven.g;
                        ProgTen.e();
                        return ProgEleven.k[n][19];
                    }
                    else {
                        if (n2 == 12) {
                            ProgTen.U[2] = ProgTen.U[3];
                            ProgTen.U[4] = ProgTen.U[5];
                            return ProgEleven.k[n][20];
                        }
                        return null;
                    }
                }
                //break;
            }
            case 6: {
                if (ProgEleven.f == 0) {
                    return null;
                }
                if (ProgEleven.f == 1 && ProgTen.m == 0) {
                    ProgTen.m = 1;
                    return ProgEleven.k[n][0];
                }
                if (ProgEleven.f == 2 && ProgTen.m <= 1) {
                    ProgTen.m = 2;
                    return ProgEleven.k[n][1];
                }
                if (ProgEleven.f == 3 && ProgTen.m <= 2) {
                    ProgTen.m = 3;
                    return ProgEleven.k[n][2];
                }
                if (ProgEleven.f == 4 && ProgTen.m <= 3) {
                    ProgTen.m = 4;
                    return ProgEleven.k[n][3] + "\n" + ProgEleven.k[n][4];
                }
                return null;
            }
            default: {
                return null;
            }
        }
    }

    static boolean a(final ProgTen ProgTen) {
        return ProgTen.j == 1 && Math.abs(ProgTen.l - ProgEleven.j[6]) + Math.abs(ProgTen.k - ProgEleven.i[6]) == 1;
    }

    static boolean c(final int n, final int n2) {
        switch (n) {
            case 0: {
                switch (n2) {
                    case 3:
                    case 4:
                    case 13: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
                //break;
            }
            case 1: {
                switch (n2) {
                    case 7:
                    case 8:
                    case 10: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
                //break;
            }
            case 2: {
                switch (n2) {
                    case 1:
                    case 6:
                    case 12: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
                //break;
            }
            case 3: {
                switch (n2) {
                    case 0:
                    case 2:
                    case 5: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
                //break;
            }
            default: {
                return false;
            }
        }
    }

    static int b(final int n, final int n2) {
        switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        return 3;
                    }
                    case 1: {
                        return 4;
                    }
                    case 2: {
                        return 13;
                    }
                    default: {
                        return -1;
                    }
                }
                //break;
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        return 7;
                    }
                    case 1: {
                        return 8;
                    }
                    case 2: {
                        return 10;
                    }
                    default: {
                        return -1;
                    }
                }
                //break;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        return 1;
                    }
                    case 1: {
                        return 6;
                    }
                    case 2: {
                        return 12;
                    }
                    default: {
                        return -1;
                    }
                }
                //break;
            }
            case 3: {
                switch (n2) {
                    case 0: {
                        return 0;
                    }
                    case 1: {
                        return 2;
                    }
                    case 2: {
                        return 5;
                    }
                    default: {
                        return -1;
                    }
                }
                //break;
            }
            default: {
                return -1;
            }
        }
    }

    static {
        ProgEleven.s = new String[] { "Arantamo", "Celegil", "Favela Dralor", "Vander", "Beneca", "Helga", "Varus" };
        ProgEleven.e = new byte[] { 1, 1, 1, 1, 2, 2, 3 };
        ProgEleven.j = new byte[] { 12, 3, 15, 6, 7, 12, 9 };
        ProgEleven.i = new byte[] { 3, 7, 7, 13, 2, 13, 9 };
        ProgEleven.f = 0;
        ProgEleven.d = false;
        ProgEleven.o = new int[] { 20, 20, 20, 20, 5, 22, 5, 41 };
        ProgEleven.m = false;
        b();
    }
}