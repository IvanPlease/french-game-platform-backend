package com.zhp.french.mapper;

import com.zhp.french.domain.User;
import com.zhp.french.domain.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    List<UserDto> mapToUserDtoList(List<User> all);

    User mapToUser(UserDto dto);

    UserDto mapToUserDto(User saved);
}
