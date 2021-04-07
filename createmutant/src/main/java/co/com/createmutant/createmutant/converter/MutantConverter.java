package co.com.createmutant.createmutant.converter;

import co.com.createmutant.createmutant.dto.MutantDto;
import co.com.createmutant.createmutant.entity.MutantEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;

public class MutantConverter implements Converter<MutantDto, MutantEntity> {

    @Override
    public MutantEntity convert(MutantDto mutantDto) {
        MutantEntity mutantEntity = new MutantEntity();
        mutantEntity.setDna(objectToJson(mutantDto));
        mutantEntity.setIsMutant(mutantDto.isMutant());
        return mutantEntity;
    }

    private static String objectToJson(Object myObject)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try
        {
            return objectMapper.writeValueAsString(myObject);
        }
        catch (JsonProcessingException e)
        {
            return null;
        }

    }
}
