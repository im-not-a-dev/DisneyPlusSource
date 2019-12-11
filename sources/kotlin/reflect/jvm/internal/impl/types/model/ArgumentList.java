package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;

/* compiled from: TypeSystemContext.kt */
public final class ArgumentList extends ArrayList<TypeArgumentMarker> implements TypeArgumentListMarker {
    public ArgumentList(int i) {
        super(i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return contains((TypeArgumentMarker) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return indexOf((TypeArgumentMarker) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return lastIndexOf((TypeArgumentMarker) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return remove((TypeArgumentMarker) obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(TypeArgumentMarker typeArgumentMarker) {
        return super.contains(typeArgumentMarker);
    }

    public /* bridge */ int indexOf(TypeArgumentMarker typeArgumentMarker) {
        return super.indexOf(typeArgumentMarker);
    }

    public /* bridge */ int lastIndexOf(TypeArgumentMarker typeArgumentMarker) {
        return super.lastIndexOf(typeArgumentMarker);
    }

    public /* bridge */ boolean remove(TypeArgumentMarker typeArgumentMarker) {
        return super.remove(typeArgumentMarker);
    }
}
