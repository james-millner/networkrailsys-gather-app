package com.uoh.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.dto.TrainMovement Class
 * <p>
 * Created by James Millner on 09/03/2017 at 14:54.
 */
@Getter
@Setter
@Data public class TrainMovement {

    List<com.uoh.domain.trainmovements.TrainMovement> movements = new ArrayList<>();
}
