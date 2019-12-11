package com.appboy.p027p;

import com.appboy.p030r.p031o.C1547c;
import java.util.List;

/* renamed from: com.appboy.p.a */
public class C1516a {

    /* renamed from: a */
    private final List<C1547c> f5549a;

    /* renamed from: b */
    private final String f5550b;

    /* renamed from: c */
    private final long f5551c;

    /* renamed from: d */
    private final boolean f5552d;

    public C1516a(List<C1547c> list, String str, long j, boolean z) {
        this.f5550b = str;
        this.f5549a = list;
        this.f5551c = j;
        this.f5552d = z;
    }

    /* renamed from: a */
    public List<C1547c> mo6752a() {
        return this.f5549a;
    }

    /* renamed from: b */
    public long mo6753b() {
        return this.f5551c;
    }

    /* renamed from: c */
    public boolean mo6754c() {
        return this.f5549a.isEmpty();
    }

    /* renamed from: d */
    public boolean mo6755d() {
        return this.f5552d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentCardsUpdatedEvent{mContentCards=");
        sb.append(this.f5549a);
        sb.append(", mUserId='");
        sb.append(this.f5550b);
        sb.append('\'');
        sb.append(", mTimestamp=");
        sb.append(this.f5551c);
        sb.append('}');
        return sb.toString();
    }
}
