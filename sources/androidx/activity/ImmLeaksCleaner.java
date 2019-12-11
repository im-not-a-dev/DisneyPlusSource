package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0720k;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements C0720k {

    /* renamed from: U */
    private static int f157U;

    /* renamed from: V */
    private static Field f158V;

    /* renamed from: W */
    private static Field f159W;

    /* renamed from: X */
    private static Field f160X;

    /* renamed from: c */
    private Activity f161c;

    ImmLeaksCleaner(Activity activity) {
        this.f161c = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        r3.isActive();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo330a(androidx.lifecycle.C0722m r3, androidx.lifecycle.C0715i.C0716a r4) {
        /*
            r2 = this;
            androidx.lifecycle.i$a r3 = androidx.lifecycle.C0715i.C0716a.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f157U
            if (r3 != 0) goto L_0x000c
            m385a()
        L_0x000c:
            int r3 = f157U
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f161c
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f158V     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f159W     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = f160X     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.mo330a(androidx.lifecycle.m, androidx.lifecycle.i$a):void");
    }

    /* renamed from: a */
    private static void m385a() {
        try {
            f157U = 2;
            f159W = InputMethodManager.class.getDeclaredField("mServedView");
            f159W.setAccessible(true);
            f160X = InputMethodManager.class.getDeclaredField("mNextServedView");
            f160X.setAccessible(true);
            f158V = InputMethodManager.class.getDeclaredField("mH");
            f158V.setAccessible(true);
            f157U = 1;
        } catch (NoSuchFieldException unused) {
        }
    }
}
