package cn.hulingfeng.ylzdemo.mapper;

import cn.hulingfeng.ylzdemo.model.po.Staff;
import cn.hulingfeng.ylzdemo.model.vo.StatisticSex;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author hlf
 * @title: StaffMapper
 * @projectName ylzDemo
 * @description: TODO
 * @date 2019/11/24 13:11
 */
@Mapper
public interface StaffMapper {

    /**
     * 添加人员
     * @param staff
     * @return
     */
    Boolean add(Staff staff);

    /**
     * 查询所有人员
     * @return
     */
    List<Staff> list();

    /**
     * 条件查询人员
     * @param staffName
     * @param project
     * @param cardId
     * @return
     */
    List<Staff> queryByParameters(@Param("project") String project,@Param("cardId") String cardId,@Param("staffName") String staffName);

    /**
     * 更新人员信息
     * @param staff
     * @return
     */
    Boolean update(Staff staff);

    /**
     * 删除人员信息
     * @param staffId
     * @return
     */
    Boolean delete(@Param("staffId") Integer staffId);

    /**
     * 获取项目列表
     * @return
     */
    List<String> getProjects();

    /**
     * 条件性别统计
     * @return
     */
    List<StatisticSex> statsBySexWithParams(@Param("jobType")String jobType, @Param("ageBegin")Integer ageBegin, @Param("ageEnd")Integer ageEnd, @Param("grade")String grade );
}
