package co.com.createmutant.createmutant.dto;

import lombok.Getter;
import lombok.Setter;

public class MutantDto {

    @Getter @Setter
    private String[] dna;

    @Getter
    @Setter
    private boolean isMutant;
}
