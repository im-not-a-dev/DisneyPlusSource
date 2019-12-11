package okio;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.C13142s;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u001f\b\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\rH\u0002R\u001e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo31007d2 = {"Lokio/Options;", "Ljava/util/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$jvm", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$jvm", "()[I", "get", "index", "Companion", "jvm"}, mo31008k = 1, mo31009mv = {1, 1, 11})
/* renamed from: okio.n */
/* compiled from: Options.kt */
public final class C14288n extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: V */
    public static final C14289a f31882V = new C14289a(null);

    /* renamed from: U */
    private final int[] f31883U;

    /* renamed from: c */
    private final ByteString[] f31884c;

    /* renamed from: okio.n$a */
    /* compiled from: Options.kt */
    public static final class C14289a {
        private C14289a() {
        }

        /* renamed from: a */
        public final C14288n mo36438a(ByteString... byteStringArr) {
            ByteString[] byteStringArr2 = byteStringArr;
            int i = 0;
            if (byteStringArr2.length == 0) {
                return new C14288n(new ByteString[0], new int[]{0, -1}, null);
            }
            List m = C13174k.m40413m(byteStringArr);
            C13194s.m40542c(m);
            ArrayList arrayList = new ArrayList(byteStringArr2.length);
            for (ByteString byteString : byteStringArr2) {
                arrayList.add(Integer.valueOf(-1));
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List e = C13185o.m40523e((Integer[]) Arrays.copyOf(numArr, numArr.length));
                int length = byteStringArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    e.set(C13185o.m40509a(m, byteStringArr2[i2], 0, 0, 6, null), Integer.valueOf(i3));
                    i2++;
                    i3 = i4;
                }
                if (((ByteString) m.get(0)).size() > 0) {
                    int i5 = 0;
                    while (i5 < m.size()) {
                        ByteString byteString2 = (ByteString) m.get(i5);
                        int i6 = i5 + 1;
                        int i7 = i6;
                        while (i7 < m.size()) {
                            ByteString byteString3 = (ByteString) m.get(i7);
                            if (!byteString3.mo36378b(byteString2)) {
                                continue;
                                break;
                            }
                            if (!(byteString3.size() != byteString2.size())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("duplicate option: ");
                                sb.append(byteString3);
                                throw new IllegalArgumentException(sb.toString().toString());
                            } else if (((Number) e.get(i7)).intValue() > ((Number) e.get(i5)).intValue()) {
                                m.remove(i7);
                                e.remove(i7);
                            } else {
                                i7++;
                            }
                        }
                        i5 = i6;
                    }
                    Buffer buffer = new Buffer();
                    m45739a(this, 0, buffer, 0, m, 0, 0, e, 53, null);
                    int[] iArr = new int[((int) m45737a(buffer))];
                    while (!buffer.mo36309a0()) {
                        int i8 = i + 1;
                        iArr[i] = buffer.readInt();
                        i = i8;
                    }
                    return new C14288n((ByteString[]) byteStringArr.clone(), iArr, null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public /* synthetic */ C14289a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        static /* bridge */ /* synthetic */ void m45739a(C14289a aVar, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m45738a((i4 & 1) != 0 ? 0 : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: a */
        private final void m45738a(long j, Buffer buffer, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            Buffer buffer2;
            Buffer buffer3 = buffer;
            int i8 = i;
            List<? extends ByteString> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            String str = "Failed requirement.";
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((ByteString) list3.get(i11)).size() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException(str.toString());
                    }
                }
                ByteString byteString = (ByteString) list.get(i2);
                ByteString byteString2 = (ByteString) list3.get(i10 - 1);
                if (i8 == byteString.size()) {
                    int intValue = ((Number) list4.get(i9)).intValue();
                    int i12 = i9 + 1;
                    i4 = i12;
                    i5 = intValue;
                    byteString = (ByteString) list3.get(i12);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (byteString.mo36369a(i8) != byteString2.mo36369a(i8)) {
                    int i13 = 1;
                    for (int i14 = i4 + 1; i14 < i10; i14++) {
                        if (((ByteString) list3.get(i14 - 1)).mo36369a(i8) != ((ByteString) list3.get(i14)).mo36369a(i8)) {
                            i13++;
                        }
                    }
                    long a = j + m45737a(buffer3) + ((long) 2) + ((long) (i13 * 2));
                    buffer3.writeInt(i13);
                    buffer3.writeInt(i5);
                    for (int i15 = i4; i15 < i10; i15++) {
                        byte a2 = ((ByteString) list3.get(i15)).mo36369a(i8);
                        if (i15 == i4 || a2 != ((ByteString) list3.get(i15 - 1)).mo36369a(i8)) {
                            buffer3.writeInt((int) a2 & 255);
                        }
                    }
                    Buffer buffer4 = new Buffer();
                    while (i4 < i10) {
                        byte a3 = ((ByteString) list3.get(i4)).mo36369a(i8);
                        int i16 = i4 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i10) {
                                i6 = i10;
                                break;
                            } else if (a3 != ((ByteString) list3.get(i17)).mo36369a(i8)) {
                                i6 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i6 && i8 + 1 == ((ByteString) list3.get(i4)).size()) {
                            buffer3.writeInt(((Number) list4.get(i4)).intValue());
                            i7 = i6;
                            buffer2 = buffer4;
                        } else {
                            buffer3.writeInt(((int) (a + m45737a(buffer4))) * -1);
                            i7 = i6;
                            buffer2 = buffer4;
                            m45738a(a, buffer4, i8 + 1, list, i4, i6, list2);
                        }
                        buffer4 = buffer2;
                        i4 = i7;
                    }
                    buffer3.mo36298a((C14302x) buffer4);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i18 = i8;
                int i19 = 0;
                while (i18 < min && byteString.mo36369a(i18) == byteString2.mo36369a(i18)) {
                    i19++;
                    i18++;
                }
                long a4 = j + m45737a(buffer3) + ((long) 2) + ((long) i19) + 1;
                buffer3.writeInt(-i19);
                buffer3.writeInt(i5);
                int i20 = i8 + i19;
                while (i8 < i20) {
                    buffer3.writeInt((int) byteString.mo36369a(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i20 == ((ByteString) list3.get(i4)).size()) {
                        buffer3.writeInt(((Number) list4.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                Buffer buffer5 = new Buffer();
                buffer3.writeInt(((int) (m45737a(buffer5) + a4)) * -1);
                m45738a(a4, buffer5, i20, list, i4, i3, list2);
                buffer3.mo36298a((C14302x) buffer5);
                return;
            }
            throw new IllegalArgumentException(str.toString());
        }

        /* renamed from: a */
        private final long m45737a(Buffer buffer) {
            return buffer.mo36335h() / ((long) 4);
        }
    }

    public /* synthetic */ C14288n(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    /* renamed from: a */
    public static final C14288n m45729a(ByteString... byteStringArr) {
        return f31882V.mo36438a(byteStringArr);
    }

    /* renamed from: a */
    public /* bridge */ boolean mo36425a(ByteString byteString) {
        return super.contains(byteString);
    }

    /* renamed from: b */
    public /* bridge */ int mo36426b(ByteString byteString) {
        return super.indexOf(byteString);
    }

    /* renamed from: c */
    public /* bridge */ int mo36429c(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof ByteString : true) {
            return mo36425a((ByteString) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ boolean mo36431d(ByteString byteString) {
        return super.remove(byteString);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof ByteString : true) {
            return mo36426b((ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof ByteString : true) {
            return mo36429c((ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof ByteString : true) {
            return mo36431d((ByteString) obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return mo36428c();
    }

    private C14288n(ByteString[] byteStringArr, int[] iArr) {
        this.f31884c = byteStringArr;
        this.f31883U = iArr;
    }

    /* renamed from: b */
    public final ByteString[] mo36427b() {
        return this.f31884c;
    }

    /* renamed from: c */
    public int mo36428c() {
        return this.f31884c.length;
    }

    /* renamed from: d */
    public final int[] mo36432d() {
        return this.f31883U;
    }

    public ByteString get(int i) {
        return this.f31884c[i];
    }
}
