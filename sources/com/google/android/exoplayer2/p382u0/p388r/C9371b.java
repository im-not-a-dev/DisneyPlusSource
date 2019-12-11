package com.google.android.exoplayer2.p382u0.p388r;

import android.graphics.BitmapFactory;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p393v0.C9537e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.u0.r.b */
/* compiled from: TtmlNode */
final class C9371b {

    /* renamed from: a */
    public final String f21565a;

    /* renamed from: b */
    public final String f21566b;

    /* renamed from: c */
    public final boolean f21567c;

    /* renamed from: d */
    public final long f21568d;

    /* renamed from: e */
    public final long f21569e;

    /* renamed from: f */
    public final C9374e f21570f;

    /* renamed from: g */
    private final String[] f21571g;

    /* renamed from: h */
    public final String f21572h;

    /* renamed from: i */
    public final String f21573i;

    /* renamed from: j */
    private final HashMap<String, Integer> f21574j;

    /* renamed from: k */
    private final HashMap<String, Integer> f21575k;

    /* renamed from: l */
    private List<C9371b> f21576l;

    private C9371b(String str, String str2, long j, long j2, C9374e eVar, String[] strArr, String str3, String str4) {
        this.f21565a = str;
        this.f21566b = str2;
        this.f21573i = str4;
        this.f21570f = eVar;
        this.f21571g = strArr;
        this.f21567c = str2 != null;
        this.f21568d = j;
        this.f21569e = j2;
        C9537e.m29296a(str3);
        this.f21572h = str3;
        this.f21574j = new HashMap<>();
        this.f21575k = new HashMap<>();
    }

    /* renamed from: a */
    public static C9371b m28578a(String str) {
        C9371b bVar = new C9371b(null, C9373d.m28592a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
        return bVar;
    }

    /* renamed from: b */
    public long[] mo24196b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m28584a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            jArr[i] = ((Long) it.next()).longValue();
            i = i2;
        }
        return jArr;
    }

    /* renamed from: a */
    public static C9371b m28579a(String str, long j, long j2, C9374e eVar, String[] strArr, String str2, String str3) {
        C9371b bVar = new C9371b(str, null, j, j2, eVar, strArr, str2, str3);
        return bVar;
    }

    /* renamed from: a */
    public boolean mo24195a(long j) {
        return (this.f21568d == -9223372036854775807L && this.f21569e == -9223372036854775807L) || (this.f21568d <= j && this.f21569e == -9223372036854775807L) || ((this.f21568d == -9223372036854775807L && j < this.f21569e) || (this.f21568d <= j && j < this.f21569e));
    }

    /* renamed from: a */
    public void mo24194a(C9371b bVar) {
        if (this.f21576l == null) {
            this.f21576l = new ArrayList();
        }
        this.f21576l.add(bVar);
    }

    /* renamed from: a */
    public C9371b mo24192a(int i) {
        List<C9371b> list = this.f21576l;
        if (list != null) {
            return (C9371b) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public int mo24191a() {
        List<C9371b> list = this.f21576l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    private void m28584a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f21565a);
        boolean equals2 = "div".equals(this.f21565a);
        if (z || equals || (equals2 && this.f21573i != null)) {
            long j = this.f21568d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f21569e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f21576l != null) {
            for (int i = 0; i < this.f21576l.size(); i++) {
                ((C9371b) this.f21576l.get(i)).m28584a(treeSet, z || equals);
            }
        }
    }

    /* renamed from: a */
    public List<C9322b> mo24193a(long j, Map<String, C9374e> map, Map<String, C9372c> map2, Map<String, String> map3) {
        long j2 = j;
        Map<String, C9372c> map4 = map2;
        ArrayList<Pair> arrayList = new ArrayList<>();
        m28580a(j2, this.f21572h, (List<Pair<String, String>>) arrayList);
        TreeMap treeMap = new TreeMap();
        m28582a(j, false, this.f21572h, (Map<String, SpannableStringBuilder>) treeMap);
        m28581a(j2, map, (Map<String, SpannableStringBuilder>) treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                C9372c cVar = (C9372c) map4.get(pair.first);
                C9322b bVar = new C9322b(BitmapFactory.decodeByteArray(decode, 0, decode.length), cVar.f21578b, 0, cVar.f21579c, cVar.f21581e, cVar.f21582f, cVar.f21583g);
                arrayList2.add(bVar);
            }
        }
        for (Entry entry : treeMap.entrySet()) {
            C9372c cVar2 = (C9372c) map4.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            m28576a(spannableStringBuilder);
            C9322b bVar2 = new C9322b((CharSequence) spannableStringBuilder, (Alignment) null, cVar2.f21579c, cVar2.f21580d, cVar2.f21581e, cVar2.f21578b, Integer.MIN_VALUE, cVar2.f21582f, cVar2.f21584h, cVar2.f21585i);
            arrayList2.add(bVar2);
        }
        return arrayList2;
    }

    /* renamed from: a */
    private void m28580a(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f21572h)) {
            str = this.f21572h;
        }
        if (mo24195a(j)) {
            if ("div".equals(this.f21565a)) {
                String str2 = this.f21573i;
                if (str2 != null) {
                    list.add(new Pair(str, str2));
                    return;
                }
            }
        }
        for (int i = 0; i < mo24191a(); i++) {
            mo24192a(i).m28580a(j, str, list);
        }
    }

    /* renamed from: a */
    private void m28582a(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f21574j.clear();
        this.f21575k.clear();
        if (!"metadata".equals(this.f21565a)) {
            if (!"".equals(this.f21572h)) {
                str = this.f21572h;
            }
            if (!this.f21567c || !z) {
                if ("br".equals(this.f21565a) && z) {
                    m28577a(str, map).append(10);
                } else if (mo24195a(j)) {
                    for (Entry entry : map.entrySet()) {
                        this.f21574j.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                    }
                    boolean equals = "p".equals(this.f21565a);
                    for (int i = 0; i < mo24191a(); i++) {
                        mo24192a(i).m28582a(j, z || equals, str, map);
                    }
                    if (equals) {
                        C9373d.m28593a(m28577a(str, map));
                    }
                    for (Entry entry2 : map.entrySet()) {
                        this.f21575k.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                    }
                }
            } else {
                m28577a(str, map).append(this.f21566b);
            }
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m28577a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    /* renamed from: a */
    private void m28581a(long j, Map<String, C9374e> map, Map<String, SpannableStringBuilder> map2) {
        int i;
        if (mo24195a(j)) {
            Iterator it = this.f21575k.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (this.f21574j.containsKey(str)) {
                    i = ((Integer) this.f21574j.get(str)).intValue();
                }
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i != intValue) {
                    m28583a(map, (SpannableStringBuilder) map2.get(str), i, intValue);
                }
            }
            while (i < mo24191a()) {
                mo24192a(i).m28581a(j, map, map2);
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m28583a(Map<String, C9374e> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        C9374e a = C9373d.m28591a(this.f21570f, this.f21571g, map);
        if (a != null) {
            C9373d.m28594a(spannableStringBuilder, i, i2, a);
        }
    }

    /* renamed from: a */
    private SpannableStringBuilder m28576a(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int i3 = 0;
        int length = spannableStringBuilder.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 > 0) {
                    spannableStringBuilder.delete(i4, i4 + i7);
                    length -= i7;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i8 = 0;
        while (true) {
            i = length - 1;
            if (i8 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i8) == 10) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                    length--;
                }
            }
            i8++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
            spannableStringBuilder.delete(i, length);
            length--;
        }
        while (true) {
            i2 = length - 1;
            if (i3 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i3) == ' ') {
                int i10 = i3 + 1;
                if (spannableStringBuilder.charAt(i10) == 10) {
                    spannableStringBuilder.delete(i3, i10);
                    length--;
                }
            }
            i3++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == 10) {
            spannableStringBuilder.delete(i2, length);
        }
        return spannableStringBuilder;
    }
}
