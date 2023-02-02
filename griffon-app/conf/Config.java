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
                .e("title", "FaceTracking")
                .e("startupGroups", asList("FaceTracking"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("FaceTracking", map()
                    .e("model", "org.richrocksmy.FaceTrackingModel")
                    .e("view", "org.richrocksmy.FaceTrackingView")
                    .e("controller", "org.richrocksmy.FaceTrackingController")
                )
            );
    }
}
