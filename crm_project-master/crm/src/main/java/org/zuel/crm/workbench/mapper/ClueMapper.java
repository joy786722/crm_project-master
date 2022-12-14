package org.zuel.crm.workbench.mapper;

import org.zuel.crm.workbench.domain.Clue;

import java.util.List;
import java.util.Map;

public interface ClueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue
     *
     * @mbg.generated Sun Mar 06 19:32:45 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue
     *
     * @mbg.generated Sun Mar 06 19:32:45 CST 2022
     */
    int insertSelective(Clue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue
     *
     * @mbg.generated Sun Mar 06 19:32:45 CST 2022
     */
    int updateByPrimaryKeySelective(Clue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue
     *
     * @mbg.generated Sun Mar 06 19:32:45 CST 2022
     */
    int updateByPrimaryKey(Clue record);

    /**
     * 保存创建的线索
     * @param clue
     * @return
     */
    int insertClue(Clue clue);

    /**
     * 根据条件查询记录的条数
     * @param map
     * @return
     */
    List<Clue> selectClueByConditionForPage(Map<String,Object> map);

    /**
     * 根据条件查询记录的数量
     * @param map
     * @return
     */
    int selectCountOfActivityByCondition(Map<String,Object> map);

    /**
     * 根据id查询线索明细信息
     * @param id
     * @return
     */
    Clue selectClueForDetailById(String id);


    /**
     * 根据id查询线索的全部信息（无连接）
     * @param id
     * @return
     */
    Clue selectClueById(String id);

    /**
     * 根据clueId删除
     * @param id
     * @return
     */
    int deleteClueByClueId(String id);
}