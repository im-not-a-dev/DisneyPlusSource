package com.bamtech.sdk4.internal.service;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.core.logging.LogLevel;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.telemetry.dust.DefaultDustClientData;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.telemetry.dust.DustEvent;
import java.util.UUID;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import p520io.reactivex.C11914c;
import p520io.reactivex.Completable;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JQ\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u0001H\u00192\b\u0010\u001e\u001a\u0004\u0018\u0001H\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0016¢\u0006\u0002\u0010#JA\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u0001H\u00192\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0016¢\u0006\u0002\u0010$J,\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0016JD\u0010%\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0019\"\u0004\b\u0001\u0010\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010&\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u00190'2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Lcom/bamtech/core/logging/LogDispatcher;", "baseData", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "getBaseData", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "identityConverter", "Lcom/bamtech/core/networking/converters/Converter;", "getIdentityConverter", "()Lcom/bamtech/core/networking/converters/Converter;", "source", "", "getSource", "()Ljava/lang/Throwable;", "logDust", "", "SERVER", "CLIENT", "event", "", "category", "clientData", "serverData", "logLevel", "Lcom/bamtech/core/logging/LogLevel;", "isPublic", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/bamtech/core/logging/LogLevel;Z)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/core/logging/LogLevel;Z)V", "logDustEvent", "payload", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustEvent;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceTransaction.kt */
public interface ServiceTransaction extends LogDispatcher {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceTransaction.kt */
    public static final class DefaultImpls {
        public static <SERVER, CLIENT> void logDust(ServiceTransaction serviceTransaction, String str, String str2, CLIENT client, SERVER server, LogLevel logLevel, boolean z) {
            DefaultDustClientData defaultDustClientData = new DefaultDustClientData(serviceTransaction.getId(), str, str2, client, serviceTransaction.getBaseData());
            logDustEvent(serviceTransaction, str, new DustEvent(server, defaultDustClientData), logLevel, z);
        }

        public static /* synthetic */ void logDust$default(ServiceTransaction serviceTransaction, String str, String str2, Object obj, Object obj2, LogLevel logLevel, boolean z, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 16) != 0) {
                    logLevel = LogLevel.DEBUG;
                }
                serviceTransaction.logDust(str, str2, obj, obj2, logLevel, (i & 32) != 0 ? false : z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDust");
        }

        private static <CLIENT, SERVER> void logDustEvent(ServiceTransaction serviceTransaction, String str, DustEvent<? extends SERVER, ? extends CLIENT> dustEvent, LogLevel logLevel, boolean z) {
            ServiceTransaction$logDustEvent$1 serviceTransaction$logDustEvent$1 = new ServiceTransaction$logDustEvent$1(serviceTransaction, str, dustEvent, logLevel, z);
            Completable.m38151a((C11914c) serviceTransaction$logDustEvent$1).mo30051b(C11934b.m38498a()).mo30055f().mo30056g();
        }

        public static /* synthetic */ void logDust$default(ServiceTransaction serviceTransaction, String str, String str2, Object obj, LogLevel logLevel, boolean z, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 8) != 0) {
                    logLevel = LogLevel.DEBUG;
                }
                serviceTransaction.logDust(str, str2, obj, logLevel, (i & 16) != 0 ? false : z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDust");
        }

        public static /* synthetic */ void logDust$default(ServiceTransaction serviceTransaction, String str, String str2, LogLevel logLevel, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    logLevel = LogLevel.DEBUG;
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                serviceTransaction.logDust(str, str2, logLevel, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDust");
        }

        public static <CLIENT> void logDust(ServiceTransaction serviceTransaction, String str, String str2, CLIENT client, LogLevel logLevel, boolean z) {
            DefaultDustClientData defaultDustClientData = new DefaultDustClientData(serviceTransaction.getId(), str, str2, client, serviceTransaction.getBaseData());
            logDustEvent(serviceTransaction, str, new DustEvent(null, defaultDustClientData), logLevel, z);
        }

        public static void logDust(ServiceTransaction serviceTransaction, String str, String str2, LogLevel logLevel, boolean z) {
            DefaultDustClientData defaultDustClientData = new DefaultDustClientData(serviceTransaction.getId(), str, str2, null, serviceTransaction.getBaseData());
            logDustEvent(serviceTransaction, str, new DustEvent(null, defaultDustClientData), logLevel, z);
        }
    }

    DustClientConstants getBaseData();

    OkHttpClient getClient();

    UUID getId();

    Converter getIdentityConverter();

    Throwable getSource();

    void logDust(String str, String str2, LogLevel logLevel, boolean z);

    <CLIENT> void logDust(String str, String str2, CLIENT client, LogLevel logLevel, boolean z);

    <SERVER, CLIENT> void logDust(String str, String str2, CLIENT client, SERVER server, LogLevel logLevel, boolean z);
}
