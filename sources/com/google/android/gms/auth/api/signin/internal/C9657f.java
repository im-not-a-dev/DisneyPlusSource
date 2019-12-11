package com.google.android.gms.auth.api.signin.internal;

import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.api.C9702g;
import com.google.android.gms.common.api.C9704h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C9766n;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p398n.C9927a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
public final class C9657f implements Runnable {

    /* renamed from: V */
    private static final C9927a f22674V = new C9927a("RevokeAccessOperation", new String[0]);

    /* renamed from: U */
    private final C9766n f22675U = new C9766n(null);

    /* renamed from: c */
    private final String f22676c;

    private C9657f(String str) {
        C9908u.m30863b(str);
        this.f22676c = str;
    }

    /* renamed from: a */
    public static C9702g<Status> m29997a(String str) {
        if (str == null) {
            return C9704h.m30133a(new Status(4), null);
        }
        C9657f fVar = new C9657f(str);
        new Thread(fVar).start();
        return fVar.f22675U;
    }

    public final void run() {
        Status status = Status.f22697Z;
        try {
            String str = "https://accounts.google.com/o/oauth2/revoke?token=";
            String valueOf = String.valueOf(this.f22676c);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f22695X;
            } else {
                f22674V.mo25454b("Unable to revoke access!", new Object[0]);
            }
            C9927a aVar = f22674V;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.mo25452a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C9927a aVar2 = f22674V;
            String str2 = "IOException when revoking access: ";
            String valueOf2 = String.valueOf(e.toString());
            aVar2.mo25454b(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
        } catch (Exception e2) {
            C9927a aVar3 = f22674V;
            String str3 = "Exception when revoking access: ";
            String valueOf3 = String.valueOf(e2.toString());
            aVar3.mo25454b(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), new Object[0]);
        }
        this.f22675U.mo25086a(status);
    }
}
