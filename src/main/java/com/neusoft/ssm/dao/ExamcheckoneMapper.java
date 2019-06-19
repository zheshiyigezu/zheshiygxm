package com.neusoft.ssm.dao;

import com.neusoft.ssm.bean.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamcheckoneMapper {
    int countByExample(ExamcheckoneExample example);

    int deleteByExample(ExamcheckoneExample example);

    @Insert({
        "insert into examcheckone (mark, doctorId, ",
        "medicalRecordId, status, ",
        "ItemCode, ItemName)",
        "values (#{mark,jdbcType=CHAR}, #{doctorid,jdbcType=INTEGER}, ",
        "#{medicalrecordid,jdbcType=INTEGER}, #{status,jdbcType=CHAR}, ",
        "#{itemcode,jdbcType=VARCHAR}, #{itemname,jdbcType=VARCHAR})"
    })
    int insert(Examcheckone record);

    int insertSelective(Examcheckone record);

    List<Examcheckone> selectByExample(ExamcheckoneExample example);

    int updateByExampleSelective(@Param("record") Examcheckone record, @Param("example") ExamcheckoneExample example);

    int updateByExample(@Param("record") Examcheckone record, @Param("example") ExamcheckoneExample example);

    List<Examcheckone> getPro(Integer doctorid, Integer medicalid);

    int deleteByExamId(Integer i, Integer id);

    int deleteUnsave();

    Integer findIdByCode(Integer i);

    Integer saveByExamId(Integer i, Integer id);

    Integer openByExamId(Integer i, Integer id);

    Integer cancelByExamId(Integer i, Integer id);

    List<Fmeditem> findByExamType(String id);

    Fmeditem findProByName(String name, String id);

    int addInfo(ExamcheckInfo examcheckInfo);

    int getCount(Integer doctorid, Integer medicalid);

    int addExam(Examcheck examcheck);

    Integer getExamId(Integer doctorid, Integer medicalid);

    int addMuban(ExamcheckSet examcheckSet);
}