package com.sy.service.parentser;

import org.springframework.beans.factory.annotation.Autowired;

import com.sy.mappdao.*;

public class PyParentSer {
	// Py系列
	@Autowired
	private PyBalancedetailMapper pyBalancedetailMapper;
	@Autowired
	private PyBalanceMapper pyBalanceMapper;
	@Autowired
	private PyBilldetailMapper pyBilldetailMapper;
	@Autowired
	private PyBillMapper pyBillMapper;
	@Autowired
	private PyPayMapper pyPayMapper;
	@Autowired
	private PySumreportMapper pySumreportMapper;
	@Autowired
	private PyUserhistoryMapper pyUserhistoryMapper;

	public PyBalancedetailMapper getPyBalancedetailMapper() {
		return pyBalancedetailMapper;
	}

	public void setPyBalancedetailMapper(
			PyBalancedetailMapper pyBalancedetailMapper) {
		this.pyBalancedetailMapper = pyBalancedetailMapper;
	}

	public PyBalanceMapper getPyBalanceMapper() {
		return pyBalanceMapper;
	}

	public void setPyBalanceMapper(PyBalanceMapper pyBalanceMapper) {
		this.pyBalanceMapper = pyBalanceMapper;
	}

	public PyBilldetailMapper getPyBilldetailMapper() {
		return pyBilldetailMapper;
	}

	public void setPyBilldetailMapper(PyBilldetailMapper pyBilldetailMapper) {
		this.pyBilldetailMapper = pyBilldetailMapper;
	}

	public PyBillMapper getPyBillMapper() {
		return pyBillMapper;
	}

	public void setPyBillMapper(PyBillMapper pyBillMapper) {
		this.pyBillMapper = pyBillMapper;
	}

	public PyPayMapper getPyPayMapper() {
		return pyPayMapper;
	}

	public void setPyPayMapper(PyPayMapper pyPayMapper) {
		this.pyPayMapper = pyPayMapper;
	}

	public PySumreportMapper getPySumreportMapper() {
		return pySumreportMapper;
	}

	public void setPySumreportMapper(PySumreportMapper pySumreportMapper) {
		this.pySumreportMapper = pySumreportMapper;
	}

	public PyUserhistoryMapper getPyUserhistoryMapper() {
		return pyUserhistoryMapper;
	}

	public void setPyUserhistoryMapper(PyUserhistoryMapper pyUserhistoryMapper) {
		this.pyUserhistoryMapper = pyUserhistoryMapper;
	}

}
