package p163g.p174d.p175a.p177b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.session.SessionAccountInfo;
import com.bamtech.sdk4.session.SessionInfo;
import p163g.p174d.p175a.p177b.C4812c.C4813a;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11554g;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

/* renamed from: g.d.a.b.b */
/* compiled from: BamtechReceiptCache */
public class C4807b implements C4812c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SharedPreferences f11951a;

    /* renamed from: b */
    private final Session f11952b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11547f f11953c;

    /* renamed from: g.d.a.b.b$a */
    /* compiled from: BamtechReceiptCache */
    class C4808a implements Function<SessionInfo, CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ BamnetIAPPurchase f11954U;

        /* renamed from: c */
        final /* synthetic */ BamnetIAPResult f11956c;

        C4808a(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) {
            this.f11956c = bamnetIAPResult;
            this.f11954U = bamnetIAPPurchase;
        }

        @SuppressLint({"ApplySharedPref"})
        /* renamed from: a */
        public CompletableSource apply(SessionInfo sessionInfo) {
            SessionAccountInfo account = sessionInfo.getAccount();
            if (account == null) {
                return Completable.m38169h();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("receipt_");
            sb.append(account.getId());
            String sb2 = sb.toString();
            String a = C4807b.this.f11953c.mo29517a((Object) new C4813a(this.f11956c, this.f11954U));
            C14100a.m44522a("Storing Purchase Receipt: Key: %s; Value: %s", sb2, a);
            C4807b.this.f11951a.edit().putString(sb2, a).commit();
            return Completable.m38169h();
        }
    }

    /* renamed from: g.d.a.b.b$b */
    /* compiled from: BamtechReceiptCache */
    class C4809b implements Function<SessionInfo, MaybeSource<? extends C4813a>> {
        C4809b() {
        }

        /* renamed from: a */
        public MaybeSource<? extends C4813a> apply(SessionInfo sessionInfo) {
            SessionAccountInfo account = sessionInfo.getAccount();
            if (account != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("receipt_");
                sb.append(account.getId());
                String sb2 = sb.toString();
                String string = C4807b.this.f11951a.getString(sb2, null);
                if (string != null) {
                    C14100a.m44522a("Retrieving receipt for key: %s", sb2);
                    return Maybe.m38258c((C4813a) C4807b.this.f11953c.mo29514a(string, C4813a.class));
                }
            }
            return Maybe.m38259h();
        }
    }

    /* renamed from: g.d.a.b.b$c */
    /* compiled from: BamtechReceiptCache */
    class C4810c implements Function<SessionInfo, CompletableSource> {

        /* renamed from: g.d.a.b.b$c$a */
        /* compiled from: BamtechReceiptCache */
        class C4811a implements C11945a {

            /* renamed from: a */
            final /* synthetic */ SessionInfo f11959a;

            C4811a(SessionInfo sessionInfo) {
                this.f11959a = sessionInfo;
            }

            @SuppressLint({"ApplySharedPref"})
            public void run() {
                SessionAccountInfo account = this.f11959a.getAccount();
                if (account != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("receipt_");
                    sb.append(account.getId());
                    String sb2 = sb.toString();
                    C14100a.m44522a("Clearing receipt for %s", sb2);
                    C4807b.this.f11951a.edit().remove(sb2).commit();
                }
            }
        }

        C4810c() {
        }

        /* renamed from: a */
        public CompletableSource apply(SessionInfo sessionInfo) {
            return Completable.m38166c((C11945a) new C4811a(sessionInfo));
        }
    }

    public C4807b(Context context, Session session, Class<? extends BamnetIAPPurchase> cls) {
        this.f11951a = context.getSharedPreferences("BamtechPaywallPrefs", 0);
        this.f11952b = session;
        C11554g gVar = new C11554g();
        gVar.mo29531a(new C4814d(cls));
        this.f11953c = gVar.mo29530a();
    }

    /* renamed from: a */
    public Completable mo16197a(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) {
        return this.f11952b.getSessionInfo().mo30217b((Function<? super T, ? extends CompletableSource>) new C4808a<Object,Object>(bamnetIAPResult, bamnetIAPPurchase));
    }

    /* renamed from: b */
    public Maybe<C4813a> mo16198b() {
        return this.f11952b.getSessionInfo().mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new C4809b<Object,Object>());
    }

    /* renamed from: a */
    public Completable mo16196a() {
        return this.f11952b.getSessionInfo().mo30217b((Function<? super T, ? extends CompletableSource>) new C4810c<Object,Object>());
    }
}
