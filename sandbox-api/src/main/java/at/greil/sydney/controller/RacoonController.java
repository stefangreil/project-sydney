package at.greil.sydney.controller;

import java.util.concurrent.atomic.AtomicLong;

import at.greil.sydney.RacoonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class RacoonController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/racoon")
    public RacoonDto getRacoon(@RequestParam(value = "name", defaultValue = "Racoon") String name) {
        return new RacoonDto(counter.incrementAndGet(), String.format(template, name));
    }
}