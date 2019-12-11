package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J,\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J,\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J,\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultPasswordClient;", "Lcom/bamtech/sdk4/internal/identity/bam/PasswordClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "changeEmail", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/identity/bam/ChangeEmailRequest;", "tokenMap", "", "", "changePassword", "Lcom/bamtech/sdk4/internal/identity/bam/ChangePasswordRequest;", "passwordReset", "Lcom/bamtech/sdk4/internal/identity/bam/ResetPasswordRequest;", "requestPasswordReset", "Lcom/bamtech/sdk4/internal/identity/bam/StartResetPasswordRequest;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PasswordClient.kt */
public final class DefaultPasswordClient implements PasswordClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;

    public DefaultPasswordClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider) {
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
    }

    public Completable changeEmail(ServiceTransaction serviceTransaction, ChangeEmailRequest changeEmailRequest, Map<String, String> map) {
        Completable b = this.configurationProvider.getServiceLink(serviceTransaction, DefaultPasswordClient$changeEmail$1.INSTANCE).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultPasswordClient$changeEmail$2<Object,Object>(this, map, serviceTransaction, changeEmailRequest));
        C12880j.m40222a((Object) b, "configurationProvider.ge…_EMAIL)\n                }");
        return b;
    }

    public Completable changePassword(ServiceTransaction serviceTransaction, ChangePasswordRequest changePasswordRequest, Map<String, String> map) {
        Completable b = this.configurationProvider.getServiceLink(serviceTransaction, DefaultPasswordClient$changePassword$1$1.INSTANCE).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultPasswordClient$changePassword$$inlined$with$lambda$1<Object,Object>(this, serviceTransaction, map, changePasswordRequest));
        C12880j.m40222a((Object) b, "configurationProvider.ge…RD)\n                    }");
        return b;
    }
}
