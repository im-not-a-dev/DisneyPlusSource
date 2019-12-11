package kotlinx.coroutines.p593k2;

import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C13145v;
import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12683c;
import kotlinx.coroutines.C13384p0;

/* renamed from: kotlinx.coroutines.k2.a */
/* compiled from: Cancellable.kt */
public final class C13327a {
    /* renamed from: a */
    public static final <R, T> void m40952a(Function2<? super R, ? super C12683c<? super T>, ? extends Object> function2, R r, C12683c<? super T> cVar) {
        try {
            C13384p0.m41126a(C12697c.m39816a(C12697c.m39817a(function2, r, cVar)), C13145v.f29587a);
        } catch (Throwable th) {
            C12901a aVar = C12900n.f29540c;
            Object a = C12903o.m40240a(th);
            C12900n.m40236a(a);
            cVar.mo31039b(a);
        }
    }
}
