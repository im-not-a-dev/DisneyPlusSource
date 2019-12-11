package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.C9923j;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.util.C9951o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
public final class C10156p4 extends C9989a3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10126m8 f23848a;

    /* renamed from: b */
    private Boolean f23849b;

    /* renamed from: c */
    private String f23850c;

    public C10156p4(C10126m8 m8Var) {
        this(m8Var, null);
    }

    /* renamed from: a */
    public final void mo25621a(C10084j jVar, C10028d9 d9Var) {
        C9908u.m30853a(jVar);
        m31779b(d9Var, false);
        m31777a((Runnable) new C10013c5(this, jVar, d9Var));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C10084j mo26064b(C10084j jVar, C10028d9 d9Var) {
        boolean z = false;
        if ("_cmp".equals(jVar.f23562c)) {
            C10073i iVar = jVar.f23559U;
            if (!(iVar == null || iVar.size() == 0)) {
                String c = jVar.f23559U.mo25786c("_cis");
                if (!TextUtils.isEmpty(c) && (("referrer broadcast".equals(c) || "referrer API".equals(c)) && this.f23848a.mo25934g().mo25828l(d9Var.f23379c))) {
                    z = true;
                }
            }
        }
        if (!z) {
            return jVar;
        }
        this.f23848a.mo25898e().mo25880z().mo25909a("Event has been filtered ", jVar.toString());
        C10084j jVar2 = new C10084j("_cmpx", jVar.f23559U, jVar.f23560V, jVar.f23561W);
        return jVar2;
    }

    /* renamed from: c */
    public final void mo25626c(C10028d9 d9Var) {
        m31779b(d9Var, false);
        m31777a((Runnable) new C10090j5(this, d9Var));
    }

    /* renamed from: d */
    public final void mo25627d(C10028d9 d9Var) {
        m31779b(d9Var, false);
        m31777a((Runnable) new C10187s4(this, d9Var));
    }

    private C10156p4(C10126m8 m8Var, String str) {
        C9908u.m30853a(m8Var);
        this.f23848a = m8Var;
        this.f23850c = null;
    }

    /* renamed from: a */
    public final void mo25622a(C10084j jVar, String str, String str2) {
        C9908u.m30853a(jVar);
        C9908u.m30863b(str);
        m31778a(str, true);
        m31777a((Runnable) new C10002b5(this, jVar, str));
    }

    /* renamed from: a */
    public final byte[] mo25624a(C10084j jVar, String str) {
        C9908u.m30863b(str);
        C9908u.m30853a(jVar);
        m31778a(str, true);
        this.f23848a.mo25898e().mo25868A().mo25909a("Log and bundle. event", this.f23848a.mo25946s().mo25795a(jVar.f23562c));
        long b = this.f23848a.mo25896c().mo25473b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f23848a.mo25897d().mo25801b((Callable<V>) new C10035e5<V>(this, jVar, str)).get();
            if (bArr == null) {
                this.f23848a.mo25898e().mo25874t().mo25909a("Log and bundle returned null. appId", C10099k3.m31423a(str));
                bArr = new byte[0];
            }
            this.f23848a.mo25898e().mo25868A().mo25911a("Log and bundle processed. event, size, time_ms", this.f23848a.mo25946s().mo25795a(jVar.f23562c), Integer.valueOf(bArr.length), Long.valueOf((this.f23848a.mo25896c().mo25473b() / 1000000) - b));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f23848a.mo25898e().mo25874t().mo25911a("Failed to log and bundle. appId, event, error", C10099k3.m31423a(str), this.f23848a.mo25946s().mo25795a(jVar.f23562c), e);
            return null;
        }
    }

    /* renamed from: b */
    private final void m31779b(C10028d9 d9Var, boolean z) {
        C9908u.m30853a(d9Var);
        m31778a(d9Var.f23379c, false);
        this.f23848a.mo25947t().mo26239d(d9Var.f23371U, d9Var.f23388k0);
    }

    /* renamed from: b */
    public final void mo25625b(C10028d9 d9Var) {
        m31778a(d9Var.f23379c, false);
        m31777a((Runnable) new C10257z4(this, d9Var));
    }

    /* renamed from: a */
    public final void mo25623a(C10201t8 t8Var, C10028d9 d9Var) {
        C9908u.m30853a(t8Var);
        m31779b(d9Var, false);
        if (t8Var.mo26106c() == null) {
            m31777a((Runnable) new C10024d5(this, t8Var, d9Var));
        } else {
            m31777a((Runnable) new C10068h5(this, t8Var, d9Var));
        }
    }

    /* renamed from: a */
    public final List<C10201t8> mo25613a(C10028d9 d9Var, boolean z) {
        m31779b(d9Var, false);
        try {
            List<C10221v8> list = (List) this.f23848a.mo25897d().mo25799a((Callable<V>) new C10057g5<V>(this, d9Var)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C10221v8 v8Var : list) {
                if (z || !C10251y8.m31988h(v8Var.f24006c)) {
                    arrayList.add(new C10201t8(v8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f23848a.mo25898e().mo25874t().mo25910a("Failed to get user attributes. appId", C10099k3.m31423a(d9Var.f23379c), e);
            return null;
        }
    }

    /* renamed from: a */
    private final void m31778a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f23849b == null) {
                        if (!"com.google.android.gms".equals(this.f23850c) && !C9951o.m31001a(this.f23848a.mo25895b(), Binder.getCallingUid())) {
                            if (!C9923j.m30933a(this.f23848a.mo25895b()).mo25450a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f23849b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f23849b = Boolean.valueOf(z2);
                    }
                    if (this.f23849b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f23848a.mo25898e().mo25874t().mo25909a("Measurement Service called with invalid calling package. appId", C10099k3.m31423a(str));
                    throw e;
                }
            }
            if (this.f23850c == null && C9832i.m30627a(this.f23848a.mo25895b(), Binder.getCallingUid(), str)) {
                this.f23850c = str;
            }
            if (!str.equals(this.f23850c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        String str2 = "Measurement Service called without app package";
        this.f23848a.mo25898e().mo25874t().mo25908a(str2);
        throw new SecurityException(str2);
    }

    /* renamed from: a */
    public final void mo25618a(long j, String str, String str2, String str3) {
        C10079i5 i5Var = new C10079i5(this, str2, str3, str, j);
        m31777a((Runnable) i5Var);
    }

    /* renamed from: a */
    public final String mo25612a(C10028d9 d9Var) {
        m31779b(d9Var, false);
        return this.f23848a.mo25932d(d9Var);
    }

    /* renamed from: a */
    public final void mo25620a(C10061g9 g9Var, C10028d9 d9Var) {
        C9908u.m30853a(g9Var);
        C9908u.m30853a(g9Var.f23495V);
        m31779b(d9Var, false);
        C10061g9 g9Var2 = new C10061g9(g9Var);
        g9Var2.f23502c = d9Var.f23379c;
        if (g9Var.f23495V.mo26106c() == null) {
            m31777a((Runnable) new C10177r4(this, g9Var2, d9Var));
        } else {
            m31777a((Runnable) new C10207u4(this, g9Var2, d9Var));
        }
    }

    /* renamed from: a */
    public final void mo25619a(C10061g9 g9Var) {
        C9908u.m30853a(g9Var);
        C9908u.m30853a(g9Var.f23495V);
        m31778a(g9Var.f23502c, true);
        C10061g9 g9Var2 = new C10061g9(g9Var);
        if (g9Var.f23495V.mo26106c() == null) {
            m31777a((Runnable) new C10197t4(this, g9Var2));
        } else {
            m31777a((Runnable) new C10227w4(this, g9Var2));
        }
    }

    /* renamed from: a */
    public final List<C10201t8> mo25617a(String str, String str2, boolean z, C10028d9 d9Var) {
        m31779b(d9Var, false);
        try {
            List<C10221v8> list = (List) this.f23848a.mo25897d().mo25799a((Callable<V>) new C10217v4<V>(this, d9Var, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C10221v8 v8Var : list) {
                if (z || !C10251y8.m31988h(v8Var.f24006c)) {
                    arrayList.add(new C10201t8(v8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f23848a.mo25898e().mo25874t().mo25910a("Failed to get user attributes. appId", C10099k3.m31423a(d9Var.f23379c), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C10201t8> mo25616a(String str, String str2, String str3, boolean z) {
        m31778a(str, true);
        try {
            List<C10221v8> list = (List) this.f23848a.mo25897d().mo25799a((Callable<V>) new C10247y4<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C10221v8 v8Var : list) {
                if (z || !C10251y8.m31988h(v8Var.f24006c)) {
                    arrayList.add(new C10201t8(v8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f23848a.mo25898e().mo25874t().mo25910a("Failed to get user attributes. appId", C10099k3.m31423a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C10061g9> mo25614a(String str, String str2, C10028d9 d9Var) {
        m31779b(d9Var, false);
        try {
            return (List) this.f23848a.mo25897d().mo25799a((Callable<V>) new C10237x4<V>(this, d9Var, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f23848a.mo25898e().mo25874t().mo25909a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C10061g9> mo25615a(String str, String str2, String str3) {
        m31778a(str, true);
        try {
            return (List) this.f23848a.mo25897d().mo25799a((Callable<V>) new C9991a5<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f23848a.mo25898e().mo25874t().mo25909a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    private final void m31777a(Runnable runnable) {
        C9908u.m30853a(runnable);
        if (this.f23848a.mo25897d().mo25804t()) {
            runnable.run();
        } else {
            this.f23848a.mo25897d().mo25800a(runnable);
        }
    }
}
