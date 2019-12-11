package p163g.p164a.p165a;

import java.util.Map;

/* renamed from: g.a.a.z */
/* compiled from: MessageMatcherExists */
class C4786z extends C4770v {
    C4786z() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16025a(Map<String, Object>... mapArr) {
        Object obj;
        if (mapArr == null || mapArr.length <= 0) {
            return false;
        }
        int length = mapArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            Map<String, Object> map = mapArr[i];
            if (map != null && map.containsKey(this.f11865a)) {
                obj = map.get(this.f11865a);
                break;
            }
            i++;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }
}
