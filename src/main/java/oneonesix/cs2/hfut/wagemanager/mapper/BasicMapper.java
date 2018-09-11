package oneonesix.cs2.hfut.wagemanager.mapper;

import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.AllowanceEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.DeductEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.RankEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.WageInfoEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public interface BasicMapper {

    @Select("SELECT * FROM tb_wage_info WHERE employee_id=#{id} AND date=#{date}")
    public WageInfoEntity queryWageInfo();

    @Select("SELECT * FROM tb_rank WHERE id=#{rank_id}")
    public RankEntity queryRank(Integer rank_id);

    @Select("SELECT * FROM tb_allowance WHERE employee_id=#{id} AND date=#{date}")
    public AllowanceEntity queryAllowance();

    @Select("SELECT * FROM tb_deduct WHERE employee_id=#{id} AND date=#{date}")
    public DeductEntity queryDeduct();

}
