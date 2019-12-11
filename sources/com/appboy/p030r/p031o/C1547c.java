package com.appboy.p030r.p031o;

import com.appboy.p025o.C1493b;
import com.appboy.p025o.C1494c;
import com.appboy.p025o.C1494c.C1495a;
import com.appboy.p025o.C1496d;
import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import org.json.JSONArray;
import org.json.JSONObject;
import p161f.p162a.C4413c1;
import p161f.p162a.C4472i3;
import p161f.p162a.C4569r3;
import p161f.p162a.C4595u0;
import p161f.p162a.C4639z2;

/* renamed from: com.appboy.r.o.c */
public class C1547c extends Observable implements C1535e<JSONObject> {

    /* renamed from: k0 */
    private static final String f5659k0 = C1557c.m7461a(C1547c.class);

    /* renamed from: U */
    private final Map<String, String> f5660U;

    /* renamed from: V */
    private final String f5661V;

    /* renamed from: W */
    private boolean f5662W = false;

    /* renamed from: X */
    private boolean f5663X = false;

    /* renamed from: Y */
    private boolean f5664Y = false;

    /* renamed from: Z */
    private boolean f5665Z = false;

    /* renamed from: a0 */
    private boolean f5666a0 = false;

    /* renamed from: b0 */
    private final long f5667b0;

    /* renamed from: c */
    private final JSONObject f5668c;

    /* renamed from: c0 */
    private final long f5669c0;

    /* renamed from: d0 */
    private final long f5670d0;

    /* renamed from: e0 */
    private boolean f5671e0 = false;

    /* renamed from: f0 */
    private final EnumSet<C1493b> f5672f0;

    /* renamed from: g0 */
    private boolean f5673g0;

    /* renamed from: h0 */
    private final C4595u0 f5674h0;

    /* renamed from: i0 */
    private final C4639z2 f5675i0;

    /* renamed from: j0 */
    private final C4413c1 f5676j0;

    public C1547c(JSONObject jSONObject, C1495a aVar, C4595u0 u0Var, C4639z2 z2Var, C4413c1 c1Var) {
        this.f5668c = jSONObject;
        this.f5674h0 = u0Var;
        this.f5675i0 = z2Var;
        this.f5676j0 = c1Var;
        this.f5660U = C4569r3.m15870a(jSONObject.optJSONObject(aVar.mo6747a(C1494c.EXTRAS)), (Map<String, String>) new HashMap<String,String>());
        this.f5661V = jSONObject.getString(aVar.mo6747a(C1494c.ID));
        this.f5662W = jSONObject.optBoolean(aVar.mo6747a(C1494c.VIEWED));
        this.f5664Y = jSONObject.optBoolean(aVar.mo6747a(C1494c.DISMISSED), false);
        this.f5665Z = jSONObject.optBoolean(aVar.mo6747a(C1494c.PINNED), false);
        this.f5667b0 = jSONObject.getLong(aVar.mo6747a(C1494c.CREATED));
        this.f5670d0 = jSONObject.optLong(aVar.mo6747a(C1494c.EXPIRES_AT), -1);
        this.f5671e0 = jSONObject.optBoolean(aVar.mo6747a(C1494c.OPEN_URI_IN_WEBVIEW), false);
        jSONObject.optBoolean(aVar.mo6747a(C1494c.REMOVED), false);
        JSONArray optJSONArray = jSONObject.optJSONArray(aVar.mo6747a(C1494c.CATEGORIES));
        if (optJSONArray == null || optJSONArray.length() == 0) {
            this.f5672f0 = EnumSet.of(C1493b.NO_CATEGORY);
        } else {
            this.f5672f0 = EnumSet.noneOf(C1493b.class);
            for (int i = 0; i < optJSONArray.length(); i++) {
                C1493b a = C1493b.m7138a(optJSONArray.getString(i));
                if (a != null) {
                    this.f5672f0.add(a);
                }
            }
        }
        this.f5669c0 = jSONObject.optLong(aVar.mo6747a(C1494c.UPDATED), this.f5667b0);
        this.f5673g0 = jSONObject.optBoolean(aVar.mo6747a(C1494c.DISMISSIBLE), false);
        this.f5663X = jSONObject.optBoolean(aVar.mo6747a(C1494c.READ), this.f5662W);
        this.f5666a0 = jSONObject.optBoolean(aVar.mo6747a(C1494c.CLICKED), false);
    }

    /* renamed from: I */
    public C1496d mo6855I() {
        return C1496d.DEFAULT;
    }

    /* renamed from: J */
    public long mo6865J() {
        return this.f5670d0;
    }

    /* renamed from: K */
    public String mo6866K() {
        return this.f5661V;
    }

    /* renamed from: L */
    public boolean mo6867L() {
        return this.f5673g0;
    }

    /* renamed from: M */
    public boolean mo6868M() {
        return this.f5665Z;
    }

    /* renamed from: N */
    public long mo6869N() {
        return this.f5669c0;
    }

    /* renamed from: O */
    public String mo6856O() {
        return null;
    }

    /* renamed from: P */
    public boolean mo6870P() {
        return this.f5662W;
    }

    /* renamed from: Q */
    public boolean mo6871Q() {
        return mo6865J() != -1 && mo6865J() <= C4472i3.m15480a();
    }

    /* renamed from: R */
    public boolean mo6872R() {
        return this.f5663X;
    }

    /* renamed from: a */
    public boolean mo6874a(C1547c cVar) {
        return this.f5661V.equals(cVar.mo6866K()) && this.f5669c0 == cVar.mo6869N() && this.f5674h0 == cVar.f5674h0;
    }

    /* renamed from: d */
    public void mo6876d(boolean z) {
        this.f5663X = z;
        setChanged();
        notifyObservers();
        if (z) {
            C4639z2 z2Var = this.f5675i0;
            if (z2Var != null) {
                try {
                    z2Var.mo15840a(this.f5661V);
                } catch (Exception e) {
                    C1557c.m7466b(f5659k0, "Failed to mark card indicator as highlighted.", (Throwable) e);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo6877e(boolean z) {
        if (!this.f5664Y || !z) {
            this.f5664Y = z;
            C4639z2 z2Var = this.f5675i0;
            if (z2Var != null) {
                z2Var.mo15845b(this.f5661V);
            }
            if (z) {
                try {
                    if (!(this.f5674h0 == null || this.f5676j0 == null || !mo6873a())) {
                        this.f5674h0.mo15772a(this.f5676j0.mo15391c(this.f5661V));
                    }
                } catch (Exception e) {
                    C1557c.m7474e(f5659k0, "Failed to log card dismissed.", e);
                }
            }
            return;
        }
        C1557c.m7473e(f5659k0, "Cannot dismiss a card more than once. Doing nothing.");
    }

    /* renamed from: f */
    public void mo6878f(boolean z) {
        this.f5662W = z;
        C4639z2 z2Var = this.f5675i0;
        if (z2Var != null) {
            z2Var.mo15850d(this.f5661V);
        }
    }

    public Map<String, String> getExtras() {
        return this.f5660U;
    }

    /* renamed from: m */
    public boolean mo6880m() {
        return mo6855I() == C1496d.CONTROL;
    }

    /* renamed from: p */
    public boolean mo6881p() {
        return this.f5671e0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("mId='");
        sb.append(this.f5661V);
        sb.append('\'');
        sb.append(", mViewed='");
        sb.append(this.f5662W);
        sb.append('\'');
        sb.append(", mCreated='");
        sb.append(this.f5667b0);
        sb.append('\'');
        sb.append(", mUpdated='");
        sb.append(this.f5669c0);
        sb.append('\'');
        sb.append(", mIsClicked='");
        sb.append(this.f5666a0);
        sb.append('\'');
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo6882u() {
        try {
            this.f5666a0 = true;
            if (this.f5674h0 == null || this.f5676j0 == null || this.f5675i0 == null || !mo6873a()) {
                C1557c.m7473e(f5659k0, "Failed to log card clicked.");
                return false;
            }
            this.f5674h0.mo15772a(this.f5676j0.mo15392d(this.f5661V));
            this.f5675i0.mo15848c(this.f5661V);
            return true;
        } catch (Exception e) {
            C1557c.m7474e(f5659k0, "Failed to log card as clicked.", e);
        }
    }

    /* renamed from: z */
    public boolean mo6883z() {
        try {
            if (!(this.f5674h0 == null || this.f5676j0 == null || this.f5675i0 == null || !mo6873a())) {
                if (!mo6880m()) {
                    String str = f5659k0;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Logging impression event for card with id: ");
                    sb.append(this.f5661V);
                    C1557c.m7471d(str, sb.toString());
                    this.f5674h0.mo15772a(this.f5676j0.mo15389a(this.f5661V));
                } else {
                    String str2 = f5659k0;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Logging control impression event for card with id: ");
                    sb2.append(this.f5661V);
                    C1557c.m7471d(str2, sb2.toString());
                    this.f5674h0.mo15772a(this.f5676j0.mo15390b(this.f5661V));
                }
                this.f5675i0.mo15850d(this.f5661V);
                return true;
            }
        } catch (Exception e) {
            String str3 = f5659k0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to log card impression for card id: ");
            sb3.append(this.f5661V);
            C1557c.m7474e(str3, sb3.toString(), e);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo6875a(EnumSet<C1493b> enumSet) {
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            if (this.f5672f0.contains((C1493b) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public JSONObject m7408b() {
        return this.f5668c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6873a() {
        if (!C1563i.m7490d(this.f5661V)) {
            return true;
        }
        C1557c.m7465b(f5659k0, "Card ID cannot be null");
        return false;
    }
}
