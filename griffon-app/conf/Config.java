import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                .e("title", "${artifactId}")
                .e("startupGroups", asList("${artifactId}"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("${artifactId}", map()
                    .e("model", "org.richrocksmy.${artifactId}Model")
                    .e("view", "org.richrocksmy.${artifactId}View")
                    .e("controller", "org.richrocksmy.${artifactId}Controller")
                )
            );
    }
}