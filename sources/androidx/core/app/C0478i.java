package androidx.core.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p096e.p121h.C4017b;
import p096e.p121h.C4018c;
import p096e.p121h.C4019d;
import p096e.p121h.C4020e;
import p096e.p121h.C4022g;

/* renamed from: androidx.core.app.i */
/* compiled from: NotificationCompat */
public class C0478i {

    /* renamed from: androidx.core.app.i$a */
    /* compiled from: NotificationCompat */
    public static class C0479a {

        /* renamed from: a */
        final Bundle f2105a;

        /* renamed from: b */
        private final C0488l[] f2106b;

        /* renamed from: c */
        private final C0488l[] f2107c;

        /* renamed from: d */
        private boolean f2108d;

        /* renamed from: e */
        boolean f2109e;

        /* renamed from: f */
        private final int f2110f;

        /* renamed from: g */
        public int f2111g;

        /* renamed from: h */
        public CharSequence f2112h;

        /* renamed from: i */
        public PendingIntent f2113i;

        /* renamed from: androidx.core.app.i$a$a */
        /* compiled from: NotificationCompat */
        public static final class C0480a {

            /* renamed from: a */
            private final int f2114a;

            /* renamed from: b */
            private final CharSequence f2115b;

            /* renamed from: c */
            private final PendingIntent f2116c;

            /* renamed from: d */
            private boolean f2117d;

            /* renamed from: e */
            private final Bundle f2118e;

            /* renamed from: f */
            private ArrayList<C0488l> f2119f;

            /* renamed from: g */
            private int f2120g;

            /* renamed from: h */
            private boolean f2121h;

            public C0480a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true, 0, true);
            }

            /* renamed from: a */
            public C0480a mo2634a(Bundle bundle) {
                if (bundle != null) {
                    this.f2118e.putAll(bundle);
                }
                return this;
            }

            private C0480a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0488l[] lVarArr, boolean z, int i2, boolean z2) {
                ArrayList<C0488l> arrayList;
                this.f2117d = true;
                this.f2121h = true;
                this.f2114a = i;
                this.f2115b = C0483d.m2543e(charSequence);
                this.f2116c = pendingIntent;
                this.f2118e = bundle;
                if (lVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(lVarArr));
                }
                this.f2119f = arrayList;
                this.f2117d = z;
                this.f2120g = i2;
                this.f2121h = z2;
            }

            /* renamed from: a */
            public C0479a mo2635a() {
                C0488l[] lVarArr;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C0488l> arrayList3 = this.f2119f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C0488l lVar = (C0488l) it.next();
                        if (lVar.mo2694g()) {
                            arrayList.add(lVar);
                        } else {
                            arrayList2.add(lVar);
                        }
                    }
                }
                C0488l[] lVarArr2 = null;
                if (arrayList.isEmpty()) {
                    lVarArr = null;
                } else {
                    lVarArr = (C0488l[]) arrayList.toArray(new C0488l[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    lVarArr2 = (C0488l[]) arrayList2.toArray(new C0488l[arrayList2.size()]);
                }
                C0479a aVar = new C0479a(this.f2114a, this.f2115b, this.f2116c, this.f2118e, lVarArr2, lVarArr, this.f2117d, this.f2120g, this.f2121h);
                return aVar;
            }
        }

        public C0479a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        /* renamed from: a */
        public PendingIntent mo2625a() {
            return this.f2113i;
        }

        /* renamed from: b */
        public boolean mo2626b() {
            return this.f2108d;
        }

        /* renamed from: c */
        public C0488l[] mo2627c() {
            return this.f2107c;
        }

        /* renamed from: d */
        public Bundle mo2628d() {
            return this.f2105a;
        }

        /* renamed from: e */
        public int mo2629e() {
            return this.f2111g;
        }

        /* renamed from: f */
        public C0488l[] mo2630f() {
            return this.f2106b;
        }

        /* renamed from: g */
        public int mo2631g() {
            return this.f2110f;
        }

        /* renamed from: h */
        public boolean mo2632h() {
            return this.f2109e;
        }

        /* renamed from: i */
        public CharSequence mo2633i() {
            return this.f2112h;
        }

        C0479a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0488l[] lVarArr, C0488l[] lVarArr2, boolean z, int i2, boolean z2) {
            this.f2109e = true;
            this.f2111g = i;
            this.f2112h = C0483d.m2543e(charSequence);
            this.f2113i = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.f2105a = bundle;
            this.f2106b = lVarArr;
            this.f2107c = lVarArr2;
            this.f2108d = z;
            this.f2110f = i2;
            this.f2109e = z2;
        }
    }

    /* renamed from: androidx.core.app.i$b */
    /* compiled from: NotificationCompat */
    public static class C0481b extends C0485f {

        /* renamed from: e */
        private Bitmap f2122e;

        /* renamed from: f */
        private Bitmap f2123f;

        /* renamed from: g */
        private boolean f2124g;

        /* renamed from: a */
        public C0481b mo2637a(CharSequence charSequence) {
            this.f2168b = C0483d.m2543e(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0481b mo2640b(CharSequence charSequence) {
            this.f2169c = C0483d.m2543e(charSequence);
            this.f2170d = true;
            return this;
        }

        /* renamed from: a */
        public C0481b mo2636a(Bitmap bitmap) {
            this.f2123f = bitmap;
            this.f2124g = true;
            return this;
        }

        /* renamed from: b */
        public C0481b mo2639b(Bitmap bitmap) {
            this.f2122e = bitmap;
            return this;
        }

        /* renamed from: a */
        public void mo2638a(C0477h hVar) {
            if (VERSION.SDK_INT >= 16) {
                BigPictureStyle bigPicture = new BigPictureStyle(hVar.mo2624a()).setBigContentTitle(this.f2168b).bigPicture(this.f2122e);
                if (this.f2124g) {
                    bigPicture.bigLargeIcon(this.f2123f);
                }
                if (this.f2170d) {
                    bigPicture.setSummaryText(this.f2169c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.i$c */
    /* compiled from: NotificationCompat */
    public static class C0482c extends C0485f {

        /* renamed from: e */
        private CharSequence f2125e;

        /* renamed from: a */
        public C0482c mo2641a(CharSequence charSequence) {
            this.f2125e = C0483d.m2543e(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0482c mo2642b(CharSequence charSequence) {
            this.f2168b = C0483d.m2543e(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0482c mo2643c(CharSequence charSequence) {
            this.f2169c = C0483d.m2543e(charSequence);
            this.f2170d = true;
            return this;
        }

        /* renamed from: a */
        public void mo2638a(C0477h hVar) {
            if (VERSION.SDK_INT >= 16) {
                BigTextStyle bigText = new BigTextStyle(hVar.mo2624a()).setBigContentTitle(this.f2168b).bigText(this.f2125e);
                if (this.f2170d) {
                    bigText.setSummaryText(this.f2169c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.i$d */
    /* compiled from: NotificationCompat */
    public static class C0483d {

        /* renamed from: A */
        String f2126A;

        /* renamed from: B */
        Bundle f2127B;

        /* renamed from: C */
        int f2128C;

        /* renamed from: D */
        int f2129D;

        /* renamed from: E */
        Notification f2130E;

        /* renamed from: F */
        RemoteViews f2131F;

        /* renamed from: G */
        RemoteViews f2132G;

        /* renamed from: H */
        RemoteViews f2133H;

        /* renamed from: I */
        String f2134I;

        /* renamed from: J */
        int f2135J;

        /* renamed from: K */
        String f2136K;

        /* renamed from: L */
        long f2137L;

        /* renamed from: M */
        int f2138M;

        /* renamed from: N */
        Notification f2139N;
        @Deprecated

        /* renamed from: O */
        public ArrayList<String> f2140O;

        /* renamed from: a */
        public Context f2141a;

        /* renamed from: b */
        public ArrayList<C0479a> f2142b;

        /* renamed from: c */
        ArrayList<C0479a> f2143c;

        /* renamed from: d */
        CharSequence f2144d;

        /* renamed from: e */
        CharSequence f2145e;

        /* renamed from: f */
        PendingIntent f2146f;

        /* renamed from: g */
        PendingIntent f2147g;

        /* renamed from: h */
        RemoteViews f2148h;

        /* renamed from: i */
        Bitmap f2149i;

        /* renamed from: j */
        CharSequence f2150j;

        /* renamed from: k */
        int f2151k;

        /* renamed from: l */
        int f2152l;

        /* renamed from: m */
        boolean f2153m;

        /* renamed from: n */
        boolean f2154n;

        /* renamed from: o */
        C0485f f2155o;

        /* renamed from: p */
        CharSequence f2156p;

        /* renamed from: q */
        CharSequence[] f2157q;

        /* renamed from: r */
        int f2158r;

        /* renamed from: s */
        int f2159s;

        /* renamed from: t */
        boolean f2160t;

        /* renamed from: u */
        String f2161u;

        /* renamed from: v */
        boolean f2162v;

        /* renamed from: w */
        String f2163w;

        /* renamed from: x */
        boolean f2164x;

        /* renamed from: y */
        boolean f2165y;

        /* renamed from: z */
        boolean f2166z;

        public C0483d(Context context, String str) {
            this.f2142b = new ArrayList<>();
            this.f2143c = new ArrayList<>();
            this.f2153m = true;
            this.f2164x = false;
            this.f2128C = 0;
            this.f2129D = 0;
            this.f2135J = 0;
            this.f2138M = 0;
            this.f2139N = new Notification();
            this.f2141a = context;
            this.f2134I = str;
            this.f2139N.when = System.currentTimeMillis();
            this.f2139N.audioStreamType = -1;
            this.f2152l = 0;
            this.f2140O = new ArrayList<>();
        }

        /* renamed from: a */
        public C0483d mo2647a(long j) {
            this.f2139N.when = j;
            return this;
        }

        /* renamed from: b */
        public C0483d mo2661b(CharSequence charSequence) {
            this.f2144d = m2543e(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0483d mo2666c(CharSequence charSequence) {
            this.f2156p = m2543e(charSequence);
            return this;
        }

        /* renamed from: d */
        public C0483d mo2671d(boolean z) {
            this.f2153m = z;
            return this;
        }

        /* renamed from: e */
        public C0483d mo2673e(int i) {
            this.f2139N.icon = i;
            return this;
        }

        /* renamed from: f */
        public C0483d mo2675f(int i) {
            this.f2129D = i;
            return this;
        }

        /* renamed from: g */
        public int mo2676g() {
            return this.f2152l;
        }

        /* renamed from: h */
        public long mo2677h() {
            if (this.f2153m) {
                return this.f2139N.when;
            }
            return 0;
        }

        /* renamed from: a */
        public C0483d mo2655a(CharSequence charSequence) {
            this.f2145e = m2543e(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0483d mo2660b(PendingIntent pendingIntent) {
            this.f2139N.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C0483d mo2665c(int i) {
            this.f2151k = i;
            return this;
        }

        /* renamed from: d */
        public C0483d mo2670d(CharSequence charSequence) {
            this.f2139N.tickerText = m2543e(charSequence);
            return this;
        }

        /* renamed from: e */
        public Bundle mo2672e() {
            if (this.f2127B == null) {
                this.f2127B = new Bundle();
            }
            return this.f2127B;
        }

        /* renamed from: f */
        public RemoteViews mo2674f() {
            return this.f2133H;
        }

        /* renamed from: b */
        private Bitmap m2542b(Bitmap bitmap) {
            if (bitmap != null && VERSION.SDK_INT < 27) {
                Resources resources = this.f2141a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C4018c.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C4018c.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
            return bitmap;
        }

        /* renamed from: a */
        public C0483d mo2649a(PendingIntent pendingIntent) {
            this.f2146f = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C0483d mo2667c(boolean z) {
            m2541a(8, z);
            return this;
        }

        /* renamed from: d */
        public C0483d mo2669d(int i) {
            this.f2152l = i;
            return this;
        }

        /* renamed from: a */
        public C0483d mo2650a(Bitmap bitmap) {
            this.f2149i = m2542b(bitmap);
            return this;
        }

        /* renamed from: c */
        public int mo2664c() {
            return this.f2128C;
        }

        /* renamed from: d */
        public RemoteViews mo2668d() {
            return this.f2131F;
        }

        /* renamed from: e */
        protected static CharSequence m2543e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: a */
        public C0483d mo2651a(Uri uri) {
            Notification notification = this.f2139N;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public C0483d mo2657a(boolean z) {
            m2541a(16, z);
            return this;
        }

        /* renamed from: a */
        public C0483d mo2656a(String str) {
            this.f2126A = str;
            return this;
        }

        /* renamed from: a */
        private void m2541a(int i, boolean z) {
            if (z) {
                Notification notification = this.f2139N;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f2139N;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: a */
        public C0483d mo2646a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2142b.add(new C0479a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public C0483d mo2663b(boolean z) {
            this.f2164x = z;
            return this;
        }

        @Deprecated
        public C0483d(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public C0483d mo2653a(C0479a aVar) {
            this.f2142b.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C0483d mo2659b(int i) {
            Notification notification = this.f2139N;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: a */
        public C0483d mo2654a(C0485f fVar) {
            if (this.f2155o != fVar) {
                this.f2155o = fVar;
                C0485f fVar2 = this.f2155o;
                if (fVar2 != null) {
                    fVar2.mo2685a(this);
                }
            }
            return this;
        }

        /* renamed from: b */
        public C0483d mo2662b(String str) {
            this.f2134I = str;
            return this;
        }

        /* renamed from: b */
        public RemoteViews mo2658b() {
            return this.f2132G;
        }

        /* renamed from: a */
        public C0483d mo2645a(int i) {
            this.f2128C = i;
            return this;
        }

        /* renamed from: a */
        public C0483d mo2648a(Notification notification) {
            this.f2130E = notification;
            return this;
        }

        /* renamed from: a */
        public C0483d mo2652a(RemoteViews remoteViews) {
            this.f2132G = remoteViews;
            return this;
        }

        /* renamed from: a */
        public Notification mo2644a() {
            return new C0486j(this).mo2686b();
        }
    }

    /* renamed from: androidx.core.app.i$e */
    /* compiled from: NotificationCompat */
    public static class C0484e extends C0485f {
        /* renamed from: a */
        public void mo2638a(C0477h hVar) {
            if (VERSION.SDK_INT >= 24) {
                hVar.mo2624a().setStyle(new DecoratedCustomViewStyle());
            }
        }

        /* renamed from: b */
        public RemoteViews mo2678b(C0477h hVar) {
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews b = this.f2167a.mo2658b();
            if (b == null) {
                b = this.f2167a.mo2668d();
            }
            if (b == null) {
                return null;
            }
            return m2578a(b, true);
        }

        /* renamed from: c */
        public RemoteViews mo2679c(C0477h hVar) {
            if (VERSION.SDK_INT < 24 && this.f2167a.mo2668d() != null) {
                return m2578a(this.f2167a.mo2668d(), false);
            }
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo2680d(C0477h hVar) {
            RemoteViews remoteViews;
            if (VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews f = this.f2167a.mo2674f();
            if (f != null) {
                remoteViews = f;
            } else {
                remoteViews = this.f2167a.mo2668d();
            }
            if (f == null) {
                return null;
            }
            return m2578a(remoteViews, true);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.widget.RemoteViews m2578a(android.widget.RemoteViews r7, boolean r8) {
            /*
                r6 = this;
                int r0 = p096e.p121h.C4022g.notification_template_custom_big
                r1 = 1
                r2 = 0
                android.widget.RemoteViews r0 = r6.mo2682a(r1, r0, r2)
                int r3 = p096e.p121h.C4020e.actions
                r0.removeAllViews(r3)
                if (r8 == 0) goto L_0x0039
                androidx.core.app.i$d r8 = r6.f2167a
                java.util.ArrayList<androidx.core.app.i$a> r8 = r8.f2142b
                if (r8 == 0) goto L_0x0039
                int r8 = r8.size()
                r3 = 3
                int r8 = java.lang.Math.min(r8, r3)
                if (r8 <= 0) goto L_0x0039
                r3 = 0
            L_0x0021:
                if (r3 >= r8) goto L_0x003a
                androidx.core.app.i$d r4 = r6.f2167a
                java.util.ArrayList<androidx.core.app.i$a> r4 = r4.f2142b
                java.lang.Object r4 = r4.get(r3)
                androidx.core.app.i$a r4 = (androidx.core.app.C0478i.C0479a) r4
                android.widget.RemoteViews r4 = r6.m2579a(r4)
                int r5 = p096e.p121h.C4020e.actions
                r0.addView(r5, r4)
                int r3 = r3 + 1
                goto L_0x0021
            L_0x0039:
                r1 = 0
            L_0x003a:
                if (r1 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r2 = 8
            L_0x003f:
                int r8 = p096e.p121h.C4020e.actions
                r0.setViewVisibility(r8, r2)
                int r8 = p096e.p121h.C4020e.action_divider
                r0.setViewVisibility(r8, r2)
                r6.mo2684a(r0, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0478i.C0484e.m2578a(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
        }

        /* renamed from: a */
        private RemoteViews m2579a(C0479a aVar) {
            boolean z = aVar.f2113i == null;
            RemoteViews remoteViews = new RemoteViews(this.f2167a.f2141a.getPackageName(), z ? C4022g.notification_action_tombstone : C4022g.notification_action);
            remoteViews.setImageViewBitmap(C4020e.action_image, mo2681a(aVar.mo2629e(), this.f2167a.f2141a.getResources().getColor(C4017b.notification_action_color_filter)));
            remoteViews.setTextViewText(C4020e.action_text, aVar.f2112h);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C4020e.action_container, aVar.f2113i);
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(C4020e.action_container, aVar.f2112h);
            }
            return remoteViews;
        }
    }

    /* renamed from: androidx.core.app.i$f */
    /* compiled from: NotificationCompat */
    public static abstract class C0485f {

        /* renamed from: a */
        protected C0483d f2167a;

        /* renamed from: b */
        CharSequence f2168b;

        /* renamed from: c */
        CharSequence f2169c;

        /* renamed from: d */
        boolean f2170d = false;

        /* renamed from: a */
        private static float m2584a(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        /* renamed from: a */
        public void mo2683a(Bundle bundle) {
        }

        /* renamed from: a */
        public abstract void mo2638a(C0477h hVar);

        /* renamed from: a */
        public void mo2685a(C0483d dVar) {
            if (this.f2167a != dVar) {
                this.f2167a = dVar;
                C0483d dVar2 = this.f2167a;
                if (dVar2 != null) {
                    dVar2.mo2654a(this);
                }
            }
        }

        /* renamed from: b */
        public RemoteViews mo2678b(C0477h hVar) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo2679c(C0477h hVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo2680d(C0477h hVar) {
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0210  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo2682a(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                androidx.core.app.i$d r0 = r12.f2167a
                android.content.Context r0 = r0.f2141a
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.i$d r1 = r12.f2167a
                android.content.Context r1 = r1.f2141a
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r14)
                androidx.core.app.i$d r14 = r12.f2167a
                int r14 = r14.mo2676g()
                r1 = -1
                r8 = 1
                r9 = 0
                if (r14 >= r1) goto L_0x0022
                r14 = 1
                goto L_0x0023
            L_0x0022:
                r14 = 0
            L_0x0023:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                r10 = 16
                if (r2 < r10) goto L_0x004e
                if (r2 >= r3) goto L_0x004e
                java.lang.String r2 = "setBackgroundResource"
                if (r14 == 0) goto L_0x0040
                int r14 = p096e.p121h.C4020e.notification_background
                int r4 = p096e.p121h.C4019d.notification_bg_low
                r7.setInt(r14, r2, r4)
                int r14 = p096e.p121h.C4020e.icon
                int r4 = p096e.p121h.C4019d.notification_template_icon_low_bg
                r7.setInt(r14, r2, r4)
                goto L_0x004e
            L_0x0040:
                int r14 = p096e.p121h.C4020e.notification_background
                int r4 = p096e.p121h.C4019d.notification_bg
                r7.setInt(r14, r2, r4)
                int r14 = p096e.p121h.C4020e.icon
                int r4 = p096e.p121h.C4019d.notification_template_icon_bg
                r7.setInt(r14, r2, r4)
            L_0x004e:
                androidx.core.app.i$d r14 = r12.f2167a
                android.graphics.Bitmap r2 = r14.f2149i
                r11 = 8
                if (r2 == 0) goto L_0x00b5
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r10) goto L_0x0069
                int r14 = p096e.p121h.C4020e.icon
                r7.setViewVisibility(r14, r9)
                int r14 = p096e.p121h.C4020e.icon
                androidx.core.app.i$d r2 = r12.f2167a
                android.graphics.Bitmap r2 = r2.f2149i
                r7.setImageViewBitmap(r14, r2)
                goto L_0x006e
            L_0x0069:
                int r14 = p096e.p121h.C4020e.icon
                r7.setViewVisibility(r14, r11)
            L_0x006e:
                if (r13 == 0) goto L_0x00fc
                androidx.core.app.i$d r13 = r12.f2167a
                android.app.Notification r13 = r13.f2139N
                int r13 = r13.icon
                if (r13 == 0) goto L_0x00fc
                int r13 = p096e.p121h.C4018c.notification_right_icon_size
                int r13 = r0.getDimensionPixelSize(r13)
                int r14 = p096e.p121h.C4018c.notification_small_icon_background_padding
                int r14 = r0.getDimensionPixelSize(r14)
                int r14 = r14 * 2
                int r14 = r13 - r14
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r3) goto L_0x00a0
                androidx.core.app.i$d r1 = r12.f2167a
                android.app.Notification r2 = r1.f2139N
                int r2 = r2.icon
                int r1 = r1.mo2664c()
                android.graphics.Bitmap r13 = r12.m2587a(r2, r13, r14, r1)
                int r14 = p096e.p121h.C4020e.right_icon
                r7.setImageViewBitmap(r14, r13)
                goto L_0x00af
            L_0x00a0:
                int r13 = p096e.p121h.C4020e.right_icon
                androidx.core.app.i$d r14 = r12.f2167a
                android.app.Notification r14 = r14.f2139N
                int r14 = r14.icon
                android.graphics.Bitmap r14 = r12.mo2681a(r14, r1)
                r7.setImageViewBitmap(r13, r14)
            L_0x00af:
                int r13 = p096e.p121h.C4020e.right_icon
                r7.setViewVisibility(r13, r9)
                goto L_0x00fc
            L_0x00b5:
                if (r13 == 0) goto L_0x00fc
                android.app.Notification r13 = r14.f2139N
                int r13 = r13.icon
                if (r13 == 0) goto L_0x00fc
                int r13 = p096e.p121h.C4020e.icon
                r7.setViewVisibility(r13, r9)
                int r13 = android.os.Build.VERSION.SDK_INT
                if (r13 < r3) goto L_0x00ed
                int r13 = p096e.p121h.C4018c.notification_large_icon_width
                int r13 = r0.getDimensionPixelSize(r13)
                int r14 = p096e.p121h.C4018c.notification_big_circle_margin
                int r14 = r0.getDimensionPixelSize(r14)
                int r13 = r13 - r14
                int r14 = p096e.p121h.C4018c.notification_small_icon_size_as_large
                int r14 = r0.getDimensionPixelSize(r14)
                androidx.core.app.i$d r1 = r12.f2167a
                android.app.Notification r2 = r1.f2139N
                int r2 = r2.icon
                int r1 = r1.mo2664c()
                android.graphics.Bitmap r13 = r12.m2587a(r2, r13, r14, r1)
                int r14 = p096e.p121h.C4020e.icon
                r7.setImageViewBitmap(r14, r13)
                goto L_0x00fc
            L_0x00ed:
                int r13 = p096e.p121h.C4020e.icon
                androidx.core.app.i$d r14 = r12.f2167a
                android.app.Notification r14 = r14.f2139N
                int r14 = r14.icon
                android.graphics.Bitmap r14 = r12.mo2681a(r14, r1)
                r7.setImageViewBitmap(r13, r14)
            L_0x00fc:
                androidx.core.app.i$d r13 = r12.f2167a
                java.lang.CharSequence r13 = r13.f2144d
                if (r13 == 0) goto L_0x0107
                int r14 = p096e.p121h.C4020e.title
                r7.setTextViewText(r14, r13)
            L_0x0107:
                androidx.core.app.i$d r13 = r12.f2167a
                java.lang.CharSequence r13 = r13.f2145e
                if (r13 == 0) goto L_0x0114
                int r14 = p096e.p121h.C4020e.text
                r7.setTextViewText(r14, r13)
                r13 = 1
                goto L_0x0115
            L_0x0114:
                r13 = 0
            L_0x0115:
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 >= r3) goto L_0x0121
                androidx.core.app.i$d r14 = r12.f2167a
                android.graphics.Bitmap r14 = r14.f2149i
                if (r14 == 0) goto L_0x0121
                r14 = 1
                goto L_0x0122
            L_0x0121:
                r14 = 0
            L_0x0122:
                androidx.core.app.i$d r1 = r12.f2167a
                java.lang.CharSequence r2 = r1.f2150j
                if (r2 == 0) goto L_0x0135
                int r13 = p096e.p121h.C4020e.info
                r7.setTextViewText(r13, r2)
                int r13 = p096e.p121h.C4020e.info
                r7.setViewVisibility(r13, r9)
            L_0x0132:
                r13 = 1
                r14 = 1
                goto L_0x016e
            L_0x0135:
                int r1 = r1.f2151k
                if (r1 <= 0) goto L_0x0169
                int r13 = p096e.p121h.C4021f.status_bar_notification_info_maxnum
                int r13 = r0.getInteger(r13)
                androidx.core.app.i$d r14 = r12.f2167a
                int r14 = r14.f2151k
                if (r14 <= r13) goto L_0x0151
                int r13 = p096e.p121h.C4020e.info
                int r14 = p096e.p121h.C4023h.status_bar_notification_info_overflow
                java.lang.String r14 = r0.getString(r14)
                r7.setTextViewText(r13, r14)
                goto L_0x0163
            L_0x0151:
                java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
                int r14 = p096e.p121h.C4020e.info
                androidx.core.app.i$d r1 = r12.f2167a
                int r1 = r1.f2151k
                long r1 = (long) r1
                java.lang.String r13 = r13.format(r1)
                r7.setTextViewText(r14, r13)
            L_0x0163:
                int r13 = p096e.p121h.C4020e.info
                r7.setViewVisibility(r13, r9)
                goto L_0x0132
            L_0x0169:
                int r1 = p096e.p121h.C4020e.info
                r7.setViewVisibility(r1, r11)
            L_0x016e:
                androidx.core.app.i$d r1 = r12.f2167a
                java.lang.CharSequence r1 = r1.f2156p
                if (r1 == 0) goto L_0x0194
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r10) goto L_0x0194
                int r2 = p096e.p121h.C4020e.text
                r7.setTextViewText(r2, r1)
                androidx.core.app.i$d r1 = r12.f2167a
                java.lang.CharSequence r1 = r1.f2145e
                if (r1 == 0) goto L_0x018f
                int r2 = p096e.p121h.C4020e.text2
                r7.setTextViewText(r2, r1)
                int r1 = p096e.p121h.C4020e.text2
                r7.setViewVisibility(r1, r9)
                r1 = 1
                goto L_0x0195
            L_0x018f:
                int r1 = p096e.p121h.C4020e.text2
                r7.setViewVisibility(r1, r11)
            L_0x0194:
                r1 = 0
            L_0x0195:
                if (r1 == 0) goto L_0x01b3
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r10) goto L_0x01b3
                if (r15 == 0) goto L_0x01a9
                int r15 = p096e.p121h.C4018c.notification_subtext_size
                int r15 = r0.getDimensionPixelSize(r15)
                float r15 = (float) r15
                int r0 = p096e.p121h.C4020e.text
                r7.setTextViewTextSize(r0, r9, r15)
            L_0x01a9:
                int r2 = p096e.p121h.C4020e.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x01b3:
                androidx.core.app.i$d r15 = r12.f2167a
                long r0 = r15.mo2677h()
                r2 = 0
                int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r15 == 0) goto L_0x0200
                androidx.core.app.i$d r14 = r12.f2167a
                boolean r14 = r14.f2154n
                if (r14 == 0) goto L_0x01ed
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r10) goto L_0x01ed
                int r14 = p096e.p121h.C4020e.chronometer
                r7.setViewVisibility(r14, r9)
                int r14 = p096e.p121h.C4020e.chronometer
                androidx.core.app.i$d r15 = r12.f2167a
                long r0 = r15.mo2677h()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r15 = "setBase"
                r7.setLong(r14, r15, r0)
                int r14 = p096e.p121h.C4020e.chronometer
                java.lang.String r15 = "setStarted"
                r7.setBoolean(r14, r15, r8)
                goto L_0x01ff
            L_0x01ed:
                int r14 = p096e.p121h.C4020e.time
                r7.setViewVisibility(r14, r9)
                int r14 = p096e.p121h.C4020e.time
                androidx.core.app.i$d r15 = r12.f2167a
                long r0 = r15.mo2677h()
                java.lang.String r15 = "setTime"
                r7.setLong(r14, r15, r0)
            L_0x01ff:
                r14 = 1
            L_0x0200:
                int r15 = p096e.p121h.C4020e.right_side
                if (r14 == 0) goto L_0x0206
                r14 = 0
                goto L_0x0208
            L_0x0206:
                r14 = 8
            L_0x0208:
                r7.setViewVisibility(r15, r14)
                int r14 = p096e.p121h.C4020e.line3
                if (r13 == 0) goto L_0x0210
                goto L_0x0212
            L_0x0210:
                r9 = 8
            L_0x0212:
                r7.setViewVisibility(r14, r9)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0478i.C0485f.mo2682a(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: a */
        public Bitmap mo2681a(int i, int i2) {
            return m2586a(i, i2, 0);
        }

        /* renamed from: a */
        private Bitmap m2586a(int i, int i2, int i3) {
            Drawable drawable = this.f2167a.f2141a.getResources().getDrawable(i);
            int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_IN));
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: a */
        private Bitmap m2587a(int i, int i2, int i3, int i4) {
            int i5 = C4019d.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap a = m2586a(i5, i4, i2);
            Canvas canvas = new Canvas(a);
            Drawable mutate = this.f2167a.f2141a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, Mode.SRC_ATOP));
            mutate.draw(canvas);
            return a;
        }

        /* renamed from: a */
        public void mo2684a(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m2588a(remoteViews);
            remoteViews.removeAllViews(C4020e.notification_main_column);
            remoteViews.addView(C4020e.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(C4020e.notification_main_column, 0);
            if (VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(C4020e.notification_main_column_container, 0, m2585a(), 0, 0);
            }
        }

        /* renamed from: a */
        private void m2588a(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C4020e.title, 8);
            remoteViews.setViewVisibility(C4020e.text2, 8);
            remoteViews.setViewVisibility(C4020e.text, 8);
        }

        /* renamed from: a */
        private int m2585a() {
            Resources resources = this.f2167a.f2141a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C4018c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C4018c.notification_top_pad_large_text);
            float a = (m2584a(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - a) * ((float) dimensionPixelSize)) + (a * ((float) dimensionPixelSize2)));
        }
    }

    /* renamed from: a */
    public static Bundle m2520a(Notification notification) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0487k.m2604a(notification);
        }
        return null;
    }
}
