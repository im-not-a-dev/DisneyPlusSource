package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
/* compiled from: ActionBarBackgroundDrawable */
class C0203b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f960a;

    public C0203b(ActionBarContainer actionBarContainer) {
        this.f960a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f960a;
        if (actionBarContainer.f691d0) {
            Drawable drawable = actionBarContainer.f690c0;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f687a0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f960a;
        Drawable drawable3 = actionBarContainer2.f688b0;
        if (drawable3 != null && actionBarContainer2.f692e0) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f960a;
        if (actionBarContainer.f691d0) {
            Drawable drawable = actionBarContainer.f690c0;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f687a0;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
