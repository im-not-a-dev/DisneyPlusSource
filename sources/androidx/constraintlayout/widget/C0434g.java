package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;

/* renamed from: androidx.constraintlayout.widget.g */
/* compiled from: Placeholder */
public class C0434g extends View {

    /* renamed from: U */
    private View f1986U;

    /* renamed from: V */
    private int f1987V;

    /* renamed from: c */
    private int f1988c;

    /* renamed from: a */
    public void mo2452a(ConstraintLayout constraintLayout) {
        if (this.f1986U != null) {
            C0415c cVar = (C0415c) getLayoutParams();
            C0415c cVar2 = (C0415c) this.f1986U.getLayoutParams();
            cVar2.f1813m0.mo14398t(0);
            cVar.f1813m0.mo14401u(cVar2.f1813m0.mo14316B());
            cVar.f1813m0.mo14384m(cVar2.f1813m0.mo14381l());
            cVar2.f1813m0.mo14398t(8);
        }
    }

    /* renamed from: b */
    public void mo2453b(ConstraintLayout constraintLayout) {
        if (this.f1988c == -1 && !isInEditMode()) {
            setVisibility(this.f1987V);
        }
        this.f1986U = constraintLayout.findViewById(this.f1988c);
        View view = this.f1986U;
        if (view != null) {
            ((C0415c) view.getLayoutParams()).f1789a0 = true;
            this.f1986U.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1986U;
    }

    public int getEmptyVisibility() {
        return this.f1987V;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, 1, rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.f1988c != i) {
            View view = this.f1986U;
            if (view != null) {
                view.setVisibility(0);
                ((C0415c) this.f1986U.getLayoutParams()).f1789a0 = false;
                this.f1986U = null;
            }
            this.f1988c = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1987V = i;
    }
}
