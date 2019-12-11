package p551j.p552a.p567p;

import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import p602m.p609c.C13460c;

/* renamed from: j.a.p.a */
/* compiled from: SentryServletRequestListener */
public class C12673a implements ServletRequestListener {

    /* renamed from: a */
    private static final ThreadLocal<HttpServletRequest> f29367a = new ThreadLocal<>();

    static {
        C13460c.m41415a(C12673a.class);
    }

    /* renamed from: a */
    public static HttpServletRequest m39760a() {
        return (HttpServletRequest) f29367a.get();
    }
}
