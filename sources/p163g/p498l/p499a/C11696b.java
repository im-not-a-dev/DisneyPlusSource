package p163g.p498l.p499a;

import android.util.Log;
import kotlin.C12898l;
import p163g.p498l.p499a.C11697c.C11699b;
import p163g.p498l.p499a.C11697c.C11700c;

/* renamed from: g.l.a.b */
/* compiled from: DefaultLogOutput.kt */
public final class C11696b implements C11700c {

    /* renamed from: a */
    public static final C11696b f27228a = new C11696b();

    private C11696b() {
    }

    /* renamed from: a */
    public void mo29708a(C11697c cVar, C11699b bVar, Object obj) {
        if (bVar != C11699b.NONE) {
            int i = 6;
            switch (C11695a.$EnumSwitchMapping$0[bVar.ordinal()]) {
                case 1:
                case 7:
                    i = 2;
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 3;
                    break;
                default:
                    throw new C12898l();
            }
            Log.println(i, cVar.mo29712b(), String.valueOf(obj));
        }
    }
}
