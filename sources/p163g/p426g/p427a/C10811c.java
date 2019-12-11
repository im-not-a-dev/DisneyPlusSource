package p163g.p426g.p427a;

import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import p163g.p426g.p436g.C10879h;

/* renamed from: g.g.a.c */
/* compiled from: ClientSettings */
public class C10811c {

    /* renamed from: a */
    public String f25550a;

    /* renamed from: b */
    public int f25551b;

    /* renamed from: c */
    public String f25552c;

    public C10811c(String str) {
        this.f25550a = null;
        this.f25551b = 20;
        this.f25552c = "https://cws.conviva.com";
        if (str == null || str.isEmpty()) {
            Log.e("CONVIVA : ", "SDK NOT ready due to lack of customerKey");
        } else {
            this.f25550a = str;
        }
    }

    /* renamed from: b */
    private void m34081b() {
        int i = this.f25551b;
        this.f25551b = 20;
        int a = C10879h.m34317a(i);
        if (a == i) {
            this.f25551b = a;
        }
        String str = this.f25552c;
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(this.f25550a);
        sb.append(".cws.conviva.com");
        this.f25552c = sb.toString();
        if (C10879h.m34318a(str)) {
            try {
                if (!new URL("https://cws.conviva.com").getHost().equals(new URL(str).getHost())) {
                    this.f25552c = str;
                }
            } catch (MalformedURLException unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo27846a() {
        return this.f25550a != null;
    }

    public C10811c(C10811c cVar) {
        this(cVar.f25550a);
        this.f25552c = cVar.f25552c;
        this.f25551b = cVar.f25551b;
        m34081b();
    }
}
