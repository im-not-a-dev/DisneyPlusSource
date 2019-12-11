package com.bamtechmedia.dominguez.auth.p068t0;

import com.bamtechmedia.dominguez.auth.C2711f0;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2749b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c.C2751a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.p588j0.C12815k;
import p163g.p171c.p172a.p173a.C4793a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0014J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0006H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/password/PasswordValidatorImpl;", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;", "overrideStrings", "Lcom/bamnet/config/strings/OverrideStrings;", "(Lcom/bamnet/config/strings/OverrideStrings;)V", "defaultErrorMessage", "", "getDefaultErrorMessage", "()Ljava/lang/String;", "getEntropy", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator$EntropyScore;", "password", "getPasswordStrength", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordStrength;", "getPasswordStrengthColor", "", "score", "getPasswordStrengthProgress", "getPasswordStrengthWord", "simplePasswordValidation", "(Ljava/lang/String;)Ljava/lang/Integer;", "isMixPassword", "", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.t0.k */
/* compiled from: PasswordValidatorImpl.kt */
public final class C2986k implements C2750c {

    /* renamed from: a */
    private final C4793a f7831a;

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.k$a */
    /* compiled from: PasswordValidatorImpl.kt */
    public static final class C2987a {
        private C2987a() {
        }

        public /* synthetic */ C2987a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2987a(null);
    }

    public C2986k(C4793a aVar) {
        this.f7831a = aVar;
    }

    /* renamed from: c */
    private final String m10776c(C2751a aVar) {
        switch (C2988l.$EnumSwitchMapping$1[aVar.ordinal()]) {
            case 1:
            case 2:
                return "";
            case 3:
            case 4:
                return this.f7831a.mo16170a(C2721j0.password_rating_fair);
            case 5:
                return this.f7831a.mo16170a(C2721j0.password_rating_good);
            case 6:
                return this.f7831a.mo16170a(C2721j0.password_rating_great);
            default:
                throw new C12898l();
        }
    }

    /* renamed from: d */
    private final boolean m10777d(String str) {
        return new C12815k("[a-zA-Z]+").mo31138a(str) && (new C12815k("[0-9]+").mo31138a(str) || new C12815k("[!#$%^&*]+").mo31138a(str));
    }

    /* renamed from: a */
    public Integer mo11762a(String str) {
        int length = str.length();
        if (6 <= length && 256 >= length && m10777d(str)) {
            return null;
        }
        return Integer.valueOf(C2721j0.password_reqs_not_met);
    }

    /* renamed from: b */
    public C2749b mo11763b(String str) {
        if (str == null || C12832w.m40118a(str)) {
            return null;
        }
        C2751a c = m10775c(str);
        return new C2749b(m10774b(c), m10773a(c), m10776c(c));
    }

    /* renamed from: a */
    private final int m10773a(C2751a aVar) {
        switch (C2988l.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
            case 2:
                return C2711f0.vader_error;
            case 3:
            case 4:
                return C2711f0.vader_warning;
            case 5:
            case 6:
                return C2711f0.vader_success;
            default:
                throw new C12898l();
        }
    }

    /* renamed from: c */
    private final C2751a m10775c(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            Character valueOf = Character.valueOf(charAt);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        ArrayList<Number> arrayList = new ArrayList<>(linkedHashMap.size());
        for (Entry value : linkedHashMap.entrySet()) {
            arrayList.add(Float.valueOf(((float) ((List) value.getValue()).size()) / ((float) str.length())));
        }
        double d = 0.0d;
        for (Number floatValue : arrayList) {
            float floatValue2 = floatValue.floatValue();
            d += -(((double) (floatValue2 * C12737d.m39875a(floatValue2))) / C12737d.m39874a(2.0d));
        }
        double length = d * ((double) str.length());
        if (length >= ((double) 35)) {
            return C2751a.STRONG2;
        }
        if (length >= ((double) 30)) {
            return C2751a.STRONG1;
        }
        if (length >= ((double) 25)) {
            return C2751a.OK2;
        }
        if (length >= ((double) 20)) {
            return C2751a.OK1;
        }
        if (length >= ((double) 15)) {
            return C2751a.WEAK2;
        }
        return C2751a.WEAK1;
    }

    /* renamed from: b */
    private final int m10774b(C2751a aVar) {
        return (int) (((double) (aVar.ordinal() + 1)) * (100.0d / ((double) C2751a.values().length)));
    }
}
