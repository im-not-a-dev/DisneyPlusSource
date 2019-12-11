package com.bamtechmedia.dominguez.profiles;

import android.content.Context;
import androidx.room.C0934f;
import com.bamtechmedia.dominguez.profiles.p258db.C6632a;
import com.bamtechmedia.dominguez.profiles.p258db.C6639c;
import com.bamtechmedia.dominguez.profiles.p258db.ProfilesDatabase;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.profiles.u */
/* compiled from: FeatureProfilesModule */
public abstract class C6855u {
    /* renamed from: a */
    static ProfilesDatabase m21017a(Context context) {
        return (ProfilesDatabase) C0934f.m5137a(context, ProfilesDatabase.class, "profiles").mo5229b();
    }

    /* renamed from: b */
    static C6639c m21020b(ProfilesDatabase profilesDatabase) {
        return profilesDatabase.mo19301b();
    }

    /* renamed from: a */
    static C6632a m21018a(ProfilesDatabase profilesDatabase) {
        return profilesDatabase.mo19300a();
    }

    /* renamed from: a */
    static Single<Boolean> m21019a(C6782s sVar) {
        return sVar.mo19523a();
    }
}
