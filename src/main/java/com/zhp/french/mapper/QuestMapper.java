package com.zhp.french.mapper;

import com.zhp.french.domain.Quest;
import com.zhp.french.domain.QuestDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuestMapper {
    Quest mapToQuest(QuestDto dto);
    QuestDto mapToQuestDto(Quest fetched);
    List<QuestDto> mapToQuestDtoList(List<Quest> all);
}
