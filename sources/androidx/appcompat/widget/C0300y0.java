package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.y0 */
/* compiled from: VectorEnabledTintResources */
public class C0300y0 extends Resources {

    /* renamed from: b */
    private static boolean f1322b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1323a;

    public C0300y0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1323a = new WeakReference<>(context);
    }

    /* renamed from: b */
    public static boolean m1623b() {
        return m1622a() && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo2024a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.f1323a.get();
        if (context != null) {
            return C0242j0.m1346a().mo1694a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* renamed from: a */
    public static boolean m1622a() {
        return f1322b;
    }
}
