package com.bamtech.sdk4.session;

import com.bamtech.sdk4.service.ServiceException;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionState;", "", "()V", "AuthenticationExpired", "ExceptionState", "Failed", "Initializing", "LoggedIn", "LoggedOut", "Lcom/bamtech/sdk4/session/SessionState$Initializing;", "Lcom/bamtech/sdk4/session/SessionState$LoggedIn;", "Lcom/bamtech/sdk4/session/SessionState$LoggedOut;", "Lcom/bamtech/sdk4/session/SessionState$AuthenticationExpired;", "Lcom/bamtech/sdk4/session/SessionState$Failed;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionState.kt */
public abstract class SessionState {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionState$AuthenticationExpired;", "Lcom/bamtech/sdk4/session/SessionState;", "Lcom/bamtech/sdk4/session/SessionState$ExceptionState;", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "(Lcom/bamtech/sdk4/service/ServiceException;)V", "getException", "()Lcom/bamtech/sdk4/service/ServiceException;", "equals", "", "other", "", "hashCode", "", "toString", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SessionState.kt */
    public static final class AuthenticationExpired extends SessionState implements ExceptionState {
        private final ServiceException exception;

        public AuthenticationExpired(ServiceException serviceException) {
            super(null);
            this.exception = serviceException;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual((Object) AuthenticationExpired.class, (Object) obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj != null) {
                return !(Intrinsics.areEqual((Object) getException(), (Object) ((AuthenticationExpired) obj).getException()) ^ true);
            }
            throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.session.SessionState.AuthenticationExpired");
        }

        public ServiceException getException() {
            return this.exception;
        }

        public int hashCode() {
            return getException().hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AuthenticationExpired(exception=");
            sb.append(getException());
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionState$ExceptionState;", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "getException", "()Lcom/bamtech/sdk4/service/ServiceException;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SessionState.kt */
    public interface ExceptionState {
        ServiceException getException();
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionState$Failed;", "Lcom/bamtech/sdk4/session/SessionState;", "Lcom/bamtech/sdk4/session/SessionState$ExceptionState;", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "(Lcom/bamtech/sdk4/service/ServiceException;)V", "getException", "()Lcom/bamtech/sdk4/service/ServiceException;", "equals", "", "other", "", "hashCode", "", "toString", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SessionState.kt */
    public static final class Failed extends SessionState implements ExceptionState {
        private final ServiceException exception;

        public Failed(ServiceException serviceException) {
            super(null);
            this.exception = serviceException;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual((Object) Failed.class, (Object) obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj != null) {
                return !(Intrinsics.areEqual((Object) getException(), (Object) ((Failed) obj).getException()) ^ true);
            }
            throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.session.SessionState.Failed");
        }

        public ServiceException getException() {
            return this.exception;
        }

        public int hashCode() {
            return getException().hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed(exception=");
            sb.append(getException());
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionState$Initializing;", "Lcom/bamtech/sdk4/session/SessionState;", "()V", "equals", "", "other", "", "hashCode", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SessionState.kt */
    public static final class Initializing extends SessionState {
        public Initializing() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return !(Intrinsics.areEqual((Object) Initializing.class, (Object) obj != null ? obj.getClass() : null) ^ true);
        }

        public int hashCode() {
            return Initializing.class.hashCode();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionState$LoggedIn;", "Lcom/bamtech/sdk4/session/SessionState;", "()V", "equals", "", "other", "", "hashCode", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SessionState.kt */
    public static final class LoggedIn extends SessionState {
        public LoggedIn() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return !(Intrinsics.areEqual((Object) LoggedIn.class, (Object) obj != null ? obj.getClass() : null) ^ true);
        }

        public int hashCode() {
            return LoggedIn.class.hashCode();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionState$LoggedOut;", "Lcom/bamtech/sdk4/session/SessionState;", "()V", "equals", "", "other", "", "hashCode", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SessionState.kt */
    public static final class LoggedOut extends SessionState {
        public LoggedOut() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return !(Intrinsics.areEqual((Object) LoggedOut.class, (Object) obj != null ? obj.getClass() : null) ^ true);
        }

        public int hashCode() {
            return LoggedOut.class.hashCode();
        }
    }

    private SessionState() {
    }

    public /* synthetic */ SessionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
