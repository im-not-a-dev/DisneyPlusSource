package com.bamtech.sdk4.internal.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001Jc\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u0002H\u00062\u0006\u0010\u000f\u001a\u0002H\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011H&¢\u0006\u0002\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0016\u001a\u00020\u000bH&J>\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0011H&JB\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0011H&JJ\u0010\u0019\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00040\u001a0\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00040\u001a0\u0011H&J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0016\u001a\u00020\u000bH&J9\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u001e\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u001f¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/UserProfileClient;", "", "createUserProfile", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "U", "V", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "profileName", "attributes", "metadata", "type", "Ljava/lang/Class;", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Lio/reactivex/Single;", "deleteUserProfile", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "profileId", "getActiveUserProfile", "getUserProfile", "getUserProfiles", "", "setActiveUserProfile", "updateUserProfile", "", "userProfile", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Lcom/bamtech/sdk4/account/UserProfile;)Lio/reactivex/Single;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
public interface UserProfileClient {
    <T extends UserProfile, U, V> Single<T> createUserProfile(ServiceTransaction serviceTransaction, String str, String str2, U u, V v, Class<T> cls);

    Maybe<CreateAccountGrantResponse> deleteUserProfile(ServiceTransaction serviceTransaction, String str, String str2);

    <T extends UserProfile> Single<? extends T> getActiveUserProfile(ServiceTransaction serviceTransaction, String str, Class<? extends T> cls);

    <T extends UserProfile> Single<T> getUserProfile(ServiceTransaction serviceTransaction, String str, String str2, Class<T> cls);

    <T extends UserProfile> Single<? extends List<T>> getUserProfiles(ServiceTransaction serviceTransaction, String str, Class<? extends List<? extends T>> cls);

    Single<CreateAccountGrantResponse> setActiveUserProfile(ServiceTransaction serviceTransaction, String str, String str2);

    <T extends UserProfile> Single<Boolean> updateUserProfile(ServiceTransaction serviceTransaction, String str, T t);
}
