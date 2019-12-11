package p096e.p121h.p122j.p124d;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import p096e.p121h.p134r.C4117i;

/* renamed from: e.h.j.d.f */
/* compiled from: ResourcesCompat */
public final class C4039f {

    /* renamed from: e.h.j.d.f$a */
    /* compiled from: ResourcesCompat */
    public static abstract class C4040a {

        /* renamed from: e.h.j.d.f$a$a */
        /* compiled from: ResourcesCompat */
        class C4041a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Typeface f10243c;

            C4041a(Typeface typeface) {
                this.f10243c = typeface;
            }

            public void run() {
                C4040a.this.mo1957a(this.f10243c);
            }
        }

        /* renamed from: e.h.j.d.f$a$b */
        /* compiled from: ResourcesCompat */
        class C4042b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ int f10245c;

            C4042b(int i) {
                this.f10245c = i;
            }

            public void run() {
                C4040a.this.mo1956a(this.f10245c);
            }
        }

        /* renamed from: a */
        public abstract void mo1956a(int i);

        /* renamed from: a */
        public abstract void mo1957a(Typeface typeface);

        /* renamed from: a */
        public final void mo14558a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C4041a(typeface));
        }

        /* renamed from: a */
        public final void mo14557a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C4042b(i));
        }
    }

    /* renamed from: a */
    public static Drawable m13851a(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: a */
    public static Typeface m13847a(Context context, int i) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m13849a(context, i, new TypedValue(), 0, null, null, false);
    }

    /* renamed from: a */
    public static void m13852a(Context context, int i, C4040a aVar, Handler handler) throws NotFoundException {
        C4117i.m14095a(aVar);
        if (context.isRestricted()) {
            aVar.mo14557a(-4, handler);
            return;
        }
        m13849a(context, i, new TypedValue(), 0, aVar, handler, false);
    }

    /* renamed from: a */
    public static Typeface m13848a(Context context, int i, TypedValue typedValue, int i2, C4040a aVar) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m13849a(context, i, typedValue, i2, aVar, null, true);
    }

    /* renamed from: a */
    private static Typeface m13849a(Context context, int i, TypedValue typedValue, int i2, C4040a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m13850a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m13850a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p096e.p121h.p122j.p124d.C4039f.C4040a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00a7
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo14557a(r14, r10)
        L_0x0025:
            return r13
        L_0x0026:
            android.graphics.Typeface r1 = p096e.p121h.p125k.C4049c.m13904b(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo14558a(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            e.h.j.d.c$a r2 = p096e.p121h.p122j.p124d.C4031c.m13823a(r1, r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0052
            r9.mo14557a(r14, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
        L_0x0052:
            return r13
        L_0x0053:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p096e.p121h.p125k.C4049c.m13901a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r15
            android.graphics.Typeface r0 = p096e.p121h.p125k.C4049c.m13898a(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo14558a(r0, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.mo14557a(r14, r10)     // Catch:{ XmlPullParserException -> 0x008c, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x00a1
        L_0x008c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x00a1:
            if (r9 == 0) goto L_0x00a6
            r9.mo14557a(r14, r10)
        L_0x00a6:
            return r13
        L_0x00a7:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p122j.p124d.C4039f.m13850a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, e.h.j.d.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
