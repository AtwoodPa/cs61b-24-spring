package oi.pp.gitlet.files;

import java.io.Serializable;

/**
 * @author supanpan
 * @date 2024/02/08
 */
public class Model implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model(String name) {
        this.name = name;
    }
}
