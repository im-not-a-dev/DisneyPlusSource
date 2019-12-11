package com.bamtechmedia.dominguez.collections.items;

import android.net.Uri;
import android.view.View;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;

/* renamed from: com.bamtechmedia.dominguez.collections.items.j */
/* compiled from: DebugAssetHelper.kt */
public final class C3364j {

    /* renamed from: a */
    private final String f8487a;

    /* renamed from: b */
    private final BuildInfo f8488b;

    public C3364j(BuildInfo buildInfo) {
        this.f8488b = buildInfo;
        this.f8487a = C3363i.$EnumSwitchMapping$0[this.f8488b.mo12778a().getSdk().ordinal()] != 1 ? "prod" : "qa";
        Uri.parse("http://default.nemo-app.mediadelivery.bamtech.prod.us-east-1.bamgrid.net").buildUpon().appendPath(this.f8487a).appendPath("mId").build();
    }

    /* renamed from: a */
    public final void mo12470a(View view, C3626b bVar) {
    }
}
