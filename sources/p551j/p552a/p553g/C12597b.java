package p551j.p552a.p553g;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import p520io.sentry.event.C12562b;
import p520io.sentry.event.p549e.C12570c;
import p520io.sentry.event.p550f.C12576b;
import p520io.sentry.event.p550f.C12577c;
import p520io.sentry.event.p550f.C12578d;
import p520io.sentry.event.p550f.C12582h;
import p551j.p552a.C12586a;
import p551j.p552a.C12589b;
import p551j.p552a.C12590c;
import p551j.p552a.p553g.C12594a.C12596b;
import p551j.p552a.p553g.p554d.p555a.C12600a;
import p551j.p552a.p556h.C12601a;
import p551j.p552a.p556h.C12602b;
import p551j.p552a.p557i.C12607d;
import p551j.p552a.p561k.C12648b;
import p551j.p552a.p561k.C12649c;
import p551j.p552a.p562l.C12652a;
import p551j.p552a.p569r.C12677b;

/* renamed from: j.a.g.b */
/* compiled from: AndroidSentryClientFactory */
public class C12597b extends C12586a {

    /* renamed from: j */
    public static final String f29228j = "j.a.g.b";

    /* renamed from: k */
    private static volatile C12594a f29229k;

    /* renamed from: i */
    private Context f29230i;

    /* renamed from: j.a.g.b$a */
    /* compiled from: AndroidSentryClientFactory */
    class C12598a implements C12596b {
        C12598a(C12597b bVar) {
        }

        /* renamed from: a */
        public void mo30909a(C12599c cVar) {
            String str = C12597b.f29228j;
            StringBuilder sb = new StringBuilder();
            sb.append("ANR triggered='");
            sb.append(cVar.getMessage());
            sb.append("'");
            Log.d(str, sb.toString());
            C12562b bVar = new C12562b();
            bVar.mo30743a("thread_state", cVar.mo30910a().toString());
            bVar.mo30739a((C12582h) new C12576b((Throwable) new C12578d(new C12577c("anr", false), cVar)));
            C12589b.m39530a(bVar);
        }
    }

    public C12597b(Application application) {
        Log.d(f29228j, "Construction of Android Sentry from Android Application.");
        this.f29230i = application.getApplicationContext();
    }

    /* renamed from: a */
    public C12590c mo30855a(C12652a aVar) {
        if (!m39562a("android.permission.INTERNET")) {
            Log.e(f29228j, "android.permission.INTERNET is required to connect to the Sentry server, please add it to your AndroidManifest.xml");
        }
        String str = f29228j;
        StringBuilder sb = new StringBuilder();
        sb.append("Sentry init with ctx='");
        sb.append(this.f29230i.toString());
        String str2 = "'";
        sb.append(str2);
        Log.d(str, sb.toString());
        String c = aVar.mo30965c();
        if (c.equalsIgnoreCase("noop")) {
            Log.w(f29228j, "*** Couldn't find a suitable DSN, Sentry operations will do nothing! See documentation: https://docs.sentry.io/clients/java/modules/android/ ***");
        } else if (!c.equalsIgnoreCase("http") && !c.equalsIgnoreCase("https")) {
            String b = C12607d.m39605b("async", aVar);
            if (b == null || !b.equalsIgnoreCase("false")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Only 'http' or 'https' connections are supported in Sentry Android, but received: ");
                sb2.append(c);
                throw new IllegalArgumentException(sb2.toString());
            }
            throw new IllegalArgumentException("Sentry Android cannot use synchronous connections, remove 'async=false' from your options.");
        }
        C12590c a = super.mo30855a(aVar);
        a.mo30887a((C12570c) new C12600a(this.f29230i));
        boolean equalsIgnoreCase = "true".equalsIgnoreCase(C12607d.m39605b("anr.enable", aVar));
        String str3 = f29228j;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ANR is='");
        sb3.append(String.valueOf(equalsIgnoreCase));
        sb3.append(str2);
        Log.d(str3, sb3.toString());
        if (equalsIgnoreCase && f29229k == null) {
            String b2 = C12607d.m39605b("anr.timeoutIntervalMs", aVar);
            int parseInt = b2 != null ? Integer.parseInt(b2) : 5000;
            String str4 = f29228j;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ANR timeoutIntervalMs is='");
            sb4.append(String.valueOf(parseInt));
            sb4.append(str2);
            Log.d(str4, sb4.toString());
            f29229k = new C12594a(parseInt, new C12598a(this));
            f29229k.start();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C12601a mo30868l(C12652a aVar) {
        File file;
        String b = C12607d.m39605b("buffer.dir", aVar);
        if (b != null) {
            file = new File(b);
        } else {
            file = new File(this.f29230i.getCacheDir().getAbsolutePath(), "sentry-buffered-events");
        }
        String str = f29228j;
        StringBuilder sb = new StringBuilder();
        sb.append("Using buffer dir: ");
        sb.append(file.getAbsolutePath());
        Log.d(str, sb.toString());
        return new C12602b(file, mo30871o(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C12648b mo30876t(C12652a aVar) {
        return new C12649c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Collection<String> mo30881y(C12652a aVar) {
        Collection<String> y = super.mo30881y(aVar);
        if (!y.isEmpty()) {
            return y;
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = this.f29230i.getPackageManager().getPackageInfo(this.f29230i.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            Log.e(f29228j, "Error getting package information.", e);
        }
        if (packageInfo == null || C12677b.m39771a(packageInfo.packageName)) {
            return y;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(packageInfo.packageName);
        return arrayList;
    }

    /* renamed from: a */
    private boolean m39562a(String str) {
        return this.f29230i.checkCallingOrSelfPermission(str) == 0;
    }
}
