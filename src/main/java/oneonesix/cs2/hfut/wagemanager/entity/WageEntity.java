package oneonesix.cs2.hfut.wagemanager.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.AllowanceEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.DeductEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.RankEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.WageInfoEntity;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;

/**
 *
 */
public class WageEntity {

    private Integer id;

    private Date date;

    @JsonProperty(value = "wage_info")
    private WageInfoEntity wageInfoEntity;
    @JsonProperty("rank")
    private RankEntity rankEntity;
    @JsonProperty("allowance")
    private AllowanceEntity allowanceEntity;
    @JsonProperty("deduct")
    private DeductEntity deductEntity;

    public WageEntity() {
    }

    public WageEntity(Integer id, WageInfoEntity wageInfoEntity, RankEntity rankEntity, AllowanceEntity allowanceEntity, DeductEntity deductEntity) {
        this.id = id;
        this.wageInfoEntity = wageInfoEntity;
        this.rankEntity = rankEntity;
        this.allowanceEntity = allowanceEntity;
        this.deductEntity = deductEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WageInfoEntity getWageInfoEntity() {
        return wageInfoEntity;
    }

    public void setWageInfoEntity(WageInfoEntity wageInfoEntity) {
        this.wageInfoEntity = wageInfoEntity;
    }

    public RankEntity getRankEntity() {
        return rankEntity;
    }

    public void setRankEntity(RankEntity rankEntity) {
        this.rankEntity = rankEntity;
    }

    public AllowanceEntity getAllowanceEntity() {
        return allowanceEntity;
    }

    public void setAllowanceEntity(AllowanceEntity allowanceEntity) {
        this.allowanceEntity = allowanceEntity;
    }

    public DeductEntity getDeductEntity() {
        return deductEntity;
    }

    public void setDeductEntity(DeductEntity deductEntity) {
        this.deductEntity = deductEntity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
