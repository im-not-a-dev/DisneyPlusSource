package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11196l2;
import p163g.p449j.p450a.p451a.p457d.p464g.C11228n2;

/* renamed from: g.j.a.a.d.g.l2 */
public abstract class C11196l2<MessageType extends C11196l2<MessageType, BuilderType>, BuilderType extends C11228n2<MessageType, BuilderType>> implements C11259p5 {
    private static boolean zzacu = false;
    protected int zzact = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28425a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final C11342v2 mo28655c() {
        try {
            C11074d3 h = C11342v2.m36531h(mo28427b());
            mo28426a(h.mo28386b());
            return h.mo28385a();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: f */
    public final byte[] mo28656f() {
        try {
            byte[] bArr = new byte[mo28427b()];
            C11197l3 a = C11197l3.m35547a(bArr);
            mo28426a(a);
            a.mo28682c();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo28431g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    protected static <T> void m35535a(Iterable<T> iterable, List<? super T> list) {
        C11111f4.m35151a(iterable);
        String str = " is null.";
        String str2 = "Element at index ";
        if (iterable instanceof C11358w4) {
            List o0 = ((C11358w4) iterable).mo28327o0();
            C11358w4 w4Var = (C11358w4) list;
            int size = list.size();
            for (Object next : o0) {
                if (next == null) {
                    int size2 = w4Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append(str2);
                    sb.append(size2);
                    sb.append(str);
                    String sb2 = sb.toString();
                    for (int size3 = w4Var.size() - 1; size3 >= size; size3--) {
                        w4Var.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C11342v2) {
                    w4Var.mo28321a((C11342v2) next);
                } else {
                    w4Var.add((String) next);
                }
            }
        } else if (iterable instanceof C11027a6) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size() - size4;
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append(str2);
                    sb3.append(size5);
                    sb3.append(str);
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}
