package co.com.createmutant.createmutant.controller;

import co.com.createmutant.createmutant.converter.MutantConverter;
import co.com.createmutant.createmutant.dto.MutantDto;
import co.com.createmutant.createmutant.repository.MutantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateMutantController {

    @Autowired
    private MutantRepository mutantRepository;

    @Autowired
    private MutantConverter mutantConverter;

    @PostMapping(value = "/createMutant")
    public void createMutant(@RequestBody MutantDto mutantDto)
    {
        mutantRepository.save(mutantConverter.convert(mutantDto));
    }

}
