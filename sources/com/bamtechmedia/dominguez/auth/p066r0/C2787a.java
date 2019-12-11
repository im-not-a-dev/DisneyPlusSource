package com.bamtechmedia.dominguez.auth.p066r0;

import com.bamtech.sdk4.Session;
import com.bamtechmedia.dominguez.auth.C2702b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J!\u0010\u0012\u001a\u00020\u00102\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/logout/DispatchingLogOutAction;", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "delegates", "Ljavax/inject/Provider;", "", "sessionOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "config", "Lcom/bamtechmedia/dominguez/auth/AuthConfig;", "(Ljavax/inject/Provider;Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/auth/AuthConfig;)V", "logOutActionId", "", "getLogOutActionId", "()Ljava/lang/String;", "onLogout", "Lio/reactivex/Completable;", "onSoftLogout", "sortedActions", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.r0.a */
/* compiled from: DispatchingLogOutAction.kt */
public final class C2787a implements C2793c {

    /* renamed from: a */
    private final String f7542a = "dispatching";

    /* renamed from: b */
    private final Provider<Set<C2793c>> f7543b;

    /* renamed from: c */
    private final Single<Session> f7544c;

    /* renamed from: d */
    private final C2702b f7545d;

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.a$a */
    /* compiled from: DispatchingLogOutAction.kt */
    static final class C2788a<T, R> implements Function<Session, CompletableSource> {

        /* renamed from: c */
        public static final C2788a f7546c = new C2788a();

        C2788a() {
        }

        /* renamed from: a */
        public final Completable apply(Session session) {
            return C2792b.m10462b(session, false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.a$b */
    /* compiled from: DispatchingLogOutAction.kt */
    static final class C2789b extends C12881k implements Function1<C2793c, Completable> {

        /* renamed from: c */
        public static final C2789b f7547c = new C2789b();

        C2789b() {
            super(1);
        }

        /* renamed from: a */
        public final Completable invoke(C2793c cVar) {
            return cVar.mo11570a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.a$c */
    /* compiled from: DispatchingLogOutAction.kt */
    static final class C2790c<T, R> implements Function<Session, CompletableSource> {

        /* renamed from: c */
        public static final C2790c f7548c = new C2790c();

        C2790c() {
        }

        /* renamed from: a */
        public final Completable apply(Session session) {
            return C2792b.m10462b(session, true);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.a$d */
    /* compiled from: DispatchingLogOutAction.kt */
    static final class C2791d extends C12881k implements Function1<C2793c, Completable> {

        /* renamed from: c */
        public static final C2791d f7549c = new C2791d();

        C2791d() {
            super(1);
        }

        /* renamed from: a */
        public final Completable invoke(C2793c cVar) {
            return cVar.mo11572c();
        }
    }

    public C2787a(Provider<Set<C2793c>> provider, Single<Session> single, C2702b bVar) {
        this.f7543b = provider;
        this.f7544c = single;
        this.f7545d = bVar;
    }

    /* renamed from: a */
    public Completable mo11570a() {
        Completable a = this.f7544c.mo30217b((Function<? super T, ? extends CompletableSource>) C2788a.f7546c).mo30034a((CompletableSource) m10453a(C2789b.f7547c));
        C12880j.m40222a((Object) a, "sessionOnce.flatMapCompl…edActions { onLogout() })");
        return a;
    }

    /* renamed from: b */
    public String mo11571b() {
        return this.f7542a;
    }

    /* renamed from: c */
    public Completable mo11572c() {
        Completable a = this.f7544c.mo30217b((Function<? super T, ? extends CompletableSource>) C2790c.f7548c).mo30034a((CompletableSource) m10453a(C2791d.f7549c));
        C12880j.m40222a((Object) a, "sessionOnce.flatMapCompl…tions { onSoftLogout() })");
        return a;
    }

    /* renamed from: a */
    private final Completable m10453a(Function1<? super C2793c, ? extends Completable> function1) {
        Set<C2793c> set = (Set) this.f7543b.get();
        C12880j.m40222a((Object) set, "delegates");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) set, 10)), 16));
        for (Object next : set) {
            linkedHashMap.put(((C2793c) next).mo11571b(), next);
        }
        if (!(set.size() == linkedHashMap.size())) {
            StringBuilder sb = new StringBuilder();
            sb.append("There were two LogOutActions with the same id in ");
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) set, 10));
            for (C2793c b : set) {
                arrayList.add(b.mo11571b());
            }
            sb.append(arrayList);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        List<String> a = this.f7545d.mo11736a();
        ArrayList<C2793c> arrayList2 = new ArrayList<>();
        for (String str : a) {
            C2793c cVar = (C2793c) linkedHashMap.get(str);
            if (cVar != null) {
                arrayList2.add(cVar);
            }
        }
        List<String> b2 = this.f7545d.mo11737b();
        ArrayList<C2793c> arrayList3 = new ArrayList<>();
        for (String str2 : b2) {
            C2793c cVar2 = (C2793c) linkedHashMap.get(str2);
            if (cVar2 != null) {
                arrayList3.add(cVar2);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            if (!this.f7545d.mo11736a().contains(str3) && !this.f7545d.mo11737b().contains(str3)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList<C2793c> arrayList4 = new ArrayList<>(linkedHashMap2.size());
        for (Entry value : linkedHashMap2.entrySet()) {
            arrayList4.add((C2793c) value.getValue());
        }
        ArrayList arrayList5 = new ArrayList(C13187p.m40525a((Iterable) arrayList2, 10));
        for (C2793c cVar3 : arrayList2) {
            Completable completable = (Completable) function1.invoke(cVar3);
            cVar3.mo11571b();
            arrayList5.add(completable);
        }
        Completable a2 = Completable.m38153a((Iterable<? extends CompletableSource>) arrayList5);
        ArrayList arrayList6 = new ArrayList(C13187p.m40525a((Iterable) arrayList4, 10));
        for (C2793c cVar4 : arrayList4) {
            Completable completable2 = (Completable) function1.invoke(cVar4);
            cVar4.mo11571b();
            arrayList6.add(completable2);
        }
        Completable a3 = a2.mo30034a((CompletableSource) Completable.m38161b((Iterable<? extends CompletableSource>) arrayList6));
        ArrayList arrayList7 = new ArrayList(C13187p.m40525a((Iterable) arrayList3, 10));
        for (C2793c cVar5 : arrayList3) {
            Completable completable3 = (Completable) function1.invoke(cVar5);
            cVar5.mo11571b();
            arrayList7.add(completable3);
        }
        Completable a4 = a3.mo30034a((CompletableSource) Completable.m38153a((Iterable<? extends CompletableSource>) arrayList7));
        C12880j.m40222a((Object) a4, "concat(initialLogOutActi…og(it.logOutActionId) }))");
        return a4;
    }
}
