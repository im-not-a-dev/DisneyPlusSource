package com.bamtechmedia.dominguez.collections;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.collections.C3333i.C3336c;
import com.bamtechmedia.dominguez.collections.items.C3374o;
import com.bamtechmedia.dominguez.collections.p080o0.C3433a;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0018J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\bH&J$\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010H&J\b\u0010\u0012\u001a\u00020\bH&J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "Lcom/bamtechmedia/dominguez/collections/items/ShelfBindListener;", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "getSlug", "()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "filterAssets", "", "filter", "Lcom/bamtechmedia/dominguez/collections/CollectionFilter;", "invalidateCollection", "observeUntilOnStop", "owner", "Landroidx/lifecycle/LifecycleOwner;", "consumer", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "refresh", "syncCollectionsByCache", "syncContentSetByCache", "contentSetType", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "Factory", "State", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.q */
/* compiled from: CollectionViewModel.kt */
public interface C3454q extends C3374o, C3702e {

    /* renamed from: com.bamtechmedia.dominguez.collections.q$a */
    /* compiled from: CollectionViewModel.kt */
    public interface C3455a {
        /* renamed from: a */
        C3454q mo12651a(Fragment fragment, C3676k kVar);
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.q$b */
    /* compiled from: CollectionViewModel.kt */
    public static final class C3456b {

        /* renamed from: a */
        private final C3658a f8716a;

        /* renamed from: b */
        private final C3658a f8717b;

        /* renamed from: c */
        private final C3333i f8718c;

        /* renamed from: d */
        private final C3433a f8719d;

        /* renamed from: e */
        private final boolean f8720e;

        /* renamed from: f */
        private final boolean f8721f;

        /* renamed from: g */
        private final Throwable f8722g;

        public C3456b() {
            this(null, null, null, false, false, null, 63, null);
        }

        public C3456b(C3658a aVar, C3333i iVar, C3433a aVar2, boolean z, boolean z2, Throwable th) {
            this.f8717b = aVar;
            this.f8718c = iVar;
            this.f8719d = aVar2;
            this.f8720e = z;
            this.f8721f = z2;
            this.f8722g = th;
            this.f8716a = this.f8718c.mo12387a(this.f8717b);
        }

        /* renamed from: a */
        public static /* synthetic */ C3456b m11793a(C3456b bVar, C3658a aVar, C3333i iVar, C3433a aVar2, boolean z, boolean z2, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar = bVar.f8717b;
            }
            if ((i & 2) != 0) {
                iVar = bVar.f8718c;
            }
            C3333i iVar2 = iVar;
            if ((i & 4) != 0) {
                aVar2 = bVar.f8719d;
            }
            C3433a aVar3 = aVar2;
            if ((i & 8) != 0) {
                z = bVar.f8720e;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = bVar.f8721f;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                th = bVar.f8722g;
            }
            return bVar.mo12652a(aVar, iVar2, aVar3, z3, z4, th);
        }

        /* renamed from: a */
        public final C3456b mo12652a(C3658a aVar, C3333i iVar, C3433a aVar2, boolean z, boolean z2, Throwable th) {
            C3456b bVar = new C3456b(aVar, iVar, aVar2, z, z2, th);
            return bVar;
        }

        /* renamed from: a */
        public final C3658a mo12653a() {
            return this.f8717b;
        }

        /* renamed from: b */
        public final C3433a mo12654b() {
            return this.f8719d;
        }

        /* renamed from: c */
        public final boolean mo12655c() {
            return !this.f8720e && this.f8719d == null && this.f8717b == null;
        }

        /* renamed from: d */
        public final Throwable mo12656d() {
            return this.f8722g;
        }

        /* renamed from: e */
        public final C3658a mo12657e() {
            return this.f8716a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3456b) {
                    C3456b bVar = (C3456b) obj;
                    if (C12880j.m40224a((Object) this.f8717b, (Object) bVar.f8717b) && C12880j.m40224a((Object) this.f8718c, (Object) bVar.f8718c) && C12880j.m40224a((Object) this.f8719d, (Object) bVar.f8719d)) {
                        if (this.f8720e == bVar.f8720e) {
                            if (!(this.f8721f == bVar.f8721f) || !C12880j.m40224a((Object) this.f8722g, (Object) bVar.f8722g)) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo12659f() {
            return this.f8720e;
        }

        /* renamed from: g */
        public final boolean mo12660g() {
            return this.f8721f;
        }

        public int hashCode() {
            C3658a aVar = this.f8717b;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            C3333i iVar = this.f8718c;
            int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
            C3433a aVar2 = this.f8719d;
            int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            boolean z = this.f8720e;
            if (z) {
                z = true;
            }
            int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
            boolean z2 = this.f8721f;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            Throwable th = this.f8722g;
            if (th != null) {
                i = th.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(collection=");
            sb.append(this.f8717b);
            sb.append(", filter=");
            sb.append(this.f8718c);
            sb.append(", collectionConfig=");
            sb.append(this.f8719d);
            sb.append(", loading=");
            sb.append(this.f8720e);
            sb.append(", isOffline=");
            sb.append(this.f8721f);
            sb.append(", error=");
            sb.append(this.f8722g);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C3456b(C3658a aVar, C3333i iVar, C3433a aVar2, boolean z, boolean z2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            C3658a aVar3 = (i & 1) != 0 ? null : aVar;
            if ((i & 2) != 0) {
                iVar = C3336c.f8389a;
            }
            this(aVar3, iVar, (i & 4) != 0 ? null : aVar2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : th);
        }
    }

    /* renamed from: a */
    void mo12646a(C0722m mVar, Function1<? super C3456b, C13145v> function1);

    /* renamed from: a */
    void mo12647a(C3333i iVar);

    /* renamed from: a */
    void mo12648a(C3676k kVar);

    /* renamed from: b */
    C3676k mo12649b();

    /* renamed from: d */
    void mo12650d();
}
