package p163g.p201e.p203b.p319v;

import android.app.Activity;
import android.content.Intent;
import com.bamnet.iap.BamnetIAPProduct;
import com.bamtech.sdk4.purchase.AccessStatus;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.subjects.C11976a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\fH&J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0016\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH&J\b\u0010\u001c\u001a\u00020\fH&J\b\u0010\u001d\u001a\u00020\fH&J\b\u0010\u001e\u001a\u00020\fH&J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "", "serviceEvents", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent;", "getServiceEvents", "()Lio/reactivex/subjects/BehaviorSubject;", "linkSubscriptions", "Lio/reactivex/Completable;", "accessStatus", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "notifyAccessGrantedFromTempAccess", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "purchase", "activity", "Landroid/app/Activity;", "product", "Lcom/bamnet/iap/BamnetIAPProduct;", "queryProducts", "productSkus", "", "", "resetServiceEvents", "resolveTempAccess", "restore", "setup", "paywallApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.q */
/* compiled from: PaywallServicesInteractor.kt */
public interface C7900q {

    /* renamed from: g.e.b.v.q$a */
    /* compiled from: PaywallServicesInteractor.kt */
    public static final class C7901a {
        /* renamed from: a */
        public static /* synthetic */ Completable m23120a(C7900q qVar, AccessStatus accessStatus, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    accessStatus = null;
                }
                return qVar.mo20738a(accessStatus);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkSubscriptions");
        }
    }

    /* renamed from: a */
    Completable mo20738a(AccessStatus accessStatus);

    /* renamed from: a */
    void mo20739a();

    /* renamed from: a */
    void mo20740a(int i, int i2, Intent intent);

    /* renamed from: a */
    void mo20741a(Activity activity);

    /* renamed from: a */
    void mo20742a(Activity activity, BamnetIAPProduct bamnetIAPProduct);

    /* renamed from: a */
    void mo20743a(List<String> list);

    /* renamed from: b */
    C11976a<C7887p> mo20744b();

    /* renamed from: c */
    void mo20745c();

    /* renamed from: d */
    void mo20746d();

    /* renamed from: e */
    void mo20747e();
}
