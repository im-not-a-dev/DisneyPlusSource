package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class WorkInfo {

    /* renamed from: a */
    private UUID f4010a;

    /* renamed from: b */
    private State f4011b;

    /* renamed from: c */
    private Data f4012c;

    /* renamed from: d */
    private Set<String> f4013d;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: a */
        public boolean mo5635a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public WorkInfo(UUID uuid, State state, Data data, List<String> list) {
        this.f4010a = uuid;
        this.f4011b = state;
        this.f4012c = data;
        this.f4013d = new HashSet(list);
    }

    /* renamed from: a */
    public State mo5630a() {
        return this.f4011b;
    }

    /* renamed from: b */
    public Set<String> mo5631b() {
        return this.f4013d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        UUID uuid = this.f4010a;
        if (uuid == null ? workInfo.f4010a != null : !uuid.equals(workInfo.f4010a)) {
            return false;
        }
        if (this.f4011b != workInfo.f4011b) {
            return false;
        }
        Data data = this.f4012c;
        if (data == null ? workInfo.f4012c != null : !data.equals(workInfo.f4012c)) {
            return false;
        }
        Set<String> set = this.f4013d;
        Set<String> set2 = workInfo.f4013d;
        if (set != null) {
            z = set.equals(set2);
        } else if (set2 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        UUID uuid = this.f4010a;
        int i = 0;
        int hashCode = (uuid != null ? uuid.hashCode() : 0) * 31;
        State state = this.f4011b;
        int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
        Data data = this.f4012c;
        int hashCode3 = (hashCode2 + (data != null ? data.hashCode() : 0)) * 31;
        Set<String> set = this.f4013d;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WorkInfo{mId='");
        sb.append(this.f4010a);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.f4011b);
        sb.append(", mOutputData=");
        sb.append(this.f4012c);
        sb.append(", mTags=");
        sb.append(this.f4013d);
        sb.append('}');
        return sb.toString();
    }
}
