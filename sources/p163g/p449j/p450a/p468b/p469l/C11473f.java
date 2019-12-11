package p163g.p449j.p450a.p468b.p469l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: g.j.a.b.l.f */
/* compiled from: ImageMatrixProperty */
public class C11473f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f26824a = new Matrix();

    public C11473f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f26824a.set(imageView.getImageMatrix());
        return this.f26824a;
    }
}
