package com.bumptech.glide.load.p339o;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C8111g;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.o.g */
/* compiled from: GlideUrl */
public class C8292g implements C8111g {

    /* renamed from: b */
    private final C8293h f17748b;

    /* renamed from: c */
    private final URL f17749c;

    /* renamed from: d */
    private final String f17750d;

    /* renamed from: e */
    private String f17751e;

    /* renamed from: f */
    private URL f17752f;

    /* renamed from: g */
    private volatile byte[] f17753g;

    /* renamed from: h */
    private int f17754h;

    public C8292g(URL url) {
        this(url, C8293h.f17755a);
    }

    /* renamed from: e */
    private byte[] m24094e() {
        if (this.f17753g == null) {
            this.f17753g = mo21462a().getBytes(C8111g.f17370a);
        }
        return this.f17753g;
    }

    /* renamed from: f */
    private String m24095f() {
        if (TextUtils.isEmpty(this.f17751e)) {
            String str = this.f17750d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f17749c;
                C10774j.m34012a(url);
                str = url.toString();
            }
            this.f17751e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f17751e;
    }

    /* renamed from: g */
    private URL m24096g() throws MalformedURLException {
        if (this.f17752f == null) {
            this.f17752f = new URL(m24095f());
        }
        return this.f17752f;
    }

    /* renamed from: a */
    public String mo21462a() {
        String str = this.f17750d;
        if (str != null) {
            return str;
        }
        URL url = this.f17749c;
        C10774j.m34012a(url);
        return url.toString();
    }

    /* renamed from: b */
    public Map<String, String> mo21463b() {
        return this.f17748b.mo21467a();
    }

    /* renamed from: c */
    public String mo21464c() {
        return m24095f();
    }

    /* renamed from: d */
    public URL mo21465d() throws MalformedURLException {
        return m24096g();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8292g)) {
            return false;
        }
        C8292g gVar = (C8292g) obj;
        if (!mo21462a().equals(gVar.mo21462a()) || !this.f17748b.equals(gVar.f17748b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f17754h == 0) {
            this.f17754h = mo21462a().hashCode();
            this.f17754h = (this.f17754h * 31) + this.f17748b.hashCode();
        }
        return this.f17754h;
    }

    public String toString() {
        return mo21462a();
    }

    public C8292g(String str) {
        this(str, C8293h.f17755a);
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        messageDigest.update(m24094e());
    }

    public C8292g(URL url, C8293h hVar) {
        C10774j.m34012a(url);
        this.f17749c = url;
        this.f17750d = null;
        C10774j.m34012a(hVar);
        this.f17748b = hVar;
    }

    public C8292g(String str, C8293h hVar) {
        this.f17749c = null;
        C10774j.m34014a(str);
        this.f17750d = str;
        C10774j.m34012a(hVar);
        this.f17748b = hVar;
    }
}
