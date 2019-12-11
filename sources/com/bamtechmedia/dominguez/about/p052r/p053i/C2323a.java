package com.bamtechmedia.dominguez.about.p052r.p053i;

import android.content.SharedPreferences;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11859i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001b\u0010\u000b\u001a\u0017\u0012\b\u0012\u00060\rR\u00020\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;", "", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "debugPreferences", "Landroid/content/SharedPreferences;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;Landroid/content/SharedPreferences;)V", "createSection", "Lcom/xwray/groupie/Group;", "titleResId", "", "configureBlock", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory$AboutSection;", "", "Lkotlin/ExtensionFunctionType;", "AboutSection", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.i.a */
/* compiled from: AboutItemsFactory.kt */
public final class C2323a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3572r0 f6481a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SharedPreferences f6482b;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002J0\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013J*\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory$AboutSection;", "", "(Lcom/bamtechmedia/dominguez/about/items/core/AboutItemsFactory;)V", "items", "", "Lcom/xwray/groupie/Group;", "getItems$about_release", "()Ljava/util/List;", "add", "", "item", "debugToggle", "titleResId", "", "preferenceKey", "", "defaultValue", "", "callbackOnChanged", "Lkotlin/Function0;", "simpleItem", "value", "clickAction", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.about.r.i.a$a */
    /* compiled from: AboutItemsFactory.kt */
    public final class C2324a {

        /* renamed from: a */
        private final List<C11847b> f6483a = new ArrayList();

        /* renamed from: com.bamtechmedia.dominguez.about.r.i.a$a$a */
        /* compiled from: AboutItemsFactory.kt */
        static final class C2325a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            public static final C2325a f6485c = new C2325a();

            C2325a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        public C2324a() {
        }

        /* renamed from: a */
        public final List<C11847b> mo11351a() {
            return this.f6483a;
        }

        /* renamed from: a */
        public static /* synthetic */ void m8769a(C2324a aVar, int i, String str, Function0 function0, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                function0 = null;
            }
            aVar.mo11352a(i, str, function0);
        }

        /* renamed from: a */
        public final void mo11352a(int i, String str, Function0<C13145v> function0) {
            m8771a(new C2331e(C3573a.m12035a(C2323a.this.f6481a, i, (Map) null, 2, (Object) null), str, function0));
        }

        /* renamed from: a */
        public static /* synthetic */ void m8770a(C2324a aVar, int i, String str, boolean z, Function0 function0, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                function0 = C2325a.f6485c;
            }
            aVar.mo11353a(i, str, z, function0);
        }

        /* renamed from: a */
        public final void mo11353a(int i, String str, boolean z, Function0<C13145v> function0) {
            C2328d dVar = new C2328d(i, C2323a.this.f6482b, str, z, false, function0, 16, null);
            m8771a(dVar);
        }

        /* renamed from: a */
        private final void m8771a(C11847b bVar) {
            if (bVar != null) {
                this.f6483a.add(bVar);
            }
        }
    }

    public C2323a(C3572r0 r0Var, SharedPreferences sharedPreferences) {
        this.f6481a = r0Var;
        this.f6482b = sharedPreferences;
    }

    /* renamed from: a */
    public final C11847b mo11350a(int i, Function1<? super C2324a, C13145v> function1) {
        C2324a aVar = new C2324a();
        function1.invoke(aVar);
        return new C11859i(new C2327c(C3573a.m12035a(this.f6481a, i, (Map) null, 2, (Object) null)), aVar.mo11351a());
    }
}
