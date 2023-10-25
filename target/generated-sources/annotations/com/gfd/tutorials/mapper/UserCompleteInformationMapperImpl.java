package com.gfd.tutorials.mapper;

import com.gfd.tutorials.dto.EmailDto;
import com.gfd.tutorials.dto.PhoneDto;
import com.gfd.tutorials.dto.UserCompleteInformationDto;
import com.gfd.tutorials.dto.UserDto;
import com.gfd.tutorials.model.Email;
import com.gfd.tutorials.model.Phone;
import com.gfd.tutorials.model.User;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-25T15:24:38+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UserCompleteInformationMapperImpl implements UserCompleteInformationMapper {

    @Override
    public UserCompleteInformationDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserCompleteInformationDto userCompleteInformationDto = new UserCompleteInformationDto();

        userCompleteInformationDto.setUserSurName( user.getUserSurname() );
        userCompleteInformationDto.setUserCode( user.getUserCode() );
        userCompleteInformationDto.setUserName( user.getUserName() );
        userCompleteInformationDto.setEmails( emailSetToEmailDtoSet( user.getEmails() ) );
        userCompleteInformationDto.setPhones( phoneSetToPhoneDtoSet( user.getPhones() ) );

        return userCompleteInformationDto;
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

    protected EmailDto emailToEmailDto(Email email) {
        if ( email == null ) {
            return null;
        }

        String emailAddress = null;
        String tipeOfEmail = null;

        emailAddress = email.getEmailAddress();
        tipeOfEmail = email.getTipeOfEmail();

        EmailDto emailDto = new EmailDto( emailAddress, tipeOfEmail );

        return emailDto;
    }

    protected Set<EmailDto> emailSetToEmailDtoSet(Set<Email> set) {
        if ( set == null ) {
            return null;
        }

        Set<EmailDto> set1 = new HashSet<EmailDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Email email : set ) {
            set1.add( emailToEmailDto( email ) );
        }

        return set1;
    }

    protected PhoneDto phoneToPhoneDto(Phone phone) {
        if ( phone == null ) {
            return null;
        }

        String number = null;
        String nation = null;
        String typeOfNumber = null;

        number = phone.getNumber();
        nation = phone.getNation();
        typeOfNumber = phone.getTypeOfNumber();

        PhoneDto phoneDto = new PhoneDto( number, nation, typeOfNumber );

        return phoneDto;
    }

    protected Set<PhoneDto> phoneSetToPhoneDtoSet(Set<Phone> set) {
        if ( set == null ) {
            return null;
        }

        Set<PhoneDto> set1 = new HashSet<PhoneDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Phone phone : set ) {
            set1.add( phoneToPhoneDto( phone ) );
        }

        return set1;
    }
}
