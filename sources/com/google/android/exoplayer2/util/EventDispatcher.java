package com.google.android.exoplayer2.util;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.v0.m */
/* compiled from: EventDispatcher */
public final class EventDispatcher<T> {

    /* renamed from: a */
    private final CopyOnWriteArrayList<HandlerAndListener<T>> listeners = new CopyOnWriteArrayList<>();

    /* renamed from: com.google.android.exoplayer2.v0.m$a */
    /* compiled from: EventDispatcher */
    public interface Event<T> {
        /* renamed from: a */
        void sendTo(T t);
    }

    /* renamed from: com.google.android.exoplayer2.v0.m$b */
    /* compiled from: EventDispatcher */
    private static final class HandlerAndListener<T> {

        /* renamed from: a */
        private final Handler handler;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final T listener;

        /* renamed from: c */
        private boolean released;

        public HandlerAndListener(Handler handler, T t) {
            this.handler = handler;
            this.listener = t;
        }

        /* renamed from: b */
        public /* synthetic */ void mo24652b(Event aVar) {
            if (!released) {
                aVar.sendTo(this.listener);
            }
        }

        /* renamed from: a */
        public void release() {
            released = true;
        }

        /* renamed from: a */
        public void dispatch(Event<T> aVar) {
            this.handler.post(new C9527a(this, aVar));
        }
    }

    /* renamed from: a */
    public void addListener(Handler handler, T t) {
        Assertions.checkArgument((handler == null || t == null) ? false : true);
        removeListener(t);
        listeners.add(new HandlerAndListener(handler, t));
    }

    /* renamed from: a */
    public void removeListener(T t) {
        Iterator it = listeners.iterator();
        while (it.hasNext()) {
            HandlerAndListener bVar = (HandlerAndListener) it.next();
            if (bVar.listener == t) {
                bVar.release();
                listeners.remove(bVar);
            }
        }
    }

    /* renamed from: a */
    public void dispatch(Event<T> aVar) {
        Iterator it = listeners.iterator();
        while (it.hasNext()) {
            ((HandlerAndListener) it.next()).dispatch(aVar);
        }
    }
}
