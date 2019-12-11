package com.google.android.gms.common.api;

/* renamed from: com.google.android.gms.common.api.b */
public class C9692b extends Exception {

    /* renamed from: c */
    protected final Status f22707c;

    public C9692b(Status status) {
        int c = status.mo25006c();
        String d = status.mo25007d() != null ? status.mo25007d() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 13);
        sb.append(c);
        sb.append(": ");
        sb.append(d);
        super(sb.toString());
        this.f22707c = status;
    }

    /* renamed from: a */
    public int mo25041a() {
        return this.f22707c.mo25006c();
    }
}
