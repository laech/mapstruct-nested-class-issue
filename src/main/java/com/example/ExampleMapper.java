package com.example;

import static org.mapstruct.ReportingPolicy.ERROR;

import com.example.model.Example.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(unmappedTargetPolicy = ERROR)
public interface ExampleMapper {

  @Mapping(target = "personFirstName", source = "names.first")
  @Mapping(target = "personLastName", source = "names.last")
  ExampleDto map(Person person);
}
