package com.dydko;

import lombok.Data;
import lombok.experimental.Accessors;

@Data()
@Accessors(chain = true)
public class Model123 {
    private String name;
    private String lastName;
}