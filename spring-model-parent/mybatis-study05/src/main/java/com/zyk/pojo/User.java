package com.zyk.pojo;

import lombok.*;

/**
 * @ClassName: user
 * @Date: Created in 2022/11/17 10:26
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private String password;

}
