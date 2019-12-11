package com.bamtech.sdk4.account;

import com.bamtech.sdk4.plugin.PluginApi;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JU\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u0001H\u00062\b\u0010\u000b\u001a\u0004\u0018\u0001H\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\rH'¢\u0006\u0002\u0010\u000eJ>\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H'J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\rH'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0017\u001a\u00020\tH'J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\rH'J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00190\u0003H'J4\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00190\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00190\rH'J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H'J3\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0014\u001a\u0002H\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\rH'¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0014\u001a\u00020\u000fH'¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/UserProfileApi;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "createUserProfile", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "U", "V", "profileName", "", "attributes", "metadata", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Lio/reactivex/Single;", "Lcom/bamtech/sdk4/account/DefaultUserProfile;", "", "", "deleteUserProfile", "Lio/reactivex/Completable;", "profile", "getActiveUserProfile", "getUserProfile", "profileId", "getUserProfiles", "", "setActiveUserProfile", "updateUserProfile", "(Lcom/bamtech/sdk4/account/UserProfile;Ljava/lang/Class;)Lio/reactivex/Single;", "plugin-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileApi.kt */
public interface UserProfileApi extends PluginApi {
    Single<DefaultUserProfile> createUserProfile(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2);

    Completable deleteUserProfile(UserProfile userProfile);

    Single<DefaultUserProfile> getActiveUserProfile();

    Single<DefaultUserProfile> getUserProfile(String str);

    Single<List<DefaultUserProfile>> getUserProfiles();

    Completable setActiveUserProfile(UserProfile userProfile);

    Single<DefaultUserProfile> updateUserProfile(DefaultUserProfile defaultUserProfile);
}
