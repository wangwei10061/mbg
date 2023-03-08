package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduLearningStepInstance;
import net.educoder.core.persistence.beans.EduLearningStepInstanceWithBLOBs;

public interface EduLearningStepInstanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduLearningStepInstance record);

    EduLearningStepInstanceWithBLOBs selectByPrimaryKey(Long id);

    List<EduLearningStepInstance> selectAll();

    int updateByPrimaryKey(EduLearningStepInstance record);
}