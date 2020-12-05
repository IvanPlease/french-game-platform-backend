package com.zhp.french.mapper;

import com.zhp.french.domain.Quest;
import com.zhp.french.domain.QuestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuestMapper {
    List<QuestDto> mapToQuestDtoList(List<Quest> all);

    QuestDto mapToQuestDto(Quest fetched);

    Quest mapToQuest(QuestDto dto);
}
