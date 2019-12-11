package com.airbnb.lottie.p020u;

/* renamed from: com.airbnb.lottie.u.a */
/* compiled from: FileExtension */
public enum C1330a {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: c */
    public final String f5014c;

    private C1330a(String str) {
        this.f5014c = str;
    }

    /* renamed from: a */
    public String mo6369a() {
        StringBuilder sb = new StringBuilder();
        sb.append(".temp");
        sb.append(this.f5014c);
        return sb.toString();
    }

    public String toString() {
        return this.f5014c;
    }
}
