package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.q0 */
/* compiled from: TintContextWrapper */
public class C0267q0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1195c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0267q0>> f1196d;

    /* renamed from: a */
    private final Resources f1197a;

    /* renamed from: b */
    private final Theme f1198b;

    private C0267q0(Context context) {
        super(context);
        if (C0300y0.m1623b()) {
            this.f1197a = new C0300y0(this, context.getResources());
            this.f1198b = this.f1197a.newTheme();
            this.f1198b.setTo(context.getTheme());
            return;
        }
        this.f1197a = new C0271s0(this, context.getResources());
        this.f1198b = null;
    }

    /* renamed from: a */
    private static boolean m1438a(Context context) {
        if ((context instanceof C0267q0) || (context.getResources() instanceof C0271s0) || (context.getResources() instanceof C0300y0)) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || C0300y0.m1623b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Context m1439b(Context context) {
        if (!m1438a(context)) {
            return context;
        }
        synchronized (f1195c) {
            if (f1196d == null) {
                f1196d = new ArrayList<>();
            } else {
                for (int size = f1196d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f1196d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1196d.remove(size);
                    }
                }
                for (int size2 = f1196d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f1196d.get(size2);
                    C0267q0 q0Var = weakReference2 != null ? (C0267q0) weakReference2.get() : null;
                    if (q0Var != null && q0Var.getBaseContext() == context) {
                        return q0Var;
                    }
                }
            }
            C0267q0 q0Var2 = new C0267q0(context);
            f1196d.add(new WeakReference(q0Var2));
            return q0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1197a.getAssets();
    }

    public Resources getResources() {
        return this.f1197a;
    }

    public Theme getTheme() {
        Theme theme = this.f1198b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Theme theme = this.f1198b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
