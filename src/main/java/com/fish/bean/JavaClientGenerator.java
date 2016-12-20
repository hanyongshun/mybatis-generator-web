package com.fish.bean;

import com.fish.annotation.Need;
import lombok.Data;

/**
 * Created by yudin on 2016/12/18.
 */
@Data
public class JavaClientGenerator {

    @Need("true")
    private String type;
    @Need("true")
    private String targetPackage;
    @Need("true")
    private String targetProject;

}
