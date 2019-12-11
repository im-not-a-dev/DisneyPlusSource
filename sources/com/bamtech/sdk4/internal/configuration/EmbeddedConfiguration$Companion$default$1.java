package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Headers;
import com.bamtech.core.networking.Link.Builder;
import com.bamtech.sdk4.internal.configuration.Client.ClientBuilder;
import com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration.EmbeddedConfigurationBuilder;
import com.bamtech.sdk4.internal.configuration.HostParams.HostParamsBuilder;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtech/sdk4/internal/configuration/EmbeddedConfiguration$EmbeddedConfigurationBuilder;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: EmbeddedConfiguration.kt */
final class EmbeddedConfiguration$Companion$default$1 extends C12881k implements Function1<EmbeddedConfigurationBuilder, C13145v> {
    final /* synthetic */ String $mockBaseUrl;

    EmbeddedConfiguration$Companion$default$1(String str) {
        this.$mockBaseUrl = str;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((EmbeddedConfigurationBuilder) obj);
        return C13145v.f29587a;
    }

    public final void invoke(final EmbeddedConfigurationBuilder embeddedConfigurationBuilder) {
        embeddedConfigurationBuilder.setSpecVersion("v2.0");
        embeddedConfigurationBuilder.setDefaultConfigHostName(ConfigurationHostName.PROD);
        embeddedConfigurationBuilder.client(new Function1<ClientBuilder, C13145v>(this) {
            final /* synthetic */ EmbeddedConfiguration$Companion$default$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ClientBuilder) obj);
                return C13145v.f29587a;
            }

            public final void invoke(ClientBuilder clientBuilder) {
                clientBuilder.link(new Function1<Builder, C13145v>(this) {
                    final /* synthetic */ C18361 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Builder) obj);
                        return C13145v.f29587a;
                    }

                    public final void invoke(Builder builder) {
                        builder.mo7440d("bootstrap");
                        StringBuilder sb = new StringBuilder();
                        sb.append("/bam-sdk/");
                        sb.append(embeddedConfigurationBuilder.getSpecVersion());
                        sb.append("/{clientId}/android/v4.7.1/{platform}/{formFactor}/{environment}.json");
                        builder.mo7434b(sb.toString());
                        builder.mo7431a((Function1<? super Headers.Builder, C13145v>) C18381.INSTANCE);
                    }
                });
                clientBuilder.configHostParams(new Function1<HostParamsBuilder, C13145v>(this) {
                    final /* synthetic */ C18361 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HostParamsBuilder) obj);
                        return C13145v.f29587a;
                    }

                    public final void invoke(HostParamsBuilder hostParamsBuilder) {
                        String str = this.this$0.this$0.$mockBaseUrl;
                        if (str == null) {
                            str = "https://dev-bam-sdk-configs.bamgrid.com";
                        }
                        hostParamsBuilder.setDev(str);
                        String str2 = this.this$0.this$0.$mockBaseUrl;
                        if (str2 == null) {
                            str2 = "https://bam-sdk-configs.bamgrid.com";
                        }
                        hostParamsBuilder.setProd(str2);
                    }
                });
            }
        });
    }
}
