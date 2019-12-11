package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.Services;
import com.bamtech.sdk4.internal.configuration.TelemetryBufferConfiguration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceExtras;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.BatchProcessingDelayed.DelayReason;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.service.ServerErrorException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11968q;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 E2\u00020\u0001:\u0002EFBu\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013\u0012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0002\b\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J6\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001b0*0)2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170,2\u0006\u0010-\u001a\u00020\u001bH\u0002J\u0015\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001bH\u0000¢\u0006\u0002\b1J\u0018\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u000205H\u0002J/\u00106\u001a\u00020/\"\u0010\b\u0000\u00107*\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003082\u0006\u00109\u001a\u0002H72\u0006\u0010:\u001a\u00020;H\u0016¢\u0006\u0002\u0010<J/\u0010=\u001a\b\u0012\u0004\u0012\u00020'0>\"\u0010\b\u0000\u00107*\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003082\u0006\u00109\u001a\u0002H7H\u0000¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\u0017H\u0016J!\u0010B\u001a\u00020C*\u00020\u00122\u000e\u00109\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000308H\u0000¢\u0006\u0002\bDR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0002\b\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer;", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "client", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClient;", "autoConnectCount", "", "storage", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryStorage;", "serviceExtras", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceExtras;", "Lkotlin/ExtensionFunctionType;", "configExtras", "Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;", "name", "", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/telemetry/TelemetryClient;ILcom/bamtech/sdk4/internal/telemetry/TelemetryStorage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "chain", "Lio/reactivex/Observable;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "getChain$sdk_core_api_release", "()Lio/reactivex/Observable;", "setChain$sdk_core_api_release", "(Lio/reactivex/Observable;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publisher", "Lio/reactivex/subjects/PublishSubject;", "replyAfterFallback", "", "dispatchRequest", "Lio/reactivex/Single;", "Lkotlin/Pair;", "batch", "", "request", "initialize", "", "reason", "initialize$sdk_core_api_release", "logError", "transaction", "e", "", "postEvent", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "event", "requestType", "Lcom/bamtech/sdk4/internal/telemetry/RequestType;", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;Lcom/bamtech/sdk4/internal/telemetry/RequestType;)V", "postFastEvent", "Lio/reactivex/Maybe;", "postFastEvent$sdk_core_api_release", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;)Lio/reactivex/Maybe;", "toString", "isFastTrack", "", "isFastTrack$sdk_core_api_release", "Companion", "TelemetryProcessingRequest", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryManager.kt */
public final class DustEventBuffer implements EventBuffer {
    public static final Companion Companion = new Companion(null);
    private final int autoConnectCount;
    private Observable<TelemetryProcessingRequest> chain;
    /* access modifiers changed from: private */
    public final TelemetryClient client;
    private CompositeDisposable compositeDisposable;
    /* access modifiers changed from: private */
    public final Function1<TelemetryServiceExtras, TelemetryBufferConfiguration> configExtras;
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final AtomicBoolean isProcessing;
    private final String name;
    /* access modifiers changed from: private */
    public PublishSubject<TelemetryProcessingRequest> publisher;
    /* access modifiers changed from: private */
    public long replyAfterFallback = 30;
    private final Function1<Services, TelemetryServiceExtras> serviceExtras;
    /* access modifiers changed from: private */
    public final TelemetryStorage storage;
    /* access modifiers changed from: private */
    public final AccessTokenProvider tokenProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jz\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$Companion;", "", "()V", "create", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "client", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClient;", "telemetryStorage", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryStorage;", "serviceExtras", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceExtras;", "Lkotlin/ExtensionFunctionType;", "configExtras", "Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;", "autoConnectCount", "", "name", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TelemetryManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ DustEventBuffer create$default(Companion companion, Provider provider, AccessTokenProvider accessTokenProvider, ConfigurationProvider configurationProvider, TelemetryClient telemetryClient, TelemetryStorage telemetryStorage, Function1 function1, Function1 function12, int i, String str, int i2, Object obj) {
            int i3 = i2;
            return companion.create(provider, accessTokenProvider, configurationProvider, telemetryClient, telemetryStorage, function1, function12, (i3 & 128) != 0 ? 1 : i, (i3 & 256) != 0 ? "" : str);
        }

        public final DustEventBuffer create(Provider<ServiceTransaction> provider, AccessTokenProvider accessTokenProvider, ConfigurationProvider configurationProvider, TelemetryClient telemetryClient, TelemetryStorage telemetryStorage, Function1<? super Services, TelemetryServiceExtras> function1, Function1<? super TelemetryServiceExtras, TelemetryBufferConfiguration> function12, int i, String str) {
            DustEventBuffer dustEventBuffer = new DustEventBuffer(provider, accessTokenProvider, configurationProvider, telemetryClient, i, telemetryStorage, function1, function12, str);
            return dustEventBuffer;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "", "()V", "isFastTrackRequest", "", "isOneOffRequest", "Error", "Initialize", "Iteration", "PostedEvent", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$PostedEvent;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$Iteration;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$Initialize;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$Error;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TelemetryManager.kt */
    public static abstract class TelemetryProcessingRequest {

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$Error;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "()V", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* compiled from: TelemetryManager.kt */
        public static final class Error extends TelemetryProcessingRequest {
            public Error() {
                super(null);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$Initialize;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "()V", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* compiled from: TelemetryManager.kt */
        public static final class Initialize extends TelemetryProcessingRequest {
            public Initialize() {
                super(null);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$Iteration;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "()V", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* compiled from: TelemetryManager.kt */
        public static final class Iteration extends TelemetryProcessingRequest {
            public Iteration() {
                super(null);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest$PostedEvent;", "Lcom/bamtech/sdk4/internal/telemetry/DustEventBuffer$TelemetryProcessingRequest;", "data", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "type", "Lcom/bamtech/sdk4/internal/telemetry/RequestType;", "fileName", "", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;Lcom/bamtech/sdk4/internal/telemetry/RequestType;Ljava/lang/String;)V", "getData", "()Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getType", "()Lcom/bamtech/sdk4/internal/telemetry/RequestType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* compiled from: TelemetryManager.kt */
        public static final class PostedEvent extends TelemetryProcessingRequest {
            private final TelemetryEvent<?, ?> data;
            private String fileName;
            private final RequestType type;

            public PostedEvent(TelemetryEvent<?, ?> telemetryEvent, RequestType requestType, String str) {
                super(null);
                this.data = telemetryEvent;
                this.type = requestType;
                this.fileName = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.fileName, (java.lang.Object) r3.fileName) != false) goto L_0x0029;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0029
                    boolean r0 = r3 instanceof com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.PostedEvent
                    if (r0 == 0) goto L_0x0027
                    com.bamtech.sdk4.internal.telemetry.DustEventBuffer$TelemetryProcessingRequest$PostedEvent r3 = (com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.PostedEvent) r3
                    com.bamtech.sdk4.internal.telemetry.TelemetryEvent<?, ?> r0 = r2.data
                    com.bamtech.sdk4.internal.telemetry.TelemetryEvent<?, ?> r1 = r3.data
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L_0x0027
                    com.bamtech.sdk4.internal.telemetry.RequestType r0 = r2.type
                    com.bamtech.sdk4.internal.telemetry.RequestType r1 = r3.type
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L_0x0027
                    java.lang.String r0 = r2.fileName
                    java.lang.String r3 = r3.fileName
                    boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                    if (r3 == 0) goto L_0x0027
                    goto L_0x0029
                L_0x0027:
                    r3 = 0
                    return r3
                L_0x0029:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.telemetry.DustEventBuffer.TelemetryProcessingRequest.PostedEvent.equals(java.lang.Object):boolean");
            }

            public final String getFileName() {
                return this.fileName;
            }

            public final RequestType getType() {
                return this.type;
            }

            public int hashCode() {
                TelemetryEvent<?, ?> telemetryEvent = this.data;
                int i = 0;
                int hashCode = (telemetryEvent != null ? telemetryEvent.hashCode() : 0) * 31;
                RequestType requestType = this.type;
                int hashCode2 = (hashCode + (requestType != null ? requestType.hashCode() : 0)) * 31;
                String str = this.fileName;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode2 + i;
            }

            public final void setFileName(String str) {
                this.fileName = str;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PostedEvent(data=");
                sb.append(this.data);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", fileName=");
                sb.append(this.fileName);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ PostedEvent(TelemetryEvent telemetryEvent, RequestType requestType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 2) != 0) {
                    requestType = RequestType.SequenceRequest;
                }
                if ((i & 4) != 0) {
                    str = null;
                }
                this(telemetryEvent, requestType, str);
            }
        }

        private TelemetryProcessingRequest() {
        }

        public final boolean isFastTrackRequest() {
            return (this instanceof PostedEvent) && ((PostedEvent) this).getType() == RequestType.FastTrackRequest;
        }

        public final boolean isOneOffRequest() {
            return (this instanceof PostedEvent) && ((PostedEvent) this).getType() == RequestType.OneOffRequest;
        }

        public /* synthetic */ TelemetryProcessingRequest(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DustEventBuffer(Provider<ServiceTransaction> provider, AccessTokenProvider accessTokenProvider, ConfigurationProvider configurationProvider2, TelemetryClient telemetryClient, int i, TelemetryStorage telemetryStorage, Function1<? super Services, TelemetryServiceExtras> function1, Function1<? super TelemetryServiceExtras, TelemetryBufferConfiguration> function12, String str) {
        this.transactionProvider = provider;
        this.tokenProvider = accessTokenProvider;
        this.configurationProvider = configurationProvider2;
        this.client = telemetryClient;
        this.autoConnectCount = i;
        this.storage = telemetryStorage;
        this.serviceExtras = function1;
        this.configExtras = function12;
        this.name = str;
        PublishSubject<TelemetryProcessingRequest> q = PublishSubject.m38553q();
        Intrinsics.checkReturnedValueIsNotNull((Object) q, "PublishSubject.create<Te…metryProcessingRequest>()");
        this.publisher = q;
        this.isProcessing = new AtomicBoolean(false);
        this.compositeDisposable = new CompositeDisposable();
    }

    /* access modifiers changed from: private */
    public final Single<Pair<Long, TelemetryProcessingRequest>> dispatchRequest(Map<String, String> map, TelemetryProcessingRequest telemetryProcessingRequest) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        AccessTokenProvider accessTokenProvider = this.tokenProvider;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        Single<Pair<Long, TelemetryProcessingRequest>> i = accessTokenProvider.getStoredAccessToken(serviceTransaction).mo30116b((Consumer<? super Disposable>) new DustEventBuffer$dispatchRequest$1<Object>(this, serviceTransaction, map)).mo30128d(new DustEventBuffer$dispatchRequest$2(this, map, serviceTransaction)).mo30227d((Consumer<? super T>) new DustEventBuffer$dispatchRequest$3<Object>(this, serviceTransaction, map)).mo30233g(new DustEventBuffer$dispatchRequest$4(telemetryProcessingRequest)).mo30237i(new DustEventBuffer$dispatchRequest$5(this, serviceTransaction, telemetryProcessingRequest, map));
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "tokenProvider.getStoredA…equest)\n                }");
        return i;
    }

    /* access modifiers changed from: private */
    public final void logError(ServiceTransaction serviceTransaction, Throwable th) {
        DefaultImpls.ex$default(serviceTransaction, th, null, null, false, 14, null);
        if (!(th instanceof TelemetryClientException) || (th.getCause() instanceof ServerErrorException)) {
            BatchProcessingDelayed batchProcessingDelayed = new BatchProcessingDelayed(this, this.storage.getSize(), this.replyAfterFallback, DelayReason.FALLBACK);
            serviceTransaction.log(batchProcessingDelayed);
            return;
        }
        TelemetryResponse telemetryResponse = ((TelemetryClientException) th).getTelemetryResponse();
        if (telemetryResponse != null) {
            Long replyAfter = telemetryResponse.getReplyAfter();
            if (replyAfter != null) {
                BatchProcessingDelayed batchProcessingDelayed2 = new BatchProcessingDelayed(this, this.storage.getSize(), replyAfter.longValue(), DelayReason.HEADER_DIRECTIVE);
                serviceTransaction.log(batchProcessingDelayed2);
                return;
            }
        }
        BatchProcessingDelayed batchProcessingDelayed3 = new BatchProcessingDelayed(this, this.storage.getSize(), this.replyAfterFallback, DelayReason.FALLBACK);
        serviceTransaction.log(batchProcessingDelayed3);
    }

    public final Observable<TelemetryProcessingRequest> getChain$sdk_core_api_release() {
        return this.chain;
    }

    public final void initialize$sdk_core_api_release(TelemetryProcessingRequest telemetryProcessingRequest) {
        PublishSubject<TelemetryProcessingRequest> q = PublishSubject.m38553q();
        Intrinsics.checkReturnedValueIsNotNull((Object) q, "PublishSubject.create<Te…metryProcessingRequest>()");
        this.publisher = q;
        this.chain = this.publisher.mo30195h().mo30189e((Function<? super T, ? extends MaybeSource<? extends R>>) new DustEventBuffer$initialize$1<Object,Object>(this, (ServiceTransaction) this.transactionProvider.get())).mo30150a((C11952h<? super T>) new DustEventBuffer$initialize$2<Object>(this)).mo30150a((C11952h<? super T>) new DustEventBuffer$initialize$3<Object>(this)).mo30193g(new DustEventBuffer$initialize$4(this)).mo30191f((Function<? super T, ? extends SingleSource<? extends R>>) new DustEventBuffer$initialize$5<Object,Object>(this)).mo30178c((Function<? super T, ? extends ObservableSource<? extends R>>) new DustEventBuffer$initialize$6<Object,Object>(this)).mo30193g(DustEventBuffer$initialize$7.INSTANCE).mo30198i(DustEventBuffer$initialize$8.INSTANCE).mo30184d((Consumer<? super T>) new DustEventBuffer$initialize$9<Object>(this)).mo30148a((C11945a) new DustEventBuffer$initialize$10(this)).mo30194g().mo30683c(this.autoConnectCount);
        Observable<TelemetryProcessingRequest> observable = this.chain;
        if (observable != null) {
            observable.mo30162a((C11968q<? super T>) this.publisher);
        }
        this.publisher.onNext(telemetryProcessingRequest);
    }

    public final boolean isFastTrack$sdk_core_api_release(TelemetryServiceExtras telemetryServiceExtras, TelemetryEvent<?, ?> telemetryEvent) {
        List urns = telemetryServiceExtras.getFastTrack().getUrns();
        TelemetryClientPayload client2 = telemetryEvent.getClient();
        String str = null;
        if (!(client2 instanceof TelemetryClientPayload)) {
            client2 = null;
        }
        if (client2 != null) {
            str = client2.getEvent();
        }
        return C13199w.m40564a((Iterable) urns, (Object) str);
    }

    public <T extends TelemetryEvent<?, ?>> void postEvent(T t, RequestType requestType) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        ConfigurationProvider configurationProvider2 = this.configurationProvider;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        Disposable a = configurationProvider2.getServiceConfigurationExtras(serviceTransaction, this.serviceExtras).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new DustEventBuffer$postEvent$disposable$1<Object,Object>(this, serviceTransaction, t, requestType)).mo30111a((Consumer<? super T>) DustEventBuffer$postEvent$disposable$2.INSTANCE, (Consumer<? super Throwable>) new DustEventBuffer$postEvent$disposable$3<Object>(this, serviceTransaction), (C11945a) DustEventBuffer$postEvent$disposable$4.INSTANCE);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "configurationProvider.ge… }, {\n\n                })");
        this.compositeDisposable.mo30250b(a);
    }

    public final <T extends TelemetryEvent<?, ?>> Maybe<Long> postFastEvent$sdk_core_api_release(T t) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        AccessTokenProvider accessTokenProvider = this.tokenProvider;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        Maybe<Long> c = accessTokenProvider.getStoredAccessToken(serviceTransaction).mo30128d(new DustEventBuffer$postFastEvent$1(this, serviceTransaction, t)).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new DustEventBuffer$postFastEvent$2<Object,Object>(this)).mo30102a((Consumer<? super Throwable>) new DustEventBuffer$postFastEvent$3<Object>(this, serviceTransaction, t)).mo30123c((Consumer<? super T>) new DustEventBuffer$postFastEvent$4<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "tokenProvider.getStoredA…tion())\n                }");
        return c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(" - ");
        sb.append(super.toString());
        return sb.toString();
    }
}
