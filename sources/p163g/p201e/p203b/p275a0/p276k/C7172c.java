package p163g.p201e.p203b.p275a0.p276k;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p275a0.C7146a;
import p163g.p201e.p203b.p275a0.C7146a.C7148b;
import p163g.p201e.p203b.p275a0.C7151d;
import p163g.p201e.p203b.p275a0.C7152e;
import p163g.p201e.p203b.p275a0.C7159g.C7160a;
import p163g.p201e.p203b.p275a0.C7159g.C7161b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/uri/HttpRipcutUriFactory;", "Lcom/bamtechmedia/dominguez/ripcut/uri/RipcutUriFactory;", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "config", "Lcom/bamtechmedia/dominguez/ripcut/RipcutConfig;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/ripcut/RipcutConfig;)V", "baseUri", "Landroid/net/Uri;", "cachedUri", "request", "Lcom/bamtechmedia/dominguez/ripcut/uri/RipcutRequest;", "createUri", "appendBadging", "Landroid/net/Uri$Builder;", "imageType", "Lcom/bamtechmedia/dominguez/ripcut/ImageType;", "appendQueryParameterIfNotNull", "key", "", "value", "", "Companion", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.a0.k.c */
/* compiled from: HttpRipcutUriFactory.kt */
public final class C7172c implements C7176f {

    /* renamed from: a */
    private final Uri f15853a;

    /* renamed from: b */
    private final C7152e f15854b;

    /* renamed from: g.e.b.a0.k.c$a */
    /* compiled from: HttpRipcutUriFactory.kt */
    public static final class C7173a {
        private C7173a() {
        }

        public /* synthetic */ C7173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7173a(null);
    }

    public C7172c(C3572r0 r0Var, C7152e eVar) {
        this.f15854b = eVar;
        Uri parse = Uri.parse(C3573a.m12035a(r0Var, C7151d.config_ripcut_base, (Map) null, 2, (Object) null));
        C12880j.m40222a((Object) parse, "Uri.parse(dictionary.str…ring.config_ripcut_base))");
        this.f15853a = parse;
    }

    /* renamed from: a */
    public Uri mo20013a(C7175e eVar) {
        Builder appendPath = this.f15853a.buildUpon().appendPath(eVar.mo20020f()).appendPath(eVar.mo20018e().mo19971a());
        C12880j.m40222a((Object) appendPath, "baseUri.buildUpon()\n    …uest.imageType.extension)");
        m21737a(appendPath, "width", eVar.mo20021g());
        m21737a(appendPath, "height", eVar.mo20017d());
        C7160a a = eVar.mo20014a();
        String str = null;
        m21737a(appendPath, "blurFilter", a != null ? a.mo19980a() : null);
        m21737a(appendPath, "blurRadius", eVar.mo20015b());
        C7161b c = eVar.mo20016c();
        if (c != null) {
            str = c.mo19981a();
        }
        m21737a(appendPath, "format", str);
        m21737a(appendPath, "scalingAlgorithm", this.f15854b.mo19973a());
        m21736a(appendPath, eVar.mo20018e());
        Uri build = appendPath.build();
        C12880j.m40222a((Object) build, "baseUri.buildUpon()\n    …ageType)\n        .build()");
        return build;
    }

    /* renamed from: a */
    private final Builder m21737a(Builder builder, String str, Object obj) {
        if (obj != null) {
            builder.appendQueryParameter(str, obj.toString());
        }
        return builder;
    }

    /* renamed from: a */
    private final Builder m21736a(Builder builder, C7146a aVar) {
        if (aVar instanceof C7148b) {
            builder.appendQueryParameter("label", aVar.mo19972b());
        }
        return builder;
    }
}
