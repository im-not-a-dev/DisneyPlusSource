package p163g.p201e.p203b.p307o.p309q;

import com.bamtechmedia.dominguez.core.framework.C5741g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p204d.C5403j0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/error/contactus/ContactCustomerServiceViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/error/contactus/ContactCustomerServiceViewModel$State;", "countryCodeProvider", "Lcom/bamtechmedia/dominguez/account/CountryCodeProviderApi;", "(Lcom/bamtechmedia/dominguez/account/CountryCodeProviderApi;)V", "getCountryCodeProvider", "()Lcom/bamtechmedia/dominguez/account/CountryCodeProviderApi;", "getCountryCode", "Lio/reactivex/disposables/Disposable;", "update", "", "countryCode", "", "State", "error_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.o.q.c */
/* compiled from: ContactCustomerServiceViewModel.kt */
public final class C7636c extends C5741g<C7637a> {

    /* renamed from: a */
    private final C5403j0 f16650a;

    /* renamed from: g.e.b.o.q.c$a */
    /* compiled from: ContactCustomerServiceViewModel.kt */
    public static final class C7637a {

        /* renamed from: a */
        private final String f16651a;

        public C7637a() {
            this(null, 1, null);
        }

        public C7637a(String str) {
            this.f16651a = str;
        }

        /* renamed from: a */
        public final C7637a mo20557a(String str) {
            return new C7637a(str);
        }

        /* renamed from: a */
        public final String mo20558a() {
            return this.f16651a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f16651a, (java.lang.Object) ((p163g.p201e.p203b.p307o.p309q.C7636c.C7637a) r2).f16651a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p163g.p201e.p203b.p307o.p309q.C7636c.C7637a
                if (r0 == 0) goto L_0x0013
                g.e.b.o.q.c$a r2 = (p163g.p201e.p203b.p307o.p309q.C7636c.C7637a) r2
                java.lang.String r0 = r1.f16651a
                java.lang.String r2 = r2.f16651a
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p307o.p309q.C7636c.C7637a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f16651a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(countryCode=");
            sb.append(this.f16651a);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7637a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = "";
            }
            this(str);
        }
    }

    /* renamed from: g.e.b.o.q.c$b */
    /* compiled from: ContactCustomerServiceViewModel.kt */
    static final class C7638b<T> implements Consumer<String> {

        /* renamed from: c */
        final /* synthetic */ C7636c f16652c;

        C7638b(C7636c cVar) {
            this.f16652c = cVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C7636c cVar = this.f16652c;
            C12880j.m40222a((Object) str, "it");
            cVar.m22625b(str);
        }
    }

    /* renamed from: g.e.b.o.q.c$c */
    /* compiled from: ContactCustomerServiceViewModel.kt */
    static final class C7639c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7639c f16653c = new C7639c();

        C7639c() {
        }

        /* renamed from: a */
        public final void mo20563a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo20563a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: g.e.b.o.q.c$d */
    /* compiled from: ContactCustomerServiceViewModel.kt */
    static final class C7640d extends C12881k implements Function1<C7637a, C7637a> {

        /* renamed from: c */
        final /* synthetic */ String f16654c;

        C7640d(String str) {
            this.f16654c = str;
            super(1);
        }

        /* renamed from: a */
        public final C7637a invoke(C7637a aVar) {
            return aVar.mo20557a(this.f16654c);
        }
    }

    public C7636c(C5403j0 j0Var) {
        super(null, 1, null);
        this.f16650a = j0Var;
        createState(new C7637a(null, 1, null));
        m22626y();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22625b(String str) {
        updateState(new C7640d(str));
    }

    /* renamed from: y */
    private final Disposable m22626y() {
        Object a = this.f16650a.mo17142a().mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        return ((C11792d0) a).mo29920a(new C7638b(this), C7639c.f16653c);
    }
}
