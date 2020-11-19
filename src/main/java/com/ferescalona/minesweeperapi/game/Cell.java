package com.ferescalona.minesweeperapi.game;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cell {

    private boolean discovered;
    private boolean isAMine;

}
