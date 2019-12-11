package com.bamtechmedia.dominguez.core.p084g;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import kotlin.UninitializedPropertyAccessException;
import kotlin.C13145v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p686n.p687a.Timber;

/* renamed from: com.bamtechmedia.dominguez.core.g.b */
/* compiled from: TransitionAnimationHelper.kt */
public final class C3807b {

    /* renamed from: a */
    private View f9451a;

    /* renamed from: b */
    private View f9452b;

    /* renamed from: c */
    private Context f9453c;

    /* renamed from: d */
    private boolean f9454d;

    /* renamed from: e */
    private float f9455e;

    /* renamed from: f */
    private float f9456f;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13709a(android.view.View r5, android.view.View r6, android.app.Activity r7) {
        /*
            r4 = this;
            r4.f9451a = r5
            r4.f9452b = r6
            android.content.Context r5 = r7.getApplicationContext()
            java.lang.String r6 = "activity.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r6)
            r4.f9453c = r5
            android.content.Context r5 = r4.f9453c
            r6 = 0
            java.lang.String r0 = "context"
            if (r5 == 0) goto L_0x008d
            boolean r5 = com.bamtechmedia.dominguez.core.utils.C5837i.m18842d(r5)
            r1 = 1
            if (r5 != 0) goto L_0x002e
            android.content.Context r5 = r4.f9453c
            if (r5 == 0) goto L_0x002a
            boolean r5 = com.bamtechmedia.dominguez.core.utils.C5837i.m18843e(r5)
            if (r5 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            r5 = 0
            goto L_0x002f
        L_0x002a:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r6
        L_0x002e:
            r5 = 1
        L_0x002f:
            r4.f9454d = r5
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            android.view.WindowManager r7 = r7.getWindowManager()
            java.lang.String r2 = "activity.windowManager"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r2)
            android.view.Display r7 = r7.getDefaultDisplay()
            r7.getMetrics(r5)
            boolean r7 = r4.f9454d
            java.lang.String r2 = "resources"
            r3 = 1123024896(0x42f00000, float:120.0)
            if (r7 == 0) goto L_0x0066
            android.content.Context r7 = r4.f9453c
            if (r7 == 0) goto L_0x0062
            android.content.res.Resources r7 = r7.getResources()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r2)
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = android.util.TypedValue.applyDimension(r1, r3, r7)
            goto L_0x0069
        L_0x0062:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r6
        L_0x0066:
            int r7 = r5.widthPixels
            float r7 = (float) r7
        L_0x0069:
            r4.f9455e = r7
            boolean r7 = r4.f9454d
            if (r7 == 0) goto L_0x0087
            android.content.Context r5 = r4.f9453c
            if (r5 == 0) goto L_0x0083
            android.content.res.Resources r5 = r5.getResources()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r2)
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = android.util.TypedValue.applyDimension(r1, r3, r5)
            goto L_0x008a
        L_0x0083:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r6
        L_0x0087:
            int r5 = r5.heightPixels
            float r5 = (float) r5
        L_0x008a:
            r4.f9456f = r5
            return
        L_0x008d:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.p084g.C3807b.mo13709a(android.view.View, android.view.View, android.app.Activity):void");
    }

    /* renamed from: b */
    public final void mo13711b() {
        try {
            View view = this.f9451a;
            if (view != null) {
                C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 0, null, null, null, null, 258046, null);
                View view2 = this.f9452b;
                if (view2 != null) {
                    C3800a.m12829a(view2, this.f9454d ? 0.0f : 1.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, this.f9455e, 0.0f, 0.0f, 0.0f, 300, this.f9454d ? 150 : 0, null, null, null, null, 249598, null);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("modalView");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
            throw null;
        } catch (UninitializedPropertyAccessException unused) {
            Timber.m44526b("UninitializedPropertyAccessException: please call prepare(...) before entranceFromRightSide(...) ", new Object[0]);
        }
    }

    /* renamed from: b */
    public final boolean mo13712b(Function0<C13145v> function0) {
        try {
            View view = this.f9451a;
            if (view != null) {
                C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 150, 150, null, null, function0, null, 184317, null);
                View view2 = this.f9452b;
                if (view2 != null) {
                    C3800a.m12829a(view2, 0.0f, this.f9454d ? 0.0f : 1.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, this.f9456f, 0.0f, 0.0f, 300, 0, new AccelerateInterpolator(), null, null, null, 241149, null);
                    return true;
                }
                Intrinsics.throwUninitializedPropertyAccessException("modalView");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
            throw null;
        } catch (UninitializedPropertyAccessException unused) {
            Timber.m44526b("UninitializedPropertyAccessException: please call prepare(...) before exitToRightSide(...) ", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo13708a() {
        try {
            View view = this.f9451a;
            if (view != null) {
                C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 0, null, null, null, null, 258046, null);
                View view2 = this.f9452b;
                if (view2 != null) {
                    C3800a.m12829a(view2, this.f9454d ? 0.0f : 1.0f, 0.0f, 0.0f, 0.0f, null, null, this.f9456f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, this.f9454d ? 150 : 0, null, null, null, null, 249790, null);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("modalView");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
            throw null;
        } catch (UninitializedPropertyAccessException unused) {
            Timber.m44526b("UninitializedPropertyAccessException: please call prepare(...) before entranceFromBottom(...) ", new Object[0]);
        }
    }

    /* renamed from: a */
    public final boolean mo13710a(Function0<C13145v> function0) {
        try {
            View view = this.f9451a;
            if (view != null) {
                C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 150, 150, null, null, function0, null, 184317, null);
                View view2 = this.f9452b;
                if (view2 != null) {
                    C3800a.m12829a(view2, 0.0f, this.f9454d ? 0.0f : 1.0f, 0.0f, 0.0f, null, null, 0.0f, this.f9456f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 0, new AccelerateInterpolator(), null, null, null, 241533, null);
                    return true;
                }
                Intrinsics.throwUninitializedPropertyAccessException("modalView");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
            throw null;
        } catch (UninitializedPropertyAccessException unused) {
            Timber.m44526b("UninitializedPropertyAccessException: please call prepare(...) before exitToBottom(...) ", new Object[0]);
        }
    }
}
