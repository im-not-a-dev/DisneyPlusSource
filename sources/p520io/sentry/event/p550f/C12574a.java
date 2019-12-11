package p520io.sentry.event.p550f;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: io.sentry.event.f.a */
/* compiled from: DebugMetaInterface */
public class C12574a implements C12582h {

    /* renamed from: c */
    private ArrayList<C12575a> f29135c = new ArrayList<>();

    /* renamed from: io.sentry.event.f.a$a */
    /* compiled from: DebugMetaInterface */
    public static class C12575a implements Serializable {

        /* renamed from: U */
        private final String f29136U;

        /* renamed from: c */
        private final String f29137c;

        public C12575a(String str) {
            this(str, "proguard");
        }

        /* renamed from: a */
        public String mo30768a() {
            return this.f29136U;
        }

        /* renamed from: b */
        public String mo30769b() {
            return this.f29137c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DebugImage{uuid='");
            sb.append(this.f29137c);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.f29136U);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public C12575a(String str, String str2) {
            this.f29137c = str;
            this.f29136U = str2;
        }
    }

    /* renamed from: Z */
    public String mo30763Z() {
        return "debug_meta";
    }

    /* renamed from: a */
    public ArrayList<C12575a> mo30764a() {
        return this.f29135c;
    }

    public int hashCode() {
        return this.f29135c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebugMetaInterface{debugImages=");
        sb.append(this.f29135c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public void mo30765a(C12575a aVar) {
        this.f29135c.add(aVar);
    }
}
