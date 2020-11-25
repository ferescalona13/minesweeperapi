package com.ferescalona.minesweeperapi;

import com.ferescalona.minesweeperapi.game.Cell;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Cell cell;

    public TestController(final Cell getCell2) {
        this.cell = getCell2;
    }

    @GetMapping("/itworks")
    public String defaultResponse() {
        return "It works!";
    }

    @GetMapping(value = "/test", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getMethodName() {
        System.out.println(cell.isDiscovered());

        return "Tu mamá! Mamagüevazo "+cell.isDiscovered();
    }

    @GetMapping("/healt")
    public String health() {
        return "Tu health!";
    }
}
