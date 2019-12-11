package com.bamtech.core.networking;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p588j0.C12808i;
import kotlin.p588j0.C12815k;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B{\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J8\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fJ\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002J\u0006\u0010$\u001a\u00020%J(\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J(\u0010(\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0002J&\u0010)\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0004J\u001a\u0010-\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u00060"}, mo31007d2 = {"Lcom/bamtech/core/networking/Link;", "", "()V", "href", "", "method", "headers", "", "optionalHeaders", "queryParams", "ttl", "", "timeout", "rel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;JJLjava/lang/String;)V", "getHeaders", "()Ljava/util/Map;", "getHref", "()Ljava/lang/String;", "getMethod", "getOptionalHeaders", "getQueryParams", "getRel", "getTimeout", "()J", "getTtl", "clearHeader", "header", "copyWithTemplates", "tokens", "url", "", "Lcom/bamtech/core/networking/OptionalHeader;", "equals", "", "other", "toLinkBuilder", "Lcom/bamtech/core/networking/Link$Builder;", "updateHeaders", "map", "updateHref", "updateTemplates", "verify", "", "pattern", "withHeaders", "newHeaders", "Builder", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Link.kt */
public final class Link {
    private final Map<String, String> headers;
    private final String href;
    private final String method;
    private final Map<String, String> optionalHeaders;
    private final Map<String, String> queryParams;
    private final String rel;
    private final long timeout;
    private final long ttl;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010)\u001a\u00020\u00002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0+J\u0014\u0010,\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.J\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\nJ\u0006\u00104\u001a\u00020\u0000J\u001f\u0010\b\u001a\u00020\u00002\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nJ\u001f\u0010\u001a\u001a\u00020\u00002\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\nJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020!R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u00068"}, mo31007d2 = {"Lcom/bamtech/core/networking/Link$Builder;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "headers", "", "", "getHeaders$networking", "()Ljava/util/Map;", "setHeaders$networking", "(Ljava/util/Map;)V", "href", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", "method", "getMethod$networking", "setMethod$networking", "optionalHeaders", "getOptionalHeaders$networking", "setOptionalHeaders$networking", "queryParams", "getQueryParams$networking", "setQueryParams$networking", "rel", "getRel$networking", "setRel$networking", "timeout", "", "getTimeout$networking", "()J", "setTimeout$networking", "(J)V", "ttl", "getTtl$networking", "setTtl$networking", "addHeaders", "newHeaders", "", "applyOptionalHeaders", "templates", "", "Lcom/bamtech/core/networking/OptionalHeader;", "build", "Lcom/bamtech/core/networking/Link;", "clearHeader", "header", "clearHeaders", "block", "Lcom/bamtech/core/networking/Headers$Builder;", "Lcom/bamtech/core/networking/QueryParams$Builder;", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Link.kt */
    public static final class Builder {

        /* renamed from: a */
        public String f5851a;

        /* renamed from: b */
        private Map<String, String> f5852b;

        /* renamed from: c */
        private Map<String, String> f5853c;

        /* renamed from: d */
        private Map<String, String> f5854d;

        /* renamed from: e */
        private long f5855e;

        /* renamed from: f */
        private long f5856f;

        /* renamed from: g */
        private String f5857g;

        /* renamed from: h */
        private String f5858h;

        public Builder() {
            this.f5852b = new LinkedHashMap();
            this.f5853c = new LinkedHashMap();
            this.f5854d = new LinkedHashMap();
            this.f5856f = 15;
            this.f5857g = "GET";
        }

        /* renamed from: a */
        public final void mo7433a(long j) {
            this.f5856f = j;
        }

        /* renamed from: b */
        public final Map<String, String> mo7436b() {
            return this.f5852b;
        }

        /* renamed from: c */
        public final Map<String, String> mo7439c() {
            return this.f5853c;
        }

        /* renamed from: d */
        public final Map<String, String> mo7441d() {
            return this.f5854d;
        }

        /* renamed from: e */
        public final void mo7442e(String str) {
            this.f5851a = str;
        }

        /* renamed from: f */
        public final void mo7443f(String str) {
            this.f5857g = str;
        }

        /* renamed from: g */
        public final void mo7444g(String str) {
            this.f5858h = str;
        }

        /* renamed from: a */
        public final Link mo7432a() {
            String str = this.f5851a;
            if (str != null) {
                Link link = new Link(str, this.f5857g, this.f5852b, this.f5853c, this.f5854d, this.f5855e, this.f5856f, this.f5858h);
                return link;
            }
            Intrinsics.throwUninitializedPropertyAccessException("href");
            throw null;
        }

        /* renamed from: b */
        public final void mo7437b(long j) {
            this.f5855e = j;
        }

        /* renamed from: c */
        public final Builder mo7438c(String str) {
            this.f5857g = str;
            return this;
        }

        /* renamed from: d */
        public final Builder mo7440d(String str) {
            this.f5858h = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo7428a(String str) {
            this.f5852b.remove(str);
            return this;
        }

        /* renamed from: b */
        public final Builder mo7435b(Function1<? super com.bamtech.core.networking.QueryParams.Builder, C13145v> function1) {
            this.f5854d.putAll(new com.bamtech.core.networking.QueryParams.Builder(function1).mo7476a());
            return this;
        }

        /* renamed from: a */
        public final Builder mo7431a(Function1<? super com.bamtech.core.networking.Headers.Builder, C13145v> function1) {
            this.f5852b.putAll(new com.bamtech.core.networking.Headers.Builder(function1).mo7409a());
            return this;
        }

        /* renamed from: b */
        public final Builder mo7434b(String str) {
            this.f5851a = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo7430a(Map<String, String> map) {
            this.f5852b.putAll(map);
            return this;
        }

        public Builder(Function1<? super Builder, C13145v> function1) {
            this();
            function1.invoke(this);
        }

        /* renamed from: a */
        public final Builder mo7429a(List<C1680b> list) {
            for (C1680b bVar : list) {
                String str = (String) this.f5853c.get(bVar.mo7487a());
                if (str != null) {
                    if (!(bVar.mo7488b().length() == 0)) {
                        str = C12832w.m40117a(str, bVar.mo7488b(), bVar.mo7489c(), false, 4, (Object) null);
                    }
                    mo7430a(C13170i0.m40332a(C12907r.m40244a(bVar.mo7487a(), str)));
                }
            }
            return this;
        }
    }

    /* renamed from: com.bamtech.core.networking.Link$a */
    /* compiled from: Link.kt */
    static final class C1677a extends C12881k implements Function1<Builder, C13145v> {

        /* renamed from: c */
        final /* synthetic */ Link f5859c;

        C1677a(Link link) {
            this.f5859c = link;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Builder) obj);
            return C13145v.f29587a;
        }

        public final void invoke(Builder builder) {
            builder.mo7442e(this.f5859c.getHref());
            builder.mo7443f(this.f5859c.getMethod());
            builder.mo7444g(this.f5859c.getRel());
            builder.mo7437b(this.f5859c.getTtl());
            builder.mo7433a(this.f5859c.getTimeout());
            builder.mo7436b().putAll(this.f5859c.getHeaders());
            builder.mo7439c().putAll(this.f5859c.getOptionalHeaders());
            builder.mo7441d().putAll(this.f5859c.getQueryParams());
        }
    }

    /* renamed from: com.bamtech.core.networking.Link$b */
    /* compiled from: Link.kt */
    static final class C1678b extends C12881k implements Function1<com.bamtech.core.networking.Headers.Builder, C13145v> {

        /* renamed from: c */
        final /* synthetic */ Map f5860c;

        C1678b(Map map) {
            this.f5860c = map;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bamtech.core.networking.Headers.Builder) obj);
            return C13145v.f29587a;
        }

        public final void invoke(com.bamtech.core.networking.Headers.Builder builder) {
            builder.mo7408a(this.f5860c);
        }
    }

    public Link(String str) {
        this(str, null, null, null, null, 0, 0, null, 254, null);
    }

    public Link(String str, String str2) {
        this(str, str2, null, null, null, 0, 0, null, 252, null);
    }

    public Link(String str, String str2, Map<String, String> map) {
        this(str, str2, map, null, null, 0, 0, null, 248, null);
    }

    public Link(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, map, map2, null, 0, 0, null, 240, null);
    }

    public Link(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        this(str, str2, map, map2, map3, 0, 0, null, 224, null);
    }

    public Link(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, long j) {
        this(str, str2, map, map2, map3, j, 0, null, 192, null);
    }

    public Link(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, long j, long j2) {
        this(str, str2, map, map2, map3, j, j2, null, 128, null);
    }

    public Link(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, long j, long j2, String str3) {
        this.href = str;
        this.method = str2;
        this.headers = map;
        this.optionalHeaders = map2;
        this.queryParams = map3;
        this.ttl = j;
        this.timeout = j2;
        this.rel = str3;
    }

    public static /* synthetic */ Link copyWithTemplates$default(Link link, Map map, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return link.copyWithTemplates(map, str, list);
    }

    private final Map<String, String> updateHeaders(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : this.headers.entrySet()) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            for (Entry entry2 : map.entrySet()) {
                pair = new Pair(pair.mo31015c(), C12832w.m40117a((String) pair.mo31016d(), (String) entry2.getKey(), (String) entry2.getValue(), false, 4, (Object) null));
            }
            linkedHashMap.put(pair.mo31015c(), pair.mo31016d());
        }
        return linkedHashMap;
    }

    private final String updateHref(Map<String, String> map, String str) {
        if (str == null) {
            str = this.href;
        }
        String str2 = str;
        for (Entry entry : map.entrySet()) {
            str2 = C12832w.m40117a(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
        }
        return str2;
    }

    static /* synthetic */ String updateHref$default(Link link, Map map, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return link.updateHref(map, str);
    }

    public static /* synthetic */ Link updateTemplates$default(Link link, Map map, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return link.updateTemplates(map, str);
    }

    public static /* synthetic */ void verify$default(Link link, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "(\\{\\w+\\})";
        }
        link.verify(str);
    }

    public final Link clearHeader(String str) {
        return toLinkBuilder().mo7428a(str).mo7432a();
    }

    public final Link copyWithTemplates(Map<String, String> map, String str, List<C1680b> list) {
        Link updateTemplates = updateTemplates(map, str);
        if (list == null) {
            return updateTemplates;
        }
        Link a = updateTemplates.toLinkBuilder().mo7429a(list).mo7432a();
        return a != null ? a : updateTemplates;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Link) {
            if (obj == this) {
                return true;
            }
            Link link = (Link) obj;
            if (Intrinsics.areEqual((Object) this.href, (Object) link.href) && Intrinsics.areEqual((Object) this.headers, (Object) link.headers) && Intrinsics.areEqual((Object) this.optionalHeaders, (Object) link.optionalHeaders) && Intrinsics.areEqual((Object) this.queryParams, (Object) link.queryParams) && this.ttl == link.ttl && this.timeout == link.timeout && Intrinsics.areEqual((Object) this.method, (Object) link.method) && Intrinsics.areEqual((Object) this.rel, (Object) link.rel)) {
                return true;
            }
        }
        return false;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getHref() {
        return this.href;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Map<String, String> getOptionalHeaders() {
        return this.optionalHeaders;
    }

    public final Map<String, String> getQueryParams() {
        return this.queryParams;
    }

    public final String getRel() {
        return this.rel;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final Builder toLinkBuilder() {
        return new Builder(new C1677a(this));
    }

    public final Link updateTemplates(Map<String, String> map, String str) {
        Link link = new Link(updateHref(map, str), this.method, updateHeaders(map), this.optionalHeaders, this.queryParams, this.ttl, this.timeout, this.rel);
        return link;
    }

    public final void verify(String str) {
        Map<String, String> map = this.headers;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            if (new C12815k(str).mo31138a((CharSequence) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            List<C12808i> g = C12788p.m39999g(C12815k.m40034b(new C12815k(str), this.href, 0, 2, null));
            ArrayList arrayList = new ArrayList();
            for (C12808i b : g) {
                C13196t.m40545a((Collection) arrayList, (Iterable) b.mo31120b());
            }
            if (!arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("The following href tokens were not replaced correctly: ");
                sb.append(arrayList);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The following headers were not processed correctly: ");
        sb2.append(linkedHashMap);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Link withHeaders(Map<String, String> map) {
        return toLinkBuilder().mo7431a((Function1<? super com.bamtech.core.networking.Headers.Builder, C13145v>) new C1678b<Object,C13145v>(map)).mo7432a();
    }

    public /* synthetic */ Link(String str, String str2, Map map, Map map2, Map map3, long j, long j2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str4 = (i2 & 2) != 0 ? "GET" : str2;
        Map a = (i2 & 4) != 0 ? C13173j0.m40350a() : map;
        Map a2 = (i2 & 8) != 0 ? C13173j0.m40350a() : map2;
        Map a3 = (i2 & 16) != 0 ? C13173j0.m40350a() : map3;
        long j3 = 0;
        long j4 = (i2 & 32) != 0 ? 0 : j;
        if ((i2 & 64) == 0) {
            j3 = j2;
        }
        this(str, str4, a, a2, a3, j4, j3, (i2 & 128) != 0 ? null : str3);
    }

    public Link() {
        this("", "GET", C13173j0.m40350a(), C13173j0.m40350a(), C13173j0.m40350a(), 0, 0, null, 128, null);
    }
}
