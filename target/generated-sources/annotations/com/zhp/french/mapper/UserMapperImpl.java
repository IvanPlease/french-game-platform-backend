package com.zhp.french.mapper;

import com.zhp.french.domain.User;
import com.zhp.french.domain.UserDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-05T14:55:40+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public List<UserDto> mapToUserDtoList(List<User> all) {
        if ( all == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( all.size() );
        for ( User user : all ) {
            list.add( mapToUserDto( user ) );
        }

        return list;
    }

    @Override
    public User mapToUser(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        return user;
    }

    @Override
    public UserDto mapToUserDto(User saved) {
        if ( saved == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        return userDto;
    }
}
