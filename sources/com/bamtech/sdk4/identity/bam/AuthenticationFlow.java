package com.bamtech.sdk4.identity.bam;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.C12898l;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "", "()V", "Authenticate", "Companion", "CreateIdentity", "OneTimePasscode", "Unrecognized", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$Authenticate;", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$CreateIdentity;", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$OneTimePasscode;", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$Unrecognized;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationFlow.kt */
public abstract class AuthenticationFlow {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$Authenticate;", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "()V", "equals", "", "other", "", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AuthenticationFlow.kt */
    public static final class Authenticate extends AuthenticationFlow {
        public Authenticate() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof Authenticate;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$Companion;", "", "()V", "toString", "", "type", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "toType", "value", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AuthenticationFlow.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String toString(AuthenticationFlow authenticationFlow) {
            if (authenticationFlow instanceof Authenticate) {
                return "Login";
            }
            if (authenticationFlow instanceof CreateIdentity) {
                return "Register";
            }
            if (authenticationFlow instanceof OneTimePasscode) {
                return "OTP";
            }
            if (authenticationFlow instanceof Unrecognized) {
                return ((Unrecognized) authenticationFlow).getFlow();
            }
            throw new C12898l();
        }

        public final AuthenticationFlow toType(String str) {
            int hashCode = str.hashCode();
            if (hashCode != -625569085) {
                if (hashCode != 78603) {
                    if (hashCode == 73596745 && str.equals("Login")) {
                        return new Authenticate();
                    }
                } else if (str.equals("OTP")) {
                    return new OneTimePasscode();
                }
            } else if (str.equals("Register")) {
                return new CreateIdentity();
            }
            return new Unrecognized(str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$CreateIdentity;", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "()V", "equals", "", "other", "", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AuthenticationFlow.kt */
    public static final class CreateIdentity extends AuthenticationFlow {
        public CreateIdentity() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof CreateIdentity;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$OneTimePasscode;", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "()V", "equals", "", "other", "", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AuthenticationFlow.kt */
    public static final class OneTimePasscode extends AuthenticationFlow {
        public OneTimePasscode() {
            super(null);
        }

        public boolean equals(Object obj) {
            return obj instanceof OneTimePasscode;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow$Unrecognized;", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "flow", "", "(Ljava/lang/String;)V", "getFlow", "()Ljava/lang/String;", "equals", "", "other", "", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AuthenticationFlow.kt */
    public static final class Unrecognized extends AuthenticationFlow {
        private final String flow;

        public Unrecognized(String str) {
            super(null);
            this.flow = str;
        }

        public boolean equals(Object obj) {
            return obj instanceof Unrecognized;
        }

        public final String getFlow() {
            return this.flow;
        }
    }

    private AuthenticationFlow() {
    }

    public /* synthetic */ AuthenticationFlow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
