package com.google.android.exoplayer2.p382u0.p390t;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.u0.t.d */
/* compiled from: WebvttCssStyle */
public final class C9381d {

    /* renamed from: a */
    private String f21625a;

    /* renamed from: b */
    private String f21626b;

    /* renamed from: c */
    private List<String> f21627c;

    /* renamed from: d */
    private String f21628d;

    /* renamed from: e */
    private String f21629e;

    /* renamed from: f */
    private int f21630f;

    /* renamed from: g */
    private boolean f21631g;

    /* renamed from: h */
    private int f21632h;

    /* renamed from: i */
    private boolean f21633i;

    /* renamed from: j */
    private int f21634j;

    /* renamed from: k */
    private int f21635k;

    /* renamed from: l */
    private int f21636l;

    /* renamed from: m */
    private int f21637m;

    /* renamed from: n */
    private int f21638n;

    /* renamed from: o */
    private float f21639o;

    /* renamed from: p */
    private Alignment f21640p;

    public C9381d() {
        mo24244l();
    }

    /* renamed from: a */
    public void mo24227a(String[] strArr) {
        this.f21627c = Arrays.asList(strArr);
    }

    /* renamed from: b */
    public void mo24231b(String str) {
        this.f21625a = str;
    }

    /* renamed from: c */
    public void mo24234c(String str) {
        this.f21626b = str;
    }

    /* renamed from: d */
    public void mo24236d(String str) {
        this.f21628d = str;
    }

    /* renamed from: e */
    public int mo24237e() {
        return this.f21638n;
    }

    /* renamed from: f */
    public int mo24238f() {
        if (this.f21636l == -1 && this.f21637m == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f21636l == 1 ? 1 : 0;
        if (this.f21637m == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: g */
    public Alignment mo24239g() {
        return this.f21640p;
    }

    /* renamed from: h */
    public boolean mo24240h() {
        return this.f21633i;
    }

    /* renamed from: i */
    public boolean mo24241i() {
        return this.f21631g;
    }

    /* renamed from: j */
    public boolean mo24242j() {
        return this.f21634j == 1;
    }

    /* renamed from: k */
    public boolean mo24243k() {
        return this.f21635k == 1;
    }

    /* renamed from: l */
    public void mo24244l() {
        String str = "";
        this.f21625a = str;
        this.f21626b = str;
        this.f21627c = Collections.emptyList();
        this.f21628d = str;
        this.f21629e = null;
        this.f21631g = false;
        this.f21633i = false;
        this.f21634j = -1;
        this.f21635k = -1;
        this.f21636l = -1;
        this.f21637m = -1;
        this.f21638n = -1;
        this.f21640p = null;
    }

    /* renamed from: a */
    public int mo24223a(String str, String str2, String[] strArr, String str3) {
        if (this.f21625a.isEmpty() && this.f21626b.isEmpty() && this.f21627c.isEmpty() && this.f21628d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int a = m28655a(m28655a(m28655a(0, this.f21625a, str, 1073741824), this.f21626b, str2, 2), this.f21628d, str3, 4);
        if (a == -1 || !Arrays.asList(strArr).containsAll(this.f21627c)) {
            return 0;
        }
        return a + (this.f21627c.size() * 4);
    }

    /* renamed from: b */
    public C9381d mo24230b(boolean z) {
        this.f21637m = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public C9381d mo24232c(boolean z) {
        this.f21635k = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public float mo24235d() {
        return this.f21639o;
    }

    /* renamed from: b */
    public int mo24228b() {
        if (this.f21631g) {
            return this.f21630f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: c */
    public String mo24233c() {
        return this.f21629e;
    }

    /* renamed from: b */
    public C9381d mo24229b(int i) {
        this.f21630f = i;
        this.f21631g = true;
        return this;
    }

    /* renamed from: a */
    public C9381d mo24226a(boolean z) {
        this.f21636l = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C9381d mo24225a(String str) {
        this.f21629e = Util.m29457k(str);
        return this;
    }

    /* renamed from: a */
    public int mo24222a() {
        if (this.f21633i) {
            return this.f21632h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: a */
    public C9381d mo24224a(int i) {
        this.f21632h = i;
        this.f21633i = true;
        return this;
    }

    /* renamed from: a */
    private static int m28655a(int i, String str, String str2, int i2) {
        if (!str.isEmpty()) {
            int i3 = -1;
            if (i != -1) {
                if (str.equals(str2)) {
                    i3 = i + i2;
                }
                return i3;
            }
        }
        return i;
    }
}
