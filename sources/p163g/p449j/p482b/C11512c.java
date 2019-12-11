package p163g.p449j.p482b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.C9713b;
import com.google.android.gms.common.api.internal.C9713b.C9714a;
import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.C9901s.C9902a;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.util.C9939c;
import com.google.android.gms.common.util.C9948l;
import com.google.android.gms.common.util.C9949m;
import com.google.firebase.components.C10429d;
import com.google.firebase.components.C10433f;
import com.google.firebase.components.C10442l;
import com.google.firebase.components.C10452s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p096e.p113e.C3926a;
import p096e.p121h.p130o.C4071h;
import p163g.p449j.p482b.p483e.C11521c;
import p163g.p449j.p482b.p485g.C11524a;
import p163g.p449j.p482b.p486h.C11527c;
import p163g.p449j.p482b.p486h.C11530f;

/* renamed from: g.j.b.c */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class C11512c {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f26910i = new Object();

    /* renamed from: j */
    private static final Executor f26911j = new C11516d();

    /* renamed from: k */
    static final Map<String, C11512c> f26912k = new C3926a();

    /* renamed from: a */
    private final Context f26913a;

    /* renamed from: b */
    private final String f26914b;

    /* renamed from: c */
    private final C11518d f26915c;

    /* renamed from: d */
    private final C10442l f26916d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f26917e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f26918f = new AtomicBoolean();

    /* renamed from: g */
    private final C10452s<C11524a> f26919g;

    /* renamed from: h */
    private final List<C11514b> f26920h = new CopyOnWriteArrayList();

    /* renamed from: g.j.b.c$b */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    public interface C11514b {
        /* renamed from: a */
        void mo29438a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: g.j.b.c$c */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class C11515c implements C9714a {

        /* renamed from: a */
        private static AtomicReference<C11515c> f26921a = new AtomicReference<>();

        private C11515c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m37139b(Context context) {
            if (C9948l.m30988a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f26921a.get() == null) {
                    C11515c cVar = new C11515c();
                    if (f26921a.compareAndSet(null, cVar)) {
                        C9713b.m30161a(application);
                        C9713b.m30163c().mo25102a((C9714a) cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo25115a(boolean z) {
            synchronized (C11512c.f26910i) {
                Iterator it = new ArrayList(C11512c.f26912k.values()).iterator();
                while (it.hasNext()) {
                    C11512c cVar = (C11512c) it.next();
                    if (cVar.f26917e.get()) {
                        cVar.m37124a(z);
                    }
                }
            }
        }
    }

    /* renamed from: g.j.b.c$d */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class C11516d implements Executor {

        /* renamed from: c */
        private static final Handler f26922c = new Handler(Looper.getMainLooper());

        private C11516d() {
        }

        public void execute(Runnable runnable) {
            f26922c.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: g.j.b.c$e */
    /* compiled from: com.google.firebase:firebase-common@@17.1.0 */
    private static class C11517e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C11517e> f26923b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f26924a;

        public C11517e(Context context) {
            this.f26924a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m37142b(Context context) {
            if (f26923b.get() == null) {
                C11517e eVar = new C11517e(context);
                if (f26923b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C11512c.f26910i) {
                for (C11512c a : C11512c.f26912k.values()) {
                    a.m37129j();
                }
            }
            mo29440a();
        }

        /* renamed from: a */
        public void mo29440a() {
            this.f26924a.unregisterReceiver(this);
        }
    }

    protected C11512c(Context context, String str, C11518d dVar) {
        new CopyOnWriteArrayList();
        C9908u.m30853a(context);
        this.f26913a = context;
        C9908u.m30863b(str);
        this.f26914b = str;
        C9908u.m30853a(dVar);
        this.f26915c = dVar;
        List a = C10433f.m32981a(context).mo27235a();
        this.f26916d = new C10442l(f26911j, a, C10429d.m32958a(context, Context.class, new Class[0]), C10429d.m32958a(this, C11512c.class, new Class[0]), C10429d.m32958a(dVar, C11518d.class, new Class[0]), C11530f.m37168a("fire-android", ""), C11530f.m37168a("fire-core", "17.0.0"), C11527c.m37160a());
        this.f26919g = new C10452s<>(C11511b.m37116a(this, context));
    }

    /* renamed from: h */
    private void m37127h() {
        C9908u.m30865b(!this.f26918f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: i */
    public static C11512c m37128i() {
        C11512c cVar;
        synchronized (f26910i) {
            cVar = (C11512c) f26912k.get("[DEFAULT]");
            if (cVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(C9949m.m30998a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m37129j() {
        if (!C4071h.m13984a(this.f26913a)) {
            C11517e.m37142b(this.f26913a);
        } else {
            this.f26916d.mo27239a(mo29435f());
        }
    }

    /* renamed from: c */
    public C11518d mo29431c() {
        m37127h();
        return this.f26915c;
    }

    /* renamed from: d */
    public String mo29432d() {
        StringBuilder sb = new StringBuilder();
        sb.append(C9939c.m30966a(mo29430b().getBytes(Charset.defaultCharset())));
        sb.append("+");
        sb.append(C9939c.m30966a(mo29431c().mo29442a().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    /* renamed from: e */
    public boolean mo29433e() {
        m37127h();
        return ((C11524a) this.f26919g.get()).mo29450a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11512c)) {
            return false;
        }
        return this.f26914b.equals(((C11512c) obj).mo29430b());
    }

    /* renamed from: f */
    public boolean mo29435f() {
        return "[DEFAULT]".equals(mo29430b());
    }

    public int hashCode() {
        return this.f26914b.hashCode();
    }

    public String toString() {
        C9902a a = C9901s.m30840a((Object) this);
        a.mo25435a("name", this.f26914b);
        a.mo25435a("options", this.f26915c);
        return a.toString();
    }

    /* renamed from: b */
    public String mo29430b() {
        m37127h();
        return this.f26914b;
    }

    /* renamed from: a */
    public Context mo29428a() {
        m37127h();
        return this.f26913a;
    }

    /* renamed from: a */
    public static C11512c m37117a(Context context) {
        synchronized (f26910i) {
            if (f26912k.containsKey("[DEFAULT]")) {
                C11512c i = m37128i();
                return i;
            }
            C11518d a = C11518d.m37144a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C11512c a2 = m37118a(context, a);
            return a2;
        }
    }

    /* renamed from: a */
    public static C11512c m37118a(Context context, C11518d dVar) {
        return m37119a(context, dVar, "[DEFAULT]");
    }

    /* renamed from: a */
    public static C11512c m37119a(Context context, C11518d dVar, String str) {
        C11512c cVar;
        C11515c.m37139b(context);
        String a = m37121a(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f26910i) {
            boolean z = !f26912k.containsKey(a);
            StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(a);
            sb.append(" already exists!");
            C9908u.m30865b(z, sb.toString());
            C9908u.m30854a(context, (Object) "Application context cannot be null.");
            cVar = new C11512c(context, a, dVar);
            f26912k.put(a, cVar);
        }
        cVar.m37129j();
        return cVar;
    }

    /* renamed from: a */
    public <T> T mo29429a(Class<T> cls) {
        m37127h();
        return this.f26916d.get(cls);
    }

    /* renamed from: a */
    static /* synthetic */ C11524a m37120a(C11512c cVar, Context context) {
        return new C11524a(context, cVar.mo29432d(), (C11521c) cVar.f26916d.get(C11521c.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m37124a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C11514b a : this.f26920h) {
            a.mo29438a(z);
        }
    }

    /* renamed from: a */
    private static String m37121a(String str) {
        return str.trim();
    }
}
