package p163g.p441i.p442a.p443a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.Writer;
import p163g.p441i.p442a.p443a.C10903f.C10904a;
import p163g.p441i.p442a.p443a.p445r.C10917b;
import p163g.p441i.p442a.p443a.p445r.C10918c;
import p163g.p441i.p442a.p443a.p445r.C10921f;
import p163g.p441i.p442a.p443a.p445r.C10923h;
import p163g.p441i.p442a.p443a.p446s.C10927d;
import p163g.p441i.p442a.p443a.p446s.C10928e;
import p163g.p441i.p442a.p443a.p447t.C10929a;
import p163g.p441i.p442a.p443a.p447t.C10931b;
import p163g.p441i.p442a.p443a.p448u.C10934a;
import p163g.p441i.p442a.p443a.p448u.C10935b;
import p163g.p441i.p442a.p443a.p448u.C10937d;

/* renamed from: g.i.a.a.d */
/* compiled from: JsonFactory */
public class C10900d implements C10914p, Serializable {

    /* renamed from: Z */
    protected static final int f25844Z = C10901a.m34377c();

    /* renamed from: a0 */
    protected static final int f25845a0 = C10907i.m34417c();

    /* renamed from: b0 */
    protected static final int f25846b0 = C10904a.m34410c();

    /* renamed from: c0 */
    private static final C10912n f25847c0 = C10937d.f25990c;

    /* renamed from: U */
    protected int f25848U;

    /* renamed from: V */
    protected int f25849V;

    /* renamed from: W */
    protected C10917b f25850W;

    /* renamed from: X */
    protected C10921f f25851X;

    /* renamed from: Y */
    protected C10912n f25852Y;

    /* renamed from: c */
    protected C10910l f25853c;

    /* renamed from: g.i.a.a.d$a */
    /* compiled from: JsonFactory */
    public enum C10901a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        

        /* renamed from: c */
        private final boolean f25859c;

        private C10901a(boolean z) {
            this.f25859c = z;
        }

        /* renamed from: c */
        public static int m34377c() {
            C10901a[] values;
            int i = 0;
            for (C10901a aVar : values()) {
                if (aVar.mo28033a()) {
                    i |= aVar.mo28035b();
                }
            }
            return i;
        }

        /* renamed from: a */
        public boolean mo28033a() {
            return this.f25859c;
        }

        /* renamed from: b */
        public int mo28035b() {
            return 1 << ordinal();
        }

        /* renamed from: a */
        public boolean mo28034a(int i) {
            return (i & mo28035b()) != 0;
        }
    }

    public C10900d() {
        this(null);
    }

    /* renamed from: a */
    public C10903f mo28025a(OutputStream outputStream, C10899c cVar) throws IOException {
        C10918c a = mo28028a((Object) outputStream, false);
        a.mo28107a(cVar);
        if (cVar == C10899c.UTF8) {
            return mo28026a(mo28031b(outputStream, a), a);
        }
        return mo28027a(mo28032b(mo28030a(outputStream, cVar, a), a), a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final OutputStream mo28031b(OutputStream outputStream, C10918c cVar) throws IOException {
        C10921f fVar = this.f25851X;
        if (fVar != null) {
            OutputStream a = fVar.mo28118a(cVar, outputStream);
            if (a != null) {
                return a;
            }
        }
        return outputStream;
    }

    public C10900d(C10910l lVar) {
        C10931b.m34608a();
        C10929a.m34601g();
        this.f25848U = f25844Z;
        this.f25849V = f25846b0;
        this.f25852Y = f25847c0;
        this.f25853c = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Writer mo28032b(Writer writer, C10918c cVar) throws IOException {
        C10921f fVar = this.f25851X;
        if (fVar != null) {
            Writer a = fVar.mo28119a(cVar, writer);
            if (a != null) {
                return a;
            }
        }
        return writer;
    }

    /* renamed from: a */
    public C10903f mo28024a(OutputStream outputStream) throws IOException {
        return mo28025a(outputStream, C10899c.UTF8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10903f mo28027a(Writer writer, C10918c cVar) throws IOException {
        C10928e eVar = new C10928e(cVar, this.f25849V, this.f25853c, writer);
        C10917b bVar = this.f25850W;
        if (bVar != null) {
            eVar.mo28137a(bVar);
        }
        C10912n nVar = this.f25852Y;
        if (nVar != f25847c0) {
            eVar.mo28136a(nVar);
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10903f mo28026a(OutputStream outputStream, C10918c cVar) throws IOException {
        C10927d dVar = new C10927d(cVar, this.f25849V, this.f25853c, outputStream);
        C10917b bVar = this.f25850W;
        if (bVar != null) {
            dVar.mo28137a(bVar);
        }
        C10912n nVar = this.f25852Y;
        if (nVar != f25847c0) {
            dVar.mo28136a(nVar);
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Writer mo28030a(OutputStream outputStream, C10899c cVar, C10918c cVar2) throws IOException {
        if (cVar == C10899c.UTF8) {
            return new C10923h(cVar2, outputStream);
        }
        return new OutputStreamWriter(outputStream, cVar.mo28023a());
    }

    /* renamed from: a */
    public C10934a mo28029a() {
        if (C10901a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.mo28034a(this.f25848U)) {
            return C10935b.m34621a();
        }
        return new C10934a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10918c mo28028a(Object obj, boolean z) {
        return new C10918c(mo28029a(), obj, z);
    }
}
