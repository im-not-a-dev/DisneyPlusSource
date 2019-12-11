package p163g.p413f.p414a;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.load.p334n.C8233k;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p163g.p413f.p414a.p420u.C10730g;
import p163g.p413f.p414a.p420u.C10731h;
import p163g.p413f.p414a.p420u.p421l.C10744f;
import p163g.p413f.p414a.p420u.p421l.C10748j;

/* renamed from: g.f.a.g */
/* compiled from: GlideContext */
public class C10654g extends ContextWrapper {

    /* renamed from: j */
    static final C10670o<?, ?> f25147j = new C10651d();

    /* renamed from: a */
    private final C8154b f25148a;

    /* renamed from: b */
    private final C10659l f25149b;

    /* renamed from: c */
    private final C10744f f25150c;

    /* renamed from: d */
    private final C10731h f25151d;

    /* renamed from: e */
    private final List<C10730g<Object>> f25152e;

    /* renamed from: f */
    private final Map<Class<?>, C10670o<?, ?>> f25153f;

    /* renamed from: g */
    private final C8233k f25154g;

    /* renamed from: h */
    private final boolean f25155h;

    /* renamed from: i */
    private final int f25156i;

    public C10654g(Context context, C8154b bVar, C10659l lVar, C10744f fVar, C10731h hVar, Map<Class<?>, C10670o<?, ?>> map, List<C10730g<Object>> list, C8233k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f25148a = bVar;
        this.f25149b = lVar;
        this.f25150c = fVar;
        this.f25151d = hVar;
        this.f25152e = list;
        this.f25153f = map;
        this.f25154g = kVar;
        this.f25155h = z;
        this.f25156i = i;
    }

    /* renamed from: a */
    public <T> C10670o<?, T> mo27535a(Class<T> cls) {
        C10670o<?, T> oVar = (C10670o) this.f25153f.get(cls);
        if (oVar == null) {
            for (Entry entry : this.f25153f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    oVar = (C10670o) entry.getValue();
                }
            }
        }
        return oVar == null ? f25147j : oVar;
    }

    /* renamed from: b */
    public List<C10730g<Object>> mo27537b() {
        return this.f25152e;
    }

    /* renamed from: c */
    public C10731h mo27538c() {
        return this.f25151d;
    }

    /* renamed from: d */
    public C8233k mo27539d() {
        return this.f25154g;
    }

    /* renamed from: e */
    public int mo27540e() {
        return this.f25156i;
    }

    /* renamed from: f */
    public C10659l mo27541f() {
        return this.f25149b;
    }

    /* renamed from: g */
    public boolean mo27542g() {
        return this.f25155h;
    }

    /* renamed from: a */
    public <X> C10748j<ImageView, X> mo27536a(ImageView imageView, Class<X> cls) {
        return this.f25150c.mo27765a(imageView, cls);
    }

    /* renamed from: a */
    public C8154b mo27534a() {
        return this.f25148a;
    }
}
