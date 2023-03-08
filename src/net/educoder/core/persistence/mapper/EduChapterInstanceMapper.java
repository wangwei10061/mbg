package net.educoder.core.persistence.mapper;

import java.util.List;
import net.educoder.core.persistence.beans.EduChapterInstance;

public interface EduChapterInstanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduChapterInstance record);

    EduChapterInstance selectByPrimaryKey(Long id);

    List<EduChapterInstance> selectAll();

    int updateByPrimaryKey(EduChapterInstance record);
}