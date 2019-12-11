package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.core.utils.p223t0.C5879c;
import com.bamtechmedia.dominguez.legal.api.LegalApi;
import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import com.bamtechmedia.dominguez.legal.api.LegalDocContent;
import com.bamtechmedia.dominguez.legal.api.MarketingEntity;
import com.bamtechmedia.dominguez.legal.api.MarketingInput;
import java.util.List;
import java.util.Locale;
import javax.inject.Provider;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import p163g.p201e.p203b.p204d.C5403j0;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11760v;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001,B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J,\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001f0$H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001f0$H\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100$2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0012\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00130\u0013 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/DefaultLegalApi;", "Lcom/bamtechmedia/dominguez/legal/api/LegalApi;", "config", "Lcom/bamtechmedia/dominguez/legal/LegalApiConfig;", "countryCodeProvider", "Lcom/bamtechmedia/dominguez/account/CountryCodeProviderApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "localeProvider", "Ljavax/inject/Provider;", "Ljava/util/Locale;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/bamtechmedia/dominguez/legal/LegalApiConfig;Lcom/bamtechmedia/dominguez/account/CountryCodeProviderApi;Lokhttp3/OkHttpClient;Ljavax/inject/Provider;Lcom/squareup/moshi/Moshi;)V", "legalDocContentAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/legal/LegalDocContentResponse;", "kotlin.jvm.PlatformType", "siteConfigAdapter", "Lcom/bamtechmedia/dominguez/legal/SiteConfigResponse;", "buildLegalDocContentUrl", "Lokhttp3/HttpUrl;", "documentCode", "", "countryCode", "buildNrtUrl", "buildSiteConfigUrl", "createNrtAccount", "Lio/reactivex/Completable;", "emailAddress", "legalAcceptance", "", "marketingInput", "Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "determineLanguageCode", "getLegalData", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;", "getLegalDocContent", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocContent;", "getMarketingData", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "legalDocContentOnce", "siteConfigOnce", "Companion", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLegalApi.kt */
public final class DefaultLegalApi implements LegalApi {
    public static final String ACCEPT_HEADER = "Accept";
    public static final Companion Companion = new Companion(null);
    public static final String LEGAL_DOC_CONTENT_ENDPOINT = "document/";
    public static final String MIME_TYPE_JSON = "application/json";
    public static final String NRT_MARKETING_ENDPOINT = "marketing";
    public static final String SITE_CONFIG_ENDPOINT = "configuration/site";
    private final LegalApiConfig config;
    private final C5403j0 countryCodeProvider;
    private final C11725h<LegalDocContentResponse> legalDocContentAdapter = this.moshi.mo29866a(LegalDocContentResponse.class);
    private final Provider<Locale> localeProvider;
    private final C11760v moshi;
    /* access modifiers changed from: private */
    public final OkHttpClient okHttpClient;
    /* access modifiers changed from: private */
    public final C11725h<SiteConfigResponse> siteConfigAdapter = this.moshi.mo29866a(SiteConfigResponse.class);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/DefaultLegalApi$Companion;", "", "()V", "ACCEPT_HEADER", "", "LEGAL_DOC_CONTENT_ENDPOINT", "MIME_TYPE_JSON", "NRT_MARKETING_ENDPOINT", "SITE_CONFIG_ENDPOINT", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DefaultLegalApi.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultLegalApi(LegalApiConfig legalApiConfig, C5403j0 j0Var, OkHttpClient okHttpClient2, Provider<Locale> provider, C11760v vVar) {
        this.config = legalApiConfig;
        this.countryCodeProvider = j0Var;
        this.okHttpClient = okHttpClient2;
        this.localeProvider = provider;
        this.moshi = vVar;
    }

    private final HttpUrl buildLegalDocContentUrl(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.config.getCdnBaseUrl());
        sb.append(LEGAL_DOC_CONTENT_ENDPOINT);
        sb.append(str);
        HttpUrl e = HttpUrl.m44643e(sb.toString());
        if (e != null) {
            HttpUrl a = e.mo35758i().mo35770a("langPref", determineLanguageCode(str2)).mo35772a();
            C12880j.m40222a((Object) a, "requireNotNull(HttpUrl.p…de))\n            .build()");
            return a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    public final HttpUrl buildNrtUrl(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.config.getNrtBaseUrl());
        sb.append(NRT_MARKETING_ENDPOINT);
        HttpUrl e = HttpUrl.m44643e(sb.toString());
        if (e != null) {
            HttpUrl a = e.mo35758i().mo35770a("langPref", determineLanguageCode(str)).mo35772a();
            C12880j.m40222a((Object) a, "requireNotNull(HttpUrl.p…de))\n            .build()");
            return a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    public final HttpUrl buildSiteConfigUrl(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.config.getCdnBaseUrl());
        sb.append(SITE_CONFIG_ENDPOINT);
        HttpUrl e = HttpUrl.m44643e(sb.toString());
        if (e != null) {
            HttpUrl a = e.mo35758i().mo35770a("langPref", determineLanguageCode(str)).mo35770a("countryCode", str).mo35772a();
            C12880j.m40222a((Object) a, "requireNotNull(HttpUrl.p…ode)\n            .build()");
            return a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final String determineLanguageCode(String str) {
        String languageTag = ((Locale) this.localeProvider.get()).toLanguageTag();
        if (languageTag.length() == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(languageTag);
            sb.append('-');
            Locale locale = Locale.US;
            C12880j.m40222a((Object) locale, "Locale.US");
            if (str != null) {
                String upperCase = str.toUpperCase(locale);
                C12880j.m40222a((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
                sb.append(upperCase);
                return sb.toString();
            }
            throw new C13142s("null cannot be cast to non-null type java.lang.String");
        }
        C12880j.m40222a((Object) languageTag, "defaultLangCode");
        return languageTag;
    }

    /* access modifiers changed from: private */
    public final Single<LegalDocContentResponse> legalDocContentOnce(String str, String str2) {
        C14113a aVar = new C14113a();
        aVar.mo35843a(buildLegalDocContentUrl(str, str2));
        aVar.mo35840a(ACCEPT_HEADER, MIME_TYPE_JSON);
        aVar.mo35847b();
        Request a = aVar.mo35846a();
        C12880j.m40222a((Object) a, "Request.Builder()\n      …et()\n            .build()");
        OkHttpClient okHttpClient2 = this.okHttpClient;
        C11725h<LegalDocContentResponse> hVar = this.legalDocContentAdapter;
        C12880j.m40222a((Object) hVar, "legalDocContentAdapter");
        Single<LegalDocContentResponse> g = C5879c.m18933a(a, okHttpClient2).mo30233g(new DefaultLegalApi$legalDocContentOnce$$inlined$createTypedSingle$1(hVar));
        C12880j.m40222a((Object) g, "createSingle(client).map…)?.toObject<T>(adapter) }");
        return g;
    }

    private final Single<SiteConfigResponse> siteConfigOnce() {
        Single<SiteConfigResponse> a = this.countryCodeProvider.mo17142a().mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultLegalApi$siteConfigOnce$1<Object,Object>(this));
        C12880j.m40222a((Object) a, "countryCodeProvider.coun…figAdapter)\n            }");
        return a;
    }

    public Completable createNrtAccount(String str, List<String> list, List<MarketingInput> list2) {
        C11725h a = this.moshi.mo29866a(CreateNrtAccountInput.class);
        Single a2 = this.countryCodeProvider.mo17142a();
        DefaultLegalApi$createNrtAccount$1 defaultLegalApi$createNrtAccount$1 = new DefaultLegalApi$createNrtAccount$1(this, str, list2, list, a);
        Completable b = a2.mo30217b((Function<? super T, ? extends CompletableSource>) defaultLegalApi$createNrtAccount$1);
        C12880j.m40222a((Object) b, "countryCodeProvider.coun…omplete() }\n            }");
        return b;
    }

    public Single<List<LegalDisclosure>> getLegalData() {
        Single<List<LegalDisclosure>> g = siteConfigOnce().mo30233g(DefaultLegalApi$getLegalData$1.INSTANCE);
        C12880j.m40222a((Object) g, "siteConfigOnce().map {\n …)\n            }\n        }");
        return g;
    }

    public Single<LegalDocContent> getLegalDocContent(String str) {
        Single<LegalDocContent> a = this.countryCodeProvider.mo17142a().mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultLegalApi$getLegalDocContent$1<Object,Object>(this, str));
        C12880j.m40222a((Object) a, "countryCodeProvider.coun…(it.data) }\n            }");
        return a;
    }

    public Single<List<MarketingEntity>> getMarketingData() {
        Single<List<MarketingEntity>> g = siteConfigOnce().mo30233g(DefaultLegalApi$getMarketingData$1.INSTANCE);
        C12880j.m40222a((Object) g, "siteConfigOnce().map {\n …)\n            }\n        }");
        return g;
    }
}
