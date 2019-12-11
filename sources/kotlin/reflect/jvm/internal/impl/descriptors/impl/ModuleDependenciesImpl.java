package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;

/* compiled from: ModuleDescriptorImpl.kt */
public final class ModuleDependenciesImpl implements ModuleDependencies {
    private final List<ModuleDescriptorImpl> allDependencies;
    private final List<ModuleDescriptorImpl> expectedByDependencies;
    private final Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible;

    public ModuleDependenciesImpl(List<ModuleDescriptorImpl> list, Set<ModuleDescriptorImpl> set, List<ModuleDescriptorImpl> list2) {
        this.allDependencies = list;
        this.modulesWhoseInternalsAreVisible = set;
        this.expectedByDependencies = list2;
    }

    public List<ModuleDescriptorImpl> getAllDependencies() {
        return this.allDependencies;
    }

    public List<ModuleDescriptorImpl> getExpectedByDependencies() {
        return this.expectedByDependencies;
    }

    public Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.modulesWhoseInternalsAreVisible;
    }
}
