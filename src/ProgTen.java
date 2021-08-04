import java.util.Hashtable;
import java.util.Enumeration;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgTen
{
    static boolean g;
    private static boolean D;
    static Vector ad;
    private static final Integer aj;
    private static final Integer am;
    private static final Integer o;
    static boolean S;
    static short B;
    static short al;
    static String[] K;
    static String[] r;
    static String[] E;
    static short[][] M;
    static String[] h;
    static String[] y;
    static short[] c;
    static int[][] ac;
    private static final String[] af;
    public static int ag;
    ESGame ai;
    public static String X;
    String v;
    short ar;
    short q;
    short[] U;
    byte N;
    int n;
    short[] J;
    short V;
    short[] aq;
    short[][] R;
    byte p;
    byte[] H;
    int[] P;
    byte[] T;
    int x;
    byte b;
    short W;
    short Y;
    short m;
    byte A;
    short ah;
    short F;
    short ap;
    boolean f;
    byte j;
    byte l;
    byte k;
    byte ak;
    byte C;
    byte ao;
    byte an;
    byte Z;
    byte[] G;
    short t;
    short aa;
    boolean s;
    boolean L;
    boolean I;
    byte z;
    byte w;
    byte e;
    byte ab;
    boolean i;
    boolean Q;
    boolean u;
    boolean O;
    byte[][] ae;
    byte d;
    byte a;

    int b(final boolean b) {
        if (b) {
            return 400;
        }
        return 200;
    }

    public ProgTen(final ESGame ai) {
        this.s = false;
        this.L = false;
        this.I = false;
        ProgTen.g = false;
        u();
        this.v = null;
        this.U = new short[10];
        this.J = new short[16];
        this.aq = new short[2];
        this.R = new short[14][3];
        this.p = 0;
        this.H = new byte[24];
        this.P = new int[24];
        this.T = new byte[7];
        this.G = new byte[25];
        this.ae = new byte[9][5];
        this.ai = ai;
        this.Q = false;
    }

    void a(final short[] array) {
        array[2] = array[3];
        array[4] = array[5];
        array[6] = array[7];
        array[8] = 0;
    }

    void c(final int n) {
        this.ar = (short)n;
        this.q = ProgTen.M[this.ar][1];
        for (int n2 = 8, i = 0; i < n2; ++i) {
            final int n3 = 2 * i;
            this.J[n3] = ProgTen.M[this.ar][2 + i];
            this.J[n3 + 1] = 0;
        }
        this.V = ProgTen.M[this.ar][10];
        this.aq[0] = ProgTen.M[this.ar][11];
        this.aq[1] = ProgTen.M[this.ar][12];
        this.U[0] = 1;
        this.U[1] = 0;
        this.g();
        this.U[2] = this.U[3];
        this.U[4] = this.U[5];
        this.U[6] = this.U[7];
        this.U[8] = 0;
        this.U[9] = 0;
        this.N = 0;
        this.n = 0;
        int n4 = 13;
        for (int j = 0; j < 14; ++j) {
            this.R[j][0] = ProgTen.M[this.ar][n4++];
            this.R[j][1] = ProgTen.M[this.ar][n4++];
            this.R[j][2] = 0;
        }
        for (int k = 0; k < 24; ++k) {
            this.H[k] = 0;
            this.P[k] = 0;
        }
        for (int l = 0; l < 7; ++l) {
            this.T[l] = 0;
        }
        this.x = this.A();
    }

    void g() {
        this.U[3] = (short)((this.J[0] + this.J[10]) / 2);
        this.U[5] = (short)(this.V * this.J[2] / 4);
        this.U[7] = (short)(this.J[0] + this.J[4] + this.J[6] + this.J[10]);
    }

    private int A() {
        int n = 0;
        int n2 = 13;
        int n3 = 1;
        for (int i = 0; i < 14; ++i) {
            final short n4 = ProgTen.M[this.ar][n2++];
            final short n5 = ProgTen.M[this.ar][n2++];
            int n6 = 0;
            switch (i) {
                case 1: {
                    n6 = 0;
                    break;
                }
                case 3: {
                    n6 = 5;
                    break;
                }
                case 4: {
                    n6 = 10;
                    break;
                }
                case 6: {
                    n6 = 15;
                    break;
                }
                case 10: {
                    n6 = 20;
                    break;
                }
                default: {
                    n6 = -1;
                    break;
                }
            }
            if (n6 != -1 && n4 > 0) {
                n |= 1 << n6;
                if (n3 != 0) {
                    this.b = (byte)(n6 + 1);
                    n3 = 0;
                }
            }
        }
        return n;
    }

    public void d(final int n) {
        this.c(n, false);
    }

    public void c(final int n, final boolean b) {
        if (!b) {
            this.W = 0;
            this.Y = 0;
            this.m = 0;
        }
        this.A = 0;
        this.ah = 0;
        this.F = 0;
        this.ap = 0;
        this.f = false;
        this.c(b);
        this.w();
        if (!b) {
            this.C = 0;
            this.ao = 0;
            this.an = 0;
            this.Z = 0;
        }
        for (int i = 0; i < 25; ++i) {
            this.G[i] = 0;
        }
        this.t = 0;
        this.aa = 0;
        this.s = false;
        this.L = false;
        this.I = false;
        if (!b) {
            this.C();
        }
    }

    private void c(final boolean b) {
        if (!b) {
            final byte b2 = 1;
            this.ab = b2;
            this.j = b2;
            final byte b3 = 9;
            this.z = b3;
            this.l = b3;
            final byte b4 = 10;
            this.w = b4;
            this.k = b4;
            final byte b5 = 1;
            this.e = b5;
            this.ak = b5;
        }
        else {
            final byte b6 = 1;
            this.ab = b6;
            this.j = b6;
            final byte b7 = 12;
            this.z = b7;
            this.l = b7;
            final byte b8 = 14;
            this.w = b8;
            this.k = b8;
            final byte b9 = 1;
            this.e = b9;
            this.ak = b9;
        }
    }

    String m() {
        final StringBuffer sb = new StringBuffer(300);
        final String str = " ";
        final String s = ": ";
        sb.append(ProgTen.r[this.q]);
        sb.append(str);
        sb.append(ProgTen.K[this.ar]);
        sb.append('\n');
        sb.append(ProgTen.h[0]);
        sb.append(s);
        sb.append(this.U[0]);
        sb.append('\n');
        sb.append(ProgTen.h[2]);
        sb.append(s);
        sb.append(this.n(2));
        sb.append('\n');
        sb.append(ProgTen.h[4]);
        sb.append(s);
        sb.append(this.n(4));
        sb.append('\n');
        sb.append(ProgTen.h[6]);
        sb.append(s);
        sb.append(this.n(6));
        sb.append('\n');
        for (int i = 0; i < 8; ++i) {
            final int n = 2 * i;
            sb.append(ProgTen.y[n]);
            sb.append(s);
            sb.append(this.J[n]);
            sb.append('\n');
        }
        for (int j = 0; j < 14; ++j) {
            if (this.R[j][0] > 0) {
                sb.append(ProgTen.E[j]);
                sb.append(s);
                sb.append(this.R[j][0]);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    static void u() {
        if (!ProgTen.S) {
            try {
                a("/charin.dat");
                ProgTen.S = true;
            }
            catch (Exception obj) {
                System.out.println("Error: could not load character data");
                System.out.println("Exception: " + obj);
            }
        }
    }

    private static void a(final String s) throws Exception {
        final DataInputStream a = ESGame.a(s);
        a.available();
        ProgTen.h = a(a);
        ProgTen.y = a(a);
        ProgTen.K = a(a);
        ProgTen.B = (short)ProgTen.K.length;
        ProgTen.r = a(a);
        ProgTen.al = (short)ProgTen.K.length;
        ProgTen.E = a(a);
        final short n = (short)ProgTen.E.length;
        if (n != 14) {
            throw new Exception("Error: mismatch between input number of skill types and that specified in code");
        }
        ProgTen.c = new short[n];
        for (short n2 = 0; n2 < n; ++n2) {
            ProgTen.c[n2] = a.readShort();
        }
        final int n3 = 13 + 2 * n;
        ProgTen.M = new short[ProgTen.B][n3];
        for (short n4 = 0; n4 < ProgTen.B; ++n4) {
            for (int i = 0; i < n3; ++i) {
                ProgTen.M[n4][i] = a.readShort();
            }
        }
    }

    private static String[] a(final DataInputStream dataInputStream) throws Exception {
        final short short1 = dataInputStream.readShort();
        final String[] array = new String[short1];
        for (short n = 0; n < short1; ++n) {
            array[n] = dataInputStream.readUTF();
        }
        return array;
    }

    static ProgTen a(final byte[] buf, final boolean b) throws Exception {
        final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(buf, 0, buf.length));
        final ProgTen ProgTen = new ProgTen(null);
        ProgTen.v = dataInputStream.readUTF();
        ProgTen.ar = dataInputStream.readShort();
        if (!b) {
            ProgTen.c(ProgTen.ar);
            ProgTen.d(ProgTen.ar);
        }
        ProgTen.q = dataInputStream.readShort();
        for (int i = 0; i < 10; ++i) {
            ProgTen.U[i] = dataInputStream.readShort();
        }
        if (b) {
            ProgTen.N = dataInputStream.readByte();
        }
        ProgTen.n = dataInputStream.readInt();
        for (int k = 0; k < 16; ++k) {
            ProgTen.J[k] = dataInputStream.readShort();
        }
        ProgTen.V = dataInputStream.readShort();
        ProgTen.aq[0] = dataInputStream.readShort();
        ProgTen.aq[1] = dataInputStream.readShort();
        for (int l = 0; l < 14; ++l) {
            for (int n = 0; n < 3; ++n) {
                ProgTen.R[l][n] = dataInputStream.readShort();
            }
        }
        if (b) {
            ProgTen.p = dataInputStream.readByte();
            for (int n2 = 0; n2 < 24; ++n2) {
                ProgTen.H[n2] = dataInputStream.readByte();
            }
            for (int n3 = 0; n3 < 24; ++n3) {
                ProgTen.P[n3] = dataInputStream.readInt();
            }
            for (int n4 = 0; n4 < 7; ++n4) {
                ProgTen.T[n4] = dataInputStream.readByte();
            }
            ProgTen.x = dataInputStream.readInt();
            ProgTen.b = dataInputStream.readByte();
        }
        else {
            ProgTen.x = dataInputStream.readInt();
        }
        if (b) {
            ProgTen.W = dataInputStream.readShort();
            ProgTen.Y = dataInputStream.readShort();
            ProgTen.m = dataInputStream.readShort();
            ProgTen.A = dataInputStream.readByte();
            ProgTen.ah = dataInputStream.readShort();
            ProgTen.F = dataInputStream.readShort();
            ProgTen.ap = dataInputStream.readShort();
            ProgTen.f = dataInputStream.readBoolean();
            ProgTen.j = dataInputStream.readByte();
            ProgTen.l = dataInputStream.readByte();
            ProgTen.k = dataInputStream.readByte();
            ProgTen.ak = dataInputStream.readByte();
            ProgTen.C = dataInputStream.readByte();
            ProgTen.ao = dataInputStream.readByte();
            ProgTen.an = dataInputStream.readByte();
            ProgTen.Z = dataInputStream.readByte();
            for (int n5 = 0; n5 < 25; ++n5) {
                ProgTen.G[n5] = dataInputStream.readByte();
            }
            ProgTen.t = dataInputStream.readShort();
            ProgTen.aa = dataInputStream.readShort();
            ProgTen.s = dataInputStream.readBoolean();
            ProgTen.L = dataInputStream.readBoolean();
            ProgTen.I = dataInputStream.readBoolean();
        }
        return ProgTen;
    }

    byte[] g(final boolean b) throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream(this.b(b));
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeUTF(this.v);
        dataOutputStream.writeShort(this.ar);
        dataOutputStream.writeShort(this.q);
        if (b) {
            for (int i = 0; i < 10; ++i) {
                dataOutputStream.writeShort(this.U[i]);
            }
            dataOutputStream.writeByte(this.N);
        }
        else {
            final short[] array = new short[10];
            for (int j = 0; j < 10; ++j) {
                array[j] = this.U[j];
            }
            this.a(array);
            for (int k = 0; k < 10; ++k) {
                dataOutputStream.writeShort(array[k]);
            }
        }
        dataOutputStream.writeInt(this.n);
        for (int l = 0; l < 16; ++l) {
            dataOutputStream.writeShort(this.J[l]);
        }
        dataOutputStream.writeShort(this.V);
        dataOutputStream.writeShort(this.aq[0]);
        dataOutputStream.writeShort(this.aq[1]);
        for (int n = 0; n < 14; ++n) {
            for (int n2 = 0; n2 < 3; ++n2) {
                dataOutputStream.writeShort(this.R[n][n2]);
            }
        }
        if (b) {
            dataOutputStream.writeByte(this.p);
            for (int n3 = 0; n3 < 24; ++n3) {
                dataOutputStream.writeByte(this.H[n3]);
            }
            for (int n4 = 0; n4 < 24; ++n4) {
                dataOutputStream.writeInt(this.P[n4]);
            }
            for (int n5 = 0; n5 < 7; ++n5) {
                dataOutputStream.writeByte(this.T[n5]);
            }
            dataOutputStream.writeInt(this.x);
            dataOutputStream.writeByte(this.b);
        }
        else {
            dataOutputStream.writeInt(this.A());
        }
        if (b) {
            dataOutputStream.writeShort(this.W);
            dataOutputStream.writeShort(this.Y);
            dataOutputStream.writeShort(this.m);
            dataOutputStream.writeByte(this.A);
            dataOutputStream.writeShort(this.ah);
            dataOutputStream.writeShort(this.F);
            dataOutputStream.writeShort(this.ap);
            dataOutputStream.writeBoolean(this.f);
            dataOutputStream.writeByte(this.j);
            dataOutputStream.writeByte(this.l);
            dataOutputStream.writeByte(this.k);
            dataOutputStream.writeByte(this.ak);
            dataOutputStream.writeByte(this.C);
            dataOutputStream.writeByte(this.ao);
            dataOutputStream.writeByte(this.an);
            dataOutputStream.writeByte(this.Z);
            for (int n6 = 0; n6 < 25; ++n6) {
                dataOutputStream.writeByte(this.G[n6]);
            }
            dataOutputStream.writeShort(this.t);
            dataOutputStream.writeShort(this.aa);
            dataOutputStream.writeBoolean(this.s);
            dataOutputStream.writeBoolean(this.L);
            dataOutputStream.writeBoolean(this.I);
        }
        return out.toByteArray();
    }

    void g(final int n) {
        byte b = -1;
        switch (n) {
            case 1: {
                b = 1;
            }
            case 2: {
                this.e = this.ak;
                if (this.ak == 1) {
                    this.z = this.l;
                    this.w = (byte)(this.k - b);
                }
                else if (this.ak == 3) {
                    this.z = this.l;
                    this.w = (byte)(this.k + b);
                }
                else if (this.ak == 2) {
                    this.z = (byte)(this.l + b);
                    this.w = this.k;
                }
                else if (this.ak == 4) {
                    this.z = (byte)(this.l - b);
                    this.w = this.k;
                }
                final ProgNine ProgNine = ESGame.u[this.j - 1];
                if (this.z < 0) {
                    this.i = true;
                    this.ab = ProgNine.x[3];
                    final ProgNine j = ESGame.u[this.ab - 1];
                    if (this.ab == 1 || this.j == 1) {
                        this.z = (byte)(j.g - 1);
                        this.w += (byte)((j.y - ProgNine.y) / 2);
                        break;
                    }
                    this.z = (byte)(j.g - 1);
                    break;
                }
                else if (this.z >= ProgNine.g) {
                    this.i = true;
                    this.ab = ProgNine.x[1];
                    final ProgNine k = ESGame.u[this.ab - 1];
                    if (this.ab == 1 || this.j == 1) {
                        this.z = 0;
                        this.w += (byte)((k.y - ProgNine.y) / 2);
                        break;
                    }
                    this.z = 0;
                    break;
                }
                else if (this.w < 0) {
                    this.i = true;
                    this.ab = ProgNine.x[0];
                    final ProgNine l = ESGame.u[this.ab - 1];
                    if (this.ab == 1 || this.j == 1) {
                        this.z += (byte)((l.g - ProgNine.g) / 2);
                        this.w = (byte)(l.y - 1);
                        break;
                    }
                    this.w = (byte)(l.y - 1);
                    break;
                }
                else {
                    if (this.w < ProgNine.y) {
                        this.i = false;
                        this.ab = this.j;
                        break;
                    }
                    this.i = true;
                    this.ab = ESGame.u[this.j - 1].x[2];
                    final ProgNine m = ESGame.u[this.ab - 1];
                    if (this.ab == 1 || this.j == 1) {
                        this.z += (byte)((m.g - ProgNine.g) / 2);
                        this.w = 0;
                        break;
                    }
                    this.w = 0;
                    break;
                }
                //break;
            }
            case 3: {
                this.ab = this.j;
                this.i = false;
                this.e = (byte)(this.ak + 1);
                if (this.e > 4) {
                    this.e = 1;
                }
                this.z = this.l;
                this.w = this.k;
                break;
            }
            case 4: {
                this.ab = this.j;
                this.i = false;
                this.e = (byte)(this.ak - 1);
                if (this.e < 1) {
                    this.e = 4;
                }
                this.z = this.l;
                this.w = this.k;
                break;
            }
        }
    }

    boolean a(final int n, final boolean b) {
        this.b().a(this.l, (int)this.k);
        if (this.U[6] <= 0) {
            return false;
        }
        if (b && n == 4) {
            this.q(4);
            this.q(1);
            final boolean i = this.i;
            final boolean q = this.q(3);
            this.i = i;
            return q;
        }
        if (b && n == 3) {
            this.q(3);
            this.q(1);
            final boolean j = this.i;
            final boolean q2 = this.q(4);
            this.i = j;
            return q2;
        }
        return this.q(n);
    }

    boolean q(final int n) {
        if (this.U[6] <= 0) {
            return false;
        }
        if (n == 0) {
            return false;
        }
        this.g(n);
        boolean b = false;
        if (n == 1 || n == 2) {
            b = true;
        }
        if (this.ab <= 0) {
            return false;
        }
        final ProgNine ProgNine = ESGame.u[this.ab - 1];
        if (!ProgNine.k) {
            return false;
        }
        final byte b2 = ProgNine.w[this.z][this.w];
        if (!this.a(b2)) {
            return false;
        }
        if (this.ab == 37 && this.j != 37) {
            final Enumeration<byte[]> elements = (Enumeration<byte[]>)ESGame.G[this.ab - 1].elements();
            while (elements.hasMoreElements()) {
                final ProgFour a = ProgFour.a(elements.nextElement());
                if (a.l == 41) {
                    a.g = (byte)a.c(14);
                    a.d();
                }
            }
        }
        if (!this.a(this.j, this.l, this.k) && this.a(this.ab, this.z, this.w)) {
            this.u = true;
        }
        else {
            this.u = false;
        }
        if (this.a(this.j, this.l, this.k) && !this.a(this.ab, this.z, this.w)) {
            this.O = true;
        }
        else {
            this.O = false;
        }
        this.j = this.ab;
        this.d = this.l;
        this.a = this.k;
        this.l = this.z;
        this.k = this.w;
        this.ak = this.e;
        ProgNine.h = true;
        if (n == 1 || n == 2) {
            if (ProgEleven.l) {
                ProgEleven.l = false;
            }
            final short[] u = this.U;
            final int n2 = 6;
            u[n2] -= (short)(1 * this.c());
            this.U[6] = (short)Math.max(this.U[6], 0);
        }
        if ((b2 & 0x4) != 0x0) {
            final int f = ProgNine.f(this.l, this.k);
            if (f == 1) {
                final byte[] e = ProgNine.e(this.l, this.k);
                if ((e[6] & 0x4) != 0x0) {
                    ProgTen.g = true;
                    this.w();
                    return true;
                }
                System.out.println(">>>>>>Found ProgOne dropped item item: " + d(e));
                if (this.c(e)) {
                    ProgNine.d(e);
                    if ((e[6] & 0x2) == 0x0) {
                        System.out.println("Dropped item not possessed before");
                        final int j = e[2] - 1;
                        System.out.println("item index=" + j);
                        if (ProgOne.j[j] == 11) {
                            this.W += ProgOne.c[j];
                            this.ai.n(ESGame.d(this.W));
                        }
                    }
                }
            }
            else if (f > 1) {
                System.out.println("Found several items in square");
                final Enumeration elements2 = ProgNine.b(this.l, this.k).elements();
                while (elements2.hasMoreElements()) {
                    final byte[] array = elements2.nextElement();
                    if ((array[6] & 0x4) != 0x0) {
                        ProgTen.g = true;
                        this.w();
                        return true;
                    }
                    if (!this.c(array)) {
                        continue;
                    }
                    ProgNine.d(array);
                    if ((array[6] & 0x2) == 0x0) {
                        continue;
                    }
                    final int k = array[2] - 1;
                    System.out.println("item index=" + k);
                    if (ProgOne.j[k] != 11) {
                        continue;
                    }
                    this.W += ProgOne.c[k];
                    this.ai.n(ESGame.d(this.W));
                }
            }
        }
        this.w();
        if (b && (b2 & 0x8) != 0x0) {
            this.p();
        }
        return true;
    }

    boolean a(final byte b) {
        return (b & 0x1) == 0x0 && (b & 0x20) == 0x0 && (b & 0x2) == 0x0;
    }

    void a(final ProgFour ProgFour) {
        this.t = ProgFour.a;
        final byte l = ProgFour.l;
        int min = Math.min(this.h(true) - ProgFour.c(7), ProgFour.c(2));
        if (this.t(10)) {
            if (ProgFour.c[8] == 0) {
                this.x(10);
            }
            else {
                min += ProgFour.c[8];
            }
        }
        final int d2 = d(Math.min(Math.max(this.s() + min * 5, 10), 95), Math.min(Math.max(ProgFour.c(6) - min * 5, 10), 95));
        if (d2 == 0) {
            return;
        }
        int z = this.z();
        int c = ProgFour.c(8);
        if (this.t(13)) {
            if (ProgFour.c[5] == 0) {
                this.G[12] = 0;
            }
            else {
                c -= ProgFour.c[5];
            }
        }
        if (d2 == 1) {
            c *= 2;
        }
        else if (d2 == 3) {
            z *= 2;
        }
        ProgFour.b(Math.max(z - c, 4) * ProgFour.c(14) / 100);
        ProgFour.d();
        if (this.t(7)) {
            if (ProgFour.c[1] == 0) {
                this.x(7);
            }
            else {
                ProgFour.b(Math.max(ProgFour.c[1], 4) * ProgFour.c(14) / 100);
            }
        }
        if (d2 >= 2) {
            this.a(this.F(), 1);
        }
        if (!this.t(7)) {
            final short[] u = this.U;
            final int n = 6;
            u[n] -= (short)(7 * this.c());
            this.U[6] = (short)Math.max(this.U[6], 0);
        }
        if (this.k(6)) {
            int n2 = 2 * this.U[3] / 100;
            if (n2 < 1) {
                n2 = 1;
            }
            final short[] u2 = this.U;
            final int n3 = 2;
            u2[n3] -= (short)n2;
        }
    }

    int b(final Object o) {
        final byte[] array = (byte[])o;
        byte o2;
        byte m;
        if (array.length == 28) {
            final ProgFour a = ProgFour.a(array);
            o2 = a.o;
            m = a.m;
        }
        else {
            o2 = array[0];
            m = array[1];
        }
        int n;
        if (this.ak == 1) {
            n = this.k - m;
        }
        else if (this.ak == 3) {
            n = m - this.k;
        }
        else if (this.ak == 2) {
            n = o2 - this.l;
        }
        else {
            n = this.l - o2;
        }
        if (n < 0) {
            n = Integer.MAX_VALUE;
        }
        return n;
    }

    void b(final int n, final Object o) {
        switch (n) {
            case 1: {
                final byte[] array = (byte[])o;
                array[6] = 1;
                final ProgFour a = ProgFour.a(array);
                String.valueOf(a.a);
                a.i = true;
                a.d();
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])o;
                final int n2 = 6;
                array2[n2] |= 0x1;
                break;
            }
        }
    }

    void d(final boolean b) {
        this.i();
        final Vector vector = ESGame.au[this.j - 1];
        if (vector != null) {
            final Enumeration<byte[]> elements = vector.elements();
            while (elements.hasMoreElements()) {
                this.a(2, elements.nextElement(), b);
            }
        }
        final Hashtable hashtable = ESGame.S[this.j - 1];
        if (hashtable != null) {
            final Enumeration<byte[]> elements2 = hashtable.elements();
            while (elements2.hasMoreElements()) {
                this.a(4, elements2.nextElement(), b);
            }
        }
        final Hashtable hashtable2 = ESGame.G[this.j - 1];
        if (hashtable2 != null) {
            final Enumeration<byte[]> elements3 = hashtable2.elements();
            while (elements3.hasMoreElements()) {
                this.a(1, elements3.nextElement(), b);
            }
        }
        if (this.j == 1 && ProgEleven.d) {
            this.a(5, "W");
        }
    }

    boolean a(final int n, final Object o, final boolean b) {
        final int b2 = this.b(o);
        if (!this.a(n, o)) {
            return false;
        }
        if (n == 4 || b2 == 1) {
            this.b(n, o);
            return true;
        }
        this.b(n, o);
        return true;
    }

    void i() {
        final ProgNine b = this.b();
        for (int i = 0; i < 13; ++i) {
            ProgTen.ad.setElementAt(ProgTen.aj, i);
        }
        if (ProgSix.a((byte)1, b.a(-1, 1, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 0);
        }
        if (ProgSix.a((byte)1, b.a(0, 1, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 1);
        }
        if (ProgSix.a((byte)1, b.a(1, 1, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 2);
        }
        if (ProgSix.a((byte)1, b.a(-2, 2, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 3);
        }
        if (ProgSix.a((byte)1, b.a(-1, 2, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 4);
        }
        if (ProgSix.a((byte)1, b.a(0, 2, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 5);
        }
        if (ProgSix.a((byte)1, b.a(1, 2, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 6);
        }
        if (ProgSix.a((byte)1, b.a(2, 2, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 7);
        }
        if (ProgSix.a((byte)1, b.a(-2, 3, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 8);
        }
        if (ProgSix.a((byte)1, b.a(-1, 3, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 9);
        }
        if (ProgSix.a((byte)1, b.a(0, 3, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 10);
        }
        if (ProgSix.a((byte)1, b.a(1, 3, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 11);
        }
        if (ProgSix.a((byte)1, b.a(2, 3, this.ae))) {
            ProgTen.ad.setElementAt(ProgTen.am, 12);
        }
        if (a(ProgTen.ad.elementAt(0))) {
            ProgTen.ad.setElementAt(ProgTen.o, 4);
            ProgTen.ad.setElementAt(ProgTen.o, 8);
            ProgTen.ad.setElementAt(ProgTen.o, 9);
        }
        if (a(ProgTen.ad.elementAt(1))) {
            for (int j = 0; j < 13; ++j) {
                if (j != 1) {
                    ProgTen.ad.setElementAt(ProgTen.o, j);
                }
            }
        }
        if (a(ProgTen.ad.elementAt(2))) {
            ProgTen.ad.setElementAt(ProgTen.o, 6);
            ProgTen.ad.setElementAt(ProgTen.o, 11);
            ProgTen.ad.setElementAt(ProgTen.o, 12);
        }
        if (a(ProgTen.ad.elementAt(3))) {
            ProgTen.ad.setElementAt(ProgTen.o, 8);
        }
        if (a(ProgTen.ad.elementAt(4))) {
            ProgTen.ad.setElementAt(ProgTen.o, 8);
            ProgTen.ad.setElementAt(ProgTen.o, 9);
        }
        if (a(ProgTen.ad.elementAt(5))) {
            ProgTen.ad.setElementAt(ProgTen.o, 9);
            ProgTen.ad.setElementAt(ProgTen.o, 10);
            ProgTen.ad.setElementAt(ProgTen.o, 11);
            ProgTen.ad.setElementAt(ProgTen.o, 4);
            ProgTen.ad.setElementAt(ProgTen.o, 6);
        }
        if (a(ProgTen.ad.elementAt(6))) {
            ProgTen.ad.setElementAt(ProgTen.o, 11);
            ProgTen.ad.setElementAt(ProgTen.o, 12);
        }
        if (a(ProgTen.ad.elementAt(7))) {
            ProgTen.ad.setElementAt(ProgTen.o, 12);
        }
        if (a(ProgTen.ad.elementAt(9))) {
            ProgTen.ad.setElementAt(ProgTen.o, 8);
        }
        if (a(ProgTen.ad.elementAt(10))) {
            ProgTen.ad.setElementAt(ProgTen.o, 9);
            ProgTen.ad.setElementAt(ProgTen.o, 11);
        }
        if (a(ProgTen.ad.elementAt(11))) {
            ProgTen.ad.setElementAt(ProgTen.o, 12);
        }
    }

    boolean a(final int n, final Object obj) {
        final ProgNine b = this.b();
        byte b2;
        byte b3;
        if (n == 1) {
            final byte[] array = (byte[])obj;
            b2 = array[4];
            b3 = array[5];
        }
        else if (n == 4) {
            final byte[] array2 = (byte[])obj;
            b2 = array2[0];
            b3 = array2[1];
        }
        else if (n == 5) {
            b2 = ProgEleven.j[6];
            b3 = ProgEleven.i[6];
        }
        else {
            final byte[] array3 = (byte[])obj;
            b2 = array3[0];
            b3 = array3[1];
        }
        final int[] a = b.a(this.l, this.k, this.ak, b2, b3);
        boolean b4 = false;
        if (a(a[0], a[1], 3, 2)) {
            b4 = true;
            ProgTen.ad.setElementAt(obj, 1);
        }
        else if (a(a[0], a[1], 2, 1)) {
            if (!a(ProgTen.ad.elementAt(0)) && !a(ProgTen.ad.elementAt(1))) {
                if (!a(ProgTen.ad.elementAt(5))) {
                    b4 = true;
                    ProgTen.ad.setElementAt(obj, 4);
                }
            }
        }
        else if (a(a[0], a[1], 3, 1)) {
            if (!a(ProgTen.ad.elementAt(1))) {
                b4 = true;
                ProgTen.ad.setElementAt(obj, 5);
            }
        }
        else if (a(a[0], a[1], 4, 1)) {
            if (!a(ProgTen.ad.elementAt(1)) && !a(ProgTen.ad.elementAt(2))) {
                if (!a(ProgTen.ad.elementAt(5))) {
                    b4 = true;
                    ProgTen.ad.setElementAt(obj, 6);
                }
            }
        }
        else if (a(a[0], a[1], 1, 0)) {
            if (!a(ProgTen.ad.elementAt(0)) && !a(ProgTen.ad.elementAt(1)) && !a(ProgTen.ad.elementAt(3)) && !a(ProgTen.ad.elementAt(4))) {
                if (!a(ProgTen.ad.elementAt(9))) {
                    b4 = true;
                    ProgTen.ad.setElementAt(obj, 8);
                }
            }
        }
        else if (a(a[0], a[1], 2, 0)) {
            if (!a(ProgTen.ad.elementAt(0)) && !a(ProgTen.ad.elementAt(1)) && !a(ProgTen.ad.elementAt(4)) && !a(ProgTen.ad.elementAt(5))) {
                if (!a(ProgTen.ad.elementAt(10))) {
                    b4 = true;
                    ProgTen.ad.setElementAt(obj, 9);
                }
            }
        }
        else if (a(a[0], a[1], 3, 0)) {
            if (!a(ProgTen.ad.elementAt(1))) {
                if (!a(ProgTen.ad.elementAt(5))) {
                    b4 = true;
                    ProgTen.ad.setElementAt(obj, 10);
                }
            }
        }
        else if (a(a[0], a[1], 4, 0)) {
            if (!a(ProgTen.ad.elementAt(1)) && !a(ProgTen.ad.elementAt(2)) && !a(ProgTen.ad.elementAt(5)) && !a(ProgTen.ad.elementAt(6))) {
                if (!a(ProgTen.ad.elementAt(10))) {
                    b4 = true;
                    ProgTen.ad.setElementAt(obj, 11);
                }
            }
        }
        else if (a(a[0], a[1], 5, 0) && !a(ProgTen.ad.elementAt(1)) && !a(ProgTen.ad.elementAt(2)) && !a(ProgTen.ad.elementAt(6)) && !a(ProgTen.ad.elementAt(7))) {
            if (!a(ProgTen.ad.elementAt(11))) {
                b4 = true;
                ProgTen.ad.setElementAt(obj, 12);
            }
        }
        return b4;
    }

    private static boolean a(final int n, final int n2, final int n3, final int n4) {
        return n == n3 && n2 == n4;
    }

    private static boolean a(final Object o) {
        if (o instanceof Integer) {
            final Integer n = (Integer)o;
            if (n == 1) {
                return true;
            }
            if (n == -1) {
                return true;
            }
        }
        return false;
    }

    void a(final byte[] array) {
        ESGame.u[this.j - 1].c(array);
    }

    static int d(final int n, final int n2) {
        final int a = ProgSix.a(100);
        final int a2 = ProgSix.a(100);
        final boolean b = a <= n2;
        ProgTen.D = (a2 <= n);
        int n3;
        if (ProgTen.D && !b) {
            n3 = 3;
        }
        else if (ProgTen.D && b) {
            if (a2 >= a) {
                n3 = 2;
            }
            else {
                n3 = 1;
            }
        }
        else if (!ProgTen.D && !b) {
            if (a2 >= a) {
                n3 = 2;
            }
            else {
                n3 = 1;
            }
        }
        else {
            n3 = 0;
        }
        return n3;
    }

    int b(final int n, final boolean b) {
        int n2 = this.R[n][0];
        if (b) {
            n2 += this.J[1 + ProgTen.c[n]] / 3;
        }
        if (n == 11 && this.t(3)) {
            n2 += this.R[1][0];
        }
        if (this.U[6] < 7) {
            --n2;
        }
        return n2;
    }

    int z(final int n) {
        return this.R[n][1];
    }

    int f(final boolean b) {
        if (this.T[1] == 0) {
            return 0;
        }
        if (Math.abs(ProgOne.a(1, this.T[1])) == 5) {
            return this.b(5, b);
        }
        return this.b(7, b);
    }

    int I() {
        if (this.T[1] == 0) {
            return 20;
        }
        if (Math.abs(ProgOne.a(1, this.T[1])) == 5) {
            return this.z(5);
        }
        return this.z(7);
    }

    int t() {
        int n = 0;
        int b = this.b(0, false);
        final int b2 = this.b(2, false);
        if (b2 > b) {
            b = b2;
            n = 2;
        }
        final int b3 = this.b(8, false);
        if (b3 > b) {
            b = b3;
            n = 8;
        }
        if (this.b(12, false) > b) {
            n = 12;
        }
        return n;
    }

    int F() {
        if (this.t(6)) {
            return this.t();
        }
        if (this.T[0] == 0) {
            return -1;
        }
        final int abs = Math.abs(ProgOne.a(1, this.T[0]));
        if (abs == 1) {
            return 0;
        }
        if (abs == 2) {
            return 2;
        }
        if (abs == 3) {
            return 8;
        }
        return 12;
    }

    int h(final boolean b) {
        if (this.t(14)) {
            return 5 + this.b(4, false);
        }
        if (this.t(6)) {
            return this.b(this.t(), b);
        }
        int n;
        if (this.T[0] != 0) {
            final int abs = Math.abs(ProgOne.a(1, this.T[0]));
            if (abs == 1) {
                n = this.b(0, b);
            }
            else if (abs == 2) {
                n = this.b(2, b);
            }
            else if (abs == 3) {
                n = this.b(8, b);
            }
            else {
                n = this.b(12, b);
            }
        }
        else {
            n = 0;
        }
        if (this.t(5)) {
            n += this.b(1, false);
        }
        return n;
    }

    int s() {
        if (this.t(6) || this.t(14)) {
            return this.z(this.t());
        }
        if (this.T[0] == 0) {
            return 20;
        }
        final int abs = Math.abs(ProgOne.a(1, this.T[0]));
        if (abs == 1) {
            return this.z(0);
        }
        if (abs == 2) {
            return this.z(2);
        }
        if (abs == 3) {
            return this.z(8);
        }
        return this.z(12);
    }

    int z() {
        int a;
        if (this.t(14)) {
            a = 5 + this.b(4, false);
        }
        else if (this.t(6)) {
            a = 20 + this.b(3, false);
        }
        else if (this.T[0] != 0) {
            a = ProgOne.a(3, this.T[0]);
        }
        else {
            a = 0;
        }
        if (this.t(1)) {
            a += 10 + this.b(1, false);
        }
        if (this.s) {
            a += 25;
        }
        return a;
    }

    int y() {
        if (this.T[1] == 0) {
            return -1;
        }
        if (Math.abs(ProgOne.a(1, this.T[1])) == 5) {
            return 5;
        }
        return 7;
    }

    int v() {
        int n = 0;
        if (this.T[1] != 0) {
            n += 4 * ProgOne.a(3, this.T[1]);
        }
        if (this.T[2] != 0) {
            n += 2 * ProgOne.a(3, this.T[2]);
        }
        if (this.T[3] != 0) {
            n += 2 * ProgOne.a(3, this.T[3]);
        }
        if (this.T[4] != 0) {
            n += ProgOne.a(3, this.T[4]);
        }
        if (this.T[5] != 0) {
            n += ProgOne.a(3, this.T[5]);
        }
        int n2 = n / 10;
        if (this.t(2)) {
            n2 += 10 + this.b(1, false);
        }
        if (this.t(17)) {
            n2 += this.aa;
        }
        if (this.L) {
            n2 += 15;
        }
        return n2;
    }

    int b(final byte[] array) {
        array[2] = 2;
        if (this.k()) {
            final byte b = array[4];
            this.b(b, (array[5] << 8) + array[6], array[7]);
            ESGame.u[this.j - 1].b(array);
            System.out.println("Chest item not possessed before");
            final int i = b - 1;
            System.out.println("item index=" + i);
            if (ProgOne.j[i] == 11) {
                this.W += ProgOne.c[i];
                this.ai.n(ESGame.d(this.W));
            }
            return 1;
        }
        this.a(new byte[] { array[0], array[1], array[4], array[5], array[6], array[7], 1 });
        ESGame.u[this.j - 1].b(array);
        return 0;
    }

    private boolean t(final int n) {
        if (this.G[n - 1] == -1) {
            return true;
        }
        if (this.G[n - 1] == -2) {
            return this.t != 0;
        }
        return this.G[n - 1] > 0;
    }

    void x(final int n) {
        this.G[n - 1] = 0;
    }

    ProgFour n() {
        this.g(1);
        if (this.ab <= 0) {
            return null;
        }
        final ProgFour c = ESGame.u[this.ab - 1].c(this.z, this.w);
        if (c != null) {
            c.c();
        }
        return c;
    }

    byte[] h() {
        this.g(1);
        if (this.ab <= 0) {
            return null;
        }
        final Hashtable hashtable = ESGame.S[this.ab - 1];
        if (hashtable == null) {
            return null;
        }
        final byte[] value = hashtable.get(ProgSix.b(this.z, (int)this.w));
        if (value == null) {
            return null;
        }
        return value;
    }

    int r() {
        this.g(1);
        if (this.ab <= 0) {
            return -1;
        }
        if (this.ab != 1) {
            return -1;
        }
        return ProgEleven.a((int)this.z, (int)this.w);
    }

    int u(final int n) {
        if (n <= 5) {
            return 1;
        }
        if (n <= 10) {
            return 3;
        }
        if (n <= 15) {
            return 4;
        }
        if (n <= 20) {
            return 6;
        }
        return 10;
    }

    void p(final int n) {
        System.out.println("start of castSpell");
        final int u = this.u(n);
        final int b = this.b(u, true);
        final int z = this.z(u);
        final byte g = ProgTwo.c(n).g;
        final byte j = ProgTwo.c(n).j;
        final byte e = ProgTwo.c(n).e;
        final byte f = ProgTwo.c(n).f;
        final int n2 = b - g;
        final int d = d(Math.min(Math.max(z + n2 * 5, 10), 95), Math.min(Math.max(j - n2 * 5, 10), 95));
        byte b2 = 1;
        if (d == 0) {
            final short[] u2 = this.U;
            final int n3 = 4;
            u2[n3] -= (short)(3 * e);
        }
        else if (d == 1) {
            final short[] u3 = this.U;
            final int n4 = 4;
            u3[n4] -= (short)(3 * e / 2);
        }
        else if (d == 2) {
            final short[] u4 = this.U;
            final int n5 = 4;
            u4[n5] -= e;
        }
        else if (d == 3) {
            final short[] u5 = this.U;
            final int n6 = 4;
            u5[n6] -= e;
            b2 = 2;
        }
        this.U[4] = (short)Math.max(this.U[4], 0);
        if (d >= 2) {
            this.a(u, 1);
        }
        switch (n) {
            case 1:
            case 2:
            case 3:
            case 5: {
                this.G[n - 1] = (byte)(f * b2);
                break;
            }
            case 6: {
                if (this.c(109, 0) && this.a(true)) {
                    this.G[n - 1] = (byte)(f * b2);
                    break;
                }
                break;
            }
            case 23: {
                this.G[n - 1] = -2;
                break;
            }
            case 21: {
                final int n7 = 6 + this.b(10, false);
                final short[] u6 = this.U;
                final int n8 = 2;
                u6[n8] += (short)(b2 * n7);
                this.U[2] = (short)Math.min(this.U[2], this.U[3]);
                break;
            }
            case 24: {
                this.G[n - 1] = -4;
                break;
            }
            case 25: {
                for (byte b3 = 1; b3 <= b2; ++b3) {
                    this.H();
                }
                break;
            }
        }
        final short[] u7 = this.U;
        final int n9 = 6;
        u7[n9] -= (short)(5 * this.c());
        this.U[6] = (short)Math.max(this.U[6], 0);
        if (this.k(6)) {
            int n10 = 2 * this.U[3] / 100;
            if (n10 < 1) {
                n10 = 1;
            }
            final short[] u8 = this.U;
            final int n11 = 2;
            u8[n11] -= (short)n10;
        }
    }

    void b(final int n, final ProgFour ProgFour) {
        final int u = this.u(n);
        final int b = this.b(u, true);
        final int z = this.z(u);
        final int c = ProgFour.c(10);
        final int c2 = ProgFour.c(9);
        final byte e = ProgTwo.c(n).e;
        final byte f = ProgTwo.c(n).f;
        final int min = Math.min(b - c, ProgFour.c(2));
        final int d2 = d(Math.min(Math.max(z + min * 5, 10), 95), Math.min(Math.max(c2 - min * 5, 10), 95));
        int n2 = 1;
        if (d2 == 0) {
            final short[] u2 = this.U;
            final int n3 = 4;
            u2[n3] -= (short)(3 * e);
        }
        else if (d2 == 1) {
            final short[] u3 = this.U;
            final int n4 = 4;
            u3[n4] -= (short)(3 * e / 2);
        }
        else if (d2 == 2) {
            final short[] u4 = this.U;
            final int n5 = 4;
            u4[n5] -= e;
        }
        else if (d2 == 3) {
            final short[] u5 = this.U;
            final int n6 = 4;
            u5[n6] -= e;
            n2 = 2;
        }
        this.U[4] = (short)Math.max(this.U[4], 0);
        if (d2 >= 2) {
            this.a(u, 1);
        }
        switch (n) {
            case 4: {
                ProgFour.c[9] = -2;
                ProgFour.d();
                break;
            }
            case 7: {
                ProgFour.c[1] = (byte)(10 + this.b(3, false));
                break;
            }
            case 8: {
                final int b2 = this.b(3, false);
                ProgFour.b(12 + 2 * b2);
                final short[] u6 = this.U;
                final int n7 = 6;
                u6[n7] += (short)b2;
                this.U[6] = (short)Math.min(this.U[6], this.U[7]);
                final short[] u7 = this.U;
                final int n8 = 2;
                u7[n8] += (short)b2;
                this.U[2] = (short)Math.min(this.U[2], this.U[3]);
                final short[] u8 = this.U;
                final int n9 = 4;
                u8[n9] += 12;
                this.U[4] = (short)Math.min(this.U[4], this.U[5]);
                break;
            }
            case 9: {
                if (ProgFour.e()) {
                    ProgFour.b(Math.max(60 * n2 - ProgFour.c(8), 4) * ProgFour.c(14) / 100);
                    break;
                }
                break;
            }
            case 10: {
                this.G[n - 1] = -2;
                ProgFour.c[8] = (byte)(2 * n2);
                break;
            }
            case 11: {
                ProgFour.b(Math.max((25 + this.b(4, false)) * n2 - ProgFour.c(8), 4) * ProgFour.c(14) / 100);
                ProgFour.d();
                break;
            }
            case 12: {
                this.G[n - 1] = -2;
                ProgFour.c[4] = (byte)Math.min(n2 * (10 + this.b(4, false)), 255);
                ProgFour.d();
                break;
            }
            case 13: {
                this.G[n - 1] = -2;
                ProgFour.c[5] = (byte)Math.min(n2 * (10 + this.b(4, false)), 255);
                ProgFour.d();
                break;
            }
            case 14: {
                this.G[n - 1] = -1;
                this.a(ProgFour);
                this.G[n - 1] = 0;
                break;
            }
            case 15: {
                this.G[n - 1] = -2;
                ProgFour.c[2] = 1;
                ProgFour.d();
                break;
            }
            case 16: {
                final int n10 = 10 - c;
                if (n10 > 0) {
                    this.G[n - 1] = (byte)(n2 * n10);
                    ProgFour.c[6] = 1;
                    break;
                }
                break;
            }
            case 17: {
                this.G[n - 1] = -2;
                this.aa = (short)(10 + this.b(6, false));
                break;
            }
            case 18: {
                this.G[n - 1] = -2;
                ProgFour.c[0] = (byte)(3 * n2);
                break;
            }
            case 19: {
                this.G[n - 1] = -2;
                ProgFour.c[3] = (byte)Math.min(Math.max(n2 * (60 - 5 * c), 0), 100);
                break;
            }
            case 20: {
                ProgFour.b(Math.max((80 - 5 * c) * n2 - ProgFour.c(8), 4) * ProgFour.c(14) / 100);
                break;
            }
        }
        final short[] u9 = this.U;
        final int n11 = 6;
        u9[n11] -= (short)(5 * this.c());
        this.U[6] = (short)Math.max(this.U[6], 0);
        if (this.k(6)) {
            int n12 = 2 * this.U[3] / 100;
            if (n12 < 1) {
                n12 = 1;
            }
            final short[] u10 = this.U;
            final int n13 = 2;
            u10[n13] -= (short)n12;
        }
    }

    void a(final int n, final int n2) {
        if (n >= 0) {
            final short[] array = this.R[n];
            final int n3 = 2;
            array[n3] += (short)n2;
        }
    }

    boolean c(final byte[] array) {
        return this.b(array[2], (array[3] << 8) + array[4], array[5]);
    }

    boolean c(final int n, final int n2) {
        return this.b(n, n2, 0);
    }

    boolean b(final int n, final int n2, final int n3) {
        if (this.p < 24) {
            this.H[this.p] = (byte)n;
            this.P[this.p] = (n2 << 16) + (byte)n3;
            ++this.p;
            return true;
        }
        return false;
    }

    boolean y(final int n) {
        if (n < this.p) {
            this.A(n);
            this.H[n] = 0;
            for (int i = n; i < this.p - 1; ++i) {
                this.H[i] = this.H[i + 1];
                this.P[i] = this.P[i + 1];
            }
            --this.p;
            return true;
        }
        return false;
    }

    void i(final int n) {
        final int abs = Math.abs(this.H[n]);
        if (abs != 109) {
            final byte[] array = { this.l, this.k, (byte)abs, 0, 0, (byte)(this.P[n] & 0xFF), 0 };
            final int n2 = this.P[n] >>> 16 & 0xFFFF;
            array[3] = (byte)(n2 >> 8 & 0xFF);
            array[4] = (byte)(n2 & 0xFF);
            array[6] = 3;
            this.b().c(array);
            this.y(n);
        }
        else {
            this.y(n);
        }
    }

    boolean C(final int n) {
        final byte a = this.H[n];
        return ProgOne.c(Math.abs(a)) && a < 0;
    }

    boolean d(final int n, final boolean b) {
        final byte b2 = this.H[n];
        if (b2 < 0) {
            return false;
        }
        if (!ProgOne.c(b2)) {
            return false;
        }
        final int a = ProgOne.a(b2);
        if (this.T[a] != 0) {
            if (!b) {
                return false;
            }
            this.f(a);
        }
        this.T[a] = b2;
        this.H[n] = (byte)(-Math.abs(this.H[n]));
        return true;
    }

    private void f(final int n) {
        for (byte b = 0; b < this.p; ++b) {
            if (ProgOne.a((byte)Math.abs(this.H[b])) == n) {
                this.A(b);
            }
        }
    }

    boolean a(final boolean b) {
        return this.d(this.p - 1, b);
    }

    void A(final int n) {
        if (!this.C(n)) {
            return;
        }
        if (n < 0 || n > 23) {
            return;
        }
        final byte b = (byte)Math.abs(this.H[n]);
        this.H[n] = b;
        for (int i = 0; i < 7; ++i) {
            if (this.T[i] == b) {
                this.T[i] = 0;
                break;
            }
        }
    }

    boolean h(final int n) {
        if (ProgOne.b((byte)Math.abs(this.H[n]))) {
            final byte b = (byte)(this.P[n] & 0xFF);
            final int n2 = 3;
            final int[] p = this.P;
            p[n] &= 0xFFFFFF00;
            final int[] p2 = this.P;
            p2[n] |= n2;
            return true;
        }
        return false;
    }

    boolean j(final int n) {
        final byte b = (byte)Math.abs(this.H[n]);
        return (byte)(this.P[n] & 0xFF) == 3;
    }

    int D(final int n) {
        return ProgOne.c[(byte)Math.abs(this.H[n]) - 1];
    }

    int o(final int a) {
        int n = -1;
        final int n2 = -Math.abs(a);
        for (byte b = 0; b < this.p; ++b) {
            if (n2 == this.H[b]) {
                n = b;
                break;
            }
        }
        return n;
    }

    boolean k() {
        return this.p < 24;
    }

    String b(final int n) {
        final int abs = Math.abs(this.H[n]);
        final byte b = ProgOne.j[abs - 1];
        String str = null;
        switch (b) {
            case 1:
            case 2:
            case 3:
            case 4: {
                str = ProgOne.b[abs - 1] + '\n' + ProgOne.g[b - 1] + "\nWeapon value: " + (ProgOne.m[abs - 1] + (this.P[n] & 0xFF));
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                str = ProgOne.b[abs - 1] + '\n' + ProgOne.g[b - 1] + "\nArmor value: " + (ProgOne.m[abs - 1] + (this.P[n] & 0xFF));
                break;
            }
            case 11: {
                str = ProgOne.b[abs - 1] + '\n' + ProgOne.g[b - 1];
                break;
            }
            case 12: {
                str = ProgOne.b[abs - 1] + '\n' + "Spell: " + ProgTwo.b[(this.P[n] & 0xFF) - 1].c;
                break;
            }
            case 13: {
                final String[] array = ProgOne.l[abs - 87];
                str = ProgOne.b[abs - 1] + '\n' + ProgOne.g[b - 1] + '\n' + array[0];
                if (array[1].length() > 0) {
                    str = str + '\n' + array[1];
                    break;
                }
                break;
            }
            case 17: {
                str = ProgOne.b[abs - 1] + '\n' + ProgOne.g[b - 1] + "\nWeapon value: " + (20 + this.b(3, false));
                break;
            }
            default: {
                str = ProgOne.b[abs - 1] + '\n' + ProgOne.g[b - 1];
                break;
            }
        }
        return str;
    }

    boolean r(final int n) {
        final byte b = ProgOne.j[Math.abs(this.H[n]) - 1];
        this.x = ProgSix.a((this.P[n] & 0xFF) - 1, this.x);
        this.y(n);
        return true;
    }

    void a(final int n) {
        this.a(n, ProgFive.j);
    }

    boolean w(final int n) {
        switch (ProgOne.j[Math.abs(this.H[n]) - 1]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 17: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    boolean v(final int n) {
        switch (ProgOne.j[Math.abs(this.H[n]) - 1]) {
            case 13:
            case 15: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    boolean e(final int n) {
        switch (ProgOne.j[Math.abs(this.H[n]) - 1]) {
            case 12: {
                return this.R[ProgTwo.b[(this.P[n] & 0xFF) - 1].h][0] > 0;
            }
            default: {
                return false;
            }
        }
    }

    int n(final int n) {
        int n2 = this.U[n];
        if (this.t(23)) {
            if (n == 2) {
                n2 += this.b(10, false);
                if (n2 > this.U[3]) {
                    n2 = this.U[3];
                }
            }
            else if (n == 6) {
                n2 += this.b(10, false);
                if (n2 > this.U[7]) {
                    n2 = this.U[7];
                }
            }
            else if (n == 4) {
                n2 += this.b(10, false);
                if (n2 > this.U[5]) {
                    n2 = this.U[5];
                }
            }
        }
        return n2;
    }

    boolean x() {
        return this.C > 0;
    }

    void D() {
        this.C = this.j;
        this.ao = this.l;
        this.an = this.k;
        this.Z = this.ak;
        this.c(true);
        this.w();
        this.Q = true;
    }

    void e() {
        final byte c = this.C;
        this.ab = c;
        this.j = c;
        final byte ao = this.ao;
        this.z = ao;
        this.l = ao;
        final byte an = this.an;
        this.w = an;
        this.k = an;
        this.w();
        this.Q = true;
    }

    int E() {
        int n = 0;
        for (int i = 0; i < 8; ++i) {
            if ((this.A >> i & 0x1) != 0x0) {
                ++n;
            }
        }
        return n;
    }

    void H() {
        final int e = this.E();
        if (e > 0) {
            int a;
            if (e == 1) {
                a = 1;
            }
            else {
                a = ProgSix.a(e);
            }
            int n = 0;
            for (int i = 0; i < 8; ++i) {
                if ((this.A >> i & 0x1) == 0x1 && ++n == a) {
                    this.A = (byte)ProgSix.c(i, this.A);
                    break;
                }
            }
        }
    }

    int c() {
        if ((this.A & 0x1) == 0x1) {
            return 3;
        }
        return 1;
    }

    ProgNine b() {
        return ESGame.u[this.j - 1];
    }

    void w() {
        this.b().b(this.l, this.k, this.ak, this.ae);
    }

    String j() {
        final StringBuffer sb = new StringBuffer(450);
        final String str = ": ";
        sb.append(this.v);
        sb.append('\n');
        sb.append(ProgTen.K[this.ar]);
        sb.append('\n');
        sb.append("Level ");
        sb.append(this.U[0]);
        sb.append(" (");
        sb.append(this.U[1]);
        sb.append("/10)");
        sb.append('\n');
        sb.append("Health: ");
        sb.append(this.n(2));
        sb.append('/');
        sb.append(this.U[3]);
        sb.append('\n');
        sb.append("Magic: ");
        sb.append(this.n(4));
        sb.append('/');
        sb.append(this.U[5]);
        sb.append('\n');
        sb.append("Fatigue: ");
        sb.append(this.n(6));
        sb.append('/');
        sb.append(this.U[7]);
        sb.append('\n');
        sb.append('\n');
        sb.append("Status ailments: ");
        int n = 0;
        for (int i = 1; i <= 8; ++i) {
            if (this.k(i)) {
                sb.append('\n');
                sb.append(ProgTen.af[i - 1]);
                ++n;
            }
        }
        if (n == 0) {
            sb.append('\n');
            sb.append("None");
        }
        sb.append('\n');
        sb.append('\n');
        sb.append("Gift points found: ");
        sb.append(this.W);
        sb.append('\n');
        sb.append('\n');
        sb.append("Attributes:");
        sb.append('\n');
        for (int j = 0; j < 8; ++j) {
            final int n2 = 2 * j;
            sb.append(ProgTen.y[n2]);
            sb.append(str);
            sb.append(this.J[n2]);
            sb.append('\n');
        }
        final String string = sb.toString();
        System.out.println("Length of stats string is " + string.length());
        return string;
    }

    static Vector G() {
        final Vector<Object> vector = new Vector<Object>();
        for (int i = 0; i < 13; ++i) {
            vector.addElement(new Object());
        }
        return vector;
    }

    static String d(final byte[] array) {
        return "X = " + array[0] + '\n' + "Y = " + array[1] + '\n' + "Type = " + array[2] + '\n' + "ID(MSB) = " + array[3] + '\n' + "ID(LSB) = " + array[4] + '\n' + "value = " + array[5] + '\n' + "flags = " + array[6] + '\n';
    }

    Vector f() {
        final Vector<String> vector = new Vector<String>();
        for (int i = 0; i < 14; ++i) {
            if (this.R[i][0] > 0) {
                vector.addElement(ProgTen.E[i] + ": " + this.R[i][0]);
            }
        }
        return vector;
    }

    int l(final int n) {
        int n2 = 0;
        for (int i = 0; i < 14; ++i) {
            if (this.R[i][0] > 0) {
                if (n2 == n) {
                    return i;
                }
                ++n2;
            }
        }
        return -1;
    }

    String m(final int n) {
        return ProgTen.E[n] + '\n' + "Rank: " + this.R[n][0] + '\n' + "Exp: " + this.R[n][2] + "/10";
    }

    Vector J() {
        final Vector<String> vector = new Vector<String>();
        for (int i = 0; i < ProgTwo.i; ++i) {
            if ((this.x & 1 << i) != 0x0) {
                final int n = i + 1;
                String s = ProgTwo.b[i].c;
                if (n == this.b) {
                    s = "R: " + s;
                }
                vector.addElement(s);
            }
        }
        return vector;
    }

    int B(final int n) {
        int n2 = 0;
        for (int i = 0; i < ProgTwo.i; ++i) {
            if ((this.x & 1 << i) != 0x0) {
                if (n2 == n) {
                    return i;
                }
                ++n2;
            }
        }
        return -1;
    }

    int l() {
        if (ProgTwo.a(this.b)) {
            final int n = this.b - 1;
            int i = n + 1;
            if (i == ProgTwo.i) {
                i = 0;
            }
            while (i != n) {
                if ((this.x & 1 << i) != 0x0) {
                    return i + 1;
                }
                if (++i != ProgTwo.i) {
                    continue;
                }
                i = 0;
            }
            return this.b;
        }
        final int b = this.B(0);
        if (b < 0) {
            return 0;
        }
        return b + 1;
    }

    String s(final int n) {
        return ProgTwo.b[n].c + '\n' + ProgTen.E[ProgTwo.b[n].h] + '\n' + "Cost: " + ProgTwo.b[n].e + '\n' + ProgTwo.b[n].a;
    }

    void e(final boolean b) {
        short n = (short)(this.U[3] - this.U[2]);
        short n2 = (short)(this.U[5] - this.U[4]);
        short n3 = (short)(this.U[7] - this.U[6]);
        if (!b) {
            n = (short)(2 * n / 3);
            n2 = (short)(2 * n2 / 3);
            n3 = (short)(2 * n3 / 3);
        }
        if (this.k(8)) {
            n = (short)(3 * n / 4);
            n2 = (short)(3 * n2 / 4);
            n3 = (short)(3 * n3 / 4);
        }
        final short[] u = this.U;
        final int n4 = 2;
        u[n4] += n;
        final short[] u2 = this.U;
        final int n5 = 4;
        u2[n5] += n2;
        final short[] u3 = this.U;
        final int n6 = 6;
        u3[n6] += n3;
        this.s = false;
        this.L = false;
        this.I = false;
        if (ProgSix.a(100) <= 10) {
            for (byte b2 = 0; b2 < this.p; ++b2) {
                if (Math.abs(this.H[b2]) == 96) {
                    this.y(b2);
                    break;
                }
            }
        }
        for (int i = 0; i < 8; ++i) {
            final int n7 = i + 1;
            if (n7 != 4) {
                if (n7 != 5) {
                    if (ProgSix.a(100) <= 25) {
                        this.A = (byte)ProgSix.c(i, this.A);
                    }
                }
            }
        }
    }

    boolean k(final int n) {
        return (this.A & 1 << n - 1) != 0x0;
    }

    void a(final int n, final ProgFour ProgFour) {
        final int abs = Math.abs(this.H[n]);
        final byte b = ProgOne.j[abs - 1];
        if (b == 13 || b == 15) {
            boolean b2 = true;
            switch (abs) {
                case 87: {
                    if (this.j == 1 && this.x()) {
                        this.e();
                        break;
                    }
                    this.D();
                    break;
                }
                case 88: {
                    this.H();
                    break;
                }
                case 89: {
                    this.U[2] = this.U[3];
                    break;
                }
                case 90: {
                    this.U[4] = this.U[5];
                    break;
                }
                case 91: {
                    final short[] u = this.U;
                    final int n2 = 6;
                    u[n2] += (short)(3 * this.U[5]);
                    break;
                }
                case 92: {
                    final short[] u2 = this.U;
                    final int n3 = 1;
                    ++u2[n3];
                    break;
                }
                case 93: {
                    this.U[2] = this.U[3];
                    this.U[4] = this.U[5];
                    break;
                }
                case 94: {
                    this.s = true;
                    break;
                }
                case 95: {
                    this.L = true;
                    break;
                }
                case 96: {
                    this.I = true;
                    b2 = false;
                    break;
                }
                case 97: {
                    if (ProgFour == null) {
                        break;
                    }
                    final int c = ProgFour.c(4);
                    final int c2 = ProgFour.c(10);
                    if (c <= 13 && c2 <= 13) {
                        ProgFour.g = 0;
                        ProgFour.d();
                        break;
                    }
                    break;
                }
                case 98: {
                    if (ProgFour == null) {
                        break;
                    }
                    final int c3 = ProgFour.c(4);
                    final int c4 = ProgFour.c(10);
                    if (c3 <= 22 && c4 <= 22) {
                        ProgFour.g = 0;
                        ProgFour.d();
                        break;
                    }
                    break;
                }
                case 99: {
                    if (ProgFour == null) {
                        break;
                    }
                    final int c5 = ProgFour.c(4);
                    final int c6 = ProgFour.c(10);
                    if (c5 <= 29 && c6 <= 29) {
                        ProgFour.g = 0;
                        ProgFour.d();
                        break;
                    }
                    break;
                }
            }
            if (b2) {
                this.y(n);
            }
        }
    }

    boolean o() {
        for (int i = 0; i < 14; ++i) {
            if (this.R[i][2] >= 10) {
                final short[] array = this.R[i];
                final int n = 2;
                array[n] -= 10;
                final short[] array2 = this.R[i];
                final int n2 = 0;
                ++array2[n2];
                this.N |= (byte)(1 << ProgTen.c[i] / 2);
                final short[] u = this.U;
                final int n3 = 1;
                ++u[n3];
            }
        }
        if (this.U[1] >= 10) {
            final short[] u2 = this.U;
            final int n4 = 0;
            ++u2[n4];
            return true;
        }
        return false;
    }

    void d() {
        ProgEleven.d();
        final short[] u = this.U;
        final int n = 1;
        u[n] -= 10;
    }

    String[] q() {
        final Vector vector = new Vector<String>();
        for (int i = 0; i < 8; ++i) {
            if ((this.N & 1 << i) != 0x0) {
                vector.addElement(ProgTen.y[i * 2]);
            }
        }
        final int size = vector.size();
        if (size == 0) {
            return null;
        }
        final String[] array = new String[size];
        for (int j = 0; j < size; ++j) {
            array[j] = vector.elementAt(j);
        }
        return array;
    }

    private void C() {
        final short a = ProgOne.a();
        final int[] array = ProgTen.ac[this.ar];
        for (int i = 0; i < array.length; ++i) {
            this.c(array[i], a);
            this.d(this.p - 1, true);
        }
    }

    void a(final long n) {
        final int n2 = (int)(n * (this.J[10] + this.J[11]) / 2000L);
        final short[] u = this.U;
        final int n3 = 6;
        u[n3] += (short)n2;
        if (this.U[6] > this.U[7]) {
            this.U[6] = this.U[7];
        }
    }

    private boolean a(final int n, final int n2, final int n3) {
        return n == 1 && n2 >= 6 && n2 <= 12 && n3 >= 6 && n3 <= 12;
    }

    private void p() {
        this.D();
        if (this.Q) {
            this.Q = false;
        }
    }

    int b(final int n, final int n2) {
        int b = this.b(13, true);
        if (n2 == 3) {
            b += 3;
        }
        final int n3 = b - ProgEleven.r[n];
        return d(Math.min(Math.max(20 + this.J[12] / 2 + n3 * 5, 10), 95), Math.min(Math.max(20 - n3 * 5, 10), 95));
    }

    private void B() {
        --this.ak;
        if (this.ak <= 0) {
            this.ak = 4;
        }
    }

    private void a() {
        ++this.ak;
        if (this.ak >= 5) {
            this.ak = 1;
        }
    }

    String K() {
        final byte ak = this.ak;
        final StringBuffer sb = new StringBuffer(1000);
        System.out.println("here 1");
        final String[] a = this.b().a();
        sb.append("Current dungeon is " + a[0] + " " + a[1] + "\n");
        for (int i = 1; i <= 4; ++i) {
            if (i <= 2) {
                this.g(i);
            }
            else if (i == 3) {
                this.a();
                this.g(1);
            }
            else if (i == 4) {
                this.B();
                this.g(1);
            }
            System.out.println("here 2, i =" + i);
            if (i == 1) {
                sb.append("FORWARD SQUARE: \n");
            }
            else if (i == 2) {
                sb.append("BACKWARD SQUARE: \n");
            }
            else if (i == 3) {
                sb.append("RIGHT SIDE SQUARE: \n");
            }
            else if (i == 4) {
                sb.append("LEFT SIDE SQUARE: \n");
            }
            sb.append("x,y = " + this.z + ", " + this.w + "\n");
            System.out.println("New a and y are " + this.z + ", " + this.w);
            sb.append("map value = " + this.b().w[this.z][this.w] + "\n");
            System.out.println("New dungeon id is " + this.ab);
            final Hashtable hashtable = ESGame.G[this.ab - 1];
            if (hashtable != null) {
                final Enumeration<byte[]> elements = hashtable.elements();
                while (elements.hasMoreElements()) {
                    final byte[] array = elements.nextElement();
                    System.out.println("Found a monster");
                    if (array[4] == this.z && array[5] == this.w) {
                        sb.append("Found monster in square \n");
                        sb.append("type=" + array[2] + ", health=" + array[3] + ", dungeon id = " + array[7] + "\n");
                    }
                }
            }
            System.out.println("here 3, i =" + i);
            final Hashtable hashtable2 = ESGame.S[this.ab - 1];
            if (hashtable2 != null) {
                final Enumeration<byte[]> elements2 = hashtable2.elements();
                while (elements2.hasMoreElements()) {
                    final byte[] array2 = elements2.nextElement();
                    if (array2[0] == this.z && array2[1] == this.w) {
                        sb.append("Found chest in square \n");
                        sb.append("item type=" + array2[4] + ", value=" + array2[7] + "\n");
                    }
                }
            }
            System.out.println("here 4, ProgNine =" + i);
            final Enumeration<byte[]> elements3 = (Enumeration<byte[]>)ESGame.au[this.ab - 1].elements();
            while (elements3.hasMoreElements()) {
                final byte[] array3 = elements3.nextElement();
                if (array3[0] == this.z && array3[1] == this.w) {
                    sb.append("Found dropped item in square \n");
                    sb.append("item type=" + array3[2] + ", value=" + array3[5] + " flags = " + array3[6] + "\n");
                }
            }
            this.ak = ak;
        }
        if (ProgEleven.d) {
            sb.append("Warden IS visiting now\n");
        }
        else {
            sb.append("Warden IS NOT visiting now\n");
        }
        sb.append("Player inventory: nitems=" + this.p);
        return sb.toString();
    }

    static {
        ProgTen.g = false;
        ProgTen.ad = G();
        aj = 0;
        am = 1;
        o = -1;
        ProgTen.S = false;
        ProgTen.ac = new int[][] { { 1, 27 }, { 7, 27 }, { 7, 22 }, { 17, 27 }, { 12, 22 }, { 17, 27 }, { 12, 22 } };
        af = new String[] { "Stone Blood", "Delusions", "Blind", "Vampirism", "Mana Burn", "Grievous Harm", "Terrified", "Haunted" };
        ProgTen.ag = -1;
        ProgTen.X = null;
    }
}