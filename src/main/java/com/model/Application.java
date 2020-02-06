package com.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Application {
    Integer id;
    String fullName;
    String email;
    Boolean isOnline;
    String course;
}
