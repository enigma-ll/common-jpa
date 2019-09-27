package cn.enigma.project.jpa.part;

import java.lang.annotation.*;

/**
 * @author luzh
 * Create: 2019/9/6 上午11:58
 * Modified By:
 * Description:
 */
@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PartAnnotation {

    String name();
}
