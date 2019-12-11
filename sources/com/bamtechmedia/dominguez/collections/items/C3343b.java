package com.bamtechmedia.dominguez.collections.items;

import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.collections.items.b */
/* compiled from: CollectionAnalyticsValues.kt */
public final class C3343b {

    /* renamed from: a */
    private final int f8409a;

    /* renamed from: b */
    private final String f8410b;

    /* renamed from: c */
    private final ContentSetType f8411c;

    /* renamed from: d */
    private final String f8412d;

    /* renamed from: e */
    private final String f8413e;

    /* renamed from: f */
    private final String f8414f;

    /* renamed from: g */
    private final String f8415g;

    public C3343b() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    public C3343b(int i, String str, ContentSetType contentSetType, String str2, String str3, String str4, String str5) {
        this.f8409a = i;
        this.f8410b = str;
        this.f8411c = contentSetType;
        this.f8412d = str2;
        this.f8413e = str3;
        this.f8414f = str4;
        this.f8415g = str5;
    }

    /* renamed from: a */
    public final String mo12422a() {
        return this.f8412d;
    }

    /* renamed from: b */
    public final String mo12423b() {
        return this.f8410b;
    }

    /* renamed from: c */
    public final int mo12424c() {
        return this.f8409a;
    }

    /* renamed from: d */
    public final ContentSetType mo12425d() {
        return this.f8411c;
    }

    /* renamed from: e */
    public final String mo12426e() {
        return this.f8415g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3343b) {
                C3343b bVar = (C3343b) obj;
                if (!(this.f8409a == bVar.f8409a) || !C12880j.m40224a((Object) this.f8410b, (Object) bVar.f8410b) || !C12880j.m40224a((Object) this.f8411c, (Object) bVar.f8411c) || !C12880j.m40224a((Object) this.f8412d, (Object) bVar.f8412d) || !C12880j.m40224a((Object) this.f8413e, (Object) bVar.f8413e) || !C12880j.m40224a((Object) this.f8414f, (Object) bVar.f8414f) || !C12880j.m40224a((Object) this.f8415g, (Object) bVar.f8415g)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo12428f() {
        return this.f8414f;
    }

    /* renamed from: g */
    public final String mo12429g() {
        return this.f8413e;
    }

    public int hashCode() {
        int i = this.f8409a * 31;
        String str = this.f8410b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        ContentSetType contentSetType = this.f8411c;
        int hashCode2 = (hashCode + (contentSetType != null ? contentSetType.hashCode() : 0)) * 31;
        String str2 = this.f8412d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8413e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8414f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8415g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionAnalyticsValues(containerIndex=");
        sb.append(this.f8409a);
        sb.append(", collectionId=");
        sb.append(this.f8410b);
        sb.append(", contentSetType=");
        sb.append(this.f8411c);
        sb.append(", collectionContentClass=");
        sb.append(this.f8412d);
        sb.append(", setId=");
        sb.append(this.f8413e);
        sb.append(", setContentClass=");
        sb.append(this.f8414f);
        sb.append(", experimentToken=");
        sb.append(this.f8415g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3343b(int i, String str, ContentSetType contentSetType, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        String str6 = "";
        String str7 = (i2 & 2) != 0 ? str6 : str;
        if ((i2 & 4) != 0) {
            contentSetType = ContentSetType.UnsupportedSet;
        }
        ContentSetType contentSetType2 = contentSetType;
        String str8 = (i2 & 8) != 0 ? str6 : str2;
        if ((i2 & 16) == 0) {
            str6 = str3;
        }
        if ((i2 & 32) != 0) {
            str4 = "none";
        }
        String str9 = str4;
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        this(i, str7, contentSetType2, str8, str6, str9, str5);
    }
}
