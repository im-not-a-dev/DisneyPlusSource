package p000;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.Response;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.internal.telemetry.dust.DustConfigSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C14264y;
import okhttp3.Call;
import okhttp3.HttpUrl;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0013\u001a&\u0010\u0014\u001a\u00020\u0015*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a7\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\b\u001a7\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001b\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, mo31007d2 = {"PEEK_MAX", "", "dustServerPayload", "LDustServerPayload;", "", "getDustServerPayload", "(Ljava/lang/Throwable;)LDustServerPayload;", "logError", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "dustEvent", "", "t", "cfg", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustConfigSettings;", "logRequest", "logSuccess", "rawResponse", "Lokhttp3/Response;", "toCompletable", "Lio/reactivex/Completable;", "Lcom/bamtech/core/networking/Request;", "toMaybe", "Lio/reactivex/Maybe;", "OUT", "toSingle", "Lio/reactivex/Single;", "sdk-service"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: c */
/* compiled from: ServiceRequestExtensions.kt */
public final class C1169c {

    /* renamed from: c$a */
    /* compiled from: ReactiveExtensions.kt */
    public static final class C1170a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ Call f4406a;

        public C1170a(Call call) {
            this.f4406a = call;
        }

        public final void run() {
            this.f4406a.cancel();
        }
    }

    /* renamed from: c$b */
    /* compiled from: ServiceRequestExtensions.kt */
    static final class C1171b<T> implements Consumer<Disposable> {

        /* renamed from: U */
        final /* synthetic */ String f4407U;

        /* renamed from: c */
        final /* synthetic */ ServiceTransaction f4408c;

        C1171b(ServiceTransaction serviceTransaction, String str) {
            this.f4408c = serviceTransaction;
            this.f4407U = str;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            C1169c.m6003a(this.f4408c, this.f4407U);
        }
    }

    /* renamed from: c$c */
    /* compiled from: ServiceRequestExtensions.kt */
    static final class C1172c<T> implements Consumer<Throwable> {

        /* renamed from: U */
        final /* synthetic */ ServiceTransaction f4409U;

        /* renamed from: V */
        final /* synthetic */ String f4410V;

        /* renamed from: c */
        final /* synthetic */ Request f4411c;

        C1172c(Request request, ServiceTransaction serviceTransaction, String str) {
            this.f4411c = request;
            this.f4409U = serviceTransaction;
            this.f4410V = str;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            ServiceTransaction serviceTransaction = this.f4409U;
            String str = this.f4410V;
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            C1169c.m6004a(serviceTransaction, str, th, (DustConfigSettings) this.f4411c.mo7480c());
        }
    }

    /* renamed from: c$d */
    /* compiled from: ServiceRequestExtensions.kt */
    static final class C1173d<T> implements Consumer<Response<? extends C13145v>> {

        /* renamed from: U */
        final /* synthetic */ String f4412U;

        /* renamed from: c */
        final /* synthetic */ ServiceTransaction f4413c;

        C1173d(ServiceTransaction serviceTransaction, String str) {
            this.f4413c = serviceTransaction;
            this.f4412U = str;
        }

        /* renamed from: a */
        public final void accept(Response<C13145v> response) {
            C1169c.m6005a(this.f4413c, this.f4412U, response.mo7485b());
        }
    }

    /* renamed from: a */
    public static final void m6003a(ServiceTransaction serviceTransaction, String str) {
        ServiceTransaction serviceTransaction2 = serviceTransaction;
        String str2 = str;
        DefaultImpls.logDust$default(serviceTransaction2, str2, "urn:bamtech:dust:bamsdk:event:service", LogLevel.DEBUG, false, 8, null);
    }

    /* renamed from: a */
    public static final void m6005a(ServiceTransaction serviceTransaction, String str, okhttp3.Response response) {
        Object obj;
        String str2 = response.mo35863f() ? "urn:bamtech:dust:bamsdk:event:service" : "urn:bamtech:dust:bamsdk:error:service";
        LogLevel logLevel = response.mo35863f() ? LogLevel.INFO : LogLevel.WARN;
        if (!response.mo35863f()) {
            C14264y a = response.mo35856a(524288);
            if (a != null) {
                obj = a.mo36279e();
                DefaultImpls.logDust$default(serviceTransaction, str, str2, obj, m6001a(response), logLevel, false, 32, null);
            }
        }
        obj = null;
        DefaultImpls.logDust$default(serviceTransaction, str, str2, obj, m6001a(response), logLevel, false, 32, null);
    }

    /* renamed from: a */
    public static final void m6004a(ServiceTransaction serviceTransaction, String str, Throwable th, DustConfigSettings dustConfigSettings) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkReturnedValueIsNotNull((Object) stackTrace, "stackTrace");
        List b = C13174k.m40390b((Object[]) stackTrace, dustConfigSettings != null ? dustConfigSettings.getStackFrameLimit() : 0);
        if (b != null) {
            Object[] array = b.toArray(new StackTraceElement[0]);
            if (array != null) {
                th.setStackTrace((StackTraceElement[]) array);
                DefaultImpls.logDust$default(serviceTransaction, str, "urn:bamtech:dust:bamsdk:error:service", th, m6000a(th), LogLevel.ERROR, false, 32, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }

    /* renamed from: a */
    public static final DustServerPayload m6000a(Throwable th) {
        Throwable[] suppressed = th.getSuppressed();
        Intrinsics.checkReturnedValueIsNotNull((Object) suppressed, "suppressed");
        ArrayList arrayList = new ArrayList();
        for (Throwable th2 : suppressed) {
            if (th2 instanceof DustServerPlayloadException) {
                arrayList.add(th2);
            }
        }
        Object g = C13199w.m40591g((List) arrayList);
        if (!(g instanceof DustServerPlayloadException)) {
            g = null;
        }
        DustServerPlayloadException dustServerPlayloadException = (DustServerPlayloadException) g;
        if (dustServerPlayloadException != null) {
            return dustServerPlayloadException.getDustServerPayload();
        }
        return null;
    }

    /* renamed from: a */
    public static final DustServerPayload m6001a(okhttp3.Response response) {
        HttpUrl g = response.mo35870m().mo35837g();
        String g2 = g.mo35755g();
        Intrinsics.checkReturnedValueIsNotNull((Object) g2, "url.host()");
        String c = g.mo35750c();
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "url.encodedPath()");
        String e = response.mo35870m().mo35835e();
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "request().method()");
        DustServerPayload dustServerPayload = new DustServerPayload(g2, c, e, Integer.valueOf(response.mo35858c()), response.mo35861e("x-request-id"), Long.valueOf(response.mo35869l() - response.mo35871n()));
        return dustServerPayload;
    }

    /* renamed from: a */
    public static final Completable m6002a(Request<C13145v, DustConfigSettings> request, ServiceTransaction serviceTransaction, String str) {
        Call a = C1691e.m7799a(request);
        Single b = C1681c.m7780a(request, a).mo30223c((C11945a) new C1170a(a)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Completable e = b.mo30222c((Consumer<? super Disposable>) new C1171b<Object>(serviceTransaction, str)).mo30218b((Consumer<? super Throwable>) new C1172c<Object>(request, serviceTransaction, str)).mo30227d((Consumer<? super T>) new C1173d<Object>(serviceTransaction, str)).mo30228e();
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "this.asSingle()\n        …\n        .ignoreElement()");
        return e;
    }
}
