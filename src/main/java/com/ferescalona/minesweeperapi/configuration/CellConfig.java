package com.ferescalona.minesweeperapi.configuration;

import com.ferescalona.minesweeperapi.game.Cell;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CellConfig {

    @Bean
    Cell getCell1() {
        return Cell.builder().discovered(false).isAMine(false).build();
    }

    @Bean
    Cell getCell2() {
        return Cell.builder().discovered(true).isAMine(true).build();
    }
}
