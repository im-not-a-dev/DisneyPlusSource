package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.l1 */
/* compiled from: Exceptions.kt */
public final class C13331l1 extends CancellationException implements C13412x<C13331l1> {

    /* renamed from: c */
    public final C13324k1 f29766c;

    public C13331l1(String str, Throwable th, C13324k1 k1Var) {
        super(str);
        this.f29766c = k1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3.getCause(), (java.lang.Object) getCause()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r3 == r2) goto L_0x0031
            boolean r0 = r3 instanceof kotlinx.coroutines.C13331l1
            if (r0 == 0) goto L_0x002f
            kotlinx.coroutines.l1 r3 = (kotlinx.coroutines.C13331l1) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x002f
            kotlinx.coroutines.k1 r0 = r3.f29766c
            kotlinx.coroutines.k1 r1 = r2.f29766c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            goto L_0x0032
        L_0x0031:
            r3 = 1
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13331l1.equals(java.lang.Object):boolean");
    }

    public Throwable fillInStackTrace() {
        if (!C13292j0.m40865c()) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        Intrinsics.checkReturnedValueIsNotNull((Object) fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = ((message.hashCode() * 31) + this.f29766c.hashCode()) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        Intrinsics.throwNpe();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.f29766c);
        return sb.toString();
    }

    /* renamed from: a */
    public C13331l1 m40962a() {
        if (!C13292j0.m40865c()) {
            return null;
        }
        String message = getMessage();
        if (message != null) {
            return new C13331l1(message, this, this.f29766c);
        }
        Intrinsics.throwNpe();
        throw null;
    }
}
