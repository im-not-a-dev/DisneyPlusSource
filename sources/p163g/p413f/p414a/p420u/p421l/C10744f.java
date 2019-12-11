package p163g.p413f.p414a.p420u.p421l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: g.f.a.u.l.f */
/* compiled from: ImageViewTargetFactory */
public class C10744f {
    /* renamed from: a */
    public <Z> C10748j<ImageView, Z> mo27765a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C10738b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C10742d(imageView);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
