package com.my.hr6.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr6.dao.LaborerDao;
import com.my.hr6.domain.Laborer;
import com.my.hr6.domain.NoneException;

public class LaborerServiceImpl implements LaborerService {
	private LaborerDao laborerDao;
	
	public LaborerServiceImpl(LaborerDao laborerDao) {
		this.laborerDao = laborerDao;
	}
	
	@Override
	public List<Laborer> getLaborers() {
		return laborerDao.selectLaborers();
	}
	
	@Override
	public void addLaborer(String laborerName, LocalDate hireDate) {
		this.laborerDao.insertLaborer(laborerName, hireDate);
	}
	
	@Override
	public void fixLaborer(Laborer laborer) throws NoneException {
		this.laborerDao.updateLaborer(laborer);
	}
	
	@Override
	public void delLaborer(int laborerId) throws NoneException {
		this.laborerDao.deleteLaborer(laborerId);
	}
}
