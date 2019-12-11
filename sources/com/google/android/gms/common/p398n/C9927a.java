package com.google.android.gms.common.p398n;

import android.util.Log;
import com.google.android.gms.common.internal.C9882k;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.n.a */
public class C9927a {

    /* renamed from: a */
    private final String f23200a;

    /* renamed from: b */
    private final String f23201b;

    /* renamed from: c */
    private final int f23202c;

    public C9927a(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append(']');
            sb.append(' ');
            str2 = sb.toString();
        }
        this(str, str2);
    }

    /* renamed from: c */
    private final String m30939c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f23201b.concat(str);
    }

    /* renamed from: a */
    public boolean mo25453a(int i) {
        return this.f23202c <= i;
    }

    /* renamed from: b */
    public void mo25454b(String str, Object... objArr) {
        Log.e(this.f23200a, m30939c(str, objArr));
    }

    /* renamed from: a */
    public void mo25452a(String str, Object... objArr) {
        if (mo25453a(3)) {
            Log.d(this.f23200a, m30939c(str, objArr));
        }
    }

    private C9927a(String str, String str2) {
        this.f23201b = str2;
        this.f23200a = str;
        new C9882k(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f23200a, i)) {
            i++;
        }
        this.f23202c = i;
    }
}
