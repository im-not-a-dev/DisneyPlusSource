package p520io.reactivex.p531y.p547j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p520io.reactivex.functions.Function;

/* renamed from: io.reactivex.y.j.b */
/* compiled from: ArrayListSupplier */
public enum C12542b implements Callable<List<Object>>, Function<Object, List<Object>> {
    INSTANCE;

    /* renamed from: a */
    public static <T> Callable<List<T>> m39337a() {
        return INSTANCE;
    }

    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
