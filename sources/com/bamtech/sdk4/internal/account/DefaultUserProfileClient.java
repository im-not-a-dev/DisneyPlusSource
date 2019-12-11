package com.bamtech.sdk4.internal.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.account.UserProfile;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJc\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\b\b\u0000\u0010\f*\u00020\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u0002H\u000e2\u0006\u0010\u0017\u001a\u0002H\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\f0\u0019H\u0016¢\u0006\u0002\u0010\u001aJ*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J>\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u000b\"\b\b\u0000\u0010\f*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u0019H\u0016JB\u0010 \u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\b\b\u0000\u0010\f*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u001e\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\f0\u0019H\u0016JJ\u0010!\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\f0\"0\u000b\"\b\b\u0000\u0010\f*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0014\u0010\u0018\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\f0\"0\u0019H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0$2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0$2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0007H\u0002J4\u0010&\u001a\b\u0012\u0004\u0012\u0002H\f0$\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00072\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u0019H\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J9\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u000b\"\b\b\u0000\u0010\f*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010+\u001a\u0002H\fH\u0016¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/DefaultUserProfileClient;", "Lcom/bamtech/sdk4/internal/account/UserProfileClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "customConverter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/core/networking/converters/Converter;)V", "converter", "createUserProfile", "Lio/reactivex/Single;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "U", "V", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "profileName", "attributes", "metadata", "type", "Ljava/lang/Class;", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Lio/reactivex/Single;", "deleteUserProfile", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "profileId", "getActiveUserProfile", "getUserProfile", "getUserProfiles", "", "grantResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "profileUpdateResponseHandler", "profilesResponseHandler", "refreshHeaderHandler", "", "setActiveUserProfile", "updateUserProfile", "userProfile", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Lcom/bamtech/sdk4/account/UserProfile;)Lio/reactivex/Single;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfileClient.kt */
public final class DefaultUserProfileClient implements UserProfileClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final Converter converter;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;
    private final Converter customConverter;

    public DefaultUserProfileClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider, Converter converter2) {
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
        this.customConverter = converter2;
        Converter converter3 = this.customConverter;
        if (converter3 == null) {
            converter3 = this.converters.getIdentity();
        }
        this.converter = converter3;
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<CreateAccountGrantResponse> grantResponseHandler(ServiceTransaction serviceTransaction) {
        return new DefaultUserProfileClient$grantResponseHandler$1(this, serviceTransaction);
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<CreateAccountGrantResponse> profileUpdateResponseHandler(ServiceTransaction serviceTransaction, Converter converter2) {
        return new DefaultUserProfileClient$profileUpdateResponseHandler$1(converter2, serviceTransaction);
    }

    /* access modifiers changed from: private */
    public final <T> ResponseHandler<T> profilesResponseHandler(ServiceTransaction serviceTransaction, Converter converter2, Class<? extends T> cls) {
        return new DefaultUserProfileClient$profilesResponseHandler$1(converter2, cls, serviceTransaction);
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<Boolean> refreshHeaderHandler(ServiceTransaction serviceTransaction) {
        return new DefaultUserProfileClient$refreshHeaderHandler$1(serviceTransaction);
    }

    public <T extends UserProfile, U, V> Single<T> createUserProfile(ServiceTransaction serviceTransaction, String str, String str2, U u, V v, Class<T> cls) {
        ServiceTransaction serviceTransaction2 = serviceTransaction;
        Single serviceLink = this.configurationProvider.getServiceLink(serviceTransaction, DefaultUserProfileClient$createUserProfile$1.INSTANCE);
        DefaultUserProfileClient$createUserProfile$2 defaultUserProfileClient$createUserProfile$2 = new DefaultUserProfileClient$createUserProfile$2(this, str2, u, v, str, serviceTransaction2, cls);
        Single<T> a = serviceLink.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultUserProfileClient$createUserProfile$2);
        if (a != null) {
            return a;
        }
        throw new C13142s("null cannot be cast to non-null type io.reactivex.Single<T>");
    }

    public Maybe<CreateAccountGrantResponse> deleteUserProfile(ServiceTransaction serviceTransaction, String str, String str2) {
        Maybe<CreateAccountGrantResponse> c = this.configurationProvider.getServiceLink(serviceTransaction, DefaultUserProfileClient$deleteUserProfile$1.INSTANCE).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new DefaultUserProfileClient$deleteUserProfile$2<Object,Object>(this, str, str2, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "configurationProvider.ge…DELETE)\n                }");
        return c;
    }

    public <T extends UserProfile> Single<? extends T> getActiveUserProfile(ServiceTransaction serviceTransaction, String str, Class<? extends T> cls) {
        Single<? extends T> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultUserProfileClient$getActiveUserProfile$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileClient$getActiveUserProfile$2<Object,Object>(this, str, serviceTransaction, cls));
        if (a != null) {
            return a;
        }
        throw new C13142s("null cannot be cast to non-null type io.reactivex.Single<out T>");
    }

    public <T extends UserProfile> Single<T> getUserProfile(ServiceTransaction serviceTransaction, String str, String str2, Class<T> cls) {
        Single serviceLink = this.configurationProvider.getServiceLink(serviceTransaction, DefaultUserProfileClient$getUserProfile$1.INSTANCE);
        DefaultUserProfileClient$getUserProfile$2 defaultUserProfileClient$getUserProfile$2 = new DefaultUserProfileClient$getUserProfile$2(this, str, str2, serviceTransaction, cls);
        Single<T> a = serviceLink.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultUserProfileClient$getUserProfile$2);
        if (a != null) {
            return a;
        }
        throw new C13142s("null cannot be cast to non-null type io.reactivex.Single<T>");
    }

    public <T extends UserProfile> Single<? extends List<T>> getUserProfiles(ServiceTransaction serviceTransaction, String str, Class<? extends List<? extends T>> cls) {
        Single<? extends List<T>> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultUserProfileClient$getUserProfiles$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileClient$getUserProfiles$2<Object,Object>(this, str, serviceTransaction, cls));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "configurationProvider.ge…LTIPLE)\n                }");
        return a;
    }

    public Single<CreateAccountGrantResponse> setActiveUserProfile(ServiceTransaction serviceTransaction, String str, String str2) {
        Single<CreateAccountGrantResponse> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultUserProfileClient$setActiveUserProfile$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileClient$setActiveUserProfile$2<Object,Object>(this, str, str2, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "configurationProvider.ge…ACTIVE)\n                }");
        return a;
    }

    public <T extends UserProfile> Single<Boolean> updateUserProfile(ServiceTransaction serviceTransaction, String str, T t) {
        Single<Boolean> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultUserProfileClient$updateUserProfile$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultUserProfileClient$updateUserProfile$2<Object,Object>(this, str, t, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "configurationProvider.ge…UPDATE)\n                }");
        return a;
    }

    public /* synthetic */ DefaultUserProfileClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider, Converter converter2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            converter2 = null;
        }
        this(configurationProvider2, converterProvider, converter2);
    }
}
