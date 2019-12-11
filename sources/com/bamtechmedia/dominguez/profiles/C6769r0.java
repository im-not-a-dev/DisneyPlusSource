package com.bamtechmedia.dominguez.profiles;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5816a;
import com.bamtechmedia.dominguez.core.utils.C5818b;
import com.bamtechmedia.dominguez.core.utils.C5823d;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5845m;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.bamtechmedia.dominguez.profiles.C6671h0.C6672a;
import com.bamtechmedia.dominguez.profiles.p263u1.C6859b;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p314r.C7736f;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p201e.p203b.p330z.C7942a;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p201e.p203b.p330z.C7950i;
import p512h.p513c.p514k.C11890i;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002:;B\u0005¢\u0006\u0002\u0010\u0004J*\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u0012H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J&\u00103\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u000207H\u0016J\u001a\u00108\u001a\u0002072\u0006\u00109\u001a\u00020*2\b\u00104\u001a\u0004\u0018\u000105H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006<"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/core/utils/BackPressHandler;", "Lcom/bamtechmedia/dominguez/kidsmode/KidsModeInflater;", "()V", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "getBackgroundHelper", "()Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setBackgroundHelper", "(Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "flow", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow;", "getFlow", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow;", "flow$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "kidsMode", "", "getKidsMode", "()Z", "kidsMode$delegate", "Lcom/bamtechmedia/dominguez/core/utils/BooleanFragmentArgumentDelegate;", "profileHostRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "getProfileHostRouter", "()Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "setProfileHostRouter", "(Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;)V", "profilesHostViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "getProfilesHostViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "setProfilesHostViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;)V", "userProfileModeTracker", "Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;", "getUserProfileModeTracker", "()Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;", "setUserProfileModeTracker", "(Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;)V", "inflateKidsModeLayout", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "resource", "", "container", "Landroid/view/ViewGroup;", "attachToRoot", "onBackPress", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "Companion", "ProfilesFlow", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.r0 */
/* compiled from: ProfilesHostFragment.kt */
public final class C6769r0 extends C11890i implements C5818b, C7736f {

    /* renamed from: b0 */
    static final /* synthetic */ KProperty[] f15146b0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6769r0.class), "kidsMode", "getKidsMode()Z")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6769r0.class), "flow", "getFlow()Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow;"))};

    /* renamed from: c0 */
    public static final C6770a f15147c0 = new C6770a(null);

    /* renamed from: U */
    private final C5823d f15148U = C5839j.m18846a("kidsMode", Boolean.valueOf(false));

    /* renamed from: V */
    public C6671h0 f15149V;

    /* renamed from: W */
    public C6969y0 f15150W;

    /* renamed from: X */
    public C3848a f15151X;

    /* renamed from: Y */
    public C6859b f15152Y;

    /* renamed from: Z */
    private final C5883w f15153Z = C5839j.m18852a("profiles_setup_screen", (Function0) null, 2, (Object) null);

    /* renamed from: a0 */
    private HashMap f15154a0;

    /* renamed from: com.bamtechmedia.dominguez.profiles.r0$a */
    /* compiled from: ProfilesHostFragment.kt */
    public static final class C6770a {
        private C6770a() {
        }

        /* renamed from: a */
        public final C6769r0 mo19496a(C6771b bVar, boolean z) {
            C6769r0 r0Var = new C6769r0();
            r0Var.setArguments(C5833g.m18829a(C12907r.m40244a("profiles_setup_screen", bVar), C12907r.m40244a("kidsMode", Boolean.valueOf(z))));
            return r0Var;
        }

        public /* synthetic */ C6770a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow;", "Landroid/os/Parcelable;", "()V", "AddProfile", "CreateProfiles", "EditProfiles", "WhosWatching", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow$WhosWatching;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow$CreateProfiles;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow$AddProfile;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow$EditProfiles;", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b */
    /* compiled from: ProfilesHostFragment.kt */
    public static abstract class C6771b implements Parcelable {

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow$AddProfile;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b$a */
        /* compiled from: ProfilesHostFragment.kt */
        public static final class C6772a extends C6771b {
            public static final Creator CREATOR = new C6773a();

            /* renamed from: c */
            public static final C6772a f15155c = new C6772a();

            /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b$a$a */
            public static class C6773a implements Creator {
                public final Object createFromParcel(Parcel parcel) {
                    if (parcel.readInt() != 0) {
                        return C6772a.f15155c;
                    }
                    return null;
                }

                public final Object[] newArray(int i) {
                    return new C6772a[i];
                }
            }

            private C6772a() {
                super(null);
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow$CreateProfiles;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b$b */
        /* compiled from: ProfilesHostFragment.kt */
        public static final class C6774b extends C6771b {
            public static final Creator CREATOR = new C6775a();

            /* renamed from: c */
            public static final C6774b f15156c = new C6774b();

            /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b$b$a */
            public static class C6775a implements Creator {
                public final Object createFromParcel(Parcel parcel) {
                    if (parcel.readInt() != 0) {
                        return C6774b.f15156c;
                    }
                    return null;
                }

                public final Object[] newArray(int i) {
                    return new C6774b[i];
                }
            }

            private C6774b() {
                super(null);
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow$EditProfiles;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b$c */
        /* compiled from: ProfilesHostFragment.kt */
        public static final class C6776c extends C6771b {
            public static final Creator CREATOR = new C6777a();

            /* renamed from: c */
            public static final C6776c f15157c = new C6776c();

            /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b$c$a */
            public static class C6777a implements Creator {
                public final Object createFromParcel(Parcel parcel) {
                    if (parcel.readInt() != 0) {
                        return C6776c.f15157c;
                    }
                    return null;
                }

                public final Object[] newArray(int i) {
                    return new C6776c[i];
                }
            }

            private C6776c() {
                super(null);
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow$WhosWatching;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostFragment$ProfilesFlow;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
        /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b$d */
        /* compiled from: ProfilesHostFragment.kt */
        public static final class C6778d extends C6771b {
            public static final Creator CREATOR = new C6779a();

            /* renamed from: c */
            public static final C6778d f15158c = new C6778d();

            /* renamed from: com.bamtechmedia.dominguez.profiles.r0$b$d$a */
            public static class C6779a implements Creator {
                public final Object createFromParcel(Parcel parcel) {
                    if (parcel.readInt() != 0) {
                        return C6778d.f15158c;
                    }
                    return null;
                }

                public final Object[] newArray(int i) {
                    return new C6778d[i];
                }
            }

            private C6778d() {
                super(null);
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        private C6771b() {
        }

        public /* synthetic */ C6771b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: p */
    private final C6771b m20863p() {
        return (C6771b) this.f15153Z.mo17776a(this, f15146b0[1]);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15154a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15154a0 == null) {
            this.f15154a0 = new HashMap();
        }
        View view = (View) this.f15154a0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15154a0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public View mo19494a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        if (mo19495o()) {
            layoutInflater = C5845m.m18866a(layoutInflater, C7950i.ThemeOverlay_Kids);
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        Window window = requireActivity.getWindow();
        C12880j.m40222a((Object) window, "requireActivity().window");
        C12880j.m40222a((Object) inflate, "view");
        Context context = inflate.getContext();
        C12880j.m40222a((Object) context, "view.context");
        window.setNavigationBarColor(C5837i.m18835a(context, C7942a.navBarBackground, null, false, 6, null));
        return inflate;
    }

    /* renamed from: k */
    public boolean mo12236k() {
        StringBuilder sb = new StringBuilder();
        sb.append("## Profiles: onBackPressed during flow: -> ");
        sb.append(m20863p());
        C14100a.m44522a(sb.toString(), new Object[0]);
        return false;
    }

    /* renamed from: o */
    public final boolean mo19495o() {
        return this.f15148U.mo17732a(this, f15146b0[0]).booleanValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7948g.fragment_profiles_host, viewGroup, false, 4, null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        C5816a.m18808a(requireActivity);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C3848a aVar = this.f15151X;
        if (aVar != null) {
            View _$_findCachedViewById = _$_findCachedViewById(C7946e.profilesBackground);
            C12880j.m40222a((Object) _$_findCachedViewById, "profilesBackground");
            aVar.mo13766b(_$_findCachedViewById);
            if (bundle == null) {
                C6969y0 y0Var = this.f15150W;
                if (y0Var != null) {
                    y0Var.mo19723a(m20863p());
                    C6771b p = m20863p();
                    String str = "profileHostRouter";
                    if (p instanceof C6774b) {
                        C6671h0 h0Var = this.f15149V;
                        if (h0Var != null) {
                            h0Var.mo19393a();
                        } else {
                            C12880j.m40227c(str);
                            throw null;
                        }
                    } else if (p instanceof C6778d) {
                        C6859b bVar = this.f15152Y;
                        if (bVar != null) {
                            bVar.mo19624a(false);
                            C6671h0 h0Var2 = this.f15149V;
                            if (h0Var2 != null) {
                                C6672a.m20689a(h0Var2, false, false, true, 2, null);
                            } else {
                                C12880j.m40227c(str);
                                throw null;
                            }
                        } else {
                            C12880j.m40227c("userProfileModeTracker");
                            throw null;
                        }
                    } else if (p instanceof C6772a) {
                        C6671h0 h0Var3 = this.f15149V;
                        if (h0Var3 != null) {
                            C6672a.m20688a(h0Var3, false, false, null, true, null, 0, 54, null);
                        } else {
                            C12880j.m40227c(str);
                            throw null;
                        }
                    } else if (p instanceof C6776c) {
                        C6671h0 h0Var4 = this.f15149V;
                        if (h0Var4 != null) {
                            C6672a.m20687a(h0Var4, false, true, 1, null);
                        } else {
                            C12880j.m40227c(str);
                            throw null;
                        }
                    }
                } else {
                    C12880j.m40227c("profilesHostViewModel");
                    throw null;
                }
            }
        } else {
            C12880j.m40227c("backgroundHelper");
            throw null;
        }
    }
}
