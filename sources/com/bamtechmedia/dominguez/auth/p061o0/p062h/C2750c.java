package com.bamtechmedia.dominguez.auth.p061o0.p062h;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'¢\u0006\u0002\u0010\b¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordValidator;", "", "getPasswordStrength", "Lcom/bamtechmedia/dominguez/auth/api/helper/PasswordStrength;", "password", "", "simplePasswordValidation", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "EntropyScore", "authApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.o0.h.c */
/* compiled from: PasswordValidator.kt */
public interface C2750c {

    /* renamed from: com.bamtechmedia.dominguez.auth.o0.h.c$a */
    /* compiled from: PasswordValidator.kt */
    public enum C2751a {
        WEAK1,
        WEAK2,
        OK1,
        OK2,
        STRONG1,
        STRONG2
    }

    /* renamed from: a */
    Integer mo11762a(String str);

    /* renamed from: b */
    C2749b mo11763b(String str);
}
