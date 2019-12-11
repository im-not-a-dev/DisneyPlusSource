package com.bamtechmedia.dominguez.config;

import java.net.PasswordAuthentication;
import kotlin.jvm.internal.C12880j;
import okhttp3.logging.HttpLoggingInterceptor.Level;

/* renamed from: com.bamtechmedia.dominguez.config.m */
/* compiled from: DevConfigImpl.kt */
public final class C3560m implements C3558l {

    /* renamed from: a */
    private static final PasswordAuthentication f8888a;

    /* renamed from: b */
    private static final boolean f8889b = C3530g.f8829a;

    /* renamed from: c */
    private static final boolean f8890c = C3530g.f8830b;

    /* renamed from: d */
    private static final boolean f8891d = C3530g.f8831c;

    /* renamed from: e */
    private static final boolean f8892e = C3530g.f8832d;

    /* renamed from: f */
    private static final boolean f8893f = C3530g.f8834f;

    /* renamed from: g */
    public static final C3560m f8894g = new C3560m();

    static {
        PasswordAuthentication passwordAuthentication;
        String str = "";
        if (C12832w.m40118a(str) || C12832w.m40118a(str)) {
            passwordAuthentication = null;
        } else {
            char[] charArray = str.toCharArray();
            C12880j.m40222a((Object) charArray, "(this as java.lang.String).toCharArray()");
            passwordAuthentication = new PasswordAuthentication(str, charArray);
        }
        f8888a = passwordAuthentication;
        boolean z = C3530g.f8833e;
        Level.valueOf("HEADERS");
    }

    private C3560m() {
    }

    /* renamed from: a */
    public boolean mo12764a() {
        return f8891d;
    }

    /* renamed from: b */
    public boolean mo12765b() {
        return f8890c;
    }

    /* renamed from: c */
    public PasswordAuthentication mo12766c() {
        return f8888a;
    }

    /* renamed from: d */
    public boolean mo12767d() {
        return f8893f;
    }

    /* renamed from: e */
    public boolean mo12768e() {
        return f8892e;
    }

    /* renamed from: f */
    public boolean mo12769f() {
        return f8889b;
    }
}
