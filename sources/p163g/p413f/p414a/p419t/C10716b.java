package p163g.p413f.p414a.p419t;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g.f.a.t.b */
/* compiled from: ImageHeaderParserRegistry */
public final class C10716b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f25331a = new ArrayList();

    /* renamed from: a */
    public synchronized List<ImageHeaderParser> mo27671a() {
        return this.f25331a;
    }

    /* renamed from: a */
    public synchronized void mo27672a(ImageHeaderParser imageHeaderParser) {
        this.f25331a.add(imageHeaderParser);
    }
}
