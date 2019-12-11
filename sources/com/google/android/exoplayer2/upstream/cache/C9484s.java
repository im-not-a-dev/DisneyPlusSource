package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.database.C8684a;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.upstream.cache.Cache.C9457a;
import com.google.android.exoplayer2.upstream.cache.Cache.C9458b;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: com.google.android.exoplayer2.upstream.cache.s */
/* compiled from: SimpleCache */
public final class C9484s implements Cache {

    /* renamed from: l */
    private static final HashSet<File> f22068l = new HashSet<>();

    /* renamed from: m */
    private static boolean f22069m;

    /* renamed from: n */
    private static boolean f22070n;

    /* renamed from: a */
    private final File f22071a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9466f f22072b;

    /* renamed from: c */
    private final C9475m f22073c;

    /* renamed from: d */
    private final C9468h f22074d;

    /* renamed from: e */
    private final HashMap<String, ArrayList<C9458b>> f22075e;

    /* renamed from: f */
    private final Random f22076f;

    /* renamed from: g */
    private final boolean f22077g;

    /* renamed from: h */
    private long f22078h;

    /* renamed from: i */
    private long f22079i;

    /* renamed from: j */
    private boolean f22080j;

    /* renamed from: k */
    private C9457a f22081k;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.s$a */
    /* compiled from: SimpleCache */
    class C9485a extends Thread {

        /* renamed from: c */
        final /* synthetic */ ConditionVariable f22083c;

        C9485a(String str, ConditionVariable conditionVariable) {
            this.f22083c = conditionVariable;
            super(str);
        }

        public void run() {
            synchronized (C9484s.this) {
                this.f22083c.open();
                C9484s.this.m29168d();
                C9484s.this.f22072b.mo24495a();
            }
        }
    }

    @Deprecated
    public C9484s(File file, C9466f fVar) {
        this(file, fVar, (byte[]) null, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m29168d() {
        String str = "SimpleCache";
        if (this.f22071a.exists() || this.f22071a.mkdirs()) {
            File[] listFiles = this.f22071a.listFiles();
            if (listFiles == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to list cache directory files: ");
                sb.append(this.f22071a);
                String sb2 = sb.toString();
                C9563q.m29497b(str, sb2);
                this.f22081k = new C9457a(sb2);
                return;
            }
            this.f22078h = m29154a(listFiles);
            if (this.f22078h == -1) {
                try {
                    this.f22078h = m29153a(this.f22071a);
                } catch (IOException e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to create cache UID: ");
                    sb3.append(this.f22071a);
                    String sb4 = sb3.toString();
                    C9563q.m29496a(str, sb4, e);
                    this.f22081k = new C9457a(sb4, e);
                    return;
                }
            }
            try {
                this.f22073c.mo24526a(this.f22078h);
                if (this.f22074d != null) {
                    this.f22074d.mo24499a(this.f22078h);
                    Map a = this.f22074d.mo24498a();
                    m29159a(this.f22071a, true, listFiles, a);
                    this.f22074d.mo24502a(a.keySet());
                } else {
                    m29159a(this.f22071a, true, listFiles, null);
                }
                this.f22073c.mo24529b();
                try {
                    this.f22073c.mo24531c();
                } catch (IOException e2) {
                    C9563q.m29496a(str, "Storing index file failed", e2);
                }
            } catch (IOException e3) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Failed to initialize cache indices: ");
                sb5.append(this.f22071a);
                String sb6 = sb5.toString();
                C9563q.m29496a(str, sb6, e3);
                this.f22081k = new C9457a(sb6, e3);
            }
        } else {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Failed to create cache directory: ");
            sb7.append(this.f22071a);
            String sb8 = sb7.toString();
            C9563q.m29497b(str, sb8);
            this.f22081k = new C9457a(sb8);
        }
    }

    /* renamed from: e */
    private void m29169e() {
        ArrayList arrayList = new ArrayList();
        for (C9474l b : this.f22073c.mo24525a()) {
            Iterator it = b.mo24518b().iterator();
            while (it.hasNext()) {
                C9470j jVar = (C9470j) it.next();
                if (!jVar.f22033X.exists()) {
                    arrayList.add(jVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m29166c((C9470j) arrayList.get(i));
        }
    }

    /* renamed from: c */
    public synchronized void mo24553c() throws C9457a {
        if (!f22070n) {
            if (this.f22081k != null) {
                throw this.f22081k;
            }
        }
    }

    @Deprecated
    public C9484s(File file, C9466f fVar, byte[] bArr, boolean z) {
        this(file, fVar, null, bArr, z, true);
    }

    public C9484s(File file, C9466f fVar, DatabaseProvider databaseProvider) {
        this(file, fVar, databaseProvider, null, false, false);
    }

    /* renamed from: a */
    public static void m29158a(File file, DatabaseProvider databaseProvider) {
        String str = "Failed to delete file metadata: ";
        String str2 = "SimpleCache";
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.delete();
                return;
            }
            if (databaseProvider != null) {
                long a = m29154a(listFiles);
                if (a != -1) {
                    try {
                        C9468h.m29032a(databaseProvider, a);
                    } catch (C8684a unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(a);
                        C9563q.m29500d(str2, sb.toString());
                    }
                    try {
                        C9475m.m29070a(databaseProvider, a);
                    } catch (C8684a unused2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(a);
                        C9563q.m29500d(str2, sb2.toString());
                    }
                }
            }
            C9554k0.m29407a(file);
        }
    }

    /* renamed from: b */
    public synchronized long mo24482b() {
        C9537e.m29301b(!this.f22080j);
        return this.f22079i;
    }

    public C9484s(File file, C9466f fVar, DatabaseProvider databaseProvider, byte[] bArr, boolean z, boolean z2) {
        C9475m mVar = new C9475m(databaseProvider, file, bArr, z, z2);
        this(file, fVar, mVar, (databaseProvider == null || z2) ? null : new C9468h(databaseProvider));
    }

    /* renamed from: c */
    private C9486t m29165c(String str, long j) {
        C9486t a;
        C9474l b = this.f22073c.mo24528b(str);
        if (b == null) {
            return C9486t.m29189b(str, j);
        }
        while (true) {
            a = b.mo24512a(j);
            if (!a.f22032W || a.f22033X.exists()) {
                return a;
            }
            m29169e();
        }
        return a;
    }

    C9484s(File file, C9466f fVar, C9475m mVar, C9468h hVar) {
        if (m29164b(file)) {
            this.f22071a = file;
            this.f22072b = fVar;
            this.f22073c = mVar;
            this.f22074d = hVar;
            this.f22075e = new HashMap<>();
            this.f22076f = new Random();
            this.f22077g = fVar.mo24497b();
            this.f22078h = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C9485a("SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(file);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public synchronized C9486t m29181b(String str, long j) throws C9457a {
        boolean z = false;
        C9537e.m29301b(!this.f22080j);
        mo24553c();
        C9486t c = m29165c(str, j);
        if (!c.f22032W) {
            C9474l d = this.f22073c.mo24532d(str);
            if (d.mo24520d()) {
                return null;
            }
            d.mo24515a(true);
            return c;
        } else if (!this.f22077g) {
            return c;
        } else {
            File file = c.f22033X;
            C9537e.m29296a(file);
            String name = file.getName();
            long j2 = c.f22031V;
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f22074d != null) {
                try {
                    this.f22074d.mo24501a(name, j2, currentTimeMillis);
                } catch (IOException unused) {
                    C9563q.m29500d("SimpleCache", "Failed to update index with new touch timestamp.");
                }
            } else {
                z = true;
            }
            C9486t a = this.f22073c.mo24528b(str).mo24513a(c, currentTimeMillis, z);
            m29157a(c, (C9470j) a);
            return a;
        }
    }

    /* renamed from: c */
    private void m29166c(C9470j jVar) {
        C9474l b = this.f22073c.mo24528b(jVar.f22035c);
        if (b != null && b.mo24516a(jVar)) {
            this.f22079i -= jVar.f22031V;
            if (this.f22074d != null) {
                String name = jVar.f22033X.getName();
                try {
                    this.f22074d.mo24500a(name);
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to remove file index entry for: ");
                    sb.append(name);
                    C9563q.m29500d("SimpleCache", sb.toString());
                }
            }
            this.f22073c.mo24533e(b.f22041b);
            m29162b(jVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo24478a() {
        if (!this.f22080j) {
            this.f22075e.clear();
            m29169e();
            try {
                this.f22073c.mo24531c();
                m29167c(this.f22071a);
            } catch (IOException e) {
                try {
                    C9563q.m29496a("SimpleCache", "Storing index file failed", e);
                    m29167c(this.f22071a);
                } catch (Throwable th) {
                    m29167c(this.f22071a);
                    this.f22080j = true;
                    throw th;
                }
            }
            this.f22080j = true;
            return;
        }
        return;
    }

    /* renamed from: c */
    private static synchronized void m29167c(File file) {
        synchronized (C9484s.class) {
            if (!f22069m) {
                f22068l.remove(file.getAbsoluteFile());
            }
        }
    }

    /* renamed from: a */
    public synchronized C9486t m29172a(String str, long j) throws InterruptedException, C9457a {
        C9486t b;
        C9537e.m29301b(!this.f22080j);
        mo24553c();
        while (true) {
            b = mo24484b(str, j);
            if (b == null) {
                wait();
            }
        }
        return b;
    }

    /* renamed from: b */
    public synchronized long mo24483b(String str, long j, long j2) {
        C9474l b;
        C9537e.m29301b(!this.f22080j);
        b = this.f22073c.mo24528b(str);
        return b != null ? b.mo24510a(j, j2) : -j2;
    }

    /* renamed from: b */
    private void m29162b(C9470j jVar) {
        ArrayList arrayList = (ArrayList) this.f22075e.get(jVar.f22035c);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C9458b) arrayList.get(size)).mo24485a(this, jVar);
            }
        }
        this.f22072b.mo24485a(this, jVar);
    }

    /* renamed from: a */
    public synchronized File mo24477a(String str, long j, long j2) throws C9457a {
        C9474l b;
        File file;
        C9537e.m29301b(!this.f22080j);
        mo24553c();
        b = this.f22073c.mo24528b(str);
        C9537e.m29296a(b);
        C9537e.m29301b(b.mo24520d());
        if (!this.f22071a.exists()) {
            this.f22071a.mkdirs();
            m29169e();
        }
        this.f22072b.mo24496a(this, str, j, j2);
        file = new File(this.f22071a, Integer.toString(this.f22076f.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return C9486t.m29187a(file, b.f22040a, j, System.currentTimeMillis());
    }

    /* renamed from: b */
    private void m29163b(C9486t tVar) {
        ArrayList arrayList = (ArrayList) this.f22075e.get(tVar.f22035c);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C9458b) arrayList.get(size)).mo24487b(this, tVar);
            }
        }
        this.f22072b.mo24487b(this, tVar);
    }

    /* renamed from: b */
    private static long m29160b(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    /* renamed from: b */
    private static synchronized boolean m29164b(File file) {
        synchronized (C9484s.class) {
            if (f22069m) {
                return true;
            }
            boolean add = f22068l.add(file.getAbsoluteFile());
            return add;
        }
    }

    /* renamed from: a */
    public synchronized void mo24480a(File file, long j) throws C9457a {
        boolean z = true;
        C9537e.m29301b(!this.f22080j);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C9486t a = C9486t.m29184a(file, j, this.f22073c);
            C9537e.m29296a(a);
            C9486t tVar = a;
            C9474l b = this.f22073c.mo24528b(tVar.f22035c);
            C9537e.m29296a(b);
            C9474l lVar = b;
            C9537e.m29301b(lVar.mo24520d());
            long a2 = C9479n.m29126a(lVar.mo24511a());
            if (a2 != -1) {
                if (tVar.f22030U + tVar.f22031V > a2) {
                    z = false;
                }
                C9537e.m29301b(z);
            }
            if (this.f22074d != null) {
                try {
                    this.f22074d.mo24501a(file.getName(), tVar.f22031V, tVar.f22034Y);
                } catch (IOException e) {
                    throw new C9457a((Throwable) e);
                } catch (IOException e2) {
                    throw new C9457a((Throwable) e2);
                }
            }
            m29156a(tVar);
            this.f22073c.mo24531c();
            notifyAll();
        }
    }

    /* renamed from: a */
    public synchronized void mo24479a(C9470j jVar) {
        C9537e.m29301b(!this.f22080j);
        C9474l b = this.f22073c.mo24528b(jVar.f22035c);
        C9537e.m29296a(b);
        C9537e.m29301b(b.mo24520d());
        b.mo24515a(false);
        this.f22073c.mo24533e(b.f22041b);
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void mo24481a(String str, C9481p pVar) throws C9457a {
        C9537e.m29301b(!this.f22080j);
        mo24553c();
        this.f22073c.mo24527a(str, pVar);
        try {
            this.f22073c.mo24531c();
        } catch (IOException e) {
            throw new C9457a((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized C9480o mo24476a(String str) {
        C9537e.m29301b(!this.f22080j);
        return this.f22073c.mo24530c(str);
    }

    /* renamed from: a */
    private void m29159a(File file, boolean z, File[] fileArr, Map<String, C9467g> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (!z) {
                file.delete();
            }
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                m29159a(file2, false, file2.listFiles(), map);
            } else if (!z || (!C9475m.m29077g(name) && !name.endsWith(".uid"))) {
                long j = -1;
                long j2 = -9223372036854775807L;
                C9467g gVar = map != null ? (C9467g) map.remove(name) : null;
                if (gVar != null) {
                    j = gVar.f22025a;
                    j2 = gVar.f22026b;
                }
                C9486t a = C9486t.m29183a(file2, j, j2, this.f22073c);
                if (a != null) {
                    m29156a(a);
                } else {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: a */
    private void m29156a(C9486t tVar) {
        this.f22073c.mo24532d(tVar.f22035c).mo24514a(tVar);
        this.f22079i += tVar.f22031V;
        m29163b(tVar);
    }

    /* renamed from: a */
    private void m29157a(C9486t tVar, C9470j jVar) {
        ArrayList arrayList = (ArrayList) this.f22075e.get(tVar.f22035c);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C9458b) arrayList.get(size)).mo24486a(this, tVar, jVar);
            }
        }
        this.f22072b.mo24486a(this, tVar, jVar);
    }

    /* renamed from: a */
    private static long m29154a(File[] fileArr) {
        int length = fileArr.length;
        int i = 0;
        while (i < length) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return m29160b(name);
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Malformed UID file: ");
                    sb.append(file);
                    C9563q.m29497b("SimpleCache", sb.toString());
                    file.delete();
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static long m29153a(File file) throws IOException {
        long j;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            j = 0;
        } else {
            j = Math.abs(nextLong);
        }
        String l = Long.toString(j, 16);
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(".uid");
        File file2 = new File(file, sb.toString());
        if (file2.createNewFile()) {
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to create UID file: ");
        sb2.append(file2);
        throw new IOException(sb2.toString());
    }
}
