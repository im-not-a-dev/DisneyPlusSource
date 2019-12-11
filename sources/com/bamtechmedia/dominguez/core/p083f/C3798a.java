package com.bamtechmedia.dominguez.core.p083f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0012*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0012B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0006\u0010\r\u001a\u00020\u0007J\u0019\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/adapter/InfiniteLoopGroupAdapter;", "VH", "Lcom/xwray/groupie/ViewHolder;", "Lcom/xwray/groupie/GroupAdapter;", "infiniteLoop", "", "size", "", "(ZI)V", "getItem", "Lcom/xwray/groupie/Item;", "position", "getItemCount", "getOriginalPosition", "getSuperItem", "getSuperItem$core_release", "getSuperItemCount", "getSuperItemCount$core_release", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.f.a */
/* compiled from: InfiniteLoopGroupAdapter.kt */
public final class C3798a<VH extends C11863k> extends C11848c<VH> {

    /* renamed from: a0 */
    private final boolean f9443a0;

    /* renamed from: b0 */
    private final int f9444b0;

    /* renamed from: com.bamtechmedia.dominguez.core.f.a$a */
    /* compiled from: InfiniteLoopGroupAdapter.kt */
    public static final class C3799a {
        private C3799a() {
        }

        public /* synthetic */ C3799a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3799a(null);
    }

    public C3798a(boolean z, int i) {
        this.f9443a0 = z;
        this.f9444b0 = i;
    }

    /* renamed from: a */
    public C11853e<?> mo13700a(int i) {
        if (this.f9443a0) {
            return mo13702d(i % mo13703e());
        }
        return mo13702d(i);
    }

    /* renamed from: d */
    public final int mo13701d() {
        if (this.f9443a0) {
            return (this.f9444b0 * 10000) + 1;
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo13703e() {
        return super.getItemCount();
    }

    public int getItemCount() {
        if (this.f9443a0) {
            return Integer.MAX_VALUE;
        }
        return mo13703e();
    }

    /* renamed from: d */
    public final C11853e<?> mo13702d(int i) {
        C11853e<?> a = super.mo13700a(i);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "super.getItem(position)");
        return a;
    }
}
