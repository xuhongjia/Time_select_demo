package com.horry.demo.time_select_demo.model;

import java.util.List;

/**
 * Created by Administrator on 2015/12/2.
 */
public class Response {


    /**
     * data : [{"name":"今天","date":"12/2","schedule":[{"hour":"18:00","timestamp":1449050400,"available":1},{"hour":"18:30","timestamp":1449052200,"available":1},{"hour":"19:00","timestamp":1449054000,"available":1},{"hour":"19:30","timestamp":1449055800,"available":1},{"hour":"20:00","timestamp":1449057600,"available":1},{"hour":"20:30","timestamp":1449059400,"available":1},{"hour":"21:00","timestamp":1449061200,"available":1}]},{"name":"明天","date":"12/3","schedule":[{"hour":"10:00","timestamp":1449108000,"available":1},{"hour":"10:30","timestamp":1449109800,"available":1},{"hour":"11:00","timestamp":1449111600,"available":1},{"hour":"11:30","timestamp":1449113400,"available":1},{"hour":"12:00","timestamp":1449115200,"available":1},{"hour":"12:30","timestamp":1449117000,"available":1},{"hour":"13:00","timestamp":1449118800,"available":1},{"hour":"13:30","timestamp":1449120600,"available":1},{"hour":"14:00","timestamp":1449122400,"available":1},{"hour":"14:30","timestamp":1449124200,"available":1},{"hour":"15:00","timestamp":1449126000,"available":1},{"hour":"15:30","timestamp":1449127800,"available":1},{"hour":"16:00","timestamp":1449129600,"available":1},{"hour":"16:30","timestamp":1449131400,"available":1},{"hour":"17:00","timestamp":1449133200,"available":1},{"hour":"17:30","timestamp":1449135000,"available":1},{"hour":"18:00","timestamp":1449136800,"available":1},{"hour":"18:30","timestamp":1449138600,"available":1},{"hour":"19:00","timestamp":1449140400,"available":1},{"hour":"19:30","timestamp":1449142200,"available":1},{"hour":"20:00","timestamp":1449144000,"available":1},{"hour":"20:30","timestamp":1449145800,"available":1},{"hour":"21:00","timestamp":1449147600,"available":1}]},{"name":"后天","date":"12/4","schedule":[{"hour":"10:00","timestamp":1449194400,"available":1},{"hour":"10:30","timestamp":1449196200,"available":1},{"hour":"11:00","timestamp":1449198000,"available":1},{"hour":"11:30","timestamp":1449199800,"available":1},{"hour":"12:00","timestamp":1449201600,"available":1},{"hour":"12:30","timestamp":1449203400,"available":1},{"hour":"13:00","timestamp":1449205200,"available":1},{"hour":"13:30","timestamp":1449207000,"available":1},{"hour":"14:00","timestamp":1449208800,"available":1},{"hour":"14:30","timestamp":1449210600,"available":1},{"hour":"15:00","timestamp":1449212400,"available":1},{"hour":"15:30","timestamp":1449214200,"available":1},{"hour":"16:00","timestamp":1449216000,"available":1},{"hour":"16:30","timestamp":1449217800,"available":1},{"hour":"17:00","timestamp":1449219600,"available":1},{"hour":"17:30","timestamp":1449221400,"available":1},{"hour":"18:00","timestamp":1449223200,"available":1},{"hour":"18:30","timestamp":1449225000,"available":1},{"hour":"19:00","timestamp":1449226800,"available":1},{"hour":"19:30","timestamp":1449228600,"available":1},{"hour":"20:00","timestamp":1449230400,"available":1},{"hour":"20:30","timestamp":1449232200,"available":1},{"hour":"21:00","timestamp":1449234000,"available":1}]},{"name":"周六","date":"12/5","schedule":[{"hour":"10:00","timestamp":1449280800,"available":1},{"hour":"10:30","timestamp":1449282600,"available":1},{"hour":"11:00","timestamp":1449284400,"available":1},{"hour":"11:30","timestamp":1449286200,"available":1},{"hour":"12:00","timestamp":1449288000,"available":1},{"hour":"12:30","timestamp":1449289800,"available":1},{"hour":"13:00","timestamp":1449291600,"available":1},{"hour":"13:30","timestamp":1449293400,"available":1},{"hour":"14:00","timestamp":1449295200,"available":1},{"hour":"14:30","timestamp":1449297000,"available":1},{"hour":"15:00","timestamp":1449298800,"available":1},{"hour":"15:30","timestamp":1449300600,"available":1},{"hour":"16:00","timestamp":1449302400,"available":1},{"hour":"16:30","timestamp":1449304200,"available":1},{"hour":"17:00","timestamp":1449306000,"available":1},{"hour":"17:30","timestamp":1449307800,"available":1},{"hour":"18:00","timestamp":1449309600,"available":1},{"hour":"18:30","timestamp":1449311400,"available":1},{"hour":"19:00","timestamp":1449313200,"available":1},{"hour":"19:30","timestamp":1449315000,"available":1},{"hour":"20:00","timestamp":1449316800,"available":1},{"hour":"20:30","timestamp":1449318600,"available":1},{"hour":"21:00","timestamp":1449320400,"available":1}]},{"name":"周日","date":"12/6","schedule":[{"hour":"10:00","timestamp":1449367200,"available":1},{"hour":"10:30","timestamp":1449369000,"available":1},{"hour":"11:00","timestamp":1449370800,"available":1},{"hour":"11:30","timestamp":1449372600,"available":1},{"hour":"12:00","timestamp":1449374400,"available":1},{"hour":"12:30","timestamp":1449376200,"available":1},{"hour":"13:00","timestamp":1449378000,"available":1},{"hour":"13:30","timestamp":1449379800,"available":1},{"hour":"14:00","timestamp":1449381600,"available":1},{"hour":"14:30","timestamp":1449383400,"available":1},{"hour":"15:00","timestamp":1449385200,"available":1},{"hour":"15:30","timestamp":1449387000,"available":1},{"hour":"16:00","timestamp":1449388800,"available":1},{"hour":"16:30","timestamp":1449390600,"available":1},{"hour":"17:00","timestamp":1449392400,"available":1},{"hour":"17:30","timestamp":1449394200,"available":1},{"hour":"18:00","timestamp":1449396000,"available":1},{"hour":"18:30","timestamp":1449397800,"available":1},{"hour":"19:00","timestamp":1449399600,"available":1},{"hour":"19:30","timestamp":1449401400,"available":1},{"hour":"20:00","timestamp":1449403200,"available":1},{"hour":"20:30","timestamp":1449405000,"available":1},{"hour":"21:00","timestamp":1449406800,"available":1}]},{"name":"周一","date":"12/7","schedule":[{"hour":"10:00","timestamp":1449453600,"available":1},{"hour":"10:30","timestamp":1449455400,"available":1},{"hour":"11:00","timestamp":1449457200,"available":1},{"hour":"11:30","timestamp":1449459000,"available":1},{"hour":"12:00","timestamp":1449460800,"available":1},{"hour":"12:30","timestamp":1449462600,"available":1},{"hour":"13:00","timestamp":1449464400,"available":1},{"hour":"13:30","timestamp":1449466200,"available":1},{"hour":"14:00","timestamp":1449468000,"available":1},{"hour":"14:30","timestamp":1449469800,"available":1},{"hour":"15:00","timestamp":1449471600,"available":1},{"hour":"15:30","timestamp":1449473400,"available":1},{"hour":"16:00","timestamp":1449475200,"available":1},{"hour":"16:30","timestamp":1449477000,"available":1},{"hour":"17:00","timestamp":1449478800,"available":1},{"hour":"17:30","timestamp":1449480600,"available":1},{"hour":"18:00","timestamp":1449482400,"available":1},{"hour":"18:30","timestamp":1449484200,"available":1},{"hour":"19:00","timestamp":1449486000,"available":1},{"hour":"19:30","timestamp":1449487800,"available":1},{"hour":"20:00","timestamp":1449489600,"available":1},{"hour":"20:30","timestamp":1449491400,"available":1},{"hour":"21:00","timestamp":1449493200,"available":1}]},{"name":"周二","date":"12/8","schedule":[{"hour":"10:00","timestamp":1449540000,"available":1},{"hour":"10:30","timestamp":1449541800,"available":1},{"hour":"11:00","timestamp":1449543600,"available":1},{"hour":"11:30","timestamp":1449545400,"available":1},{"hour":"12:00","timestamp":1449547200,"available":1},{"hour":"12:30","timestamp":1449549000,"available":1},{"hour":"13:00","timestamp":1449550800,"available":1},{"hour":"13:30","timestamp":1449552600,"available":1},{"hour":"14:00","timestamp":1449554400,"available":1},{"hour":"14:30","timestamp":1449556200,"available":1},{"hour":"15:00","timestamp":1449558000,"available":1},{"hour":"15:30","timestamp":1449559800,"available":1},{"hour":"16:00","timestamp":1449561600,"available":1},{"hour":"16:30","timestamp":1449563400,"available":1},{"hour":"17:00","timestamp":1449565200,"available":1},{"hour":"17:30","timestamp":1449567000,"available":1},{"hour":"18:00","timestamp":1449568800,"available":1},{"hour":"18:30","timestamp":1449570600,"available":1},{"hour":"19:00","timestamp":1449572400,"available":1},{"hour":"19:30","timestamp":1449574200,"available":1},{"hour":"20:00","timestamp":1449576000,"available":1},{"hour":"20:30","timestamp":1449577800,"available":1},{"hour":"21:00","timestamp":1449579600,"available":1}]}]
     * msg_type : 0
     * msg : 成功
     * im :
     * login_audit : 0
     * error : 0
     * notify : 0
     */

    private int msg_type;
    private String msg;
    private String im;
    private int login_audit;
    private int error;
    private int notify;
    /**
     * name : 今天
     * date : 12/2
     * schedule : [{"hour":"18:00","timestamp":1449050400,"available":1},{"hour":"18:30","timestamp":1449052200,"available":1},{"hour":"19:00","timestamp":1449054000,"available":1},{"hour":"19:30","timestamp":1449055800,"available":1},{"hour":"20:00","timestamp":1449057600,"available":1},{"hour":"20:30","timestamp":1449059400,"available":1},{"hour":"21:00","timestamp":1449061200,"available":1}]
     */

    private List<DataEntity> data;

    public void setMsg_type(int msg_type) {
        this.msg_type = msg_type;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public void setLogin_audit(int login_audit) {
        this.login_audit = login_audit;
    }

    public void setError(int error) {
        this.error = error;
    }

    public void setNotify(int notify) {
        this.notify = notify;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public int getMsg_type() {
        return msg_type;
    }

    public String getMsg() {
        return msg;
    }

    public String getIm() {
        return im;
    }

    public int getLogin_audit() {
        return login_audit;
    }

    public int getError() {
        return error;
    }

    public int getNotify() {
        return notify;
    }

    public List<DataEntity> getData() {
        return data;
    }

}
