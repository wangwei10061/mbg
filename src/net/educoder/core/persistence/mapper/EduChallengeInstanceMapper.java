package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduChallengeInstance;

public interface EduChallengeInstanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduChallengeInstance record);

    EduChallengeInstance selectByPrimaryKey(Long id);

    List<EduChallengeInstance> selectAll();

    int updateByPrimaryKey(EduChallengeInstance record);
}