package com.bamtech.sdk4.service;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KClass;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:-\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'\u0001,456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_¨\u0006`"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "AccountBlocked", "AccountIdMissing", "AccountNotFound", "ActivationFailed", "AttributeUpdateFailed", "AttributeValidation", "AuthenticationBlocked", "AuthenticationExpired", "AuthorizationExpired", "Blackout", "Companion", "ConfigurationNotFound", "DownloadLimitReached", "FraudDetectionViolation", "IdentityNotFound", "InvalidCredentials", "InvalidEmail", "InvalidPasscode", "InvalidPassword", "InvalidRequest", "InvalidToken", "KeyNotFoundException", "KidsModeEnabled", "LinkSubscriptionPartialError", "LocationAcquisitionError", "LocationNotAllowed", "LoginRequired", "MaximumProfilesReached", "MediaUnavailable", "NetworkConnectionError", "NotEntitled", "ProfileRetrievalError", "RateLimited", "ResetTokenAlreadyUsed", "ResetTokenInvalid", "RetryFailed", "SecurityLevelInsufficient", "StreamConcurrencyViolation", "TemporarilyUnavailable", "ThumbnailsNotAvailable", "UnexpectedError", "UpdateIdentityConflict", "UserProfileDeleteFailed", "UserProfileNotFound", "UserProfileUpdateFailed", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$AccountBlocked;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$AuthenticationExpired;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$LocationNotAllowed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$LocationAcquisitionError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$TemporarilyUnavailable;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$NetworkConnectionError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$LoginRequired;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$Blackout;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$NotEntitled;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$KidsModeEnabled;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$StreamConcurrencyViolation;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$MediaUnavailable;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidToken;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$KeyNotFoundException;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$AttributeValidation;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$AccountNotFound;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$LinkSubscriptionPartialError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidCredentials;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$AuthenticationBlocked;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidEmail;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$UpdateIdentityConflict;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$RateLimited;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidPasscode;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidPassword;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidRequest;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$ResetTokenAlreadyUsed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$ResetTokenInvalid;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$ActivationFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$RetryFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$ConfigurationNotFound;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$UserProfileNotFound;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$ProfileRetrievalError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$UserProfileUpdateFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$MaximumProfilesReached;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$UserProfileDeleteFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$AttributeUpdateFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$AuthorizationExpired;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$DownloadLimitReached;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$FraudDetectionViolation;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$UnexpectedError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$IdentityNotFound;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$SecurityLevelInsufficient;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$AccountIdMissing;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase$ThumbnailsNotAvailable;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceException.kt */
public abstract class ServiceExceptionCase {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$AccountBlocked;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class AccountBlocked extends ServiceExceptionCase {
        public static final AccountBlocked INSTANCE = new AccountBlocked();

        private AccountBlocked() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "account.blocked", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$AccountIdMissing;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class AccountIdMissing extends ServiceExceptionCase {
        public static final AccountIdMissing INSTANCE = new AccountIdMissing();

        private AccountIdMissing() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "account-id.missing", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$AccountNotFound;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class AccountNotFound extends ServiceExceptionCase {
        public static final AccountNotFound INSTANCE = new AccountNotFound();

        private AccountNotFound() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (C13185o.m40520c("account.not.found", "account.get.failed", "account.profile.update.failed").contains(code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$ActivationFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class ActivationFailed extends ServiceExceptionCase {
        public static final ActivationFailed INSTANCE = new ActivationFailed();

        private ActivationFailed() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "activation.failed", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$AttributeUpdateFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class AttributeUpdateFailed extends ServiceExceptionCase {
        public static final AttributeUpdateFailed INSTANCE = new AttributeUpdateFailed();

        private AttributeUpdateFailed() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.attributes.update.failed", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$AttributeValidation;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class AttributeValidation extends ServiceExceptionCase {
        public static final AttributeValidation INSTANCE = new AttributeValidation();

        private AttributeValidation() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "payload.fields.incorrect", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$AuthenticationBlocked;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class AuthenticationBlocked extends ServiceExceptionCase {
        public static final AuthenticationBlocked INSTANCE = new AuthenticationBlocked();

        private AuthenticationBlocked() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.identity.blocked", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$AuthenticationExpired;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class AuthenticationExpired extends ServiceExceptionCase {
        public static final AuthenticationExpired INSTANCE = new AuthenticationExpired();

        private AuthenticationExpired() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason errorReason : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "invalid_grant", (Object) errorReason.getCode())) {
                    if (Intrinsics.areEqual((Object) "expired-token", (Object) errorReason.getDescription())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$AuthorizationExpired;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class AuthorizationExpired extends ServiceExceptionCase {
        public static final AuthorizationExpired INSTANCE = new AuthorizationExpired();

        private AuthorizationExpired() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "access-token.expired", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$Blackout;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class Blackout extends ServiceExceptionCase {
        public static final Blackout INSTANCE = new Blackout();

        private Blackout() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "blackout", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$Companion;", "", "()V", "getCases", "", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "getFirstMatch", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class Companion {
        private Companion() {
        }

        public final List<ServiceExceptionCase> getCases(ServiceException serviceException) {
            Collection nestedClasses = C12895y.m40230a(ServiceExceptionCase.class).getNestedClasses();
            ArrayList<KClass> arrayList = new ArrayList<>();
            for (Object next : nestedClasses) {
                if (((KClass) next).getObjectInstance() instanceof ServiceExceptionCase) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
            for (KClass objectInstance : arrayList) {
                Object objectInstance2 = objectInstance.getObjectInstance();
                if (objectInstance2 != null) {
                    arrayList2.add((ServiceExceptionCase) objectInstance2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bamtech.sdk4.service.ServiceExceptionCase");
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object next2 : arrayList2) {
                if (((ServiceExceptionCase) next2).isInstance(serviceException)) {
                    arrayList3.add(next2);
                }
            }
            return arrayList3;
        }

        public final ServiceExceptionCase getFirstMatch(ServiceException serviceException) {
            Object obj;
            Iterator it = C12788p.m39994d(C12788p.m39989a(C13199w.m40577c((Iterable) C12895y.m40230a(ServiceExceptionCase.class).getNestedClasses()), (Function1) ServiceExceptionCase$Companion$getFirstMatch$1.INSTANCE), ServiceExceptionCase$Companion$getFirstMatch$2.INSTANCE).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ServiceExceptionCase) obj).isInstance(serviceException)) {
                    break;
                }
            }
            return (ServiceExceptionCase) obj;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$ConfigurationNotFound;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class ConfigurationNotFound extends ServiceExceptionCase {
        public static final ConfigurationNotFound INSTANCE = new ConfigurationNotFound();

        private ConfigurationNotFound() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "configuration.not.found", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$DownloadLimitReached;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class DownloadLimitReached extends ServiceExceptionCase {
        public static final DownloadLimitReached INSTANCE = new DownloadLimitReached();

        private DownloadLimitReached() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason errorReason : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "not-permitted-offline", (Object) errorReason.getCode())) {
                    if (Intrinsics.areEqual((Object) "download-limit-reached", (Object) errorReason.getDescription())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$FraudDetectionViolation;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class FraudDetectionViolation extends ServiceExceptionCase {
        public static final FraudDetectionViolation INSTANCE = new FraudDetectionViolation();

        private FraudDetectionViolation() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason errorReason : serviceException.getErrors()) {
                if (C13185o.m40520c("not-permitted-offline", "not-permitted-renewal").contains(errorReason.getCode())) {
                    if (Intrinsics.areEqual((Object) "fraud-access-revoked", (Object) errorReason.getDescription())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$IdentityNotFound;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class IdentityNotFound extends ServiceExceptionCase {
        public static final IdentityNotFound INSTANCE = new IdentityNotFound();

        private IdentityNotFound() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.identity.not-found", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidCredentials;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class InvalidCredentials extends ServiceExceptionCase {
        public static final InvalidCredentials INSTANCE = new InvalidCredentials();

        private InvalidCredentials() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.identity.bad-credentials", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidEmail;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class InvalidEmail extends ServiceExceptionCase {
        public static final InvalidEmail INSTANCE = new InvalidEmail();

        private InvalidEmail() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.payload.fields.incorrect", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidPasscode;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class InvalidPasscode extends ServiceExceptionCase {
        public static final InvalidPasscode INSTANCE = new InvalidPasscode();

        private InvalidPasscode() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.otp.invalid-passcode", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidPassword;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class InvalidPassword extends ServiceExceptionCase {
        public static final InvalidPassword INSTANCE = new InvalidPassword();

        private InvalidPassword() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.password.invalid-value", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidRequest;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class InvalidRequest extends ServiceExceptionCase {
        public static final InvalidRequest INSTANCE = new InvalidRequest();

        private InvalidRequest() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            return serviceException instanceof InvalidRequestException;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$InvalidToken;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class InvalidToken extends ServiceExceptionCase {
        public static final InvalidToken INSTANCE = new InvalidToken();

        private InvalidToken() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "payload.id-token.invalid", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$KeyNotFoundException;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class KeyNotFoundException extends ServiceExceptionCase {
        public static final KeyNotFoundException INSTANCE = new KeyNotFoundException();

        private KeyNotFoundException() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (C13185o.m40520c("key.not-found", "content-key.not-found").contains(code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$KidsModeEnabled;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class KidsModeEnabled extends ServiceExceptionCase {
        public static final KidsModeEnabled INSTANCE = new KidsModeEnabled();

        private KidsModeEnabled() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "kids-mode-enabled", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$LinkSubscriptionPartialError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class LinkSubscriptionPartialError extends ServiceExceptionCase {
        public static final LinkSubscriptionPartialError INSTANCE = new LinkSubscriptionPartialError();

        private LinkSubscriptionPartialError() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (C13185o.m40520c("copy.failure", "copy.limit.reached").contains(code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$LocationAcquisitionError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class LocationAcquisitionError extends ServiceExceptionCase {
        public static final LocationAcquisitionError INSTANCE = new LocationAcquisitionError();

        private LocationAcquisitionError() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$LocationNotAllowed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class LocationNotAllowed extends ServiceExceptionCase {
        public static final LocationNotAllowed INSTANCE = new LocationNotAllowed();

        private LocationNotAllowed() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason errorReason : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "unauthorized_client", (Object) errorReason.getCode()) && C13199w.m40564a((Iterable) C13185o.m40520c("unknown-location", "unreliable-location", "forbidden-location"), (Object) errorReason.getDescription())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$LoginRequired;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class LoginRequired extends ServiceExceptionCase {
        public static final LoginRequired INSTANCE = new LoginRequired();

        private LoginRequired() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "login.required", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$MaximumProfilesReached;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class MaximumProfilesReached extends ServiceExceptionCase {
        public static final MaximumProfilesReached INSTANCE = new MaximumProfilesReached();

        private MaximumProfilesReached() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "account.profiles.max.exceeded", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$MediaUnavailable;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class MediaUnavailable extends ServiceExceptionCase {
        public static final MediaUnavailable INSTANCE = new MediaUnavailable();

        private MediaUnavailable() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (C13185o.m40520c("media.not-playable", "media.missing").contains(code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$NetworkConnectionError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class NetworkConnectionError extends ServiceExceptionCase {
        public static final NetworkConnectionError INSTANCE = new NetworkConnectionError();

        private NetworkConnectionError() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            return serviceException instanceof NetworkException;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$NotEntitled;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class NotEntitled extends ServiceExceptionCase {
        public static final NotEntitled INSTANCE = new NotEntitled();

        private NotEntitled() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "not-entitled", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$ProfileRetrievalError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class ProfileRetrievalError extends ServiceExceptionCase {
        public static final ProfileRetrievalError INSTANCE = new ProfileRetrievalError();

        private ProfileRetrievalError() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "account.profile.read.failed", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$RateLimited;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class RateLimited extends ServiceExceptionCase {
        public static final RateLimited INSTANCE = new RateLimited();

        private RateLimited() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.auth.otp.throttled", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$ResetTokenAlreadyUsed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class ResetTokenAlreadyUsed extends ServiceExceptionCase {
        public static final ResetTokenAlreadyUsed INSTANCE = new ResetTokenAlreadyUsed();

        private ResetTokenAlreadyUsed() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.reset-token.already-used", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$ResetTokenInvalid;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class ResetTokenInvalid extends ServiceExceptionCase {
        public static final ResetTokenInvalid INSTANCE = new ResetTokenInvalid();

        private ResetTokenInvalid() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.reset-token.invalid", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$RetryFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class RetryFailed extends ServiceExceptionCase {
        public static final RetryFailed INSTANCE = new RetryFailed();

        private RetryFailed() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "activation.failed.permanently", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$SecurityLevelInsufficient;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class SecurityLevelInsufficient extends ServiceExceptionCase {
        public static final SecurityLevelInsufficient INSTANCE = new SecurityLevelInsufficient();

        private SecurityLevelInsufficient() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "security-level.insufficient", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$StreamConcurrencyViolation;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class StreamConcurrencyViolation extends ServiceExceptionCase {
        public static final StreamConcurrencyViolation INSTANCE = new StreamConcurrencyViolation();

        private StreamConcurrencyViolation() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "stream-concurrency-violation", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$TemporarilyUnavailable;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class TemporarilyUnavailable extends ServiceExceptionCase {
        public static final TemporarilyUnavailable INSTANCE = new TemporarilyUnavailable();

        private TemporarilyUnavailable() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            return serviceException instanceof ServerErrorException;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$ThumbnailsNotAvailable;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "CODE", "", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class ThumbnailsNotAvailable extends ServiceExceptionCase {
        public static final ThumbnailsNotAvailable INSTANCE = new ThumbnailsNotAvailable();

        private ThumbnailsNotAvailable() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "thumbnails-unavailable", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$UnexpectedError;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class UnexpectedError extends ServiceExceptionCase {
        public static final UnexpectedError INSTANCE = new UnexpectedError();

        private UnexpectedError() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            return serviceException instanceof ServiceRequestException;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$UpdateIdentityConflict;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class UpdateIdentityConflict extends ServiceExceptionCase {
        public static final UpdateIdentityConflict INSTANCE = new UpdateIdentityConflict();

        private UpdateIdentityConflict() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "idp.error.identity.already-exists", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$UserProfileDeleteFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class UserProfileDeleteFailed extends ServiceExceptionCase {
        public static final UserProfileDeleteFailed INSTANCE = new UserProfileDeleteFailed();

        private UserProfileDeleteFailed() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "account.profile.delete.failed", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$UserProfileNotFound;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class UserProfileNotFound extends ServiceExceptionCase {
        public static final UserProfileNotFound INSTANCE = new UserProfileNotFound();

        private UserProfileNotFound() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "account.profile.not.found", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceExceptionCase$UserProfileUpdateFailed;", "Lcom/bamtech/sdk4/service/ServiceExceptionCase;", "()V", "isInstance", "", "exception", "Lcom/bamtech/sdk4/service/ServiceException;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class UserProfileUpdateFailed extends ServiceExceptionCase {
        public static final UserProfileUpdateFailed INSTANCE = new UserProfileUpdateFailed();

        private UserProfileUpdateFailed() {
            super(null);
        }

        public boolean isInstance(ServiceException serviceException) {
            for (ErrorReason code : serviceException.getErrors()) {
                if (Intrinsics.areEqual((Object) "account.profile.update.failed", (Object) code.getCode())) {
                    return true;
                }
            }
            return false;
        }
    }

    private ServiceExceptionCase() {
    }

    public abstract boolean isInstance(ServiceException serviceException);

    public /* synthetic */ ServiceExceptionCase(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
