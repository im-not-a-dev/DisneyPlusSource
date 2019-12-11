package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.p688d0.p697o.C14229c;
import okio.ByteString;

/* renamed from: okhttp3.i */
/* compiled from: CertificatePinner */
public final class C14236i {

    /* renamed from: c */
    public static final C14236i f31740c = new C14237a().mo36183a();

    /* renamed from: a */
    private final Set<C14238b> f31741a;

    /* renamed from: b */
    private final C14229c f31742b;

    /* renamed from: okhttp3.i$a */
    /* compiled from: CertificatePinner */
    public static final class C14237a {

        /* renamed from: a */
        private final List<C14238b> f31743a = new ArrayList();

        /* renamed from: a */
        public C14236i mo36183a() {
            return new C14236i(new LinkedHashSet(this.f31743a), null);
        }
    }

    /* renamed from: okhttp3.i$b */
    /* compiled from: CertificatePinner */
    static final class C14238b {

        /* renamed from: a */
        final String f31744a;

        /* renamed from: b */
        final String f31745b;

        /* renamed from: c */
        final String f31746c;

        /* renamed from: d */
        final ByteString f31747d;

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
            if (r11.regionMatches(false, r6, r7, 0, r7.length()) != false) goto L_0x0032;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo36184a(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = r10.f31744a
                java.lang.String r1 = "*."
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L_0x0033
                r0 = 46
                int r0 = r11.indexOf(r0)
                int r1 = r11.length()
                int r1 = r1 - r0
                r2 = 1
                int r1 = r1 - r2
                java.lang.String r3 = r10.f31745b
                int r3 = r3.length()
                if (r1 != r3) goto L_0x0031
                r5 = 0
                int r6 = r0 + 1
                java.lang.String r7 = r10.f31745b
                r8 = 0
                int r9 = r7.length()
                r4 = r11
                boolean r11 = r4.regionMatches(r5, r6, r7, r8, r9)
                if (r11 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r2 = 0
            L_0x0032:
                return r2
            L_0x0033:
                java.lang.String r0 = r10.f31745b
                boolean r11 = r11.equals(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C14236i.C14238b.mo36184a(java.lang.String):boolean");
        }

        public boolean equals(Object obj) {
            if (obj instanceof C14238b) {
                C14238b bVar = (C14238b) obj;
                if (this.f31744a.equals(bVar.f31744a) && this.f31746c.equals(bVar.f31746c) && this.f31747d.equals(bVar.f31747d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f31744a.hashCode()) * 31) + this.f31746c.hashCode()) * 31) + this.f31747d.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31746c);
            sb.append(this.f31747d.mo36371a());
            return sb.toString();
        }
    }

    C14236i(Set<C14238b> set, C14229c cVar) {
        this.f31741a = set;
        this.f31742b = cVar;
    }

    /* renamed from: b */
    static ByteString m45380b(X509Certificate x509Certificate) {
        return ByteString.m45612a(x509Certificate.getPublicKey().getEncoded()).mo36391j();
    }

    /* renamed from: a */
    public void mo36180a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        String str2;
        List a = mo36178a(str);
        if (!a.isEmpty()) {
            C14229c cVar = this.f31742b;
            if (cVar != null) {
                list = cVar.mo36141a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = a.size();
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C14238b bVar = (C14238b) a.get(i2);
                    if (bVar.f31746c.equals("sha256/")) {
                        if (byteString == null) {
                            byteString = m45380b(x509Certificate);
                        }
                        if (bVar.f31747d.equals(byteString)) {
                            return;
                        }
                    } else if (bVar.f31746c.equals("sha1/")) {
                        if (byteString2 == null) {
                            byteString2 = m45379a(x509Certificate);
                        }
                        if (bVar.f31747d.equals(byteString2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported hashAlgorithm: ");
                        sb.append(bVar.f31746c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                str2 = "\n    ";
                if (i3 >= size3) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append(str2);
                sb2.append(m45378a((Certificate) x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
                i3++;
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = a.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C14238b bVar2 = (C14238b) a.get(i4);
                sb2.append(str2);
                sb2.append(bVar2);
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3.f31741a.equals(r4.f31741a) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof okhttp3.C14236i
            if (r1 == 0) goto L_0x001f
            okhttp3.d0.o.c r1 = r3.f31742b
            okhttp3.i r4 = (okhttp3.C14236i) r4
            okhttp3.d0.o.c r2 = r4.f31742b
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L_0x001f
            java.util.Set<okhttp3.i$b> r1 = r3.f31741a
            java.util.Set<okhttp3.i$b> r4 = r4.f31741a
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C14236i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (Objects.hashCode(this.f31742b) * 31) + this.f31741a.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C14238b> mo36178a(String str) {
        List<C14238b> emptyList = Collections.emptyList();
        for (C14238b bVar : this.f31741a) {
            if (bVar.mo36184a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14236i mo36179a(C14229c cVar) {
        if (Objects.equals(this.f31742b, cVar)) {
            return this;
        }
        return new C14236i(this.f31741a, cVar);
    }

    /* renamed from: a */
    public static String m45378a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder();
            sb.append("sha256/");
            sb.append(m45380b((X509Certificate) certificate).mo36371a());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    static ByteString m45379a(X509Certificate x509Certificate) {
        return ByteString.m45612a(x509Certificate.getPublicKey().getEncoded()).mo36390i();
    }
}
