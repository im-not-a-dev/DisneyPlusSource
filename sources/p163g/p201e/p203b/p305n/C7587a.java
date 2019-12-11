package p163g.p201e.p203b.p305n;

import android.content.res.Resources;
import com.bamtechmedia.dominguez.collections.p080o0.C3433a;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5365h;

/* renamed from: g.e.b.n.a */
/* compiled from: EditorialImageLoader.kt */
public abstract class C7587a {

    /* renamed from: a */
    private final Resources f16600a;

    public C7587a(Resources resources) {
        this.f16600a = resources;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20523a(Image image, C3623a aVar);

    /* renamed from: a */
    public final void mo20524a(C3658a aVar, C3433a aVar2) {
        String string = this.f16600a.getString(C5365h.collection_size_qualifier);
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "resources.getString(R.st…ollection_size_qualifier)");
        C3623a aVar3 = new C3623a(((Number) aVar2.mo12607a("backgroundAspectRatio", string)).floatValue());
        mo20523a(aVar.mo12846a((String) aVar2.mo12606a("background"), aVar3), aVar3);
    }
}
