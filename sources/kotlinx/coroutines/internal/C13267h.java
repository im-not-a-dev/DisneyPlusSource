package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.h */
/* compiled from: LockFreeLinkedList.kt */
public final class C13267h {

    /* renamed from: a */
    private static final Object f29693a = new C13279q("CONDITION_FALSE");

    static {
        new C13279q("ALREADY_REMOVED");
        new C13279q("LIST_EMPTY");
        new C13279q("REMOVE_PREPARED");
    }

    /* renamed from: a */
    public static final Object m40756a() {
        return f29693a;
    }

    /* renamed from: a */
    public static final C13268i m40757a(Object obj) {
        C13275m mVar = (C13275m) (!(obj instanceof C13275m) ? null : obj);
        if (mVar != null) {
            C13268i iVar = mVar.f29709a;
            if (iVar != null) {
                return iVar;
            }
        }
        return (C13268i) obj;
    }
}
