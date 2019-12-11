package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;

/* compiled from: ModuleDescriptorImpl.kt */
public interface ModuleDependencies {
    List<ModuleDescriptorImpl> getAllDependencies();

    List<ModuleDescriptorImpl> getExpectedByDependencies();

    Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible();
}
