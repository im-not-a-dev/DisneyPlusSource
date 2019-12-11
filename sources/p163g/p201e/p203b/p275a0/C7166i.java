package p163g.p201e.p203b.p275a0;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH&¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/RipcutUrlResolver;", "", "resolveUrl", "", "masterId", "parametersBlock", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader$Parameters;", "", "Lkotlin/ExtensionFunctionType;", "ripcutApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.a0.i */
/* compiled from: RipcutUrlResolver.kt */
public interface C7166i {

    /* renamed from: g.e.b.a0.i$a */
    /* compiled from: RipcutUrlResolver.kt */
    public static final class C7167a {

        /* renamed from: g.e.b.a0.i$a$a */
        /* compiled from: RipcutUrlResolver.kt */
        static final class C7168a extends C12881k implements Function1<C7162c, C13145v> {

            /* renamed from: c */
            public static final C7168a f15846c = new C7168a();

            C7168a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo20010a(C7162c cVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo20010a((C7162c) obj);
                return C13145v.f29587a;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ String m21728a(C7166i iVar, String str, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function1 = C7168a.f15846c;
                }
                return iVar.mo20009a(str, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveUrl");
        }
    }

    /* renamed from: a */
    String mo20009a(String str, Function1<? super C7162c, C13145v> function1);
}
