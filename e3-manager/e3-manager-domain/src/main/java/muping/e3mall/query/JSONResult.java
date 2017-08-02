package muping.e3mall.query;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * easyUI json数据格式
 */
@Getter
@Setter
public class JSONResult implements Serializable{

    private Long total;
    private List<?> rows;
}
