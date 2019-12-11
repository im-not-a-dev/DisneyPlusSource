package com.bamtech.sdk4.internal.content;

import com.bamtech.core.networking.Headers.Builder;
import com.bamtech.core.networking.Link;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0005"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtech/core/networking/Headers$Builder;", "invoke", "com/bamtech/sdk4/internal/content/DefaultContentClient$handleSearchOverrides$1$1$1", "com/bamtech/sdk4/internal/content/DefaultContentClient$$special$$inlined$let$lambda$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.content.DefaultContentClient$handleSearchOverrides$$inlined$forEach$lambda$1 */
/* compiled from: ContentClient.kt */
final class C1841xc318d05d extends C12881k implements Function1<Builder, C13145v> {
    final /* synthetic */ OptionalHeaderTemplate $it$inlined;
    final /* synthetic */ String $template;

    C1841xc318d05d(String str, OptionalHeaderTemplate optionalHeaderTemplate, Link link, Link.Builder builder) {
        this.$template = str;
        this.$it$inlined = optionalHeaderTemplate;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Builder) obj);
        return C13145v.f29587a;
    }

    public final void invoke(Builder builder) {
        builder.mo7411a(new Pair<>(this.$it$inlined.getName(), C12832w.m40117a(this.$template, this.$it$inlined.getTemplate(), this.$it$inlined.getValue(), false, 4, (Object) null)));
    }
}
