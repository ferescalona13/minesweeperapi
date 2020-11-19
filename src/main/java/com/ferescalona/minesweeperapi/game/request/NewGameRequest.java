package com.ferescalona.minesweeperapi.game.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewGameRequest {

    public Integer rows;
    public Integer columns;
    public Integer mines;
}
