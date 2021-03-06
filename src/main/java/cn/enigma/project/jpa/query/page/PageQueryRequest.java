package cn.enigma.project.jpa.query.page;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author luzh
 * Create: 2019-06-04 14:52
 * Modified By:
 * Description:
 */
@Builder
@Data
public class PageQueryRequest {
    @ApiModelProperty(value = "页码，page=0查所有，默认为1", notes = "分页查询页码notes")
    private Integer page;
    @ApiModelProperty(value = "条目数，默认为10")
    private Integer rows;

    public Integer getPage() {
        return null == page ? 1 : page < 0 ? 0 : page;
    }

    public Integer getRows() {
        return null == rows || rows < 1 ? 10 : rows > 100 ? 100 : rows;
    }

    public boolean pageQuery() {
        return !getPage().equals(0);
    }
}
