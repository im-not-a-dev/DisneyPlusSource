package com.facebook.stetho.dumpapp;

import p602m.p603a.p604a.p605a.C13440h;
import p602m.p603a.p604a.p605a.C13443k;

public class GlobalOptions {
    public final C13440h optionHelp = new C13440h("h", "help", false, "Print this help");
    public final C13440h optionListPlugins = new C13440h("l", "list", false, "List available plugins");
    public final C13440h optionProcess = new C13440h("p", "process", true, "Specify target process");
    public final C13443k options = new C13443k();

    public GlobalOptions() {
        this.options.mo34688a(this.optionHelp);
        this.options.mo34688a(this.optionListPlugins);
        this.options.mo34688a(this.optionProcess);
    }
}
