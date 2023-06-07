package com.specialroadproject.controller;

import com.specialroadproject.entity.ValueSingleton;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class AppController {

    private final ValueSingleton valueSingleton = ValueSingleton.getInstance();

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public Map<String, String> setValue(@RequestParam(value="value") int value) {
        valueSingleton.setValue(value);
        return Collections.singletonMap("result", "success");
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Map<String, Integer> getValue(@RequestParam(value="pow") int pow,
                                         @RequestParam(value="add", defaultValue="1") int add) {
        int result = pow * valueSingleton.getValue() + add;
        return Collections.singletonMap("result", result);
    }
}
