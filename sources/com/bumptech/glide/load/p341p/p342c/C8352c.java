package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C8107c;
import com.bumptech.glide.load.C8112h;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8117k;
import com.bumptech.glide.load.p334n.p335a0.C8154b;

/* renamed from: com.bumptech.glide.load.p.c.c */
/* compiled from: BitmapEncoder */
public class C8352c implements C8117k<Bitmap> {

    /* renamed from: b */
    public static final C8112h<Integer> f17831b = C8112h.m23532a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));

    /* renamed from: c */
    public static final C8112h<CompressFormat> f17832c = C8112h.m23531a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    private final C8154b f17833a;

    public C8352c(C8154b bVar) {
        this.f17833a = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:38|39)|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r6 == null) goto L_0x0069;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00bf */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc A[SYNTHETIC, Splitter:B:38:0x00bc] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo21151a(com.bumptech.glide.load.p334n.C8258v<android.graphics.Bitmap> r9, java.io.File r10, com.bumptech.glide.load.C8115i r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.m24262a(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p163g.p413f.p414a.p424w.p425l.C10785b.m34053a(r4, r2, r3, r1)
            long r2 = p163g.p413f.p414a.p424w.C10770f.m33999a()     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.h<java.lang.Integer> r4 = f17831b     // Catch:{ all -> 0x00c0 }
            java.lang.Object r4 = r11.mo21162a(r4)     // Catch:{ all -> 0x00c0 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00c0 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00c0 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0059 }
            com.bumptech.glide.load.n.a0.b r10 = r8.f17833a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            if (r10 == 0) goto L_0x0045
            com.bumptech.glide.load.m.c r10 = new com.bumptech.glide.load.m.c     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            com.bumptech.glide.load.n.a0.b r6 = r8.f17833a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r6 = r10
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x0059 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            r5 = 1
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x0069
        L_0x0051:
            r9 = move-exception
            r6 = r7
            goto L_0x00ba
        L_0x0054:
            r10 = move-exception
            r6 = r7
            goto L_0x005a
        L_0x0057:
            r9 = move-exception
            goto L_0x00ba
        L_0x0059:
            r10 = move-exception
        L_0x005a:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch:{ all -> 0x0057 }
        L_0x0066:
            if (r6 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0069:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00c0 }
            if (r10 == 0) goto L_0x00b6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r10.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            int r1 = p163g.p413f.p414a.p424w.C10775k.m34022a(r9)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            double r1 = p163g.p413f.p414a.p424w.C10770f.m33998a(r2)     // Catch:{ all -> 0x00c0 }
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.h<android.graphics.Bitmap$CompressFormat> r1 = f17832c     // Catch:{ all -> 0x00c0 }
            java.lang.Object r11 = r11.mo21162a(r1)     // Catch:{ all -> 0x00c0 }
            r10.append(r11)     // Catch:{ all -> 0x00c0 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00c0 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00c0 }
            r10.append(r9)     // Catch:{ all -> 0x00c0 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00c0 }
            android.util.Log.v(r0, r9)     // Catch:{ all -> 0x00c0 }
        L_0x00b6:
            p163g.p413f.p414a.p424w.p425l.C10785b.m34050a()
            return r5
        L_0x00ba:
            if (r6 == 0) goto L_0x00bf
            r6.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            throw r9     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r9 = move-exception
            p163g.p413f.p414a.p424w.p425l.C10785b.m34050a()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p341p.p342c.C8352c.mo21151a(com.bumptech.glide.load.n.v, java.io.File, com.bumptech.glide.load.i):boolean");
    }

    /* renamed from: a */
    private CompressFormat m24262a(Bitmap bitmap, C8115i iVar) {
        CompressFormat compressFormat = (CompressFormat) iVar.mo21162a(f17832c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return CompressFormat.PNG;
        }
        return CompressFormat.JPEG;
    }

    /* renamed from: a */
    public C8107c mo21167a(C8115i iVar) {
        return C8107c.TRANSFORMED;
    }
}
