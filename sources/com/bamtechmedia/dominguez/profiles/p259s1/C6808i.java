package com.bamtechmedia.dominguez.profiles.p259s1;

import androidx.fragment.app.Fragment;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.dictionaries.C6090n;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6628d;
import com.bamtechmedia.dominguez.profiles.C6653e;
import com.bamtechmedia.dominguez.profiles.C6654e0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C6667g1.C6668a;
import com.bamtechmedia.dominguez.profiles.C6671h0;
import com.bamtechmedia.dominguez.profiles.C6671h0.C6672a;
import com.bamtechmedia.dominguez.profiles.C6675i;
import com.bamtechmedia.dominguez.profiles.C6725m1;
import com.bamtechmedia.dominguez.profiles.C6761p0;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6774b;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6776c;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6778d;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import com.bamtechmedia.dominguez.profiles.C6969y0;
import com.bamtechmedia.dominguez.profiles.C7019z;
import com.bamtechmedia.dominguez.profiles.p263u1.C6858a;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6864d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import net.danlew.android.joda.DateUtils;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7619i;
import p163g.p201e.p203b.p330z.C7949h;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.C11974s;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HBo\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\nH\u0002J0\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010*\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\nJ\u000e\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u0002042\u0006\u00109\u001a\u00020\nJ\u0006\u0010>\u001a\u000204J\u0006\u0010?\u001a\u000204J\u000e\u0010@\u001a\u0002042\u0006\u00109\u001a\u00020\nJ\u000e\u0010A\u001a\u0002042\u0006\u0010;\u001a\u00020<J\u0010\u0010B\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010/J\u0016\u0010C\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010D\u001a\u00020EJ\u0006\u0010F\u001a\u000204J\b\u0010G\u001a\u000204H\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010$\"\u0004\b&\u0010'¨\u0006I"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/add/AddProfileViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/profiles/add/AddProfileViewModel$State;", "profileNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "profilesGlobalNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfilesGlobalNavRouter;", "tempProfile", "Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "isEditProfile", "", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "avatarsRepository", "Lcom/bamtechmedia/dominguez/profiles/AvatarsRepository;", "profilesViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "profilesHostViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "languageSwitcher", "Lcom/bamtechmedia/dominguez/dictionaries/LanguageSwitcher;", "createProfileLanguageSetup", "Lcom/bamtechmedia/dominguez/profiles/api/language/CreateProfileLanguageSetup;", "analytics", "Lcom/bamtechmedia/dominguez/profiles/AddProfileAnalytics;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "(Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;Lcom/bamtechmedia/dominguez/profiles/ProfilesGlobalNavRouter;Lcom/bamtechmedia/dominguez/profiles/TempProfile;ZLcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/profiles/AvatarsRepository;Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;Lcom/bamtechmedia/dominguez/dictionaries/LanguageSwitcher;Lcom/bamtechmedia/dominguez/profiles/api/language/CreateProfileLanguageSetup;Lcom/bamtechmedia/dominguez/profiles/AddProfileAnalytics;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "createLanguagePreferencesFromCurrentState", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "getCreateLanguagePreferencesFromCurrentState", "()Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "profileFromCurrentState", "getProfileFromCurrentState", "()Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "getTempProfile", "setTempProfile", "(Lcom/bamtechmedia/dominguez/profiles/TempProfile;)V", "getProfileAttributes", "Lcom/bamtechmedia/dominguez/profiles/ProfileAttributes;", "isDefault", "getProfileUpdateCreateSingle", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "profileName", "", "profileAttributes", "localAvatar", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "handleError", "", "error", "", "loadInitialState", "onAutoPlayToggled", "isChecked", "onAvatarClicked", "fragment", "Lcom/bamtechmedia/dominguez/profiles/add/AddProfileFragment;", "onBackgroundVideoToggled", "onDeleteClicked", "onDeleteConfirmed", "onKidsToggled", "onLanguageClicked", "onProfileNameChanged", "onProfileUpdated", "requestCode", "", "onSaveClicked", "routeToNextScreen", "State", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.s1.i */
/* compiled from: AddProfileViewModel.kt */
public final class C6808i extends C5741g<C6809a> {

    /* renamed from: a */
    private final C6671h0 f15215a;

    /* renamed from: b */
    private final C6761p0 f15216b;

    /* renamed from: c */
    private C6780r1 f15217c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f15218d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6667g1 f15219e;

    /* renamed from: f */
    private final C6675i f15220f;

    /* renamed from: g */
    private final C6725m1 f15221g;

    /* renamed from: h */
    private final C6969y0 f15222h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C6090n f15223i;

    /* renamed from: j */
    private final C6864d f15224j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C6628d f15225k;

    /* renamed from: l */
    private final C7614e f15226l;

    /* renamed from: m */
    private final C3572r0 f15227m;

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$a */
    /* compiled from: AddProfileViewModel.kt */
    public static final class C6809a {

        /* renamed from: a */
        private final C6653e f15228a;

        /* renamed from: b */
        private final boolean f15229b;

        /* renamed from: c */
        private final boolean f15230c;

        /* renamed from: d */
        private final boolean f15231d;

        /* renamed from: e */
        private final C6828j f15232e;

        /* renamed from: f */
        private final int f15233f;

        /* renamed from: g */
        private final boolean f15234g;

        /* renamed from: h */
        private final boolean f15235h;

        /* renamed from: i */
        private final boolean f15236i;

        /* renamed from: j */
        private final boolean f15237j;

        /* renamed from: k */
        private final C6858a f15238k;

        /* renamed from: l */
        private final String f15239l;

        /* renamed from: m */
        private final boolean f15240m;

        /* renamed from: n */
        private final String f15241n;

        /* renamed from: o */
        private final boolean f15242o;

        public C6809a() {
            this(null, false, false, false, null, 0, false, false, false, false, null, null, false, null, false, 32767, null);
        }

        public C6809a(C6653e eVar, boolean z, boolean z2, boolean z3, C6828j jVar, int i, boolean z4, boolean z5, boolean z6, boolean z7, C6858a aVar, String str, boolean z8, String str2, boolean z9) {
            this.f15228a = eVar;
            this.f15229b = z;
            this.f15230c = z2;
            this.f15231d = z3;
            this.f15232e = jVar;
            this.f15233f = i;
            this.f15234g = z4;
            this.f15235h = z5;
            this.f15236i = z6;
            this.f15237j = z7;
            this.f15238k = aVar;
            this.f15239l = str;
            this.f15240m = z8;
            this.f15241n = str2;
            this.f15242o = z9;
        }

        /* renamed from: a */
        public static /* synthetic */ C6809a m20942a(C6809a aVar, C6653e eVar, boolean z, boolean z2, boolean z3, C6828j jVar, int i, boolean z4, boolean z5, boolean z6, boolean z7, C6858a aVar2, String str, boolean z8, String str2, boolean z9, int i2, Object obj) {
            C6809a aVar3 = aVar;
            int i3 = i2;
            return aVar.mo19558a((i3 & 1) != 0 ? aVar3.f15228a : eVar, (i3 & 2) != 0 ? aVar3.f15229b : z, (i3 & 4) != 0 ? aVar3.f15230c : z2, (i3 & 8) != 0 ? aVar3.f15231d : z3, (i3 & 16) != 0 ? aVar3.f15232e : jVar, (i3 & 32) != 0 ? aVar3.f15233f : i, (i3 & 64) != 0 ? aVar3.f15234g : z4, (i3 & 128) != 0 ? aVar3.f15235h : z5, (i3 & 256) != 0 ? aVar3.f15236i : z6, (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? aVar3.f15237j : z7, (i3 & 1024) != 0 ? aVar3.f15238k : aVar2, (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? aVar3.f15239l : str, (i3 & 4096) != 0 ? aVar3.f15240m : z8, (i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? aVar3.f15241n : str2, (i3 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? aVar3.f15242o : z9);
        }

        /* renamed from: a */
        public final C6809a mo19558a(C6653e eVar, boolean z, boolean z2, boolean z3, C6828j jVar, int i, boolean z4, boolean z5, boolean z6, boolean z7, C6858a aVar, String str, boolean z8, String str2, boolean z9) {
            C6809a aVar2 = new C6809a(eVar, z, z2, z3, jVar, i, z4, z5, z6, z7, aVar, str, z8, str2, z9);
            return aVar2;
        }

        /* renamed from: a */
        public final boolean mo19559a() {
            return this.f15229b;
        }

        /* renamed from: b */
        public final C6653e mo19560b() {
            return this.f15228a;
        }

        /* renamed from: c */
        public final boolean mo19561c() {
            return this.f15230c;
        }

        /* renamed from: d */
        public final boolean mo19562d() {
            return this.f15231d;
        }

        /* renamed from: e */
        public final C6828j mo19563e() {
            return this.f15232e;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6809a) {
                    C6809a aVar = (C6809a) obj;
                    if (C12880j.m40224a((Object) this.f15228a, (Object) aVar.f15228a)) {
                        if (this.f15229b == aVar.f15229b) {
                            if (this.f15230c == aVar.f15230c) {
                                if ((this.f15231d == aVar.f15231d) && C12880j.m40224a((Object) this.f15232e, (Object) aVar.f15232e)) {
                                    if (this.f15233f == aVar.f15233f) {
                                        if (this.f15234g == aVar.f15234g) {
                                            if (this.f15235h == aVar.f15235h) {
                                                if (this.f15236i == aVar.f15236i) {
                                                    if ((this.f15237j == aVar.f15237j) && C12880j.m40224a((Object) this.f15238k, (Object) aVar.f15238k) && C12880j.m40224a((Object) this.f15239l, (Object) aVar.f15239l)) {
                                                        if ((this.f15240m == aVar.f15240m) && C12880j.m40224a((Object) this.f15241n, (Object) aVar.f15241n)) {
                                                            if (this.f15242o == aVar.f15242o) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final int mo19565f() {
            return this.f15233f;
        }

        /* renamed from: g */
        public final boolean mo19566g() {
            return this.f15242o;
        }

        /* renamed from: h */
        public final boolean mo19567h() {
            return this.f15236i;
        }

        public int hashCode() {
            C6653e eVar = this.f15228a;
            int i = 0;
            int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
            boolean z = this.f15229b;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z2 = this.f15230c;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f15231d;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            C6828j jVar = this.f15232e;
            int hashCode2 = (((i4 + (jVar != null ? jVar.hashCode() : 0)) * 31) + this.f15233f) * 31;
            boolean z4 = this.f15234g;
            if (z4) {
                z4 = true;
            }
            int i5 = (hashCode2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f15235h;
            if (z5) {
                z5 = true;
            }
            int i6 = (i5 + (z5 ? 1 : 0)) * 31;
            boolean z6 = this.f15236i;
            if (z6) {
                z6 = true;
            }
            int i7 = (i6 + (z6 ? 1 : 0)) * 31;
            boolean z7 = this.f15237j;
            if (z7) {
                z7 = true;
            }
            int i8 = (i7 + (z7 ? 1 : 0)) * 31;
            C6858a aVar = this.f15238k;
            int hashCode3 = (i8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            String str = this.f15239l;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z8 = this.f15240m;
            if (z8) {
                z8 = true;
            }
            int i9 = (hashCode4 + (z8 ? 1 : 0)) * 31;
            String str2 = this.f15241n;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i10 = (i9 + i) * 31;
            boolean z9 = this.f15242o;
            if (z9) {
                z9 = true;
            }
            return i10 + (z9 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo19569i() {
            return this.f15237j;
        }

        /* renamed from: j */
        public final C6858a mo19570j() {
            return this.f15238k;
        }

        /* renamed from: k */
        public final String mo19571k() {
            return this.f15239l;
        }

        /* renamed from: l */
        public final String mo19572l() {
            return this.f15241n;
        }

        /* renamed from: m */
        public final boolean mo19573m() {
            return this.f15234g;
        }

        /* renamed from: n */
        public final boolean mo19574n() {
            return this.f15235h;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(avatar=");
            sb.append(this.f15228a);
            sb.append(", autoPlayChecked=");
            sb.append(this.f15229b);
            sb.append(", backgroundVideoChecked=");
            sb.append(this.f15230c);
            sb.append(", dismiss=");
            sb.append(this.f15231d);
            sb.append(", error=");
            sb.append(this.f15232e);
            sb.append(", errorInputMessageResId=");
            sb.append(this.f15233f);
            sb.append(", isDefaultProfile=");
            sb.append(this.f15234g);
            sb.append(", isEditProfile=");
            sb.append(this.f15235h);
            sb.append(", kidsOnlyChecked=");
            sb.append(this.f15236i);
            sb.append(", loading=");
            sb.append(this.f15237j);
            sb.append(", originalProfile=");
            sb.append(this.f15238k);
            sb.append(", profileNameText=");
            sb.append(this.f15239l);
            sb.append(", primaryProfileMessageVisible=");
            sb.append(this.f15240m);
            sb.append(", uiLanguage=");
            sb.append(this.f15241n);
            sb.append(", hasAvatarChanged=");
            sb.append(this.f15242o);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C6809a(C6653e eVar, boolean z, boolean z2, boolean z3, C6828j jVar, int i, boolean z4, boolean z5, boolean z6, boolean z7, C6858a aVar, String str, boolean z8, String str2, boolean z9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            int i3 = i2;
            C6858a aVar2 = null;
            C6653e eVar2 = (i3 & 1) != 0 ? null : eVar;
            boolean z10 = (i3 & 2) != 0 ? false : z;
            boolean z11 = (i3 & 4) != 0 ? false : z2;
            boolean z12 = (i3 & 8) != 0 ? false : z3;
            C6828j jVar2 = (i3 & 16) != 0 ? null : jVar;
            int i4 = (i3 & 32) != 0 ? 0 : i;
            boolean z13 = (i3 & 64) != 0 ? false : z4;
            boolean z14 = (i3 & 128) != 0 ? false : z5;
            boolean z15 = (i3 & 256) != 0 ? false : z6;
            boolean z16 = (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? false : z7;
            if ((i3 & 1024) == 0) {
                aVar2 = aVar;
            }
            String str3 = "";
            String str4 = (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? str3 : str;
            boolean z17 = (i3 & 4096) != 0 ? false : z8;
            if ((i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) == 0) {
                str3 = str2;
            }
            this(eVar2, z10, z11, z12, jVar2, i4, z13, z14, z15, z16, aVar2, str4, z17, str3, (i3 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? false : z9);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$b */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6810b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C6808i f15243c;

        C6810b(C6808i iVar) {
            this.f15243c = iVar;
        }

        /* renamed from: a */
        public final C6626c0 apply(List<? extends C6626c0> list) {
            Object obj;
            boolean z;
            C12880j.m40222a((Object) list, "it");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C6626c0 c0Var = (C6626c0) obj;
                if (this.f15243c.mo19556y().getProfileId().length() == 0) {
                    z = c0Var.isDefault();
                    continue;
                } else {
                    z = C12880j.m40224a((Object) c0Var.getProfileId(), (Object) this.f15243c.mo19556y().getProfileId());
                    continue;
                }
                if (z) {
                    break;
                }
            }
            return (C6626c0) obj;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$c */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6811c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f15244U;

        /* renamed from: V */
        final /* synthetic */ C6654e0 f15245V;

        /* renamed from: c */
        final /* synthetic */ C6808i f15246c;

        C6811c(C6808i iVar, String str, C6654e0 e0Var) {
            this.f15246c = iVar;
            this.f15244U = str;
            this.f15245V = e0Var;
        }

        /* renamed from: a */
        public final Single<? extends C6626c0> apply(C6626c0 c0Var) {
            return this.f15246c.f15219e.mo19379a(c0Var, this.f15244U, this.f15245V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$d */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6812d extends C12881k implements Function1<C6809a, C6809a> {

        /* renamed from: U */
        final /* synthetic */ String f15247U;

        /* renamed from: c */
        final /* synthetic */ C7619i f15248c;

        C6812d(C7619i iVar, String str) {
            this.f15248c = iVar;
            this.f15247U = str;
            super(1);
        }

        /* renamed from: a */
        public final C6809a invoke(C6809a aVar) {
            C6809a aVar2 = aVar;
            C6828j jVar = r7;
            C6828j jVar2 = new C6828j(null, this.f15248c.mo20546d(), this.f15247U, 1, null);
            return C6809a.m20942a(aVar2, null, false, false, false, jVar, 0, false, false, false, false, null, null, false, null, false, 32239, null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "avatar", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$e */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6813e<T> implements Consumer<C6653e> {

        /* renamed from: U */
        final /* synthetic */ C6780r1 f15249U;

        /* renamed from: c */
        final /* synthetic */ C6808i f15250c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$e$a */
        /* compiled from: AddProfileViewModel.kt */
        static final class C6814a extends C12881k implements Function1<C6809a, C6809a> {

            /* renamed from: U */
            final /* synthetic */ C6653e f15251U;

            /* renamed from: c */
            final /* synthetic */ C6813e f15252c;

            C6814a(C6813e eVar, C6653e eVar2) {
                this.f15252c = eVar;
                this.f15251U = eVar2;
                super(1);
            }

            /* renamed from: a */
            public final C6809a invoke(C6809a aVar) {
                C6653e eVar = this.f15251U;
                boolean T = this.f15252c.f15249U.mo19356T();
                boolean O = this.f15252c.f15249U.mo19351O();
                boolean isDefault = this.f15252c.f15249U.isDefault();
                boolean d = this.f15252c.f15250c.f15218d;
                boolean R = this.f15252c.f15249U.mo19354R();
                C6858a X = this.f15252c.f15249U.mo19513X();
                if (X == null) {
                    X = this.f15252c.f15249U;
                }
                C6858a aVar2 = X;
                String profileName = this.f15252c.f15249U.getProfileName();
                boolean isDefault2 = this.f15252c.f15249U.isDefault();
                String X2 = this.f15252c.f15249U.mo19352P().mo19792X();
                if (X2 != null) {
                    return C6809a.m20942a(aVar, eVar, T, O, false, null, 0, isDefault, d, R, false, aVar2, profileName, isDefault2, X2, true, 40, null);
                }
                C12880j.m40220a();
                throw null;
            }
        }

        C6813e(C6808i iVar, C6780r1 r1Var) {
            this.f15250c = iVar;
            this.f15249U = r1Var;
        }

        /* renamed from: a */
        public final void accept(C6653e eVar) {
            this.f15250c.updateState(new C6814a(this, eVar));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$f */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6815f<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6815f f15253c = new C6815f();

        C6815f() {
        }

        /* renamed from: a */
        public final void mo19581a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo19581a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$g */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6816g extends C12881k implements Function1<C6809a, C6809a> {

        /* renamed from: c */
        final /* synthetic */ boolean f15254c;

        C6816g(boolean z) {
            this.f15254c = z;
            super(1);
        }

        /* renamed from: a */
        public final C6809a invoke(C6809a aVar) {
            return C6809a.m20942a(aVar, null, this.f15254c, false, false, null, 0, false, false, false, false, null, null, false, null, false, 32765, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$h */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6817h extends C12881k implements Function1<C6809a, C6809a> {

        /* renamed from: c */
        final /* synthetic */ boolean f15255c;

        C6817h(boolean z) {
            this.f15255c = z;
            super(1);
        }

        /* renamed from: a */
        public final C6809a invoke(C6809a aVar) {
            return C6809a.m20942a(aVar, null, false, this.f15255c, false, null, 0, false, false, false, false, null, null, false, null, false, 32763, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$i */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6818i extends C12881k implements Function1<C6809a, C6809a> {

        /* renamed from: c */
        public static final C6818i f15256c = new C6818i();

        C6818i() {
            super(1);
        }

        /* renamed from: a */
        public final C6809a invoke(C6809a aVar) {
            return C6809a.m20942a(aVar, null, false, false, false, null, 0, false, false, false, true, null, null, false, null, false, 32255, null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$j */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6819j implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6808i f15257a;

        /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$j$a */
        /* compiled from: AddProfileViewModel.kt */
        static final class C6820a extends C12881k implements Function1<C6809a, C6809a> {

            /* renamed from: c */
            public static final C6820a f15258c = new C6820a();

            C6820a() {
                super(1);
            }

            /* renamed from: a */
            public final C6809a invoke(C6809a aVar) {
                C6809a aVar2 = new C6809a(null, false, false, true, null, 0, false, false, false, false, null, null, false, null, false, 32759, null);
                return aVar2;
            }
        }

        C6819j(C6808i iVar) {
            this.f15257a = iVar;
        }

        public final void run() {
            this.f15257a.updateState(C6820a.f15258c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$k */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6821k<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6808i f15259c;

        C6821k(C6808i iVar) {
            this.f15259c = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C6808i iVar = this.f15259c;
            C12880j.m40222a((Object) th, "it");
            iVar.m20925a(th);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$l */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6822l extends C12881k implements Function1<C6809a, C6809a> {

        /* renamed from: c */
        final /* synthetic */ boolean f15260c;

        C6822l(boolean z) {
            this.f15260c = z;
            super(1);
        }

        /* renamed from: a */
        public final C6809a invoke(C6809a aVar) {
            return C6809a.m20942a(aVar, null, false, false, false, null, 0, false, false, this.f15260c, false, null, null, false, null, false, 32511, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$m */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6823m extends C12881k implements Function1<C6809a, C6809a> {

        /* renamed from: U */
        final /* synthetic */ int f15261U;

        /* renamed from: c */
        final /* synthetic */ String f15262c;

        C6823m(String str, int i) {
            this.f15262c = str;
            this.f15261U = i;
            super(1);
        }

        /* renamed from: a */
        public final C6809a invoke(C6809a aVar) {
            String str = this.f15262c;
            if (str == null) {
                str = "";
            }
            return C6809a.m20942a(aVar, null, false, false, false, null, this.f15261U, false, false, false, false, null, str, false, null, false, 14287, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$n */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6824n extends C12881k implements Function1<C6809a, C6809a> {

        /* renamed from: c */
        final /* synthetic */ C6780r1 f15263c;

        C6824n(C6780r1 r1Var) {
            this.f15263c = r1Var;
            super(1);
        }

        /* renamed from: a */
        public final C6809a invoke(C6809a aVar) {
            String X = this.f15263c.mo19352P().mo19792X();
            if (X != null) {
                return C6809a.m20942a(aVar, null, false, false, false, null, 0, false, false, false, false, null, null, false, X, false, 24575, null);
            }
            C12880j.m40220a();
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$o */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6825o<T, R> implements Function<C6626c0, CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ C6808i f15264U;

        /* renamed from: c */
        final /* synthetic */ C6654e0 f15265c;

        C6825o(C6654e0 e0Var, C6808i iVar) {
            this.f15265c = e0Var;
            this.f15264U = iVar;
        }

        /* renamed from: a */
        public final CompletableSource apply(C6626c0 c0Var) {
            if (c0Var.mo19353Q()) {
                return this.f15264U.f15223i.mo18350a(this.f15265c.mo19335P().mo19792X());
            }
            return Completable.m38169h();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$p */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6826p implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6808i f15266a;

        C6826p(C6808i iVar) {
            this.f15266a = iVar;
        }

        public final void run() {
            this.f15266a.m20920E();
            this.f15266a.f15225k.mo19291a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.i$q */
    /* compiled from: AddProfileViewModel.kt */
    static final class C6827q<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6808i f15267c;

        C6827q(C6808i iVar) {
            this.f15267c = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C6808i iVar = this.f15267c;
            C12880j.m40222a((Object) th, "it");
            iVar.m20925a(th);
        }
    }

    public C6808i(C6671h0 h0Var, C6761p0 p0Var, C6780r1 r1Var, boolean z, C6667g1 g1Var, C6675i iVar, C6725m1 m1Var, C6969y0 y0Var, C6090n nVar, C6864d dVar, C6628d dVar2, C7614e eVar, C3572r0 r0Var) {
        super(null, 1, null);
        this.f15215a = h0Var;
        this.f15216b = p0Var;
        this.f15217c = r1Var;
        this.f15218d = z;
        this.f15219e = g1Var;
        this.f15220f = iVar;
        this.f15221g = m1Var;
        this.f15222h = y0Var;
        this.f15223i = nVar;
        this.f15224j = dVar;
        this.f15225k = dVar2;
        this.f15226l = eVar;
        this.f15227m = r0Var;
        C6809a aVar = r1;
        C6809a aVar2 = new C6809a(null, false, false, false, null, 0, false, false, false, true, null, null, false, null, false, 32255, null);
        createState(aVar);
        m20923a(this.f15217c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bamtechmedia.dominguez.profiles.C7019z m20918C() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.getCurrentState()
            com.bamtechmedia.dominguez.profiles.s1.i$a r0 = (com.bamtechmedia.dominguez.profiles.p259s1.C6808i.C6809a) r0
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.profiles.u1.a r0 = r0.mo19570j()
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.profiles.z r0 = r0.mo19352P()
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.profiles.z r8 = new com.bamtechmedia.dominguez.profiles.z
            java.lang.Object r1 = r10.getCurrentState()
            com.bamtechmedia.dominguez.profiles.s1.i$a r1 = (com.bamtechmedia.dominguez.profiles.p259s1.C6808i.C6809a) r1
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r1.mo19572l()
            if (r1 == 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            com.bamtechmedia.dominguez.profiles.r1 r1 = r10.f15217c
            com.bamtechmedia.dominguez.profiles.z r1 = r1.mo19352P()
            java.lang.String r1 = r1.mo19792X()
        L_0x002f:
            r2 = r1
            java.lang.String r3 = r0.mo19793Y()
            java.lang.Boolean r4 = r0.mo19794Z()
            java.lang.Boolean r5 = r0.mo19796a0()
            java.lang.String r6 = r0.mo19797b0()
            java.lang.Boolean r7 = r0.mo19798c0()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x005c
        L_0x0049:
            com.bamtechmedia.dominguez.profiles.r1 r0 = r10.f15217c
            com.bamtechmedia.dominguez.profiles.z r1 = r0.mo19352P()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 63
            r9 = 0
            com.bamtechmedia.dominguez.profiles.z r8 = com.bamtechmedia.dominguez.profiles.C7019z.m21314a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x005c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p259s1.C6808i.m20918C():com.bamtechmedia.dominguez.profiles.z");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 != null) goto L_0x0017;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bamtechmedia.dominguez.profiles.C6780r1 m20919D() {
        /*
            r14 = this;
            com.bamtechmedia.dominguez.profiles.r1 r0 = r14.f15217c
            java.lang.Object r1 = r14.getCurrentState()
            com.bamtechmedia.dominguez.profiles.s1.i$a r1 = (com.bamtechmedia.dominguez.profiles.p259s1.C6808i.C6809a) r1
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = r1.mo19571k()
            if (r1 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            com.bamtechmedia.dominguez.profiles.r1 r1 = r14.f15217c
            java.lang.String r1 = r1.getProfileName()
        L_0x0017:
            r2 = r1
            r3 = 0
            r4 = 0
            java.lang.Object r1 = r14.getCurrentState()
            com.bamtechmedia.dominguez.profiles.s1.i$a r1 = (com.bamtechmedia.dominguez.profiles.p259s1.C6808i.C6809a) r1
            if (r1 == 0) goto L_0x0027
            boolean r1 = r1.mo19567h()
            goto L_0x002d
        L_0x0027:
            com.bamtechmedia.dominguez.profiles.r1 r1 = r14.f15217c
            boolean r1 = r1.mo19354R()
        L_0x002d:
            r5 = r1
            r6 = 0
            r7 = 0
            java.lang.Object r1 = r14.getCurrentState()
            com.bamtechmedia.dominguez.profiles.s1.i$a r1 = (com.bamtechmedia.dominguez.profiles.p259s1.C6808i.C6809a) r1
            if (r1 == 0) goto L_0x003d
            boolean r1 = r1.mo19559a()
            goto L_0x0043
        L_0x003d:
            com.bamtechmedia.dominguez.profiles.r1 r1 = r14.f15217c
            boolean r1 = r1.mo19356T()
        L_0x0043:
            r8 = r1
            java.lang.Object r1 = r14.getCurrentState()
            com.bamtechmedia.dominguez.profiles.s1.i$a r1 = (com.bamtechmedia.dominguez.profiles.p259s1.C6808i.C6809a) r1
            if (r1 == 0) goto L_0x0051
            boolean r1 = r1.mo19561c()
            goto L_0x0057
        L_0x0051:
            com.bamtechmedia.dominguez.profiles.r1 r1 = r14.f15217c
            boolean r1 = r1.mo19351O()
        L_0x0057:
            r11 = r1
            r10 = 0
            com.bamtechmedia.dominguez.profiles.z r9 = r14.m20918C()
            r12 = 621(0x26d, float:8.7E-43)
            r13 = 0
            r1 = 0
            com.bamtechmedia.dominguez.profiles.r1 r0 = com.bamtechmedia.dominguez.profiles.C6780r1.m20868a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p259s1.C6808i.m20919D():com.bamtechmedia.dominguez.profiles.r1");
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m20920E() {
        C6771b y = this.f15222h.mo19724y();
        if (C12880j.m40224a((Object) y, (Object) C6776c.f15157c)) {
            C6672a.m20687a(this.f15215a, false, true, 1, null);
        } else if (C12880j.m40224a((Object) y, (Object) C6778d.f15158c)) {
            C6672a.m20689a(this.f15215a, false, false, true, 3, null);
        } else if (C12880j.m40224a((Object) y, (Object) C6774b.f15156c)) {
            C6672a.m20689a(this.f15215a, !this.f15218d, false, true, 2, null);
        } else {
            this.f15216b.close();
        }
    }

    /* renamed from: g */
    private final C6654e0 m20930g(boolean z) {
        C7019z zVar;
        String j = this.f15217c.mo19364j();
        boolean S = this.f15217c.mo19355S();
        Object currentState = getCurrentState();
        if (currentState != null) {
            boolean h = ((C6809a) currentState).mo19567h();
            Object currentState2 = getCurrentState();
            if (currentState2 != null) {
                boolean a = ((C6809a) currentState2).mo19559a();
                Object currentState3 = getCurrentState();
                if (currentState3 != null) {
                    boolean c = ((C6809a) currentState3).mo19561c();
                    if (z || this.f15218d) {
                        zVar = this.f15217c.mo19352P();
                    } else {
                        zVar = this.f15224j.mo19634b(this.f15217c);
                    }
                    C6654e0 e0Var = new C6654e0(h, a, z, j, S, c, zVar);
                    return e0Var;
                }
                C12880j.m40220a();
                throw null;
            }
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }

    /* renamed from: A */
    public final void mo19547A() {
        updateState(C6818i.f15256c);
        Object a = this.f15219e.mo19376a(this.f15217c.getProfileId()).mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C6819j(this), new C6821k(this));
    }

    /* renamed from: B */
    public final void mo19548B() {
        C6809a aVar = (C6809a) getCurrentState();
        if (mo19552b(aVar != null ? aVar.mo19571k() : null)) {
            C6809a aVar2 = (C6809a) getCurrentState();
            if (aVar2 != null) {
                boolean isDefault = this.f15217c.isDefault();
                String k = aVar2.mo19571k();
                C6654e0 g = m20930g(isDefault);
                Completable a = m20922a(isDefault, k, g, aVar2.mo19560b()).mo30217b((Function<? super T, ? extends CompletableSource>) new C6825o<Object,Object>(g, this)).mo30050b((C11945a) new C6826p(this)).mo30036a((Consumer<? super Throwable>) new C6827q<Object>(this));
                C12880j.m40222a((Object) a, "profileSingle\n          …Error { handleError(it) }");
                C5826e0.m18823a(a, null, null, 3, null);
            }
        }
    }

    /* renamed from: f */
    public final void mo19555f(boolean z) {
        updateState(new C6822l(z));
    }

    /* renamed from: y */
    public final C6780r1 mo19556y() {
        return this.f15217c;
    }

    /* renamed from: z */
    public final void mo19557z() {
        this.f15215a.mo19396a(this.f15217c.getProfileId(), this.f15217c.getProfileName());
    }

    /* renamed from: b */
    public final void mo19551b(C6791g gVar) {
        C6671h0 h0Var = this.f15215a;
        C6780r1 D = m20919D();
        C6626c0 X = this.f15217c.mo19513X();
        if (X == null) {
            X = this.f15217c;
        }
        h0Var.mo19395a(new C6780r1(D, X), (Fragment) gVar, 2000);
    }

    /* renamed from: d */
    public final void mo19553d(boolean z) {
        updateState(new C6816g(z));
    }

    /* renamed from: e */
    public final void mo19554e(boolean z) {
        updateState(new C6817h(z));
    }

    /* renamed from: a */
    public final void mo19550a(C6791g gVar) {
        C6671h0 h0Var = this.f15215a;
        boolean z = this.f15218d;
        C6780r1 D = m20919D();
        C6626c0 X = this.f15217c.mo19513X();
        if (X == null) {
            X = this.f15217c;
        }
        C6672a.m20688a(h0Var, z, false, new C6780r1(D, X), false, gVar, 1000, 10, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19552b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x000d
            int r2 = r6.length()
            if (r2 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            if (r2 == 0) goto L_0x0013
            int r2 = p163g.p201e.p203b.p330z.C7949h.empty_profile_name_error
            goto L_0x006f
        L_0x0013:
            com.bamtechmedia.dominguez.profiles.g1 r2 = r5.f15219e
            r3 = 0
            io.reactivex.Flowable r2 = com.bamtechmedia.dominguez.profiles.C6667g1.C6668a.m20672a(r2, r0, r1, r3)
            io.reactivex.Single r2 = r2.mo30087b()
            java.lang.Object r2 = r2.mo30224c()
            java.lang.String r3 = "profilesRepository.profi…stOrError().blockingGet()"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0038
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0038
        L_0x0036:
            r2 = 0
            goto L_0x0069
        L_0x0038:
            java.util.Iterator r2 = r2.iterator()
        L_0x003c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r2.next()
            com.bamtechmedia.dominguez.profiles.c0 r3 = (com.bamtechmedia.dominguez.profiles.C6626c0) r3
            java.lang.String r4 = r3.getProfileName()
            boolean r4 = kotlin.p588j0.C12832w.m40122b(r4, r6, r1)
            if (r4 == 0) goto L_0x0065
            java.lang.String r3 = r3.getProfileId()
            com.bamtechmedia.dominguez.profiles.r1 r4 = r5.f15217c
            java.lang.String r4 = r4.getProfileId()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r3, r4)
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x0065
            r3 = 1
            goto L_0x0066
        L_0x0065:
            r3 = 0
        L_0x0066:
            if (r3 == 0) goto L_0x003c
            r2 = 1
        L_0x0069:
            if (r2 == 0) goto L_0x006e
            int r2 = p163g.p201e.p203b.p330z.C7949h.error_duplicate_profile_name
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            com.bamtechmedia.dominguez.profiles.s1.i$m r3 = new com.bamtechmedia.dominguez.profiles.s1.i$m
            r3.<init>(r6, r2)
            r5.updateState(r3)
            if (r2 != 0) goto L_0x007a
            r0 = 1
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p259s1.C6808i.mo19552b(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo19549a(C6780r1 r1Var, int i) {
        if (i == 2000) {
            updateState(new C6824n(r1Var));
            this.f15221g.mo19443y();
        }
        this.f15217c = r1Var;
        m20923a(r1Var);
    }

    /* renamed from: a */
    private final Single<C6626c0> m20922a(boolean z, String str, C6654e0 e0Var, C6653e eVar) {
        if (!z && !this.f15218d) {
            return this.f15219e.mo19380a(str, e0Var, eVar);
        }
        Single<C6626c0> a = C6668a.m20672a(this.f15219e, false, 1, null).mo30087b().mo30233g(new C6810b(this)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6811c<Object,Object>(this, str, e0Var));
        C12880j.m40222a((Object) a, "profilesRepository.profi…ame, profileAttributes) }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20925a(Throwable th) {
        updateState(new C6812d(this.f15226l.mo20538b(th), C3573a.m12035a(this.f15227m, C7949h.btn_ok, (Map) null, 2, (Object) null)));
    }

    /* renamed from: a */
    private final void m20923a(C6780r1 r1Var) {
        Object a = this.f15220f.mo19404a(r1Var.mo19364j()).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C6813e(this, r1Var), C6815f.f15253c);
    }
}
