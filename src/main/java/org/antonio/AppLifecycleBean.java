package org.antonio;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.logging.Logger;

@ApplicationScoped
public class AppLifecycleBean {
    private static final Logger LOGGER = Logger.getLogger(AppLifecycleBean.class.getName());

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("Starting application");
    }
    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("Shutting down application");
    }
}
