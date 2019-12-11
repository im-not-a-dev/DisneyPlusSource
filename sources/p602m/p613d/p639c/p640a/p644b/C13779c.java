package p602m.p613d.p639c.p640a.p644b;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.c.a.b.c */
/* compiled from: ProviderConfigurationPermission */
public class C13779c extends BasicPermission {

    /* renamed from: U */
    private final int f30595U;

    /* renamed from: c */
    private final String f30596c;

    public C13779c(String str, String str2) {
        super(str, str2);
        this.f30596c = str2;
        this.f30595U = m42297a(str2);
    }

    /* renamed from: a */
    private int m42297a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(C14090j.m44486a(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13779c)) {
            return false;
        }
        C13779c cVar = (C13779c) obj;
        if (this.f30595U != cVar.f30595U || !getName().equals(cVar.getName())) {
            z = false;
        }
        return z;
    }

    public String getActions() {
        return this.f30596c;
    }

    public int hashCode() {
        return getName().hashCode() + this.f30595U;
    }

    public boolean implies(Permission permission) {
        boolean z = false;
        if (!(permission instanceof C13779c) || !getName().equals(permission.getName())) {
            return false;
        }
        C13779c cVar = (C13779c) permission;
        int i = this.f30595U;
        int i2 = cVar.f30595U;
        if ((i & i2) == i2) {
            z = true;
        }
        return z;
    }
}
