package com.dev.Project_A.mapper;

import com.dev.Project_A.dto.request.UserCreationRequest;
import com.dev.Project_A.dto.request.UserUpdateRequest;
import com.dev.Project_A.dto.response.UserResponse;
import com.dev.Project_A.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

//    @Mapping(source="firstName", target = "lastName")
//    @Mapping(target ="lastName", ignore = true)
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
