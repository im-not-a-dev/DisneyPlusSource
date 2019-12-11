package com.bamtechmedia.dominguez.config;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&J2\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&J*\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/config/StringDictionary;", "", "allKeys", "", "", "getAllKeys", "()Ljava/util/Set;", "optionalString", "key", "replacements", "", "quantityString", "resourceId", "", "quantity", "string", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.config.r0 */
/* compiled from: StringDictionary.kt */
public interface C3572r0 {

    /* renamed from: com.bamtechmedia.dominguez.config.r0$a */
    /* compiled from: StringDictionary.kt */
    public static final class C3573a {
        /* renamed from: a */
        public static /* synthetic */ String m12035a(C3572r0 r0Var, int i, Map map, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    map = C13173j0.m40350a();
                }
                return r0Var.mo12772a(i, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: string");
        }

        /* renamed from: b */
        public static /* synthetic */ String m12037b(C3572r0 r0Var, String str, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = C13173j0.m40350a();
                }
                return r0Var.mo12775b(str, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: string");
        }

        /* renamed from: a */
        public static /* synthetic */ String m12036a(C3572r0 r0Var, String str, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = C13173j0.m40350a();
                }
                return r0Var.mo12773a(str, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optionalString");
        }
    }

    /* renamed from: a */
    String mo12772a(int i, Map<String, ? extends Object> map);

    /* renamed from: a */
    String mo12773a(String str, Map<String, ? extends Object> map);

    /* renamed from: a */
    Set<String> mo12774a();

    /* renamed from: b */
    String mo12775b(String str, Map<String, ? extends Object> map);
}
