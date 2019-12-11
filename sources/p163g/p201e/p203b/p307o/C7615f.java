package p163g.p201e.p203b.p307o;

import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.ServiceExceptionCase;
import com.bamtech.sdk4.service.ServiceExceptionCase.AccountBlocked;
import com.bamtech.sdk4.service.ServiceExceptionCase.AccountIdMissing;
import com.bamtech.sdk4.service.ServiceExceptionCase.AccountNotFound;
import com.bamtech.sdk4.service.ServiceExceptionCase.ActivationFailed;
import com.bamtech.sdk4.service.ServiceExceptionCase.AttributeUpdateFailed;
import com.bamtech.sdk4.service.ServiceExceptionCase.AttributeValidation;
import com.bamtech.sdk4.service.ServiceExceptionCase.AuthenticationBlocked;
import com.bamtech.sdk4.service.ServiceExceptionCase.AuthenticationExpired;
import com.bamtech.sdk4.service.ServiceExceptionCase.AuthorizationExpired;
import com.bamtech.sdk4.service.ServiceExceptionCase.Blackout;
import com.bamtech.sdk4.service.ServiceExceptionCase.ConfigurationNotFound;
import com.bamtech.sdk4.service.ServiceExceptionCase.DownloadLimitReached;
import com.bamtech.sdk4.service.ServiceExceptionCase.FraudDetectionViolation;
import com.bamtech.sdk4.service.ServiceExceptionCase.IdentityNotFound;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidCredentials;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidEmail;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidPasscode;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidPassword;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidRequest;
import com.bamtech.sdk4.service.ServiceExceptionCase.InvalidToken;
import com.bamtech.sdk4.service.ServiceExceptionCase.KeyNotFoundException;
import com.bamtech.sdk4.service.ServiceExceptionCase.KidsModeEnabled;
import com.bamtech.sdk4.service.ServiceExceptionCase.LinkSubscriptionPartialError;
import com.bamtech.sdk4.service.ServiceExceptionCase.LocationAcquisitionError;
import com.bamtech.sdk4.service.ServiceExceptionCase.LocationNotAllowed;
import com.bamtech.sdk4.service.ServiceExceptionCase.LoginRequired;
import com.bamtech.sdk4.service.ServiceExceptionCase.MaximumProfilesReached;
import com.bamtech.sdk4.service.ServiceExceptionCase.MediaUnavailable;
import com.bamtech.sdk4.service.ServiceExceptionCase.NetworkConnectionError;
import com.bamtech.sdk4.service.ServiceExceptionCase.NotEntitled;
import com.bamtech.sdk4.service.ServiceExceptionCase.ProfileRetrievalError;
import com.bamtech.sdk4.service.ServiceExceptionCase.RateLimited;
import com.bamtech.sdk4.service.ServiceExceptionCase.ResetTokenAlreadyUsed;
import com.bamtech.sdk4.service.ServiceExceptionCase.ResetTokenInvalid;
import com.bamtech.sdk4.service.ServiceExceptionCase.RetryFailed;
import com.bamtech.sdk4.service.ServiceExceptionCase.SecurityLevelInsufficient;
import com.bamtech.sdk4.service.ServiceExceptionCase.StreamConcurrencyViolation;
import com.bamtech.sdk4.service.ServiceExceptionCase.TemporarilyUnavailable;
import com.bamtech.sdk4.service.ServiceExceptionCase.ThumbnailsNotAvailable;
import com.bamtech.sdk4.service.ServiceExceptionCase.UnexpectedError;
import com.bamtech.sdk4.service.ServiceExceptionCase.UpdateIdentityConflict;
import com.bamtech.sdk4.service.ServiceExceptionCase.UserProfileDeleteFailed;
import com.bamtech.sdk4.service.ServiceExceptionCase.UserProfileNotFound;
import com.bamtech.sdk4.service.ServiceExceptionCase.UserProfileUpdateFailed;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import javax.inject.Provider;
import kotlin.C12898l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g.e.b.o.f */
/* compiled from: ErrorLocalizationImpl.kt */
public final class C7615f implements C7614e {

    /* renamed from: a */
    private final Provider<C3572r0> f16626a;

    public C7615f(Provider<C3572r0> provider) {
        this.f16626a = provider;
    }

    /* renamed from: c */
    private final ServiceExceptionCase m22596c(Throwable th) {
        ServiceException serviceException = (ServiceException) C13199w.m40591g(C7625o.m22611b(th, ServiceException.class));
        if (serviceException != null) {
            ServiceExceptionCase serviceExceptionCase = (ServiceExceptionCase) C13199w.m40591g(ServiceExceptionCase.Companion.getCases(serviceException));
            if (serviceExceptionCase != null) {
                return serviceExceptionCase;
            }
        }
        return UnexpectedError.INSTANCE;
    }

    /* renamed from: a */
    public String mo20537a(Throwable th) {
        return mo20538b(th).mo20546d();
    }

    /* renamed from: b */
    public C7619i mo20538b(Throwable th) {
        return mo20536a(m22596c(th));
    }

    /* renamed from: b */
    private final String m22595b(ServiceExceptionCase serviceExceptionCase) {
        String str = "frauddetectionviolation";
        String str2 = "unexpectederror";
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) AuthenticationExpired.INSTANCE)) {
            return "authenticationexpired";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) LocationNotAllowed.INSTANCE)) {
            return "locationnotallowed";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) LocationAcquisitionError.INSTANCE)) {
            return "locationacquisitionerror";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) TemporarilyUnavailable.INSTANCE)) {
            return "temporarilyunavailable";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) NetworkConnectionError.INSTANCE)) {
            return "networkconnectionerror";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) LoginRequired.INSTANCE)) {
            return "loginrequired";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) Blackout.INSTANCE)) {
            return "blackout";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) NotEntitled.INSTANCE)) {
            return "notentitled";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) StreamConcurrencyViolation.INSTANCE)) {
            return "streamconcurrency";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) MediaUnavailable.INSTANCE)) {
            return "mediaunavailable";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) InvalidToken.INSTANCE)) {
            return "invalidtoken";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) KeyNotFoundException.INSTANCE)) {
            return "keynotfoundexception";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) AttributeValidation.INSTANCE)) {
            return "attributevalidation";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) AccountNotFound.INSTANCE)) {
            return "accountnotfound";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) LinkSubscriptionPartialError.INSTANCE)) {
            return "linksubscriptionpartialerror";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) InvalidCredentials.INSTANCE)) {
            return "invalidcredentials";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) AuthenticationBlocked.INSTANCE)) {
            return "authenticationblocked";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) InvalidEmail.INSTANCE)) {
            return "invalidemail";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) UpdateIdentityConflict.INSTANCE)) {
            return "updateidentityconflict";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) RateLimited.INSTANCE)) {
            return "ratelimited";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) InvalidPasscode.INSTANCE)) {
            return "invalidpasscode";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) InvalidPassword.INSTANCE)) {
            return "invalidpassword";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) InvalidRequest.INSTANCE)) {
            return "invalidrequest";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) ResetTokenAlreadyUsed.INSTANCE)) {
            return "resettokenalreadyused";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) ResetTokenInvalid.INSTANCE)) {
            return "resettokeninvalid";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) ActivationFailed.INSTANCE)) {
            return "activationfailed";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) RetryFailed.INSTANCE)) {
            return "retryfailed";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) ConfigurationNotFound.INSTANCE)) {
            return "configurationnotfound";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) UserProfileNotFound.INSTANCE)) {
            return "userprofilenotfound";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) ProfileRetrievalError.INSTANCE)) {
            return "profileretrievalerror";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) UserProfileUpdateFailed.INSTANCE)) {
            return "userprofileupdatefailed";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) MaximumProfilesReached.INSTANCE)) {
            return "maximumprofilesreached";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) UserProfileDeleteFailed.INSTANCE)) {
            return "userprofiledeletefailed";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) AttributeUpdateFailed.INSTANCE)) {
            return "attributeupdatefailed";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) AuthorizationExpired.INSTANCE)) {
            return "authorizationexpired";
        }
        if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) DownloadLimitReached.INSTANCE) || Intrinsics.areEqual((Object) serviceExceptionCase, (Object) FraudDetectionViolation.INSTANCE)) {
            return str;
        }
        if (!Intrinsics.areEqual((Object) serviceExceptionCase, (Object) UnexpectedError.INSTANCE)) {
            if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) IdentityNotFound.INSTANCE)) {
                return "identitynotfound";
            }
            if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) AccountBlocked.INSTANCE)) {
                return "accountblocked";
            }
            if (Intrinsics.areEqual((Object) serviceExceptionCase, (Object) ThumbnailsNotAvailable.INSTANCE)) {
                return "thumbnailsnotavailable";
            }
            if (!Intrinsics.areEqual((Object) serviceExceptionCase, (Object) AccountIdMissing.INSTANCE) && !Intrinsics.areEqual((Object) serviceExceptionCase, (Object) KidsModeEnabled.INSTANCE) && !Intrinsics.areEqual((Object) serviceExceptionCase, (Object) SecurityLevelInsufficient.INSTANCE)) {
                throw new C12898l();
            }
        }
        return str2;
    }

    /* renamed from: a */
    public C7619i mo20536a(ServiceExceptionCase serviceExceptionCase) {
        return new C7619i(C3573a.m12037b((C3572r0) this.f16626a.get(), m22595b(serviceExceptionCase), null, 2, null), serviceExceptionCase);
    }
}
