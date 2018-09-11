package oneonesix.cs2.hfut.wagemanager.pojo.entity;

/**返回给发送的数据
 *status：状态。0：失败；1：成功
 *data:返回相应的查询信息或错误信息
 */
public class Response {
    private Integer status;
    private Object data;

    public Response(Integer status, Object data) {
        this.status = status;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
