package com.bamtechmedia.dominguez.core.content.sets;

import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0741y;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.core.framework.C5733a;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p096e.p113e.C3934g;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11842x;
import p520io.reactivex.C11932e;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR.\u0010\u0007\u001a\"\u0012\u0018\u0012\u0016\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\b\u0012\u00060\nj\u0002`\f0\t\u0012\u0004\u0012\u00020\r0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/OfflineSetCache;", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "profileCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "collectionInvalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;)V", "cache", "Landroidx/collection/LruCache;", "Lkotlin/Pair;", "", "Lcom/bamtechmedia/dominguez/core/content/sets/SetId;", "Lcom/bamtechmedia/dominguez/core/content/sets/ProfileId;", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "get", "setId", "put", "", "set", "Companion", "Provider", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.sets.j */
/* compiled from: OfflineSetCache.kt */
public final class C3780j extends C5733a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3934g<Pair<String, String>, ContentSet> f9421a = new C3934g<>(20);

    /* renamed from: b */
    private final C6627c1 f9422b;

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.j$a */
    /* compiled from: OfflineSetCache.kt */
    static final class C3781a<T> implements Consumer<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3780j f9423c;

        C3781a(C3780j jVar) {
            this.f9423c = jVar;
        }

        /* renamed from: a */
        public final void accept(C13145v vVar) {
            this.f9423c.f9421a.mo14074a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.j$b */
    /* compiled from: OfflineSetCache.kt */
    static final class C3782b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3782b f9424c = new C3782b();

        C3782b() {
        }

        /* renamed from: a */
        public final void mo13691a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo13691a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.j$c */
    /* compiled from: OfflineSetCache.kt */
    public static final class C3783c {
        private C3783c() {
        }

        public /* synthetic */ C3783c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/OfflineSetCache$Provider;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "profileCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "collectionInvalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "(Landroidx/fragment/app/FragmentActivity;Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;)V", "get", "Lcom/bamtechmedia/dominguez/core/content/sets/OfflineSetCache;", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.j$d */
    /* compiled from: OfflineSetCache.kt */
    public static final class C3784d {

        /* renamed from: a */
        private final C0532d f9425a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C6627c1 f9426b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C3419l f9427c;

        /* renamed from: com.bamtechmedia.dominguez.core.content.sets.j$d$a */
        /* compiled from: ViewModelUtilsExt.kt */
        public static final class C3785a<T> implements Provider<T> {

            /* renamed from: a */
            final /* synthetic */ C3784d f9428a;

            public C3785a(C3784d dVar) {
                this.f9428a = dVar;
            }

            public final T get() {
                return new C3780j(this.f9428a.f9426b, this.f9428a.f9427c);
            }
        }

        public C3784d(C0532d dVar, C6627c1 c1Var, C3419l lVar) {
            this.f9425a = dVar;
            this.f9426b = c1Var;
            this.f9427c = lVar;
        }

        /* renamed from: a */
        public final C3780j mo13692a() {
            C0741y a = C5856o0.m18894a(this.f9425a, C3780j.class, (Provider<T>) new C3785a<T>(this));
            C12880j.m40222a((Object) a, "ViewModelUtils.getViewMo…:class.java) { create() }");
            return (C3780j) a;
        }
    }

    static {
        new C3783c(null);
    }

    public C3780j(C6627c1 c1Var, C3419l lVar) {
        this.f9422b = c1Var;
        Object a = lVar.mo12596b().mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11842x) a).mo29927a(new C3781a(this), C3782b.f9424c);
    }

    /* renamed from: b */
    public final ContentSet mo13689b(String str) {
        C6626c0 b = this.f9422b.mo19287b();
        if (b != null) {
            return (ContentSet) this.f9421a.mo14079b(C12907r.m40244a(str, b.getProfileId()));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo13688a(ContentSet contentSet) {
        C6626c0 b = this.f9422b.mo19287b();
        if (b != null) {
            ContentSet contentSet2 = (ContentSet) this.f9421a.mo14073a(C12907r.m40244a(contentSet.mo13608e(), b.getProfileId()), contentSet);
        }
    }
}
