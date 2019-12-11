package com.bamtech.sdk4.content.custom;

import com.bamtech.sdk4.plugin.PluginApi;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&JF\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0003\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&J<\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0003\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&JY\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0003\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0010\"\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0002\u0010\u0011J@\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0003\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&JO\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0003\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0010\"\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0002\u0010\u0012J6\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0003\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/CustomContentApi;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "query", "Lio/reactivex/Single;", "", "request", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "overrides", "Lcom/bamtech/sdk4/content/SearchOverrides;", "contentTransactionId", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/Class;", "Ljava/lang/reflect/Type;", "parameters", "", "(Ljava/lang/reflect/Type;Lcom/bamtech/sdk4/content/custom/GraphQlRequest;Lcom/bamtech/sdk4/content/SearchOverrides;[Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Single;", "(Ljava/lang/reflect/Type;Lcom/bamtech/sdk4/content/custom/GraphQlRequest;[Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Single;", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CustomContentApi.kt */
public interface CustomContentApi extends PluginApi {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: CustomContentApi.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Single query$default(CustomContentApi customContentApi, GraphQlRequest graphQlRequest, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return customContentApi.query(graphQlRequest, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
    }

    Single<String> query(GraphQlRequest graphQlRequest, String str);
}
