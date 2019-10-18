package cn.enigma.project.jpa.query.page;

import lombok.Data;

import java.util.List;

/**
 * @author luzh
 * Create: 2019-06-04 15:09
 * Modified By:
 * Description:
 */
@Data
public class PageData<T> {
    private Long total;
    private Integer totalPage;
    private List<T> rows;

    public PageData(long total, Integer totalPage, List<T> rows) {
        this.total = total;
        this.totalPage = totalPage;
        this.rows = rows;
    }
}
