package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C9908u;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
public class C9654c {

    /* renamed from: c */
    private static final Lock f22670c = new ReentrantLock();

    /* renamed from: d */
    private static C9654c f22671d;

    /* renamed from: a */
    private final Lock f22672a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f22673b;

    private C9654c(Context context) {
        this.f22673b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C9654c m29983a(Context context) {
        C9908u.m30853a(context);
        f22670c.lock();
        try {
            if (f22671d == null) {
                f22671d = new C9654c(context.getApplicationContext());
            }
            return f22671d;
        } finally {
            f22670c.unlock();
        }
    }

    /* renamed from: b */
    public GoogleSignInAccount mo24949b() {
        return m29982a(m29987c("defaultGoogleSignInAccount"));
    }

    /* renamed from: c */
    public GoogleSignInOptions mo24950c() {
        return m29985b(m29987c("defaultGoogleSignInAccount"));
    }

    /* renamed from: d */
    public String mo24951d() {
        return m29987c("refreshToken");
    }

    /* renamed from: e */
    public final void mo24952e() {
        String str = "defaultGoogleSignInAccount";
        String c = m29987c(str);
        m29988d(str);
        if (!TextUtils.isEmpty(c)) {
            m29988d(m29986b("googleSignInAccount", c));
            m29988d(m29986b("googleSignInOptions", c));
        }
    }

    /* renamed from: d */
    private final void m29988d(String str) {
        this.f22672a.lock();
        try {
            this.f22673b.edit().remove(str).apply();
        } finally {
            this.f22672a.unlock();
        }
    }

    /* renamed from: b */
    private final GoogleSignInOptions m29985b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m29987c(m29986b("googleSignInOptions", str));
        if (c != null) {
            try {
                return GoogleSignInOptions.m29944a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private final String m29987c(String str) {
        this.f22672a.lock();
        try {
            return this.f22673b.getString(str, null);
        } finally {
            this.f22672a.unlock();
        }
    }

    /* renamed from: b */
    private static String m29986b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo24948a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C9908u.m30853a(googleSignInAccount);
        C9908u.m30853a(googleSignInOptions);
        m29984a("defaultGoogleSignInAccount", googleSignInAccount.mo24907m());
        C9908u.m30853a(googleSignInAccount);
        C9908u.m30853a(googleSignInOptions);
        String m = googleSignInAccount.mo24907m();
        m29984a(m29986b("googleSignInAccount", m), googleSignInAccount.mo24908n());
        m29984a(m29986b("googleSignInOptions", m), googleSignInOptions.mo24919j());
    }

    /* renamed from: a */
    private final void m29984a(String str, String str2) {
        this.f22672a.lock();
        try {
            this.f22673b.edit().putString(str, str2).apply();
        } finally {
            this.f22672a.unlock();
        }
    }

    /* renamed from: a */
    private final GoogleSignInAccount m29982a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m29987c(m29986b("googleSignInAccount", str));
        if (c != null) {
            try {
                return GoogleSignInAccount.m29929a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo24947a() {
        this.f22672a.lock();
        try {
            this.f22673b.edit().clear().apply();
        } finally {
            this.f22672a.unlock();
        }
    }
}
