package com.bamtechmedia.dominguez.core.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u001bH\u0016J\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001eH\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00010\u00018BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/utils/LazySharedPreferences;", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "name", "", "(Landroid/content/Context;Ljava/lang/String;)V", "preferences", "kotlin.jvm.PlatformType", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "contains", "", "key", "edit", "Landroid/content/SharedPreferences$Editor;", "getAll", "", "getBoolean", "defValue", "getFloat", "", "getInt", "", "getLong", "", "getString", "getStringSet", "", "defValues", "registerOnSharedPreferenceChangeListener", "", "listener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "unregisterOnSharedPreferenceChangeListener", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.utils.n */
/* compiled from: LazySharedPreferences.kt */
public final class C5850n implements SharedPreferences {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f13631d = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C5850n.class), "preferences", "getPreferences()Landroid/content/SharedPreferences;"))};

    /* renamed from: a */
    private final Lazy f13632a = C12763i.m39921a(new C5851a(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f13633b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f13634c;

    /* renamed from: com.bamtechmedia.dominguez.core.utils.n$a */
    /* compiled from: LazySharedPreferences.kt */
    static final class C5851a extends C12881k implements Function0<SharedPreferences> {

        /* renamed from: c */
        final /* synthetic */ C5850n f13635c;

        C5851a(C5850n nVar) {
            this.f13635c = nVar;
            super(0);
        }

        public final SharedPreferences invoke() {
            return this.f13635c.f13633b.getSharedPreferences(this.f13635c.f13634c, 0);
        }
    }

    public C5850n(Context context, String str) {
        this.f13633b = context;
        this.f13634c = str;
    }

    /* renamed from: a */
    private final SharedPreferences m18874a() {
        Lazy lazy = this.f13632a;
        KProperty kProperty = f13631d[0];
        return (SharedPreferences) lazy.getValue();
    }

    public boolean contains(String str) {
        return m18874a().contains(str);
    }

    public Editor edit() {
        Editor edit = m18874a().edit();
        C12880j.m40222a((Object) edit, "preferences.edit()");
        return edit;
    }

    public Map<String, ?> getAll() {
        SharedPreferences a = m18874a();
        C12880j.m40222a((Object) a, "preferences");
        Map<String, ?> all = a.getAll();
        C12880j.m40222a((Object) all, "preferences.all");
        return all;
    }

    public boolean getBoolean(String str, boolean z) {
        return m18874a().getBoolean(str, z);
    }

    public float getFloat(String str, float f) {
        return m18874a().getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return m18874a().getInt(str, i);
    }

    public long getLong(String str, long j) {
        return m18874a().getLong(str, j);
    }

    public String getString(String str, String str2) {
        return m18874a().getString(str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return m18874a().getStringSet(str, set);
    }

    public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        m18874a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        m18874a().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
