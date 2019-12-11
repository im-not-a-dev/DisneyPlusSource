package p551j.p552a.p565o.p566b;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import net.danlew.android.joda.DateUtils;
import p163g.p441i.p442a.p443a.C10903f;
import p520io.sentry.event.p550f.C12579e;
import p551j.p552a.p569r.C12677b;

/* renamed from: j.a.o.b.c */
/* compiled from: HttpInterfaceBinding */
public class C12664c implements C12665d<C12579e> {
    /* renamed from: b */
    private void m39708b(C10903f fVar, C12579e eVar) throws IOException {
        fVar.mo28060f();
        fVar.mo28045a("REMOTE_ADDR", eVar.mo30795l());
        fVar.mo28045a("SERVER_NAME", eVar.mo30798o());
        fVar.mo28042a("SERVER_PORT", eVar.mo30799p());
        fVar.mo28045a("LOCAL_ADDR", eVar.mo30786e());
        fVar.mo28045a("LOCAL_NAME", eVar.mo30788f());
        fVar.mo28042a("LOCAL_PORT", eVar.mo30789g());
        fVar.mo28045a("SERVER_PROTOCOL", eVar.mo30793j());
        fVar.mo28046a("REQUEST_SECURE", eVar.mo30801r());
        fVar.mo28046a("REQUEST_ASYNC", eVar.mo30800q());
        fVar.mo28045a("AUTH_TYPE", eVar.mo30782a());
        fVar.mo28045a("REMOTE_USER", eVar.mo30796m());
        fVar.mo28055c();
    }

    /* renamed from: a */
    public void mo30988a(C10903f fVar, C12579e eVar) throws IOException {
        fVar.mo28060f();
        fVar.mo28045a("url", eVar.mo30797n());
        fVar.mo28045a("method", eVar.mo30790h());
        fVar.mo28063g("data");
        m39707a(fVar, eVar.mo30792i(), eVar.mo30783b());
        fVar.mo28045a("query_string", eVar.mo30794k());
        fVar.mo28063g("cookies");
        m39706a(fVar, eVar.mo30784c());
        fVar.mo28063g("headers");
        m39709b(fVar, eVar.mo30785d());
        fVar.mo28063g("env");
        m39708b(fVar, eVar);
        fVar.mo28055c();
    }

    /* renamed from: b */
    private void m39709b(C10903f fVar, Map<String, Collection<String>> map) throws IOException {
        fVar.mo28058e();
        for (Entry entry : map.entrySet()) {
            for (String str : (Collection) entry.getValue()) {
                fVar.mo28058e();
                fVar.mo28066j((String) entry.getKey());
                fVar.mo28066j(str);
                fVar.mo28052b();
            }
        }
        fVar.mo28052b();
    }

    /* renamed from: a */
    private void m39706a(C10903f fVar, Map<String, String> map) throws IOException {
        if (map.isEmpty()) {
            fVar.mo28057d();
            return;
        }
        fVar.mo28060f();
        for (Entry entry : map.entrySet()) {
            fVar.mo28045a((String) entry.getKey(), (String) entry.getValue());
        }
        fVar.mo28055c();
    }

    /* renamed from: a */
    private void m39707a(C10903f fVar, Map<String, Collection<String>> map, String str) throws IOException {
        if (map == null && str == null) {
            fVar.mo28057d();
            return;
        }
        if ((map == null || map.isEmpty()) && str != null) {
            fVar.mo28066j(C12677b.m39768a(str, (int) DateUtils.FORMAT_NO_MIDNIGHT));
        } else {
            fVar.mo28060f();
            if (str != null) {
                fVar.mo28045a("body", C12677b.m39768a(str, (int) DateUtils.FORMAT_NO_MIDNIGHT));
            }
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    fVar.mo28061f((String) entry.getKey());
                    for (String j : (Collection) entry.getValue()) {
                        fVar.mo28066j(j);
                    }
                    fVar.mo28052b();
                }
            }
            fVar.mo28055c();
        }
    }
}
