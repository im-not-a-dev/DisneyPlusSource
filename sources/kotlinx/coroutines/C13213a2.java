package kotlinx.coroutines;

import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C13145v;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.internal.C13278p;
import kotlinx.coroutines.internal.C13283u;

/* renamed from: kotlinx.coroutines.a2 */
/* compiled from: ResumeMode.kt */
public final class C13213a2 {
    /* renamed from: a */
    public static final <T> void m40641a(C12683c<? super T> cVar, T t, int i) {
        if (i == 0) {
            C12901a aVar = C12900n.f29540c;
            C12900n.m40236a(t);
            cVar.mo31039b(t);
        } else if (i == 1) {
            C13384p0.m41126a(cVar, t);
        } else if (i == 2) {
            C13384p0.m41131b(cVar, t);
        } else if (i == 3) {
            C13364n0 n0Var = (C13364n0) cVar;
            C12688f b = n0Var.mo31038b();
            Object b2 = C13283u.m40837b(b, n0Var.f29853Y);
            try {
                C12683c<T> cVar2 = n0Var.f29855a0;
                C12901a aVar2 = C12900n.f29540c;
                C12900n.m40236a(t);
                cVar2.mo31039b(t);
                C13145v vVar = C13145v.f29587a;
            } finally {
                C13283u.m40836a(b, b2);
            }
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: a */
    public static final boolean m40643a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final <T> void m40645b(C12683c<? super T> cVar, Throwable th, int i) {
        if (i == 0) {
            C12901a aVar = C12900n.f29540c;
            Object a = C12903o.m40240a(th);
            C12900n.m40236a(a);
            cVar.mo31039b(a);
        } else if (i == 1) {
            C13384p0.m41127a(cVar, th);
        } else if (i == 2) {
            C13384p0.m41132b(cVar, th);
        } else if (i == 3) {
            C13364n0 n0Var = (C13364n0) cVar;
            C12688f b = n0Var.mo31038b();
            Object b2 = C13283u.m40837b(b, n0Var.f29853Y);
            try {
                C12683c<T> cVar2 = n0Var.f29855a0;
                C12901a aVar2 = C12900n.f29540c;
                Object a2 = C12903o.m40240a(C13278p.m40811a(th, cVar2));
                C12900n.m40236a(a2);
                cVar2.mo31039b(a2);
                C13145v vVar = C13145v.f29587a;
            } finally {
                C13283u.m40836a(b, b2);
            }
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    public static final boolean m40646b(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    public static final <T> void m40642a(C12683c<? super T> cVar, Throwable th, int i) {
        if (i == 0) {
            C12683c a = C12697c.m39816a(cVar);
            C12901a aVar = C12900n.f29540c;
            Object a2 = C12903o.m40240a(th);
            C12900n.m40236a(a2);
            a.mo31039b(a2);
        } else if (i == 1) {
            C13384p0.m41127a(C12697c.m39816a(cVar), th);
        } else if (i == 2) {
            C12901a aVar2 = C12900n.f29540c;
            Object a3 = C12903o.m40240a(th);
            C12900n.m40236a(a3);
            cVar.mo31039b(a3);
        } else if (i == 3) {
            C12688f b = cVar.mo31038b();
            Object b2 = C13283u.m40837b(b, null);
            try {
                C12901a aVar3 = C12900n.f29540c;
                Object a4 = C12903o.m40240a(th);
                C12900n.m40236a(a4);
                cVar.mo31039b(a4);
                C13145v vVar = C13145v.f29587a;
            } finally {
                C13283u.m40836a(b, b2);
            }
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    public static final <T> void m40644b(C12683c<? super T> cVar, T t, int i) {
        if (i == 0) {
            C12683c a = C12697c.m39816a(cVar);
            C12901a aVar = C12900n.f29540c;
            C12900n.m40236a(t);
            a.mo31039b(t);
        } else if (i == 1) {
            C13384p0.m41126a(C12697c.m39816a(cVar), t);
        } else if (i == 2) {
            C12901a aVar2 = C12900n.f29540c;
            C12900n.m40236a(t);
            cVar.mo31039b(t);
        } else if (i == 3) {
            C12688f b = cVar.mo31038b();
            Object b2 = C13283u.m40837b(b, null);
            try {
                C12901a aVar3 = C12900n.f29540c;
                C12900n.m40236a(t);
                cVar.mo31039b(t);
                C13145v vVar = C13145v.f29587a;
            } finally {
                C13283u.m40836a(b, b2);
            }
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
