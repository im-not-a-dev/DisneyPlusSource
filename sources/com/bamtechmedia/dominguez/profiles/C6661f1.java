package com.bamtechmedia.dominguez.profiles;

import android.content.Context;
import com.bamtechmedia.dominguez.profiles.C6725m1.C6726a;
import com.bamtechmedia.dominguez.profiles.p262t1.C6847a;
import com.bamtechmedia.dominguez.profiles.p271y1.C6970a;
import com.bamtechmedia.dominguez.profiles.p271y1.C7006i;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001#B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J4\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u001c2\u0006\u0010\b\u001a\u00020\tH\u0002JF\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 JL\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesPresenter;", "", "context", "Landroid/content/Context;", "analytics", "Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalytics;", "avatarImages", "Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "accessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalytics;Lcom/bamtechmedia/dominguez/profiles/AvatarImages;Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;)V", "createAddButtonIfNecessary", "", "Lcom/bamtechmedia/dominguez/profiles/picker/AddProfileViewItem;", "state", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel$State;", "isEditMode", "", "onAddProfileClick", "Lkotlin/Function0;", "", "createProfileViewItem", "Lcom/bamtechmedia/dominguez/profiles/picker/ProfileViewItem;", "profile", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "onItemClick", "Lkotlin/Function1;", "createViewState", "Lcom/bamtechmedia/dominguez/profiles/ProfilesPresenter$ViewState;", "title", "", "getProfileItems", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "ViewState", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.f1 */
/* compiled from: ProfilesPresenter.kt */
public final class C6661f1 {

    /* renamed from: a */
    private final Context f15006a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6847a f15007b;

    /* renamed from: c */
    private final C6657f f15008c;

    /* renamed from: d */
    private final C6629d0 f15009d;

    /* renamed from: e */
    private final C6627c1 f15010e;

    /* renamed from: com.bamtechmedia.dominguez.profiles.f1$a */
    /* compiled from: ProfilesPresenter.kt */
    public static final class C6662a {

        /* renamed from: a */
        private final List<C11847b> f15011a;

        /* renamed from: b */
        private final boolean f15012b;

        /* renamed from: c */
        private final boolean f15013c;

        public C6662a() {
            this(null, false, false, 7, null);
        }

        public C6662a(List<? extends C11847b> list, boolean z, boolean z2) {
            this.f15011a = list;
            this.f15012b = z;
            this.f15013c = z2;
        }

        /* renamed from: a */
        public final List<C11847b> mo19370a() {
            return this.f15011a;
        }

        /* renamed from: b */
        public final boolean mo19371b() {
            return this.f15012b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6662a) {
                    C6662a aVar = (C6662a) obj;
                    if (C12880j.m40224a((Object) this.f15011a, (Object) aVar.f15011a)) {
                        if (this.f15012b == aVar.f15012b) {
                            if (this.f15013c == aVar.f15013c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<C11847b> list = this.f15011a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            boolean z = this.f15012b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z2 = this.f15013c;
            if (z2) {
                z2 = true;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewState(profiles=");
            sb.append(this.f15011a);
            sb.append(", isLoading=");
            sb.append(this.f15012b);
            sb.append(", isError=");
            sb.append(this.f15013c);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C6662a(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            this(list, z, z2);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.f1$b */
    /* compiled from: ProfilesPresenter.kt */
    static final class C6663b extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ Function0 f15014U;

        /* renamed from: c */
        final /* synthetic */ C6661f1 f15015c;

        C6663b(C6661f1 f1Var, Function0 function0) {
            this.f15015c = f1Var;
            this.f15014U = function0;
            super(0);
        }

        public final void invoke() {
            this.f15014U.invoke();
            this.f15015c.f15007b.mo19616a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.f1$c */
    /* compiled from: ProfilesPresenter.kt */
    static final class C6664c extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ C6626c0 f15016U;

        /* renamed from: c */
        final /* synthetic */ Function1 f15017c;

        C6664c(Function1 function1, C6626c0 c0Var) {
            this.f15017c = function1;
            this.f15016U = c0Var;
            super(0);
        }

        public final void invoke() {
            this.f15017c.invoke(this.f15016U);
        }
    }

    public C6661f1(Context context, C6847a aVar, C6657f fVar, C6629d0 d0Var, C6627c1 c1Var) {
        this.f15006a = context;
        this.f15007b = aVar;
        this.f15008c = fVar;
        this.f15009d = d0Var;
        this.f15010e = c1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r10 != null) goto L_0x0012;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<p163g.p509o.p510a.p511l.C11866a> m20657b(com.bamtechmedia.dominguez.profiles.C6725m1.C6726a r6, boolean r7, kotlin.jvm.functions.Function1<? super com.bamtechmedia.dominguez.profiles.C6626c0, kotlin.C13145v> r8, kotlin.jvm.functions.Function0<kotlin.C13145v> r9, java.lang.String r10) {
        /*
            r5 = this;
            if (r10 == 0) goto L_0x000e
            com.bamtechmedia.dominguez.profiles.y1.m r0 = new com.bamtechmedia.dominguez.profiles.y1.m
            r0.<init>(r10, r7)
            java.util.List r10 = kotlin.p590y.C13183n.m40498a(r0)
            if (r10 == 0) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            java.util.List r10 = kotlin.p590y.C13185o.m40513a()
        L_0x0012:
            java.util.List r0 = r6.mo19449d()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = kotlin.p590y.C13187p.m40525a(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0025:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r0.next()
            com.bamtechmedia.dominguez.profiles.c0 r3 = (com.bamtechmedia.dominguez.profiles.C6626c0) r3
            com.bamtechmedia.dominguez.profiles.d0 r4 = r5.f15009d
            com.bamtechmedia.dominguez.profiles.y1.i r3 = r5.m20655a(r3, r7, r8, r4)
            r1.add(r3)
            goto L_0x0025
        L_0x003b:
            java.util.List r6 = r5.m20656a(r6, r7, r9)
            java.util.List r6 = kotlin.p590y.C13199w.m40583d(r1, r6)
            android.content.Context r7 = r5.f15006a
            android.content.res.Resources r7 = r7.getResources()
            int r8 = p163g.p201e.p203b.p330z.C7947f.profile_picker_column
            int r7 = r7.getInteger(r8)
            java.util.List r6 = kotlin.p590y.C13199w.m40567b(r6, r7)
            java.util.List r6 = kotlin.p590y.C13199w.m40606q(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.p590y.C13187p.m40525a(r6, r2)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x0064:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0079
            java.lang.Object r8 = r6.next()
            java.util.List r8 = (java.util.List) r8
            com.bamtechmedia.dominguez.profiles.y1.l r9 = new com.bamtechmedia.dominguez.profiles.y1.l
            r9.<init>(r8)
            r7.add(r9)
            goto L_0x0064
        L_0x0079:
            java.util.List r6 = kotlin.p590y.C13199w.m40583d(r10, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C6661f1.m20657b(com.bamtechmedia.dominguez.profiles.m1$a, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public static /* synthetic */ C6662a m20653a(C6661f1 f1Var, C6726a aVar, boolean z, Function1 function1, Function0 function0, String str, int i, Object obj) {
        boolean z2 = (i & 2) != 0 ? false : z;
        if ((i & 16) != 0) {
            str = null;
        }
        return f1Var.mo19369a(aVar, z2, function1, function0, str);
    }

    /* renamed from: a */
    public final C6662a mo19369a(C6726a aVar, boolean z, Function1<? super C6626c0, C13145v> function1, Function0<C13145v> function0, String str) {
        if (aVar.mo19448c()) {
            C6662a aVar2 = new C6662a(null, true, false, 5, null);
            return aVar2;
        }
        C6662a aVar3 = new C6662a(m20657b(aVar, z, function1, function0, str), false, false, 6, null);
        return aVar3;
    }

    /* renamed from: a */
    private final List<C6970a> m20656a(C6726a aVar, boolean z, Function0<C13145v> function0) {
        if (aVar.mo19449d().size() < 7) {
            return C13183n.m40498a(new C6970a(z, this.f15009d, new C6663b(this, function0)));
        }
        return C13185o.m40513a();
    }

    /* renamed from: a */
    private final C7006i m20655a(C6626c0 c0Var, boolean z, Function1<? super C6626c0, C13145v> function1, C6629d0 d0Var) {
        C7006i iVar = new C7006i(this.f15010e.mo19285a(c0Var.mo19364j()), c0Var.getProfileName(), !z && c0Var.mo19353Q(), z, new C6664c(function1, c0Var), this.f15008c, d0Var);
        return iVar;
    }
}
