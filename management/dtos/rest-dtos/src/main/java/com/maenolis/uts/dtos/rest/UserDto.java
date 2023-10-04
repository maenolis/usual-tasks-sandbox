package com.maenolis.uts.dtos.rest;

import java.time.LocalDateTime;
import java.util.List;

public record UserDto(String uuid, String name, String email, LocalDateTime registrationDate, List<AddressDto> addresses) {
}
