package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.account.UserProfileClient;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.internal.token.AccountTokenExchangeProvider;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ[\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\b\b\u0000\u0010\u0012*\u00020\u0013\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u0001H\u00142\b\u0010\u001b\u001a\u0004\u0018\u0001H\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0013H\u0016J.\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001dH\u0016J6\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001dH\u0016J<\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120&0\u0011\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u001c\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00120&0\u001dH\u0016J\u0018\u0010'\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0013H\u0016J;\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010!\u001a\u0002H\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001dH\u0016¢\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo31007d2 = {"Lcom/bamtech/sdk4/extension/account/DefaultUserProfileExtension;", "Lcom/bamtech/sdk4/extension/account/UserProfileExtension;", "client", "Lcom/bamtech/sdk4/internal/account/UserProfileClient;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "tokenExchangeProvider", "Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;", "updater", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "profileEventNotifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/UserProfileEvent;", "sessionTransformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "(Lcom/bamtech/sdk4/internal/account/UserProfileClient;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;Lio/reactivex/subjects/PublishSubject;Lcom/bamtech/sdk4/session/RenewSessionTransformers;)V", "createUserProfile", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "U", "V", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "profileName", "", "attributes", "metadata", "type", "Ljava/lang/Class;", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Lio/reactivex/Single;", "deleteUserProfile", "Lio/reactivex/Completable;", "profile", "getActiveUserProfile", "getUserProfile", "profileId", "getUserProfiles", "", "setActiveUserProfile", "updateUserProfile", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/account/UserProfile;Ljava/lang/Class;)Lio/reactivex/Single;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileExtension.kt */
public final class DefaultUserProfileExtension implements UserProfileExtension {
    /* access modifiers changed from: private */
    public final UserProfileClient client;
    /* access modifiers changed from: private */
    public final PublishSubject<UserProfileEvent> profileEventNotifier;
    private final RenewSessionTransformers sessionTransformers;
    /* access modifiers changed from: private */
    public final AccountTokenExchangeProvider tokenExchangeProvider;
    private final AccessTokenProvider tokenProvider;
    /* access modifiers changed from: private */
    public final AccessContextUpdater updater;

    public DefaultUserProfileExtension(UserProfileClient userProfileClient, AccessTokenProvider accessTokenProvider, AccountTokenExchangeProvider accountTokenExchangeProvider, AccessContextUpdater accessContextUpdater, PublishSubject<UserProfileEvent> publishSubject, RenewSessionTransformers renewSessionTransformers) {
        this.client = userProfileClient;
        this.tokenProvider = accessTokenProvider;
        this.tokenExchangeProvider = accountTokenExchangeProvider;
        this.updater = accessContextUpdater;
        this.profileEventNotifier = publishSubject;
        this.sessionTransformers = renewSessionTransformers;
    }

    public <T extends UserProfile, U, V> Single<T> createUserProfile(ServiceTransaction serviceTransaction, String str, U u, V v, Class<T> cls) {
        Single accessToken = this.tokenProvider.getAccessToken(serviceTransaction);
        DefaultUserProfileExtension$createUserProfile$1 defaultUserProfileExtension$createUserProfile$1 = new DefaultUserProfileExtension$createUserProfile$1(this, serviceTransaction, str, u, v, cls);
        Single<T> a = accessToken.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultUserProfileExtension$createUserProfile$1).mo30206a(this.sessionTransformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }

    public Completable deleteUserProfile(ServiceTransaction serviceTransaction, UserProfile userProfile) {
        Completable a = this.tokenProvider.getAccessToken(serviceTransaction).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new DefaultUserProfileExtension$deleteUserProfile$1<Object,Object>(this, serviceTransaction, userProfile)).mo30117b((C11945a) new DefaultUserProfileExtension$deleteUserProfile$2(this, userProfile)).mo30114b((Function<? super T, ? extends CompletableSource>) new DefaultUserProfileExtension$deleteUserProfile$3<Object,Object>(this, serviceTransaction)).mo30035a(this.sessionTransformers.completableRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }

    public <T extends UserProfile> Single<T> getActiveUserProfile(ServiceTransaction serviceTransaction, Class<T> cls) {
        Single<T> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileExtension$getActiveUserProfile$1<Object,Object>(this, serviceTransaction, cls)).mo30206a(this.sessionTransformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }

    public <T extends UserProfile> Single<T> getUserProfile(ServiceTransaction serviceTransaction, String str, Class<T> cls) {
        Single<T> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileExtension$getUserProfile$1<Object,Object>(this, serviceTransaction, str, cls)).mo30206a(this.sessionTransformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }

    public <T extends UserProfile> Single<List<T>> getUserProfiles(ServiceTransaction serviceTransaction, Class<? extends List<? extends T>> cls) {
        Single<List<T>> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileExtension$getUserProfiles$1<Object,Object>(this, serviceTransaction, cls)).mo30206a(this.sessionTransformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }

    public Completable setActiveUserProfile(ServiceTransaction serviceTransaction, UserProfile userProfile) {
        Completable a = this.tokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileExtension$setActiveUserProfile$1<Object,Object>(this, serviceTransaction, userProfile)).mo30227d((Consumer<? super T>) new DefaultUserProfileExtension$setActiveUserProfile$2<Object>(this, userProfile)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileExtension$setActiveUserProfile$3<Object,Object>(this, serviceTransaction)).mo30228e().mo30035a(this.sessionTransformers.completableRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }

    public <T extends UserProfile> Single<T> updateUserProfile(ServiceTransaction serviceTransaction, T t, Class<T> cls) {
        Single<T> a = this.tokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileExtension$updateUserProfile$1<Object,Object>(this, serviceTransaction, t)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileExtension$updateUserProfile$2<Object,Object>(this, serviceTransaction)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileExtension$updateUserProfile$3<Object,Object>(this, serviceTransaction, t, cls)).mo30206a(this.sessionTransformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }
}
