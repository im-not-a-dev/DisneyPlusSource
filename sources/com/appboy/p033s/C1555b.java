package com.appboy.p033s;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ImageView;
import com.appboy.p025o.C1492a;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.appboy.s.b */
public class C1555b {

    /* renamed from: a */
    private static final String f5701a = C1557c.m7461a(C1555b.class);

    /* renamed from: com.appboy.s.b$a */
    static class C1556a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ float f5702U;

        /* renamed from: c */
        final /* synthetic */ ImageView f5703c;

        C1556a(ImageView imageView, float f) {
            this.f5703c = imageView;
            this.f5702U = f;
        }

        public void run() {
            int width = this.f5703c.getWidth();
            LayoutParams layoutParams = this.f5703c.getLayoutParams();
            layoutParams.height = (int) (((float) width) / this.f5702U);
            layoutParams.width = width;
            this.f5703c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public static Bitmap m7450a(Context context, Uri uri, C1492a aVar) {
        if (uri == null) {
            C1557c.m7469c(f5701a, "Null Uri received. Not getting image.");
            return null;
        } else if (C1554a.m7444a(uri)) {
            return m7451a(uri);
        } else {
            if (!C1554a.m7445b(uri)) {
                C1557c.m7473e(f5701a, "Uri with unknown scheme received. Not getting image.");
                return null;
            } else if (context == null || aVar == null) {
                return m7452a(uri, 0, 0);
            } else {
                DisplayMetrics a = m7455a(context);
                return m7452a(uri, m7447a(a.densityDpi, aVar.mo6743b()), m7447a(a.densityDpi, aVar.mo6742a()));
            }
        }
    }

    /* renamed from: b */
    public static Bitmap m7457b(Uri uri) {
        return m7450a((Context) null, uri, (C1492a) null);
    }

    /* renamed from: a */
    public static DisplayMetrics m7455a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static int m7447a(int i, int i2) {
        return Math.abs((i * i2) / 160);
    }

    /* renamed from: a */
    public static int m7448a(Context context, int i) {
        return Math.abs((m7455a(context).densityDpi * i) / 160);
    }

    /* renamed from: a */
    public static void m7456a(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || imageView == null) {
            C1557c.m7473e(f5701a, "Neither source bitmap nor ImageView may be null. Not resizing ImageView");
        } else if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            C1557c.m7473e(f5701a, "Bitmap dimensions cannot be 0. Not resizing ImageView");
        } else {
            float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
            String str = f5701a;
            StringBuilder sb = new StringBuilder();
            sb.append("Resizing ImageView to aspect ratio: ");
            sb.append(width);
            C1557c.m7458a(str, sb.toString());
            imageView.post(new C1556a(imageView, width));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x019e A[SYNTHETIC, Splitter:B:107:0x019e] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01d0 A[SYNTHETIC, Splitter:B:118:0x01d0] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f9 A[SYNTHETIC, Splitter:B:127:0x01f9] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0222 A[SYNTHETIC, Splitter:B:136:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0174 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0179 A[SYNTHETIC, Splitter:B:98:0x0179] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:131:0x0200=Splitter:B:131:0x0200, B:102:0x0181=Splitter:B:102:0x0181, B:122:0x01d7=Splitter:B:122:0x01d7, B:93:0x015c=Splitter:B:93:0x015c, B:113:0x01ae=Splitter:B:113:0x01ae} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m7452a(android.net.Uri r9, int r10, int r11) {
        /*
            java.lang.String r0 = " width "
            java.lang.String r1 = "IOException during closing of bitmap metadata download stream."
            r2 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r2)
            java.lang.String r9 = r9.toString()
            boolean r2 = com.appboy.C1440a.m6946q()
            r3 = 0
            if (r2 == 0) goto L_0x002b
            java.lang.String r10 = f5701a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "SDK is in offline mode, not downloading remote bitmap with uri: "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.appboy.p033s.C1557c.m7469c(r10, r9)
            return r3
        L_0x002b:
            java.net.URL r2 = new java.net.URL     // Catch:{ OutOfMemoryError -> 0x01fd, UnknownHostException -> 0x01d4, MalformedURLException -> 0x01ab, Exception -> 0x017e, all -> 0x0159 }
            r2.<init>(r9)     // Catch:{ OutOfMemoryError -> 0x01fd, UnknownHostException -> 0x01d4, MalformedURLException -> 0x01ab, Exception -> 0x017e, all -> 0x0159 }
            java.net.URLConnection r4 = p161f.p162a.C4467h6.m15466a(r2)     // Catch:{ OutOfMemoryError -> 0x01fd, UnknownHostException -> 0x01d4, MalformedURLException -> 0x01ab, Exception -> 0x017e, all -> 0x0159 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ OutOfMemoryError -> 0x01fd, UnknownHostException -> 0x01d4, MalformedURLException -> 0x01ab, Exception -> 0x017e, all -> 0x0159 }
            int r5 = r4.getResponseCode()     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x0067
            java.lang.String r10 = f5701a     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            r11.<init>()     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            java.lang.String r0 = "HTTP response code was "
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            r11.append(r5)     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            java.lang.String r0 = ". Bitmap with url "
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            r11.append(r2)     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            java.lang.String r0 = " could not be downloaded."
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            java.lang.String r11 = r11.toString()     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            com.appboy.p033s.C1557c.m7473e(r10, r11)     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            if (r4 == 0) goto L_0x0066
            r4.disconnect()
        L_0x0066:
            return r3
        L_0x0067:
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ OutOfMemoryError -> 0x0155, UnknownHostException -> 0x0151, MalformedURLException -> 0x014e, Exception -> 0x014b, all -> 0x0148 }
            if (r10 == 0) goto L_0x0125
            if (r11 == 0) goto L_0x0125
            java.lang.String r6 = f5701a     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            r7.<init>()     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            java.lang.String r8 = "Sampling bitmap with destination image bounds: (height "
            r7.append(r8)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            r7.append(r11)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            r7.append(r0)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            r7.append(r10)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            java.lang.String r8 = ")"
            r7.append(r8)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            java.lang.String r7 = r7.toString()     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            com.appboy.p033s.C1557c.m7458a(r6, r7)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            android.graphics.BitmapFactory$Options r6 = m7454a(r5)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            r4.disconnect()     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            java.net.URLConnection r7 = p161f.p162a.C4467h6.m15466a(r2)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            java.io.InputStream r4 = r7.getInputStream()     // Catch:{ OutOfMemoryError -> 0x0121, UnknownHostException -> 0x011d, MalformedURLException -> 0x0119, Exception -> 0x0115, all -> 0x0112 }
            int r5 = r6.outHeight     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            if (r5 == 0) goto L_0x00c0
            int r5 = r6.outWidth     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            if (r5 != 0) goto L_0x00aa
            goto L_0x00c0
        L_0x00aa:
            android.graphics.Bitmap r9 = m7453a(r4, r6, r10, r11)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            if (r7 == 0) goto L_0x00b3
            r7.disconnect()
        L_0x00b3:
            if (r4 == 0) goto L_0x00bf
            r4.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00bf
        L_0x00b9:
            r10 = move-exception
            java.lang.String r11 = f5701a
            com.appboy.p033s.C1557c.m7470c(r11, r1, r10)
        L_0x00bf:
            return r9
        L_0x00c0:
            java.lang.String r10 = f5701a     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            r11.<init>()     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            java.lang.String r5 = "The bitmap metadata with image url "
            r11.append(r5)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            r11.append(r2)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            java.lang.String r2 = " had bounds: (height "
            r11.append(r2)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            int r2 = r6.outHeight     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            r11.append(r2)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            int r0 = r6.outWidth     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            java.lang.String r0 = "). Returning a bitmap with no sampling."
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            java.lang.String r11 = r11.toString()     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            com.appboy.p033s.C1557c.m7473e(r10, r11)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ OutOfMemoryError -> 0x010f, UnknownHostException -> 0x010c, MalformedURLException -> 0x0109, Exception -> 0x0106, all -> 0x0103 }
            if (r7 == 0) goto L_0x00f6
            r7.disconnect()
        L_0x00f6:
            if (r4 == 0) goto L_0x0102
            r4.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x0102
        L_0x00fc:
            r10 = move-exception
            java.lang.String r11 = f5701a
            com.appboy.p033s.C1557c.m7470c(r11, r1, r10)
        L_0x0102:
            return r9
        L_0x0103:
            r10 = move-exception
            r5 = r4
            goto L_0x0113
        L_0x0106:
            r10 = move-exception
            r5 = r4
            goto L_0x0116
        L_0x0109:
            r10 = move-exception
            r5 = r4
            goto L_0x011a
        L_0x010c:
            r10 = move-exception
            r5 = r4
            goto L_0x011e
        L_0x010f:
            r10 = move-exception
            r5 = r4
            goto L_0x0122
        L_0x0112:
            r10 = move-exception
        L_0x0113:
            r4 = r7
            goto L_0x015c
        L_0x0115:
            r10 = move-exception
        L_0x0116:
            r4 = r7
            goto L_0x0181
        L_0x0119:
            r10 = move-exception
        L_0x011a:
            r4 = r7
            goto L_0x01ae
        L_0x011d:
            r10 = move-exception
        L_0x011e:
            r4 = r7
            goto L_0x01d7
        L_0x0121:
            r10 = move-exception
        L_0x0122:
            r4 = r7
            goto L_0x0200
        L_0x0125:
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ OutOfMemoryError -> 0x0145, UnknownHostException -> 0x0142, MalformedURLException -> 0x013f, Exception -> 0x013d, all -> 0x013b }
            if (r4 == 0) goto L_0x012e
            r4.disconnect()
        L_0x012e:
            if (r5 == 0) goto L_0x013a
            r5.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x013a
        L_0x0134:
            r10 = move-exception
            java.lang.String r11 = f5701a
            com.appboy.p033s.C1557c.m7470c(r11, r1, r10)
        L_0x013a:
            return r9
        L_0x013b:
            r10 = move-exception
            goto L_0x015c
        L_0x013d:
            r10 = move-exception
            goto L_0x0181
        L_0x013f:
            r10 = move-exception
            goto L_0x01ae
        L_0x0142:
            r10 = move-exception
            goto L_0x01d7
        L_0x0145:
            r10 = move-exception
            goto L_0x0200
        L_0x0148:
            r10 = move-exception
            r5 = r3
            goto L_0x015c
        L_0x014b:
            r10 = move-exception
            r5 = r3
            goto L_0x0181
        L_0x014e:
            r10 = move-exception
            r5 = r3
            goto L_0x01ae
        L_0x0151:
            r10 = move-exception
            r5 = r3
            goto L_0x01d7
        L_0x0155:
            r10 = move-exception
            r5 = r3
            goto L_0x0200
        L_0x0159:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x015c:
            java.lang.String r11 = f5701a     // Catch:{ all -> 0x0226 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0226 }
            r0.<init>()     // Catch:{ all -> 0x0226 }
            java.lang.String r2 = "Throwable caught in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x0226 }
            r0.append(r9)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0226 }
            com.appboy.p033s.C1557c.m7470c(r11, r9, r10)     // Catch:{ all -> 0x0226 }
            if (r4 == 0) goto L_0x0177
            r4.disconnect()
        L_0x0177:
            if (r5 == 0) goto L_0x0225
            r5.close()     // Catch:{ IOException -> 0x01a3 }
            goto L_0x0225
        L_0x017e:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x0181:
            java.lang.String r11 = f5701a     // Catch:{ all -> 0x0226 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0226 }
            r0.<init>()     // Catch:{ all -> 0x0226 }
            java.lang.String r2 = "Exception in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x0226 }
            r0.append(r9)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0226 }
            com.appboy.p033s.C1557c.m7470c(r11, r9, r10)     // Catch:{ all -> 0x0226 }
            if (r4 == 0) goto L_0x019c
            r4.disconnect()
        L_0x019c:
            if (r5 == 0) goto L_0x0225
            r5.close()     // Catch:{ IOException -> 0x01a3 }
            goto L_0x0225
        L_0x01a3:
            r9 = move-exception
            java.lang.String r10 = f5701a
            com.appboy.p033s.C1557c.m7470c(r10, r1, r9)
            goto L_0x0225
        L_0x01ab:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x01ae:
            java.lang.String r11 = f5701a     // Catch:{ all -> 0x0226 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0226 }
            r0.<init>()     // Catch:{ all -> 0x0226 }
            java.lang.String r2 = "Malformed URL Exception in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x0226 }
            r0.append(r9)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = ". Image Uri may be corrupted."
            r0.append(r9)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0226 }
            com.appboy.p033s.C1557c.m7470c(r11, r9, r10)     // Catch:{ all -> 0x0226 }
            if (r4 == 0) goto L_0x01ce
            r4.disconnect()
        L_0x01ce:
            if (r5 == 0) goto L_0x0225
            r5.close()     // Catch:{ IOException -> 0x01a3 }
            goto L_0x0225
        L_0x01d4:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x01d7:
            java.lang.String r11 = f5701a     // Catch:{ all -> 0x0226 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0226 }
            r0.<init>()     // Catch:{ all -> 0x0226 }
            java.lang.String r2 = "Unknown Host Exception in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x0226 }
            r0.append(r9)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = ". Device may be offline."
            r0.append(r9)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0226 }
            com.appboy.p033s.C1557c.m7470c(r11, r9, r10)     // Catch:{ all -> 0x0226 }
            if (r4 == 0) goto L_0x01f7
            r4.disconnect()
        L_0x01f7:
            if (r5 == 0) goto L_0x0225
            r5.close()     // Catch:{ IOException -> 0x01a3 }
            goto L_0x0225
        L_0x01fd:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x0200:
            java.lang.String r11 = f5701a     // Catch:{ all -> 0x0226 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0226 }
            r0.<init>()     // Catch:{ all -> 0x0226 }
            java.lang.String r2 = "Out of Memory Error in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x0226 }
            r0.append(r9)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = "."
            r0.append(r9)     // Catch:{ all -> 0x0226 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0226 }
            com.appboy.p033s.C1557c.m7470c(r11, r9, r10)     // Catch:{ all -> 0x0226 }
            if (r4 == 0) goto L_0x0220
            r4.disconnect()
        L_0x0220:
            if (r5 == 0) goto L_0x0225
            r5.close()     // Catch:{ IOException -> 0x01a3 }
        L_0x0225:
            return r3
        L_0x0226:
            r9 = move-exception
            if (r4 == 0) goto L_0x022c
            r4.disconnect()
        L_0x022c:
            if (r5 == 0) goto L_0x0238
            r5.close()     // Catch:{ IOException -> 0x0232 }
            goto L_0x0238
        L_0x0232:
            r10 = move-exception
            java.lang.String r11 = f5701a
            com.appboy.p033s.C1557c.m7470c(r11, r1, r10)
        L_0x0238:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.p033s.C1555b.m7452a(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static Bitmap m7451a(Uri uri) {
        try {
            File file = new File(uri.getPath());
            if (file.exists()) {
                String str = f5701a;
                StringBuilder sb = new StringBuilder();
                sb.append("Retrieving image from path: ");
                sb.append(file.getAbsolutePath());
                C1557c.m7469c(str, sb.toString());
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
        } catch (OutOfMemoryError e) {
            String str2 = f5701a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Out of Memory Error in local bitmap file retrieval for Uri: ");
            sb2.append(uri.toString());
            sb2.append(".");
            C1557c.m7470c(str2, sb2.toString(), e);
        } catch (Exception e2) {
            C1557c.m7470c(f5701a, "Exception occurred when attempting to retrieve local bitmap.", e2);
        } catch (Throwable th) {
            String str3 = f5701a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Throwable caught in local bitmap file retrieval for Uri: ");
            sb3.append(uri.toString());
            C1557c.m7470c(str3, sb3.toString(), th);
        }
        return null;
    }

    /* renamed from: a */
    public static int m7446a() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), 33554432));
    }

    /* renamed from: a */
    static Options m7454a(InputStream inputStream) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    /* renamed from: a */
    private static Bitmap m7453a(InputStream inputStream, Options options, int i, int i2) {
        options.inSampleSize = m7449a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* renamed from: a */
    static int m7449a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        String str = f5701a;
        StringBuilder sb = new StringBuilder();
        sb.append("Calculating sample size for source image bounds: (height ");
        sb.append(options.outHeight);
        String str2 = " width ";
        sb.append(str2);
        sb.append(options.outWidth);
        sb.append(") and destination image bounds: (height ");
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        sb.append(")");
        C1557c.m7458a(str, sb.toString());
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        String str3 = f5701a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Using image sample size of ");
        sb2.append(i5);
        C1557c.m7458a(str3, sb2.toString());
        return i5;
    }
}
