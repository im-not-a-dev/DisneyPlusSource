package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.utils.C5838i0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\u0002*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, mo31007d2 = {"getCreators", "", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "numberOfCreators", "", "getDirectorName", "getExecutiveProducerName", "getTopCastMembersNameString", "getTopCastMembersNames", "numberOfParticipants", "coreContentApi_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.assets.p */
/* compiled from: Participant.kt */
public final class C3642p {

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.p$a */
    /* compiled from: Comparisons.kt */
    public static final class C3643a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C13206b.m40622a(((Participant) t).mo13151Y(), ((Participant) t2).mo13151Y());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.p$b */
    /* compiled from: Participant.kt */
    static final class C3644b extends C12881k implements Function1<Participant, String> {

        /* renamed from: c */
        public static final C3644b f9158c = new C3644b();

        C3644b() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(Participant participant) {
            return participant.mo13150X();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.p$c */
    /* compiled from: Comparisons.kt */
    public static final class C3645c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C13206b.m40622a(((Participant) t).mo13151Y(), ((Participant) t2).mo13151Y());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ List m12398a(List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 5;
        }
        return m12397a(list, i);
    }

    /* renamed from: b */
    public static final List<String> m12399b(List<Participant> list, int i) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (Intrinsics.areEqual((Object) C5838i0.m18844a(((Participant) next).mo13152Z()), (Object) C5838i0.m18844a("Actor"))) {
                    arrayList.add(next);
                }
            }
            List a = C13199w.m40562a((Iterable) arrayList, (Comparator) new C3645c());
            if (a != null) {
                List<Participant> d = C13199w.m40580d((Iterable) a, i);
                if (d != null) {
                    ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) d, 10));
                    for (Participant X : d) {
                        arrayList2.add(X.mo13150X());
                    }
                    return arrayList2;
                }
            }
        }
        return C13185o.m40513a();
    }

    /* renamed from: a */
    public static final String m12396a(List<Participant> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (Intrinsics.areEqual((Object) ((Participant) next).mo13152Z(), (Object) "Director")) {
                arrayList.add(next);
            }
        }
        return C13199w.m40559a(arrayList, ", ", null, null, 0, null, C3644b.f9158c, 30, null);
    }

    /* renamed from: a */
    public static final List<String> m12397a(List<Participant> list, int i) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (Intrinsics.areEqual((Object) C5838i0.m18844a(((Participant) next).mo13152Z()), (Object) C5838i0.m18844a("Creator"))) {
                    arrayList.add(next);
                }
            }
            List a = C13199w.m40562a((Iterable) arrayList, (Comparator) new C3643a());
            if (a != null) {
                List<Participant> d = C13199w.m40580d((Iterable) a, i);
                if (d != null) {
                    ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) d, 10));
                    for (Participant X : d) {
                        arrayList2.add(X.mo13150X());
                    }
                    return arrayList2;
                }
            }
        }
        return C13185o.m40513a();
    }
}
