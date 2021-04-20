package codes.recursive.controller;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.annotation.*;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.micronaut.views.View;

import java.util.HashMap;
import java.util.Map;

@Controller("/")
public class PageController {

    @Secured(SecurityRule.IS_ANONYMOUS)
    @View("home")
    @Get(uri="/")
    public Map<String, Object> index() {
        return new HashMap<>();
    }

    @Secured(SecurityRule.IS_AUTHENTICATED)
    @Get("/secure")
    public Map<String, Object> secured() {
        return CollectionUtils.mapOf("secured", true);
    }

    @Secured(SecurityRule.IS_ANONYMOUS)
    @Get("/error")
    public Map<String, Object> error() {
        return CollectionUtils.mapOf("error", true);
    }
}