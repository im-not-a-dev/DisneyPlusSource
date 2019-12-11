package com.bamtech.sdk4.identity;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/SecurityAction;", "", "()V", "ChangePassword", "Companion", "Other", "Lcom/bamtech/sdk4/identity/SecurityAction$Other;", "Lcom/bamtech/sdk4/identity/SecurityAction$ChangePassword;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IdentityToken.kt */
public abstract class SecurityAction {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/SecurityAction$ChangePassword;", "Lcom/bamtech/sdk4/identity/SecurityAction;", "()V", "equals", "", "other", "", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: IdentityToken.kt */
    public static final class ChangePassword extends SecurityAction {
        public ChangePassword() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof ChangePassword;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/SecurityAction$Companion;", "", "()V", "toString", "", "type", "Lcom/bamtech/sdk4/identity/SecurityAction;", "toType", "value", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: IdentityToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String toString(SecurityAction securityAction) {
            if (securityAction instanceof ChangePassword) {
                return "ChangePassword";
            }
            return ((Other) securityAction).getValue();
        }

        public final SecurityAction toType(String str) {
            String upperCase = str.toUpperCase();
            Intrinsics.checkReturnedValueIsNotNull((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            if (upperCase.hashCode() == -1313930677 && upperCase.equals("CHANGEPASSWORD")) {
                return new ChangePassword();
            }
            return new Other(str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/SecurityAction$Other;", "Lcom/bamtech/sdk4/identity/SecurityAction;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: IdentityToken.kt */
    public static final class Other extends SecurityAction {
        private final String value;

        public Other(String str) {
            super(null);
            this.value = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Other) && Intrinsics.areEqual((Object) this.value, (Object) ((Other) obj).value);
        }

        public final String getValue() {
            return this.value;
        }
    }

    private SecurityAction() {
    }

    public /* synthetic */ SecurityAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
