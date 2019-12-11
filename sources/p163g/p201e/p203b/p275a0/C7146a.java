package p163g.p201e.p203b.p275a0;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0001\u0002\u000b\f¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/ImageType;", "", "extension", "", "label", "(Ljava/lang/String;Ljava/lang/String;)V", "getExtension", "()Ljava/lang/String;", "getLabel", "Default", "Originals", "Lcom/bamtechmedia/dominguez/ripcut/ImageType$Default;", "Lcom/bamtechmedia/dominguez/ripcut/ImageType$Originals;", "ripcutApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.a0.a */
/* compiled from: ImageType.kt */
public abstract class C7146a {

    /* renamed from: a */
    private final String f15796a;

    /* renamed from: b */
    private final String f15797b;

    /* renamed from: g.e.b.a0.a$a */
    /* compiled from: ImageType.kt */
    public static final class C7147a extends C7146a {

        /* renamed from: c */
        public static final C7147a f15798c = new C7147a();

        private C7147a() {
            super("scale", null, 2, null);
        }
    }

    /* renamed from: g.e.b.a0.a$b */
    /* compiled from: ImageType.kt */
    public static final class C7148b extends C7146a {

        /* renamed from: c */
        public static final C7148b f15799c = new C7148b();

        private C7148b() {
            super("badging", "originals", null);
        }
    }

    private C7146a(String str, String str2) {
        this.f15796a = str;
        this.f15797b = str2;
    }

    /* renamed from: a */
    public final String mo19971a() {
        return this.f15796a;
    }

    /* renamed from: b */
    public final String mo19972b() {
        return this.f15797b;
    }

    /* synthetic */ C7146a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        this(str, str2);
    }

    public /* synthetic */ C7146a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
