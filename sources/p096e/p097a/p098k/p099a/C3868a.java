package p096e.p097a.p098k.p099a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0242j0;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p122j.p124d.C4029a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.k.a.a */
/* compiled from: AppCompatResources */
public final class C3868a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f9536a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C3869a>> f9537b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f9538c = new Object();

    /* renamed from: e.a.k.a.a$a */
    /* compiled from: AppCompatResources */
    private static class C3869a {

        /* renamed from: a */
        final ColorStateList f9539a;

        /* renamed from: b */
        final Configuration f9540b;

        C3869a(ColorStateList colorStateList, Configuration configuration) {
            this.f9539a = colorStateList;
            this.f9540b = configuration;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m12942a(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f9538c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<e.a.k.a.a$a>> r1 = f9537b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            e.a.k.a.a$a r2 = (p096e.p097a.p098k.p099a.C3868a.C3869a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f9540b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f9539a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p097a.p098k.p099a.C3868a.m12942a(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: b */
    public static ColorStateList m12945b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a = m12942a(context, i);
        if (a != null) {
            return a;
        }
        ColorStateList d = m12947d(context, i);
        if (d == null) {
            return C4025a.m13795b(context, i);
        }
        m12944a(context, i, d);
        return d;
    }

    /* renamed from: c */
    public static Drawable m12946c(Context context, int i) {
        return C0242j0.m1346a().mo1692a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m12947d(Context context, int i) {
        if (m12948e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C4029a.m13806a(resources, (XmlPullParser) resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m12948e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m12943a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m12944a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f9538c) {
            SparseArray sparseArray = (SparseArray) f9537b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f9537b.put(context, sparseArray);
            }
            sparseArray.append(i, new C3869a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: a */
    private static TypedValue m12943a() {
        TypedValue typedValue = (TypedValue) f9536a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f9536a.set(typedValue2);
        return typedValue2;
    }
}
