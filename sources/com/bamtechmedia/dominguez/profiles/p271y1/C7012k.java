package com.bamtechmedia.dominguez.profiles.p271y1;

import android.content.Context;
import android.content.res.Resources;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import com.bamtechmedia.dominguez.profiles.C6653e;
import com.bamtechmedia.dominguez.profiles.C6657f;
import com.bamtechmedia.dominguez.profiles.C6725m1.C6726a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p590y.C13180m;
import p163g.p201e.p203b.p330z.C7944c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002J:\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00130\u001c2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J@\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00130\u001c2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/picker/ProfilesTvPresenter;", "", "context", "Landroid/content/Context;", "accessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "avatarImages", "Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;Lcom/bamtechmedia/dominguez/profiles/AvatarImages;)V", "startMargin", "", "createAddItem", "", "Lcom/bamtechmedia/dominguez/profiles/picker/ProfileViewTvItem;", "profilesSize", "onAddProfileClick", "Lkotlin/Function0;", "", "isEditMode", "", "size", "createViewState", "Lcom/bamtechmedia/dominguez/profiles/picker/ProfilesTvPresenter$ViewState;", "state", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel$State;", "onItemClick", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "getProfilesTvItems", "ViewState", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.y1.k */
/* compiled from: ProfilesTvPresenter.kt */
public final class C7012k {

    /* renamed from: a */
    private final int f15575a = ((int) this.f15576b.getResources().getDimension(C7944c.profile_start_margin));

    /* renamed from: b */
    private final Context f15576b;

    /* renamed from: c */
    private final C6629d0 f15577c;

    /* renamed from: d */
    private final C6627c1 f15578d;

    /* renamed from: e */
    private final C6657f f15579e;

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.k$a */
    /* compiled from: ProfilesTvPresenter.kt */
    public static final class C7013a {

        /* renamed from: a */
        private final List<C7008j> f15580a;

        /* renamed from: b */
        private final boolean f15581b;

        public C7013a() {
            this(null, false, 3, null);
        }

        public C7013a(List<C7008j> list, boolean z) {
            this.f15580a = list;
            this.f15581b = z;
        }

        /* renamed from: a */
        public final List<C7008j> mo19777a() {
            return this.f15580a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7013a) {
                    C7013a aVar = (C7013a) obj;
                    if (Intrinsics.areEqual((Object) this.f15580a, (Object) aVar.f15580a)) {
                        if (this.f15581b == aVar.f15581b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<C7008j> list = this.f15580a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            boolean z = this.f15581b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewState(profiles=");
            sb.append(this.f15580a);
            sb.append(", isLoading=");
            sb.append(this.f15581b);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7013a(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            this(list, z);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.k$b */
    /* compiled from: ProfilesTvPresenter.kt */
    static final class C7014b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ Function0 f15582c;

        C7014b(Function0 function0) {
            this.f15582c = function0;
            super(0);
        }

        public final void invoke() {
            this.f15582c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.k$c */
    /* compiled from: ProfilesTvPresenter.kt */
    static final class C7015c extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ Function1 f15583U;

        /* renamed from: c */
        final /* synthetic */ C6626c0 f15584c;

        C7015c(C6626c0 c0Var, C7012k kVar, boolean z, Function1 function1, int i) {
            this.f15584c = c0Var;
            this.f15583U = function1;
            super(0);
        }

        public final void invoke() {
            this.f15583U.invoke(this.f15584c);
        }
    }

    public C7012k(Context context, C6629d0 d0Var, C6627c1 c1Var, C6657f fVar) {
        this.f15576b = context;
        this.f15577c = d0Var;
        this.f15578d = c1Var;
        this.f15579e = fVar;
    }

    /* renamed from: b */
    private final List<C7008j> m21309b(C6726a aVar, boolean z, Function1<? super C6626c0, C13145v> function1, Function0<C13145v> function0) {
        int i;
        boolean z2 = z;
        float dimension = this.f15576b.getResources().getDimension(C7944c.vader_grid_start_margin);
        Resources resources = this.f15576b.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, "context.resources");
        int i2 = (int) (((((float) resources.getDisplayMetrics().widthPixels) - (dimension * ((float) 2))) - ((float) (this.f15575a * 7))) / ((float) 7));
        List d = aVar.mo19449d();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) d, 10));
        int i3 = 0;
        for (Object next : d) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C6626c0 c0Var = (C6626c0) next;
                String profileName = c0Var.getProfileName();
                C6653e a = this.f15578d.mo19285a(c0Var.mo19364j());
                boolean z3 = !z2 && c0Var.mo19353Q();
                C7015c cVar = new C7015c(c0Var, this, z, function1, i2);
                String a2 = this.f15577c.mo19295a(z2, profileName);
                if (i3 == 0) {
                    i = 0;
                } else {
                    i = this.f15575a;
                }
                C7008j jVar = r7;
                ArrayList arrayList2 = arrayList;
                int i5 = i2;
                int i6 = i2;
                int i7 = i;
                boolean z4 = z2;
                C7008j jVar2 = new C7008j(a, profileName, cVar, z, z3, i5, i7, a2, this.f15579e);
                arrayList2.add(jVar);
                z2 = z4;
                arrayList = arrayList2;
                i2 = i6;
                i3 = i4;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        return C13199w.m40583d((Collection) arrayList, (Iterable) m21308a(aVar.mo19449d().size(), function0, z2, i2));
    }

    /* renamed from: a */
    public final C7013a mo19776a(C6726a aVar, boolean z, Function1<? super C6626c0, C13145v> function1, Function0<C13145v> function0) {
        if (aVar.mo19448c()) {
            return new C7013a(null, true, 1, null);
        }
        return new C7013a(m21309b(aVar, z, function1, function0), false, 2, null);
    }

    /* renamed from: a */
    private final List<C7008j> m21308a(int i, Function0<C13145v> function0, boolean z, int i2) {
        if (i >= 7) {
            return C13185o.m40513a();
        }
        int i3 = i2;
        C7008j jVar = new C7008j(null, null, new C7014b(function0), false, false, i3, this.f15575a, this.f15577c.mo19294a(z), this.f15579e, 27, null);
        return C13183n.m40498a(jVar);
    }
}
