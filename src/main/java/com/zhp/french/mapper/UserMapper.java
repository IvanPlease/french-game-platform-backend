package com.zhp.french.mapper;

import com.zhp.french.domain.User;
import com.zhp.french.domain.UserDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    User mapToUser(UserDto dto);
    UserDto mapToUserDto(User saved);
    List<UserDto> mapToUserDtoList(List<User> all);
}
