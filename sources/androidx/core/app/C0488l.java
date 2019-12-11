package androidx.core.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

/* renamed from: androidx.core.app.l */
/* compiled from: RemoteInput */
public final class C0488l {

    /* renamed from: a */
    private final String f2182a;

    /* renamed from: b */
    private final CharSequence f2183b;

    /* renamed from: c */
    private final CharSequence[] f2184c;

    /* renamed from: d */
    private final boolean f2185d;

    /* renamed from: e */
    private final Bundle f2186e;

    /* renamed from: f */
    private final Set<String> f2187f;

    /* renamed from: a */
    public boolean mo2688a() {
        return this.f2185d;
    }

    /* renamed from: b */
    public Set<String> mo2689b() {
        return this.f2187f;
    }

    /* renamed from: c */
    public CharSequence[] mo2690c() {
        return this.f2184c;
    }

    /* renamed from: d */
    public Bundle mo2691d() {
        return this.f2186e;
    }

    /* renamed from: e */
    public CharSequence mo2692e() {
        return this.f2183b;
    }

    /* renamed from: f */
    public String mo2693f() {
        return this.f2182a;
    }

    /* renamed from: g */
    public boolean mo2694g() {
        return !mo2688a() && (mo2690c() == null || mo2690c().length == 0) && mo2689b() != null && !mo2689b().isEmpty();
    }

    /* renamed from: a */
    static RemoteInput[] m2610a(C0488l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            remoteInputArr[i] = m2609a(lVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: a */
    static RemoteInput m2609a(C0488l lVar) {
        return new Builder(lVar.mo2693f()).setLabel(lVar.mo2692e()).setChoices(lVar.mo2690c()).setAllowFreeFormInput(lVar.mo2688a()).addExtras(lVar.mo2691d()).build();
    }
}
