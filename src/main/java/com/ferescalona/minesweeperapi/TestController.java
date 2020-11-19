package com.ferescalona.minesweeperapi;

import com.ferescalona.minesweeperapi.game.Cell;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @GetMapping("/test")
    public String getMethodName() {
        System.out.println(cell.isDiscovered());

        return "Tu mamá! Mamagüevazo "+cell.isDiscovered();
    }

    @GetMapping("/health")
    public String health() {
        return "Tu health!";
    }
}
