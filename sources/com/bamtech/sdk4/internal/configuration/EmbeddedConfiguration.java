package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Link.Builder;
import com.bamtech.sdk4.internal.configuration.Client.ClientBuilder;
import java.util.Iterator;
import java.util.Map;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration;", "", "client", "Lcom/bamtech/sdk4/internal/configuration/Client;", "configVersion", "", "defaultConfigHostName", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "(Lcom/bamtech/sdk4/internal/configuration/Client;Ljava/lang/String;Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/Client;", "getConfigVersion", "()Ljava/lang/String;", "setConfigVersion", "(Ljava/lang/String;)V", "getDefaultConfigHostName", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "setDefaultConfigHostName", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "getBootstrapLink", "Lcom/bamtech/core/networking/Link;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "hashCode", "", "toString", "Companion", "EmbeddedConfigurationBuilder", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EmbeddedConfiguration.kt */
public final class EmbeddedConfiguration {
    public static final Companion Companion = new Companion(null);
    private final Client client;
    private String configVersion;
    private ConfigurationHostName defaultConfigHostName;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration$Companion;", "", "()V", "default", "Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration;", "mockBaseUrl", "", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: EmbeddedConfiguration.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ EmbeddedConfiguration default$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.m45853default(str);
        }

        /* renamed from: default reason: not valid java name */
        public final EmbeddedConfiguration m45853default(String str) {
            return EmbeddedConfigurationKt.embeddedConfiguration(new EmbeddedConfiguration$Companion$default$1(str));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\u001f\u0010\b\u001a\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration$EmbeddedConfigurationBuilder;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/Client;", "defaultConfigHostName", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "getDefaultConfigHostName", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;", "setDefaultConfigHostName", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationHostName;)V", "specVersion", "", "getSpecVersion", "()Ljava/lang/String;", "setSpecVersion", "(Ljava/lang/String;)V", "build", "Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/Client$ClientBuilder;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: EmbeddedConfiguration.kt */
    public static final class EmbeddedConfigurationBuilder {
        private Client client;
        public ConfigurationHostName defaultConfigHostName;
        public String specVersion;

        public EmbeddedConfigurationBuilder() {
        }

        public final EmbeddedConfiguration build() {
            Client client2 = this.client;
            if (client2 != null) {
                String str = this.specVersion;
                if (str != null) {
                    ConfigurationHostName configurationHostName = this.defaultConfigHostName;
                    if (configurationHostName != null) {
                        return new EmbeddedConfiguration(client2, str, configurationHostName);
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("defaultConfigHostName");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("specVersion");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("client");
            throw null;
        }

        public final void client(Function1<? super ClientBuilder, C13145v> function1) {
            this.client = new ClientBuilder(function1).build();
        }

        public final String getSpecVersion() {
            String str = this.specVersion;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("specVersion");
            throw null;
        }

        public final void setDefaultConfigHostName(ConfigurationHostName configurationHostName) {
            this.defaultConfigHostName = configurationHostName;
        }

        public final void setSpecVersion(String str) {
            this.specVersion = str;
        }

        public EmbeddedConfigurationBuilder(Function1<? super EmbeddedConfigurationBuilder, C13145v> function1) {
            this();
            function1.invoke(this);
        }
    }

    public EmbeddedConfiguration(Client client2, String str, ConfigurationHostName configurationHostName) {
        this.client = client2;
        this.configVersion = str;
        this.defaultConfigHostName = configurationHostName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.defaultConfigHostName, (java.lang.Object) r3.defaultConfigHostName) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration
            if (r0 == 0) goto L_0x0027
            com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration r3 = (com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration) r3
            com.bamtech.sdk4.internal.configuration.Client r0 = r2.client
            com.bamtech.sdk4.internal.configuration.Client r1 = r3.client
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.configVersion
            java.lang.String r1 = r3.configVersion
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.bamtech.sdk4.internal.configuration.ConfigurationHostName r0 = r2.defaultConfigHostName
            com.bamtech.sdk4.internal.configuration.ConfigurationHostName r3 = r3.defaultConfigHostName
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration.equals(java.lang.Object):boolean");
    }

    public final Link getBootstrapLink(BootstrapConfiguration bootstrapConfiguration) {
        Object obj;
        String str = (String) this.client.getConfigHostParams().get((Object) ConfigurationHostName.valueOf(bootstrapConfiguration.getConfigHostName().name()));
        if (str != null) {
            Iterator it = this.client.getLinks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((Link) obj).getRel(), (Object) "bootstrap")) {
                    break;
                }
            }
            Link link = (Link) obj;
            if (link != null) {
                Map a = C13173j0.m40356a(C12907r.m40244a("{clientId}", bootstrapConfiguration.getClientId()), C12907r.m40244a("{platform}", bootstrapConfiguration.getDevice().getPlatform()), C12907r.m40244a("{formFactor}", bootstrapConfiguration.getDevice().getFormFactor()), C12907r.m40244a("{environment}", bootstrapConfiguration.getEnvironment()));
                Builder linkBuilder = link.toLinkBuilder();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(link.getHref());
                return Link.updateTemplates$default(linkBuilder.mo7434b(sb.toString()).mo7432a(), a, null, 2, null);
            }
            throw new Exception("Missing bootstrap link");
        }
        throw new Exception("Missing baseUrl");
    }

    public final ConfigurationHostName getDefaultConfigHostName() {
        return this.defaultConfigHostName;
    }

    public int hashCode() {
        Client client2 = this.client;
        int i = 0;
        int hashCode = (client2 != null ? client2.hashCode() : 0) * 31;
        String str = this.configVersion;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ConfigurationHostName configurationHostName = this.defaultConfigHostName;
        if (configurationHostName != null) {
            i = configurationHostName.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmbeddedConfiguration(client=");
        sb.append(this.client);
        sb.append(", configVersion=");
        sb.append(this.configVersion);
        sb.append(", defaultConfigHostName=");
        sb.append(this.defaultConfigHostName);
        sb.append(")");
        return sb.toString();
    }
}
