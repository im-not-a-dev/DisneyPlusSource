package com.bumptech.glide.load.p341p.p342c;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C8112h;
import com.bumptech.glide.load.C8112h.C8114b;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.c.w */
/* compiled from: VideoDecoder */
public class C8390w<T> implements C8116j<T, Bitmap> {

    /* renamed from: d */
    public static final C8112h<Long> f17892d = C8112h.m23533a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new C8391a());

    /* renamed from: e */
    public static final C8112h<Integer> f17893e = C8112h.m23533a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new C8392b());

    /* renamed from: f */
    private static final C8394d f17894f = new C8394d();

    /* renamed from: a */
    private final C8395e<T> f17895a;

    /* renamed from: b */
    private final C8159e f17896b;

    /* renamed from: c */
    private final C8394d f17897c;

    /* renamed from: com.bumptech.glide.load.p.c.w$a */
    /* compiled from: VideoDecoder */
    class C8391a implements C8114b<Long> {

        /* renamed from: a */
        private final ByteBuffer f17898a = ByteBuffer.allocate(8);

        C8391a() {
        }

        /* renamed from: a */
        public void mo21160a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f17898a) {
                this.f17898a.position(0);
                messageDigest.update(this.f17898a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.w$b */
    /* compiled from: VideoDecoder */
    class C8392b implements C8114b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f17899a = ByteBuffer.allocate(4);

        C8392b() {
        }

        /* renamed from: a */
        public void mo21160a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f17899a) {
                    this.f17899a.position(0);
                    messageDigest.update(this.f17899a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.w$c */
    /* compiled from: VideoDecoder */
    private static final class C8393c implements C8395e<AssetFileDescriptor> {
        private C8393c() {
        }

        /* synthetic */ C8393c(C8391a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo21571a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.w$d */
    /* compiled from: VideoDecoder */
    static class C8394d {
        C8394d() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo21572a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.w$e */
    /* compiled from: VideoDecoder */
    interface C8395e<T> {
        /* renamed from: a */
        void mo21571a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.p.c.w$f */
    /* compiled from: VideoDecoder */
    static final class C8396f implements C8395e<ParcelFileDescriptor> {
        C8396f() {
        }

        /* renamed from: a */
        public void mo21571a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C8390w(C8159e eVar, C8395e<T> eVar2) {
        this(eVar, eVar2, f17894f);
    }

    /* renamed from: a */
    public static C8116j<AssetFileDescriptor, Bitmap> m24396a(C8159e eVar) {
        return new C8390w(eVar, new C8393c(null));
    }

    /* renamed from: b */
    public static C8116j<ParcelFileDescriptor, Bitmap> m24398b(C8159e eVar) {
        return new C8390w(eVar, new C8396f());
    }

    /* renamed from: a */
    public boolean mo21166a(T t, C8115i iVar) {
        return true;
    }

    C8390w(C8159e eVar, C8395e<T> eVar2, C8394d dVar) {
        this.f17896b = eVar;
        this.f17895a = eVar2;
        this.f17897c = dVar;
    }

    @TargetApi(27)
    /* renamed from: b */
    private static Bitmap m24397b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C8363j jVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = jVar.mo21537b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            String str = "VideoDecoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Exception trying to decode frame on oreo+", th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public C8258v<Bitmap> mo21165a(T t, int i, int i2, C8115i iVar) throws IOException {
        long longValue = ((Long) iVar.mo21162a(f17892d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.mo21162a(f17893e);
            if (num == null) {
                num = Integer.valueOf(2);
            }
            C8363j jVar = (C8363j) iVar.mo21162a(C8363j.f17849f);
            if (jVar == null) {
                jVar = C8363j.f17848e;
            }
            C8363j jVar2 = jVar;
            MediaMetadataRetriever a = this.f17897c.mo21572a();
            try {
                this.f17895a.mo21571a(a, t);
                Bitmap a2 = m24395a(a, longValue, num.intValue(), i, i2, jVar2);
                a.release();
                return C8353d.m24266a(a2, this.f17896b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bitmap m24395a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C8363j jVar) {
        Bitmap b = (VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || jVar == C8363j.f17847d) ? null : m24397b(mediaMetadataRetriever, j, i, i2, i3, jVar);
        return b == null ? m24394a(mediaMetadataRetriever, j, i) : b;
    }

    /* renamed from: a */
    private static Bitmap m24394a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }
}
