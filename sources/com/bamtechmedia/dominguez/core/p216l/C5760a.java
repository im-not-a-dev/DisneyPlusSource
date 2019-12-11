package com.bamtechmedia.dominguez.core.p216l;

import android.widget.ImageView;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004J_\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J[\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0016¢\u0006\u0002\u0010\u001bJ\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0003\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/images/ImageLoader;", "", "()V", "implementation", "Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Implementation;", "initWith", "", "loadImage", "view", "Landroid/widget/ImageView;", "image", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "errorDrawableRes", "", "placeHolderDrawableRes", "dimension", "Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Dimension;", "size", "listener", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "isOriginal", "", "(Landroid/widget/ImageView;Lcom/bamtechmedia/dominguez/core/content/assets/Image;ILjava/lang/Integer;Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Dimension;ILcom/bumptech/glide/request/RequestListener;Z)V", "preferredWidth", "supportTransparency", "ignorePlaceholder", "(Landroid/widget/ImageView;Lcom/bamtechmedia/dominguez/core/content/assets/Image;ILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V", "content", "", "Dimension", "Implementation", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.l.a */
/* compiled from: ImageLoader.kt */
public final class C5760a {

    /* renamed from: a */
    private static C5761a f13519a;

    /* renamed from: b */
    public static final C5760a f13520b = new C5760a();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ]\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H&¢\u0006\u0002\u0010\u0017J]\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0016H&¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000bH'¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Implementation;", "", "download", "", "masterId", "", "widthForCaching", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "loadImage", "imageView", "Landroid/widget/ImageView;", "content", "errorDrawableRes", "placeHolderDrawableRes", "size", "dimension", "Lcom/bamtechmedia/dominguez/core/images/ImageLoader$Dimension;", "listener", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "isOriginal", "", "(Landroid/widget/ImageView;Ljava/lang/String;ILjava/lang/Integer;ILcom/bamtechmedia/dominguez/core/images/ImageLoader$Dimension;Lcom/bumptech/glide/request/RequestListener;Z)V", "preferredWidth", "supportTransparency", "ignorePlaceholder", "(Landroid/widget/ImageView;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V", "onNullImageLoaded", "view", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.l.a$a */
    /* compiled from: ImageLoader.kt */
    public interface C5761a {

        /* renamed from: com.bamtechmedia.dominguez.core.l.a$a$a */
        /* compiled from: ImageLoader.kt */
        public static final class C5762a {
            /* renamed from: a */
            public static /* synthetic */ void m18700a(C5761a aVar, ImageView imageView, String str, int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
                int i3 = i2;
                if (obj == null) {
                    aVar.mo17648a(imageView, str, i, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? true : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? false : z3);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
            }
        }

        /* renamed from: a */
        void mo17648a(ImageView imageView, String str, int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3);
    }

    private C5760a() {
    }

    /* renamed from: a */
    public final void mo17647a(C5761a aVar) {
        f13519a = aVar;
    }

    /* renamed from: a */
    public final void mo17646a(ImageView imageView, Image image, int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3) {
        String str = "implementation";
        if (image != null) {
            C5761a aVar = f13519a;
            if (aVar != null) {
                String U = image.mo13085U();
                if (U == null) {
                    U = image.getUrl();
                }
                aVar.mo17648a(imageView, U, i, num, num2, z, z2, z3);
                return;
            }
            C12880j.m40227c(str);
            throw null;
        }
        C5761a aVar2 = f13519a;
        if (aVar2 != null) {
            C5762a.m18700a(aVar2, imageView, "", i, num2, null, false, false, false, 240, null);
            return;
        }
        C12880j.m40227c(str);
        throw null;
    }
}
