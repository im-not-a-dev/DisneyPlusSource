package com.bamtech.sdk4.android;

import android.app.Application;
import com.bamtech.sdk4.account.legacy.NullLegacyAccountExtension;
import com.bamtech.sdk4.account.legacy.NullLegacyContextExtension;
import com.bamtech.sdk4.configuration.Environment;
import com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder;
import com.bamtech.sdk4.internal.configuration.ConfigurationHostName;
import com.bamtech.sdk4.location.GeoProvider;
import com.bamtech.sdk4.location.NullGeoProvider;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginRegistry;
import java.io.File;
import java.net.Proxy;
import java.security.KeyStore;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import okhttp3.logging.HttpLoggingInterceptor.Level;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 B2\u00020\u0001:\u0001BB\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\nJ\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\nJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\nJ\u001a\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n02J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0000J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0006\u0010\u0013\u001a\u00020\u0000J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u001dJ\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010\nJ.\u0010<\u001a\u00020\u0000\"\b\b\u0000\u0010=*\u00020%2\u000e\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u0002H=0$2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010&H\u0007J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\b?J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0007J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R$\u0010#\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020%0$\u0012\u0006\u0012\u0004\u0018\u00010&0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, mo31007d2 = {"Lcom/bamtech/sdk4/android/Bootstrapper;", "", "application", "Landroid/app/Application;", "componentBuilder", "Lcom/bamtech/sdk4/internal/android/AndroidSdkComponentBuilder;", "mediaCapabilitiesProvider", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "(Landroid/app/Application;Lcom/bamtech/sdk4/internal/android/AndroidSdkComponentBuilder;Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;)V", "apiKeyOverride", "", "clientIdOverride", "configHostName", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "correlationIds", "", "debugEnabled", "", "disableNetworkCache", "disableNetworkSecurity", "enableDebugLogging", "environment", "Lcom/bamtech/sdk4/configuration/Environment;", "file", "geoProvider", "Lcom/bamtech/sdk4/location/GeoProvider;", "keyStore", "Ljava/security/KeyStore;", "loggingLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "mockBaseUrl", "networkCacheDirectory", "Ljava/io/File;", "networkCacheSizeInBytes", "", "plugins", "Ljava/lang/Class;", "Lcom/bamtech/sdk4/plugin/Plugin;", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "properties", "Ljava/util/Properties;", "proxy", "Ljava/net/Proxy;", "apiKey", "bootstrap", "Lcom/bamtech/sdk4/Session;", "clientId", "correlationId", "key", "value", "", "disableDebugLogging", "disableLogging", "ensureExtensionsHaveImplementations", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "httpLoggingLevel", "level", "mockUrl", "plugin", "PLUGIN", "extra", "properties$sdk_release", "setNetworkCacheDirectory", "setNetworkCacheSizeInBytes", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Bootstrapper.kt */
public final class Bootstrapper {
    private String apiKeyOverride;
    private final Application application;
    private String clientIdOverride;
    private final AndroidSdkComponentBuilder componentBuilder;
    private ConfigurationHostName configHostName;
    private Map<String, String> correlationIds = new LinkedHashMap();
    private boolean debugEnabled;
    private boolean disableNetworkCache;
    private boolean disableNetworkSecurity;
    private boolean enableDebugLogging = true;
    private Environment environment;
    private String file = "bam-sdk.properties";
    private GeoProvider geoProvider = NullGeoProvider.INSTANCE;
    private KeyStore keyStore;
    private Level loggingLevel = Level.NONE;
    private final MediaCapabilitiesProvider mediaCapabilitiesProvider;
    private String mockBaseUrl;
    private File networkCacheDirectory;
    private long networkCacheSizeInBytes = 52428800;
    private final Map<Class<? extends Plugin>, PluginExtra> plugins = new LinkedHashMap();
    private Properties properties;
    private Proxy proxy;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/android/Bootstrapper$Companion;", "", "()V", "DEFAULT_CACHE_SIZE_IN_BYTES", "", "DEFAULT_PROPERTIES_FILE", "", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Bootstrapper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public Bootstrapper(Application application2, AndroidSdkComponentBuilder androidSdkComponentBuilder, MediaCapabilitiesProvider mediaCapabilitiesProvider2) {
        this.application = application2;
        this.componentBuilder = androidSdkComponentBuilder;
        this.mediaCapabilitiesProvider = mediaCapabilitiesProvider2;
    }

    private final void ensureExtensionsHaveImplementations(PluginRegistry pluginRegistry) {
        pluginRegistry.registerExtension(new NullLegacyAccountExtension());
        pluginRegistry.registerExtension(new NullLegacyContextExtension());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r0 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bamtech.sdk4.Session bootstrap() {
        /*
            r13 = this;
            java.util.Properties r0 = r13.properties
            if (r0 == 0) goto L_0x0014
            com.bamtech.sdk4.internal.android.BootstrapProperties r1 = new com.bamtech.sdk4.internal.android.BootstrapProperties
            if (r0 == 0) goto L_0x000c
            r1.<init>(r0)
            goto L_0x001f
        L_0x000c:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Properties"
            r0.<init>(r1)
            throw r0
        L_0x0014:
            com.bamtech.sdk4.internal.android.BootstrapProperties r1 = new com.bamtech.sdk4.internal.android.BootstrapProperties
            android.app.Application r0 = r13.application
            if (r0 == 0) goto L_0x0191
            java.lang.String r2 = r13.file
            r1.<init>(r0, r2)
        L_0x001f:
            com.bamtech.sdk4.configuration.Environment r0 = r13.environment
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.name()
            if (r0 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)
            if (r0 == 0) goto L_0x003f
            goto L_0x0043
        L_0x0037:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.String r0 = r1.getEnvironment()
        L_0x0043:
            r7 = r0
            com.bamtech.sdk4.internal.configuration.ConfigurationHostName r0 = r13.configHostName
            if (r0 == 0) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            com.bamtech.sdk4.internal.configuration.ConfigurationHostName r0 = r1.getConfigHostType()
        L_0x004d:
            r9 = r0
            com.bamtech.sdk4.internal.android.AndroidBootstrapConfiguration$Companion r2 = com.bamtech.sdk4.internal.android.AndroidBootstrapConfiguration.Companion
            android.app.Application r3 = r13.application
            java.lang.String r0 = r13.clientIdOverride
            if (r0 == 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            java.lang.String r0 = r1.getClientId()
        L_0x005b:
            r4 = r0
            java.lang.String r0 = r13.apiKeyOverride
            if (r0 == 0) goto L_0x0061
            goto L_0x0065
        L_0x0061:
            java.lang.String r0 = r1.getApiKey()
        L_0x0065:
            r5 = r0
            android.app.Application r0 = r13.application
            com.bamtech.sdk4.internal.device.Device r6 = com.bamtech.sdk4.android.BootstrapperKt.device(r0)
            boolean r8 = r13.debugEnabled
            java.lang.String r10 = r13.mockBaseUrl
            r0 = 1
            r12 = 0
            if (r8 == 0) goto L_0x007a
            boolean r11 = r13.enableDebugLogging
            if (r11 == 0) goto L_0x007a
            r11 = 1
            goto L_0x007b
        L_0x007a:
            r11 = 0
        L_0x007b:
            com.bamtech.sdk4.internal.android.AndroidBootstrapConfiguration r2 = r2.create(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.io.File r3 = r13.networkCacheDirectory
            if (r3 == 0) goto L_0x0084
            goto L_0x008a
        L_0x0084:
            android.app.Application r3 = r13.application
            java.io.File r3 = r3.getCacheDir()
        L_0x008a:
            if (r3 == 0) goto L_0x0092
            boolean r4 = r13.disableNetworkCache
            if (r4 != 0) goto L_0x0092
            r4 = 1
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r5 = r13.componentBuilder
            android.app.Application r6 = r13.application
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r5 = r5.application(r6)
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r2 = r5.bootstrapConfiguration(r2)
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.correlationIds
            java.util.Map r5 = kotlin.p590y.C13173j0.m40364d(r5)
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r2 = r2.correlationIds(r5)
            com.bamtech.sdk4.location.GeoProvider r5 = r13.geoProvider
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r2 = r2.geoProvider(r5)
            com.bamtech.sdk4.media.MediaCapabilitiesProvider r5 = r13.mediaCapabilitiesProvider
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r2 = r2.mediaCapabilitiesProvider(r5)
            r5 = 0
            if (r4 == 0) goto L_0x00c0
            okhttp3.Cache r4 = new okhttp3.Cache
            long r6 = r13.networkCacheSizeInBytes
            r4.<init>(r3, r6)
            goto L_0x00c1
        L_0x00c0:
            r4 = r5
        L_0x00c1:
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r2 = r2.okHttpCache(r4)
            boolean r3 = r13.debugEnabled
            if (r3 == 0) goto L_0x00ce
            boolean r3 = r13.disableNetworkSecurity
            if (r3 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r0 = r2.disableNetworkSecurity(r0)
            boolean r2 = r13.debugEnabled
            if (r2 == 0) goto L_0x00da
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = r13.loggingLevel
            goto L_0x00dc
        L_0x00da:
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
        L_0x00dc:
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r0 = r0.httpLoggingLevel(r2)
            boolean r2 = r13.debugEnabled
            if (r2 == 0) goto L_0x00e7
            java.security.KeyStore r2 = r13.keyStore
            goto L_0x00e8
        L_0x00e7:
            r2 = r5
        L_0x00e8:
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r0 = r0.keyStore(r2)
            boolean r2 = r13.debugEnabled
            if (r2 == 0) goto L_0x00f9
            java.net.Proxy r5 = r13.proxy
            if (r5 == 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            java.net.Proxy r5 = r1.getHttpProxy()
        L_0x00f9:
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r0 = r0.proxy(r5)
            com.bamtech.sdk4.internal.media.adengine.DefaultAdvertisingIdProvider r1 = new com.bamtech.sdk4.internal.media.adengine.DefaultAdvertisingIdProvider
            android.app.Application r2 = r13.application
            r1.<init>(r2)
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r0 = r0.advertisingIdProvider(r1)
            com.bamtech.sdk4.session.ReauthorizationHandlerRegistry r1 = new com.bamtech.sdk4.session.ReauthorizationHandlerRegistry
            r1.<init>()
            com.bamtech.sdk4.internal.android.AndroidSdkComponentBuilder r0 = r0.reauthorizeHandlerStorage(r1)
            com.bamtech.sdk4.internal.android.AndroidSdkComponent r0 = r0.build()
            com.bamtech.sdk4.plugin.PluginRegistry r1 = r0.registry()
            com.bamtech.sdk4.internal.plugin.DefaultExtensionProvider r2 = r0.defaultExtensions()
            r2.register(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map<java.lang.Class<? extends com.bamtech.sdk4.plugin.Plugin>, com.bamtech.sdk4.plugin.PluginExtra> r3 = r13.plugins
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x012f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0175
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Object r4 = r4.getValue()
            com.bamtech.sdk4.plugin.PluginExtra r4 = (com.bamtech.sdk4.plugin.PluginExtra) r4
            java.lang.Object r6 = r5.newInstance()     // Catch:{ all -> 0x0159 }
            com.bamtech.sdk4.plugin.Plugin r6 = (com.bamtech.sdk4.plugin.Plugin) r6     // Catch:{ all -> 0x0159 }
            r6.initialize(r1, r4)     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = "instance"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r4)     // Catch:{ all -> 0x0159 }
            r2.add(r6)     // Catch:{ all -> 0x0159 }
            goto L_0x012f
        L_0x0159:
            r0 = move-exception
            com.bamtech.sdk4.plugin.PluginInitializationException r1 = new com.bamtech.sdk4.plugin.PluginInitializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to create plugin instance: "
            r2.append(r3)
            java.lang.String r3 = r5.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0175:
            r13.ensureExtensionsHaveImplementations(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x017c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x018c
            java.lang.Object r2 = r1.next()
            com.bamtech.sdk4.plugin.Plugin r2 = (com.bamtech.sdk4.plugin.Plugin) r2
            r2.onReady()
            goto L_0x017c
        L_0x018c:
            com.bamtech.sdk4.Session r0 = r0.session()
            return r0
        L_0x0191:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type android.content.Context"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.android.Bootstrapper.bootstrap():com.bamtech.sdk4.Session");
    }

    public final Bootstrapper environment(Environment environment2) {
        this.environment = environment2;
        return this;
    }

    public final Bootstrapper geoProvider(GeoProvider geoProvider2) {
        this.geoProvider = geoProvider2;
        return this;
    }

    public final <PLUGIN extends Plugin> Bootstrapper plugin(Class<? extends PLUGIN> cls, PluginExtra pluginExtra) {
        this.plugins.put(cls, pluginExtra);
        return this;
    }
}
