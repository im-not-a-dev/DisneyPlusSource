package p163g.p201e.p203b.p314r;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J4\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/kidsmode/BackgroundHelperImpl;", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "kidsMode", "", "backgroundLoader", "Lcom/bamtechmedia/dominguez/kidsmode/BackgroundLoader;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(ZLcom/bamtechmedia/dominguez/kidsmode/BackgroundLoader;Landroidx/fragment/app/FragmentActivity;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "isCutAlreadySet", "createAppBitmapDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "drawable", "Landroid/graphics/drawable/Drawable;", "createBitmapDrawable", "bitmapWidth", "", "bitmapHeight", "createBitmap", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "loadAppBackground", "", "view", "Landroid/view/View;", "loadCutHeightBackground", "viewHeight", "loadFitBackground", "imageView", "Landroid/widget/ImageView;", "loadNavBackground", "kidsMode_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.r.a */
/* compiled from: BackgroundHelperImpl.kt */
public final class C7720a implements C3848a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final DisplayMetrics f16776a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f16777b;

    /* renamed from: c */
    private final boolean f16778c;

    /* renamed from: d */
    private final C7727c f16779d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0532d f16780e;

    /* renamed from: g.e.b.r.a$a */
    /* compiled from: BackgroundHelperImpl.kt */
    static final class C7721a extends C12881k implements Function1<Bitmap, BitmapDrawable> {

        /* renamed from: c */
        final /* synthetic */ C7720a f16781c;

        C7721a(C7720a aVar) {
            this.f16781c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final BitmapDrawable invoke(Bitmap bitmap) {
            return new BitmapDrawable(this.f16781c.f16780e.getResources(), bitmap);
        }
    }

    /* renamed from: g.e.b.r.a$b */
    /* compiled from: BackgroundHelperImpl.kt */
    static final class C7722b extends C12881k implements Function1<Drawable, BitmapDrawable> {

        /* renamed from: U */
        final /* synthetic */ View f16782U;

        /* renamed from: c */
        final /* synthetic */ C7720a f16783c;

        C7722b(C7720a aVar, View view) {
            this.f16783c = aVar;
            this.f16782U = view;
            super(1);
        }

        /* renamed from: a */
        public final BitmapDrawable invoke(Drawable drawable) {
            BitmapDrawable a = this.f16783c.m22764a(drawable);
            View view = this.f16782U;
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f16783c.f16776a.widthPixels;
                layoutParams.height = a != null ? a.getIntrinsicHeight() : 0;
                view.setLayoutParams(layoutParams);
                return a;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    /* renamed from: g.e.b.r.a$c */
    /* compiled from: BackgroundHelperImpl.kt */
    static final class C7723c extends C12881k implements Function1<Drawable, BitmapDrawable> {

        /* renamed from: U */
        final /* synthetic */ int f16784U;

        /* renamed from: c */
        final /* synthetic */ C7720a f16785c;

        C7723c(C7720a aVar, int i) {
            this.f16785c = aVar;
            this.f16784U = i;
            super(1);
        }

        /* renamed from: a */
        public final BitmapDrawable invoke(Drawable drawable) {
            BitmapDrawable a = this.f16785c.m22764a(drawable);
            Bitmap bitmap = a != null ? a.getBitmap() : null;
            if (bitmap == null || this.f16784U > bitmap.getHeight()) {
                return null;
            }
            this.f16785c.f16777b = true;
            return new BitmapDrawable(this.f16785c.f16780e.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f16784U));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Landroid/graphics/drawable/BitmapDrawable;", "it", "Landroid/graphics/drawable/Drawable;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.r.a$d */
    /* compiled from: BackgroundHelperImpl.kt */
    static final class C7724d extends C12881k implements Function1<Drawable, BitmapDrawable> {

        /* renamed from: U */
        final /* synthetic */ View f16786U;

        /* renamed from: c */
        final /* synthetic */ C7720a f16787c;

        /* renamed from: g.e.b.r.a$d$a */
        /* compiled from: BackgroundHelperImpl.kt */
        static final class C7725a extends C12881k implements Function1<Bitmap, BitmapDrawable> {

            /* renamed from: c */
            final /* synthetic */ C7724d f16788c;

            C7725a(C7724d dVar) {
                this.f16788c = dVar;
                super(1);
            }

            /* renamed from: a */
            public final BitmapDrawable invoke(Bitmap bitmap) {
                return new BitmapDrawable(this.f16788c.f16787c.f16780e.getResources(), Bitmap.createBitmap(bitmap, 0, 0, (int) this.f16788c.f16787c.f16780e.getResources().getDimension(C7739h.global_nav_expanded_width), bitmap.getHeight()));
            }
        }

        C7724d(C7720a aVar, View view) {
            this.f16787c = aVar;
            this.f16786U = view;
            super(1);
        }

        /* renamed from: a */
        public final BitmapDrawable invoke(Drawable drawable) {
            View view = this.f16786U;
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = drawable.getIntrinsicHeight();
                view.setLayoutParams(layoutParams);
                C7720a aVar = this.f16787c;
                return aVar.m22765a(drawable, aVar.f16776a.widthPixels, drawable.getIntrinsicHeight(), new C7725a(this));
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public C7720a(boolean z, C7727c cVar, C0532d dVar) {
        this.f16778c = z;
        this.f16779d = cVar;
        this.f16780e = dVar;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = this.f16780e.getWindowManager();
        Intrinsics.checkReturnedValueIsNotNull((Object) windowManager, "activity.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f16776a = displayMetrics;
    }

    /* renamed from: b */
    public void mo13766b(View view) {
        this.f16779d.mo20644a(view, this.f16778c, new C7722b(this, view));
    }

    /* renamed from: a */
    public void mo13764a(View view) {
        this.f16779d.mo20644a(view, this.f16778c, new C7724d(this, view));
    }

    /* renamed from: a */
    public void mo13765a(View view, int i) {
        if (!this.f16777b && i > 0) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
                view.setLayoutParams(layoutParams);
                this.f16779d.mo20644a(view, this.f16778c, new C7723c(this, i));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final BitmapDrawable m22764a(Drawable drawable) {
        int i;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        Context applicationContext = this.f16780e.getApplicationContext();
        String str = "activity.applicationContext";
        Intrinsics.checkReturnedValueIsNotNull((Object) applicationContext, str);
        if (C5837i.m18843e(applicationContext)) {
            i = drawable.getIntrinsicHeight();
        } else {
            Context applicationContext2 = this.f16780e.getApplicationContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) applicationContext2, str);
            if (C5837i.m18842d(applicationContext2)) {
                i = this.f16776a.heightPixels / 2;
            } else {
                i = this.f16776a.widthPixels;
            }
        }
        return m22765a(drawable, intrinsicWidth, i, new C7721a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final BitmapDrawable m22765a(Drawable drawable, int i, int i2, Function1<? super Bitmap, ? extends BitmapDrawable> function1) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        Intrinsics.checkReturnedValueIsNotNull((Object) createBitmap, "bitmap");
        return (BitmapDrawable) function1.invoke(createBitmap);
    }
}
