package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.protocol.module.Console.MessageLevel;
import com.facebook.stetho.inspector.protocol.module.Console.MessageSource;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class ResponseHandlingInputStream extends FilterInputStream {
    private static final int BUFFER_SIZE = 1024;
    public static final String TAG = "ResponseHandlingInputStream";
    private boolean mClosed;
    private final CountingOutputStream mDecompressedCounter;
    private boolean mEofSeen;
    private long mLastDecompressedCount = 0;
    private final ChromePeerManager mNetworkPeerManager;
    private final OutputStream mOutputStream;
    private final String mRequestId;
    private final ResponseHandler mResponseHandler;
    private byte[] mSkipBuffer;

    public ResponseHandlingInputStream(InputStream inputStream, String str, OutputStream outputStream, CountingOutputStream countingOutputStream, ChromePeerManager chromePeerManager, ResponseHandler responseHandler) {
        super(inputStream);
        this.mRequestId = str;
        this.mOutputStream = outputStream;
        this.mDecompressedCounter = countingOutputStream;
        this.mNetworkPeerManager = chromePeerManager;
        this.mResponseHandler = responseHandler;
        this.mClosed = false;
    }

    private synchronized int checkEOF(int i) {
        if (i == -1) {
            closeOutputStreamQuietly();
            this.mResponseHandler.onEOF();
            this.mEofSeen = true;
        }
        return i;
    }

    private synchronized void closeOutputStreamQuietly() {
        if (!this.mClosed) {
            try {
                this.mOutputStream.close();
                reportDecodedSizeIfApplicable();
            } catch (IOException e) {
                try {
                    ChromePeerManager chromePeerManager = this.mNetworkPeerManager;
                    MessageLevel messageLevel = MessageLevel.ERROR;
                    MessageSource messageSource = MessageSource.NETWORK;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not close the output stream");
                    sb.append(e);
                    CLog.writeToConsole(chromePeerManager, messageLevel, messageSource, sb.toString());
                } catch (Throwable th) {
                    this.mClosed = true;
                    throw th;
                }
            }
            this.mClosed = true;
        }
    }

    private byte[] getSkipBufferLocked() {
        if (this.mSkipBuffer == null) {
            this.mSkipBuffer = new byte[BUFFER_SIZE];
        }
        return this.mSkipBuffer;
    }

    private IOException handleIOException(IOException iOException) {
        this.mResponseHandler.onError(iOException);
        return iOException;
    }

    private void handleIOExceptionWritingToStream(IOException iOException) {
        ChromePeerManager chromePeerManager = this.mNetworkPeerManager;
        MessageLevel messageLevel = MessageLevel.ERROR;
        MessageSource messageSource = MessageSource.NETWORK;
        StringBuilder sb = new StringBuilder();
        sb.append("Could not write response body to the stream ");
        sb.append(iOException);
        CLog.writeToConsole(chromePeerManager, messageLevel, messageSource, sb.toString());
        closeOutputStreamQuietly();
    }

    private void reportDecodedSizeIfApplicable() {
        CountingOutputStream countingOutputStream = this.mDecompressedCounter;
        if (countingOutputStream != null) {
            long count = countingOutputStream.getCount();
            this.mResponseHandler.onReadDecoded((int) (count - this.mLastDecompressedCount));
            this.mLastDecompressedCount = count;
        }
    }

    private synchronized void writeToOutputStream(int i) {
        if (!this.mClosed) {
            try {
                this.mOutputStream.write(i);
                reportDecodedSizeIfApplicable();
            } catch (IOException e) {
                handleIOExceptionWritingToStream(e);
            }
        } else {
            return;
        }
        return;
    }

    public void close() throws IOException {
        long j;
        try {
            if (!this.mEofSeen) {
                byte[] bArr = new byte[BUFFER_SIZE];
                j = 0;
                while (true) {
                    int read = read(bArr);
                    if (read == -1) {
                        break;
                    }
                    j += (long) read;
                }
            } else {
                j = 0;
            }
            if (j > 0) {
                ChromePeerManager chromePeerManager = this.mNetworkPeerManager;
                MessageLevel messageLevel = MessageLevel.ERROR;
                MessageSource messageSource = MessageSource.NETWORK;
                StringBuilder sb = new StringBuilder();
                sb.append("There were ");
                sb.append(String.valueOf(j));
                sb.append(" bytes that were not consumed while processing request ");
                sb.append(this.mRequestId);
                CLog.writeToConsole(chromePeerManager, messageLevel, messageSource, sb.toString());
            }
        } finally {
            super.close();
            closeOutputStreamQuietly();
        }
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        try {
            int checkEOF = checkEOF(this.in.read());
            if (checkEOF != -1) {
                this.mResponseHandler.onRead(1);
                writeToOutputStream(checkEOF);
            }
            return checkEOF;
        } catch (IOException e) {
            throw handleIOException(e);
        }
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException("Mark not supported");
    }

    public synchronized long skip(long j) throws IOException {
        long j2;
        byte[] skipBufferLocked = getSkipBufferLocked();
        j2 = 0;
        while (j2 < j) {
            int read = read(skipBufferLocked, 0, (int) Math.min((long) skipBufferLocked.length, j - j2));
            if (read == -1) {
                break;
            }
            j2 += (long) read;
        }
        return j2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int checkEOF = checkEOF(this.in.read(bArr, i, i2));
            if (checkEOF != -1) {
                this.mResponseHandler.onRead(checkEOF);
                writeToOutputStream(bArr, i, checkEOF);
            }
            return checkEOF;
        } catch (IOException e) {
            throw handleIOException(e);
        }
    }

    private synchronized void writeToOutputStream(byte[] bArr, int i, int i2) {
        if (!this.mClosed) {
            try {
                this.mOutputStream.write(bArr, i, i2);
                reportDecodedSizeIfApplicable();
            } catch (IOException e) {
                handleIOExceptionWritingToStream(e);
            }
        } else {
            return;
        }
        return;
    }
}
