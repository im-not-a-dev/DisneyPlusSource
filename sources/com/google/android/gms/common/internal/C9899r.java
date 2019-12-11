package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.internal.r */
public class C9899r {

    /* renamed from: b */
    private static final C9882k f23174b = new C9882k("LibraryVersion", "");

    /* renamed from: c */
    private static C9899r f23175c = new C9899r();

    /* renamed from: a */
    private ConcurrentHashMap<String, String> f23176a = new ConcurrentHashMap<>();

    protected C9899r() {
    }

    /* renamed from: a */
    public static C9899r m30835a() {
        return f23175c;
    }

    /* renamed from: a */
    public String mo25432a(String str) {
        String str2 = "Failed to get app version for libraryName: ";
        String str3 = "LibraryVersion";
        C9908u.m30855a(str, (Object) "Please provide a valid libraryName");
        if (this.f23176a.containsKey(str)) {
            return (String) this.f23176a.get(str);
        }
        Properties properties = new Properties();
        String str4 = null;
        try {
            InputStream resourceAsStream = C9899r.class.getResourceAsStream(String.format("/%s.properties", new Object[]{str}));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str4 = properties.getProperty("version", null);
                C9882k kVar = f23174b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str4).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str4);
                kVar.mo25403c(str3, sb.toString());
            } else {
                C9882k kVar2 = f23174b;
                String valueOf = String.valueOf(str);
                kVar2.mo25402b(str3, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        } catch (IOException e) {
            C9882k kVar3 = f23174b;
            String valueOf2 = String.valueOf(str);
            kVar3.mo25400a(str3, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
        if (str4 == null) {
            f23174b.mo25399a(str3, ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str4 = "UNKNOWN";
        }
        this.f23176a.put(str, str4);
        return str4;
    }
}
