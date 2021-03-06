package com.neusoft.ssm.service;

import com.neusoft.ssm.bean.*;

import java.util.List;

public interface ExamcheckService {
    List<Examcheckone> getPro(Integer doctorid, Integer medicalid ,String mark);

    int deleteByExamId(Integer i, Integer id);

    void deleteUnsave();

    Integer findIdByCode(String i);

    Integer saveByExamId(Integer i, Integer id);

    Integer openByExamId(Integer i, Integer id);

    Integer cancelByExamId(Integer i, Integer id);

    List<Fmeditem> findByExamType(String id);

    Fmeditem findProByName(String name, String id);

    int addInfo(ExamcheckInfo examcheckInfo);

    int getCount(Integer doctorid, Integer medicalid ,String mark);

    int addExam(Examcheck examcheck);

    Integer getExamId(Integer doctorid, Integer medicalid,String mark);

    int addMuban(ExamcheckSet examcheckSet);

    int addMubanInfo(ExamcheckSetInfo examcheckSetInfo);

    Fmeditem findprobyid(Integer id);

    List<ExamcheckSet> getsets(String mark);

    ExamcheckSet findSetById(Integer id);

    List<ExamcheckSetInfo> findSetInfosById(Integer id);

    void deleteSetById(Integer i);

    void insertExpense(Expense expense);

    List<Prescribemodel> getpreModels();

    Prescribemodel findPreModelById(Integer id);

    List<Prescribemodellog> findPreLogsById(Integer id);

    void deleteModelById(Integer i);

    List<Jianchaoften> getOftenPro(String mark);

    List<Fmeditem> getProByType(String mark);

    int addoften(Jianchaoften jianchaoften);

    void deleteOften(int id);
}
