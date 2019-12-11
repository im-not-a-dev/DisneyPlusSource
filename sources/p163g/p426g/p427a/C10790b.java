package p163g.p426g.p427a;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import p163g.p426g.p427a.p428i.C10821c;
import p163g.p426g.p435f.C10854b;
import p163g.p426g.p435f.C10863f;
import p163g.p426g.p435f.C10867g;
import p163g.p426g.p436g.C10872c;
import p163g.p426g.p436g.C10875d;
import p163g.p426g.p436g.C10880i;
import p163g.p426g.p436g.C10883k;

/* renamed from: g.g.a.b */
/* compiled from: Client */
public class C10790b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10880i f25496a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10867g f25497b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10816g f25498c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10811c f25499d = null;

    /* renamed from: e */
    private C10875d f25500e = null;

    /* renamed from: f */
    private boolean f25501f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10814e f25502g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10872c f25503h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f25504i = -1;

    /* renamed from: j */
    private volatile boolean f25505j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f25506k = false;

    /* renamed from: g.g.a.b$a */
    /* compiled from: Client */
    class C10791a implements Callable<Void> {

        /* renamed from: U */
        final /* synthetic */ C10801k f25507U;

        /* renamed from: V */
        final /* synthetic */ C10799i f25508V;

        /* renamed from: W */
        final /* synthetic */ C10800j f25509W;

        /* renamed from: c */
        final /* synthetic */ int f25511c;

        C10791a(int i, C10801k kVar, C10799i iVar, C10800j jVar) {
            this.f25511c = i;
            this.f25507U = kVar;
            this.f25508V = iVar;
            this.f25509W = jVar;
        }

        public Void call() throws Exception {
            C10863f a = C10790b.this.f25497b.mo27972a(this.f25511c);
            if (a != null) {
                a.mo27958a(this.f25507U, this.f25508V, this.f25509W);
            }
            return null;
        }
    }

    /* renamed from: g.g.a.b$b */
    /* compiled from: Client */
    class C10792b implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ int f25513c;

        C10792b(int i) {
            this.f25513c = i;
        }

        public Void call() throws Exception {
            C10863f a = C10790b.this.f25497b.mo27972a(this.f25513c);
            if (a != null) {
                a.mo27957a();
            }
            return null;
        }
    }

    /* renamed from: g.g.a.b$c */
    /* compiled from: Client */
    class C10793c implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ int f25515c;

        C10793c(int i) {
            this.f25515c = i;
        }

        public Void call() throws Exception {
            if (C10790b.this.f25497b.mo27972a(this.f25515c) != null) {
                C10790b.this.f25497b.mo27974a(this.f25515c, true);
            }
            return null;
        }
    }

    /* renamed from: g.g.a.b$e */
    /* compiled from: Client */
    class C10795e implements Callable<Void> {

        /* renamed from: U */
        final /* synthetic */ C10811c f25516U;

        /* renamed from: c */
        C10790b f25518c;

        public C10795e(C10790b bVar, C10811c cVar) {
            this.f25516U = cVar;
            this.f25518c = bVar;
        }

        public Void call() throws Exception {
            C10790b bVar = C10790b.this;
            bVar.f25496a = bVar.f25498c.mo27862f();
            C10790b.this.f25496a.mo27989b("Client");
            C10880i a = C10790b.this.f25496a;
            StringBuilder sb = new StringBuilder();
            sb.append("init(): url=");
            sb.append(C10790b.this.f25499d.f25552c);
            a.mo27993d(sb.toString());
            if (C10790b.this.f25506k) {
                C10790b.this.f25496a.mo27988a("Gateway URL should not be set to https://cws.conviva.com or http://cws.conviva.com, therefore this call is ignored");
                C10790b.this.f25506k = false;
            }
            C10790b.this.f25504i = C10883k.m34337a();
            C10790b bVar2 = C10790b.this;
            bVar2.f25503h = bVar2.f25498c.mo27856a(this.f25518c);
            C10790b.this.f25503h.mo27982b();
            C10790b bVar3 = C10790b.this;
            bVar3.f25497b = bVar3.f25498c.mo27854a(this.f25518c, C10790b.this.f25499d, C10790b.this.f25503h);
            C10790b.this.f25496a.mo27993d("init(): done.");
            C10790b.this.f25502g = C10814e.m34083b();
            C10854b.m34207a(this.f25516U, C10790b.this.f25498c);
            return null;
        }
    }

    /* renamed from: g.g.a.b$f */
    /* compiled from: Client */
    class C10796f implements Callable<Void> {

        /* renamed from: U */
        final /* synthetic */ C10812d f25519U;

        /* renamed from: c */
        int f25521c = -2;

        C10796f(C10812d dVar) {
            this.f25519U = dVar;
        }

        /* renamed from: a */
        public int mo27835a() {
            return this.f25521c;
        }

        public Void call() throws Exception {
            this.f25521c = C10790b.this.f25497b.mo27971a(this.f25519U);
            return null;
        }
    }

    /* renamed from: g.g.a.b$g */
    /* compiled from: Client */
    class C10797g implements Callable<Void> {

        /* renamed from: U */
        final /* synthetic */ String f25522U;

        /* renamed from: V */
        final /* synthetic */ C10810m f25523V;

        /* renamed from: c */
        final /* synthetic */ int f25525c;

        C10797g(int i, String str, C10810m mVar) {
            this.f25525c = i;
            this.f25522U = str;
            this.f25523V = mVar;
        }

        public Void call() throws Exception {
            C10863f a = C10790b.this.f25497b.mo27972a(this.f25525c);
            if (a != null) {
                a.mo27960a(this.f25522U, this.f25523V);
            }
            return null;
        }
    }

    /* renamed from: g.g.a.b$h */
    /* compiled from: Client */
    class C10798h implements Callable<Void> {

        /* renamed from: U */
        final /* synthetic */ C10821c f25526U;

        /* renamed from: c */
        final /* synthetic */ int f25528c;

        C10798h(int i, C10821c cVar) {
            this.f25528c = i;
            this.f25526U = cVar;
        }

        public Void call() throws Exception {
            C10863f a = C10790b.this.f25497b.mo27972a(this.f25528c);
            if (a != null) {
                a.mo27959a(this.f25526U);
            }
            return null;
        }
    }

    /* renamed from: g.g.a.b$i */
    /* compiled from: Client */
    public enum C10799i {
        CONTENT,
        SEPARATE
    }

    /* renamed from: g.g.a.b$j */
    /* compiled from: Client */
    public enum C10800j {
        PREROLL,
        MIDROLL,
        POSTROLL
    }

    /* renamed from: g.g.a.b$k */
    /* compiled from: Client */
    public enum C10801k {
        CONTENT,
        SEPARATE
    }

    /* renamed from: g.g.a.b$l */
    /* compiled from: Client */
    public enum C10802l {
        DESKTOP {
            public String toString() {
                return "DESKTOP";
            }
        },
        CONSOLE {
            public String toString() {
                return "Console";
            }
        },
        SETTOP {
            public String toString() {
                return "Settop";
            }
        },
        MOBILE {
            public String toString() {
                return "Mobile";
            }
        },
        TABLET {
            public String toString() {
                return "Tablet";
            }
        },
        SMARTTV {
            public String toString() {
                return "SmartTV";
            }
        },
        UNKNOWN {
            public String toString() {
                return "Unknown";
            }
        };
    }

    /* renamed from: g.g.a.b$m */
    /* compiled from: Client */
    public enum C10810m {
        FATAL,
        WARNING
    }

    public C10790b(C10811c cVar, C10816g gVar) {
        if (cVar.mo27846a()) {
            try {
                if (new URL("https://cws.conviva.com").getHost().equals(new URL(cVar.f25552c).getHost())) {
                    this.f25506k = true;
                }
            } catch (MalformedURLException unused) {
            }
            this.f25499d = new C10811c(cVar);
            this.f25498c = gVar;
            this.f25498c.mo27857a("SDK", this.f25499d);
            this.f25500e = this.f25498c.mo27858b();
            try {
                this.f25500e.mo27986a((Callable<V>) new C10795e<V>(this, cVar), "Client.init");
                this.f25505j = true;
            } catch (Exception unused2) {
                this.f25505j = false;
                this.f25498c = null;
                this.f25500e = null;
                C10867g gVar2 = this.f25497b;
                if (gVar2 != null) {
                    gVar2.mo27973a();
                }
                this.f25497b = null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo27830b() {
        return this.f25505j && !this.f25501f;
    }

    /* renamed from: b */
    public void mo27829b(int i) throws C10815f {
        if (mo27830b()) {
            this.f25500e.mo27986a((Callable<V>) new C10793c<V>(i), "Client.cleanupSession");
        }
    }

    /* renamed from: a */
    public int mo27824a(C10812d dVar) throws C10815f {
        if (!mo27830b()) {
            return -2;
        }
        C10796f fVar = new C10796f(dVar);
        this.f25500e.mo27986a((Callable<V>) fVar, "Client.createSession");
        return fVar.mo27835a();
    }

    /* renamed from: a */
    public void mo27828a(int i, String str, C10810m mVar) throws C10815f {
        if (mo27830b()) {
            this.f25500e.mo27986a((Callable<V>) new C10797g<V>(i, str, mVar), "Client.reportError");
        }
    }

    /* renamed from: a */
    public void mo27827a(int i, C10821c cVar) throws C10815f {
        if (mo27830b()) {
            if (cVar == null) {
                this.f25496a.mo27988a("attachPlayer(): expecting an instance of PlayerStateManager for playerStateManager parameter");
                return;
            }
            this.f25500e.mo27986a((Callable<V>) new C10798h<V>(i, cVar), "Client.attachPlayer");
        }
    }

    /* renamed from: a */
    public void mo27826a(int i, C10801k kVar, C10799i iVar, C10800j jVar) throws C10815f {
        if (mo27830b()) {
            C10791a aVar = new C10791a(i, kVar, iVar, jVar);
            this.f25500e.mo27986a((Callable<V>) aVar, "Client.adStart");
        }
    }

    /* renamed from: a */
    public void mo27825a(int i) throws C10815f {
        if (mo27830b()) {
            this.f25500e.mo27986a((Callable<V>) new C10792b<V>(i), "Client.adEnd");
        }
    }

    /* renamed from: a */
    public int mo27823a() {
        return this.f25504i;
    }
}
