package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.o */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class C10448o extends C10449p {
    public C10448o(List<C10429d<?>> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
    }
}
