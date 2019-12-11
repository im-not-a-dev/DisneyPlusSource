package com.bamtech.sdk4.internal.android;

import android.content.Context;
import com.bamtech.sdk4.internal.configuration.ConfigurationHostName;
import com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/BootstrapProperties;", "", "context", "Landroid/content/Context;", "file", "", "(Landroid/content/Context;Ljava/lang/String;)V", "properties", "Ljava/util/Properties;", "(Ljava/util/Properties;)V", "getProperties", "()Ljava/util/Properties;", "getApiKey", "getClientId", "getConfigHostType", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "getEnvironment", "getHttpProxy", "Ljava/net/Proxy;", "Companion", "Loader", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BootstrapProperties.kt */
public final class BootstrapProperties {
    private final Properties properties;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/BootstrapProperties$Companion;", "", "()V", "API_KEY", "", "CLIENT_ID", "CONFIG_HOST_NAME", "ENVIRONMENT", "HTTP_PROXY", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BootstrapProperties.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/BootstrapProperties$Loader;", "Ljava/util/Properties;", "context", "Landroid/content/Context;", "file", "", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BootstrapProperties.kt */
    public static final class Loader extends Properties {
        public static final Companion Companion = new Companion(null);
        /* access modifiers changed from: private */
        public static Loader properties;

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/BootstrapProperties$Loader$Companion;", "", "()V", "properties", "Lcom/bamtech/sdk4/internal/android/BootstrapProperties$Loader;", "with", "Ljava/util/Properties;", "context", "Landroid/content/Context;", "file", "", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* compiled from: BootstrapProperties.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Properties with(Context context, String str) {
                Loader.properties = new Loader(context, str, null);
                Loader access$getProperties$cp = Loader.properties;
                if (access$getProperties$cp != null) {
                    return access$getProperties$cp;
                }
                Intrinsics.throwUninitializedPropertyAccessException("properties");
                throw null;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Loader(Context context, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str);
        }

        public final /* bridge */ Set<Entry<Object, Object>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection getValues() {
            return super.values();
        }

        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public final /* bridge */ Collection<Object> values() {
            return getValues();
        }

        private Loader(Context context, String str) {
            try {
                load(context.getAssets().open(str));
            } catch (IOException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not load the bootstrapper properties. Did you create a properties file named \"");
                sb.append(str);
                sb.append("\" in the assets directory?");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    static {
        new Companion(null);
    }

    public BootstrapProperties(Properties properties2) {
        this.properties = properties2;
    }

    public final String getApiKey() {
        String property = this.properties.getProperty("api.key");
        Intrinsics.checkReturnedValueIsNotNull((Object) property, "properties.getProperty(API_KEY)");
        return property;
    }

    public final String getClientId() {
        String property = this.properties.getProperty("client.id");
        if (property != null) {
            return property;
        }
        throw new IllegalArgumentException("Missing 'client.id' from the bootstrap properties file.");
    }

    public final ConfigurationHostName getConfigHostType() {
        if (C12832w.m40122b(this.properties.getProperty("configHostName", com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration.Companion.default$default(EmbeddedConfiguration.Companion, null, 1, null).getDefaultConfigHostName().name()), ConfigurationHostName.DEV.name(), true)) {
            return ConfigurationHostName.DEV;
        }
        return ConfigurationHostName.PROD;
    }

    public final String getEnvironment() {
        String property = this.properties.getProperty("environment");
        Intrinsics.checkReturnedValueIsNotNull((Object) property, "properties.getProperty(ENVIRONMENT)");
        return property;
    }

    public final Proxy getHttpProxy() {
        String property = this.properties.getProperty("httpProxy");
        if (property != null) {
            List a = C12833x.m40142a((CharSequence) property, new String[]{":"}, false, 0, 6, (Object) null);
            if (a != null) {
                return new Proxy(Type.HTTP, new InetSocketAddress((String) a.get(0), Integer.parseInt((String) a.get(1))));
            }
        }
        return null;
    }

    public BootstrapProperties(Context context, String str) {
        this(Loader.Companion.with(context, str));
    }
}
