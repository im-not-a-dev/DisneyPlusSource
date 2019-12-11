package com.bamtechmedia.dominguez.profiles.p266v1;

import com.bamtechmedia.dominguez.collections.items.C3345c;
import com.bamtechmedia.dominguez.core.content.C3593a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.profiles.C6671h0;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p330z.C7949h;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001a\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001bH\u0016J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0018R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/avatar/ChooseAvatarViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/profiles/avatar/ChooseAvatarViewModel$State;", "Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;", "isEditMode", "", "tempProfile", "Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "profileNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "requestCode", "", "(ZLcom/bamtechmedia/dominguez/profiles/TempProfile;Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;I)V", "defaultAvatarList", "", "Lcom/bamtechmedia/dominguez/core/content/Avatar;", "profile", "profile$annotations", "()V", "getProfile", "()Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "setProfile", "(Lcom/bamtechmedia/dominguez/profiles/TempProfile;)V", "cacheHiddenAvatars", "", "hiddenAssets", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "onAvatarSelected", "avatarId", "", "avatarUserSelected", "onDetailClicked", "item", "onPlayClicked", "skip", "startNext", "State", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.v1.h */
/* compiled from: ChooseAvatarViewModel.kt */
public final class C6882h extends C5741g<C6883a> implements C3345c {

    /* renamed from: U */
    private C6780r1 f15335U;

    /* renamed from: V */
    private final boolean f15336V;

    /* renamed from: W */
    private final C6780r1 f15337W;

    /* renamed from: X */
    private final C6671h0 f15338X;

    /* renamed from: Y */
    private final int f15339Y;

    /* renamed from: c */
    private final List<C3593a> f15340c = new ArrayList();

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.h$a */
    /* compiled from: ChooseAvatarViewModel.kt */
    public static final class C6883a {

        /* renamed from: a */
        private final boolean f15341a;

        /* renamed from: b */
        private final String f15342b;

        /* renamed from: c */
        private final boolean f15343c;

        public C6883a() {
            this(false, null, false, 7, null);
        }

        public C6883a(boolean z, String str, boolean z2) {
            this.f15341a = z;
            this.f15342b = str;
            this.f15343c = z2;
        }

        /* renamed from: a */
        public final String mo19650a() {
            return this.f15342b;
        }

        /* renamed from: b */
        public final boolean mo19651b() {
            return this.f15343c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6883a) {
                    C6883a aVar = (C6883a) obj;
                    if ((this.f15341a == aVar.f15341a) && Intrinsics.areEqual((Object) this.f15342b, (Object) aVar.f15342b)) {
                        if (this.f15343c == aVar.f15343c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f15341a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            String str = this.f15342b;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z2 = this.f15343c;
            if (!z2) {
                i = z2;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(loading=");
            sb.append(this.f15341a);
            sb.append(", error=");
            sb.append(this.f15342b);
            sb.append(", isFinish=");
            sb.append(this.f15343c);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C6883a(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            this(z, str, z2);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.h$b */
    /* compiled from: ChooseAvatarViewModel.kt */
    static final class C6884b extends C12881k implements Function1<C6883a, C6883a> {

        /* renamed from: c */
        public static final C6884b f15344c = new C6884b();

        C6884b() {
            super(1);
        }

        /* renamed from: a */
        public final C6883a invoke(C6883a aVar) {
            C6883a aVar2 = new C6883a(false, null, true, 3, null);
            return aVar2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.h$c */
    /* compiled from: ChooseAvatarViewModel.kt */
    static final class C6885c extends C12881k implements Function1<C6883a, C6883a> {

        /* renamed from: c */
        public static final C6885c f15345c = new C6885c();

        C6885c() {
            super(1);
        }

        /* renamed from: a */
        public final C6883a invoke(C6883a aVar) {
            C6883a aVar2 = new C6883a(false, C5880u.m18936a(C7949h.error_generic), false, 5, null);
            return aVar2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.h$d */
    /* compiled from: ChooseAvatarViewModel.kt */
    static final class C6886d extends C12881k implements Function1<C6883a, C6883a> {

        /* renamed from: c */
        public static final C6886d f15346c = new C6886d();

        C6886d() {
            super(1);
        }

        /* renamed from: a */
        public final C6883a invoke(C6883a aVar) {
            C6883a aVar2 = new C6883a(false, null, false, 3, null);
            return aVar2;
        }
    }

    public C6882h(boolean z, C6780r1 r1Var, C6671h0 h0Var, int i) {
        super(null, 1, null);
        this.f15336V = z;
        this.f15337W = r1Var;
        this.f15338X = h0Var;
        this.f15339Y = i;
        C6883a aVar = new C6883a(false, null, false, 7, null);
        createState(aVar);
    }

    /* renamed from: a */
    public void mo12436a(C3626b bVar) {
        if (bVar instanceof C3593a) {
            m21077a(((C3593a) bVar).mo12824j(), true);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can not handle item of type: ");
        sb.append(bVar.getClass());
        Timber.m44532e(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void mo12437a(C3626b bVar, int i) {
    }

    /* renamed from: y */
    public final void mo19648y() {
        String j = this.f15340c.isEmpty() ^ true ? ((C3593a) this.f15340c.get(0)).mo12824j() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("## Choose Avatars -> user elected to skip avatar selection: using avatar with id: ");
        sb.append(j);
        Timber.m44522a(sb.toString(), new Object[0]);
        m21077a(j, false);
    }

    /* renamed from: z */
    public final void mo19649z() {
        C6780r1 r1Var = this.f15335U;
        if (r1Var != null) {
            if (1000 == this.f15339Y) {
                this.f15338X.mo19394a(r1Var);
            } else if (!this.f15336V) {
                this.f15338X.mo19401c(r1Var);
            } else {
                this.f15338X.mo19400b(r1Var);
            }
        }
        updateState(C6886d.f15346c);
    }

    /* renamed from: a */
    private final void m21077a(String str, boolean z) {
        if (!(str == null || str.length() == 0)) {
            this.f15335U = C6780r1.m20868a(this.f15337W, null, null, false, false, false, str, z, false, null, null, false, 1951, null);
            updateState(C6884b.f15344c);
            return;
        }
        updateState(C6885c.f15345c);
    }

    /* renamed from: a */
    public final void mo19647a(List<? extends C3626b> list) {
        this.f15340c.clear();
        for (C3626b bVar : list) {
            if (bVar instanceof C3593a) {
                this.f15340c.add(bVar);
            }
        }
    }
}
