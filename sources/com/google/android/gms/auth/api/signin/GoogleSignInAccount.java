package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p397z.C9918a;
import com.google.android.gms.common.internal.p397z.C9921c;
import com.google.android.gms.common.util.C9941e;
import com.google.android.gms.common.util.C9944h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends C9918a implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C9647c();

    /* renamed from: g0 */
    private static C9941e f22615g0 = C9944h.m30977d();

    /* renamed from: U */
    private String f22616U;

    /* renamed from: V */
    private String f22617V;

    /* renamed from: W */
    private String f22618W;

    /* renamed from: X */
    private String f22619X;

    /* renamed from: Y */
    private Uri f22620Y;

    /* renamed from: Z */
    private String f22621Z;

    /* renamed from: a0 */
    private long f22622a0;

    /* renamed from: b0 */
    private String f22623b0;

    /* renamed from: c */
    private final int f22624c;

    /* renamed from: c0 */
    private List<Scope> f22625c0;

    /* renamed from: d0 */
    private String f22626d0;

    /* renamed from: e0 */
    private String f22627e0;

    /* renamed from: f0 */
    private Set<Scope> f22628f0 = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f22624c = i;
        this.f22616U = str;
        this.f22617V = str2;
        this.f22618W = str3;
        this.f22619X = str4;
        this.f22620Y = uri;
        this.f22621Z = str5;
        this.f22622a0 = j;
        this.f22623b0 = str6;
        this.f22625c0 = list;
        this.f22626d0 = str7;
        this.f22627e0 = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m29929a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m29930a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f22621Z = jSONObject.optString("serverAuthCode", null);
        return a;
    }

    /* renamed from: o */
    private final JSONObject m29931o() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo24901h() != null) {
                jSONObject.put("id", mo24901h());
            }
            if (mo24903i() != null) {
                jSONObject.put("tokenId", mo24903i());
            }
            if (mo24897e() != null) {
                jSONObject.put("email", mo24897e());
            }
            if (mo24896d() != null) {
                jSONObject.put("displayName", mo24896d());
            }
            if (mo24900g() != null) {
                jSONObject.put("givenName", mo24900g());
            }
            if (mo24899f() != null) {
                jSONObject.put("familyName", mo24899f());
            }
            if (mo24904j() != null) {
                jSONObject.put("photoUrl", mo24904j().toString());
            }
            if (mo24906l() != null) {
                jSONObject.put("serverAuthCode", mo24906l());
            }
            jSONObject.put("expirationTime", this.f22622a0);
            jSONObject.put("obfuscatedIdentifier", this.f22623b0);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f22625c0.toArray(new Scope[this.f22625c0.size()]);
            Arrays.sort(scopeArr, C9646b.f22655c);
            for (Scope c : scopeArr) {
                jSONArray.put(c.mo25000c());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public Account mo24895c() {
        String str = this.f22618W;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    /* renamed from: d */
    public String mo24896d() {
        return this.f22619X;
    }

    /* renamed from: e */
    public String mo24897e() {
        return this.f22618W;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f22623b0.equals(this.f22623b0) && googleSignInAccount.mo24905k().equals(mo24905k());
    }

    /* renamed from: f */
    public String mo24899f() {
        return this.f22627e0;
    }

    /* renamed from: g */
    public String mo24900g() {
        return this.f22626d0;
    }

    /* renamed from: h */
    public String mo24901h() {
        return this.f22616U;
    }

    public int hashCode() {
        return ((this.f22623b0.hashCode() + 527) * 31) + mo24905k().hashCode();
    }

    /* renamed from: i */
    public String mo24903i() {
        return this.f22617V;
    }

    /* renamed from: j */
    public Uri mo24904j() {
        return this.f22620Y;
    }

    /* renamed from: k */
    public Set<Scope> mo24905k() {
        HashSet hashSet = new HashSet(this.f22625c0);
        hashSet.addAll(this.f22628f0);
        return hashSet;
    }

    /* renamed from: l */
    public String mo24906l() {
        return this.f22621Z;
    }

    /* renamed from: m */
    public final String mo24907m() {
        return this.f22623b0;
    }

    /* renamed from: n */
    public final String mo24908n() {
        JSONObject o = m29931o();
        o.remove("serverAuthCode");
        return o.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9921c.m30911a(parcel);
        C9921c.m30913a(parcel, 1, this.f22624c);
        C9921c.m30922a(parcel, 2, mo24901h(), false);
        C9921c.m30922a(parcel, 3, mo24903i(), false);
        C9921c.m30922a(parcel, 4, mo24897e(), false);
        C9921c.m30922a(parcel, 5, mo24896d(), false);
        C9921c.m30917a(parcel, 6, (Parcelable) mo24904j(), i, false);
        C9921c.m30922a(parcel, 7, mo24906l(), false);
        C9921c.m30914a(parcel, 8, this.f22622a0);
        C9921c.m30922a(parcel, 9, this.f22623b0, false);
        C9921c.m30930b(parcel, 10, this.f22625c0, false);
        C9921c.m30922a(parcel, 11, mo24900g(), false);
        C9921c.m30922a(parcel, 12, mo24899f(), false);
        C9921c.m30912a(parcel, a);
    }

    /* renamed from: a */
    private static GoogleSignInAccount m29930a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f22615g0.mo25474c() / 1000) : l).longValue();
        C9908u.m30863b(str7);
        C9908u.m30853a(set);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
        return googleSignInAccount;
    }
}
