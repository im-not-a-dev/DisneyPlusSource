package com.bamtech.sdk4.internal.session;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.configuration.RetryPolicy;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.ServiceRequestException;
import com.bamtech.sdk4.service.UnauthorizedException;
import com.bamtech.sdk4.token.AccessContext;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u001b\u001c\u001d\u001e\u001f !B'\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0001\u0006\"#$%&'¨\u0006("}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "", "accessContext", "Lcom/bamtech/sdk4/token/AccessContext;", "_attempts", "", "_lastFailure", "Lorg/joda/time/DateTime;", "(Lcom/bamtech/sdk4/token/AccessContext;ILorg/joda/time/DateTime;)V", "getAccessContext", "()Lcom/bamtech/sdk4/token/AccessContext;", "setAccessContext", "(Lcom/bamtech/sdk4/token/AccessContext;)V", "attempts", "getAttempts", "()I", "lastFailure", "getLastFailure", "()Lorg/joda/time/DateTime;", "recordAttempt", "", "updateDelayed", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "retryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "AuthenticationExpired", "ExceptionState", "Failed", "Initializing", "Legacy", "LoggedIn", "LoggedOut", "Lcom/bamtech/sdk4/internal/session/InternalSessionState$Initializing;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState$Legacy;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState$LoggedIn;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState$LoggedOut;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState$AuthenticationExpired;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState$Failed;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: InternalSessionState.kt */
public abstract class InternalSessionState {
    private int _attempts;
    private DateTime _lastFailure;
    private AccessContext accessContext;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState$AuthenticationExpired;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState$ExceptionState;", "()V", "accessContext", "Lcom/bamtech/sdk4/token/AccessContext;", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "(Lcom/bamtech/sdk4/token/AccessContext;Lcom/bamtech/sdk4/service/ServiceException;)V", "getException", "()Lcom/bamtech/sdk4/service/ServiceException;", "equals", "", "other", "", "hashCode", "", "toString", "", "updateDelayed", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "retryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: InternalSessionState.kt */
    public static final class AuthenticationExpired extends InternalSessionState implements ExceptionState {
        private final ServiceException exception;

        public AuthenticationExpired(AccessContext accessContext, ServiceException serviceException) {
            DateTime now = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now(DateTimeZone.UTC)");
            super(accessContext, 0, now, null);
            this.exception = serviceException;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthenticationExpired)) {
                return false;
            }
            AuthenticationExpired authenticationExpired = (AuthenticationExpired) obj;
            return !(Intrinsics.areEqual((Object) getAccessContext(), (Object) authenticationExpired.getAccessContext()) ^ true) && !(Intrinsics.areEqual((Object) getException(), (Object) authenticationExpired.getException()) ^ true);
        }

        public ServiceException getException() {
            return this.exception;
        }

        public int hashCode() {
            int hashCode = getException().hashCode();
            AccessContext accessContext = getAccessContext();
            return hashCode + (accessContext != null ? accessContext.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AuthenticationExpired(exception=");
            sb.append(getException());
            sb.append(')');
            return sb.toString();
        }

        public boolean updateDelayed(ServiceTransaction serviceTransaction, RetryPolicy retryPolicy) {
            return true;
        }

        public AuthenticationExpired() {
            DateTime now = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now(DateTimeZone.UTC)");
            AccessContext accessContext = new AccessContext("", "", now, null, null, 24, null);
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkReturnedValueIsNotNull((Object) randomUUID, "UUID.randomUUID()");
            UnauthorizedException unauthorizedException = new UnauthorizedException(randomUUID, null, null, 6, null);
            this(accessContext, unauthorizedException);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState$ExceptionState;", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "getException", "()Lcom/bamtech/sdk4/service/ServiceException;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: InternalSessionState.kt */
    public interface ExceptionState {
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0016¢\u0006\u0002\u0010\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState$Failed;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState$ExceptionState;", "Ljava/io/Serializable;", "()V", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "attempts", "", "lastFailure", "Lorg/joda/time/DateTime;", "(Lcom/bamtech/sdk4/service/ServiceException;ILorg/joda/time/DateTime;)V", "getException", "()Lcom/bamtech/sdk4/service/ServiceException;", "equals", "", "other", "", "hashCode", "toString", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: InternalSessionState.kt */
    public static final class Failed extends InternalSessionState implements ExceptionState, Serializable {
        private final ServiceException exception;

        public /* synthetic */ Failed(ServiceException serviceException, int i, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                Intrinsics.checkReturnedValueIsNotNull((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(serviceException, i, dateTime);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && !(Intrinsics.areEqual((Object) getException(), (Object) ((Failed) obj).getException()) ^ true);
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

        public Failed(ServiceException serviceException, int i, DateTime dateTime) {
            super(null, i, dateTime, null);
            this.exception = serviceException;
        }

        public Failed() {
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkReturnedValueIsNotNull((Object) randomUUID, "UUID.randomUUID()");
            ServiceRequestException serviceRequestException = new ServiceRequestException(randomUUID, null, null, 6, null);
            DateTime now = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now(DateTimeZone.UTC)");
            this(serviceRequestException, 0, now);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState$Initializing;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "()V", "equals", "", "other", "", "hashCode", "", "updateDelayed", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "retryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: InternalSessionState.kt */
    public static final class Initializing extends InternalSessionState {
        public Initializing() {
            super(null, 0, null, 7, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initializing);
        }

        public int hashCode() {
            return Initializing.class.hashCode();
        }

        public boolean updateDelayed(ServiceTransaction serviceTransaction, RetryPolicy retryPolicy) {
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState$Legacy;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "accessContext", "Lcom/bamtech/sdk4/token/AccessContext;", "(Lcom/bamtech/sdk4/token/AccessContext;)V", "equals", "", "other", "", "hashCode", "", "updateDelayed", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "retryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "Companion", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: InternalSessionState.kt */
    public static final class Legacy extends InternalSessionState {

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState$Legacy$Companion;", "", "()V", "LEGACY_TOKEN_CONVERSION_FAILED", "", "LEGACY_TOKEN_CONVERTED_TO_ACCOUNT_CONTEXT", "LEGACY_TOKEN_CONVERTED_TO_DEVICE_CONTEXT", "LEGACY_TOKEN_FOUND", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* compiled from: InternalSessionState.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new Companion(null);
        }

        public Legacy(AccessContext accessContext) {
            super(accessContext, 0, null, 6, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Legacy);
        }

        public int hashCode() {
            return Legacy.class.hashCode();
        }

        public boolean updateDelayed(ServiceTransaction serviceTransaction, RetryPolicy retryPolicy) {
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState$LoggedIn;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "()V", "accessContext", "Lcom/bamtech/sdk4/token/AccessContext;", "attempts", "", "lastFailure", "Lorg/joda/time/DateTime;", "(Lcom/bamtech/sdk4/token/AccessContext;ILorg/joda/time/DateTime;)V", "equals", "", "other", "", "hashCode", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: InternalSessionState.kt */
    public static final class LoggedIn extends InternalSessionState {
        public /* synthetic */ LoggedIn(AccessContext accessContext, int i, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                Intrinsics.checkReturnedValueIsNotNull((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(accessContext, i, dateTime);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoggedIn) && !(Intrinsics.areEqual((Object) ((LoggedIn) obj).getAccessContext(), (Object) getAccessContext()) ^ true);
        }

        public int hashCode() {
            AccessContext accessContext = getAccessContext();
            if (accessContext != null) {
                return accessContext.hashCode();
            }
            return 0;
        }

        public LoggedIn(AccessContext accessContext, int i, DateTime dateTime) {
            super(accessContext, i, dateTime, null);
        }

        public LoggedIn() {
            DateTime now = DateTime.now(DateTimeZone.UTC);
            String str = "DateTime.now(DateTimeZone.UTC)";
            Intrinsics.checkReturnedValueIsNotNull((Object) now, str);
            AccessContext accessContext = new AccessContext("", "", now, null, null, 24, null);
            DateTime now2 = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) now2, str);
            this(accessContext, 0, now2);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionState$LoggedOut;", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "()V", "accessContext", "Lcom/bamtech/sdk4/token/AccessContext;", "attempts", "", "lastFailure", "Lorg/joda/time/DateTime;", "(Lcom/bamtech/sdk4/token/AccessContext;ILorg/joda/time/DateTime;)V", "equals", "", "other", "", "hashCode", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: InternalSessionState.kt */
    public static final class LoggedOut extends InternalSessionState {
        public /* synthetic */ LoggedOut(AccessContext accessContext, int i, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                Intrinsics.checkReturnedValueIsNotNull((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(accessContext, i, dateTime);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoggedOut) && !(Intrinsics.areEqual((Object) ((LoggedOut) obj).getAccessContext(), (Object) getAccessContext()) ^ true);
        }

        public int hashCode() {
            AccessContext accessContext = getAccessContext();
            if (accessContext != null) {
                return accessContext.hashCode();
            }
            return 0;
        }

        public LoggedOut(AccessContext accessContext, int i, DateTime dateTime) {
            super(accessContext, i, dateTime, null);
        }

        public LoggedOut() {
            DateTime now = DateTime.now(DateTimeZone.UTC);
            String str = "DateTime.now(DateTimeZone.UTC)";
            Intrinsics.checkReturnedValueIsNotNull((Object) now, str);
            AccessContext accessContext = new AccessContext("", "", now, null, null, 24, null);
            DateTime now2 = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) now2, str);
            this(accessContext, 0, now2);
        }
    }

    private InternalSessionState(AccessContext accessContext2, int i, DateTime dateTime) {
        this.accessContext = accessContext2;
        this._attempts = i;
        this._lastFailure = dateTime;
    }

    public final AccessContext getAccessContext() {
        return this.accessContext;
    }

    public final int getAttempts() {
        return this._attempts;
    }

    public final DateTime getLastFailure() {
        return this._lastFailure;
    }

    public final void recordAttempt() {
        this._attempts++;
        DateTime now = DateTime.now(DateTimeZone.UTC);
        Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now(DateTimeZone.UTC)");
        this._lastFailure = now;
    }

    public final void setAccessContext(AccessContext accessContext2) {
        this.accessContext = accessContext2;
    }

    public boolean updateDelayed(ServiceTransaction serviceTransaction, RetryPolicy retryPolicy) {
        DateTime plusSeconds = getLastFailure().plusSeconds(retryPolicy != null ? retryPolicy.getDelay(getAttempts()) : 0);
        Intrinsics.checkReturnedValueIsNotNull((Object) plusSeconds, "lastFailure.plusSeconds(delay)");
        if (getAttempts() <= 0 || !plusSeconds.isAfterNow()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ InternalSessionState(AccessContext accessContext2, int i, DateTime dateTime, DefaultConstructorMarker defaultConstructorMarker) {
        this(accessContext2, i, dateTime);
    }

    /* synthetic */ InternalSessionState(AccessContext accessContext2, int i, DateTime dateTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            accessContext2 = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            dateTime = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
        }
        this(accessContext2, i, dateTime);
    }
}
