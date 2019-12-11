package com.facebook.stetho.server;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LeakyBufferedInputStream extends BufferedInputStream {
    private boolean mLeaked;
    private boolean mMarked;

    public LeakyBufferedInputStream(InputStream inputStream, int i) {
        super(inputStream, i);
    }

    private byte[] clearBufferLocked() {
        byte[] bArr = new byte[(this.count - this.pos)];
        System.arraycopy(this.buf, this.pos, bArr, 0, bArr.length);
        this.pos = 0;
        this.count = 0;
        return bArr;
    }

    private void throwIfLeaked() {
        if (this.mLeaked) {
            throw new IllegalStateException();
        }
    }

    private void throwIfMarked() {
        if (this.mMarked) {
            throw new IllegalStateException();
        }
    }

    public synchronized InputStream leakBufferAndStream() {
        throwIfLeaked();
        throwIfMarked();
        this.mLeaked = true;
        return new CompositeInputStream(new InputStream[]{new ByteArrayInputStream(clearBufferLocked()), this.in});
    }

    public synchronized void mark(int i) {
        throwIfLeaked();
        this.mMarked = true;
        super.mark(i);
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized void reset() throws IOException {
        throwIfLeaked();
        this.mMarked = false;
        super.reset();
    }
}
