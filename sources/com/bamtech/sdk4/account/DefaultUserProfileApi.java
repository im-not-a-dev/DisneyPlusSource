package com.bamtech.sdk4.account;

import com.bamtech.sdk4.account.DefaultUserProfile.Collection;
import com.bamtech.sdk4.extension.account.UserProfileExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JS\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u000b\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u0001H\f2\b\u0010\u0011\u001a\u0004\u0018\u0001H\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0013H\u0016¢\u0006\u0002\u0010\u0014J>\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\tH\u0016J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0013H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u001d\u001a\u00020\u000fH\u0016J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0013H\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001f0\tH\u0016J4\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u001f0\t\"\b\b\u0000\u0010\n*\u00020\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\n0\u001f0\u0013H\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J3\u0010!\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\u001a\u001a\u0002H\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0013H\u0016¢\u0006\u0002\u0010\"J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u001a\u001a\u00020\u0015H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/DefaultUserProfileApi;", "Lcom/bamtech/sdk4/account/UserProfileApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "userProfileExtension", "Lcom/bamtech/sdk4/extension/account/UserProfileExtension;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/extension/account/UserProfileExtension;)V", "createUserProfile", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "U", "V", "profileName", "", "attributes", "metadata", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Lio/reactivex/Single;", "Lcom/bamtech/sdk4/account/DefaultUserProfile;", "", "", "deleteUserProfile", "Lio/reactivex/Completable;", "profile", "getActiveUserProfile", "getUserProfile", "profileId", "getUserProfiles", "", "setActiveUserProfile", "updateUserProfile", "(Lcom/bamtech/sdk4/account/UserProfile;Ljava/lang/Class;)Lio/reactivex/Single;", "plugin-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileApi.kt */
public final class DefaultUserProfileApi implements UserProfileApi {
    private final Provider<ServiceTransaction> transactionProvider;
    private final UserProfileExtension userProfileExtension;

    public DefaultUserProfileApi(Provider<ServiceTransaction> provider, UserProfileExtension userProfileExtension2) {
        this.transactionProvider = provider;
        this.userProfileExtension = userProfileExtension2;
    }

    public Single<DefaultUserProfile> createUserProfile(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        return createUserProfile(str, map, map2, DefaultUserProfile.class);
    }

    public Completable deleteUserProfile(UserProfile userProfile) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        UserProfileExtension userProfileExtension2 = this.userProfileExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(userProfileExtension2.deleteUserProfile(serviceTransaction, userProfile), serviceTransaction, UserProfileApiKt.getPROFILE_API_DELETE_PROFILE(), (Object) null, 4, (Object) null);
    }

    public Single<DefaultUserProfile> getActiveUserProfile() {
        return getActiveUserProfile(DefaultUserProfile.class);
    }

    public Single<DefaultUserProfile> getUserProfile(String str) {
        return getUserProfile(str, DefaultUserProfile.class);
    }

    public Single<List<DefaultUserProfile>> getUserProfiles() {
        return getUserProfiles(Collection.class);
    }

    public Completable setActiveUserProfile(UserProfile userProfile) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        UserProfileExtension userProfileExtension2 = this.userProfileExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(userProfileExtension2.setActiveUserProfile(serviceTransaction, userProfile), serviceTransaction, UserProfileApiKt.getPROFILE_API_SET_ACTIVE_PROFILE(), (Object) null, 4, (Object) null);
    }

    public Single<DefaultUserProfile> updateUserProfile(DefaultUserProfile defaultUserProfile) {
        return updateUserProfile(defaultUserProfile, DefaultUserProfile.class);
    }

    public <T extends UserProfile, U, V> Single<T> createUserProfile(String str, U u, V v, Class<T> cls) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        UserProfileExtension userProfileExtension2 = this.userProfileExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        ServiceTransaction serviceTransaction2 = serviceTransaction;
        return DustExtensionsKt.withDust$default(userProfileExtension2.createUserProfile(serviceTransaction2, str, u, v, cls), serviceTransaction2, UserProfileApiKt.getPROFILE_API_CREATE_PROFILE(), (Object) null, 4, (Object) null);
    }

    public <T extends UserProfile> Single<T> getActiveUserProfile(Class<T> cls) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        UserProfileExtension userProfileExtension2 = this.userProfileExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(userProfileExtension2.getActiveUserProfile(serviceTransaction, cls), serviceTransaction, UserProfileApiKt.getPROFILE_API_GET_ACTIVE_PROFILE(), (Object) null, 4, (Object) null);
    }

    public <T extends UserProfile> Single<T> getUserProfile(String str, Class<T> cls) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        UserProfileExtension userProfileExtension2 = this.userProfileExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(userProfileExtension2.getUserProfile(serviceTransaction, str, cls), serviceTransaction, UserProfileApiKt.getPROFILE_API_GET_PROFILE(), (Object) null, 4, (Object) null);
    }

    public <T extends UserProfile> Single<List<T>> getUserProfiles(Class<? extends List<? extends T>> cls) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        UserProfileExtension userProfileExtension2 = this.userProfileExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(userProfileExtension2.getUserProfiles(serviceTransaction, cls), serviceTransaction, UserProfileApiKt.getPROFILE_API_GET_PROFILES(), (Object) null, 4, (Object) null);
    }

    public <T extends UserProfile> Single<T> updateUserProfile(T t, Class<T> cls) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        UserProfileExtension userProfileExtension2 = this.userProfileExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(userProfileExtension2.updateUserProfile(serviceTransaction, t, cls), serviceTransaction, UserProfileApiKt.getPROFILE_API_UPDATE_PROFILE(), (Object) null, 4, (Object) null);
    }
}
