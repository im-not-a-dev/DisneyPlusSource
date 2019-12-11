package androidx.room.p003k;

import android.database.Cursor;
import android.os.Build.VERSION;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.room.k.d */
/* compiled from: TableInfo */
public class C0948d {

    /* renamed from: a */
    public final String f3760a;

    /* renamed from: b */
    public final Map<String, C0949a> f3761b;

    /* renamed from: c */
    public final Set<C0950b> f3762c;

    /* renamed from: d */
    public final Set<C0952d> f3763d;

    /* renamed from: androidx.room.k.d$a */
    /* compiled from: TableInfo */
    public static class C0949a {

        /* renamed from: a */
        public final String f3764a;

        /* renamed from: b */
        public final String f3765b;

        /* renamed from: c */
        public final int f3766c;

        /* renamed from: d */
        public final boolean f3767d;

        /* renamed from: e */
        public final int f3768e;

        public C0949a(String str, String str2, boolean z, int i) {
            this.f3764a = str;
            this.f3765b = str2;
            this.f3767d = z;
            this.f3768e = i;
            this.f3766c = m5167a(str2);
        }

        /* renamed from: a */
        private static int m5167a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0949a.class != obj.getClass()) {
                return false;
            }
            C0949a aVar = (C0949a) obj;
            if (VERSION.SDK_INT >= 20) {
                if (this.f3768e != aVar.f3768e) {
                    return false;
                }
            } else if (mo5282a() != aVar.mo5282a()) {
                return false;
            }
            if (!this.f3764a.equals(aVar.f3764a) || this.f3767d != aVar.f3767d) {
                return false;
            }
            if (this.f3766c != aVar.f3766c) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f3764a.hashCode() * 31) + this.f3766c) * 31) + (this.f3767d ? 1231 : 1237)) * 31) + this.f3768e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f3764a);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.f3765b);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.f3766c);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.f3767d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f3768e);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        public boolean mo5282a() {
            return this.f3768e > 0;
        }
    }

    /* renamed from: androidx.room.k.d$b */
    /* compiled from: TableInfo */
    public static class C0950b {

        /* renamed from: a */
        public final String f3769a;

        /* renamed from: b */
        public final String f3770b;

        /* renamed from: c */
        public final String f3771c;

        /* renamed from: d */
        public final List<String> f3772d;

        /* renamed from: e */
        public final List<String> f3773e;

        public C0950b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f3769a = str;
            this.f3770b = str2;
            this.f3771c = str3;
            this.f3772d = Collections.unmodifiableList(list);
            this.f3773e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0950b.class != obj.getClass()) {
                return false;
            }
            C0950b bVar = (C0950b) obj;
            if (this.f3769a.equals(bVar.f3769a) && this.f3770b.equals(bVar.f3770b) && this.f3771c.equals(bVar.f3771c) && this.f3772d.equals(bVar.f3772d)) {
                return this.f3773e.equals(bVar.f3773e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f3769a.hashCode() * 31) + this.f3770b.hashCode()) * 31) + this.f3771c.hashCode()) * 31) + this.f3772d.hashCode()) * 31) + this.f3773e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ForeignKey{referenceTable='");
            sb.append(this.f3769a);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.f3770b);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.f3771c);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.f3772d);
            sb.append(", referenceColumnNames=");
            sb.append(this.f3773e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.room.k.d$c */
    /* compiled from: TableInfo */
    static class C0951c implements Comparable<C0951c> {

        /* renamed from: U */
        final int f3774U;

        /* renamed from: V */
        final String f3775V;

        /* renamed from: W */
        final String f3776W;

        /* renamed from: c */
        final int f3777c;

        C0951c(int i, int i2, String str, String str2) {
            this.f3777c = i;
            this.f3774U = i2;
            this.f3775V = str;
            this.f3776W = str2;
        }

        /* renamed from: a */
        public int compareTo(C0951c cVar) {
            int i = this.f3777c - cVar.f3777c;
            return i == 0 ? this.f3774U - cVar.f3774U : i;
        }
    }

    /* renamed from: androidx.room.k.d$d */
    /* compiled from: TableInfo */
    public static class C0952d {

        /* renamed from: a */
        public final String f3778a;

        /* renamed from: b */
        public final boolean f3779b;

        /* renamed from: c */
        public final List<String> f3780c;

        public C0952d(String str, boolean z, List<String> list) {
            this.f3778a = str;
            this.f3779b = z;
            this.f3780c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0952d.class != obj.getClass()) {
                return false;
            }
            C0952d dVar = (C0952d) obj;
            if (this.f3779b != dVar.f3779b || !this.f3780c.equals(dVar.f3780c)) {
                return false;
            }
            String str = "index_";
            if (this.f3778a.startsWith(str)) {
                return dVar.f3778a.startsWith(str);
            }
            return this.f3778a.equals(dVar.f3778a);
        }

        public int hashCode() {
            int i;
            String str = "index_";
            if (this.f3778a.startsWith(str)) {
                i = str.hashCode();
            } else {
                i = this.f3778a.hashCode();
            }
            return (((i * 31) + (this.f3779b ? 1 : 0)) * 31) + this.f3780c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Index{name='");
            sb.append(this.f3778a);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.f3779b);
            sb.append(", columns=");
            sb.append(this.f3780c);
            sb.append('}');
            return sb.toString();
        }
    }

    public C0948d(String str, Map<String, C0949a> map, Set<C0950b> set, Set<C0952d> set2) {
        Set<C0952d> set3;
        this.f3760a = str;
        this.f3761b = Collections.unmodifiableMap(map);
        this.f3762c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f3763d = set3;
    }

    /* renamed from: a */
    public static C0948d m5162a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return new C0948d(str, m5164b(supportSQLiteDatabase, str), m5165c(supportSQLiteDatabase, str), m5166d(supportSQLiteDatabase, str));
    }

    /* renamed from: b */
    private static Map<String, C0949a> m5164b(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor d = supportSQLiteDatabase.mo5308d(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (d.getColumnCount() > 0) {
                int columnIndex = d.getColumnIndex("name");
                int columnIndex2 = d.getColumnIndex("type");
                int columnIndex3 = d.getColumnIndex("notnull");
                int columnIndex4 = d.getColumnIndex("pk");
                while (d.moveToNext()) {
                    String string = d.getString(columnIndex);
                    hashMap.put(string, new C0949a(string, d.getString(columnIndex2), d.getInt(columnIndex3) != 0, d.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            d.close();
        }
    }

    /* renamed from: c */
    private static Set<C0950b> m5165c(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor d = supportSQLiteDatabase.mo5308d(sb.toString());
        try {
            int columnIndex = d.getColumnIndex("id");
            int columnIndex2 = d.getColumnIndex("seq");
            int columnIndex3 = d.getColumnIndex("table");
            int columnIndex4 = d.getColumnIndex("on_delete");
            int columnIndex5 = d.getColumnIndex("on_update");
            List<C0951c> a = m5163a(d);
            int count = d.getCount();
            for (int i = 0; i < count; i++) {
                d.moveToPosition(i);
                if (d.getInt(columnIndex2) == 0) {
                    int i2 = d.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0951c cVar : a) {
                        if (cVar.f3777c == i2) {
                            arrayList.add(cVar.f3775V);
                            arrayList2.add(cVar.f3776W);
                        }
                    }
                    C0950b bVar = new C0950b(d.getString(columnIndex3), d.getString(columnIndex4), d.getString(columnIndex5), arrayList, arrayList2);
                    hashSet.add(bVar);
                }
            }
            return hashSet;
        } finally {
            d.close();
        }
    }

    /* renamed from: d */
    private static Set<C0952d> m5166d(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor d = supportSQLiteDatabase.mo5308d(sb.toString());
        try {
            int columnIndex = d.getColumnIndex("name");
            int columnIndex2 = d.getColumnIndex("origin");
            int columnIndex3 = d.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (d.moveToNext()) {
                        if ("c".equals(d.getString(columnIndex2))) {
                            String string = d.getString(columnIndex);
                            boolean z = true;
                            if (d.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0952d a = m5161a(supportSQLiteDatabase, string, z);
                            if (a == null) {
                                d.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    d.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            d.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0948d.class != obj.getClass()) {
            return false;
        }
        C0948d dVar = (C0948d) obj;
        String str = this.f3760a;
        if (str == null ? dVar.f3760a != null : !str.equals(dVar.f3760a)) {
            return false;
        }
        Map<String, C0949a> map = this.f3761b;
        if (map == null ? dVar.f3761b != null : !map.equals(dVar.f3761b)) {
            return false;
        }
        Set<C0950b> set = this.f3762c;
        if (set == null ? dVar.f3762c != null : !set.equals(dVar.f3762c)) {
            return false;
        }
        Set<C0952d> set2 = this.f3763d;
        if (set2 != null) {
            Set<C0952d> set3 = dVar.f3763d;
            if (set3 != null) {
                return set2.equals(set3);
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f3760a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C0949a> map = this.f3761b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C0950b> set = this.f3762c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TableInfo{name='");
        sb.append(this.f3760a);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.f3761b);
        sb.append(", foreignKeys=");
        sb.append(this.f3762c);
        sb.append(", indices=");
        sb.append(this.f3763d);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private static List<C0951c> m5163a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0951c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static C0952d m5161a(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor d = supportSQLiteDatabase.mo5308d(sb.toString());
        try {
            int columnIndex = d.getColumnIndex("seqno");
            int columnIndex2 = d.getColumnIndex("cid");
            int columnIndex3 = d.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (d.moveToNext()) {
                        if (d.getInt(columnIndex2) >= 0) {
                            int i = d.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), d.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0952d dVar = new C0952d(str, z, arrayList);
                    d.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            d.close();
        }
    }
}
