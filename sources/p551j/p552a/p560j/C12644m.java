package p551j.p552a.p560j;

import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.PasswordAuthentication;

/* renamed from: j.a.j.m */
/* compiled from: ProxyAuthenticator */
public class C12644m extends Authenticator {

    /* renamed from: a */
    private String f29320a;

    /* renamed from: b */
    private String f29321b;

    public C12644m(String str, String str2) {
        this.f29320a = str;
        this.f29321b = str2;
    }

    /* access modifiers changed from: protected */
    public PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == RequestorType.PROXY) {
            return new PasswordAuthentication(this.f29320a, this.f29321b.toCharArray());
        }
        return null;
    }
}
