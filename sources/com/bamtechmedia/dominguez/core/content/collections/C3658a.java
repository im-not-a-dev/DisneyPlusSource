package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3793w;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3626b.C3627a;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.sets.ContentSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bamtechmedia.dominguez.core.content.collections.a */
/* compiled from: Collection.kt */
public abstract class C3658a implements C3626b, C3793w {
    private C3658a() {
    }

    /* renamed from: K */
    public abstract String mo13342K();

    /* renamed from: O */
    public abstract List<Container> mo13343O();

    /* renamed from: P */
    public abstract String mo13344P();

    /* renamed from: Q */
    public abstract C3680n mo13345Q();

    /* renamed from: R */
    public abstract List<C3626b> mo13346R();

    /* renamed from: S */
    public abstract String mo13347S();

    /* renamed from: a */
    public Image mo12845a(C3688j jVar, C3623a aVar) {
        return C3627a.m12343a((C3626b) this, jVar, aVar);
    }

    /* renamed from: a */
    public abstract C3658a mo13352a(String str);

    /* renamed from: a */
    public abstract C3658a mo13353a(List<String> list);

    /* renamed from: a */
    public abstract C3658a mo13354a(Set<ContentSet> set);

    public /* synthetic */ C3658a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public Image mo12846a(String str, C3623a aVar) {
        return C3627a.m12344a((C3626b) this, str, aVar);
    }
}
