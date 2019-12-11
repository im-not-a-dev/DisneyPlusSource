package com.bamtechmedia.dominguez.dictionaries;

import com.bamtechmedia.dominguez.core.p214j.C5756a;
import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11780y;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011J$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/DictionaryEntriesDataSource;", "", "request", "Lcom/bamtechmedia/dominguez/dictionaries/DictionaryRequest;", "documentStore", "Lcom/bamtechmedia/dominguez/core/documents/DocumentStore;", "(Lcom/bamtechmedia/dominguez/dictionaries/DictionaryRequest;Lcom/bamtechmedia/dominguez/core/documents/DocumentStore;)V", "type", "Ljava/lang/reflect/ParameterizedType;", "kotlin.jvm.PlatformType", "getType", "()Ljava/lang/reflect/ParameterizedType;", "initialEntriesOnce", "Lio/reactivex/Single;", "", "Lcom/bamtechmedia/dominguez/dictionaries/Dictionary;", "language", "", "localEntries", "", "resourceKey", "path", "remoteDictionariesOnce", "resourceKeys", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.dictionaries.e */
/* compiled from: DictionaryEntriesDataSource.kt */
public final class C6068e {

    /* renamed from: a */
    private final C6082j f13969a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5756a f13970b;

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.e$a */
    /* compiled from: DictionaryEntriesDataSource.kt */
    static final class C6069a<T> implements Consumer<List<? extends Dictionary>> {

        /* renamed from: U */
        final /* synthetic */ String f13971U;

        /* renamed from: c */
        final /* synthetic */ C6068e f13972c;

        C6069a(C6068e eVar, String str) {
            this.f13972c = eVar;
            this.f13971U = str;
        }

        /* renamed from: a */
        public final void accept(List<Dictionary> list) {
            for (Dictionary dictionary : list) {
                C5756a a = this.f13972c.f13970b;
                String a2 = this.f13972c.m19441b(dictionary.mo18327b(), this.f13971U);
                Map a3 = dictionary.mo18326a();
                ParameterizedType b = this.f13972c.m19440a();
                C12880j.m40222a((Object) b, "type");
                a.mo17636a(a2, a3, b);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.e$b */
    /* compiled from: DictionaryEntriesDataSource.kt */
    static final class C6070b<T> implements Consumer<List<? extends Dictionary>> {

        /* renamed from: U */
        final /* synthetic */ String f13973U;

        /* renamed from: c */
        final /* synthetic */ C6068e f13974c;

        C6070b(C6068e eVar, String str) {
            this.f13974c = eVar;
            this.f13973U = str;
        }

        /* renamed from: a */
        public final void accept(List<Dictionary> list) {
            C12880j.m40222a((Object) list, "dictionaries");
            for (Dictionary dictionary : list) {
                C5756a a = this.f13974c.f13970b;
                String a2 = this.f13974c.m19441b(dictionary.mo18327b(), this.f13973U);
                Map a3 = dictionary.mo18326a();
                ParameterizedType b = this.f13974c.m19440a();
                C12880j.m40222a((Object) b, "type");
                a.mo17636a(a2, a3, b);
            }
        }
    }

    public C6068e(C6082j jVar, C5756a aVar) {
        this.f13969a = jVar;
        this.f13970b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m19441b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("dictionaries");
        sb.append(File.separator);
        sb.append(str);
        sb.append('-');
        sb.append(str2);
        sb.append(".json");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final ParameterizedType m19440a() {
        return C11780y.m37894a((Type) Map.class, String.class, String.class);
    }

    /* renamed from: a */
    public final Map<String, String> mo18346a(String str, String str2) {
        C5756a aVar = this.f13970b;
        ParameterizedType a = m19440a();
        C12880j.m40222a((Object) a, "type");
        String b = m19441b(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("dictionary_fallback_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        sb.append(".json");
        return (Map) C5756a.m18680a(aVar, a, b, null, sb.toString(), 4, null);
    }

    /* renamed from: a */
    public final Single<List<Dictionary>> mo18345a(List<String> list, String str) {
        Single<List<Dictionary>> a = this.f13969a.mo18357a(list, str).mo30207a((Consumer<? super T>) new C6070b<Object>(this, str));
        C12880j.m40222a((Object) a, "request.dictionariesOnce…          }\n            }");
        return a;
    }

    /* renamed from: a */
    public final Single<List<Dictionary>> mo18344a(String str) {
        Single<List<Dictionary>> a = this.f13969a.mo18356a(str).mo30207a((Consumer<? super T>) new C6069a<Object>(this, str));
        C12880j.m40222a((Object) a, "request.initialDictionar…          }\n            }");
        return a;
    }
}
