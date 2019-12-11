package p163g.p201e.p203b.p275a0;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ImageView;
import com.bamtechmedia.dominguez.core.p216l.C5760a.C5761a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7146a.C7147a;
import p163g.p201e.p203b.p275a0.C7146a.C7148b;
import p163g.p201e.p203b.p275a0.C7159g.C7161b;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p512h.C11868a;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0001*B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u0014JW\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\"H\u0016¢\u0006\u0002\u0010#JQ\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0017H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001c\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoaderAdapter;", "Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Implementation;", "lazyImageLoader", "Ldagger/Lazy;", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "(Ldagger/Lazy;)V", "imageLoader", "kotlin.jvm.PlatformType", "getImageLoader", "()Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "typedValue", "Landroid/util/TypedValue;", "bucketize", "", "preferredWidth", "download", "", "masterId", "", "widthForCaching", "(Ljava/lang/String;Ljava/lang/Integer;)V", "loadImage", "imageView", "Landroid/widget/ImageView;", "content", "errorDrawableRes", "placeHolderDrawableRes", "size", "dimension", "Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Dimension;", "listener", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "isOriginal", "", "(Landroid/widget/ImageView;Ljava/lang/String;ILjava/lang/Integer;ILcom/bamtechmedia/dominguez/core/images/ImageLoader$Dimension;Lcom/bumptech/glide/request/RequestListener;Z)V", "supportTransparency", "ignorePlaceholder", "(Landroid/widget/ImageView;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V", "onNullImageLoaded", "view", "screenWidth", "Companion", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.a0.h */
/* compiled from: RipcutImageLoaderAdapter.kt */
public final class C7163h implements C5761a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TypedValue f15836a = new TypedValue();

    /* renamed from: b */
    private final C11868a<C7159g> f15837b;

    /* renamed from: g.e.b.a0.h$a */
    /* compiled from: RipcutImageLoaderAdapter.kt */
    public static final class C7164a {
        private C7164a() {
        }

        public /* synthetic */ C7164a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.a0.h$b */
    /* compiled from: RipcutImageLoaderAdapter.kt */
    static final class C7165b extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: U */
        final /* synthetic */ int f15838U;

        /* renamed from: V */
        final /* synthetic */ Integer f15839V;

        /* renamed from: W */
        final /* synthetic */ boolean f15840W;

        /* renamed from: X */
        final /* synthetic */ ImageView f15841X;

        /* renamed from: Y */
        final /* synthetic */ int f15842Y;

        /* renamed from: Z */
        final /* synthetic */ boolean f15843Z;

        /* renamed from: a0 */
        final /* synthetic */ boolean f15844a0;

        /* renamed from: c */
        final /* synthetic */ C7163h f15845c;

        C7165b(C7163h hVar, int i, Integer num, boolean z, ImageView imageView, int i2, boolean z2, boolean z3) {
            this.f15845c = hVar;
            this.f15838U = i;
            this.f15839V = num;
            this.f15840W = z;
            this.f15841X = imageView;
            this.f15842Y = i2;
            this.f15843Z = z2;
            this.f15844a0 = z3;
            super(1);
        }

        /* renamed from: a */
        public final void mo20008a(C7162c cVar) {
            Integer num;
            cVar.mo19990b(Integer.valueOf(this.f15838U));
            if (this.f15839V != null || !this.f15840W) {
                Context context = this.f15841X.getContext();
                C12880j.m40222a((Object) context, "imageView.context");
                num = Integer.valueOf(C5837i.m18839b(context, C7149b.assetPlaceholder, this.f15845c.f15836a, false, 4, null));
            } else {
                num = cVar.mo20002j();
            }
            cVar.mo19992c(num);
            cVar.mo19996e(Integer.valueOf(this.f15842Y));
            cVar.mo19984a(this.f15843Z ? C7148b.f15799c : C7147a.f15798c);
            cVar.mo19986a(this.f15844a0 ? C7161b.SOURCE : C7161b.JPEG);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20008a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C7164a(null);
    }

    public C7163h(C11868a<C7159g> aVar) {
        this.f15837b = aVar;
    }

    /* renamed from: a */
    private final C7159g m21724a() {
        return (C7159g) this.f15837b.get();
    }

    /* renamed from: a */
    public void mo17648a(ImageView imageView, String str, int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3) {
        int a;
        StringBuilder sb = new StringBuilder();
        sb.append("Resolved placeholder: ");
        sb.append(this.f15836a.resourceId);
        sb.append(" default: ");
        sb.append(C7150c.image_placeholder);
        C14100a.m44529c(sb.toString(), new Object[0]);
        if (num2 != null) {
            a = m21721a(num2.intValue());
        } else if (imageView.getWidth() > 0) {
            a = m21721a(imageView.getWidth());
        } else if (imageView.getMaxWidth() != Integer.MAX_VALUE) {
            a = imageView.getMaxWidth();
        } else {
            a = m21722a(imageView);
        }
        int i2 = a;
        C7159g a2 = m21724a();
        C7165b bVar = new C7165b(this, i, num, z3, imageView, i2, z2, z);
        ImageView imageView2 = imageView;
        String str2 = str;
        a2.mo19957a(imageView, str, bVar);
    }

    /* renamed from: a */
    private final int m21722a(ImageView imageView) {
        Resources resources = imageView.getResources();
        C12880j.m40222a((Object) resources, "imageView.resources");
        return resources.getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    private final int m21721a(int i) {
        return (int) Math.ceil((((double) i) / 50.0d) * 50.0d);
    }
}
