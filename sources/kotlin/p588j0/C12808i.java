package kotlin.p588j0;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo31007d2 = {"Lkotlin/text/MatchResult;", "", "destructured", "Lkotlin/text/MatchResult$Destructured;", "getDestructured", "()Lkotlin/text/MatchResult$Destructured;", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "Destructured", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.j0.i */
/* compiled from: MatchResult.kt */
public interface C12808i {

    /* renamed from: kotlin.j0.i$a */
    /* compiled from: MatchResult.kt */
    public static final class C12809a {
        /* renamed from: a */
        public static C12810b m40021a(C12808i iVar) {
            return new C12810b(iVar);
        }
    }

    /* renamed from: kotlin.j0.i$b */
    /* compiled from: MatchResult.kt */
    public static final class C12810b {

        /* renamed from: a */
        private final C12808i f29487a;

        public C12810b(C12808i iVar) {
            this.f29487a = iVar;
        }

        /* renamed from: a */
        public final C12808i mo31122a() {
            return this.f29487a;
        }
    }

    /* renamed from: a */
    C12810b mo31119a();

    /* renamed from: b */
    List<String> mo31120b();

    C12808i next();
}
