package kotlin.p588j0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p586h0.C12757d;
import kotlin.p588j0.C12808i.C12809a;
import kotlin.p588j0.C12808i.C12810b;
import kotlin.p590y.C13148a;
import kotlin.p590y.C13155d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, mo31007d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.j0.j */
/* compiled from: Regex.kt */
final class C12811j implements C12808i {

    /* renamed from: a */
    private List<String> f29488a;

    /* renamed from: b */
    private final Matcher f29489b;

    /* renamed from: c */
    private final CharSequence f29490c;

    /* renamed from: kotlin.j0.j$a */
    /* compiled from: Regex.kt */
    public static final class C12812a extends C13155d<String> {

        /* renamed from: U */
        final /* synthetic */ C12811j f29491U;

        C12812a(C12811j jVar) {
            this.f29491U = jVar;
        }

        /* renamed from: a */
        public /* bridge */ boolean mo31123a(String str) {
            return super.contains(str);
        }

        /* renamed from: b */
        public /* bridge */ int mo31125b(String str) {
            return super.indexOf(str);
        }

        /* renamed from: c */
        public /* bridge */ int mo31126c(String str) {
            return super.lastIndexOf(str);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return mo31123a((String) obj);
            }
            return false;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return mo31125b((String) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return mo31126c((String) obj);
            }
            return -1;
        }

        /* renamed from: b */
        public int mo31124b() {
            return this.f29491U.m40024c().groupCount() + 1;
        }

        public String get(int i) {
            String group = this.f29491U.m40024c().group(i);
            return group != null ? group : "";
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo31007d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: kotlin.j0.j$b */
    /* compiled from: Regex.kt */
    public static final class C12813b extends C13148a<C12805f> implements C12807h {

        /* renamed from: c */
        final /* synthetic */ C12811j f29492c;

        /* renamed from: kotlin.j0.j$b$a */
        /* compiled from: Regex.kt */
        static final class C12814a extends C12881k implements Function1<Integer, C12805f> {

            /* renamed from: c */
            final /* synthetic */ C12813b f29493c;

            C12814a(C12813b bVar) {
                this.f29493c = bVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final C12805f invoke(int i) {
                return this.f29493c.get(i);
            }
        }

        C12813b(C12811j jVar) {
            this.f29492c = jVar;
        }

        /* renamed from: a */
        public /* bridge */ boolean mo31131a(C12805f fVar) {
            return super.contains(fVar);
        }

        /* renamed from: b */
        public int mo31124b() {
            return this.f29492c.m40024c().groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof C12805f : true) {
                return mo31131a((C12805f) obj);
            }
            return false;
        }

        public C12805f get(int i) {
            C12757d a = C12819l.m40047b(this.f29492c.m40024c(), i);
            if (a.mo31082f().intValue() < 0) {
                return null;
            }
            String group = this.f29492c.m40024c().group(i);
            Intrinsics.checkReturnedValueIsNotNull((Object) group, "matchResult.group(index)");
            return new C12805f(group, a);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<C12805f> iterator() {
            return C12788p.m39994d(C13199w.m40577c((Iterable) C13185o.m40514a((Collection) this)), new C12814a(this)).iterator();
        }
    }

    public C12811j(Matcher matcher, CharSequence charSequence) {
        this.f29489b = matcher;
        this.f29490c = charSequence;
        new C12813b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final MatchResult m40024c() {
        return this.f29489b;
    }

    /* renamed from: b */
    public List<String> mo31120b() {
        if (this.f29488a == null) {
            this.f29488a = new C12812a(this);
        }
        List<String> list = this.f29488a;
        if (list != null) {
            return list;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    public C12808i next() {
        int end = m40024c().end() + (m40024c().end() == m40024c().start() ? 1 : 0);
        if (end > this.f29490c.length()) {
            return null;
        }
        Matcher matcher = this.f29489b.pattern().matcher(this.f29490c);
        Intrinsics.checkReturnedValueIsNotNull((Object) matcher, "matcher.pattern().matcher(input)");
        return C12819l.m40048b(matcher, end, this.f29490c);
    }

    /* renamed from: a */
    public C12810b mo31119a() {
        return C12809a.m40021a(this);
    }
}
