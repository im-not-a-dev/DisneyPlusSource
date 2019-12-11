package p163g.p174d.p178b.p179a0;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/player/bif/BifFactory;", "", "()V", "readBif", "", "Lcom/bamtech/player/bif/BifEntry;", "file", "Ljava/io/File;", "startTimeMs", "", "endTimeMs", "readEntries", "accessFileWrapper", "Lcom/bamtech/player/bif/RandomAccessFileWrapper;", "header", "Lcom/bamtech/player/bif/BifFactory$BifHeader;", "readHeader", "BifHeader", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.a0.e */
/* compiled from: BifFactory.kt */
public final class C4829e {

    /* renamed from: g.d.b.a0.e$a */
    /* compiled from: BifFactory.kt */
    private static final class C4830a {

        /* renamed from: a */
        private final int f11987a;

        /* renamed from: b */
        private final int f11988b;

        public C4830a(int i, int i2) {
            this.f11987a = i;
            this.f11988b = i2;
        }

        /* renamed from: a */
        public final int mo16237a() {
            return this.f11988b;
        }

        /* renamed from: b */
        public final int mo16238b() {
            return this.f11987a;
        }
    }

    /* renamed from: a */
    private final C4830a m16790a(C4833h hVar) {
        RandomAccessFile c = hVar.mo16247c();
        c.skipBytes(8);
        C4832g.m16798a(c);
        int a = C4832g.m16798a(c);
        int a2 = C4832g.m16798a(c);
        c.skipBytes(44);
        return new C4830a(a, a2);
    }

    /* renamed from: a */
    private final List<C4825c> m16791a(C4833h hVar, C4830a aVar, int i, int i2) {
        RandomAccessFile c = hVar.mo16247c();
        ArrayList arrayList = new ArrayList();
        int b = aVar.mo16238b();
        int i3 = 0;
        if (b >= 0) {
            int i4 = 0;
            while (true) {
                int a = C4832g.m16798a(c);
                C4825c cVar = new C4825c((a * aVar.mo16237a()) + i, C4832g.m16798a(c), hVar, 0, 0, 24, null);
                arrayList.add(cVar);
                if (i4 == b) {
                    break;
                }
                i4++;
            }
        }
        int b2 = aVar.mo16238b();
        while (i3 < b2) {
            Object obj = arrayList.get(i3);
            Intrinsics.checkReturnedValueIsNotNull(obj, "entries[i]");
            C4825c cVar2 = (C4825c) obj;
            i3++;
            Object obj2 = arrayList.get(i3);
            Intrinsics.checkReturnedValueIsNotNull(obj2, "entries[i + 1]");
            C4825c cVar3 = (C4825c) obj2;
            cVar2.mo16223c(cVar3.mo16221b() - cVar2.mo16221b());
            cVar2.mo16222b(cVar3.mo16226d() - cVar2.mo16226d());
        }
        arrayList.remove(arrayList.size() - 1);
        C4825c cVar4 = (C4825c) C13199w.m40593h((List) arrayList);
        cVar4.mo16222b(i2 - cVar4.mo16226d());
        return arrayList;
    }

    /* renamed from: a */
    public final List<C4825c> mo16236a(File file, int i, int i2) {
        C4833h hVar = new C4833h(file);
        return m16791a(hVar, m16790a(hVar), i, i2);
    }
}
