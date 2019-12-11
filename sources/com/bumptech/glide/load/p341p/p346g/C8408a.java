package com.bumptech.glide.load.p341p.p346g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.load.C8106b;
import com.bumptech.glide.load.C8110f;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import com.bumptech.glide.load.p341p.C8349b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p163g.p413f.p414a.p416q.C10680a;
import p163g.p413f.p414a.p416q.C10680a.C10681a;
import p163g.p413f.p414a.p416q.C10683c;
import p163g.p413f.p414a.p416q.C10684d;
import p163g.p413f.p414a.p416q.C10685e;
import p163g.p413f.p414a.p424w.C10770f;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.p.g.a */
/* compiled from: ByteBufferGifDecoder */
public class C8408a implements C8116j<ByteBuffer, C8412c> {

    /* renamed from: f */
    private static final C8409a f17905f = new C8409a();

    /* renamed from: g */
    private static final C8410b f17906g = new C8410b();

    /* renamed from: a */
    private final Context f17907a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f17908b;

    /* renamed from: c */
    private final C8410b f17909c;

    /* renamed from: d */
    private final C8409a f17910d;

    /* renamed from: e */
    private final C8411b f17911e;

    /* renamed from: com.bumptech.glide.load.p.g.a$a */
    /* compiled from: ByteBufferGifDecoder */
    static class C8409a {
        C8409a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C10680a mo21586a(C10681a aVar, C10683c cVar, ByteBuffer byteBuffer, int i) {
            return new C10685e(aVar, cVar, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.g.a$b */
    /* compiled from: ByteBufferGifDecoder */
    static class C8410b {

        /* renamed from: a */
        private final Queue<C10684d> f17912a = C10775k.m34028a(0);

        C8410b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized C10684d mo21587a(ByteBuffer byteBuffer) {
            C10684d dVar;
            dVar = (C10684d) this.f17912a.poll();
            if (dVar == null) {
                dVar = new C10684d();
            }
            dVar.mo27616a(byteBuffer);
            return dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo21588a(C10684d dVar) {
            dVar.mo27617a();
            this.f17912a.offer(dVar);
        }
    }

    public C8408a(Context context, List<ImageHeaderParser> list, C8159e eVar, C8154b bVar) {
        this(context, list, eVar, bVar, f17906g, f17905f);
    }

    C8408a(Context context, List<ImageHeaderParser> list, C8159e eVar, C8154b bVar, C8410b bVar2, C8409a aVar) {
        this.f17907a = context.getApplicationContext();
        this.f17908b = list;
        this.f17910d = aVar;
        this.f17911e = new C8411b(eVar, bVar);
        this.f17909c = bVar2;
    }

    /* renamed from: a */
    public boolean mo21166a(ByteBuffer byteBuffer, C8115i iVar) throws IOException {
        return !((Boolean) iVar.mo21162a(C8423i.f17950b)).booleanValue() && C8110f.m23528a(this.f17908b, byteBuffer) == ImageType.GIF;
    }

    /* renamed from: a */
    public C8415e mo21165a(ByteBuffer byteBuffer, int i, int i2, C8115i iVar) {
        C10684d a = this.f17909c.mo21587a(byteBuffer);
        try {
            C8415e a2 = m24447a(byteBuffer, i, i2, a, iVar);
            return a2;
        } finally {
            this.f17909c.mo21588a(a);
        }
    }

    /* renamed from: a */
    private C8415e m24447a(ByteBuffer byteBuffer, int i, int i2, C10684d dVar, C8115i iVar) {
        String str = "Decoded GIF from stream in ";
        String str2 = "BufferGifDecoder";
        long a = C10770f.m33999a();
        try {
            C10683c b = dVar.mo27618b();
            if (b.mo27613b() > 0) {
                if (b.mo27614c() == 0) {
                    Config config = iVar.mo21162a(C8423i.f17949a) == C8106b.PREFER_RGB_565 ? Config.RGB_565 : Config.ARGB_8888;
                    C10680a a2 = this.f17910d.mo21586a(this.f17911e, b, byteBuffer, m24446a(b, i, i2));
                    a2.mo27603a(config);
                    a2.mo27604b();
                    Bitmap a3 = a2.mo27602a();
                    if (a3 == null) {
                        if (Log.isLoggable(str2, 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(C10770f.m33998a(a));
                            Log.v(str2, sb.toString());
                        }
                        return null;
                    }
                    C8412c cVar = new C8412c(this.f17907a, a2, C8349b.m24254a(), i, i2, a3);
                    C8415e eVar = new C8415e(cVar);
                    if (Log.isLoggable(str2, 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(C10770f.m33998a(a));
                        Log.v(str2, sb2.toString());
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(C10770f.m33998a(a));
                Log.v(str2, sb3.toString());
            }
        }
    }

    /* renamed from: a */
    private static int m24446a(C10683c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo27612a() / i2, cVar.mo27615d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        String str = "BufferGifDecoder";
        if (Log.isLoggable(str, 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(cVar.mo27615d());
            sb.append(str2);
            sb.append(cVar.mo27612a());
            sb.append("]");
            Log.v(str, sb.toString());
        }
        return max;
    }
}
