package com.bamtechmedia.dominguez.channels.p073tv.p076i;

import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.i.c */
/* compiled from: ProgramCandidate.kt */
public final class C3224c {

    /* renamed from: a */
    private final String f8195a;

    /* renamed from: b */
    private final String f8196b;

    /* renamed from: c */
    private final String f8197c;

    /* renamed from: d */
    private final String f8198d;

    /* renamed from: e */
    private final String f8199e;

    /* renamed from: f */
    private final int f8200f;

    /* renamed from: g */
    private final Integer f8201g;

    /* renamed from: h */
    private final Integer f8202h;

    /* renamed from: i */
    private final Integer f8203i;

    /* renamed from: j */
    private final String f8204j;

    /* renamed from: k */
    private final Integer f8205k;

    /* renamed from: l */
    private final String f8206l;

    public C3224c(String str, String str2, String str3, String str4, String str5, int i, Integer num, Integer num2, Integer num3, String str6, Integer num4, String str7) {
        this.f8195a = str;
        this.f8196b = str2;
        this.f8197c = str3;
        this.f8198d = str4;
        this.f8199e = str5;
        this.f8200f = i;
        this.f8201g = num;
        this.f8202h = num2;
        this.f8203i = num3;
        this.f8204j = str6;
        this.f8205k = num4;
        this.f8206l = str7;
    }

    /* renamed from: a */
    public static /* synthetic */ C3224c m11182a(C3224c cVar, String str, String str2, String str3, String str4, String str5, int i, Integer num, Integer num2, Integer num3, String str6, Integer num4, String str7, int i2, Object obj) {
        C3224c cVar2 = cVar;
        int i3 = i2;
        return cVar.mo12265a((i3 & 1) != 0 ? cVar2.f8195a : str, (i3 & 2) != 0 ? cVar2.f8196b : str2, (i3 & 4) != 0 ? cVar2.f8197c : str3, (i3 & 8) != 0 ? cVar2.f8198d : str4, (i3 & 16) != 0 ? cVar2.f8199e : str5, (i3 & 32) != 0 ? cVar2.f8200f : i, (i3 & 64) != 0 ? cVar2.f8201g : num, (i3 & 128) != 0 ? cVar2.f8202h : num2, (i3 & 256) != 0 ? cVar2.f8203i : num3, (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? cVar2.f8204j : str6, (i3 & 1024) != 0 ? cVar2.f8205k : num4, (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? cVar2.f8206l : str7);
    }

    /* renamed from: a */
    public final C3224c mo12265a(String str, String str2, String str3, String str4, String str5, int i, Integer num, Integer num2, Integer num3, String str6, Integer num4, String str7) {
        C3224c cVar = new C3224c(str, str2, str3, str4, str5, i, num, num2, num3, str6, num4, str7);
        return cVar;
    }

    /* renamed from: a */
    public final String mo12266a() {
        return this.f8195a;
    }

    /* renamed from: b */
    public final String mo12267b() {
        return this.f8198d;
    }

    /* renamed from: c */
    public final Integer mo12268c() {
        return this.f8201g;
    }

    /* renamed from: d */
    public final Integer mo12269d() {
        return this.f8205k;
    }

    /* renamed from: e */
    public final String mo12270e() {
        return this.f8199e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3224c) {
                C3224c cVar = (C3224c) obj;
                if (C12880j.m40224a((Object) this.f8195a, (Object) cVar.f8195a) && C12880j.m40224a((Object) this.f8196b, (Object) cVar.f8196b) && C12880j.m40224a((Object) this.f8197c, (Object) cVar.f8197c) && C12880j.m40224a((Object) this.f8198d, (Object) cVar.f8198d) && C12880j.m40224a((Object) this.f8199e, (Object) cVar.f8199e)) {
                    if (!(this.f8200f == cVar.f8200f) || !C12880j.m40224a((Object) this.f8201g, (Object) cVar.f8201g) || !C12880j.m40224a((Object) this.f8202h, (Object) cVar.f8202h) || !C12880j.m40224a((Object) this.f8203i, (Object) cVar.f8203i) || !C12880j.m40224a((Object) this.f8204j, (Object) cVar.f8204j) || !C12880j.m40224a((Object) this.f8205k, (Object) cVar.f8205k) || !C12880j.m40224a((Object) this.f8206l, (Object) cVar.f8206l)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo12272f() {
        return this.f8196b;
    }

    /* renamed from: g */
    public final Integer mo12273g() {
        return this.f8202h;
    }

    /* renamed from: h */
    public final int mo12274h() {
        return this.f8200f;
    }

    public int hashCode() {
        String str = this.f8195a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8196b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8197c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8198d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8199e;
        int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f8200f) * 31;
        Integer num = this.f8201g;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f8202h;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f8203i;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str6 = this.f8204j;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num4 = this.f8205k;
        int hashCode10 = (hashCode9 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str7 = this.f8206l;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode10 + i;
    }

    /* renamed from: i */
    public final Integer mo12276i() {
        return this.f8203i;
    }

    /* renamed from: j */
    public final String mo12277j() {
        return this.f8204j;
    }

    /* renamed from: k */
    public final String mo12278k() {
        return this.f8197c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProgramCandidate(contentId=");
        sb.append(this.f8195a);
        sb.append(", intentUri=");
        sb.append(this.f8196b);
        sb.append(", title=");
        sb.append(this.f8197c);
        sb.append(", description=");
        sb.append(this.f8198d);
        sb.append(", imageUrl=");
        sb.append(this.f8199e);
        sb.append(", programType=");
        sb.append(this.f8200f);
        sb.append(", durationMilis=");
        sb.append(this.f8201g);
        sb.append(", playhead=");
        sb.append(this.f8202h);
        sb.append(", seasonNumber=");
        sb.append(this.f8203i);
        sb.append(", seasonTitle=");
        sb.append(this.f8204j);
        sb.append(", episodeNumber=");
        sb.append(this.f8205k);
        sb.append(", episodeTitle=");
        sb.append(this.f8206l);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3224c(String str, String str2, String str3, String str4, String str5, int i, Integer num, Integer num2, Integer num3, String str6, Integer num4, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = i2;
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, str5, i, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : num2, (i3 & 256) != 0 ? null : num3, (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? null : str6, (i3 & 1024) != 0 ? null : num4, (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? null : str7);
    }
}
