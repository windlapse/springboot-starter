package liangwenhan.web.dao;

import liangwenhan.web.entity.ActionTransaction;

public interface ActionTransactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_transaction
     *
     * @mbg.generated Sun Aug 06 19:33:53 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_transaction
     *
     * @mbg.generated Sun Aug 06 19:33:53 CST 2017
     */
    int insert(ActionTransaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_transaction
     *
     * @mbg.generated Sun Aug 06 19:33:53 CST 2017
     */
    int insertSelective(ActionTransaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_transaction
     *
     * @mbg.generated Sun Aug 06 19:33:53 CST 2017
     */
    ActionTransaction selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_transaction
     *
     * @mbg.generated Sun Aug 06 19:33:53 CST 2017
     */
    int updateByPrimaryKeySelective(ActionTransaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_transaction
     *
     * @mbg.generated Sun Aug 06 19:33:53 CST 2017
     */
    int updateByPrimaryKey(ActionTransaction record);
}