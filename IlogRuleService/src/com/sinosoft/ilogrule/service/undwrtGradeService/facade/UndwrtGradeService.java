package com.sinosoft.ilogrule.service.undwrtGradeService.facade;

import java.util.List;

import com.sinosoft.ilogrule.vo.undwrtGradeVo.UndwrtGradeNoCarVo;
import com.sinosoft.ilogrule.vo.undwrtGradeVo.UndwrtGradeVo;

public interface UndwrtGradeService {
	/**
	 * 根据车险核保级别顺序查找核保级别
	 * @throws Exception
	 */
	public List<UndwrtGradeVo> findByOrderUndwrtGrade() throws Exception;
	
	/**
	 * 根据非车核保级别顺序查找核保级别
	 * @throws Exception
	 */
	public List<UndwrtGradeNoCarVo> findByOrderUndwrtGradeNoCar() throws Exception;
}
