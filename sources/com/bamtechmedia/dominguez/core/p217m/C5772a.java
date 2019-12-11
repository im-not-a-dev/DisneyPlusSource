package com.bamtechmedia.dominguez.core.p217m;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.m.a */
/* compiled from: ActivityResult.kt */
public final class C5772a {

    /* renamed from: a */
    private final int f13532a;

    /* renamed from: b */
    private final int f13533b;

    /* renamed from: c */
    private final Intent f13534c;

    public C5772a(int i, int i2, Intent intent) {
        this.f13532a = i;
        this.f13533b = i2;
        this.f13534c = intent;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5772a) {
                C5772a aVar = (C5772a) obj;
                if (this.f13532a == aVar.f13532a) {
                    if (!(this.f13533b == aVar.f13533b) || !Intrinsics.areEqual((Object) this.f13534c, (Object) aVar.f13534c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.f13532a * 31) + this.f13533b) * 31;
        Intent intent = this.f13534c;
        return i + (intent != null ? intent.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult(requestCode=");
        sb.append(this.f13532a);
        sb.append(", resultCode=");
        sb.append(this.f13533b);
        sb.append(", data=");
        sb.append(this.f13534c);
        sb.append(")");
        return sb.toString();
    }
}
