package p163g.p174d.p178b.p179a0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0012R,\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR,\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/player/bif/BifEntryList;", "", "()V", "accessFiles", "Ljava/util/HashSet;", "Lcom/bamtech/player/bif/RandomAccessFileWrapper;", "Lkotlin/collections/HashSet;", "accessFiles$annotations", "getAccessFiles", "()Ljava/util/HashSet;", "list", "Ljava/util/ArrayList;", "Lcom/bamtech/player/bif/BifEntry;", "Lkotlin/collections/ArrayList;", "list$annotations", "getList", "()Ljava/util/ArrayList;", "addAll", "", "elements", "", "bytesAt", "", "timestampMs", "", "clear", "close", "indexOf", "", "open", "Companion", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.a0.d */
/* compiled from: BifEntryList.kt */
public final class C4826d {

    /* renamed from: c */
    private static final Comparator<C4825c> f11983c = C4827a.f11986c;

    /* renamed from: a */
    private final HashSet<C4833h> f11984a = new HashSet<>();

    /* renamed from: b */
    private final ArrayList<C4825c> f11985b = new ArrayList<>();

    /* renamed from: g.d.b.a0.d$a */
    /* compiled from: BifEntryList.kt */
    static final class C4827a<T> implements Comparator<C4825c> {

        /* renamed from: c */
        public static final C4827a f11986c = new C4827a();

        C4827a() {
        }

        /* renamed from: a */
        public final int compare(C4825c cVar, C4825c cVar2) {
            if (cVar.mo16220a(cVar2.mo16226d())) {
                return 0;
            }
            return cVar.compareTo(cVar2);
        }
    }

    /* renamed from: g.d.b.a0.d$b */
    /* compiled from: BifEntryList.kt */
    public static final class C4828b {
        private C4828b() {
        }

        public /* synthetic */ C4828b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C4828b(null);
    }

    /* renamed from: a */
    public final synchronized int mo16228a(long j) {
        C4825c cVar = new C4825c((int) j, 0, null, 0, 0, 30, null);
        int a = C13185o.m40511a(this.f11985b, cVar, f11983c, 0, 0, 12, null);
        if (a < 0) {
            return -1;
        }
        return Math.min(a + 1, this.f11985b.size() - 1);
    }

    /* renamed from: b */
    public final synchronized void mo16231b() {
        Iterator it = this.f11984a.iterator();
        while (it.hasNext()) {
            ((C4833h) it.next()).mo16245a();
        }
    }

    /* renamed from: c */
    public final ArrayList<C4825c> mo16232c() {
        return this.f11985b;
    }

    /* renamed from: d */
    public final void mo16233d() {
        Iterator it = this.f11984a.iterator();
        while (it.hasNext()) {
            ((C4833h) it.next()).mo16247c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo16229a() {
        mo16231b();
        this.f11985b.clear();
        this.f11984a.clear();
    }

    /* renamed from: a */
    public final synchronized void mo16230a(Collection<C4825c> collection) {
        for (C4825c a : collection) {
            C4833h a2 = a.mo16219a();
            if (a2 != null) {
                this.f11984a.add(a2);
            }
        }
        this.f11985b.addAll(collection);
        C13194s.m40542c(this.f11985b);
    }
}
