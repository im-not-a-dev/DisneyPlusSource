package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C9908u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
public class C9676a implements ServiceConnection {

    /* renamed from: U */
    private final BlockingQueue<IBinder> f22690U = new LinkedBlockingQueue();

    /* renamed from: c */
    private boolean f22691c = false;

    /* renamed from: a */
    public IBinder mo24992a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C9908u.m30867c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f22691c) {
            this.f22691c = true;
            IBinder iBinder = (IBinder) this.f22690U.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22690U.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
