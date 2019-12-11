package p163g.p413f.p414a;

import com.bumptech.glide.load.C8108d;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.C8117k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p332m.C8124e;
import com.bumptech.glide.load.p332m.C8124e.C8125a;
import com.bumptech.glide.load.p332m.C8126f;
import com.bumptech.glide.load.p334n.C8225i;
import com.bumptech.glide.load.p334n.C8255t;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8308o;
import com.bumptech.glide.load.p339o.C8309p;
import com.bumptech.glide.load.p341p.p347h.C8429e;
import com.bumptech.glide.load.p341p.p347h.C8430f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.p419t.C10714a;
import p163g.p413f.p414a.p419t.C10716b;
import p163g.p413f.p414a.p419t.C10717c;
import p163g.p413f.p414a.p419t.C10718d;
import p163g.p413f.p414a.p419t.C10719e;
import p163g.p413f.p414a.p419t.C10721f;
import p163g.p413f.p414a.p424w.p425l.C10777a;

/* renamed from: g.f.a.l */
/* compiled from: Registry */
public class C10659l {

    /* renamed from: a */
    private final C8309p f25166a = new C8309p(this.f25175j);

    /* renamed from: b */
    private final C10714a f25167b = new C10714a();

    /* renamed from: c */
    private final C10719e f25168c = new C10719e();

    /* renamed from: d */
    private final C10721f f25169d = new C10721f();

    /* renamed from: e */
    private final C8126f f25170e = new C8126f();

    /* renamed from: f */
    private final C8430f f25171f = new C8430f();

    /* renamed from: g */
    private final C10716b f25172g = new C10716b();

    /* renamed from: h */
    private final C10718d f25173h = new C10718d();

    /* renamed from: i */
    private final C10717c f25174i = new C10717c();

    /* renamed from: j */
    private final C4114f<List<Throwable>> f25175j = C10777a.m34042b();

    /* renamed from: g.f.a.l$a */
    /* compiled from: Registry */
    public static class C10660a extends RuntimeException {
        public C10660a(String str) {
            super(str);
        }
    }

    /* renamed from: g.f.a.l$b */
    /* compiled from: Registry */
    public static final class C10661b extends C10660a {
        public C10661b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: g.f.a.l$c */
    /* compiled from: Registry */
    public static class C10662c extends C10660a {
        public C10662c(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders forMODEL: ");
            sb.append(obj);
            super(sb.toString());
        }

        public C10662c(Class<?> cls, Class<?> cls2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders forMODEL: ");
            sb.append(cls);
            sb.append(" and data: ");
            sb.append(cls2);
            super(sb.toString());
        }
    }

    /* renamed from: g.f.a.l$d */
    /* compiled from: Registry */
    public static class C10663d extends C10660a {
        public C10663d(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find result encoder for resource class: ");
            sb.append(cls);
            sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(sb.toString());
        }
    }

    /* renamed from: g.f.a.l$e */
    /* compiled from: Registry */
    public static class C10664e extends C10660a {
        public C10664e(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find source encoder for data class: ");
            sb.append(cls);
            super(sb.toString());
        }
    }

    public C10659l() {
        mo27553a(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: c */
    private <Data, TResource, Transcode> List<C8225i<Data, TResource, Transcode>> m33446c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f25168c.mo27681b(cls, cls2)) {
            for (Class cls5 : this.f25171f.mo21643b(cls4, cls3)) {
                C8225i iVar = new C8225i(cls, cls4, cls5, this.f25168c.mo27678a(cls, cls4), this.f25171f.mo21641a(cls4, cls5), this.f25175j);
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> C10659l mo27547a(Class<Data> cls, C8108d<Data> dVar) {
        this.f25167b.mo27669a(cls, dVar);
        return this;
    }

    /* renamed from: b */
    public <Model, Data> C10659l mo27557b(Class<Model> cls, Class<Data> cls2, C8308o<? extendsMODEL, ? extends Data> oVar) {
        this.f25166a.mo21488b(cls, cls2, oVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> C10659l mo27549a(Class<Data> cls, Class<TResource> cls2, C8116j<Data, TResource> jVar) {
        mo27552a("legacy_append", cls, cls2, jVar);
        return this;
    }

    /* renamed from: b */
    public <Model, TResource, Transcode> List<Class<?>> mo27558b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f25173h.mo27676a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class b : this.f25166a.mo21485a(cls)) {
                for (Class cls4 : this.f25168c.mo27681b(b, cls2)) {
                    if (!this.f25171f.mo21643b(cls4, cls3).isEmpty() && !a.contains(cls4)) {
                        a.add(cls4);
                    }
                }
            }
            this.f25173h.mo27677a(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: a */
    public <Data, TResource> C10659l mo27552a(String str, Class<Data> cls, Class<TResource> cls2, C8116j<Data, TResource> jVar) {
        this.f25168c.mo27679a(str, jVar, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final C10659l mo27553a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f25168c.mo27680a((List<String>) arrayList);
        return this;
    }

    /* renamed from: a */
    public <TResource> C10659l mo27548a(Class<TResource> cls, C8117k<TResource> kVar) {
        this.f25169d.mo27684a(cls, kVar);
        return this;
    }

    /* renamed from: a */
    public C10659l mo27546a(C8125a<?> aVar) {
        this.f25170e.mo21186a(aVar);
        return this;
    }

    /* renamed from: a */
    public <TResource, Transcode> C10659l mo27551a(Class<TResource> cls, Class<Transcode> cls2, C8429e<TResource, Transcode> eVar) {
        this.f25171f.mo21642a(cls, cls2, eVar);
        return this;
    }

    /* renamed from: a */
    public C10659l mo27545a(ImageHeaderParser imageHeaderParser) {
        this.f25172g.mo27672a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public <Model, Data> C10659l mo27550a(Class<Model> cls, Class<Data> cls2, C8308o<Model, Data> oVar) {
        this.f25166a.mo21487a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C8255t<Data, TResource, Transcode> mo27544a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C8255t<Data, TResource, Transcode> a = this.f25174i.mo27673a(cls, cls2, cls3);
        if (this.f25174i.mo27675a(a)) {
            return null;
        }
        if (a == null) {
            List c = m33446c(cls, cls2, cls3);
            if (c.isEmpty()) {
                a = null;
            } else {
                a = new C8255t<>(cls, cls2, cls3, c, this.f25175j);
            }
            this.f25174i.mo27674a(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: c */
    public <X> C8108d<X> mo27560c(X x) throws C10664e {
        C8108d<X> a = this.f25167b.mo27668a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new C10664e(x.getClass());
    }

    /* renamed from: b */
    public boolean mo27559b(C8258v<?> vVar) {
        return this.f25169d.mo27683a(vVar.mo21409b()) != null;
    }

    /* renamed from: b */
    public <X> C8124e<X> mo27556b(X x) {
        return this.f25170e.mo21185a(x);
    }

    /* renamed from: a */
    public <X> C8117k<X> mo27543a(C8258v<X> vVar) throws C10663d {
        C8117k<X> a = this.f25169d.mo27683a(vVar.mo21409b());
        if (a != null) {
            return a;
        }
        throw new C10663d(vVar.mo21409b());
    }

    /* renamed from: a */
    public <Model> List<C8306n<Model, ?>> mo27555a(ModelMODEL) {
        List<C8306n<Model, ?>> a = this.f25166a.mo21486a(model);
        if (!a.isEmpty()) {
            return a;
        }
        throw new C10662c(model);
    }

    /* renamed from: a */
    public List<ImageHeaderParser> mo27554a() {
        List<ImageHeaderParser> a = this.f25172g.mo27671a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new C10661b();
    }
}
