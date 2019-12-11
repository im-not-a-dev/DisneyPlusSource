package p163g.p500m.p501a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import okio.Buffer;
import okio.BufferedSource;
import okio.C14280f;
import p163g.p500m.p501a.C11737m.C11740c;

/* renamed from: g.m.a.h */
/* compiled from: JsonAdapter */
public abstract class C11725h<T> {

    /* renamed from: g.m.a.h$a */
    /* compiled from: JsonAdapter */
    class C11726a extends C11725h<T> {

        /* renamed from: a */
        final /* synthetic */ C11725h f27292a;

        C11726a(C11725h hVar, C11725h hVar2) {
            this.f27292a = hVar2;
        }

        public T fromJson(C11737m mVar) throws IOException {
            return this.f27292a.fromJson(mVar);
        }

        /* access modifiers changed from: 0000 */
        public boolean isLenient() {
            return this.f27292a.isLenient();
        }

        public void toJson(C11747s sVar, T t) throws IOException {
            boolean g = sVar.mo29815g();
            sVar.mo29811b(true);
            try {
                this.f27292a.toJson(sVar, t);
            } finally {
                sVar.mo29811b(g);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27292a);
            sb.append(".serializeNulls()");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.h$b */
    /* compiled from: JsonAdapter */
    class C11727b extends C11725h<T> {

        /* renamed from: a */
        final /* synthetic */ C11725h f27293a;

        C11727b(C11725h hVar, C11725h hVar2) {
            this.f27293a = hVar2;
        }

        public T fromJson(C11737m mVar) throws IOException {
            if (mVar.peek() == C11740c.NULL) {
                return mVar.mo29778m();
            }
            return this.f27293a.fromJson(mVar);
        }

        /* access modifiers changed from: 0000 */
        public boolean isLenient() {
            return this.f27293a.isLenient();
        }

        public void toJson(C11747s sVar, T t) throws IOException {
            if (t == null) {
                sVar.mo29800i();
            } else {
                this.f27293a.toJson(sVar, t);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27293a);
            sb.append(".nullSafe()");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.h$c */
    /* compiled from: JsonAdapter */
    class C11728c extends C11725h<T> {

        /* renamed from: a */
        final /* synthetic */ C11725h f27294a;

        C11728c(C11725h hVar, C11725h hVar2) {
            this.f27294a = hVar2;
        }

        public T fromJson(C11737m mVar) throws IOException {
            if (mVar.peek() != C11740c.NULL) {
                return this.f27294a.fromJson(mVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected null at ");
            sb.append(mVar.mo29775j0());
            throw new C11734j(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public boolean isLenient() {
            return this.f27294a.isLenient();
        }

        public void toJson(C11747s sVar, T t) throws IOException {
            if (t != null) {
                this.f27294a.toJson(sVar, t);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected null at ");
            sb.append(sVar.mo29818j0());
            throw new C11734j(sb.toString());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27294a);
            sb.append(".nonNull()");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.h$d */
    /* compiled from: JsonAdapter */
    class C11729d extends C11725h<T> {

        /* renamed from: a */
        final /* synthetic */ C11725h f27295a;

        C11729d(C11725h hVar, C11725h hVar2) {
            this.f27295a = hVar2;
        }

        public T fromJson(C11737m mVar) throws IOException {
            boolean g = mVar.mo29771g();
            mVar.mo29765b(true);
            try {
                return this.f27295a.fromJson(mVar);
            } finally {
                mVar.mo29765b(g);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean isLenient() {
            return true;
        }

        public void toJson(C11747s sVar, T t) throws IOException {
            boolean h = sVar.mo29816h();
            sVar.mo29809a(true);
            try {
                this.f27295a.toJson(sVar, t);
            } finally {
                sVar.mo29809a(h);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27295a);
            sb.append(".lenient()");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.h$e */
    /* compiled from: JsonAdapter */
    class C11730e extends C11725h<T> {

        /* renamed from: a */
        final /* synthetic */ C11725h f27296a;

        C11730e(C11725h hVar, C11725h hVar2) {
            this.f27296a = hVar2;
        }

        public T fromJson(C11737m mVar) throws IOException {
            boolean e = mVar.mo29769e();
            mVar.mo29761a(true);
            try {
                return this.f27296a.fromJson(mVar);
            } finally {
                mVar.mo29761a(e);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean isLenient() {
            return this.f27296a.isLenient();
        }

        public void toJson(C11747s sVar, T t) throws IOException {
            this.f27296a.toJson(sVar, t);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27296a);
            sb.append(".failOnUnknown()");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.h$f */
    /* compiled from: JsonAdapter */
    class C11731f extends C11725h<T> {

        /* renamed from: a */
        final /* synthetic */ C11725h f27297a;

        /* renamed from: b */
        final /* synthetic */ String f27298b;

        C11731f(C11725h hVar, C11725h hVar2, String str) {
            this.f27297a = hVar2;
            this.f27298b = str;
        }

        public T fromJson(C11737m mVar) throws IOException {
            return this.f27297a.fromJson(mVar);
        }

        /* access modifiers changed from: 0000 */
        public boolean isLenient() {
            return this.f27297a.isLenient();
        }

        public void toJson(C11747s sVar, T t) throws IOException {
            String f = sVar.mo29814f();
            sVar.mo29797f(this.f27298b);
            try {
                this.f27297a.toJson(sVar, t);
            } finally {
                sVar.mo29797f(f);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27297a);
            sb.append(".indent(\"");
            sb.append(this.f27298b);
            sb.append("\")");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.h$g */
    /* compiled from: JsonAdapter */
    public interface C11732g {
        /* renamed from: a */
        C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar);
    }

    public final C11725h<T> failOnUnknown() {
        return new C11730e(this, this);
    }

    public abstract T fromJson(C11737m mVar) throws IOException;

    public final T fromJson(BufferedSource bufferedSource) throws IOException {
        return fromJson(C11737m.m37702a(bufferedSource));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson((C11737m) new C11744q(obj));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public C11725h<T> indent(String str) {
        if (str != null) {
            return new C11731f(this, this, str);
        }
        throw new NullPointerException("indent == null");
    }

    /* access modifiers changed from: 0000 */
    public boolean isLenient() {
        return false;
    }

    public final C11725h<T> lenient() {
        return new C11729d(this, this);
    }

    public final C11725h<T> nonNull() {
        return new C11728c(this, this);
    }

    public final C11725h<T> nullSafe() {
        return new C11727b(this, this);
    }

    public final C11725h<T> serializeNulls() {
        return new C11726a(this, this);
    }

    public abstract void toJson(C11747s sVar, T t) throws IOException;

    public final void toJson(C14280f fVar, T t) throws IOException {
        toJson(C11747s.m37816a(fVar), t);
    }

    public final Object toJsonValue(T t) {
        C11746r rVar = new C11746r();
        try {
            toJson((C11747s) rVar, t);
            return rVar.mo29808l();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final T fromJson(String str) throws IOException {
        C11737m a = C11737m.m37702a((BufferedSource) new Buffer().m45552a(str));
        T fromJson = fromJson(a);
        if (isLenient() || a.peek() == C11740c.END_DOCUMENT) {
            return fromJson;
        }
        throw new C11734j("JSON document was not fully consumed.");
    }

    public final String toJson(T t) {
        Buffer buffer = new Buffer();
        try {
            toJson((C14280f) buffer, t);
            return buffer.mo36327e0();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
