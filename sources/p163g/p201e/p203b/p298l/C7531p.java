package p163g.p201e.p203b.p298l;

import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.profiles.C6761p0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeViewModel$State;", "profilesGlobalNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfilesGlobalNavRouter;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesGlobalNavRouter;)V", "dismiss", "", "onSetupProfiles", "onStartWatching", "State", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.l.p */
/* compiled from: FreeTrialWelcomeViewModel.kt */
public final class C7531p extends C5741g<C7532a> {

    /* renamed from: a */
    private final C6761p0 f16499a;

    /* renamed from: g.e.b.l.p$a */
    /* compiled from: FreeTrialWelcomeViewModel.kt */
    public static final class C7532a {

        /* renamed from: a */
        private final boolean f16500a;

        public C7532a() {
            this(false, 1, null);
        }

        public C7532a(boolean z) {
            this.f16500a = z;
        }

        /* renamed from: a */
        public final boolean mo20422a() {
            return this.f16500a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7532a) {
                    if (this.f16500a == ((C7532a) obj).f16500a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f16500a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(dismiss=");
            sb.append(this.f16500a);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7532a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                z = false;
            }
            this(z);
        }
    }

    /* renamed from: g.e.b.l.p$b */
    /* compiled from: FreeTrialWelcomeViewModel.kt */
    static final class C7533b extends C12881k implements Function1<C7532a, C7532a> {

        /* renamed from: c */
        public static final C7533b f16501c = new C7533b();

        C7533b() {
            super(1);
        }

        /* renamed from: a */
        public final C7532a invoke(C7532a aVar) {
            return new C7532a(true);
        }
    }

    public C7531p(C6761p0 p0Var) {
        super(null, 1, null);
        this.f16499a = p0Var;
        createState(new C7532a(false, 1, null));
    }

    /* renamed from: A */
    private final void m22435A() {
        updateState(C7533b.f16501c);
    }

    /* renamed from: y */
    public final void mo20420y() {
        this.f16499a.mo19486a();
        m22435A();
    }

    /* renamed from: z */
    public final void mo20421z() {
        m22435A();
    }
}
