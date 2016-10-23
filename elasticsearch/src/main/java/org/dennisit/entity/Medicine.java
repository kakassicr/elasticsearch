package org.dennisit.entity;
import lombok.ToString;
import lombok.Data;
/**
 * Created by yechang on 2016/10/21.
 */
@ToString
@Data
public class Medicine {
    private Integer id;
    private String name;
    private String function;

    public Medicine() {
        super();
    }

    public Medicine(Integer id, String name, String function) {
        super();
        this.id = id;
        this.name = name;
        this.function = function;
    }

}