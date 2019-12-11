package com.bamtechmedia.dominguez.discover;

import android.content.Context;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0538i.C0541c;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.collections.p079n0.C3429a;
import com.bamtechmedia.dominguez.collections.p079n0.C3429a.C3430a;
import com.bamtechmedia.dominguez.collections.p079n0.C3431b;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/discover/DiscoverAutoPagingLifecycleHelperImpl;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingLifecycleHelper;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "fragment", "Lcom/bamtechmedia/dominguez/discover/DiscoverFragment;", "isTelevision", "", "(Lcom/bamtechmedia/dominguez/discover/DiscoverFragment;Z)V", "autoPagingBehaviour", "Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingBehaviour;", "attachAutoPagingBehaviour", "", "onBackStackChanged", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "onStop", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DiscoverAutoPagingLifecycleHelperImpl.kt */
public final class DiscoverAutoPagingLifecycleHelperImpl implements C0710d, C3431b, C0541c {

    /* renamed from: U */
    private final C6099e f14026U;

    /* renamed from: V */
    private final boolean f14027V;

    /* renamed from: c */
    private C3429a f14028c;

    public DiscoverAutoPagingLifecycleHelperImpl(C6099e eVar, boolean z) {
        this.f14026U = eVar;
        this.f14027V = z;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: a */
    public void mo12602a(C3429a aVar) {
        this.f14028c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3177b() {
        /*
            r5 = this;
            com.bamtechmedia.dominguez.discover.e r0 = r5.f14026U
            androidx.fragment.app.i r0 = r0.getFragmentManager()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = r0.mo3159e()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = kotlin.p590y.C13199w.m40593h(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            com.bamtechmedia.dominguez.discover.e r2 = r5.f14026U
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r0 == 0) goto L_0x0034
            com.bamtechmedia.dominguez.collections.n0.a r0 = r5.f14028c
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.discover.e r2 = r5.f14026U
            android.content.Context r2 = r2.requireContext()
            java.lang.String r3 = "fragment.requireContext()"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            r3 = 0
            r4 = 2
            com.bamtechmedia.dominguez.collections.p079n0.C3429a.C3430a.m11713a(r0, r2, r3, r4, r1)
            goto L_0x003b
        L_0x0034:
            com.bamtechmedia.dominguez.collections.n0.a r0 = r5.f14028c
            if (r0 == 0) goto L_0x003b
            r0.mo12600a()
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.discover.DiscoverAutoPagingLifecycleHelperImpl.mo3177b():void");
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public void mo4129d(C0722m mVar) {
        if (!this.f14027V) {
            C0538i fragmentManager = this.f14026U.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.mo3155b((C0541c) this);
            }
        }
        C3429a aVar = this.f14028c;
        if (aVar != null) {
            aVar.mo12600a();
        }
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        this.f14028c = null;
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        if (!this.f14027V) {
            C0538i fragmentManager = this.f14026U.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.mo3151a((C0541c) this);
            }
        }
        C3429a aVar = this.f14028c;
        if (aVar != null) {
            Context requireContext = this.f14026U.requireContext();
            C12880j.m40222a((Object) requireContext, "fragment.requireContext()");
            C3430a.m11713a(aVar, requireContext, false, 2, null);
        }
    }
}
