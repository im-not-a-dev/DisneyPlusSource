package p163g.p174d.p178b.p185g0.p187w5;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings.System;
import android.view.OrientationEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5300m.C5302b;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003\u001a\f\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\n\u001a(\u0010\u000b\u001a\u00020\u0001*\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\r"}, mo31007d2 = {"subscribeToOrientationSensorChanged", "", "activity", "Landroid/app/Activity;", "orientationEventListener", "Landroid/view/OrientationEventListener;", "events", "Lcom/bamtech/player/PlayerEvents;", "isLandscape", "", "Landroid/content/Context;", "toggleOrientation", "enableOrientationRotation", "bamplayer-core_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.w5.b */
/* compiled from: OrientationUtils.kt */
public final class C5187b {

    /* renamed from: g.d.b.g0.w5.b$a */
    /* compiled from: OrientationUtils.kt */
    static final class C5188a<T> implements C11952h<Integer> {

        /* renamed from: c */
        final /* synthetic */ Activity f12513c;

        C5188a(Activity activity) {
            this.f12513c = activity;
        }

        /* renamed from: a */
        public final boolean test(Integer num) {
            Resources resources = this.f12513c.getResources();
            Intrinsics.checkReturnedValueIsNotNull((Object) resources, "activity.resources");
            return num.intValue() == resources.getConfiguration().orientation;
        }
    }

    /* renamed from: g.d.b.g0.w5.b$b */
    /* compiled from: OrientationUtils.kt */
    static final class C5189b<T> implements Consumer<Integer> {

        /* renamed from: U */
        final /* synthetic */ OrientationEventListener f12514U;

        /* renamed from: c */
        final /* synthetic */ Activity f12515c;

        C5189b(Activity activity, OrientationEventListener orientationEventListener) {
            this.f12515c = activity;
            this.f12514U = orientationEventListener;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            this.f12515c.setRequestedOrientation(13);
            this.f12514U.disable();
        }
    }

    /* renamed from: g.d.b.g0.w5.b$c */
    /* compiled from: OrientationUtils.kt */
    static final class C5190c<T> implements Consumer<C5302b> {

        /* renamed from: c */
        final /* synthetic */ OrientationEventListener f12516c;

        C5190c(OrientationEventListener orientationEventListener) {
            this.f12516c = orientationEventListener;
        }

        /* renamed from: a */
        public final void accept(C5302b bVar) {
            this.f12516c.disable();
        }
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public static final void m17510a(Activity activity, C5300m mVar, boolean z, OrientationEventListener orientationEventListener) {
        boolean z2 = false;
        if (activity == null || activity.isFinishing()) {
            Timber.m44532e("Attempting to toggle an Activity that has already been released.", new Object[0]);
            return;
        }
        Resources resources = activity.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
        int i = resources.getConfiguration().orientation;
        if (i == 1) {
            activity.setRequestedOrientation(6);
            mVar.mo17026e(2);
        }
        if (i == 2) {
            activity.setRequestedOrientation(7);
            mVar.mo17026e(1);
        }
        if (System.getInt(activity.getContentResolver(), "accelerometer_rotation") == 1) {
            z2 = true;
        }
        if (z2 && z) {
            m17509a(activity, orientationEventListener, mVar);
            mVar.mo16957M().mo30192f((Consumer<? super T>) new C5190c<Object>(orientationEventListener));
        }
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    private static final void m17509a(Activity activity, OrientationEventListener orientationEventListener, C5300m mVar) {
        orientationEventListener.enable();
        mVar.mo16979Y().mo30175c(1).mo30170b((C11952h<? super T>) new C5188a<Object>(activity)).mo30183d(1).mo30192f((Consumer<? super T>) new C5189b<Object>(activity, orientationEventListener));
    }

    /* renamed from: a */
    public static final boolean m17511a(Context context) {
        if (context != null) {
            Resources resources = context.getResources();
            Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
            if (resources.getConfiguration().orientation == 2) {
                return true;
            }
        }
        return false;
    }
}
