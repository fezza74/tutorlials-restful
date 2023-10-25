package com.gfd.tutorials.mapper;

import com.gfd.tutorials.dto.UserDto;
import com.gfd.tutorials.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(User user);
    @Mapping(source = "userSurName", target = "userSurname")
    User userDtoToUser(UserDto userDto);
}
