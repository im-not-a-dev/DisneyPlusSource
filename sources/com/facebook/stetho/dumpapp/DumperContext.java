package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.Util;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import p602m.p603a.p604a.p605a.C13433c;

public class DumperContext {
    private final List<String> mArgs;
    private final C13433c mParser;
    private final PrintStream mStderr;
    private final InputStream mStdin;
    private final PrintStream mStdout;

    protected DumperContext(DumperContext dumperContext, List<String> list) {
        this(dumperContext.getStdin(), dumperContext.getStdout(), dumperContext.getStderr(), dumperContext.getParser(), list);
    }

    public List<String> getArgsAsList() {
        return this.mArgs;
    }

    public C13433c getParser() {
        return this.mParser;
    }

    public PrintStream getStderr() {
        return this.mStderr;
    }

    public InputStream getStdin() {
        return this.mStdin;
    }

    public PrintStream getStdout() {
        return this.mStdout;
    }

    public DumperContext(InputStream inputStream, PrintStream printStream, PrintStream printStream2, C13433c cVar, List<String> list) {
        this.mStdin = (InputStream) Util.throwIfNull(inputStream);
        this.mStdout = (PrintStream) Util.throwIfNull(printStream);
        this.mStderr = (PrintStream) Util.throwIfNull(printStream2);
        this.mParser = (C13433c) Util.throwIfNull(cVar);
        this.mArgs = (List) Util.throwIfNull(list);
    }
}
