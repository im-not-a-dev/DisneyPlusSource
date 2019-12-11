package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.j */
public abstract class C9879j {

    /* renamed from: U */
    private static C9879j f23145U;

    /* renamed from: c */
    private static final Object f23146c = new Object();

    /* renamed from: com.google.android.gms.common.internal.j$a */
    protected static final class C9880a {

        /* renamed from: a */
        private final String f23147a;

        /* renamed from: b */
        private final String f23148b;

        /* renamed from: c */
        private final ComponentName f23149c = null;

        /* renamed from: d */
        private final int f23150d;

        public C9880a(String str, String str2, int i) {
            C9908u.m30863b(str);
            this.f23147a = str;
            C9908u.m30863b(str2);
            this.f23148b = str2;
            this.f23150d = i;
        }

        /* renamed from: a */
        public final ComponentName mo25390a() {
            return this.f23149c;
        }

        /* renamed from: b */
        public final String mo25392b() {
            return this.f23148b;
        }

        /* renamed from: c */
        public final int mo25393c() {
            return this.f23150d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9880a)) {
                return false;
            }
            C9880a aVar = (C9880a) obj;
            return C9901s.m30841a(this.f23147a, aVar.f23147a) && C9901s.m30841a(this.f23148b, aVar.f23148b) && C9901s.m30841a(this.f23149c, aVar.f23149c) && this.f23150d == aVar.f23150d;
        }

        public final int hashCode() {
            return C9901s.m30839a(this.f23147a, this.f23148b, this.f23149c, Integer.valueOf(this.f23150d));
        }

        public final String toString() {
            String str = this.f23147a;
            return str == null ? this.f23149c.flattenToString() : str;
        }

        /* renamed from: a */
        public final Intent mo25391a(Context context) {
            String str = this.f23147a;
            if (str != null) {
                return new Intent(str).setPackage(this.f23148b);
            }
            return new Intent().setComponent(this.f23149c);
        }
    }

    /* renamed from: a */
    public static C9879j m30789a(Context context) {
        synchronized (f23146c) {
            if (f23145U == null) {
                f23145U = new C9891n0(context.getApplicationContext());
            }
        }
        return f23145U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo25388a(C9880a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25389b(C9880a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public final void mo25387a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo25389b(new C9880a(str, str2, i), serviceConnection, str3);
    }
}
