package com.facebook.stetho.common.android;

import android.os.Handler;
import android.os.Looper;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.common.Util;

public final class HandlerUtil {

    private static abstract class WaitableRunnable<V> implements Runnable {
        private Exception mException;
        private boolean mIsDone;
        private V mValue;

        protected WaitableRunnable() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
        /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:12:0x0001, LOOP_START, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void join() {
            /*
                r1 = this;
                monitor-enter(r1)
            L_0x0001:
                boolean r0 = r1.mIsDone     // Catch:{ all -> 0x000b }
                if (r0 != 0) goto L_0x0009
                r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
                goto L_0x0001
            L_0x0009:
                monitor-exit(r1)     // Catch:{ all -> 0x000b }
                return
            L_0x000b:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x000b }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.android.HandlerUtil.WaitableRunnable.join():void");
        }

        public V invoke(Handler handler) {
            if (handler.post(this)) {
                join();
                Exception exc = this.mException;
                if (exc == null) {
                    return this.mValue;
                }
                throw new RuntimeException(exc);
            }
            throw new RuntimeException("Handler.post() returned false");
        }

        /* access modifiers changed from: protected */
        public abstract V onRun();

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                r0 = 0
                r1 = 1
                java.lang.Object r2 = r3.onRun()     // Catch:{ Exception -> 0x0017 }
                r3.mValue = r2     // Catch:{ Exception -> 0x0017 }
                r3.mException = r0     // Catch:{ Exception -> 0x0017 }
                monitor-enter(r3)
                r3.mIsDone = r1     // Catch:{ all -> 0x0012 }
                r3.notifyAll()     // Catch:{ all -> 0x0012 }
                monitor-exit(r3)     // Catch:{ all -> 0x0012 }
                goto L_0x0023
            L_0x0012:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0012 }
                throw r0
            L_0x0015:
                r0 = move-exception
                goto L_0x0027
            L_0x0017:
                r2 = move-exception
                r3.mValue = r0     // Catch:{ all -> 0x0015 }
                r3.mException = r2     // Catch:{ all -> 0x0015 }
                monitor-enter(r3)
                r3.mIsDone = r1     // Catch:{ all -> 0x0024 }
                r3.notifyAll()     // Catch:{ all -> 0x0024 }
                monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            L_0x0023:
                return
            L_0x0024:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0024 }
                throw r0
            L_0x0027:
                monitor-enter(r3)
                r3.mIsDone = r1     // Catch:{ all -> 0x002f }
                r3.notifyAll()     // Catch:{ all -> 0x002f }
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                throw r0
            L_0x002f:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.android.HandlerUtil.WaitableRunnable.run():void");
        }
    }

    private HandlerUtil() {
    }

    public static boolean checkThreadAccess(Handler handler) {
        return Looper.myLooper() == handler.getLooper();
    }

    public static <V> V postAndWait(Handler handler, final UncheckedCallable<V> uncheckedCallable) {
        if (!checkThreadAccess(handler)) {
            return new WaitableRunnable<V>() {
                /* access modifiers changed from: protected */
                public V onRun() {
                    return uncheckedCallable.call();
                }
            }.invoke(handler);
        }
        try {
            return uncheckedCallable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void verifyThreadAccess(Handler handler) {
        Util.throwIfNot(checkThreadAccess(handler));
    }

    public static void postAndWait(Handler handler, final Runnable runnable) {
        if (checkThreadAccess(handler)) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        } else {
            new WaitableRunnable<Void>() {
                /* access modifiers changed from: protected */
                public Void onRun() {
                    runnable.run();
                    return null;
                }
            }.invoke(handler);
        }
    }
}
