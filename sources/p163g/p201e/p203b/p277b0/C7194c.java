package p163g.p201e.p203b.p277b0;

import android.content.Context;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.UserProfileApi;
import com.bamtech.sdk4.bookmarks.BookmarksApi;
import com.bamtech.sdk4.content.custom.CustomContentApi;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.sdk4.media.adapters.exoplayer.DefaultExoMediaCapabilitiesProvider;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionState;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtech.sdk4.useractivity.UserActivityApi;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

/* renamed from: g.e.b.b0.c */
/* compiled from: FeatureSdkModule */
public abstract class C7194c {
    /* renamed from: a */
    static Single<SessionInfo> m21775a(C7195c0 c0Var) {
        return c0Var.mo20041e().mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) C7177a.f15864c);
    }

    /* renamed from: b */
    static Single<Session> m21777b(C7195c0 c0Var) {
        return c0Var.mo20041e();
    }

    /* renamed from: c */
    static Single<SessionState> m21779c(C7195c0 c0Var) {
        return c0Var.mo20038b();
    }

    /* renamed from: d */
    static SearchApi m21780d(C7234z zVar) {
        return (SearchApi) zVar.mo20024a(SearchApi.class);
    }

    /* renamed from: e */
    static CustomContentApi m21781e(C7234z zVar) {
        return (CustomContentApi) zVar.mo20024a(CustomContentApi.class);
    }

    /* renamed from: f */
    static SubscriptionApi m21782f(C7234z zVar) {
        return (SubscriptionApi) zVar.mo20024a(SubscriptionApi.class);
    }

    /* renamed from: g */
    static UserActivityApi m21783g(C7234z zVar) {
        return (UserActivityApi) zVar.mo20024a(UserActivityApi.class);
    }

    /* renamed from: h */
    static UserProfileApi m21784h(C7234z zVar) {
        return (UserProfileApi) zVar.mo20024a(UserProfileApi.class);
    }

    /* renamed from: a */
    static MediaCapabilitiesProvider m21774a(Context context, C7223r rVar) {
        return new C7191b(new DefaultExoMediaCapabilitiesProvider(context), context, rVar);
    }

    /* renamed from: b */
    static BamIdentityApi m21776b(C7234z zVar) {
        return (BamIdentityApi) zVar.mo20024a(BamIdentityApi.class);
    }

    /* renamed from: c */
    static BookmarksApi m21778c(C7234z zVar) {
        return (BookmarksApi) zVar.mo20024a(BookmarksApi.class);
    }

    /* renamed from: a */
    static AccountApi m21773a(C7234z zVar) {
        return (AccountApi) zVar.mo20024a(AccountApi.class);
    }
}
