package p163g.p426g.p436g;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import p163g.p426g.p427a.p429j.C10827a;
import p163g.p426g.p431c.C10838a;
import p163g.p426g.p434e.C10852a;

/* renamed from: g.g.g.c */
/* compiled from: Config */
public class C10872c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10880i f25761a;

    /* renamed from: b */
    private C10884l f25762b;

    /* renamed from: c */
    private C10838a f25763c;

    /* renamed from: d */
    private Map<String, Object> f25764d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f25765e = false;

    /* renamed from: f */
    private Stack<C10869a> f25766f = new Stack<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f25767g;

    /* renamed from: h */
    public Map<String, Object> f25768h;

    /* renamed from: g.g.g.c$a */
    /* compiled from: Config */
    class C10873a implements C10827a {
        C10873a() {
        }

        /* renamed from: a */
        public void mo27892a(boolean z, String str) {
            if (!z) {
                C10880i b = C10872c.this.f25761a;
                StringBuilder sb = new StringBuilder();
                sb.append("load(): error loading configuration from local storage: ");
                sb.append(str);
                b.mo27988a(sb.toString());
            } else if (str != null) {
                C10872c.this.mo27983b(str);
                C10880i b2 = C10872c.this.f25761a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("load(): configuration successfully loaded from local storage");
                sb2.append(C10872c.this.f25767g ? " (was empty)" : "");
                sb2.append(".");
                b2.mo27992c(sb2.toString());
            }
            C10872c.this.f25765e = true;
            C10872c.this.m34300e();
        }
    }

    /* renamed from: g.g.g.c$b */
    /* compiled from: Config */
    class C10874b implements C10827a {
        C10874b() {
        }

        /* renamed from: a */
        public void mo27892a(boolean z, String str) {
            if (z) {
                C10872c.this.f25761a.mo27992c("save(): configuration successfully saved to local storage.");
                return;
            }
            C10880i b = C10872c.this.f25761a;
            StringBuilder sb = new StringBuilder();
            sb.append("save(): error saving configuration to local storage: ");
            sb.append(str);
            b.mo27988a(sb.toString());
        }
    }

    public C10872c(C10880i iVar, C10884l lVar, C10838a aVar) {
        this.f25761a = iVar;
        this.f25762b = lVar;
        this.f25763c = aVar;
        this.f25761a.mo27989b("Config");
        this.f25764d = new HashMap();
        this.f25764d.put("clientId", C10852a.f25648c);
        this.f25764d.put("sendLogs", Boolean.valueOf(false));
        this.f25768h = new HashMap();
        this.f25768h.putAll(this.f25764d);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m34300e() {
        if (!this.f25766f.empty()) {
            while (true) {
                C10869a aVar = (C10869a) this.f25766f.pop();
                if (aVar != null) {
                    aVar.mo27969a();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo27985d() {
        String str = "sdkConfig";
        this.f25762b.mo27999a(str, mo27984c(), new C10874b());
    }

    /* renamed from: b */
    public void mo27982b() {
        this.f25767g = false;
        this.f25762b.mo27998a("sdkConfig", new C10873a());
    }

    /* renamed from: c */
    public String mo27984c() {
        HashMap hashMap = new HashMap();
        hashMap.put("clId", this.f25768h.get("clientId"));
        return this.f25763c.mo27921a((Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public boolean mo27981a() {
        return this.f25765e;
    }

    /* renamed from: a */
    public void mo27979a(C10869a aVar) {
        if (mo27981a()) {
            aVar.mo27969a();
        } else {
            this.f25766f.push(aVar);
        }
    }

    /* renamed from: b */
    public void mo27983b(String str) {
        String str2;
        Map a = this.f25763c.mo27922a(str);
        if (a == null) {
            this.f25767g = true;
            return;
        }
        if (a != null) {
            String str3 = "clId";
            if (a.containsKey(str3)) {
                str2 = a.get(str3).toString();
                if (str2 != null && !str2.equals(C10852a.f25648c) && !str2.equals("null") && str2.length() > 0) {
                    this.f25768h.put("clientId", str2);
                    C10880i iVar = this.f25761a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("parse(): setting the client id to ");
                    sb.append(str2);
                    sb.append(" (from local storage)");
                    iVar.mo27993d(sb.toString());
                }
            }
        }
        str2 = null;
        this.f25768h.put("clientId", str2);
        C10880i iVar2 = this.f25761a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("parse(): setting the client id to ");
        sb2.append(str2);
        sb2.append(" (from local storage)");
        iVar2.mo27993d(sb2.toString());
    }

    /* renamed from: a */
    public Object mo27978a(String str) {
        if (this.f25765e) {
            return this.f25768h.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo27980a(String str, Object obj) {
        if (this.f25765e) {
            this.f25768h.put(str, obj);
        }
    }
}
