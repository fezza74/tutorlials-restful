package com.gfd.tutorials.mapper;

import com.gfd.tutorials.dto.UserDto;
import com.gfd.tutorials.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-25T15:24:38+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUserCode( user.getUserCode() );
        userDto.setUserName( user.getUserName() );

        return userDto;
    }

    @Override
    public User userDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setUserSurname( userDto.getUserSurName() );
        user.setUserCode( userDto.getUserCode() );
        user.setUserName( userDto.getUserName() );

        return user;
    }
}
