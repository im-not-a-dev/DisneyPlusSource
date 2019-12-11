package p520io.reactivex.p530x;

import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.x.b */
/* compiled from: Exceptions */
public final class C12003b {
    /* renamed from: a */
    public static RuntimeException m38613a(Throwable th) {
        throw C12548h.m39353b(th);
    }

    /* renamed from: b */
    public static void m38614b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
