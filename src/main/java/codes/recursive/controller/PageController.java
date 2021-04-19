package codes.recursive.controller;

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
}