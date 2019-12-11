package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C9652a;
import com.google.android.gms.auth.api.signin.internal.C9653b;
import com.google.android.gms.common.api.C9678a.C9682d.C9687e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends C9918a implements C9687e, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C9649e();

    /* renamed from: c0 */
    public static final Scope f22629c0 = new Scope("profile");

    /* renamed from: d0 */
    public static final Scope f22630d0 = new Scope("openid");

    /* renamed from: e0 */
    public static final Scope f22631e0 = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: f0 */
    public static final Scope f22632f0 = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: g0 */
    public static final GoogleSignInOptions f22633g0;

    /* renamed from: h0 */
    private static Comparator<Scope> f22634h0 = new C9648d();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final ArrayList<Scope> f22635U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public Account f22636V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f22637W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final boolean f22638X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final boolean f22639Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f22640Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public String f22641a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public ArrayList<C9652a> f22642b0;

    /* renamed from: c */
    private final int f22643c;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C9644a {

        /* renamed from: a */
        private Set<Scope> f22644a = new HashSet();

        /* renamed from: b */
        private boolean f22645b;

        /* renamed from: c */
        private boolean f22646c;

        /* renamed from: d */
        private boolean f22647d;

        /* renamed from: e */
        private String f22648e;

        /* renamed from: f */
        private Account f22649f;

        /* renamed from: g */
        private String f22650g;

        /* renamed from: h */
        private Map<Integer, C9652a> f22651h = new HashMap();

        public C9644a() {
        }

        /* renamed from: a */
        public final C9644a mo24921a(Scope scope, Scope... scopeArr) {
            this.f22644a.add(scope);
            this.f22644a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: b */
        public final C9644a mo24923b() {
            this.f22644a.add(GoogleSignInOptions.f22630d0);
            return this;
        }

        /* renamed from: c */
        public final C9644a mo24924c() {
            this.f22644a.add(GoogleSignInOptions.f22629c0);
            return this;
        }

        /* renamed from: a */
        public final GoogleSignInOptions mo24922a() {
            if (this.f22644a.contains(GoogleSignInOptions.f22632f0) && this.f22644a.contains(GoogleSignInOptions.f22631e0)) {
                this.f22644a.remove(GoogleSignInOptions.f22631e0);
            }
            if (this.f22647d && (this.f22649f == null || !this.f22644a.isEmpty())) {
                mo24923b();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.f22644a), this.f22649f, this.f22647d, this.f22645b, this.f22646c, this.f22648e, this.f22650g, this.f22651h, null);
            return googleSignInOptions;
        }

        public C9644a(GoogleSignInOptions googleSignInOptions) {
            C9908u.m30853a(googleSignInOptions);
            this.f22644a = new HashSet(googleSignInOptions.f22635U);
            this.f22645b = googleSignInOptions.f22638X;
            this.f22646c = googleSignInOptions.f22639Y;
            this.f22647d = googleSignInOptions.f22637W;
            this.f22648e = googleSignInOptions.f22640Z;
            this.f22649f = googleSignInOptions.f22636V;
            this.f22650g = googleSignInOptions.f22641a0;
            this.f22651h = GoogleSignInOptions.m29946a((List<C9652a>) googleSignInOptions.f22642b0);
        }
    }

    static {
        new Scope("email");
        C9644a aVar = new C9644a();
        aVar.mo24923b();
        aVar.mo24924c();
        f22633g0 = aVar.mo24922a();
        C9644a aVar2 = new C9644a();
        aVar2.mo24921a(f22631e0, new Scope[0]);
        aVar2.mo24922a();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<C9652a> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m29946a((List<C9652a>) arrayList2));
    }

    /* renamed from: a */
    public static GoogleSignInOptions m29944a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, C9652a>) new HashMap<Integer,C9652a>());
        return googleSignInOptions;
    }

    /* renamed from: k */
    private final JSONObject m29955k() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f22635U, f22634h0);
            ArrayList<Scope> arrayList = this.f22635U;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).mo25000c());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f22636V != null) {
                jSONObject.put("accountName", this.f22636V.name);
            }
            jSONObject.put("idTokenRequested", this.f22637W);
            jSONObject.put("forceCodeForRefreshToken", this.f22639Y);
            jSONObject.put("serverAuthRequested", this.f22638X);
            if (!TextUtils.isEmpty(this.f22640Z)) {
                jSONObject.put("serverClientId", this.f22640Z);
            }
            if (!TextUtils.isEmpty(this.f22641a0)) {
                jSONObject.put("hostedDomain", this.f22641a0);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public Account mo24910c() {
        return this.f22636V;
    }

    /* renamed from: d */
    public ArrayList<C9652a> mo24911d() {
        return this.f22642b0;
    }

    /* renamed from: e */
    public ArrayList<Scope> mo24912e() {
        return new ArrayList<>(this.f22635U);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f22636V.equals(r4.mo24910c()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f22640Z.equals(r4.mo24914f()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r3.f22642b0     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 > 0) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r4.f22642b0     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0085
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f22635U     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.mo24912e()     // Catch:{ ClassCastException -> 0x0085 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f22635U     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.mo24912e()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0085
        L_0x0035:
            android.accounts.Account r1 = r3.f22636V     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo24910c()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0085
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f22636V     // Catch:{ ClassCastException -> 0x0085 }
            android.accounts.Account r2 = r4.mo24910c()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x004c:
            java.lang.String r1 = r3.f22640Z     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo24914f()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f22640Z     // Catch:{ ClassCastException -> 0x0085 }
            java.lang.String r2 = r4.mo24914f()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x006b:
            boolean r1 = r3.f22639Y     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.mo24915g()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f22637W     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.mo24916h()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f22638X     // Catch:{ ClassCastException -> 0x0085 }
            boolean r4 = r4.mo24918i()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r4) goto L_0x0085
            r4 = 1
            return r4
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo24914f() {
        return this.f22640Z;
    }

    /* renamed from: g */
    public boolean mo24915g() {
        return this.f22639Y;
    }

    /* renamed from: h */
    public boolean mo24916h() {
        return this.f22637W;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f22635U;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).mo25000c());
        }
        Collections.sort(arrayList);
        C9653b bVar = new C9653b();
        bVar.mo24945a((Object) arrayList);
        bVar.mo24945a((Object) this.f22636V);
        bVar.mo24945a((Object) this.f22640Z);
        bVar.mo24946a(this.f22639Y);
        bVar.mo24946a(this.f22637W);
        bVar.mo24946a(this.f22638X);
        return bVar.mo24944a();
    }

    /* renamed from: i */
    public boolean mo24918i() {
        return this.f22638X;
    }

    /* renamed from: j */
    public final String mo24919j() {
        return m29955k().toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f22643c);
        C9921c.m30930b(parcel, 2, mo24912e(), false);
        C9921c.m30917a(parcel, 3, (Parcelable) mo24910c(), i, false);
        C9921c.m30924a(parcel, 4, mo24916h());
        C9921c.m30924a(parcel, 5, mo24918i());
        C9921c.m30924a(parcel, 6, mo24915g());
        C9921c.m30922a(parcel, 7, mo24914f(), false);
        C9921c.m30922a(parcel, 8, this.f22641a0, false);
        C9921c.m30930b(parcel, 9, mo24911d(), false);
        C9921c.m30912a(parcel, a);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, C9652a> map) {
        this.f22643c = i;
        this.f22635U = arrayList;
        this.f22636V = account;
        this.f22637W = z;
        this.f22638X = z2;
        this.f22639Y = z3;
        this.f22640Z = str;
        this.f22641a0 = str2;
        this.f22642b0 = new ArrayList<>(map.values());
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C9648d dVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Map<Integer, C9652a> m29946a(List<C9652a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (C9652a aVar : list) {
            hashMap.put(Integer.valueOf(aVar.mo24942c()), aVar);
        }
        return hashMap;
    }
}
