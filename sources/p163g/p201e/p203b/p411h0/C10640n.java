package p163g.p201e.p203b.p411h0;

import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.paywall.exceptions.C6261a;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6253b;
import java.util.Iterator;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.C7885o;
import p163g.p201e.p203b.p319v.p320a0.C7820a;
import p163g.p201e.p203b.p319v.p320a0.C7823d;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/welcome/WelcomeViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/welcome/WelcomeViewModel$State;", "paywallRepository", "Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;", "paywallConfig", "Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;", "(Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;)V", "isAlreadyAnimated", "", "()Z", "setAlreadyAnimated", "(Z)V", "loadPaywall", "", "monthlyProduct", "Lcom/bamtechmedia/dominguez/paywall/model/PaywallProduct;", "paywall", "Lcom/bamtechmedia/dominguez/paywall/model/DmgzPaywall;", "State", "welcome_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.h0.n */
/* compiled from: WelcomeViewModel.kt */
public final class C10640n extends C5741g<C10641a> {

    /* renamed from: a */
    private boolean f25106a;

    /* renamed from: b */
    private final C7885o f25107b;

    /* renamed from: c */
    private final C7873f f25108c;

    /* renamed from: g.e.b.h0.n$a */
    /* compiled from: WelcomeViewModel.kt */
    public static final class C10641a {

        /* renamed from: a */
        private final C7823d f25109a;

        /* renamed from: b */
        private final String f25110b;

        /* renamed from: c */
        private final boolean f25111c;

        public C10641a(C7823d dVar, String str, boolean z) {
            this.f25109a = dVar;
            this.f25110b = str;
            this.f25111c = z;
        }

        /* renamed from: a */
        public final boolean mo27502a() {
            return this.f25111c;
        }

        /* renamed from: b */
        public final String mo27503b() {
            return this.f25110b;
        }

        /* renamed from: c */
        public final C7823d mo27504c() {
            return this.f25109a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10641a) {
                    C10641a aVar = (C10641a) obj;
                    if (Intrinsics.areEqual((Object) this.f25109a, (Object) aVar.f25109a) && Intrinsics.areEqual((Object) this.f25110b, (Object) aVar.f25110b)) {
                        if (this.f25111c == aVar.f25111c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C7823d dVar = this.f25109a;
            int i = 0;
            int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
            String str = this.f25110b;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f25111c;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(product=");
            sb.append(this.f25109a);
            sb.append(", paywallHash=");
            sb.append(this.f25110b);
            sb.append(", offline=");
            sb.append(this.f25111c);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C10641a(C7823d dVar, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                z = false;
            }
            this(dVar, str, z);
        }
    }

    /* renamed from: g.e.b.h0.n$b */
    /* compiled from: WelcomeViewModel.kt */
    static final class C10642b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C10640n f25112c;

        C10642b(C10640n nVar) {
            this.f25112c = nVar;
        }

        /* renamed from: a */
        public final C10641a apply(C7820a aVar) {
            C10641a aVar2 = new C10641a(this.f25112c.m33393a(aVar), aVar.mo20723a(), false, 4, null);
            return aVar2;
        }
    }

    /* renamed from: g.e.b.h0.n$c */
    /* compiled from: WelcomeViewModel.kt */
    static final class C10643c<T, R> implements Function<Throwable, SingleSource<? extends C10641a>> {

        /* renamed from: c */
        public static final C10643c f25113c = new C10643c();

        C10643c() {
        }

        /* renamed from: a */
        public final SingleSource<? extends C10641a> apply(Throwable th) {
            if (th instanceof C6261a) {
                return Single.m38399b(new C10641a(null, null, Intrinsics.areEqual((Object) ((C6261a) th).mo18845b(), (Object) C6253b.f14292a)));
            }
            return Single.m38395a(th);
        }
    }

    /* renamed from: g.e.b.h0.n$d */
    /* compiled from: WelcomeViewModel.kt */
    static final class C10644d<T> implements Consumer<C10641a> {

        /* renamed from: c */
        final /* synthetic */ C10640n f25114c;

        C10644d(C10640n nVar) {
            this.f25114c = nVar;
        }

        /* renamed from: a */
        public final void accept(C10641a aVar) {
            C10640n nVar = this.f25114c;
            Intrinsics.checkReturnedValueIsNotNull((Object) aVar, "it");
            nVar.createState(aVar);
        }
    }

    /* renamed from: g.e.b.h0.n$e */
    /* compiled from: WelcomeViewModel.kt */
    static final /* synthetic */ class C10645e extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C10645e f25115c = new C10645e();

        C10645e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo27511a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27511a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C10640n(C7885o oVar, C7873f fVar) {
        super(null, 1, null);
        this.f25107b = oVar;
        this.f25108c = fVar;
    }

    /* renamed from: d */
    public final void mo27499d(boolean z) {
        this.f25106a = z;
    }

    /* renamed from: y */
    public final boolean mo27500y() {
        return this.f25106a;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [g.e.b.h0.n$e, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r3v1, types: [g.e.b.h0.o] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27501z() {
        /*
            r4 = this;
            g.e.b.v.o r0 = r4.f25107b
            r1 = 0
            r2 = 1
            r3 = 0
            io.reactivex.Single r0 = p163g.p201e.p203b.p319v.C7885o.C7886a.m23101b(r0, r1, r2, r3)
            g.e.b.h0.n$b r1 = new g.e.b.h0.n$b
            r1.<init>(r4)
            io.reactivex.Single r0 = r0.mo30233g(r1)
            g.e.b.h0.n$c r1 = p163g.p201e.p203b.p411h0.C10640n.C10643c.f25113c
            io.reactivex.Single r0 = r0.mo30235h(r1)
            java.lang.String r1 = "paywallRepository.paywal…e.error(it)\n            }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.c0 r1 = r4.getViewModelScope()
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30215a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.d0 r0 = (p163g.p503n.p504a.C11792d0) r0
            g.e.b.h0.n$d r1 = new g.e.b.h0.n$d
            r1.<init>(r4)
            g.e.b.h0.n$e r2 = p163g.p201e.p203b.p411h0.C10640n.C10645e.f25115c
            if (r2 == 0) goto L_0x003f
            g.e.b.h0.o r3 = new g.e.b.h0.o
            r3.<init>(r2)
            r2 = r3
        L_0x003f:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo29920a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p411h0.C10640n.mo27501z():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C7823d m33393a(C7820a aVar) {
        Object obj;
        String str;
        Iterator it = aVar.mo20724b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) this.f25108c.mo20797b(((C7823d) obj).mo20732d()), (Object) "month")) {
                break;
            }
        }
        C7823d dVar = (C7823d) obj;
        boolean z = false;
        if (dVar != null) {
            try {
                str = dVar.mo20730b();
            } catch (IllegalStateException unused) {
            }
        } else {
            str = null;
        }
        if (str != null) {
            z = true;
        }
        if (!z) {
            obj = null;
        }
        return (C7823d) obj;
    }
}
