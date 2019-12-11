package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.e */
/* compiled from: ImageViewCompat */
public class C0509e {
    /* renamed from: a */
    public static ColorStateList m2750a(ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        return imageView instanceof C0517l ? ((C0517l) imageView).getSupportImageTintList() : null;
    }

    /* renamed from: b */
    public static Mode m2753b(ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        return imageView instanceof C0517l ? ((C0517l) imageView).getSupportImageTintMode() : null;
    }

    /* renamed from: a */
    public static void m2751a(ImageView imageView, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C0517l) {
            ((C0517l) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2752a(ImageView imageView, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C0517l) {
            ((C0517l) imageView).setSupportImageTintMode(mode);
        }
    }
}
