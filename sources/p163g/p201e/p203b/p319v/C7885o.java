package p163g.p201e.p203b.p319v;

import kotlin.Metadata;
import p163g.p201e.p203b.p319v.p320a0.C7820a;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;", "", "clearPaywall", "", "evictCache", "", "paywallOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/paywall/model/DmgzPaywall;", "forceRefresh", "paywallOnlyOnce", "Lio/reactivex/Completable;", "paywallApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.o */
/* compiled from: PaywallRepository.kt */
public interface C7885o {

    /* renamed from: g.e.b.v.o$a */
    /* compiled from: PaywallRepository.kt */
    public static final class C7886a {
        /* renamed from: a */
        public static /* synthetic */ void m23100a(C7885o oVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                oVar.mo19845b(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearPaywall");
        }

        /* renamed from: b */
        public static /* synthetic */ Single m23101b(C7885o oVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return oVar.mo19841a(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paywallOnce");
        }
    }

    /* renamed from: a */
    Completable mo19840a();

    /* renamed from: a */
    Single<C7820a> mo19841a(boolean z);

    /* renamed from: b */
    void mo19845b(boolean z);
}
