package com.appboy.p024n;

import android.content.Context;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1561g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p161f.p162a.C4484j6;

/* renamed from: com.appboy.n.c */
public class C1491c {

    /* renamed from: d */
    private static final String f5393d = C1557c.m7461a(C1491c.class);

    /* renamed from: a */
    private final Context f5394a;

    /* renamed from: b */
    protected final Map<String, Object> f5395b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    protected final C4484j6 f5396c;

    public C1491c(Context context) {
        this.f5394a = context;
        this.f5396c = new C4484j6(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6737a(String str, boolean z) {
        if (this.f5395b.containsKey(str)) {
            return ((Boolean) this.f5395b.get(str)).booleanValue();
        }
        String str2 = " and value: ";
        if (this.f5396c.mo15645a(str)) {
            boolean a = this.f5396c.mo15646a(str, z);
            this.f5395b.put(str, Boolean.valueOf(a));
            String str3 = f5393d;
            StringBuilder sb = new StringBuilder();
            sb.append("Using runtime override value for key: ");
            sb.append(str);
            sb.append(str2);
            sb.append(a);
            C1557c.m7458a(str3, sb.toString());
            return a;
        }
        boolean b = mo6741b(str, z);
        this.f5395b.put(str, Boolean.valueOf(b));
        String str4 = f5393d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Defaulting to using xml value for key: ");
        sb2.append(str);
        sb2.append(str2);
        sb2.append(b);
        C1557c.m7458a(str4, sb2.toString());
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo6739b(String str, int i) {
        String str2 = "'.";
        if (str == null) {
            return i;
        }
        try {
            int identifier = this.f5394a.getResources().getIdentifier(str, "integer", C1561g.m7481a(this.f5394a));
            if (identifier != 0) {
                return this.f5394a.getResources().getInteger(identifier);
            }
            String str3 = f5393d;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find the xml integer configuration value with key ");
            sb.append(str);
            sb.append(". Using default value '");
            sb.append(i);
            sb.append(str2);
            C1557c.m7458a(str3, sb.toString());
            return i;
        } catch (Exception unused) {
            String str4 = f5393d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception retrieving the xml integer configuration value with key ");
            sb2.append(str);
            sb2.append(". Using default value ");
            sb2.append(i);
            sb2.append(str2);
            C1557c.m7458a(str4, sb2.toString());
            return i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6741b(String str, boolean z) {
        String str2 = "'.";
        if (str == null) {
            return z;
        }
        try {
            int identifier = this.f5394a.getResources().getIdentifier(str, "bool", C1561g.m7481a(this.f5394a));
            if (identifier != 0) {
                return this.f5394a.getResources().getBoolean(identifier);
            }
            String str3 = f5393d;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find the xml boolean configuration value with key ");
            sb.append(str);
            sb.append(". Using default value '");
            sb.append(z);
            sb.append(str2);
            C1557c.m7458a(str3, sb.toString());
            return z;
        } catch (Exception unused) {
            String str4 = f5393d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception retrieving the xml boolean configuration value with key ");
            sb2.append(str);
            sb2.append(". Using default value ");
            sb2.append(z);
            sb2.append(str2);
            C1557c.m7458a(str4, sb2.toString());
            return z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo6740b(String str, String str2) {
        String str3 = "'.";
        if (str == null) {
            return str2;
        }
        try {
            int identifier = this.f5394a.getResources().getIdentifier(str, "string", C1561g.m7481a(this.f5394a));
            if (identifier != 0) {
                return this.f5394a.getResources().getString(identifier);
            }
            String str4 = f5393d;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find the xml string configuration value with key ");
            sb.append(str);
            sb.append(". Using default value '");
            sb.append(str2);
            sb.append(str3);
            C1557c.m7458a(str4, sb.toString());
            return str2;
        } catch (Exception unused) {
            String str5 = f5393d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception retrieving the xml string configuration value with key ");
            sb2.append(str);
            sb2.append(". Using default value ");
            sb2.append(str2);
            sb2.append(str3);
            C1557c.m7458a(str5, sb2.toString());
            return str2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo6735a(String str, String str2) {
        if (this.f5395b.containsKey(str)) {
            return (String) this.f5395b.get(str);
        }
        String str3 = " and value: ";
        if (this.f5396c.mo15645a(str)) {
            String a = this.f5396c.mo15640a(str, str2);
            this.f5395b.put(str, a);
            String str4 = f5393d;
            StringBuilder sb = new StringBuilder();
            sb.append("Using runtime override value for key: ");
            sb.append(str);
            sb.append(str3);
            sb.append(a);
            C1557c.m7458a(str4, sb.toString());
            return a;
        }
        String b = mo6740b(str, str2);
        this.f5395b.put(str, b);
        String str5 = f5393d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Defaulting to using xml value for key: ");
        sb2.append(str);
        sb2.append(str3);
        sb2.append(b);
        C1557c.m7458a(str5, sb2.toString());
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6734a(String str, int i) {
        if (this.f5395b.containsKey(str)) {
            return ((Integer) this.f5395b.get(str)).intValue();
        }
        String str2 = " and value: ";
        if (this.f5396c.mo15645a(str)) {
            int a = this.f5396c.mo15639a(str, i);
            this.f5395b.put(str, Integer.valueOf(a));
            String str3 = f5393d;
            StringBuilder sb = new StringBuilder();
            sb.append("Using runtime override value for key: ");
            sb.append(str);
            sb.append(str2);
            sb.append(a);
            C1557c.m7458a(str3, sb.toString());
            return a;
        }
        int b = mo6739b(str, i);
        this.f5395b.put(str, Integer.valueOf(b));
        String str4 = f5393d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Defaulting to using xml value for key: ");
        sb2.append(str);
        sb2.append(str2);
        sb2.append(b);
        C1557c.m7458a(str4, sb2.toString());
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<String> mo6736a(String str, Set<String> set) {
        if (this.f5395b.containsKey(str)) {
            return (Set) this.f5395b.get(str);
        }
        String str2 = " and value: ";
        if (this.f5396c.mo15645a(str)) {
            Set<String> a = this.f5396c.mo15641a(str, set);
            this.f5395b.put(str, a);
            String str3 = f5393d;
            StringBuilder sb = new StringBuilder();
            sb.append("Using runtime override value for key: ");
            sb.append(str);
            sb.append(str2);
            sb.append(a);
            C1557c.m7458a(str3, sb.toString());
            return a;
        }
        String[] a2 = mo6738a(str, new String[0]);
        if (a2.length != 0) {
            set = new HashSet<>(Arrays.asList(a2));
        }
        this.f5395b.put(str, set);
        String str4 = f5393d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Defaulting to using xml value for key: ");
        sb2.append(str);
        sb2.append(str2);
        sb2.append(set);
        C1557c.m7458a(str4, sb2.toString());
        return set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String[] mo6738a(String str, String[] strArr) {
        String str2 = "'.";
        if (str == null) {
            return strArr;
        }
        try {
            int identifier = this.f5394a.getResources().getIdentifier(str, "array", C1561g.m7481a(this.f5394a));
            if (identifier != 0) {
                return this.f5394a.getResources().getStringArray(identifier);
            }
            String str3 = f5393d;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find the xml string array configuration value with key ");
            sb.append(str);
            sb.append(". Using default value '");
            sb.append(Arrays.toString(strArr));
            sb.append(str2);
            C1557c.m7458a(str3, sb.toString());
            return strArr;
        } catch (Exception unused) {
            String str4 = f5393d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception retrieving the xml string array configuration value with key ");
            sb2.append(str);
            sb2.append(". Using default value ");
            sb2.append(Arrays.toString(strArr));
            sb2.append(str2);
            C1557c.m7458a(str4, sb2.toString());
            return strArr;
        }
    }
}
