package com.neusoft.ssm.service;

import com.neusoft.ssm.bean.*;
import java.math.BigDecimal;
import java.util.List;

public interface PrescribeService {

    int insertPrescribe(Prescribe record);

    int insertPrescribecategory(Prescribecategory record);

    int deletePrescribe(Integer id);

    int deletePrescribecategory(Integer id);

    List<Drugs> selectDrugsByKey(String key);

    int updateZhenbi(int medicalrecordid);

    List<Drugs> getAllChengDrugs(String drugid);

    List<Drugs> getAllCaoDrugs(String drugid);

    Drugs findByid(int id);

    List<Prescribe> getAllpreidByDoc(int doctorid);

    List<Prescribecategory> getNeedPrescribe(int prescribeid);

    List<Prescribelogview> getByMrecordidAndDid(String medicalrecordid,int doctorid);

    int getPreCount(Integer doctorid,String medicalid);

    Integer getNowID(Integer doctorid, String medicalrecordid);

    int updateIstemp(int id);

    int updateIsdone(int id);

    int prescribeFormulation(int id);

    int prescribecateFormulation(int id);

    int prescribeCancel(int id);

    int prescribecateCancel(int id);

    int addPrescribemodel(Prescribemodel record);

    int addPrescribemodellog(Prescribemodellog record);

    Prescribelogview findByTwoid(int prescribeid,int medicalid);

    int updatePrescribecategory(Prescribecategory record);

    int updateMoney(int id, BigDecimal money);

    int insertExpense(Expense record);

    int getDrugsTypeID(int medicalid);

    int addoften(Oftendrug record);

    List<Oftendrug> showoften(int doctorid);

    int deleteOften(Integer medicalid);

    Integer getMedIdByName(String s,String s1);
}
