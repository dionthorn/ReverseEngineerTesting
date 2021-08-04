import java.util.Random;
import java.io.DataOutputStream;
import java.io.DataInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class ProgFour
{
    private static int d;
    private static String[] h;
    private static byte[][] e;
    short a;
    byte l;
    byte g;
    byte o;
    byte m;
    boolean i;
    byte n;
    byte[] c;
    byte b;
    byte f;
    long k;
    static ProgFour p;
    static short j;

    static short b() {
        return (short)(++ProgFour.j);
    }

    byte[] f() {
        final byte[] array = { (byte)(this.a >>> 8 & 0xFF), (byte)(this.a & 0xFF), this.l, this.g, this.o, this.m, (byte)(this.i ? 1 : 0), this.n, this.b, this.f, (byte)(this.k >>> 56 & 0xFFL), (byte)(this.k >>> 48 & 0xFFL), (byte)(this.k >>> 40 & 0xFFL), (byte)(this.k >>> 32 & 0xFFL), (byte)(this.k >>> 24 & 0xFFL), (byte)(this.k >>> 16 & 0xFFL), (byte)(this.k >>> 8 & 0xFFL), (byte)(this.k & 0xFFL), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < 10; ++i) {
            array[18 + i] = this.c[i];
        }
        return array;
    }

    public ProgFour() {
        this.c = new byte[10];
        this.i = false;
    }

    public ProgFour(final int n, final int n2, final int n3) {
        this.a = (short)n;
        this.l = (byte)n2;
        this.g = ProgFour.e[this.l - 1][14];
        this.c = new byte[10];
        this.i = false;
        this.n = (byte)n3;
        this.f = 0;
    }

    static ProgFour a(final byte[] array) {
        ProgFour.p.a = (short)((short)(array[0] & 0xFF) << 8 | (short)(array[1] & 0xFF));
        ProgFour.p.l = array[2];
        ProgFour.p.g = array[3];
        ProgFour.p.o = array[4];
        ProgFour.p.m = array[5];
        ProgFour.p.i = (array[6] != 0);
        ProgFour.p.n = array[7];
        ProgFour.p.b = array[8];
        ProgFour.p.f = array[9];
        ProgFour.p.k = ProgSix.a(array, 10);
        for (int i = 0; i < 10; ++i) {
            ProgFour.p.c[i] = array[18 + i];
        }
        return ProgFour.p;
    }

    static ProgFour a(final ProgFour ProgFour, final byte[] array) {
        ProgFour.a = (short)((short)(array[0] & 0xFF) << 8 | (short)(array[1] & 0xFF));
        ProgFour.l = array[2];
        ProgFour.g = array[3];
        ProgFour.o = array[4];
        ProgFour.m = array[5];
        ProgFour.i = (array[6] != 0);
        ProgFour.n = array[7];
        ProgFour.b = array[8];
        ProgFour.f = array[9];
        ProgFour.k = ProgSix.a(array, 10);
        for (int i = 0; i < 10; ++i) {
            ProgFour.c[i] = array[18 + i];
        }
        return ProgFour;
    }

    void d() {
        ESGame.G[this.n - 1].put(String.valueOf(this.a), this.f());
    }

    String a() {
        return ProgFour.h[this.l - 1];
    }

    int c(final int n) {
        return ProgFour.e[this.l - 1][n] & 0xFF;
    }

    boolean e() {
        return this.l >= 6 && this.l <= 8;
    }

    void b(int n) {
        final int n2 = this.g & 0xFF;
        if (n > n2) {
            n = n2;
        }
        this.g = (byte)(n2 - n);
    }

    boolean a(final int n) {
        byte b = 1;
        final byte o = this.o;
        final byte m = this.m;
        final ProgNine ProgNine = ESGame.u[this.n - 1];
        byte o2 = 0;
        byte j = 0;
        switch (n) {
            case 1: {
                b = -1;
            }
            case 3: {
                o2 = this.o;
                j = (byte)(this.m + b);
                break;
            }
            case 4: {
                b = -1;
            }
            case 2: {
                j = this.m;
                o2 = (byte)(this.o + b);
                break;
            }
            default: {
                return false;
            }
        }
        if (o2 < 0 || j < 0) {
            return false;
        }
        if (o2 >= ProgNine.g || j >= ProgNine.y) {
            return false;
        }
        if (this.a(o2, j)) {
            return false;
        }
        if (!ProgNine.d((int)o2, (int)j)) {
            return false;
        }
        ProgNine.w[this.o][this.m] = ProgSix.c((byte)2, ProgNine.w[this.o][this.m]);
        ProgNine.w[o2][j] = ProgSix.b((byte)2, ProgNine.w[o2][j]);
        this.o = o2;
        this.m = j;
        return true;
    }

    void a(final ProgTen ProgTen) {
        if (this.d(ProgTen)) {
            if (this.b == 0) {
                this.e(ProgTen);
                ++this.b;
            }
            else if (this.b >= 4) {
                this.b = 0;
            }
            else {
                ++this.b;
            }
        }
    }

    private void e(final ProgTen ProgTen) {
        final int abs = Math.abs(ProgTen.l - this.o);
        final int abs2 = Math.abs(ProgTen.k - this.m);
        int n;
        if (this.o < ProgTen.l) {
            n = 2;
        }
        else if (this.o > ProgTen.l) {
            n = 4;
        }
        else {
            n = -1;
        }
        int n2;
        if (this.m < ProgTen.k) {
            n2 = 3;
        }
        else if (this.m > ProgTen.k) {
            n2 = 1;
        }
        else {
            n2 = -1;
        }
        int n3;
        int n4;
        if (abs > abs2) {
            n3 = n;
            n4 = n2;
        }
        else if (abs < abs2) {
            n3 = n2;
            n4 = n;
        }
        else if (ESGame.h(2) == 0) {
            n3 = n;
            n4 = n2;
        }
        else {
            n3 = n2;
            n4 = n;
        }
        if (this.a(n3)) {
            return;
        }
        if (this.a(n4)) {
            return;
        }
    }

    private boolean a(final int n, final int n2) {
        final ProgNine ProgNine = ESGame.u[this.n - 1];
        if (ProgNine.s == 1 || ProgNine.v == 1) {
            if (n == 17 && n2 == 5) {
                return true;
            }
        }
        else if (ProgNine.s == 3 || ProgNine.v == 3) {
            if (n == 17 && n2 == 30) {
                return true;
            }
        }
        else if (ProgNine.s == 4 || ProgNine.v == 4) {
            if (n == 5 && n2 == 17) {
                return true;
            }
        }
        else if ((ProgNine.s == 2 || ProgNine.v == 2) && n == 30 && n2 == 17) {
            return true;
        }
        return false;
    }

    boolean d(final ProgTen ProgTen) {
        return this.c(ProgTen) <= 3;
    }

    int c(final ProgTen ProgTen) {
        return Math.abs(ProgTen.l - this.o) + Math.abs(ProgTen.k - this.m);
    }

    boolean b(final ProgTen ProgTen) {
        if (this.c(ProgTen) == 1) {
            return true;
        }
        this.f = 0;
        return false;
    }

    void a(final ProgTen ProgTen, final long k) {
        this.f = 2;
        this.k = k;
        final int min = Math.min(ProgTen.f(true) - ProgFour.e[this.l - 1][4], ProgFour.e[this.l - 1][2]);
        final int a = ProgFour.e[this.l - 1][3] - min * 5;
        final int a2 = ProgTen.I() + min * 5;
        final int min2 = Math.min(Math.max(a, 10), 95);
        final int min3 = Math.min(Math.max(a2, 10), 95);
        final int a3 = ProgSix.a(100);
        final int a4 = ProgSix.a(100);
        final boolean b = a3 <= min2;
        final boolean b2 = a4 <= min3;
        int n;
        if (b && !b2) {
            n = 3;
        }
        else if (b && b2) {
            if (a3 >= a4) {
                n = 2;
            }
            else {
                n = 1;
            }
        }
        else if (!b && !b2) {
            if (a3 >= a4) {
                n = 2;
            }
            else {
                n = 1;
            }
        }
        else {
            n = 0;
        }
        if (n == 0) {
            this.f = 1;
            return;
        }
        final byte b3 = ProgFour.e[this.l - 1][5];
        int v = ProgTen.v();
        if (n == 1) {
            v *= 2;
        }
        final int n2 = Math.max(b3 - v, 4) * ProgTen.U[3] / 100;
        final short[] u = ProgTen.U;
        final int n3 = 2;
        u[n3] -= (short)n2;
        ProgTen.U[2] = (short)Math.max(ProgTen.U[2], 0);
        if (b2) {
            ProgTen.a(ProgTen.y(), 1);
        }
        if (n < 3) {
            this.f = 1;
            return;
        }
        if (ProgSix.a(100) <= 30) {
            final byte b4 = ProgFour.e[this.l - 1][11];
            if (b4 > 0) {
                ProgTen.A |= (byte)(1 << b4 - 1);
                if (b4 != 1) {
                    if (b4 == 2) {
                        ESGame.u[this.n - 1].c(3);
                    }
                    else if (b4 != 3) {
                        if (b4 == 4) {
                            ProgTen.ah = 30000;
                        }
                        else if (b4 == 5) {
                            ProgTen.F = 30000;
                        }
                        else if (b4 != 6) {
                            if (b4 != 7) {
                                if (b4 == 8) {}
                            }
                        }
                    }
                }
            }
        }
        this.f = 1;
    }

    static void g() throws Exception {
        final DataInputStream a = ProgSix.a("/monstersin.dat");
        ProgFour.j = 0;
        ProgFour.d = a.readInt();
        ProgFour.h = new String[ProgFour.d];
        ProgFour.e = new byte[ProgFour.d][17];
        for (int i = 0; i < ProgFour.d; ++i) {
            ProgFour.h[i] = a.readUTF();
        }
        for (int j = 0; j < ProgFour.d; ++j) {
            for (int k = 0; k < 17; ++k) {
                ProgFour.e[j][k] = a.readByte();
            }
        }
    }

    static ProgFour a(final DataInputStream dataInputStream) throws Exception {
        final ProgFour ProgFour = new ProgFour();
        ProgFour.a = dataInputStream.readShort();
        ProgFour.l = dataInputStream.readByte();
        ProgFour.g = dataInputStream.readByte();
        ProgFour.o = dataInputStream.readByte();
        ProgFour.m = dataInputStream.readByte();
        ProgFour.i = dataInputStream.readBoolean();
        ProgFour.n = dataInputStream.readByte();
        ProgFour.b = dataInputStream.readByte();
        ProgFour.f = dataInputStream.readByte();
        ProgFour.k = dataInputStream.readLong();
        for (int i = 0; i < 10; ++i) {
            ProgFour.c[i] = dataInputStream.readByte();
        }
        return ProgFour;
    }

    void a(final DataOutputStream dataOutputStream) throws Exception {
        dataOutputStream.writeShort(this.a);
        dataOutputStream.writeByte(this.l);
        dataOutputStream.writeByte(this.g);
        dataOutputStream.writeByte(this.o);
        dataOutputStream.writeByte(this.m);
        dataOutputStream.writeBoolean(this.i);
        dataOutputStream.writeByte(this.n);
        dataOutputStream.writeByte(this.b);
        dataOutputStream.writeByte(this.f);
        dataOutputStream.writeLong(this.k);
        for (int i = 0; i < 10; ++i) {
            dataOutputStream.writeByte(this.c[i]);
        }
    }

    void c() {
    }

    void a(final boolean b) {
        int n = ProgFour.e[this.l - 1][15];
        if (b) {
            n = 100;
        }
        final byte b2 = ProgFour.e[this.l - 1][16];
        if (ProgSix.a(100) <= n || b) {
            final ProgNine ProgNine = ESGame.u[this.n - 1];
            final int a = ProgOne.a(ESGame.P, ProgNine.a, b2);
            final byte b3 = (byte)(a & 0xFF);
            byte b4 = 0;
            if (b3 == 86) {
                b4 = (byte)(a >>> 8 & 0xFF);
            }
            final byte[] array = { this.o, this.m, b3, 0, 0, b4, 0 };
            final short a2 = ProgOne.a();
            final byte b5 = (byte)(a2 >>> 8 & 0xFF);
            final byte b6 = (byte)(a2 & 0xFF);
            array[3] = b5;
            array[4] = b6;
            array[6] = 1;
            if (b) {
                final byte[] array2 = array;
                final int n2 = 6;
                array2[n2] |= 0x4;
            }
            ProgNine.c(array);
        }
    }

    static ProgFour a(final ProgNine ProgNine) {
        return a(ESGame.P, ProgNine, -1);
    }

    static ProgFour a(final Random random, final ProgNine ProgNine, final int n) {
        final short b = b();
        int n2 = n;
        if (n2 < 0) {
            int n3 = ProgNine.a - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            if (n3 > 36) {
                n3 = 36;
            }
            final int a = ESGame.a(random, 10);
            int n4;
            if (a <= 4) {
                n4 = 0;
            }
            else if (a <= 7) {
                n4 = 1;
            }
            else if (a <= 9) {
                n4 = 2;
            }
            else {
                n4 = 3;
            }
            n2 = ProgNine.l[n3][n4];
        }
        return new ProgFour(b, n2, ProgNine.o);
    }

    static {
        ProgFour.p = new ProgFour();
    }
}