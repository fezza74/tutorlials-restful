package com.gfd.tutorials.mapper;

import com.gfd.tutorials.dto.UserCompleteInformationDto;
import com.gfd.tutorials.dto.UserDto;
import com.gfd.tutorials.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses=UserMapper.class, componentModel = "spring")
public interface UserCompleteInformationMapper {
    UserCompleteInformationMapper INSTANCE = Mappers.getMapper(UserCompleteInformationMapper.class);
    @Mapping(source = "userSurname", target = "userSurName")
    UserCompleteInformationDto userToUserDto(User user);
    @Mapping(source = "userSurName", target = "userSurname")
    User userDtoToUser(UserDto userDto);
}
