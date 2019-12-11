package com.bamtech.sdk4.internal.service;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.LogLevel;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ>\u0010\u001d\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u0001H\u001f2\b\b\u0002\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&J#\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%H\u0001J>\u0010'\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u0001H\u001f2\b\b\u0002\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&J#\u0010'\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%H\u0001J/\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010$\u001a\u00020%H\u0001J>\u0010,\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u0001H\u001f2\b\b\u0002\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&J#\u0010,\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%H\u0001J!\u0010-\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u001f0/H\u0001JH\u0010-\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u0001H\u001f2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u00100J/\u00101\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010$\u001a\u00020%H\u0001J>\u00102\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u0001H\u001f2\b\b\u0002\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&J#\u00102\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%H\u0001J>\u00103\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u0001H\u001f2\b\b\u0002\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&J#\u00103\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%H\u0001J>\u00104\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u0001H\u001f2\b\b\u0002\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&J#\u00104\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%H\u0001R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/service/DebugServiceTransaction;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Lcom/bamtech/core/logging/LogDispatcher;", "client", "Lokhttp3/OkHttpClient;", "logger", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "baseData", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "(Lokhttp3/OkHttpClient;Lcom/bamtech/core/logging/LogDispatcher;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;)V", "getBaseData", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "getClient", "()Lokhttp3/OkHttpClient;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "identityConverter", "Lcom/bamtech/core/networking/converters/Converter;", "getIdentityConverter", "()Lcom/bamtech/core/networking/converters/Converter;", "source", "", "getSource", "()Ljava/lang/Throwable;", "startTime", "Lorg/joda/time/DateTime;", "d", "", "T", "", "name", "", "data", "isPublic", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Z)V", "e", "ex", "t", "logLevel", "Lcom/bamtech/core/logging/LogLevel;", "i", "log", "logEvent", "Lcom/bamtech/core/logging/LogEvent;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/core/logging/LogLevel;Z)V", "logException", "trace", "v", "w", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DebugServiceTransaction.kt */
public final class DebugServiceTransaction implements ServiceTransaction, LogDispatcher {
    private final /* synthetic */ LogDispatcher $$delegate_0;
    private final DustClientConstants baseData;
    private final OkHttpClient client;

    /* renamed from: id */
    private final UUID f6077id;
    private final Converter identityConverter;
    private final Throwable source = new RuntimeException();

    public DebugServiceTransaction(OkHttpClient okHttpClient, LogDispatcher logDispatcher, ConverterProvider converterProvider, DustClientConstants dustClientConstants) {
        this.$$delegate_0 = logDispatcher;
        this.client = okHttpClient;
        this.baseData = dustClientConstants;
        this.identityConverter = converterProvider.getIdentity();
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkReturnedValueIsNotNull((Object) randomUUID, "UUID.randomUUID()");
        this.f6077id = randomUUID;
        Intrinsics.checkReturnedValueIsNotNull((Object) DateTime.now(DateTimeZone.UTC), "DateTime.now(DateTimeZone.UTC)");
    }

    /* renamed from: d */
    public <T> void mo7349d(Object obj, String str, T t, boolean z) {
        this.$$delegate_0.mo7349d(obj, str, t, z);
    }

    /* renamed from: d */
    public void mo7350d(Object obj, String str, boolean z) {
        this.$$delegate_0.mo7350d(obj, str, z);
    }

    /* renamed from: ex */
    public void mo7351ex(Throwable th, String str, LogLevel logLevel, boolean z) {
        this.$$delegate_0.mo7351ex(th, str, logLevel, z);
    }

    public DustClientConstants getBaseData() {
        return this.baseData;
    }

    public OkHttpClient getClient() {
        return this.client;
    }

    public UUID getId() {
        return this.f6077id;
    }

    public Converter getIdentityConverter() {
        return this.identityConverter;
    }

    public Throwable getSource() {
        return this.source;
    }

    public <T> void log(LogEvent<T> logEvent) {
        this.$$delegate_0.log(logEvent);
    }

    public <T> void log(Object obj, String str, T t, LogLevel logLevel, boolean z) {
        this.$$delegate_0.log(obj, str, t, logLevel, z);
    }

    public void logDust(String str, String str2, LogLevel logLevel, boolean z) {
        DefaultImpls.logDust(this, str, str2, logLevel, z);
    }

    public void logException(Throwable th, String str, LogLevel logLevel, boolean z) {
        this.$$delegate_0.logException(th, str, logLevel, z);
    }

    /* renamed from: w */
    public void mo7355w(Object obj, String str, boolean z) {
        this.$$delegate_0.mo7355w(obj, str, z);
    }

    public <CLIENT> void logDust(String str, String str2, CLIENT client2, LogLevel logLevel, boolean z) {
        DefaultImpls.logDust(this, str, str2, client2, logLevel, z);
    }

    public <SERVER, CLIENT> void logDust(String str, String str2, CLIENT client2, SERVER server, LogLevel logLevel, boolean z) {
        DefaultImpls.logDust(this, str, str2, client2, server, logLevel, z);
    }
}
