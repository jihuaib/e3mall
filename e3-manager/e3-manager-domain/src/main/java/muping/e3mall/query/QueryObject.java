package muping.e3mall.query;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class QueryObject implements Serializable {

    private int page;//第几页
    private int rows;//每页显示多少条

    public int getStart(){
        return (page-1)*rows;
    }
}
