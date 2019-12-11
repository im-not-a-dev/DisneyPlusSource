package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J[\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00062\b\u0010\r\u001a\u0004\u0018\u0001H\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000fH&¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005H&J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000fH&J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000fH&J<\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00180\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00180\u000fH&J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005H&J;\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u0002H\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000fH&¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/extension/account/UserProfileExtension;", "", "createUserProfile", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "U", "V", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "profileName", "", "attributes", "metadata", "type", "Ljava/lang/Class;", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Lio/reactivex/Single;", "deleteUserProfile", "Lio/reactivex/Completable;", "profile", "getActiveUserProfile", "getUserProfile", "profileId", "getUserProfiles", "", "setActiveUserProfile", "updateUserProfile", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/account/UserProfile;Ljava/lang/Class;)Lio/reactivex/Single;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
public interface UserProfileExtension {
    <T extends UserProfile, U, V> Single<T> createUserProfile(ServiceTransaction serviceTransaction, String str, U u, V v, Class<T> cls);

    Completable deleteUserProfile(ServiceTransaction serviceTransaction, UserProfile userProfile);

    <T extends UserProfile> Single<T> getActiveUserProfile(ServiceTransaction serviceTransaction, Class<T> cls);

    <T extends UserProfile> Single<T> getUserProfile(ServiceTransaction serviceTransaction, String str, Class<T> cls);

    <T extends UserProfile> Single<List<T>> getUserProfiles(ServiceTransaction serviceTransaction, Class<? extends List<? extends T>> cls);

    Completable setActiveUserProfile(ServiceTransaction serviceTransaction, UserProfile userProfile);

    <T extends UserProfile> Single<T> updateUserProfile(ServiceTransaction serviceTransaction, T t, Class<T> cls);
}
