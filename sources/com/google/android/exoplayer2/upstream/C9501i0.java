package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: com.google.android.exoplayer2.upstream.i0 */
/* compiled from: UdpDataSource */
public final class C9501i0 extends C9497h {

    /* renamed from: e */
    private final int f22125e;

    /* renamed from: f */
    private final byte[] f22126f;

    /* renamed from: g */
    private final DatagramPacket f22127g;

    /* renamed from: h */
    private Uri f22128h;

    /* renamed from: i */
    private DatagramSocket f22129i;

    /* renamed from: j */
    private MulticastSocket f22130j;

    /* renamed from: k */
    private InetAddress f22131k;

    /* renamed from: l */
    private InetSocketAddress f22132l;

    /* renamed from: m */
    private boolean f22133m;

    /* renamed from: n */
    private int f22134n;

    /* renamed from: com.google.android.exoplayer2.upstream.i0$a */
    /* compiled from: UdpDataSource */
    public static final class C9502a extends IOException {
        public C9502a(IOException iOException) {
            super(iOException);
        }
    }

    public C9501i0() {
        this(2000);
    }

    public void close() {
        this.f22128h = null;
        MulticastSocket multicastSocket = this.f22130j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f22131k);
            } catch (IOException unused) {
            }
            this.f22130j = null;
        }
        DatagramSocket datagramSocket = this.f22129i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f22129i = null;
        }
        this.f22131k = null;
        this.f22132l = null;
        this.f22134n = 0;
        if (this.f22133m) {
            this.f22133m = false;
            mo24568b();
        }
    }

    public Uri getUri() {
        return this.f22128h;
    }

    public long open(DataSpec dataSpec) throws C9502a {
        this.f22128h = dataSpec.f21938a;
        String host = this.f22128h.getHost();
        int port = this.f22128h.getPort();
        mo24567a(dataSpec);
        try {
            this.f22131k = InetAddress.getByName(host);
            this.f22132l = new InetSocketAddress(this.f22131k, port);
            if (this.f22131k.isMulticastAddress()) {
                this.f22130j = new MulticastSocket(this.f22132l);
                this.f22130j.joinGroup(this.f22131k);
                this.f22129i = this.f22130j;
            } else {
                this.f22129i = new DatagramSocket(this.f22132l);
            }
            try {
                this.f22129i.setSoTimeout(this.f22125e);
                this.f22133m = true;
                mo24569b(dataSpec);
                return -1;
            } catch (SocketException e) {
                throw new C9502a(e);
            }
        } catch (IOException e2) {
            throw new C9502a(e2);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C9502a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f22134n == 0) {
            try {
                this.f22129i.receive(this.f22127g);
                this.f22134n = this.f22127g.getLength();
                mo24566a(this.f22134n);
            } catch (IOException e) {
                throw new C9502a(e);
            }
        }
        int length = this.f22127g.getLength();
        int i3 = this.f22134n;
        int i4 = length - i3;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f22126f, i4, bArr, i, min);
        this.f22134n -= min;
        return min;
    }

    public C9501i0(int i) {
        this(i, 8000);
    }

    public C9501i0(int i, int i2) {
        super(true);
        this.f22125e = i2;
        this.f22126f = new byte[i];
        this.f22127g = new DatagramPacket(this.f22126f, 0, i);
    }
}
