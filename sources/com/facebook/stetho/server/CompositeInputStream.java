package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import java.io.InputStream;

public class CompositeInputStream extends InputStream {
    private int mCurrentIndex;
    private final InputStream[] mStreams;

    public CompositeInputStream(InputStream[] inputStreamArr) {
        if (inputStreamArr == null || inputStreamArr.length < 2) {
            throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
        }
        this.mStreams = inputStreamArr;
        this.mCurrentIndex = 0;
    }

    private void closeAll(int i) throws IOException {
        Throwable th = null;
        int i2 = 0;
        while (true) {
            InputStream[] inputStreamArr = this.mStreams;
            if (i2 < inputStreamArr.length) {
                try {
                    inputStreamArr[i2].close();
                } catch (IOException e) {
                    e = e;
                    if (!(i2 == i || th == null)) {
                        e = th;
                    }
                    if (!(th == null || th == e)) {
                        LogUtil.m24857w(th, "Suppressing exception");
                    }
                    th = e;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private boolean tryMoveToNextStream() {
        int i = this.mCurrentIndex;
        if (i + 1 >= this.mStreams.length) {
            return false;
        }
        this.mCurrentIndex = i + 1;
        return true;
    }

    public int available() throws IOException {
        return this.mStreams[this.mCurrentIndex].available();
    }

    public void close() throws IOException {
        closeAll(this.mCurrentIndex);
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        int read = read(new byte[((int) j)]);
        if (read >= 0) {
            return (long) read;
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        do {
            read = this.mStreams[this.mCurrentIndex].read(bArr, i, i2);
            if (read != -1) {
                break;
            }
        } while (tryMoveToNextStream());
        return read;
    }

    public int read() throws IOException {
        int read;
        do {
            read = this.mStreams[this.mCurrentIndex].read();
            if (read != -1) {
                break;
            }
        } while (tryMoveToNextStream());
        return read;
    }
}
