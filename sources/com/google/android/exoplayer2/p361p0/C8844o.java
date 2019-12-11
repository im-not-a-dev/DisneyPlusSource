package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.p0.o */
/* compiled from: AudioSink */
public interface C8844o {

    /* renamed from: com.google.android.exoplayer2.p0.o$a */
    /* compiled from: AudioSink */
    public static final class C8845a extends Exception {
        public C8845a(Throwable th) {
            super(th);
        }

        public C8845a(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.o$b */
    /* compiled from: AudioSink */
    public static final class C8846b extends Exception {
        public C8846b(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed: ");
            sb.append(i);
            sb.append(", Config(");
            sb.append(i2);
            String str = ", ";
            sb.append(str);
            sb.append(i3);
            sb.append(str);
            sb.append(i4);
            sb.append(")");
            super(sb.toString());
        }
    }

    /* renamed from: com.google.android.exoplayer2.p0.o$c */
    /* compiled from: AudioSink */
    public interface C8847c {
        /* renamed from: a */
        void mo23125a();

        /* renamed from: a */
        void mo23126a(int i);

        /* renamed from: a */
        void mo23127a(int i, long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.p0.o$d */
    /* compiled from: AudioSink */
    public static final class C8848d extends Exception {
        public C8848d(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack write failed: ");
            sb.append(i);
            super(sb.toString());
        }
    }

    /* renamed from: Y */
    void mo23105Y();

    /* renamed from: a */
    long mo23106a(boolean z);

    /* renamed from: a */
    PlaybackParameters mo23107a(PlaybackParameters playbackParameters);

    /* renamed from: a */
    void mo23108a() throws C8848d;

    /* renamed from: a */
    void mo23109a(float f);

    /* renamed from: a */
    void mo23110a(int i);

    /* renamed from: a */
    void mo23111a(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) throws C8845a;

    /* renamed from: a */
    void mo23112a(C8831i iVar);

    /* renamed from: a */
    void mo23113a(C8847c cVar);

    /* renamed from: a */
    void mo23114a(C8853r rVar);

    /* renamed from: a */
    boolean mo23115a(int i, int i2);

    /* renamed from: a */
    boolean mo23116a(ByteBuffer byteBuffer, long j) throws C8846b, C8848d;

    /* renamed from: b */
    void mo23117b();

    /* renamed from: c */
    boolean mo23118c();

    /* renamed from: d */
    boolean mo23119d();

    /* renamed from: e */
    void mo23120e();

    /* renamed from: f */
    void mo23121f();

    void flush();

    PlaybackParameters getPlaybackParameters();

    void reset();
}
