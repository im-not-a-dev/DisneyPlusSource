package com.bamtechmedia.dominguez.core.content.sets;

import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: com.bamtechmedia.dominguez.core.content.sets.h */
/* compiled from: SetModels.kt */
public abstract class C3778h implements List<C3626b>, C3700c<C3626b>, C12872a {
    private C3778h() {
    }

    /* renamed from: a */
    public abstract String mo13601a();

    /* renamed from: a */
    public abstract boolean mo13602a(C3626b bVar);

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C3626b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C3626b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int mo13603b(C3626b bVar);

    /* renamed from: b */
    public abstract ContentSetType mo13604b();

    /* renamed from: c */
    public abstract int mo13605c(C3626b bVar);

    /* renamed from: c */
    public abstract String mo13606c();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3626b) {
            return mo13602a((C3626b) obj);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo13673d() {
        return mo13457f0().mo13413b0() > mo13457f0().mo13411Z() + mo13457f0().mo13409X();
    }

    /* renamed from: e */
    public abstract String mo13608e();

    /* renamed from: f */
    public abstract int mo13610f();

    /* renamed from: g */
    public abstract String mo13611g();

    /* renamed from: h */
    public final boolean mo13674h() {
        return Intrinsics.areEqual((Object) mo13606c(), (Object) "hidden");
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3626b) {
            return mo13603b((C3626b) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3626b) {
            return mo13605c((C3626b) obj);
        }
        return -1;
    }

    public ListIterator<C3626b> listIterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<C3626b> listIterator(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C3626b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo13610f();
    }

    public void sort(Comparator<? super C3626b> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C3626b> subList(int i, int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C12871f.m40215a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12871f.m40216a(this, tArr);
    }

    public /* synthetic */ C3778h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
