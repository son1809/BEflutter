package org.aptech.t2311e.beflutter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Place {
    private Long id;
    private String name;
    private String image;
    private String location;
}
