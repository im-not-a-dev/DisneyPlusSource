package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.bookmarks.BookmarksApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.b0.f */
/* compiled from: FeatureSdkModule_BookmarksApiFactory */
public final class C7207f implements C11895c<BookmarksApi> {

    /* renamed from: a */
    private final Provider<C7234z> f15930a;

    public C7207f(Provider<C7234z> provider) {
        this.f15930a = provider;
    }

    /* renamed from: a */
    public static C7207f m21806a(Provider<C7234z> provider) {
        return new C7207f(provider);
    }

    /* renamed from: a */
    public static BookmarksApi m21805a(C7234z zVar) {
        BookmarksApi c = C7194c.m21778c(zVar);
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public BookmarksApi get() {
        return m21805a((C7234z) this.f15930a.get());
    }
}
