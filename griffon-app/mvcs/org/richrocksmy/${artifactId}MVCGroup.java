package org.richrocksmy;

import javax.inject.Named;
import griffon.core.mvc.MVCGroup;
import org.codehaus.griffon.runtime.core.mvc.AbstractTypedMVCGroup;
import javax.annotation.Nonnull;

@Named("${artifactId}")
public class ${artifactId}MVCGroup extends AbstractTypedMVCGroup<${artifactId}Model, ${artifactId}View, ${artifactId}Controller> {
    public ${artifactId}MVCGroup(@Nonnull MVCGroup delegate) {
        super(delegate);
    }
}