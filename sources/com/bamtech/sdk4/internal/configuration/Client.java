package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Link.Builder;
import com.bamtech.sdk4.internal.configuration.HostParams.HostParamsBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/Client;", "", "links", "", "Lcom/bamtech/core/networking/Link;", "configHostParams", "Lcom/bamtech/sdk4/internal/configuration/HostParams;", "(Ljava/util/List;Lcom/bamtech/sdk4/internal/configuration/HostParams;)V", "getConfigHostParams", "()Lcom/bamtech/sdk4/internal/configuration/HostParams;", "getLinks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ClientBuilder", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EmbeddedConfiguration.kt */
public final class Client {
    private final HostParams configHostParams;
    private final List<Link> links;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u001f\u0010\b\u001a\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005J\u001f\u0010\u0011\u001a\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/Client$ClientBuilder;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "configHostParams", "Lcom/bamtech/sdk4/internal/configuration/HostParams;", "links", "Ljava/util/ArrayList;", "Lcom/bamtech/core/networking/Link;", "Lkotlin/collections/ArrayList;", "build", "Lcom/bamtech/sdk4/internal/configuration/Client;", "Lcom/bamtech/sdk4/internal/configuration/HostParams$HostParamsBuilder;", "link", "Lcom/bamtech/core/networking/Link$Builder;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: EmbeddedConfiguration.kt */
    public static final class ClientBuilder {
        private HostParams configHostParams;
        private ArrayList<Link> links;

        public ClientBuilder() {
            this.links = new ArrayList<>();
        }

        public final Client build() {
            ArrayList<Link> arrayList = this.links;
            HostParams hostParams = this.configHostParams;
            if (hostParams != null) {
                return new Client(arrayList, hostParams);
            }
            C12880j.m40227c("configHostParams");
            throw null;
        }

        public final void configHostParams(Function1<? super HostParamsBuilder, C13145v> function1) {
            this.configHostParams = new HostParamsBuilder(function1).build();
        }

        public final void link(Function1<? super Builder, C13145v> function1) {
            this.links.add(new Builder(function1).mo7432a());
        }

        public ClientBuilder(Function1<? super ClientBuilder, C13145v> function1) {
            this();
            function1.invoke(this);
        }
    }

    public Client(List<Link> list, HostParams hostParams) {
        this.links = list;
        this.configHostParams = hostParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.configHostParams, (java.lang.Object) r3.configHostParams) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.configuration.Client
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.configuration.Client r3 = (com.bamtech.sdk4.internal.configuration.Client) r3
            java.util.List<com.bamtech.core.networking.Link> r0 = r2.links
            java.util.List<com.bamtech.core.networking.Link> r1 = r3.links
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.configuration.HostParams r0 = r2.configHostParams
            com.bamtech.sdk4.internal.configuration.HostParams r3 = r3.configHostParams
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.configuration.Client.equals(java.lang.Object):boolean");
    }

    public final HostParams getConfigHostParams() {
        return this.configHostParams;
    }

    public final List<Link> getLinks() {
        return this.links;
    }

    public int hashCode() {
        List<Link> list = this.links;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        HostParams hostParams = this.configHostParams;
        if (hostParams != null) {
            i = hostParams.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client(links=");
        sb.append(this.links);
        sb.append(", configHostParams=");
        sb.append(this.configHostParams);
        sb.append(")");
        return sb.toString();
    }
}
