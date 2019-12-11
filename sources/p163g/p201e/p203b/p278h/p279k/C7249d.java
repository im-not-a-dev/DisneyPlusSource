package p163g.p201e.p203b.p278h.p279k;

import com.disneystreaming.companion.messaging.MessagingEvent;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ctvactivation/common/DeviceActivationHandler;", "", "sendMessage", "Lio/reactivex/Completable;", "to", "", "messageType", "map", "", "startUp", "streamUpdates", "Lio/reactivex/Observable;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "tearDown", "ctvActivation_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.h.k.d */
/* compiled from: DeviceActivationHandler.kt */
public interface C7249d {

    /* renamed from: g.e.b.h.k.d$a */
    /* compiled from: DeviceActivationHandler.kt */
    public static final class C7250a {
        /* renamed from: a */
        public static /* synthetic */ Completable m21858a(C7249d dVar, String str, String str2, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    map = C13173j0.m40350a();
                }
                return dVar.mo20063a(str, str2, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
        }
    }

    /* renamed from: a */
    Completable mo20063a(String str, String str2, Map<String, String> map);

    /* renamed from: a */
    Observable<MessagingEvent> mo20064a();

    /* renamed from: b */
    Completable mo20065b();

    /* renamed from: d */
    Completable mo20066d();
}
