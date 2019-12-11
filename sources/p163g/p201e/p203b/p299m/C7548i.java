package p163g.p201e.p203b.p299m;

import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0564o;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.dialogs.tier2.C6062c;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p299m.p300y.C7568b;
import p163g.p201e.p203b.p299m.p300y.C7570d;
import p163g.p201e.p203b.p299m.p300y.C7576g;
import p163g.p201e.p203b.p299m.p304z.C7582a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialogs/DialogRouterImpl;", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "activityNavigation", "Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;", "tier2Factory", "Lcom/bamtechmedia/dominguez/dialogs/tier2/Tier2Factory;", "(Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;Lcom/bamtechmedia/dominguez/dialogs/tier2/Tier2Factory;)V", "showAlertDialog", "", "arguments", "Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;", "showFlashMessage", "fragment", "Landroidx/fragment/app/Fragment;", "icon", "Lcom/bamtechmedia/dominguez/dialogs/tier0/Tier0MessageIcon;", "titleId", "", "title", "", "showFullscreenDialog", "dialogArguments", "toggleDownloadsHint", "visible", "", "findContainer", "Lcom/bamtechmedia/dominguez/dialogs/tier0/FlashMessageContainer;", "Landroidx/fragment/app/FragmentManager;", "dialogs_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.m.i */
/* compiled from: DialogRouterImpl.kt */
public final class C7548i implements C7547h {

    /* renamed from: a */
    private final C5773a f16554a;

    /* renamed from: b */
    private final C6062c f16555b;

    /* renamed from: g.e.b.m.i$a */
    /* compiled from: DialogRouterImpl.kt */
    static final class C7549a extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: U */
        final /* synthetic */ Fragment f16556U;

        /* renamed from: c */
        final /* synthetic */ C7548i f16557c;

        C7549a(C7548i iVar, Fragment fragment) {
            this.f16557c = iVar;
            this.f16556U = fragment;
            super(1);
        }

        /* renamed from: a */
        public final void mo20492a(C0532d dVar) {
            C7548i iVar = this.f16557c;
            C0538i supportFragmentManager = dVar.getSupportFragmentManager();
            Intrinsics.checkReturnedValueIsNotNull((Object) supportFragmentManager, "supportFragmentManager");
            C7568b a = iVar.m22505a(supportFragmentManager);
            if (a == null) {
                a = (C7568b) (!(dVar instanceof C7568b) ? null : dVar);
            }
            if (a != null) {
                a.mo20497a(this.f16556U);
                return;
            }
            C0564o a2 = dVar.getSupportFragmentManager().mo3147a();
            a2.mo3311a(16908290, this.f16556U);
            a2.mo3030a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20492a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    public C7548i(C5773a aVar, C6062c cVar) {
        this.f16554a = aVar;
        this.f16555b = cVar;
    }

    /* renamed from: b */
    public void mo20491b(C7543f fVar) {
        this.f16555b.mo18314a(this.f16554a, fVar);
    }

    /* renamed from: a */
    public void mo20490a(C7576g gVar, String str) {
        m22507a((Fragment) C7570d.f16570X.mo20510a(str, gVar));
    }

    /* renamed from: a */
    public void mo20489a(C7576g gVar, int i) {
        m22507a((Fragment) C7570d.f16570X.mo20509a(i, gVar));
    }

    /* renamed from: a */
    private final void m22507a(Fragment fragment) {
        this.f16554a.mo17670a((Function1<? super C0532d, C13145v>) new C7549a<Object,C13145v>(this, fragment));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C7568b m22505a(C0538i iVar) {
        Fragment f = iVar.mo3160f();
        if (f != null) {
            C0538i childFragmentManager = f.getChildFragmentManager();
            if (childFragmentManager != null) {
                C7568b a = m22505a(childFragmentManager);
                if (a != null) {
                    return a;
                }
            }
        }
        if (!(f instanceof C7568b)) {
            f = null;
        }
        return (C7568b) f;
    }

    /* renamed from: a */
    public void mo20488a(C7543f fVar) {
        C7582a.f16594X.mo20519a(this.f16554a, fVar);
    }
}
