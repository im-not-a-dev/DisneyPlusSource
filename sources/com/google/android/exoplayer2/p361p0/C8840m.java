package com.google.android.exoplayer2.p361p0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.p0.m */
/* compiled from: AudioProcessor */
public interface C8840m {

    /* renamed from: a */
    public static final ByteBuffer f18847a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.google.android.exoplayer2.p0.m$a */
    /* compiled from: AudioProcessor */
    public static final class C8841a extends Exception {
        public C8841a(int i, int i2, int i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled format: ");
            sb.append(i);
            sb.append(" Hz, ");
            sb.append(i2);
            sb.append(" channels in encoding ");
            sb.append(i3);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    void mo23058a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo23059a();

    /* renamed from: a */
    boolean mo23060a(int i, int i2, int i3) throws C8841a;

    /* renamed from: b */
    ByteBuffer mo23062b();

    /* renamed from: c */
    boolean mo23063c();

    /* renamed from: d */
    int mo23064d();

    /* renamed from: e */
    int mo23065e();

    /* renamed from: f */
    int mo23066f();

    void flush();

    /* renamed from: g */
    void mo23068g();

    void reset();
}
